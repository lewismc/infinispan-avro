/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package example.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Employee extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Employee\",\"namespace\":\"example.avro\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"dateOfBirth\",\"type\":\"long\",\"default\":0},{\"name\":\"ssn\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"salary\",\"type\":\"int\",\"default\":0},{\"name\":\"boss\",\"type\":[\"null\",\"Employee\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}],\"default\":null}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String name;
  @Deprecated public long dateOfBirth;
  @Deprecated public java.lang.String ssn;
  @Deprecated public int salary;
  @Deprecated public java.lang.Object boss;

  /**
   * Default constructor.
   */
  public Employee() {}

  /**
   * All-args constructor.
   */
  public Employee(java.lang.String name, java.lang.Long dateOfBirth, java.lang.String ssn, java.lang.Integer salary, java.lang.Object boss) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.ssn = ssn;
    this.salary = salary;
    this.boss = boss;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return dateOfBirth;
    case 2: return ssn;
    case 3: return salary;
    case 4: return boss;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: dateOfBirth = (java.lang.Long)value$; break;
    case 2: ssn = (java.lang.String)value$; break;
    case 3: salary = (java.lang.Integer)value$; break;
    case 4: boss = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'dateOfBirth' field.
   */
  public java.lang.Long getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * Sets the value of the 'dateOfBirth' field.
   * @param value the value to set.
   */
  public void setDateOfBirth(java.lang.Long value) {
    this.dateOfBirth = value;
  }

  /**
   * Gets the value of the 'ssn' field.
   */
  public java.lang.String getSsn() {
    return ssn;
  }

  /**
   * Sets the value of the 'ssn' field.
   * @param value the value to set.
   */
  public void setSsn(java.lang.String value) {
    this.ssn = value;
  }

  /**
   * Gets the value of the 'salary' field.
   */
  public java.lang.Integer getSalary() {
    return salary;
  }

  /**
   * Sets the value of the 'salary' field.
   * @param value the value to set.
   */
  public void setSalary(java.lang.Integer value) {
    this.salary = value;
  }

  /**
   * Gets the value of the 'boss' field.
   */
  public java.lang.Object getBoss() {
    return boss;
  }

  /**
   * Sets the value of the 'boss' field.
   * @param value the value to set.
   */
  public void setBoss(java.lang.Object value) {
    this.boss = value;
  }

  /** Creates a new Employee RecordBuilder */
  public static example.avro.Employee.Builder newBuilder() {
    return new example.avro.Employee.Builder();
  }
  
  /** Creates a new Employee RecordBuilder by copying an existing Builder */
  public static example.avro.Employee.Builder newBuilder(example.avro.Employee.Builder other) {
    return new example.avro.Employee.Builder(other);
  }
  
  /** Creates a new Employee RecordBuilder by copying an existing Employee instance */
  public static example.avro.Employee.Builder newBuilder(example.avro.Employee other) {
    return new example.avro.Employee.Builder(other);
  }
  
  /**
   * RecordBuilder for Employee instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Employee>
    implements org.apache.avro.data.RecordBuilder<Employee> {

    private java.lang.String name;
    private long dateOfBirth;
    private java.lang.String ssn;
    private int salary;
    private java.lang.Object boss;

    /** Creates a new Builder */
    private Builder() {
      super(example.avro.Employee.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(example.avro.Employee.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Employee instance */
    private Builder(example.avro.Employee other) {
            super(example.avro.Employee.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.dateOfBirth)) {
        this.dateOfBirth = data().deepCopy(fields()[1].schema(), other.dateOfBirth);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ssn)) {
        this.ssn = data().deepCopy(fields()[2].schema(), other.ssn);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.salary)) {
        this.salary = data().deepCopy(fields()[3].schema(), other.salary);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.boss)) {
        this.boss = data().deepCopy(fields()[4].schema(), other.boss);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public example.avro.Employee.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public example.avro.Employee.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'dateOfBirth' field */
    public java.lang.Long getDateOfBirth() {
      return dateOfBirth;
    }
    
    /** Sets the value of the 'dateOfBirth' field */
    public example.avro.Employee.Builder setDateOfBirth(long value) {
      validate(fields()[1], value);
      this.dateOfBirth = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'dateOfBirth' field has been set */
    public boolean hasDateOfBirth() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'dateOfBirth' field */
    public example.avro.Employee.Builder clearDateOfBirth() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'ssn' field */
    public java.lang.String getSsn() {
      return ssn;
    }
    
    /** Sets the value of the 'ssn' field */
    public example.avro.Employee.Builder setSsn(java.lang.String value) {
      validate(fields()[2], value);
      this.ssn = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'ssn' field has been set */
    public boolean hasSsn() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'ssn' field */
    public example.avro.Employee.Builder clearSsn() {
      ssn = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'salary' field */
    public java.lang.Integer getSalary() {
      return salary;
    }
    
    /** Sets the value of the 'salary' field */
    public example.avro.Employee.Builder setSalary(int value) {
      validate(fields()[3], value);
      this.salary = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'salary' field has been set */
    public boolean hasSalary() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'salary' field */
    public example.avro.Employee.Builder clearSalary() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'boss' field */
    public java.lang.Object getBoss() {
      return boss;
    }
    
    /** Sets the value of the 'boss' field */
    public example.avro.Employee.Builder setBoss(java.lang.Object value) {
      validate(fields()[4], value);
      this.boss = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'boss' field has been set */
    public boolean hasBoss() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'boss' field */
    public example.avro.Employee.Builder clearBoss() {
      boss = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Employee build() {
      try {
        Employee record = new Employee();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.dateOfBirth = fieldSetFlags()[1] ? this.dateOfBirth : (java.lang.Long) defaultValue(fields()[1]);
        record.ssn = fieldSetFlags()[2] ? this.ssn : (java.lang.String) defaultValue(fields()[2]);
        record.salary = fieldSetFlags()[3] ? this.salary : (java.lang.Integer) defaultValue(fields()[3]);
        record.boss = fieldSetFlags()[4] ? this.boss : (java.lang.Object) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
