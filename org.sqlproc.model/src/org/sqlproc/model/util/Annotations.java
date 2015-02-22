package org.sqlproc.model.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.sqlproc.model.processorModel.AnnotatedEntity;
import org.sqlproc.model.processorModel.Annotation;
import org.sqlproc.model.processorModel.AnnotationDirective;
import org.sqlproc.model.processorModel.AnnotationDirectiveAttribute;
import org.sqlproc.model.processorModel.AnnotationDirectiveConflict;
import org.sqlproc.model.processorModel.AnnotationDirectiveConstructor;
import org.sqlproc.model.processorModel.AnnotationDirectiveGetter;
import org.sqlproc.model.processorModel.AnnotationDirectiveSetter;
import org.sqlproc.model.processorModel.AnnotationDirectiveStandard;
import org.sqlproc.model.processorModel.AnnotationDirectiveStatic;
import org.sqlproc.model.processorModel.DaoEntity;
import org.sqlproc.model.processorModel.Entity;
import org.sqlproc.model.processorModel.EnumEntity;
import org.sqlproc.model.processorModel.PojoAttribute;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.PojoProcedure;

public class Annotations {
    protected static final String INDENT = "  ";
    protected static final String NLINDENT = "\n  ";
    protected static final String NL = "\n";

    Map<String, List<XAnnotation>> entityAnnotations = new HashMap<String, List<XAnnotation>>();
    Map<String, List<XAnnotation>> constructorAnnotations = new HashMap<String, List<XAnnotation>>();
    Map<String, List<XAnnotation>> staticAnnotations = new HashMap<String, List<XAnnotation>>();
    Map<String, List<XAnnotation>> conflictAnnotations = new HashMap<String, List<XAnnotation>>();
    Map<String, Map<String, List<XAnnotation>>> setterAnnotations = new HashMap<String, Map<String, List<XAnnotation>>>();
    Map<String, Map<String, List<XAnnotation>>> getterAnnotations = new HashMap<String, Map<String, List<XAnnotation>>>();
    Map<String, Map<String, List<XAnnotation>>> attributeAnnotations = new HashMap<String, Map<String, List<XAnnotation>>>();
    Map<String, Map<String, List<XAnnotation>>> procedureAnnotations = new HashMap<String, Map<String, List<XAnnotation>>>();

    public void addAnnotation(String pojoName, XAnnotation annotation, Map<String, List<XAnnotation>> annotations) {
        List<XAnnotation> list;
        if ((list = annotations.get(pojoName)) == null) {
            list = new ArrayList<XAnnotation>();
            annotations.put(pojoName, list);
        }
        list.add(annotation);
    }

    public void addAnnotation(String pojoName, String featureName, XAnnotation annotation,
            Map<String, Map<String, List<XAnnotation>>> annotations) {
        List<XAnnotation> list;
        Map<String, List<XAnnotation>> map;
        if ((map = annotations.get(pojoName)) == null) {
            map = new HashMap<String, List<XAnnotation>>();
            annotations.put(pojoName, map);
        }
        if ((list = map.get(featureName)) == null) {
            list = new ArrayList<XAnnotation>();
            map.put(featureName, list);
        }
        list.add(annotation);
    }

    public StringBuilder getEntityAnnotationsDefinitions(String pojoName, ISerializer serializer, boolean simpleNames,
            boolean nonStandardAnnotations) {
        StringBuilder sb = new StringBuilder();
        if (!entityAnnotations.containsKey(pojoName))
            return sb;
        for (XAnnotation a : entityAnnotations.get(pojoName)) {
            if (nonStandardAnnotations)
                sb.append(NLINDENT).append("#Standard");
            sb.append(serializer.serialize(a));
        }
        return sb;
    }

    // public StringBuilder getConstructorAnnotationsDefinitions(String pojoName, boolean simpleNames) {
    // StringBuilder sb = new StringBuilder();
    // if (!constructorAnnotations.containsKey(pojoName))
    // return sb;
    // for (XAnnotation a : constructorAnnotations.get(pojoName)) {
    // getAnnotationDefinition(sb, a, NLINDENT + "#Constructor" + NLINDENT + "@", simpleNames);
    // }
    // return sb;
    // }
    //
    // public StringBuilder getStaticAnnotationsDefinitions(String pojoName, boolean simpleNames) {
    // StringBuilder sb = new StringBuilder();
    // if (!staticAnnotations.containsKey(pojoName))
    // return sb;
    // for (XAnnotation a : staticAnnotations.get(pojoName)) {
    // getAnnotationDefinition(sb, a, NLINDENT + "#Static" + NLINDENT + "@", simpleNames);
    // }
    // return sb;
    // }
    //
    // public StringBuilder getConflictAnnotationsDefinitions(String pojoName, boolean simpleNames) {
    // StringBuilder sb = new StringBuilder();
    // if (!conflictAnnotations.containsKey(pojoName))
    // return sb;
    // for (XAnnotation a : conflictAnnotations.get(pojoName)) {
    // getAnnotationDefinition(sb, a, NLINDENT + "#Conflict" + NLINDENT + "@", simpleNames);
    // }
    // return sb;
    // }

    public boolean isNonStandardPojoAnnotations(String pojoName) {
        return (constructorAnnotations.containsKey(pojoName) && !constructorAnnotations.get(pojoName).isEmpty())
                || (staticAnnotations.containsKey(pojoName) && !staticAnnotations.get(pojoName).isEmpty())
                || (conflictAnnotations.containsKey(pojoName) && !conflictAnnotations.get(pojoName).isEmpty());
    }

    //
    // public StringBuilder getGetterAnnotationsDefinitions(String pojoName, String featureName, boolean simpleNames) {
    // StringBuilder sb = new StringBuilder();
    // if (!getterAnnotations.containsKey(pojoName) || !getterAnnotations.get(pojoName).containsKey(featureName))
    // return sb;
    // for (Annotation a : getterAnnotations.get(pojoName).get(featureName)) {
    // getAnnotationDefinition(sb, a, NLINDENT + INDENT + "#Getter" + NLINDENT + INDENT + "@", simpleNames);
    // }
    // return sb;
    // }
    //
    // public StringBuilder getSetterAnnotationsDefinitions(String pojoName, String featureName, boolean simpleNames) {
    // StringBuilder sb = new StringBuilder();
    // if (!setterAnnotations.containsKey(pojoName) || !setterAnnotations.get(pojoName).containsKey(featureName))
    // return sb;
    // for (Annotation a : setterAnnotations.get(pojoName).get(featureName)) {
    // getAnnotationDefinition(sb, a, NLINDENT + INDENT + "#Setter" + NLINDENT + INDENT + "@", simpleNames);
    // }
    // return sb;
    // }
    //
    // public StringBuilder getAttributeAnnotationsDefinitions(String pojoName, String featureName, boolean simpleNames,
    // boolean nonStandardAnnotations) {
    // StringBuilder sb = new StringBuilder();
    // if (!attributeAnnotations.containsKey(pojoName) || !attributeAnnotations.get(pojoName).containsKey(featureName))
    // return sb;
    // for (Annotation a : attributeAnnotations.get(pojoName).get(featureName)) {
    // getAnnotationDefinition(sb, a, ((nonStandardAnnotations) ? NLINDENT + INDENT + "#Attribute" : "")
    // + NLINDENT + INDENT + "@", simpleNames);
    // }
    // return sb;
    // }
    //
    // public boolean isNonStandardPojoAnnotations(String pojoName, String featureName) {
    // return (getterAnnotations.containsKey(pojoName) && getterAnnotations.get(pojoName).containsKey(featureName) &&
    // !getterAnnotations
    // .get(pojoName).get(featureName).isEmpty())
    // || (setterAnnotations.containsKey(pojoName) && setterAnnotations.get(pojoName).containsKey(featureName) &&
    // !setterAnnotations
    // .get(pojoName).get(featureName).isEmpty());
    // }
    //
    // public boolean hasAttributeAnnotationsDefinitions(String pojoName, String featureName, String annotationName) {
    // if (attributeAnnotations == null)
    // return false;
    // if (!attributeAnnotations.containsKey(pojoName) || !attributeAnnotations.get(pojoName).containsKey(featureName))
    // return false;
    // for (Annotation a : attributeAnnotations.get(pojoName).get(featureName)) {
    // String aName = a.getType().getQualifiedName();
    // if (annotationName.equals(aName))
    // return true;
    // }
    // return false;
    // }
    //
    // public void getAnnotationDefinition(StringBuilder sb, XAnnotation a, String prefix, boolean simpleNames) {
    // sb.append(prefix).append((simpleNames) ? a.getType().getSimpleName() : a.getType().getQualifiedName());
    // if (a.getFeatures() != null && !a.getFeatures().isEmpty()) {
    // sb.append("(");
    // boolean first = true;
    // for (AnnotationProperty ap : a.getFeatures()) {
    // if (first)
    // first = false;
    // else
    // sb.append(",");
    // getAnnotationPropertyDefinition(sb, ap, simpleNames);
    // }
    // sb.append(")");
    // }
    // }
    //
    // public void getAnnotationPropertyDefinition(StringBuilder sb, AnnotationProperty ap, boolean simpleNames) {
    // sb.append(ap.getName());
    // sb.append(" = ");
    // if (ap.getValue() != null) {
    // if (ap.getValue().getValue() != null)
    // sb.append(ap.getValue());
    // else if (ap.getValue().getId() != null)
    // sb.append(ap.getValue().getId());
    // else
    // sb.append(ap.getValue().getNumber());
    // }
    // if (ap.getType() != null)
    // sb.append(" :").append((simpleNames) ? ap.getType().getSimpleName() : ap.getType().getQualifiedName());
    // else if (ap.getRef() != null)
    // sb.append(" ").append(ap.getRef().getName());
    // }
    //
    // public Set<String> getImports() {
    // Set<String> imports = new HashSet<String>();
    // for (List<Annotation> al : entityAnnotations.values())
    // getImports(imports, al);
    // for (List<Annotation> al : constructorAnnotations.values())
    // getImports(imports, al);
    // for (List<Annotation> al : staticAnnotations.values())
    // getImports(imports, al);
    // for (List<Annotation> al : conflictAnnotations.values())
    // getImports(imports, al);
    // for (Map<String, List<Annotation>> am : attributeAnnotations.values()) {
    // for (List<Annotation> al : am.values()) {
    // getImports(imports, al);
    // }
    // }
    // for (Map<String, List<Annotation>> am : getterAnnotations.values()) {
    // for (List<Annotation> al : am.values()) {
    // getImports(imports, al);
    // }
    // }
    // for (Map<String, List<Annotation>> am : setterAnnotations.values()) {
    // for (List<Annotation> al : am.values()) {
    // getImports(imports, al);
    // }
    // }
    // return imports;
    // }
    //
    // public void getImports(Set<String> imports, List<Annotation> al) {
    // for (Annotation a : al) {
    // if (a.getType() != null)
    // imports.add(a.getType().getQualifiedName());
    // for (AnnotationProperty ap : a.getFeatures()) {
    // if (ap.getType() != null)
    // imports.add(ap.getType().getQualifiedName());
    // }
    // }
    // }

    public static void grabAnnotations(AnnotatedEntity apojo, Annotations as) {
        Entity entity = apojo.getEntity();
        if (entity == null)
            return;
        PojoEntity pojo = (entity instanceof PojoEntity) ? (PojoEntity) entity : null;
        EnumEntity epojo = (entity instanceof EnumEntity) ? (EnumEntity) entity : null;
        DaoEntity dao = (entity instanceof DaoEntity) ? (DaoEntity) entity : null;
        String name = (pojo != null) ? pojo.getName() : (epojo != null) ? epojo.getName() : (dao != null) ? dao
                .getName() : null;
        if (name == null)
            return;

        if (apojo.getAnnotations() != null && !apojo.getAnnotations().isEmpty()) {
            for (Annotation an : apojo.getAnnotations()) {
                if (an.getDirectives() == null || an.getDirectives().isEmpty()) {
                    as.addAnnotation(name, an.getAnnotation(), as.entityAnnotations);
                } else {
                    for (AnnotationDirective dir : an.getDirectives()) {
                        if (dir instanceof AnnotationDirectiveConflict) {
                            as.addAnnotation(name, an.getAnnotation(), as.conflictAnnotations);
                        } else if (dir instanceof AnnotationDirectiveConstructor) {
                            as.addAnnotation(name, an.getAnnotation(), as.constructorAnnotations);
                        } else if (dir instanceof AnnotationDirectiveStandard) {
                            as.addAnnotation(name, an.getAnnotation(), as.entityAnnotations);
                        } else if (dir instanceof AnnotationDirectiveStatic) {
                            as.addAnnotation(name, an.getAnnotation(), as.staticAnnotations);
                        }
                    }
                }
            }
        }
        if (pojo != null) {
            for (PojoAttribute feature : pojo.getAttributes()) {
                if (feature.getAnnotations() != null && !feature.getAnnotations().isEmpty()) {
                    for (Annotation an : feature.getAnnotations()) {
                        if (an.getDirectives() == null || an.getDirectives().isEmpty()) {
                            as.addAnnotation(name, feature.getName(), an.getAnnotation(), as.attributeAnnotations);
                        } else {
                            for (AnnotationDirective dir : an.getDirectives()) {
                                if (dir instanceof AnnotationDirectiveSetter) {
                                    as.addAnnotation(name, feature.getName(), an.getAnnotation(), as.setterAnnotations);
                                } else if (dir instanceof AnnotationDirectiveGetter) {
                                    as.addAnnotation(name, feature.getName(), an.getAnnotation(), as.getterAnnotations);
                                } else if (dir instanceof AnnotationDirectiveAttribute) {
                                    as.addAnnotation(name, feature.getName(), an.getAnnotation(),
                                            as.attributeAnnotations);
                                }
                            }
                        }
                    }
                }
            }
            for (PojoProcedure feature : pojo.getProcedures()) {
                if (feature.getAnnotations() != null && !feature.getAnnotations().isEmpty()) {
                    for (Annotation an : feature.getAnnotations()) {
                        as.addAnnotation(name, feature.getName(), an.getAnnotation(), as.procedureAnnotations);
                    }
                }
            }
        }
        if (dao != null) {
            for (PojoAttribute feature : dao.getAttributes()) {
                if (feature.getAnnotations() != null && !feature.getAnnotations().isEmpty()) {
                    for (Annotation an : feature.getAnnotations()) {
                        if (an.getDirectives() == null || an.getDirectives().isEmpty()) {
                            as.addAnnotation(name, feature.getName(), an.getAnnotation(), as.attributeAnnotations);
                        } else {
                            for (AnnotationDirective dir : an.getDirectives()) {
                                if (dir instanceof AnnotationDirectiveSetter) {
                                    as.addAnnotation(name, feature.getName(), an.getAnnotation(), as.setterAnnotations);
                                } else if (dir instanceof AnnotationDirectiveGetter) {
                                    as.addAnnotation(name, feature.getName(), an.getAnnotation(), as.getterAnnotations);
                                } else if (dir instanceof AnnotationDirectiveAttribute) {
                                    as.addAnnotation(name, feature.getName(), an.getAnnotation(),
                                            as.attributeAnnotations);
                                }
                            }
                        }
                    }
                }
            }
            for (PojoProcedure feature : dao.getProcedures()) {
                if (feature.getAnnotations() != null && !feature.getAnnotations().isEmpty()) {
                    for (Annotation an : feature.getAnnotations()) {
                        as.addAnnotation(name, feature.getName(), an.getAnnotation(), as.procedureAnnotations);
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Annotations [entityAnnotations=" + entityAnnotations + ", constructorAnnotations="
                + constructorAnnotations + ", staticAnnotations=" + staticAnnotations + ", conflictAnnotations="
                + conflictAnnotations + ", setterAnnotations=" + setterAnnotations + ", getterAnnotations="
                + getterAnnotations + ", attributeAnnotations=" + attributeAnnotations + "]";
    }
}
