// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGOperationReroll.proto

package emu.grasscutter.net.proto;

public final class GCGOperationRerollOuterClass {
  private GCGOperationRerollOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGOperationRerollOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGOperationReroll)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 dice_index_list = 7;</code>
     * @return A list containing the diceIndexList.
     */
    java.util.List<java.lang.Integer> getDiceIndexListList();
    /**
     * <code>repeated uint32 dice_index_list = 7;</code>
     * @return The count of diceIndexList.
     */
    int getDiceIndexListCount();
    /**
     * <code>repeated uint32 dice_index_list = 7;</code>
     * @param index The index of the element to return.
     * @return The diceIndexList at the given index.
     */
    int getDiceIndexList(int index);
  }
  /**
   * <pre>
   * Obf: FCANKDPKMLF
   * </pre>
   *
   * Protobuf type {@code GCGOperationReroll}
   */
  public static final class GCGOperationReroll extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGOperationReroll)
      GCGOperationRerollOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGOperationReroll.newBuilder() to construct.
    private GCGOperationReroll(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGOperationReroll() {
      diceIndexList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGOperationReroll();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGOperationReroll(
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
            case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                diceIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              diceIndexList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                diceIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                diceIndexList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          diceIndexList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGOperationRerollOuterClass.internal_static_GCGOperationReroll_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGOperationRerollOuterClass.internal_static_GCGOperationReroll_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll.class, emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll.Builder.class);
    }

    public static final int DICE_INDEX_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList diceIndexList_;
    /**
     * <code>repeated uint32 dice_index_list = 7;</code>
     * @return A list containing the diceIndexList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDiceIndexListList() {
      return diceIndexList_;
    }
    /**
     * <code>repeated uint32 dice_index_list = 7;</code>
     * @return The count of diceIndexList.
     */
    public int getDiceIndexListCount() {
      return diceIndexList_.size();
    }
    /**
     * <code>repeated uint32 dice_index_list = 7;</code>
     * @param index The index of the element to return.
     * @return The diceIndexList at the given index.
     */
    public int getDiceIndexList(int index) {
      return diceIndexList_.getInt(index);
    }
    private int diceIndexListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getDiceIndexListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(diceIndexListMemoizedSerializedSize);
      }
      for (int i = 0; i < diceIndexList_.size(); i++) {
        output.writeUInt32NoTag(diceIndexList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < diceIndexList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(diceIndexList_.getInt(i));
        }
        size += dataSize;
        if (!getDiceIndexListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        diceIndexListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll other = (emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll) obj;

      if (!getDiceIndexListList()
          .equals(other.getDiceIndexListList())) return false;
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
      if (getDiceIndexListCount() > 0) {
        hash = (37 * hash) + DICE_INDEX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDiceIndexListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll prototype) {
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
     * <pre>
     * Obf: FCANKDPKMLF
     * </pre>
     *
     * Protobuf type {@code GCGOperationReroll}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGOperationReroll)
        emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationRerollOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGOperationRerollOuterClass.internal_static_GCGOperationReroll_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGOperationRerollOuterClass.internal_static_GCGOperationReroll_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll.class, emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        diceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGOperationRerollOuterClass.internal_static_GCGOperationReroll_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll build() {
        emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll buildPartial() {
        emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll result = new emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          diceIndexList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.diceIndexList_ = diceIndexList_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll) {
          return mergeFrom((emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll other) {
        if (other == emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll.getDefaultInstance()) return this;
        if (!other.diceIndexList_.isEmpty()) {
          if (diceIndexList_.isEmpty()) {
            diceIndexList_ = other.diceIndexList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDiceIndexListIsMutable();
            diceIndexList_.addAll(other.diceIndexList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList diceIndexList_ = emptyIntList();
      private void ensureDiceIndexListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          diceIndexList_ = mutableCopy(diceIndexList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 dice_index_list = 7;</code>
       * @return A list containing the diceIndexList.
       */
      public java.util.List<java.lang.Integer>
          getDiceIndexListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(diceIndexList_) : diceIndexList_;
      }
      /**
       * <code>repeated uint32 dice_index_list = 7;</code>
       * @return The count of diceIndexList.
       */
      public int getDiceIndexListCount() {
        return diceIndexList_.size();
      }
      /**
       * <code>repeated uint32 dice_index_list = 7;</code>
       * @param index The index of the element to return.
       * @return The diceIndexList at the given index.
       */
      public int getDiceIndexList(int index) {
        return diceIndexList_.getInt(index);
      }
      /**
       * <code>repeated uint32 dice_index_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The diceIndexList to set.
       * @return This builder for chaining.
       */
      public Builder setDiceIndexList(
          int index, int value) {
        ensureDiceIndexListIsMutable();
        diceIndexList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 dice_index_list = 7;</code>
       * @param value The diceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addDiceIndexList(int value) {
        ensureDiceIndexListIsMutable();
        diceIndexList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 dice_index_list = 7;</code>
       * @param values The diceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDiceIndexList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDiceIndexListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, diceIndexList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 dice_index_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDiceIndexList() {
        diceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:GCGOperationReroll)
    }

    // @@protoc_insertion_point(class_scope:GCGOperationReroll)
    private static final emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll();
    }

    public static emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGOperationReroll>
        PARSER = new com.google.protobuf.AbstractParser<GCGOperationReroll>() {
      @java.lang.Override
      public GCGOperationReroll parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGOperationReroll(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGOperationReroll> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGOperationReroll> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGOperationRerollOuterClass.GCGOperationReroll getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGOperationReroll_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGOperationReroll_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGOperationReroll.proto\"-\n\022GCGOperati" +
      "onReroll\022\027\n\017dice_index_list\030\007 \003(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGOperationReroll_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGOperationReroll_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGOperationReroll_descriptor,
        new java.lang.String[] { "DiceIndexList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
