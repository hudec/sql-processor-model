package org.sqlproc.model.ui.syntaxcoloring;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.nodemodel.util.NodeTreeIterator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.sqlproc.model.processorModel.Entity;
import org.sqlproc.model.processorModel.EnumEntity;
import org.sqlproc.model.processorModel.EnumProperty;
import org.sqlproc.model.processorModel.FunctionDefinition;
import org.sqlproc.model.processorModel.PackageDeclaration;
import org.sqlproc.model.processorModel.PojoDao;
import org.sqlproc.model.processorModel.PojoDefinition;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.PojoMethod;
import org.sqlproc.model.processorModel.PojoMethodArg;
import org.sqlproc.model.processorModel.PojoProperty;
import org.sqlproc.model.processorModel.ProcedureDefinition;
import org.sqlproc.model.processorModel.TableDefinition;
import org.sqlproc.model.resolver.PojoResolver;
import org.sqlproc.model.resolver.PojoResolverFactory;

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
        // tohle je blbarna, jak dostat tridu z org.sqlproc.model.ui dp org.sqlproc.model, mozna to jde jednoduseji
        if (pojoResolverFactory != null && pojoResolverFactory.getPojoResolver() == null)
            pojoResolverFactory.setPojoResolver(pojoResolver);

        if (resource == null)
            return;

        Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
        while (iter.hasNext()) {
            EObject current = iter.next();
            if (current instanceof PojoDefinition) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PojoDefinition pojo = (PojoDefinition) current;
                provideHighlightingForPojo(null, pojo.getName(), node, acceptor);
            } else if (current instanceof TableDefinition) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                TableDefinition table = (TableDefinition) current;
                provideHighlightingForTable(null, table.getName(), node, acceptor);
            } else if (current instanceof ProcedureDefinition) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                ProcedureDefinition procedure = (ProcedureDefinition) current;
                provideHighlightingForTable(null, procedure.getName(), node, acceptor);
            } else if (current instanceof FunctionDefinition) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                FunctionDefinition function = (FunctionDefinition) current;
                provideHighlightingForTable(null, function.getName(), node, acceptor);
            } else if (current instanceof PackageDeclaration) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PackageDeclaration pkg = (PackageDeclaration) current;
                provideHighlightingForPojoPackage(pkg.getName(), node, acceptor);
            } else if (current instanceof PojoEntity) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PojoEntity pojo = (PojoEntity) current;
                provideHighlightingForPojoEntity(pojo.getName(), node, acceptor);
            } else if (current instanceof PojoProperty) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PojoProperty property = (PojoProperty) current;
                provideHighlightingForPojoProperty(property.getName(), node, acceptor);
                Entity ref = property.getRef();
                if (ref != null) {
                    if (ref instanceof PojoEntity)
                        provideHighlightingForPojoEntity(ref.getName(), node, acceptor);
                    else if (ref instanceof EnumEntity)
                        provideHighlightingForEnumEntity(ref.getName(), node, acceptor);
                }
                PojoEntity gref = property.getGref();
                if (gref != null)
                    provideHighlightingForPojoEntity(gref.getName(), node, acceptor);
            } else if (current instanceof EnumProperty) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                EnumProperty property = (EnumProperty) current;
                provideHighlightingForEnumProperty(property.getName(), node, acceptor);
            } else if (current instanceof PojoDao) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PojoDao dao = (PojoDao) current;
                provideHighlightingForPojoDao(dao.getName(), node, acceptor);
                PojoEntity ref = dao.getPojo();
                if (ref != null)
                    provideHighlightingForPojoEntity(ref.getName(), node, acceptor);
            } else if (current instanceof PojoMethod) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PojoMethod method = (PojoMethod) current;
                provideHighlightingForPojoProperty(method.getName(), node, acceptor);
                if (method.getType() != null) {
                    PojoEntity ref = method.getType().getRef();
                    if (ref != null)
                        provideHighlightingForPojoEntity(ref.getName(), node, acceptor);
                    PojoEntity gref = method.getType().getGref();
                    if (gref != null)
                        provideHighlightingForPojoEntity(gref.getName(), node, acceptor);
                }
                if (method.getArgs() != null && !method.getArgs().isEmpty()) {
                    for (PojoMethodArg arg : method.getArgs()) {
                        if (arg.getType() != null) {
                            PojoEntity ref = arg.getType().getRef();
                            if (ref != null)
                                provideHighlightingForPojoEntity(ref.getName(), node, acceptor);
                            PojoEntity gref = arg.getType().getGref();
                            if (gref != null)
                                provideHighlightingForPojoEntity(gref.getName(), node, acceptor);
                        }
                    }
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
            if (name != null && name.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.NAME);
                if (pojo == null)
                    return;
            }
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.IDENTIFIER);
                return;
            }
        }
    }

    private void provideHighlightingForPojoPackage(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.PACKAGE_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForPojoEntity(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.ENTITY_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForPojoProperty(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.PROPERTY_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForEnumEntity(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.ENTITY_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForEnumProperty(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.PROPERTY_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForPojoDao(String dao, ICompositeNode node, IHighlightedPositionAcceptor acceptor) {
        if (dao == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (dao != null && dao.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.DAO_NAME);
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
            if (name != null && name.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.NAME);
                if (table == null)
                    return;
            }
            if (table != null && table.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.IDENTIFIER);
                return;
            }
        }
    }
}
