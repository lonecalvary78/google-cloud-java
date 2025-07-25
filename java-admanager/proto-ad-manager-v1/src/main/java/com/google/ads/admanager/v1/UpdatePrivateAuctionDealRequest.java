/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/admanager/v1/private_auction_deal_service.proto

// Protobuf Java Version: 3.25.8
package com.google.ads.admanager.v1;

/**
 *
 *
 * <pre>
 * Request object for `UpdatePrivateAuctionDeal` method.
 * </pre>
 *
 * Protobuf type {@code google.ads.admanager.v1.UpdatePrivateAuctionDealRequest}
 */
public final class UpdatePrivateAuctionDealRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.ads.admanager.v1.UpdatePrivateAuctionDealRequest)
    UpdatePrivateAuctionDealRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdatePrivateAuctionDealRequest.newBuilder() to construct.
  private UpdatePrivateAuctionDealRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdatePrivateAuctionDealRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdatePrivateAuctionDealRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.ads.admanager.v1.PrivateAuctionDealServiceProto
        .internal_static_google_ads_admanager_v1_UpdatePrivateAuctionDealRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.admanager.v1.PrivateAuctionDealServiceProto
        .internal_static_google_ads_admanager_v1_UpdatePrivateAuctionDealRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest.class,
            com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PRIVATE_AUCTION_DEAL_FIELD_NUMBER = 1;
  private com.google.ads.admanager.v1.PrivateAuctionDeal privateAuctionDeal_;

  /**
   *
   *
   * <pre>
   * Required. The `PrivateAuctionDeal` to update.
   *
   * The `PrivateAuctionDeal`'s `name` is used to identify the
   * `PrivateAuctionDeal` to update.
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the privateAuctionDeal field is set.
   */
  @java.lang.Override
  public boolean hasPrivateAuctionDeal() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The `PrivateAuctionDeal` to update.
   *
   * The `PrivateAuctionDeal`'s `name` is used to identify the
   * `PrivateAuctionDeal` to update.
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The privateAuctionDeal.
   */
  @java.lang.Override
  public com.google.ads.admanager.v1.PrivateAuctionDeal getPrivateAuctionDeal() {
    return privateAuctionDeal_ == null
        ? com.google.ads.admanager.v1.PrivateAuctionDeal.getDefaultInstance()
        : privateAuctionDeal_;
  }

  /**
   *
   *
   * <pre>
   * Required. The `PrivateAuctionDeal` to update.
   *
   * The `PrivateAuctionDeal`'s `name` is used to identify the
   * `PrivateAuctionDeal` to update.
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.ads.admanager.v1.PrivateAuctionDealOrBuilder getPrivateAuctionDealOrBuilder() {
    return privateAuctionDeal_ == null
        ? com.google.ads.admanager.v1.PrivateAuctionDeal.getDefaultInstance()
        : privateAuctionDeal_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;

  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getPrivateAuctionDeal());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPrivateAuctionDeal());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest)) {
      return super.equals(obj);
    }
    com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest other =
        (com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest) obj;

    if (hasPrivateAuctionDeal() != other.hasPrivateAuctionDeal()) return false;
    if (hasPrivateAuctionDeal()) {
      if (!getPrivateAuctionDeal().equals(other.getPrivateAuctionDeal())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPrivateAuctionDeal()) {
      hash = (37 * hash) + PRIVATE_AUCTION_DEAL_FIELD_NUMBER;
      hash = (53 * hash) + getPrivateAuctionDeal().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * Request object for `UpdatePrivateAuctionDeal` method.
   * </pre>
   *
   * Protobuf type {@code google.ads.admanager.v1.UpdatePrivateAuctionDealRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.ads.admanager.v1.UpdatePrivateAuctionDealRequest)
      com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.ads.admanager.v1.PrivateAuctionDealServiceProto
          .internal_static_google_ads_admanager_v1_UpdatePrivateAuctionDealRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.admanager.v1.PrivateAuctionDealServiceProto
          .internal_static_google_ads_admanager_v1_UpdatePrivateAuctionDealRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest.class,
              com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest.Builder.class);
    }

    // Construct using com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPrivateAuctionDealFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      privateAuctionDeal_ = null;
      if (privateAuctionDealBuilder_ != null) {
        privateAuctionDealBuilder_.dispose();
        privateAuctionDealBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.ads.admanager.v1.PrivateAuctionDealServiceProto
          .internal_static_google_ads_admanager_v1_UpdatePrivateAuctionDealRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest getDefaultInstanceForType() {
      return com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest build() {
      com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest buildPartial() {
      com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest result =
          new com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.privateAuctionDeal_ =
            privateAuctionDealBuilder_ == null
                ? privateAuctionDeal_
                : privateAuctionDealBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest) {
        return mergeFrom((com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest other) {
      if (other == com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest.getDefaultInstance())
        return this;
      if (other.hasPrivateAuctionDeal()) {
        mergePrivateAuctionDeal(other.getPrivateAuctionDeal());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(
                    getPrivateAuctionDealFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.ads.admanager.v1.PrivateAuctionDeal privateAuctionDeal_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.admanager.v1.PrivateAuctionDeal,
            com.google.ads.admanager.v1.PrivateAuctionDeal.Builder,
            com.google.ads.admanager.v1.PrivateAuctionDealOrBuilder>
        privateAuctionDealBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The `PrivateAuctionDeal` to update.
     *
     * The `PrivateAuctionDeal`'s `name` is used to identify the
     * `PrivateAuctionDeal` to update.
     * </pre>
     *
     * <code>
     * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the privateAuctionDeal field is set.
     */
    public boolean hasPrivateAuctionDeal() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The `PrivateAuctionDeal` to update.
     *
     * The `PrivateAuctionDeal`'s `name` is used to identify the
     * `PrivateAuctionDeal` to update.
     * </pre>
     *
     * <code>
     * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The privateAuctionDeal.
     */
    public com.google.ads.admanager.v1.PrivateAuctionDeal getPrivateAuctionDeal() {
      if (privateAuctionDealBuilder_ == null) {
        return privateAuctionDeal_ == null
            ? com.google.ads.admanager.v1.PrivateAuctionDeal.getDefaultInstance()
            : privateAuctionDeal_;
      } else {
        return privateAuctionDealBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The `PrivateAuctionDeal` to update.
     *
     * The `PrivateAuctionDeal`'s `name` is used to identify the
     * `PrivateAuctionDeal` to update.
     * </pre>
     *
     * <code>
     * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPrivateAuctionDeal(com.google.ads.admanager.v1.PrivateAuctionDeal value) {
      if (privateAuctionDealBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        privateAuctionDeal_ = value;
      } else {
        privateAuctionDealBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The `PrivateAuctionDeal` to update.
     *
     * The `PrivateAuctionDeal`'s `name` is used to identify the
     * `PrivateAuctionDeal` to update.
     * </pre>
     *
     * <code>
     * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPrivateAuctionDeal(
        com.google.ads.admanager.v1.PrivateAuctionDeal.Builder builderForValue) {
      if (privateAuctionDealBuilder_ == null) {
        privateAuctionDeal_ = builderForValue.build();
      } else {
        privateAuctionDealBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The `PrivateAuctionDeal` to update.
     *
     * The `PrivateAuctionDeal`'s `name` is used to identify the
     * `PrivateAuctionDeal` to update.
     * </pre>
     *
     * <code>
     * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePrivateAuctionDeal(com.google.ads.admanager.v1.PrivateAuctionDeal value) {
      if (privateAuctionDealBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && privateAuctionDeal_ != null
            && privateAuctionDeal_
                != com.google.ads.admanager.v1.PrivateAuctionDeal.getDefaultInstance()) {
          getPrivateAuctionDealBuilder().mergeFrom(value);
        } else {
          privateAuctionDeal_ = value;
        }
      } else {
        privateAuctionDealBuilder_.mergeFrom(value);
      }
      if (privateAuctionDeal_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The `PrivateAuctionDeal` to update.
     *
     * The `PrivateAuctionDeal`'s `name` is used to identify the
     * `PrivateAuctionDeal` to update.
     * </pre>
     *
     * <code>
     * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPrivateAuctionDeal() {
      bitField0_ = (bitField0_ & ~0x00000001);
      privateAuctionDeal_ = null;
      if (privateAuctionDealBuilder_ != null) {
        privateAuctionDealBuilder_.dispose();
        privateAuctionDealBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The `PrivateAuctionDeal` to update.
     *
     * The `PrivateAuctionDeal`'s `name` is used to identify the
     * `PrivateAuctionDeal` to update.
     * </pre>
     *
     * <code>
     * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.ads.admanager.v1.PrivateAuctionDeal.Builder getPrivateAuctionDealBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPrivateAuctionDealFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The `PrivateAuctionDeal` to update.
     *
     * The `PrivateAuctionDeal`'s `name` is used to identify the
     * `PrivateAuctionDeal` to update.
     * </pre>
     *
     * <code>
     * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.ads.admanager.v1.PrivateAuctionDealOrBuilder
        getPrivateAuctionDealOrBuilder() {
      if (privateAuctionDealBuilder_ != null) {
        return privateAuctionDealBuilder_.getMessageOrBuilder();
      } else {
        return privateAuctionDeal_ == null
            ? com.google.ads.admanager.v1.PrivateAuctionDeal.getDefaultInstance()
            : privateAuctionDeal_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The `PrivateAuctionDeal` to update.
     *
     * The `PrivateAuctionDeal`'s `name` is used to identify the
     * `PrivateAuctionDeal` to update.
     * </pre>
     *
     * <code>
     * .google.ads.admanager.v1.PrivateAuctionDeal private_auction_deal = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.admanager.v1.PrivateAuctionDeal,
            com.google.ads.admanager.v1.PrivateAuctionDeal.Builder,
            com.google.ads.admanager.v1.PrivateAuctionDealOrBuilder>
        getPrivateAuctionDealFieldBuilder() {
      if (privateAuctionDealBuilder_ == null) {
        privateAuctionDealBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.ads.admanager.v1.PrivateAuctionDeal,
                com.google.ads.admanager.v1.PrivateAuctionDeal.Builder,
                com.google.ads.admanager.v1.PrivateAuctionDealOrBuilder>(
                getPrivateAuctionDeal(), getParentForChildren(), isClean());
        privateAuctionDeal_ = null;
      }
      return privateAuctionDealBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.ads.admanager.v1.UpdatePrivateAuctionDealRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.admanager.v1.UpdatePrivateAuctionDealRequest)
  private static final com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest();
  }

  public static com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePrivateAuctionDealRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdatePrivateAuctionDealRequest>() {
        @java.lang.Override
        public UpdatePrivateAuctionDealRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdatePrivateAuctionDealRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePrivateAuctionDealRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.admanager.v1.UpdatePrivateAuctionDealRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
