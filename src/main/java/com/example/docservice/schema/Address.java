/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.docservice.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Address extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8080038993223828411L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Address\",\"namespace\":\"com.example.docservice.schema\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"country\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"city\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"streetName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"streetNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"postCode\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Address> ENCODER =
      new BinaryMessageEncoder<Address>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Address> DECODER =
      new BinaryMessageDecoder<Address>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Address> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Address> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Address> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Address>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Address to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Address from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Address instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Address fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence id;
  private java.lang.CharSequence country;
  private java.lang.CharSequence city;
  private java.lang.CharSequence streetName;
  private java.lang.CharSequence streetNumber;
  private java.lang.CharSequence postCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Address() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param country The new value for country
   * @param city The new value for city
   * @param streetName The new value for streetName
   * @param streetNumber The new value for streetNumber
   * @param postCode The new value for postCode
   */
  public Address(java.lang.CharSequence id, java.lang.CharSequence country, java.lang.CharSequence city, java.lang.CharSequence streetName, java.lang.CharSequence streetNumber, java.lang.CharSequence postCode) {
    this.id = id;
    this.country = country;
    this.city = city;
    this.streetName = streetName;
    this.streetNumber = streetNumber;
    this.postCode = postCode;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return country;
    case 2: return city;
    case 3: return streetName;
    case 4: return streetNumber;
    case 5: return postCode;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: country = (java.lang.CharSequence)value$; break;
    case 2: city = (java.lang.CharSequence)value$; break;
    case 3: streetName = (java.lang.CharSequence)value$; break;
    case 4: streetNumber = (java.lang.CharSequence)value$; break;
    case 5: postCode = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'country' field.
   * @return The value of the 'country' field.
   */
  public java.lang.CharSequence getCountry() {
    return country;
  }


  /**
   * Sets the value of the 'country' field.
   * @param value the value to set.
   */
  public void setCountry(java.lang.CharSequence value) {
    this.country = value;
  }

  /**
   * Gets the value of the 'city' field.
   * @return The value of the 'city' field.
   */
  public java.lang.CharSequence getCity() {
    return city;
  }


  /**
   * Sets the value of the 'city' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.city = value;
  }

  /**
   * Gets the value of the 'streetName' field.
   * @return The value of the 'streetName' field.
   */
  public java.lang.CharSequence getStreetName() {
    return streetName;
  }


  /**
   * Sets the value of the 'streetName' field.
   * @param value the value to set.
   */
  public void setStreetName(java.lang.CharSequence value) {
    this.streetName = value;
  }

  /**
   * Gets the value of the 'streetNumber' field.
   * @return The value of the 'streetNumber' field.
   */
  public java.lang.CharSequence getStreetNumber() {
    return streetNumber;
  }


  /**
   * Sets the value of the 'streetNumber' field.
   * @param value the value to set.
   */
  public void setStreetNumber(java.lang.CharSequence value) {
    this.streetNumber = value;
  }

  /**
   * Gets the value of the 'postCode' field.
   * @return The value of the 'postCode' field.
   */
  public java.lang.CharSequence getPostCode() {
    return postCode;
  }


  /**
   * Sets the value of the 'postCode' field.
   * @param value the value to set.
   */
  public void setPostCode(java.lang.CharSequence value) {
    this.postCode = value;
  }

  /**
   * Creates a new Address RecordBuilder.
   * @return A new Address RecordBuilder
   */
  public static com.example.docservice.schema.Address.Builder newBuilder() {
    return new com.example.docservice.schema.Address.Builder();
  }

  /**
   * Creates a new Address RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Address RecordBuilder
   */
  public static com.example.docservice.schema.Address.Builder newBuilder(com.example.docservice.schema.Address.Builder other) {
    if (other == null) {
      return new com.example.docservice.schema.Address.Builder();
    } else {
      return new com.example.docservice.schema.Address.Builder(other);
    }
  }

  /**
   * Creates a new Address RecordBuilder by copying an existing Address instance.
   * @param other The existing instance to copy.
   * @return A new Address RecordBuilder
   */
  public static com.example.docservice.schema.Address.Builder newBuilder(com.example.docservice.schema.Address other) {
    if (other == null) {
      return new com.example.docservice.schema.Address.Builder();
    } else {
      return new com.example.docservice.schema.Address.Builder(other);
    }
  }

  /**
   * RecordBuilder for Address instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Address>
    implements org.apache.avro.data.RecordBuilder<Address> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence country;
    private java.lang.CharSequence city;
    private java.lang.CharSequence streetName;
    private java.lang.CharSequence streetNumber;
    private java.lang.CharSequence postCode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.docservice.schema.Address.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.country)) {
        this.country = data().deepCopy(fields()[1].schema(), other.country);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.city)) {
        this.city = data().deepCopy(fields()[2].schema(), other.city);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.streetName)) {
        this.streetName = data().deepCopy(fields()[3].schema(), other.streetName);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.streetNumber)) {
        this.streetNumber = data().deepCopy(fields()[4].schema(), other.streetNumber);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.postCode)) {
        this.postCode = data().deepCopy(fields()[5].schema(), other.postCode);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing Address instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.docservice.schema.Address other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.country)) {
        this.country = data().deepCopy(fields()[1].schema(), other.country);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.city)) {
        this.city = data().deepCopy(fields()[2].schema(), other.city);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.streetName)) {
        this.streetName = data().deepCopy(fields()[3].schema(), other.streetName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.streetNumber)) {
        this.streetNumber = data().deepCopy(fields()[4].schema(), other.streetNumber);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.postCode)) {
        this.postCode = data().deepCopy(fields()[5].schema(), other.postCode);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'country' field.
      * @return The value.
      */
    public java.lang.CharSequence getCountry() {
      return country;
    }


    /**
      * Sets the value of the 'country' field.
      * @param value The value of 'country'.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder setCountry(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.country = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'country' field has been set.
      * @return True if the 'country' field has been set, false otherwise.
      */
    public boolean hasCountry() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'country' field.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder clearCountry() {
      country = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * @return The value.
      */
    public java.lang.CharSequence getCity() {
      return city;
    }


    /**
      * Sets the value of the 'city' field.
      * @param value The value of 'city'.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.city = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder clearCity() {
      city = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'streetName' field.
      * @return The value.
      */
    public java.lang.CharSequence getStreetName() {
      return streetName;
    }


    /**
      * Sets the value of the 'streetName' field.
      * @param value The value of 'streetName'.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder setStreetName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.streetName = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'streetName' field has been set.
      * @return True if the 'streetName' field has been set, false otherwise.
      */
    public boolean hasStreetName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'streetName' field.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder clearStreetName() {
      streetName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'streetNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getStreetNumber() {
      return streetNumber;
    }


    /**
      * Sets the value of the 'streetNumber' field.
      * @param value The value of 'streetNumber'.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder setStreetNumber(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.streetNumber = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'streetNumber' field has been set.
      * @return True if the 'streetNumber' field has been set, false otherwise.
      */
    public boolean hasStreetNumber() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'streetNumber' field.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder clearStreetNumber() {
      streetNumber = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'postCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getPostCode() {
      return postCode;
    }


    /**
      * Sets the value of the 'postCode' field.
      * @param value The value of 'postCode'.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder setPostCode(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.postCode = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'postCode' field has been set.
      * @return True if the 'postCode' field has been set, false otherwise.
      */
    public boolean hasPostCode() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'postCode' field.
      * @return This builder.
      */
    public com.example.docservice.schema.Address.Builder clearPostCode() {
      postCode = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Address build() {
      try {
        Address record = new Address();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.country = fieldSetFlags()[1] ? this.country : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.city = fieldSetFlags()[2] ? this.city : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.streetName = fieldSetFlags()[3] ? this.streetName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.streetNumber = fieldSetFlags()[4] ? this.streetNumber : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.postCode = fieldSetFlags()[5] ? this.postCode : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Address>
    WRITER$ = (org.apache.avro.io.DatumWriter<Address>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Address>
    READER$ = (org.apache.avro.io.DatumReader<Address>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.id);
    }

    if (this.country == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.country);
    }

    if (this.city == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.city);
    }

    if (this.streetName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.streetName);
    }

    if (this.streetNumber == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.streetNumber);
    }

    if (this.postCode == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.postCode);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.country = null;
      } else {
        this.country = in.readString(this.country instanceof Utf8 ? (Utf8)this.country : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.city = null;
      } else {
        this.city = in.readString(this.city instanceof Utf8 ? (Utf8)this.city : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.streetName = null;
      } else {
        this.streetName = in.readString(this.streetName instanceof Utf8 ? (Utf8)this.streetName : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.streetNumber = null;
      } else {
        this.streetNumber = in.readString(this.streetNumber instanceof Utf8 ? (Utf8)this.streetNumber : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.postCode = null;
      } else {
        this.postCode = in.readString(this.postCode instanceof Utf8 ? (Utf8)this.postCode : null);
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.country = null;
          } else {
            this.country = in.readString(this.country instanceof Utf8 ? (Utf8)this.country : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.city = null;
          } else {
            this.city = in.readString(this.city instanceof Utf8 ? (Utf8)this.city : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.streetName = null;
          } else {
            this.streetName = in.readString(this.streetName instanceof Utf8 ? (Utf8)this.streetName : null);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.streetNumber = null;
          } else {
            this.streetNumber = in.readString(this.streetNumber instanceof Utf8 ? (Utf8)this.streetNumber : null);
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.postCode = null;
          } else {
            this.postCode = in.readString(this.postCode instanceof Utf8 ? (Utf8)this.postCode : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










