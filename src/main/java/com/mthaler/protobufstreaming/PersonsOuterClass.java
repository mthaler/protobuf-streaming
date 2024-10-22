// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: persons.proto

package com.mthaler.protobufstreaming;

public final class PersonsOuterClass {
  private PersonsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.mthaler.protobufstreaming.Persons)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
     */
    java.util.List<com.mthaler.protobufstreaming.PersonOuterClass.Person> 
        getPersonList();
    /**
     * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
     */
    com.mthaler.protobufstreaming.PersonOuterClass.Person getPerson(int index);
    /**
     * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
     */
    int getPersonCount();
    /**
     * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
     */
    java.util.List<? extends com.mthaler.protobufstreaming.PersonOuterClass.PersonOrBuilder> 
        getPersonOrBuilderList();
    /**
     * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
     */
    com.mthaler.protobufstreaming.PersonOuterClass.PersonOrBuilder getPersonOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code com.mthaler.protobufstreaming.Persons}
   */
  public static final class Persons extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.mthaler.protobufstreaming.Persons)
      PersonsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Persons.newBuilder() to construct.
    private Persons(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Persons() {
      person_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Persons();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Persons(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                person_ = new java.util.ArrayList<com.mthaler.protobufstreaming.PersonOuterClass.Person>();
                mutable_bitField0_ |= 0x00000001;
              }
              person_.add(
                  input.readMessage(com.mthaler.protobufstreaming.PersonOuterClass.Person.PARSER, extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          person_ = java.util.Collections.unmodifiableList(person_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mthaler.protobufstreaming.PersonsOuterClass.internal_static_com_mthaler_protobufstreaming_Persons_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mthaler.protobufstreaming.PersonsOuterClass.internal_static_com_mthaler_protobufstreaming_Persons_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mthaler.protobufstreaming.PersonsOuterClass.Persons.class, com.mthaler.protobufstreaming.PersonsOuterClass.Persons.Builder.class);
    }

    public static final int PERSON_FIELD_NUMBER = 1;
    private java.util.List<com.mthaler.protobufstreaming.PersonOuterClass.Person> person_;
    /**
     * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
     */
    @java.lang.Override
    public java.util.List<com.mthaler.protobufstreaming.PersonOuterClass.Person> getPersonList() {
      return person_;
    }
    /**
     * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mthaler.protobufstreaming.PersonOuterClass.PersonOrBuilder> 
        getPersonOrBuilderList() {
      return person_;
    }
    /**
     * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
     */
    @java.lang.Override
    public int getPersonCount() {
      return person_.size();
    }
    /**
     * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
     */
    @java.lang.Override
    public com.mthaler.protobufstreaming.PersonOuterClass.Person getPerson(int index) {
      return person_.get(index);
    }
    /**
     * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
     */
    @java.lang.Override
    public com.mthaler.protobufstreaming.PersonOuterClass.PersonOrBuilder getPersonOrBuilder(
        int index) {
      return person_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getPersonCount(); i++) {
        if (!getPerson(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < person_.size(); i++) {
        output.writeMessage(1, person_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < person_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, person_.get(i));
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
      if (!(obj instanceof com.mthaler.protobufstreaming.PersonsOuterClass.Persons)) {
        return super.equals(obj);
      }
      com.mthaler.protobufstreaming.PersonsOuterClass.Persons other = (com.mthaler.protobufstreaming.PersonsOuterClass.Persons) obj;

      if (!getPersonList()
          .equals(other.getPersonList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPersonCount() > 0) {
        hash = (37 * hash) + PERSON_FIELD_NUMBER;
        hash = (53 * hash) + getPersonList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mthaler.protobufstreaming.PersonsOuterClass.Persons prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code com.mthaler.protobufstreaming.Persons}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.mthaler.protobufstreaming.Persons)
        com.mthaler.protobufstreaming.PersonsOuterClass.PersonsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mthaler.protobufstreaming.PersonsOuterClass.internal_static_com_mthaler_protobufstreaming_Persons_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mthaler.protobufstreaming.PersonsOuterClass.internal_static_com_mthaler_protobufstreaming_Persons_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mthaler.protobufstreaming.PersonsOuterClass.Persons.class, com.mthaler.protobufstreaming.PersonsOuterClass.Persons.Builder.class);
      }

      // Construct using com.mthaler.protobufstreaming.PersonsOuterClass.Persons.newBuilder()
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
          getPersonFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (personBuilder_ == null) {
          person_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          personBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mthaler.protobufstreaming.PersonsOuterClass.internal_static_com_mthaler_protobufstreaming_Persons_descriptor;
      }

      @java.lang.Override
      public com.mthaler.protobufstreaming.PersonsOuterClass.Persons getDefaultInstanceForType() {
        return com.mthaler.protobufstreaming.PersonsOuterClass.Persons.getDefaultInstance();
      }

      @java.lang.Override
      public com.mthaler.protobufstreaming.PersonsOuterClass.Persons build() {
        com.mthaler.protobufstreaming.PersonsOuterClass.Persons result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mthaler.protobufstreaming.PersonsOuterClass.Persons buildPartial() {
        com.mthaler.protobufstreaming.PersonsOuterClass.Persons result = new com.mthaler.protobufstreaming.PersonsOuterClass.Persons(this);
        int from_bitField0_ = bitField0_;
        if (personBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            person_ = java.util.Collections.unmodifiableList(person_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.person_ = person_;
        } else {
          result.person_ = personBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mthaler.protobufstreaming.PersonsOuterClass.Persons) {
          return mergeFrom((com.mthaler.protobufstreaming.PersonsOuterClass.Persons)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mthaler.protobufstreaming.PersonsOuterClass.Persons other) {
        if (other == com.mthaler.protobufstreaming.PersonsOuterClass.Persons.getDefaultInstance()) return this;
        if (personBuilder_ == null) {
          if (!other.person_.isEmpty()) {
            if (person_.isEmpty()) {
              person_ = other.person_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePersonIsMutable();
              person_.addAll(other.person_);
            }
            onChanged();
          }
        } else {
          if (!other.person_.isEmpty()) {
            if (personBuilder_.isEmpty()) {
              personBuilder_.dispose();
              personBuilder_ = null;
              person_ = other.person_;
              bitField0_ = (bitField0_ & ~0x00000001);
              personBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPersonFieldBuilder() : null;
            } else {
              personBuilder_.addAllMessages(other.person_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getPersonCount(); i++) {
          if (!getPerson(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.mthaler.protobufstreaming.PersonsOuterClass.Persons parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.mthaler.protobufstreaming.PersonsOuterClass.Persons) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.mthaler.protobufstreaming.PersonOuterClass.Person> person_ =
        java.util.Collections.emptyList();
      private void ensurePersonIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          person_ = new java.util.ArrayList<com.mthaler.protobufstreaming.PersonOuterClass.Person>(person_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mthaler.protobufstreaming.PersonOuterClass.Person, com.mthaler.protobufstreaming.PersonOuterClass.Person.Builder, com.mthaler.protobufstreaming.PersonOuterClass.PersonOrBuilder> personBuilder_;

      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public java.util.List<com.mthaler.protobufstreaming.PersonOuterClass.Person> getPersonList() {
        if (personBuilder_ == null) {
          return java.util.Collections.unmodifiableList(person_);
        } else {
          return personBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public int getPersonCount() {
        if (personBuilder_ == null) {
          return person_.size();
        } else {
          return personBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public com.mthaler.protobufstreaming.PersonOuterClass.Person getPerson(int index) {
        if (personBuilder_ == null) {
          return person_.get(index);
        } else {
          return personBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public Builder setPerson(
          int index, com.mthaler.protobufstreaming.PersonOuterClass.Person value) {
        if (personBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePersonIsMutable();
          person_.set(index, value);
          onChanged();
        } else {
          personBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public Builder setPerson(
          int index, com.mthaler.protobufstreaming.PersonOuterClass.Person.Builder builderForValue) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.set(index, builderForValue.build());
          onChanged();
        } else {
          personBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public Builder addPerson(com.mthaler.protobufstreaming.PersonOuterClass.Person value) {
        if (personBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePersonIsMutable();
          person_.add(value);
          onChanged();
        } else {
          personBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public Builder addPerson(
          int index, com.mthaler.protobufstreaming.PersonOuterClass.Person value) {
        if (personBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePersonIsMutable();
          person_.add(index, value);
          onChanged();
        } else {
          personBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public Builder addPerson(
          com.mthaler.protobufstreaming.PersonOuterClass.Person.Builder builderForValue) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.add(builderForValue.build());
          onChanged();
        } else {
          personBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public Builder addPerson(
          int index, com.mthaler.protobufstreaming.PersonOuterClass.Person.Builder builderForValue) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.add(index, builderForValue.build());
          onChanged();
        } else {
          personBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public Builder addAllPerson(
          java.lang.Iterable<? extends com.mthaler.protobufstreaming.PersonOuterClass.Person> values) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, person_);
          onChanged();
        } else {
          personBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public Builder clearPerson() {
        if (personBuilder_ == null) {
          person_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          personBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public Builder removePerson(int index) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.remove(index);
          onChanged();
        } else {
          personBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public com.mthaler.protobufstreaming.PersonOuterClass.Person.Builder getPersonBuilder(
          int index) {
        return getPersonFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public com.mthaler.protobufstreaming.PersonOuterClass.PersonOrBuilder getPersonOrBuilder(
          int index) {
        if (personBuilder_ == null) {
          return person_.get(index);  } else {
          return personBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public java.util.List<? extends com.mthaler.protobufstreaming.PersonOuterClass.PersonOrBuilder> 
           getPersonOrBuilderList() {
        if (personBuilder_ != null) {
          return personBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(person_);
        }
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public com.mthaler.protobufstreaming.PersonOuterClass.Person.Builder addPersonBuilder() {
        return getPersonFieldBuilder().addBuilder(
            com.mthaler.protobufstreaming.PersonOuterClass.Person.getDefaultInstance());
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public com.mthaler.protobufstreaming.PersonOuterClass.Person.Builder addPersonBuilder(
          int index) {
        return getPersonFieldBuilder().addBuilder(
            index, com.mthaler.protobufstreaming.PersonOuterClass.Person.getDefaultInstance());
      }
      /**
       * <code>repeated .com.mthaler.protobufstreaming.Person person = 1;</code>
       */
      public java.util.List<com.mthaler.protobufstreaming.PersonOuterClass.Person.Builder> 
           getPersonBuilderList() {
        return getPersonFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mthaler.protobufstreaming.PersonOuterClass.Person, com.mthaler.protobufstreaming.PersonOuterClass.Person.Builder, com.mthaler.protobufstreaming.PersonOuterClass.PersonOrBuilder> 
          getPersonFieldBuilder() {
        if (personBuilder_ == null) {
          personBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mthaler.protobufstreaming.PersonOuterClass.Person, com.mthaler.protobufstreaming.PersonOuterClass.Person.Builder, com.mthaler.protobufstreaming.PersonOuterClass.PersonOrBuilder>(
                  person_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          person_ = null;
        }
        return personBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.mthaler.protobufstreaming.Persons)
    }

    // @@protoc_insertion_point(class_scope:com.mthaler.protobufstreaming.Persons)
    private static final com.mthaler.protobufstreaming.PersonsOuterClass.Persons DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mthaler.protobufstreaming.PersonsOuterClass.Persons();
    }

    public static com.mthaler.protobufstreaming.PersonsOuterClass.Persons getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Persons>
        PARSER = new com.google.protobuf.AbstractParser<Persons>() {
      @java.lang.Override
      public Persons parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Persons(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Persons> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Persons> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mthaler.protobufstreaming.PersonsOuterClass.Persons getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_mthaler_protobufstreaming_Persons_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_mthaler_protobufstreaming_Persons_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rpersons.proto\022\035com.mthaler.protobufstr" +
      "eaming\032\014person.proto\"@\n\007Persons\0225\n\006perso" +
      "n\030\001 \003(\0132%.com.mthaler.protobufstreaming." +
      "Person"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.mthaler.protobufstreaming.PersonOuterClass.getDescriptor(),
        });
    internal_static_com_mthaler_protobufstreaming_Persons_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_mthaler_protobufstreaming_Persons_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_mthaler_protobufstreaming_Persons_descriptor,
        new java.lang.String[] { "Person", });
    com.mthaler.protobufstreaming.PersonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
