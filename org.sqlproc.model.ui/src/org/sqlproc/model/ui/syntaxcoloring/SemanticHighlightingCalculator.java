package org.sqlproc.model.ui.syntaxcoloring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.nodemodel.util.NodeTreeIterator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.sqlproc.model.processorModel.DaoDirective;
import org.sqlproc.model.processorModel.DaoDirectiveCrud;
import org.sqlproc.model.processorModel.DaoDirectiveDiscriminator;
import org.sqlproc.model.processorModel.DaoDirectiveParameters;
import org.sqlproc.model.processorModel.DaoDirectiveQuery;
import org.sqlproc.model.processorModel.DescendantAssignment;
import org.sqlproc.model.processorModel.Entity;
import org.sqlproc.model.processorModel.EnumEntity;
import org.sqlproc.model.processorModel.EnumProperty;
import org.sqlproc.model.processorModel.Extends;
import org.sqlproc.model.processorModel.FunProcDirective;
import org.sqlproc.model.processorModel.FunctionDefinition;
import org.sqlproc.model.processorModel.Implements;
import org.sqlproc.model.processorModel.PojoDao;
import org.sqlproc.model.processorModel.PojoDefinition;
import org.sqlproc.model.processorModel.PojoDirective;
import org.sqlproc.model.processorModel.PojoDirectiveEquals;
import org.sqlproc.model.processorModel.PojoDirectiveHashCode;
import org.sqlproc.model.processorModel.PojoDirectiveIndex;
import org.sqlproc.model.processorModel.PojoDirectiveToString;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.PojoEntityModifier2;
import org.sqlproc.model.processorModel.PojoProperty;
import org.sqlproc.model.processorModel.PojoType;
import org.sqlproc.model.processorModel.ProcedureDefinition;
import org.sqlproc.model.processorModel.TableDefinition;
import org.sqlproc.model.resolver.PojoResolver;
import org.sqlproc.model.resolver.PojoResolverFactory;
import org.sqlproc.model.util.Pair;

import com.google.inject.Inject;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

    public static final String CARET = "^";
    public static final String STRING = "$";
    public static final String LPAREN = "(";
    public static final String RPAREN = ")";

    @Inject
    PojoResolver pojoResolver;

    @Inject
    PojoResolverFactory pojoResolverFactory;

    @Override
    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
        // tohle je blbarna, jak dostat tridu z org.sqlproc.dsl.ui dp org.sqlproc.dsl, mozna to jde jednoduseji
        if (pojoResolverFactory != null && pojoResolverFactory.getPojoResolver() == null)
            pojoResolverFactory.setPojoResolver(pojoResolver);

        if (resource == null)
            return;

        Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
        while (iter.hasNext()) {
            EObject current = iter.next();
            ICompositeNode node = NodeModelUtils.getNode(current);

            if (current instanceof PojoDefinition) {
                PojoDefinition pojo = (PojoDefinition) current;
                provideHighlightingForPojo(null, pojo.getName(), node, acceptor);
            } else if (current instanceof TableDefinition) {
                TableDefinition table = (TableDefinition) current;
                provideHighlightingForTable(null, table.getName(), node, acceptor);
            } else if (current instanceof ProcedureDefinition) {
                ProcedureDefinition procedure = (ProcedureDefinition) current;
                provideHighlightingForTable(null, procedure.getName(), node, acceptor);
            } else if (current instanceof FunctionDefinition) {
                FunctionDefinition function = (FunctionDefinition) current;
                provideHighlightingForTable(null, function.getName(), node, acceptor);
            }

            else if (current instanceof Package) {
                provideSimpleHighlighting(node, acceptor,
                        newPair(((Package) current).getName(), HighlightingConfiguration.PACKAGE_NAME));
            } else if (current instanceof PojoEntity) {
                List<Pair<String, String>> tokens = new ArrayList<Pair<String, String>>();
                PojoEntity pojo = (PojoEntity) current;
                if (pojo.getName() != null)
                    tokens.add(newPair(pojo.getName(), HighlightingConfiguration.ENTITY_NAME));
                if (pojo.getDirectives() != null && !pojo.getDirectives().isEmpty()) {
                    for (PojoEntityModifier2 mod : pojo.getModifiers2()) {
                        if (mod.getSuperType() != null && mod.getSuperType().getName() != null)
                            tokens.add(newPair(mod.getSuperType().getName(), HighlightingConfiguration.ENTITY_NAME));
                    }
                }
                provideSimpleHighlighting(node, acceptor, tokens);
            } else if (current instanceof PojoProperty) {
                provideSimpleHighlighting(
                        node,
                        acceptor,
                        newPair((PojoProperty) current, HighlightingConfiguration.PROPERTY_NAME,
                                HighlightingConfiguration.ENTITY_NAME));
            } else if (current instanceof EnumEntity) {
                provideSimpleHighlighting(node, acceptor,
                        newPair(((EnumEntity) current).getName(), HighlightingConfiguration.ENTITY_NAME));
            } else if (current instanceof EnumProperty) {
                provideSimpleHighlighting(node, acceptor,
                        newPair(((EnumProperty) current).getName(), HighlightingConfiguration.PROPERTY_NAME));
            } else if (current instanceof PojoDao) {
                provideSimpleHighlighting(node, acceptor,
                        newPair(((PojoDao) current).getName(), HighlightingConfiguration.DAO_NAME));
            } else if (current instanceof DaoDirective) {
                List<Pair<String, String>> tokens = new ArrayList<Pair<String, String>>();
                DaoDirective dir = (DaoDirective) current;
                if (dir instanceof DaoDirectiveCrud) {
                    tokens.addAll(newPair(((DaoDirectiveCrud) dir).getPojo(), HighlightingConfiguration.ENTITY_NAME));
                    provideSimpleHighlighting(node, acceptor, tokens);
                } else if (dir instanceof DaoDirectiveQuery) {
                    tokens.addAll(newPair(((DaoDirectiveQuery) dir).getPojo(), HighlightingConfiguration.ENTITY_NAME));
                } else if (dir instanceof DaoDirectiveDiscriminator) {
                    tokens.add(new Pair<String, String>(((DaoDirectiveDiscriminator) dir).getAncestor().getName(),
                            HighlightingConfiguration.PROPERTY_NAME));
                    for (DescendantAssignment da : ((DaoDirectiveDiscriminator) dir).getDescendants()) {
                        tokens.addAll(newPair(da.getDescendant(), HighlightingConfiguration.ENTITY_NAME));
                    }
                } else if (dir instanceof FunProcDirective) {
                    DaoDirectiveParameters dp = ((FunProcDirective) current).getParamlist();
                    tokens.addAll(newPair(dp.getOut(), HighlightingConfiguration.ENTITY_NAME));
                    for (PojoType pojo : dp.getIns()) {
                        tokens.addAll(newPair(pojo, HighlightingConfiguration.ENTITY_NAME));
                    }
                }
                provideSimpleHighlighting(node, acceptor, tokens);
            } else if (current instanceof PojoDirective) {
                List<Pair<String, String>> tokens = new ArrayList<Pair<String, String>>();
                PojoDirective dir = (PojoDirective) current;
                if (dir instanceof PojoDirectiveToString) {
                    for (PojoProperty prop : ((PojoDirectiveToString) dir).getProplist().getFeatures()) {
                        tokens.add(new Pair<String, String>(prop.getName(), HighlightingConfiguration.PROPERTY_NAME));
                    }
                } else if (dir instanceof PojoDirectiveIndex) {
                    for (PojoProperty prop : ((PojoDirectiveIndex) dir).getProplist().getFeatures()) {
                        tokens.add(new Pair<String, String>(prop.getName(), HighlightingConfiguration.PROPERTY_NAME));
                    }
                } else if (dir instanceof PojoDirectiveEquals) {
                    for (PojoProperty prop : ((PojoDirectiveEquals) dir).getProplist().getFeatures()) {
                        tokens.add(new Pair<String, String>(prop.getName(), HighlightingConfiguration.PROPERTY_NAME));
                    }
                } else if (dir instanceof PojoDirectiveHashCode) {
                    for (PojoProperty prop : ((PojoDirectiveHashCode) dir).getProplist().getFeatures()) {
                        tokens.add(new Pair<String, String>(prop.getName(), HighlightingConfiguration.PROPERTY_NAME));
                    }
                }
                provideSimpleHighlighting(node, acceptor, tokens);
            } else if (current instanceof Implements) {
                List<Pair<String, String>> tokens = new ArrayList<Pair<String, String>>();
                Implements imp = (Implements) current;
                for (PojoEntity pojo : imp.getOnlyPojos())
                    tokens.add(new Pair<String, String>(pojo.getName(), HighlightingConfiguration.ENTITY_NAME));
                for (PojoDao dao : imp.getOnlyDaos())
                    tokens.add(new Pair<String, String>(dao.getName(), HighlightingConfiguration.DAO_NAME));
                for (PojoEntity pojo : imp.getExceptPojos())
                    tokens.add(new Pair<String, String>(pojo.getName(), HighlightingConfiguration.ENTITY_NAME));
                for (PojoDao dao : imp.getExceptDaos())
                    tokens.add(new Pair<String, String>(dao.getName(), HighlightingConfiguration.DAO_NAME));
                provideSimpleHighlighting(node, acceptor, tokens);
            } else if (current instanceof Extends) {
                List<Pair<String, String>> tokens = new ArrayList<Pair<String, String>>();
                Extends ext = (Extends) current;
                for (PojoEntity pojo : ext.getOnlyPojos())
                    tokens.add(new Pair<String, String>(pojo.getName(), HighlightingConfiguration.ENTITY_NAME));
                for (PojoDao dao : ext.getOnlyDaos())
                    tokens.add(new Pair<String, String>(dao.getName(), HighlightingConfiguration.DAO_NAME));
                for (PojoEntity pojo : ext.getExceptPojos())
                    tokens.add(new Pair<String, String>(pojo.getName(), HighlightingConfiguration.ENTITY_NAME));
                for (PojoDao dao : ext.getExceptDaos())
                    tokens.add(new Pair<String, String>(dao.getName(), HighlightingConfiguration.DAO_NAME));
                provideSimpleHighlighting(node, acceptor, tokens);
            }
        }
    }

    private Pair<String, String> newPair(String name, String highlightingId) {
        if (name != null)
            return new Pair<String, String>(name, highlightingId);
        return null;
    }

    private List<Pair<String, String>> newPair(PojoType pojo, String highlightingId) {
        List<Pair<String, String>> list = new ArrayList<Pair<String, String>>();
        String name1 = (pojo != null && pojo.getRef() != null) ? pojo.getRef().getName() : null;
        if (name1 != null)
            list.add(new Pair<String, String>(name1, highlightingId));
        String name2 = (pojo != null && pojo.getGref() != null) ? pojo.getGref().getName() : null;
        if (name2 != null)
            list.add(new Pair<String, String>(name2, highlightingId));
        return list;
    }

    private List<Pair<String, String>> newPair(PojoProperty prop, String highlightingId, String highlightingId2) {
        List<Pair<String, String>> list = new ArrayList<Pair<String, String>>();
        if (prop.getName() != null)
            list.add(new Pair<String, String>(prop.getName(), highlightingId));
        Entity ref = prop.getRef();
        if (ref != null && (ref instanceof PojoEntity || ref instanceof EnumEntity))
            list.add(new Pair<String, String>(ref.getName(), highlightingId2));
        PojoEntity gref = prop.getGref();
        if (gref != null && (gref instanceof PojoEntity || gref instanceof EnumEntity))
            list.add(new Pair<String, String>(gref.getName(), highlightingId2));
        return list;
    }

    private void provideSimpleHighlighting(ICompositeNode node, IHighlightedPositionAcceptor acceptor,
            List<Pair<String, String>> tokens) {
        if (tokens == null || tokens.isEmpty())
            return;
        int ix = 0, lx = tokens.size();
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            for (int i = ix; i < lx; i++) {
                if (equals(tokens.get(i).getFirst(), inode)) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), tokens.get(i).getSecond());
                    if (i == lx - 1)
                        return;
                    else
                        ix = i + 1;
                }
            }
        }
    }

    private void provideSimpleHighlighting(ICompositeNode node, IHighlightedPositionAcceptor acceptor,
            Pair<String, String>... tokens) {
        if (tokens == null || tokens.length == 0)
            return;
        int ix = 0, lx = tokens.length;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            for (int i = ix; i < lx; i++) {
                if (equals(tokens[i].getFirst(), inode)) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), tokens[i].getSecond());
                    if (i == lx - 1)
                        return;
                    else
                        ix = i + 1;
                }
            }
        }
    }

    private void provideHighlightingForModifiers(EList<String> filters, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (filters != null && !filters.isEmpty()) {
            Iterator<INode> iterator = new NodeTreeIterator(node);
            while (iterator.hasNext()) {
                INode inode = iterator.next();
                if (filters.contains(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(),
                            HighlightingConfiguration.STATEMENT_MODIFIER);
                }
            }
        }
    }

    private void provideHighlightingForPojo(String name, String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (name == null && pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (equals(name, inode)) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.NAME);
                if (pojo == null)
                    return;
            }
            if (equals(pojo, inode)) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.IDENTIFIER);
                return;
            }
        }
    }

    private void provideHighlightingForTable(String name, String table, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (name == null && table == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (equals(name, inode)) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.NAME);
                if (table == null)
                    return;
            }
            if (equals(table, inode)) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.IDENTIFIER);
                return;
            }
        }
    }

    private void provideHighlightingForFragment(String defaultColor, ICompositeNode node, String name,
            EList<String> modifiers, IHighlightedPositionAcceptor acceptor) {
        Iterator<INode> iterator = new NodeTreeIterator(node);
        boolean afterName = false;
        boolean inParenthesis = false;
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (!afterName) {
                if (equals(name, inode)) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), defaultColor);
                    afterName = true;
                }
            } else if (!inParenthesis && inode.getText().equals("(")) {
                inParenthesis = true;
            } else if (inParenthesis && inode.getText().equals(")")) {
                inParenthesis = false;
            } else if (inParenthesis) {
                if (modifiers != null && !modifiers.isEmpty() && modifiers.contains(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.MODIFIER);
                }
            } else {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), defaultColor);
            }
        }
    }

    private boolean equals(String name, INode inode) {
        if (name == null || inode == null)
            return false;
        String text = inode.getText();
        if (text == null)
            return false;
        if (name.equals(text.trim()))
            return true;
        return false;
    }
}
