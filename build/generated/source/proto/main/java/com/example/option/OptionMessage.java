// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: option_example.proto

package com.example.option;

/**
 * Protobuf type {@code example.simple.OptionMessage}
 */
public  final class OptionMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:example.simple.OptionMessage)
    OptionMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OptionMessage.newBuilder() to construct.
  private OptionMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OptionMessage() {
    id_ = 0;
    isSimple_ = false;
    name_ = "";
    sampleList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.option.OptionExample.internal_static_example_simple_OptionMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.option.OptionExample.internal_static_example_simple_OptionMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.option.OptionMessage.class, com.example.option.OptionMessage.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int IS_SIMPLE_FIELD_NUMBER = 2;
  private boolean isSimple_;
  /**
   * <code>bool is_simple = 2;</code>
   */
  public boolean getIsSimple() {
    return isSimple_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 3;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SAMPLE_LIST_FIELD_NUMBER = 4;
  private java.util.List<java.lang.Integer> sampleList_;
  /**
   * <code>repeated int32 sample_list = 4;</code>
   */
  public java.util.List<java.lang.Integer>
      getSampleListList() {
    return sampleList_;
  }
  /**
   * <code>repeated int32 sample_list = 4;</code>
   */
  public int getSampleListCount() {
    return sampleList_.size();
  }
  /**
   * <code>repeated int32 sample_list = 4;</code>
   */
  public int getSampleList(int index) {
    return sampleList_.get(index);
  }

  public static com.example.option.OptionMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.option.OptionMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.option.OptionMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.option.OptionMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.option.OptionMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.option.OptionMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.option.OptionMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.option.OptionMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.option.OptionMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.option.OptionMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.option.OptionMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.option.OptionMessage parseFrom(
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
  public static Builder newBuilder(com.example.option.OptionMessage prototype) {
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
   * Protobuf type {@code example.simple.OptionMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:example.simple.OptionMessage)
      com.example.option.OptionMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.option.OptionExample.internal_static_example_simple_OptionMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.option.OptionExample.internal_static_example_simple_OptionMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.option.OptionMessage.class, com.example.option.OptionMessage.Builder.class);
    }

    // Construct using com.example.option.OptionMessage.newBuilder()
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
      id_ = 0;

      isSimple_ = false;

      name_ = "";

      sampleList_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.option.OptionExample.internal_static_example_simple_OptionMessage_descriptor;
    }

    public com.example.option.OptionMessage getDefaultInstanceForType() {
      return com.example.option.OptionMessage.getDefaultInstance();
    }

    public com.example.option.OptionMessage build() {
      com.example.option.OptionMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.option.OptionMessage buildPartial() {
      com.example.option.OptionMessage result = new com.example.option.OptionMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.isSimple_ = isSimple_;
      result.name_ = name_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        sampleList_ = java.util.Collections.unmodifiableList(sampleList_);
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.sampleList_ = sampleList_;
      result.bitField0_ = to_bitField0_;
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
    private int bitField0_;

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private boolean isSimple_ ;
    /**
     * <code>bool is_simple = 2;</code>
     */
    public boolean getIsSimple() {
      return isSimple_;
    }
    /**
     * <code>bool is_simple = 2;</code>
     */
    public Builder setIsSimple(boolean value) {
      
      isSimple_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_simple = 2;</code>
     */
    public Builder clearIsSimple() {
      
      isSimple_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> sampleList_ = java.util.Collections.emptyList();
    private void ensureSampleListIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        sampleList_ = new java.util.ArrayList<java.lang.Integer>(sampleList_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     */
    public java.util.List<java.lang.Integer>
        getSampleListList() {
      return java.util.Collections.unmodifiableList(sampleList_);
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     */
    public int getSampleListCount() {
      return sampleList_.size();
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     */
    public int getSampleList(int index) {
      return sampleList_.get(index);
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     */
    public Builder setSampleList(
        int index, int value) {
      ensureSampleListIsMutable();
      sampleList_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     */
    public Builder addSampleList(int value) {
      ensureSampleListIsMutable();
      sampleList_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     */
    public Builder addAllSampleList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureSampleListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, sampleList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     */
    public Builder clearSampleList() {
      sampleList_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
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


    // @@protoc_insertion_point(builder_scope:example.simple.OptionMessage)
  }

  // @@protoc_insertion_point(class_scope:example.simple.OptionMessage)
  private static final com.example.option.OptionMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.option.OptionMessage();
  }

  public static com.example.option.OptionMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OptionMessage>
      PARSER = new com.google.protobuf.AbstractParser<OptionMessage>() {
    public OptionMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<OptionMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OptionMessage> getParserForType() {
    return PARSER;
  }

  public com.example.option.OptionMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

