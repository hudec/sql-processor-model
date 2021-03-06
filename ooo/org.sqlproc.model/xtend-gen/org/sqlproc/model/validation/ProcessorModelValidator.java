/**
 * generated by Xtext
 */
package org.sqlproc.model.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.sqlproc.model.generator.ProcessorGeneratorUtils;
import org.sqlproc.model.processorModel.AbstractPojoEntity;
import org.sqlproc.model.processorModel.Artifacts;
import org.sqlproc.model.processorModel.Entity;
import org.sqlproc.model.processorModel.EnumEntity;
import org.sqlproc.model.processorModel.EnumProperty;
import org.sqlproc.model.processorModel.FunctionDefinition;
import org.sqlproc.model.processorModel.PojoAnnotatedProperty;
import org.sqlproc.model.processorModel.PojoDao;
import org.sqlproc.model.processorModel.PojoDefinition;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.PojoProperty;
import org.sqlproc.model.processorModel.ProcedureDefinition;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.Property;
import org.sqlproc.model.processorModel.TableDefinition;
import org.sqlproc.model.property.ModelProperty;
import org.sqlproc.model.resolver.DbResolver;
import org.sqlproc.model.resolver.PojoResolver;
import org.sqlproc.model.resolver.PojoResolverFactory;
import org.sqlproc.model.util.Utils;
import org.sqlproc.model.validation.AbstractProcessorModelValidator;
import org.sqlproc.model.validation.ValidationResult;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class ProcessorModelValidator extends AbstractProcessorModelValidator {
  @Inject
  private PojoResolverFactory pojoResolverFactory;
  
  @Inject
  private DbResolver dbResolver;
  
  @Inject
  private IScopeProvider scopeProvider;
  
  @Inject
  private IQualifiedNameConverter qualifiedNameConverter;
  
  @Inject
  private ModelProperty modelProperty;
  
  @Inject
  @Extension
  private ProcessorGeneratorUtils _processorGeneratorUtils;
  
  @Check
  public void checkUniquePojoDefinition(final PojoDefinition pojoDefinition) {
    boolean _and = false;
    boolean _isResolvePojo = this.isResolvePojo(pojoDefinition);
    if (!_isResolvePojo) {
      _and = false;
    } else {
      String _class = this.getClass(pojoDefinition);
      boolean _checkClass = this.checkClass(_class);
      boolean _not = (!_checkClass);
      _and = _not;
    }
    if (_and) {
      String _class_1 = this.getClass(pojoDefinition);
      String _plus = ("Class name : " + _class_1);
      String _plus_1 = (_plus + " not exists");
      this.error(_plus_1, 
        ProcessorModelPackage.Literals.POJO_DEFINITION__NAME);
    }
    EObject _rootContainer = EcoreUtil.getRootContainer(pojoDefinition);
    if ((!(_rootContainer instanceof Artifacts))) {
      return;
    }
    EObject _rootContainer_1 = EcoreUtil.getRootContainer(pojoDefinition);
    final Artifacts artifacts = ((Artifacts) _rootContainer_1);
    EList<PojoDefinition> _pojos = artifacts.getPojos();
    for (final PojoDefinition definition : _pojos) {
      boolean _and_1 = false;
      boolean _notEquals = (!Objects.equal(definition, null));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        boolean _tripleNotEquals = (definition != pojoDefinition);
        _and_1 = _tripleNotEquals;
      }
      if (_and_1) {
        String _name = pojoDefinition.getName();
        String _name_1 = definition.getName();
        boolean _equals = _name.equals(_name_1);
        if (_equals) {
          String _name_2 = pojoDefinition.getName();
          String _plus_2 = ("Duplicate name : " + _name_2);
          this.error(_plus_2, 
            ProcessorModelPackage.Literals.POJO_DEFINITION__NAME);
          return;
        }
      }
    }
  }
  
  public boolean checkClass(final String className) {
    boolean _or = false;
    boolean _equals = Objects.equal(className, null);
    if (_equals) {
      _or = true;
    } else {
      PojoResolver _pojoResolver = this.pojoResolverFactory.getPojoResolver();
      boolean _equals_1 = Objects.equal(_pojoResolver, null);
      _or = _equals_1;
    }
    if (_or) {
      return true;
    }
    PojoResolver _pojoResolver_1 = this.pojoResolverFactory.getPojoResolver();
    final Class<?> clazz = _pojoResolver_1.loadClass(className);
    return (!Objects.equal(clazz, null));
  }
  
  public boolean isResolvePojo(final EObject model) {
    boolean _or = false;
    PojoResolver _pojoResolver = this.pojoResolverFactory.getPojoResolver();
    boolean _equals = Objects.equal(_pojoResolver, null);
    if (_equals) {
      _or = true;
    } else {
      PojoResolver _pojoResolver_1 = this.pojoResolverFactory.getPojoResolver();
      boolean _isResolvePojo = _pojoResolver_1.isResolvePojo(model);
      boolean _not = (!_isResolvePojo);
      _or = _not;
    }
    if (_or) {
      return false;
    }
    return true;
  }
  
  public boolean isResolveDb(final EObject model) {
    return this.dbResolver.isResolveDb(model);
  }
  
  public String getClass(final PojoDefinition pojo) {
    JvmType _classx = pojo.getClassx();
    boolean _notEquals = (!Objects.equal(_classx, null));
    if (_notEquals) {
      JvmType _classx_1 = pojo.getClassx();
      return _classx_1.getQualifiedName();
    }
    return pojo.getClass_();
  }
  
  public boolean isNumber(final String param) {
    boolean _equals = Objects.equal(param, null);
    if (_equals) {
      return false;
    }
    int _length = param.length();
    int i = (_length - 1);
    while ((i >= 0)) {
      {
        char _charAt = param.charAt(i);
        boolean _isDigit = Character.isDigit(_charAt);
        boolean _not = (!_isDigit);
        if (_not) {
          return false;
        }
        i = (i - 1);
      }
    }
    return true;
  }
  
  public boolean isPrimitive(final Class<?> clazz) {
    boolean _equals = Objects.equal(clazz, null);
    if (_equals) {
      return true;
    }
    boolean _equals_1 = Objects.equal(clazz, String.class);
    if (_equals_1) {
      return true;
    }
    boolean _equals_2 = Objects.equal(clazz, Date.class);
    if (_equals_2) {
      return true;
    }
    boolean _equals_3 = Objects.equal(clazz, java.sql.Date.class);
    if (_equals_3) {
      return true;
    }
    boolean _equals_4 = Objects.equal(clazz, Time.class);
    if (_equals_4) {
      return true;
    }
    boolean _equals_5 = Objects.equal(clazz, Timestamp.class);
    if (_equals_5) {
      return true;
    }
    boolean _equals_6 = Objects.equal(clazz, Blob.class);
    if (_equals_6) {
      return true;
    }
    boolean _equals_7 = Objects.equal(clazz, Clob.class);
    if (_equals_7) {
      return true;
    }
    boolean _equals_8 = Objects.equal(clazz, BigDecimal.class);
    if (_equals_8) {
      return true;
    }
    boolean _equals_9 = Objects.equal(clazz, BigInteger.class);
    if (_equals_9) {
      return true;
    }
    return false;
  }
  
  public ValidationResult checkClassProperty(final String className, final String property) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _equals = Objects.equal(property, null);
    if (_equals) {
      _or_1 = true;
    } else {
      boolean _isNumber = this.isNumber(property);
      _or_1 = _isNumber;
    }
    if (_or_1) {
      _or = true;
    } else {
      PojoResolver _pojoResolver = this.pojoResolverFactory.getPojoResolver();
      boolean _equals_1 = Objects.equal(_pojoResolver, null);
      _or = _equals_1;
    }
    if (_or) {
      return ValidationResult.OK;
    }
    boolean _equals_2 = Objects.equal(className, null);
    if (_equals_2) {
      return ValidationResult.ERROR;
    }
    PojoResolver _pojoResolver_1 = this.pojoResolverFactory.getPojoResolver();
    PropertyDescriptor[] descriptors = _pojoResolver_1.getPropertyDescriptors(className);
    boolean _equals_3 = Objects.equal(descriptors, null);
    if (_equals_3) {
      return ValidationResult.WARNING;
    }
    String checkProperty = property;
    int pos1 = checkProperty.indexOf("=");
    if ((pos1 > 0)) {
      int pos2 = checkProperty.indexOf(".", pos1);
      if ((pos2 > pos1)) {
        String _substring = checkProperty.substring(0, pos1);
        String _substring_1 = checkProperty.substring(pos2);
        String _plus = (_substring + _substring_1);
        checkProperty = _plus;
      }
    }
    String innerProperty = ((String) null);
    int _indexOf = checkProperty.indexOf(".");
    pos1 = _indexOf;
    if ((pos1 > 0)) {
      String _substring_2 = checkProperty.substring((pos1 + 1));
      innerProperty = _substring_2;
      String _substring_3 = checkProperty.substring(0, pos1);
      checkProperty = _substring_3;
    }
    final String _checkProperty = checkProperty;
    final PropertyDescriptor[] _converted_descriptors = (PropertyDescriptor[])descriptors;
    final Function1<PropertyDescriptor, Boolean> _function = new Function1<PropertyDescriptor, Boolean>() {
      public Boolean apply(final PropertyDescriptor descriptor) {
        String _name = descriptor.getName();
        return Boolean.valueOf(Objects.equal(_name, _checkProperty));
      }
    };
    PropertyDescriptor innerDesriptor = IterableExtensions.<PropertyDescriptor>findFirst(((Iterable<PropertyDescriptor>)Conversions.doWrapArray(_converted_descriptors)), _function);
    boolean _equals_4 = Objects.equal(innerDesriptor, null);
    if (_equals_4) {
      PojoResolver _pojoResolver_2 = this.pojoResolverFactory.getPojoResolver();
      final Class<?> clazz = _pojoResolver_2.loadClass(className);
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(clazz, null));
      if (!_notEquals) {
        _and = false;
      } else {
        int _modifiers = clazz.getModifiers();
        boolean _isAbstract = Modifier.isAbstract(_modifiers);
        _and = _isAbstract;
      }
      if (_and) {
        return ValidationResult.WARNING;
      }
      return ValidationResult.ERROR;
    }
    boolean _notEquals_1 = (!Objects.equal(innerProperty, null));
    if (_notEquals_1) {
      Class<?> innerClass = innerDesriptor.getPropertyType();
      boolean _isArray = innerClass.isArray();
      if (_isArray) {
        Method _readMethod = innerDesriptor.getReadMethod();
        Type _genericReturnType = _readMethod.getGenericReturnType();
        final ParameterizedType type = ((ParameterizedType) _genericReturnType);
        boolean _or_2 = false;
        Type[] _actualTypeArguments = type.getActualTypeArguments();
        boolean _equals_5 = Objects.equal(_actualTypeArguments, null);
        if (_equals_5) {
          _or_2 = true;
        } else {
          Type[] _actualTypeArguments_1 = type.getActualTypeArguments();
          int _length = _actualTypeArguments_1.length;
          boolean _equals_6 = (_length == 0);
          _or_2 = _equals_6;
        }
        if (_or_2) {
          return ValidationResult.WARNING;
        }
        Type[] _actualTypeArguments_2 = type.getActualTypeArguments();
        Type _head = IterableExtensions.<Type>head(((Iterable<Type>)Conversions.doWrapArray(_actualTypeArguments_2)));
        innerClass = ((Class<?>) _head);
        boolean _isPrimitive = this.isPrimitive(innerClass);
        if (_isPrimitive) {
          return ValidationResult.ERROR;
        }
        String _name = innerClass.getName();
        return this.checkClassProperty(_name, innerProperty);
      } else {
        boolean _isAssignableFrom = Collection.class.isAssignableFrom(innerClass);
        if (_isAssignableFrom) {
          Method _readMethod_1 = innerDesriptor.getReadMethod();
          Type _genericReturnType_1 = _readMethod_1.getGenericReturnType();
          final ParameterizedType type_1 = ((ParameterizedType) _genericReturnType_1);
          boolean _or_3 = false;
          Type[] _actualTypeArguments_3 = type_1.getActualTypeArguments();
          boolean _equals_7 = Objects.equal(_actualTypeArguments_3, null);
          if (_equals_7) {
            _or_3 = true;
          } else {
            Type[] _actualTypeArguments_4 = type_1.getActualTypeArguments();
            int _length_1 = _actualTypeArguments_4.length;
            boolean _equals_8 = (_length_1 == 0);
            _or_3 = _equals_8;
          }
          if (_or_3) {
            return ValidationResult.WARNING;
          }
          Type[] _actualTypeArguments_5 = type_1.getActualTypeArguments();
          Type _head_1 = IterableExtensions.<Type>head(((Iterable<Type>)Conversions.doWrapArray(_actualTypeArguments_5)));
          innerClass = ((Class<?>) _head_1);
          boolean _isPrimitive_1 = this.isPrimitive(innerClass);
          if (_isPrimitive_1) {
            return ValidationResult.ERROR;
          }
          String _name_1 = innerClass.getName();
          return this.checkClassProperty(_name_1, innerProperty);
        } else {
          boolean _isPrimitive_2 = this.isPrimitive(innerClass);
          if (_isPrimitive_2) {
            return ValidationResult.ERROR;
          }
          String _name_2 = innerClass.getName();
          return this.checkClassProperty(_name_2, innerProperty);
        }
      }
    }
    return ValidationResult.OK;
  }
  
  public ValidationResult checkEntityProperty(final PojoEntity entity, final String property) {
    boolean _or = false;
    boolean _equals = Objects.equal(property, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _isNumber = this.isNumber(property);
      _or = _isNumber;
    }
    if (_or) {
      return ValidationResult.OK;
    }
    String checkProperty = property;
    int pos1 = checkProperty.indexOf("=");
    if ((pos1 > 0)) {
      int pos2 = checkProperty.indexOf(".", pos1);
      if ((pos2 > pos1)) {
        String _substring = checkProperty.substring(0, pos1);
        String _substring_1 = checkProperty.substring(pos2);
        String _plus = (_substring + _substring_1);
        checkProperty = _plus;
      }
    }
    String innerProperty = ((String) null);
    int _indexOf = checkProperty.indexOf(".");
    pos1 = _indexOf;
    if ((pos1 > 0)) {
      String _substring_2 = checkProperty.substring((pos1 + 1));
      innerProperty = _substring_2;
      String _substring_3 = checkProperty.substring(0, pos1);
      checkProperty = _substring_3;
    }
    EList<PojoAnnotatedProperty> _features = entity.getFeatures();
    for (final PojoAnnotatedProperty apojoProperty : _features) {
      {
        PojoProperty pojoProperty = apojoProperty.getFeature();
        String _name = pojoProperty.getName();
        boolean _equals_1 = _name.equals(checkProperty);
        if (_equals_1) {
          boolean _equals_2 = Objects.equal(innerProperty, null);
          if (_equals_2) {
            return ValidationResult.OK;
          }
          Entity _ref = pojoProperty.getRef();
          boolean _notEquals = (!Objects.equal(_ref, null));
          if (_notEquals) {
            Entity _ref_1 = pojoProperty.getRef();
            if ((_ref_1 instanceof PojoEntity)) {
              Entity _ref_2 = pojoProperty.getRef();
              return this.checkEntityProperty(((PojoEntity) _ref_2), innerProperty);
            }
            return ValidationResult.OK;
          }
          PojoEntity _gref = pojoProperty.getGref();
          boolean _notEquals_1 = (!Objects.equal(_gref, null));
          if (_notEquals_1) {
            PojoEntity _gref_1 = pojoProperty.getGref();
            return this.checkEntityProperty(_gref_1, innerProperty);
          }
          return ValidationResult.ERROR;
        }
      }
    }
    PojoEntity superType = this._processorGeneratorUtils.getSuperType(entity);
    boolean _notEquals = (!Objects.equal(superType, null));
    if (_notEquals) {
      ValidationResult result = this.checkEntityProperty(superType, property);
      boolean _or_1 = false;
      boolean _equals_1 = Objects.equal(result, ValidationResult.WARNING);
      if (_equals_1) {
        _or_1 = true;
      } else {
        boolean _equals_2 = Objects.equal(result, ValidationResult.OK);
        _or_1 = _equals_2;
      }
      if (_or_1) {
        return result;
      }
    }
    boolean _isAbstract = this._processorGeneratorUtils.isAbstract(entity);
    if (_isAbstract) {
      return ValidationResult.WARNING;
    } else {
      final Set<String> suppressedAbstracts = this.modelProperty.getNotAbstractTables(entity);
      boolean _and = false;
      boolean _notEquals_1 = (!Objects.equal(suppressedAbstracts, null));
      if (!_notEquals_1) {
        _and = false;
      } else {
        String _dbName = Utils.dbName(entity);
        boolean _contains = suppressedAbstracts.contains(_dbName);
        _and = _contains;
      }
      if (_and) {
        return ValidationResult.WARNING;
      } else {
        return ValidationResult.ERROR;
      }
    }
  }
  
  @Check
  public void checkUniqueProperty(final Property property) {
    EObject _rootContainer = EcoreUtil.getRootContainer(property);
    if ((!(_rootContainer instanceof Artifacts))) {
      return;
    }
    EObject _rootContainer_1 = EcoreUtil.getRootContainer(property);
    final Artifacts artifacts = ((Artifacts) _rootContainer_1);
    EList<Property> _properties = artifacts.getProperties();
    for (final Property prop : _properties) {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(prop, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _tripleNotEquals = (prop != property);
        _and = _tripleNotEquals;
      }
      if (_and) {
        boolean _and_1 = false;
        boolean _and_2 = false;
        boolean _and_3 = false;
        boolean _and_4 = false;
        boolean _and_5 = false;
        String _name = prop.getName();
        String _name_1 = property.getName();
        boolean _equals = _name.equals(_name_1);
        if (!_equals) {
          _and_5 = false;
        } else {
          String _name_2 = prop.getName();
          boolean _startsWith = _name_2.startsWith("pojogen");
          boolean _not = (!_startsWith);
          _and_5 = _not;
        }
        if (!_and_5) {
          _and_4 = false;
        } else {
          String _name_3 = prop.getName();
          boolean _startsWith_1 = _name_3.startsWith("database");
          boolean _not_1 = (!_startsWith_1);
          _and_4 = _not_1;
        }
        if (!_and_4) {
          _and_3 = false;
        } else {
          String _name_4 = prop.getName();
          boolean _startsWith_2 = _name_4.startsWith("metagen");
          boolean _not_2 = (!_startsWith_2);
          _and_3 = _not_2;
        }
        if (!_and_3) {
          _and_2 = false;
        } else {
          String _name_5 = prop.getName();
          boolean _startsWith_3 = _name_5.startsWith("daogen");
          boolean _not_3 = (!_startsWith_3);
          _and_2 = _not_3;
        }
        if (!_and_2) {
          _and_1 = false;
        } else {
          String _name_6 = prop.getName();
          boolean _startsWith_4 = _name_6.startsWith("replace-all");
          boolean _not_4 = (!_startsWith_4);
          _and_1 = _not_4;
        }
        if (_and_1) {
          String _name_7 = property.getName();
          String _plus = ("Duplicate name : " + _name_7);
          this.error(_plus, ProcessorModelPackage.Literals.PROPERTY__NAME);
          return;
        }
      }
    }
  }
  
  @Check
  public void checkTableDefinition(final TableDefinition tableDefinition) {
    EObject _rootContainer = EcoreUtil.getRootContainer(tableDefinition);
    if ((!(_rootContainer instanceof Artifacts))) {
      return;
    }
    EObject _rootContainer_1 = EcoreUtil.getRootContainer(tableDefinition);
    final Artifacts artifacts = ((Artifacts) _rootContainer_1);
    EList<TableDefinition> _tables = artifacts.getTables();
    for (final TableDefinition table : _tables) {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(table, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _tripleNotEquals = (table != tableDefinition);
        _and = _tripleNotEquals;
      }
      if (_and) {
        String _name = tableDefinition.getName();
        String _name_1 = table.getName();
        boolean _equals = _name.equals(_name_1);
        if (_equals) {
          String _name_2 = tableDefinition.getName();
          String _plus = ("Duplicate name : " + _name_2);
          String _plus_1 = (_plus + "[table]");
          this.error(_plus_1, 
            ProcessorModelPackage.Literals.TABLE_DEFINITION__NAME);
          return;
        }
      }
    }
    boolean _and_1 = false;
    boolean _isResolveDb = this.isResolveDb(tableDefinition);
    if (!_isResolveDb) {
      _and_1 = false;
    } else {
      String _table = tableDefinition.getTable();
      boolean _checkTable = this.dbResolver.checkTable(tableDefinition, _table);
      boolean _not = (!_checkTable);
      _and_1 = _not;
    }
    if (_and_1) {
      String _table_1 = tableDefinition.getTable();
      String _plus_2 = ("Cannot find table in DB : " + _table_1);
      this.error(_plus_2, 
        ProcessorModelPackage.Literals.TABLE_DEFINITION__TABLE);
    }
  }
  
  @Check
  public void checkProcedureDefinition(final ProcedureDefinition procedureDefinition) {
    EObject _rootContainer = EcoreUtil.getRootContainer(procedureDefinition);
    if ((!(_rootContainer instanceof Artifacts))) {
      return;
    }
    EObject _rootContainer_1 = EcoreUtil.getRootContainer(procedureDefinition);
    final Artifacts artifacts = ((Artifacts) _rootContainer_1);
    EList<ProcedureDefinition> _procedures = artifacts.getProcedures();
    for (final ProcedureDefinition procedure : _procedures) {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(procedure, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _tripleNotEquals = (procedure != procedureDefinition);
        _and = _tripleNotEquals;
      }
      if (_and) {
        String _name = procedureDefinition.getName();
        String _name_1 = procedure.getName();
        boolean _equals = _name.equals(_name_1);
        if (_equals) {
          String _name_2 = procedureDefinition.getName();
          String _plus = ("Duplicate name : " + _name_2);
          String _plus_1 = (_plus + "[procedure]");
          this.error(_plus_1, 
            ProcessorModelPackage.Literals.PROCEDURE_DEFINITION__NAME);
          return;
        }
      }
    }
    boolean _and_1 = false;
    boolean _isResolveDb = this.isResolveDb(procedureDefinition);
    if (!_isResolveDb) {
      _and_1 = false;
    } else {
      String _table = procedureDefinition.getTable();
      boolean _checkProcedure = this.dbResolver.checkProcedure(procedureDefinition, _table);
      boolean _not = (!_checkProcedure);
      _and_1 = _not;
    }
    if (_and_1) {
      String _table_1 = procedureDefinition.getTable();
      String _plus_2 = ("Cannot find procedure in DB : " + _table_1);
      this.error(_plus_2, 
        ProcessorModelPackage.Literals.PROCEDURE_DEFINITION__NAME);
    }
  }
  
  @Check
  public void checkFunctionDefinition(final FunctionDefinition functionDefinition) {
    EObject _rootContainer = EcoreUtil.getRootContainer(functionDefinition);
    if ((!(_rootContainer instanceof Artifacts))) {
      return;
    }
    EObject _rootContainer_1 = EcoreUtil.getRootContainer(functionDefinition);
    final Artifacts artifacts = ((Artifacts) _rootContainer_1);
    EList<FunctionDefinition> _functions = artifacts.getFunctions();
    for (final FunctionDefinition function : _functions) {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(function, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _tripleNotEquals = (function != functionDefinition);
        _and = _tripleNotEquals;
      }
      if (_and) {
        String _name = functionDefinition.getName();
        String _name_1 = function.getName();
        boolean _equals = _name.equals(_name_1);
        if (_equals) {
          String _name_2 = functionDefinition.getName();
          String _plus = ("Duplicate name : " + _name_2);
          String _plus_1 = (_plus + "[function]");
          this.error(_plus_1, 
            ProcessorModelPackage.Literals.FUNCTION_DEFINITION__NAME);
          return;
        }
      }
    }
  }
  
  @Check
  public void checkUniquePojoEntity(final PojoEntity pojoEntity) {
    EObject _rootContainer = EcoreUtil.getRootContainer(pojoEntity);
    if ((!(_rootContainer instanceof Artifacts))) {
      return;
    }
    EObject _rootContainer_1 = EcoreUtil.getRootContainer(pojoEntity);
    final Artifacts artifacts = ((Artifacts) _rootContainer_1);
    EList<org.sqlproc.model.processorModel.Package> _packages = artifacts.getPackages();
    for (final org.sqlproc.model.processorModel.Package pkg : _packages) {
      boolean _notEquals = (!Objects.equal(pkg, null));
      if (_notEquals) {
        EList<AbstractPojoEntity> _elements = pkg.getElements();
        for (final AbstractPojoEntity entity : _elements) {
          boolean _and = false;
          boolean _notEquals_1 = (!Objects.equal(entity, null));
          if (!_notEquals_1) {
            _and = false;
          } else {
            _and = (entity instanceof PojoEntity);
          }
          if (_and) {
            final PojoEntity pentity = ((PojoEntity) entity);
            boolean _tripleNotEquals = (pentity != pojoEntity);
            if (_tripleNotEquals) {
              String _name = pojoEntity.getName();
              String _name_1 = pentity.getName();
              boolean _equals = _name.equals(_name_1);
              if (_equals) {
                String _name_2 = pojoEntity.getName();
                String _plus = ("Duplicate name : " + _name_2);
                this.error(_plus, ProcessorModelPackage.Literals.ENTITY__NAME);
                return;
              }
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkUniquePojoProperty(final PojoProperty pojoProperty) {
    final PojoEntity entity = EcoreUtil2.<PojoEntity>getContainerOfType(pojoProperty, PojoEntity.class);
    EList<PojoAnnotatedProperty> _features = entity.getFeatures();
    for (final PojoAnnotatedProperty aproperty : _features) {
      {
        final PojoProperty property = aproperty.getFeature();
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(property, null));
        if (!_notEquals) {
          _and = false;
        } else {
          boolean _tripleNotEquals = (property != pojoProperty);
          _and = _tripleNotEquals;
        }
        if (_and) {
          String _name = pojoProperty.getName();
          String _name_1 = property.getName();
          boolean _equals = _name.equals(_name_1);
          if (_equals) {
            String _name_2 = pojoProperty.getName();
            String _plus = ("Duplicate name : " + _name_2);
            this.error(_plus, ProcessorModelPackage.Literals.POJO_PROPERTY__NAME);
            return;
          }
        }
      }
    }
  }
  
  @Check
  public void checkUniqueEnumEntity(final EnumEntity enumEntity) {
    EObject _rootContainer = EcoreUtil.getRootContainer(enumEntity);
    if ((!(_rootContainer instanceof Artifacts))) {
      return;
    }
    EObject _rootContainer_1 = EcoreUtil.getRootContainer(enumEntity);
    final Artifacts artifacts = ((Artifacts) _rootContainer_1);
    EList<org.sqlproc.model.processorModel.Package> _packages = artifacts.getPackages();
    for (final org.sqlproc.model.processorModel.Package pkg : _packages) {
      boolean _notEquals = (!Objects.equal(pkg, null));
      if (_notEquals) {
        EList<AbstractPojoEntity> _elements = pkg.getElements();
        for (final AbstractPojoEntity entity : _elements) {
          boolean _and = false;
          boolean _notEquals_1 = (!Objects.equal(entity, null));
          if (!_notEquals_1) {
            _and = false;
          } else {
            _and = (entity instanceof EnumEntity);
          }
          if (_and) {
            final EnumEntity pentity = ((EnumEntity) entity);
            boolean _notEquals_2 = (!Objects.equal(pentity, enumEntity));
            if (_notEquals_2) {
              String _name = enumEntity.getName();
              String _name_1 = pentity.getName();
              boolean _equals = _name.equals(_name_1);
              if (_equals) {
                String _name_2 = enumEntity.getName();
                String _plus = ("Duplicate name : " + _name_2);
                this.error(_plus, ProcessorModelPackage.Literals.ENTITY__NAME);
                return;
              }
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkUniqueEnumProperty(final EnumProperty enumProperty) {
    final EnumEntity entity = EcoreUtil2.<EnumEntity>getContainerOfType(enumProperty, EnumEntity.class);
    EList<EnumProperty> _features = entity.getFeatures();
    for (final EnumProperty property : _features) {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(property, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _tripleNotEquals = (property != enumProperty);
        _and = _tripleNotEquals;
      }
      if (_and) {
        String _name = enumProperty.getName();
        String _name_1 = property.getName();
        boolean _equals = _name.equals(_name_1);
        if (_equals) {
          String _name_2 = enumProperty.getName();
          String _plus = ("Duplicate name : " + _name_2);
          this.error(_plus, ProcessorModelPackage.Literals.ENUM_PROPERTY__NAME);
          return;
        }
      }
    }
  }
  
  @Check
  public void checkUniquePojoDao(final PojoDao pojoDao) {
    EObject _rootContainer = EcoreUtil.getRootContainer(pojoDao);
    if ((!(_rootContainer instanceof Artifacts))) {
      return;
    }
    EObject _rootContainer_1 = EcoreUtil.getRootContainer(pojoDao);
    final Artifacts artifacts = ((Artifacts) _rootContainer_1);
    EList<org.sqlproc.model.processorModel.Package> _packages = artifacts.getPackages();
    for (final org.sqlproc.model.processorModel.Package pkg : _packages) {
      boolean _notEquals = (!Objects.equal(pkg, null));
      if (_notEquals) {
        EList<AbstractPojoEntity> _elements = pkg.getElements();
        for (final AbstractPojoEntity dao : _elements) {
          boolean _and = false;
          boolean _notEquals_1 = (!Objects.equal(dao, null));
          if (!_notEquals_1) {
            _and = false;
          } else {
            _and = (dao instanceof PojoDao);
          }
          if (_and) {
            final PojoDao pdao = ((PojoDao) dao);
            boolean _notEquals_2 = (!Objects.equal(pdao, pojoDao));
            if (_notEquals_2) {
              String _name = pojoDao.getName();
              String _name_1 = pdao.getName();
              boolean _equals = _name.equals(_name_1);
              if (_equals) {
                String _name_2 = pojoDao.getName();
                String _plus = ("Duplicate name : " + _name_2);
                this.error(_plus, ProcessorModelPackage.Literals.POJO_DAO__NAME);
                return;
              }
            }
          }
        }
      }
    }
  }
}
