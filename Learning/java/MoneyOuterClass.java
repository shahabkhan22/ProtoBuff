// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: money.proto

public final class MoneyOuterClass {
  private MoneyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MoneyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Money)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string currencyCode = 1;</code>
     */
    java.lang.String getCurrencyCode();
    /**
     * <code>string currencyCode = 1;</code>
     */
    com.google.protobuf.ByteString
        getCurrencyCodeBytes();

    /**
     * <code>int32 intAmount = 2;</code>
     */
    int getIntAmount();

    /**
     * <code>int32 decimalAmount = 3;</code>
     */
    int getDecimalAmount();
  }
  /**
   * Protobuf type {@code Money}
   */
  public  static final class Money extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Money)
      MoneyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Money.newBuilder() to construct.
    private Money(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Money() {
      currencyCode_ = "";
      intAmount_ = 0;
      decimalAmount_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Money(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              currencyCode_ = s;
              break;
            }
            case 16: {

              intAmount_ = input.readInt32();
              break;
            }
            case 24: {

              decimalAmount_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MoneyOuterClass.internal_static_Money_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MoneyOuterClass.internal_static_Money_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MoneyOuterClass.Money.class, MoneyOuterClass.Money.Builder.class);
    }

    public static final int CURRENCYCODE_FIELD_NUMBER = 1;
    private volatile java.lang.Object currencyCode_;
    /**
     * <code>string currencyCode = 1;</code>
     */
    public java.lang.String getCurrencyCode() {
      java.lang.Object ref = currencyCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currencyCode_ = s;
        return s;
      }
    }
    /**
     * <code>string currencyCode = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCurrencyCodeBytes() {
      java.lang.Object ref = currencyCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currencyCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INTAMOUNT_FIELD_NUMBER = 2;
    private int intAmount_;
    /**
     * <code>int32 intAmount = 2;</code>
     */
    public int getIntAmount() {
      return intAmount_;
    }

    public static final int DECIMALAMOUNT_FIELD_NUMBER = 3;
    private int decimalAmount_;
    /**
     * <code>int32 decimalAmount = 3;</code>
     */
    public int getDecimalAmount() {
      return decimalAmount_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getCurrencyCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, currencyCode_);
      }
      if (intAmount_ != 0) {
        output.writeInt32(2, intAmount_);
      }
      if (decimalAmount_ != 0) {
        output.writeInt32(3, decimalAmount_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getCurrencyCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, currencyCode_);
      }
      if (intAmount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, intAmount_);
      }
      if (decimalAmount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, decimalAmount_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof MoneyOuterClass.Money)) {
        return super.equals(obj);
      }
      MoneyOuterClass.Money other = (MoneyOuterClass.Money) obj;

      boolean result = true;
      result = result && getCurrencyCode()
          .equals(other.getCurrencyCode());
      result = result && (getIntAmount()
          == other.getIntAmount());
      result = result && (getDecimalAmount()
          == other.getDecimalAmount());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CURRENCYCODE_FIELD_NUMBER;
      hash = (53 * hash) + getCurrencyCode().hashCode();
      hash = (37 * hash) + INTAMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getIntAmount();
      hash = (37 * hash) + DECIMALAMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDecimalAmount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MoneyOuterClass.Money parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MoneyOuterClass.Money parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MoneyOuterClass.Money parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MoneyOuterClass.Money parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MoneyOuterClass.Money parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MoneyOuterClass.Money parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MoneyOuterClass.Money parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MoneyOuterClass.Money parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MoneyOuterClass.Money parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MoneyOuterClass.Money parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MoneyOuterClass.Money parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MoneyOuterClass.Money parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(MoneyOuterClass.Money prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Money}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Money)
        MoneyOuterClass.MoneyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MoneyOuterClass.internal_static_Money_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MoneyOuterClass.internal_static_Money_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MoneyOuterClass.Money.class, MoneyOuterClass.Money.Builder.class);
      }

      // Construct using MoneyOuterClass.Money.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        currencyCode_ = "";

        intAmount_ = 0;

        decimalAmount_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MoneyOuterClass.internal_static_Money_descriptor;
      }

      public MoneyOuterClass.Money getDefaultInstanceForType() {
        return MoneyOuterClass.Money.getDefaultInstance();
      }

      public MoneyOuterClass.Money build() {
        MoneyOuterClass.Money result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MoneyOuterClass.Money buildPartial() {
        MoneyOuterClass.Money result = new MoneyOuterClass.Money(this);
        result.currencyCode_ = currencyCode_;
        result.intAmount_ = intAmount_;
        result.decimalAmount_ = decimalAmount_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MoneyOuterClass.Money) {
          return mergeFrom((MoneyOuterClass.Money)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MoneyOuterClass.Money other) {
        if (other == MoneyOuterClass.Money.getDefaultInstance()) return this;
        if (!other.getCurrencyCode().isEmpty()) {
          currencyCode_ = other.currencyCode_;
          onChanged();
        }
        if (other.getIntAmount() != 0) {
          setIntAmount(other.getIntAmount());
        }
        if (other.getDecimalAmount() != 0) {
          setDecimalAmount(other.getDecimalAmount());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MoneyOuterClass.Money parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MoneyOuterClass.Money) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object currencyCode_ = "";
      /**
       * <code>string currencyCode = 1;</code>
       */
      public java.lang.String getCurrencyCode() {
        java.lang.Object ref = currencyCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          currencyCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string currencyCode = 1;</code>
       */
      public com.google.protobuf.ByteString
          getCurrencyCodeBytes() {
        java.lang.Object ref = currencyCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          currencyCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string currencyCode = 1;</code>
       */
      public Builder setCurrencyCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        currencyCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string currencyCode = 1;</code>
       */
      public Builder clearCurrencyCode() {
        
        currencyCode_ = getDefaultInstance().getCurrencyCode();
        onChanged();
        return this;
      }
      /**
       * <code>string currencyCode = 1;</code>
       */
      public Builder setCurrencyCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        currencyCode_ = value;
        onChanged();
        return this;
      }

      private int intAmount_ ;
      /**
       * <code>int32 intAmount = 2;</code>
       */
      public int getIntAmount() {
        return intAmount_;
      }
      /**
       * <code>int32 intAmount = 2;</code>
       */
      public Builder setIntAmount(int value) {
        
        intAmount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 intAmount = 2;</code>
       */
      public Builder clearIntAmount() {
        
        intAmount_ = 0;
        onChanged();
        return this;
      }

      private int decimalAmount_ ;
      /**
       * <code>int32 decimalAmount = 3;</code>
       */
      public int getDecimalAmount() {
        return decimalAmount_;
      }
      /**
       * <code>int32 decimalAmount = 3;</code>
       */
      public Builder setDecimalAmount(int value) {
        
        decimalAmount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 decimalAmount = 3;</code>
       */
      public Builder clearDecimalAmount() {
        
        decimalAmount_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Money)
    }

    // @@protoc_insertion_point(class_scope:Money)
    private static final MoneyOuterClass.Money DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MoneyOuterClass.Money();
    }

    public static MoneyOuterClass.Money getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Money>
        PARSER = new com.google.protobuf.AbstractParser<Money>() {
      public Money parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Money(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Money> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Money> getParserForType() {
      return PARSER;
    }

    public MoneyOuterClass.Money getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Money_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Money_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013money.proto\"G\n\005Money\022\024\n\014currencyCode\030\001" +
      " \001(\t\022\021\n\tintAmount\030\002 \001(\005\022\025\n\rdecimalAmount" +
      "\030\003 \001(\005b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Money_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Money_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Money_descriptor,
        new java.lang.String[] { "CurrencyCode", "IntAmount", "DecimalAmount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
