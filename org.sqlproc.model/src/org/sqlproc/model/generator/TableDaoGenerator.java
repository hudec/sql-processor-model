package org.sqlproc.model.generator;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.serializer.ISerializer;
import org.sqlproc.model.processorModel.Artifacts;
import org.sqlproc.model.property.ImplementsExtends;
import org.sqlproc.model.property.ModelProperty;
import org.sqlproc.model.property.PojoAttribute;
import org.sqlproc.model.resolver.DbResolver.DbType;
import org.sqlproc.model.util.Annotations;
import org.sqlproc.model.util.Debug;

public class TableDaoGenerator extends TablePojoGenerator {

    protected Logger LOGGER = Logger.getLogger(TableDaoGenerator.class);
    private Debug debug = new Debug(LOGGER);

    protected Map<String, String> metaFunctionsResultSet = new HashMap<String, String>();
    protected Map<String, String> metaProceduresResultSet = new HashMap<String, String>();

    protected Map<String, String> finalDaos;
    protected Annotations daoAnnotations;
    protected Set<String> daoImports;
    protected Set<String> daoIgnoreTables = new HashSet<String>();
    protected Set<String> daoOnlyTables = new HashSet<String>();
    protected Map<String, ImplementsExtends> daoToImplements = new HashMap<String, ImplementsExtends>();
    protected ImplementsExtends daoToExtends = null;
    protected boolean daoMakeItFinal;
    protected Map<String, JvmParameterizedTypeReference> daoFunctionsResult = new HashMap<String, JvmParameterizedTypeReference>();
    protected Filter daoActiveFilter = null;
    protected String daoPackage;
    protected Set<String> imports = new HashSet<String>();

    public TableDaoGenerator() {
        super();
    }

    public TableDaoGenerator(ModelProperty modelProperty, Artifacts artifacts, IScopeProvider scopeProvider,
            Map<String, String> finalDaos, Annotations daoAnnotations, Set<String> daoImports,
            List<String> dbSequences, DbType dbType) {
        super(modelProperty, artifacts, Collections.<String, String> emptyMap(), null, null, dbSequences, dbType);

        debug = new Debug(modelProperty.getDaoDebugLevel(artifacts), modelProperty.getDaoDebugScope(artifacts), LOGGER);

        Map<String, String> metaFunctionsResultSet = modelProperty.getMetaFunctionsResultSet(artifacts);
        if (metaFunctionsResultSet != null) {
            this.metaFunctionsResultSet.putAll(metaFunctionsResultSet);
        }
        Map<String, String> metaProceduresResultSet = modelProperty.getMetaProceduresResultSet(artifacts);
        if (metaProceduresResultSet != null) {
            this.metaProceduresResultSet.putAll(metaProceduresResultSet);
        }

        this.finalDaos = finalDaos;
        this.daoAnnotations = daoAnnotations;
        this.daoImports = daoImports;

        Set<String> daoIgnoreTables = modelProperty.getDaoIgnoreTables(artifacts);
        if (daoIgnoreTables != null) {
            this.daoIgnoreTables.addAll(daoIgnoreTables);
        }
        Set<String> daoOnlyTables = modelProperty.getDaoOnlyTables(artifacts);
        if (daoOnlyTables != null) {
            this.daoOnlyTables.addAll(daoOnlyTables);
        }
        Map<String, ImplementsExtends> daoToImplements = modelProperty.getDaoToImplements(artifacts);
        if (daoToImplements != null) {
            this.daoToImplements.putAll(daoToImplements);
        }
        this.daoToExtends = modelProperty.getDaoToExtends(artifacts);
        this.daoMakeItFinal = modelProperty.isDaoMakeItFinal(artifacts);
        Map<String, JvmParameterizedTypeReference> daoFunctionsResult = modelProperty.getDaoFunctionsResult(artifacts);
        if (daoFunctionsResult != null) {
            this.daoFunctionsResult.putAll(daoFunctionsResult);
        }
        this.daoActiveFilter = Filter.parse(modelProperty.getDaoActiveFilter(artifacts));
        daoPackage = modelProperty.getDaoPackage(artifacts);

        if (debug.debug) {
            System.out.println("metaFunctionsResultSet " + this.metaFunctionsResultSet);
            System.out.println("metaProceduresResultSet " + this.metaProceduresResultSet);
            System.out.println("finalDaos " + this.finalDaos);
            System.out.println("annotations " + this.daoAnnotations);
            System.out.println("daoIgnoreTables " + this.daoIgnoreTables);
            System.out.println("daoOnlyTables " + this.daoOnlyTables);
            System.out.println("daoToImplements " + this.daoToImplements);
            System.out.println("daoToExtends " + this.daoToExtends);
            System.out.println("daoFunctionsResult " + this.daoFunctionsResult);
            System.out.println("daoActiveFilter " + this.daoActiveFilter);
            System.out.println("daoPackage " + this.daoPackage);
        }
    }

    public String getDaoDefinitions(ModelProperty modelProperty, Artifacts artifacts, ISerializer serializer) {
        String result = getDaoDefinitions(serializer);
        return replaceAll(modelProperty, result, artifacts);
    }

    public String getDaoDefinitions(ISerializer serializer) {
        StringBuilder bufferPartial = _getDaoDefinitions(serializer);
        if (imports == null || imports.isEmpty() || pojoPackage == null)
            return bufferPartial.toString();

        StringBuilder buffer = new StringBuilder("\n");
        for (String name : imports) {
            buffer.append(INDENT).append("import ").append(pojoPackage).append(".").append(name).append("\n");
        }
        buffer.append(bufferPartial);
        return buffer.toString();
    }

    public StringBuilder _getDaoDefinitions(ISerializer serializer) {
        try {
            if (debug.debug) {
                System.out.println("pojos " + this.pojos);
                System.out.println("pojoExtends " + this.pojoExtends);
                System.out.println("pojoInheritanceDiscriminator " + this.pojoInheritanceDiscriminator);
                System.out.println("pojoInheritanceSimple " + this.pojoInheritanceSimple);
                System.out.println("pojoDiscriminators " + this.pojoDiscriminators);
                System.out.println("indexes " + this.indexes);
                System.out.println("procedures " + this.procedures);
                System.out.println("functions " + this.functions);
            }

            StringBuilder buffer = new StringBuilder(), bufferPartial, bufferMeta;
            boolean isSerializable = false;
            Set<String> serializables = new HashSet<String>();
            boolean oneMoreLine = false;
            if (!daoToImplements.isEmpty()) {
                for (ImplementsExtends ie : daoToImplements.values()) {
                    JvmType type = ie.getToImplement();
                    if (type.getIdentifier().endsWith("Serializable")) {
                        if (!ie.getDbTables().isEmpty()) {
                            for (String dbTable : ie.getDbTables()) {
                                serializables.add(dbTable);
                            }
                            continue;
                        }
                        if (!ie.getDbNotTables().isEmpty()) {
                            for (String pojo : pojos.keySet()) {
                                serializables.add(pojo);
                            }
                            for (String pojo : enums.keySet()) {
                                serializables.add(pojo);
                            }
                            for (String pojo : procedures.keySet()) {
                                serializables.add(pojo);
                            }
                            for (String pojo : functions.keySet()) {
                                serializables.add(pojo);
                            }
                            for (String dbTable : ie.getDbNotTables()) {
                                serializables.remove(dbTable);
                            }
                            continue;
                        }
                        isSerializable = true;
                        continue;
                    }
                    if (ie.isGenerics()) {
                        buffer.append(NLINDENT).append("#Generics");
                    }
                    if (!ie.getDbTables().isEmpty()) {
                        buffer.append(NLINDENT).append("#OnlyDaos(");
                        boolean first = false;
                        for (String dbColumn : ie.getDbTables()) {
                            if (!first)
                                buffer.append(",");
                            else
                                first = false;
                            String pojoName = tableNames.get(dbColumn);
                            if (pojoName == null)
                                pojoName = dbColumn;
                            String daoName = tableToCamelCase(pojoName) + "Dao";
                            buffer.append(daoName);
                        }
                        buffer.append(")");
                    }
                    if (!ie.getDbNotTables().isEmpty()) {
                        buffer.append(NLINDENT).append("#ExceptDaos(");
                        boolean first = false;
                        for (String dbColumn : ie.getDbNotTables()) {
                            if (!first)
                                buffer.append(",");
                            else
                                first = false;
                            String pojoName = tableNames.get(dbColumn);
                            if (pojoName == null)
                                pojoName = dbColumn;
                            String daoName = tableToCamelCase(pojoName) + "Dao";
                            buffer.append(daoName);
                        }
                        buffer.append(")");
                    }
                    buffer.append(NLINDENT).append("implements ").append(type.getIdentifier());
                }
                oneMoreLine = true;
            }
            if (daoToExtends != null) {
                if (daoToExtends.isGenerics())
                    buffer.append(NLINDENT).append("#Generics");
                if (!daoToExtends.getDbTables().isEmpty()) {
                    buffer.append(NLINDENT).append("#OnlyDaos(");
                    boolean first = false;
                    for (String dbColumn : daoToExtends.getDbTables()) {
                        if (!first)
                            buffer.append(",");
                        else
                            first = false;
                        String pojoName = tableNames.get(dbColumn);
                        if (pojoName == null)
                            pojoName = dbColumn;
                        String daoName = tableToCamelCase(pojoName) + "Dao";
                        buffer.append(daoName);
                    }
                    buffer.append(")");
                }
                if (!daoToExtends.getDbNotTables().isEmpty()) {
                    buffer.append(NLINDENT).append("#ExceptDaos(");
                    boolean first = false;
                    for (String dbColumn : daoToExtends.getDbNotTables()) {
                        if (!first)
                            buffer.append(",");
                        else
                            first = false;
                        String pojoName = tableNames.get(dbColumn);
                        if (pojoName == null)
                            pojoName = dbColumn;
                        String daoName = tableToCamelCase(pojoName) + "Dao";
                        buffer.append(daoName);
                    }
                    buffer.append(")");
                }
                oneMoreLine = true;
                JvmType type = daoToExtends.getToImplement();
                buffer.append(NLINDENT).append("extends ").append(type.getIdentifier());
            }
            if (oneMoreLine) {
                buffer.append(NL);
            }

            // Pojo

            for (String pojo : pojos.keySet()) {
                // System.out.println("QQQQQ " + pojo);
                if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(pojo))
                    continue;
                if (daoIgnoreTables.contains(pojo))
                    continue;
                if (!Filter.isTable(daoActiveFilter, pojo))
                    continue;
                String pojoName = tableNames.get(pojo);
                if (pojoName == null)
                    pojoName = pojo;
                pojoName = tableToCamelCase(pojoName);
                imports.add(pojoName);
                String daoName = tableToCamelCase(pojoName) + "Dao";
                if (finalDaos.containsKey(daoName)) {
                    buffer.append(getFinalContent(finalDaos.get(daoName)));
                    continue;
                }
                if (pojoInheritanceDiscriminator.containsKey(pojo) || pojoInheritanceSimple.containsKey(pojo)) {
                    if (!notAbstractTables.contains(pojo))
                        continue;
                }
                if (daoAnnotations != null) {
                    buffer.append(daoAnnotations.getEntityAnnotationsDefinitions(daoName, serializer, true,
                            daoAnnotations.isNonStandardPojoAnnotations(daoName)));
                    buffer.append(daoAnnotations.getConstructorAnnotationsDefinitions(daoName, serializer, true));
                    buffer.append(daoAnnotations.getStaticAnnotationsDefinitions(daoName, serializer, true));
                    buffer.append(daoAnnotations.getConflictAnnotationsDefinitions(daoName, serializer, true));
                }
                {
                    bufferMeta = new StringBuilder();
                    if (isSerializable || serializables.contains(pojo))
                        bufferMeta.append(nlindent()).append("#Serializable(1)");
                    Map<String, String> toInit = new LinkedHashMap<String, String>();
                    toInits(pojo, toInit);
                    for (Entry<String, String> entry : toInit.entrySet()) {
                        bufferMeta.append(nlindent()).append("#InheritanceHandler(").append(entry.getKey());
                        // pojoExtends {BANK_ACCOUNT=BILLING_DETAILS, MOVIE=MEDIA, CREDIT_CARD=BILLING_DETAILS,
                        // BOOK=MEDIA}
                        // pojoInheritanceDiscriminator {BILLING_DETAILS=[BANK_ACCOUNT, CREDIT_CARD]}
                        // pojoInheritanceSimple {MEDIA=[MOVIE, BOOK]}
                        // pojoDiscriminators {BANK_ACCOUNT=BA, CREDIT_CARD=CC}
                        if (pojoInheritanceSimple.containsKey(entry.getValue())) {
                            for (String pojo2 : pojoInheritanceSimple.get(entry.getValue())) {
                                bufferMeta.append(",\"").append(columnToCamelCase(pojo2)).append("\"");
                                String pojoName2 = tableNames.get(pojo2);
                                if (pojoName2 == null)
                                    pojoName2 = pojo2;
                                bufferMeta.append("=").append(tableToCamelCase(pojoName2));
                            }
                        } else {
                            for (String pojo2 : pojoInheritanceDiscriminator.get(entry.getValue())) {
                                bufferMeta.append(",\"").append(pojoDiscriminators.get(pojo2)).append("\"");
                                String pojoName2 = tableNames.get(pojo2);
                                if (pojoName2 == null)
                                    pojoName2 = pojo2;
                                bufferMeta.append("=").append(tableToCamelCase(pojoName2));
                            }
                        }
                        bufferMeta.append(")");
                    }
                    bufferMeta.append(nlindent()).append("#CRUD(").append(pojoName).append(")");
                    bufferMeta.append(nlindent()).append("#Query(").append(pojoName).append(")");
                }
                if (bufferMeta.length() > 0 && bufferMeta.charAt(0) == ' ')
                    buffer.append(NLINDENT).append(bufferMeta.substring(1));
                else
                    buffer.append(bufferMeta);
                buffer.append(NLINDENT);
                if (daoMakeItFinal)
                    buffer.append("final ");
                buffer.append("#Dao ");
                buffer.append(daoName);
                buffer.append(" {");
                buffer.append(NLINDENT).append("}\n");
            }

            // Procedure

            for (String procedure : procedures.keySet()) {
                // System.out.println("QQQQQ " + pojo);
                if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(procedure))
                    continue;
                if (daoIgnoreTables.contains(procedure))
                    continue;
                if (!Filter.isTable(daoActiveFilter, procedure))
                    continue;
                boolean isFunction = functions.containsKey(procedure);
                if (isFunction)
                    continue;
                String pojoName = tableNames.get(procedure);
                if (pojoName == null)
                    pojoName = procedure;
                pojoName = tableToCamelCase(pojoName);
                imports.add(pojoName);
                String daoName = pojoName + "Dao";
                if (finalDaos.containsKey(daoName)) {
                    buffer.append(getFinalContent(finalDaos.get(daoName)));
                    continue;
                }
                if (daoAnnotations != null) {
                    buffer.append(daoAnnotations.getEntityAnnotationsDefinitions(daoName, serializer, true,
                            daoAnnotations.isNonStandardPojoAnnotations(daoName)));
                    buffer.append(daoAnnotations.getConstructorAnnotationsDefinitions(daoName, serializer, true));
                    buffer.append(daoAnnotations.getStaticAnnotationsDefinitions(daoName, serializer, true));
                    buffer.append(daoAnnotations.getConflictAnnotationsDefinitions(daoName, serializer, true));
                }

                // String procedureName = lowerFirstChar(pojoName);
                {
                    bufferMeta = new StringBuilder();
                    if (isSerializable || serializables.contains(procedure))
                        bufferMeta.append(nlindent()).append("#Serializable(1)");
                    Map<String, PojoAttribute> attributes = procedures.get(procedure);
                    if (metaProceduresResultSet.containsKey(procedure)) {
                        String name = metaProceduresResultSet.get(procedure);
                        if (tableNames.containsKey(name))
                            name = tableNames.get(name);
                        bufferMeta.append(nlindent()).append("#ProcedureCallQuery(").append(COLLECTION_LIST)
                                .append("<").append(tableToCamelCase(name)).append(">");
                    } else {
                        PojoAttribute returnAttribute = (attributes.containsKey(FAKE_FUN_PROC_COLUMN_NAME)) ? attributes
                                .get(FAKE_FUN_PROC_COLUMN_NAME) : null;
                        if (returnAttribute != null && dbType != DbType.POSTGRESQL && dbType != DbType.MS_SQL) {
                            bufferMeta.append(nlindent()).append("#ProcedureCallQuery(").append(COLLECTION_LIST)
                                    .append("<").append(returnAttribute.getClassName()).append(">");
                        } else {
                            bufferMeta.append(nlindent()).append("#ProcedureUpdate(int");
                        }
                    }
                    String dispName = null;
                    JvmParameterizedTypeReference ptype = pojosForProcedures.get(procedure);
                    if (ptype != null)
                        dispName = ptype.getType().getSimpleName();
                    bufferMeta.append(",").append((dispName != null) ? dispName : pojoName);
                    bufferMeta.append(")");
                }
                if (bufferMeta.length() > 0 && bufferMeta.charAt(0) == ' ')
                    buffer.append(NLINDENT).append(bufferMeta.substring(1));
                else
                    buffer.append(bufferMeta);
                buffer.append(NLINDENT);
                if (daoMakeItFinal)
                    buffer.append("final ");
                buffer.append("#Dao ");
                buffer.append(daoName);
                buffer.append(" {");
                buffer.append(NLINDENT).append("}\n");
            }

            // Procedure is function

            for (String function : procedures.keySet()) {
                // System.out.println("QQQQQ " + function);
                if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(function))
                    continue;
                if (daoIgnoreTables.contains(function))
                    continue;
                if (!Filter.isTable(daoActiveFilter, function))
                    continue;
                boolean isFunction = functions.containsKey(function);
                if (!isFunction)
                    continue;
                String pojoName = tableNames.get(function);
                if (pojoName == null)
                    pojoName = function;
                pojoName = tableToCamelCase(pojoName);
                imports.add(pojoName);
                String daoName = pojoName + "Dao";
                if (finalDaos.containsKey(daoName)) {
                    buffer.append(getFinalContent(finalDaos.get(daoName)));
                    continue;
                }
                if (daoAnnotations != null) {
                    buffer.append(daoAnnotations.getEntityAnnotationsDefinitions(daoName, serializer, true,
                            daoAnnotations.isNonStandardPojoAnnotations(daoName)));
                    buffer.append(daoAnnotations.getConstructorAnnotationsDefinitions(daoName, serializer, true));
                    buffer.append(daoAnnotations.getStaticAnnotationsDefinitions(daoName, serializer, true));
                    buffer.append(daoAnnotations.getConflictAnnotationsDefinitions(daoName, serializer, true));
                }

                // String procedureName = lowerFirstChar(pojoName);
                {
                    bufferMeta = new StringBuilder();
                    if (isSerializable || serializables.contains(function))
                        bufferMeta.append(nlindent()).append("#Serializable(1)");
                    Map<String, PojoAttribute> attributes = procedures.get(function);
                    if (metaFunctionsResultSet.containsKey(function)) {
                        String name = metaFunctionsResultSet.get(function);
                        if (tableNames.containsKey(name))
                            name = tableNames.get(name);
                        bufferMeta.append(nlindent()).append("#FunctionCallQuery(").append(COLLECTION_LIST).append("<")
                                .append(tableToCamelCase(name)).append(">");
                    } else if (metaFunctionsResult.containsKey(function)) {
                        bufferMeta.append(nlindent()).append("#FunctionCall(")
                                .append(metaType2className(metaFunctionsResult.get(function)));
                    } else {
                        PojoAttribute returnAttribute = (attributes.containsKey(FAKE_FUN_PROC_COLUMN_NAME)) ? attributes
                                .get(FAKE_FUN_PROC_COLUMN_NAME) : null;
                        if (returnAttribute != null) {
                            bufferMeta.append(nlindent()).append("#FunctionCallQuery(").append(COLLECTION_LIST)
                                    .append("<").append(returnAttribute.getClassName()).append(">");
                        } else {
                            bufferMeta.append(nlindent()).append("#FunctionUpdate(int");
                        }
                    }
                    String dispName = null;
                    JvmParameterizedTypeReference ptype = pojosForProcedures.get(function);
                    if (ptype != null)
                        dispName = ptype.getType().getSimpleName();
                    bufferMeta.append(",").append((dispName != null) ? dispName : pojoName);
                    bufferMeta.append(")");

                }
                if (bufferMeta.length() > 0 && bufferMeta.charAt(0) == ' ')
                    buffer.append(NLINDENT).append(bufferMeta.substring(1));
                else
                    buffer.append(bufferMeta);
                buffer.append(NLINDENT);
                if (daoMakeItFinal)
                    buffer.append("final ");
                buffer.append("#Dao ");
                buffer.append(daoName);
                buffer.append(" {");
                buffer.append(NLINDENT).append("}\n");
            }

            // Function

            for (String function : functions.keySet()) {
                // System.out.println("QQQQQ " + function);
                if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(function))
                    continue;
                if (daoIgnoreTables.contains(function))
                    continue;
                if (!Filter.isTable(daoActiveFilter, function))
                    continue;
                boolean isProcedure = procedures.containsKey(function);
                if (isProcedure)
                    continue;
                String pojoName = tableNames.get(function);
                if (pojoName == null)
                    pojoName = function;
                pojoName = tableToCamelCase(pojoName);
                imports.add(pojoName);
                String daoName = pojoName + "Dao";
                if (finalDaos.containsKey(daoName)) {
                    buffer.append(getFinalContent(finalDaos.get(daoName)));
                    continue;
                }
                if (daoAnnotations != null) {
                    buffer.append(daoAnnotations.getEntityAnnotationsDefinitions(daoName, serializer, true,
                            daoAnnotations.isNonStandardPojoAnnotations(daoName)));
                    buffer.append(daoAnnotations.getConstructorAnnotationsDefinitions(daoName, serializer, true));
                    buffer.append(daoAnnotations.getStaticAnnotationsDefinitions(daoName, serializer, true));
                    buffer.append(daoAnnotations.getConflictAnnotationsDefinitions(daoName, serializer, true));
                }

                // String procedureName = lowerFirstChar(pojoName);
                {
                    bufferMeta = new StringBuilder();
                    if (isSerializable || serializables.contains(function))
                        bufferMeta.append(nlindent()).append("#Serializable(1)");
                    Map<String, PojoAttribute> attributes = functions.get(function);
                    if (metaFunctionsResultSet.containsKey(function)) {
                        String name = metaFunctionsResultSet.get(function);
                        if (tableNames.containsKey(name))
                            name = tableNames.get(name);
                        bufferMeta.append(nlindent()).append("#FunctionCallQuery(").append(COLLECTION_LIST).append("<")
                                .append(tableToCamelCase(name)).append(">");
                    } else if (metaFunctionsResult.containsKey(function) && dbType == DbType.DB2) {
                        bufferMeta.append(nlindent()).append("#FunctionQuery(")
                                .append(metaType2className(metaFunctionsResult.get(function)));
                    } else if (metaFunctionsResult.containsKey(function)) {
                        bufferMeta.append(nlindent()).append("callFunction ")
                                .append(metaType2className(metaFunctionsResult.get(function)));
                    } else {
                        PojoAttribute returnAttribute = (attributes.containsKey(FAKE_FUN_PROC_COLUMN_NAME)) ? attributes
                                .get(FAKE_FUN_PROC_COLUMN_NAME) : null;
                        if (returnAttribute != null) {
                            bufferMeta.append(nlindent()).append("#FunctionCallQuery(").append(COLLECTION_LIST)
                                    .append("<").append(returnAttribute.getClassName()).append(">");
                        } else {
                            bufferMeta.append(nlindent()).append("#FunctionUpdate(int");
                        }
                    }
                    String dispName = null;
                    JvmParameterizedTypeReference ptype = pojosForProcedures.get(function);
                    if (ptype != null)
                        dispName = ptype.getType().getSimpleName();
                    bufferMeta.append(",").append((dispName != null) ? dispName : pojoName);
                    bufferMeta.append(")");

                }
                if (bufferMeta.length() > 0 && bufferMeta.charAt(0) == ' ')
                    buffer.append(NLINDENT).append(bufferMeta.substring(1));
                else
                    buffer.append(bufferMeta);
                buffer.append(NLINDENT);
                if (daoMakeItFinal)
                    buffer.append("final ");
                buffer.append("#Dao ");
                buffer.append(daoName);
                buffer.append(" {");
                buffer.append(NLINDENT).append("}\n");
            }

            return buffer;
        } catch (RuntimeException ex) {
            Writer writer = new StringWriter();
            PrintWriter printWriter = new PrintWriter(writer);
            ex.printStackTrace(printWriter);
            return new StringBuilder(writer.toString());
        }
    }

    protected void toInits(String pojo, Map<String, String> toInit) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey()))
                continue;
            PojoAttribute attribute = pentry.getValue();
            String name = (columnNames.containsKey(pojo)) ? columnNames.get(pojo).get(pentry.getKey()) : null;
            if (name == null)
                name = attribute.getName();
            else
                name = columnToCamelCase(name);
            if (attribute.toInit()) {
                if (attribute.getRef() != null) {
                    if (pojoInheritanceDiscriminator.containsKey(attribute.getRef())
                            || pojoInheritanceSimple.containsKey(attribute.getRef())) {
                        toInit.put(name, attribute.getRef());
                        // System.out.println("AAAAAAAAA " + " " + pojo + " " + attribute.getRef() + " " + name);
                    }
                }
            }
        }
        if (pojoExtends.containsKey(pojo)) {
            toInits(pojoExtends.get(pojo), toInit);
        }
    }
}
