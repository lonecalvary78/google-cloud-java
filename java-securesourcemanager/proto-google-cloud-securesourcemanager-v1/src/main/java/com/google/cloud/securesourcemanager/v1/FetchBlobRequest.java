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
// source: google/cloud/securesourcemanager/v1/secure_source_manager.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securesourcemanager.v1;

/**
 *
 *
 * <pre>
 * Request message for fetching a blob (file content) from a repository.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securesourcemanager.v1.FetchBlobRequest}
 */
public final class FetchBlobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securesourcemanager.v1.FetchBlobRequest)
    FetchBlobRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use FetchBlobRequest.newBuilder() to construct.
  private FetchBlobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FetchBlobRequest() {
    repository_ = "";
    sha_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FetchBlobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securesourcemanager.v1.SecureSourceManagerProto
        .internal_static_google_cloud_securesourcemanager_v1_FetchBlobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securesourcemanager.v1.SecureSourceManagerProto
        .internal_static_google_cloud_securesourcemanager_v1_FetchBlobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securesourcemanager.v1.FetchBlobRequest.class,
            com.google.cloud.securesourcemanager.v1.FetchBlobRequest.Builder.class);
  }

  public static final int REPOSITORY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object repository_ = "";

  /**
   *
   *
   * <pre>
   * Required. The format is
   * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
   * Specifies the repository containing the blob.
   * </pre>
   *
   * <code>
   * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The repository.
   */
  @java.lang.Override
  public java.lang.String getRepository() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repository_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The format is
   * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
   * Specifies the repository containing the blob.
   * </pre>
   *
   * <code>
   * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for repository.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRepositoryBytes() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      repository_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHA_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sha_ = "";

  /**
   *
   *
   * <pre>
   * Required. The SHA-1 hash of the blob to retrieve.
   * </pre>
   *
   * <code>string sha = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sha.
   */
  @java.lang.Override
  public java.lang.String getSha() {
    java.lang.Object ref = sha_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sha_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The SHA-1 hash of the blob to retrieve.
   * </pre>
   *
   * <code>string sha = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for sha.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getShaBytes() {
    java.lang.Object ref = sha_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sha_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repository_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, repository_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sha_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sha_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repository_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, repository_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sha_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sha_);
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
    if (!(obj instanceof com.google.cloud.securesourcemanager.v1.FetchBlobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securesourcemanager.v1.FetchBlobRequest other =
        (com.google.cloud.securesourcemanager.v1.FetchBlobRequest) obj;

    if (!getRepository().equals(other.getRepository())) return false;
    if (!getSha().equals(other.getSha())) return false;
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
    hash = (37 * hash) + REPOSITORY_FIELD_NUMBER;
    hash = (53 * hash) + getRepository().hashCode();
    hash = (37 * hash) + SHA_FIELD_NUMBER;
    hash = (53 * hash) + getSha().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest parseFrom(
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
      com.google.cloud.securesourcemanager.v1.FetchBlobRequest prototype) {
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
   * Request message for fetching a blob (file content) from a repository.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securesourcemanager.v1.FetchBlobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securesourcemanager.v1.FetchBlobRequest)
      com.google.cloud.securesourcemanager.v1.FetchBlobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securesourcemanager.v1.SecureSourceManagerProto
          .internal_static_google_cloud_securesourcemanager_v1_FetchBlobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securesourcemanager.v1.SecureSourceManagerProto
          .internal_static_google_cloud_securesourcemanager_v1_FetchBlobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securesourcemanager.v1.FetchBlobRequest.class,
              com.google.cloud.securesourcemanager.v1.FetchBlobRequest.Builder.class);
    }

    // Construct using com.google.cloud.securesourcemanager.v1.FetchBlobRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      repository_ = "";
      sha_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securesourcemanager.v1.SecureSourceManagerProto
          .internal_static_google_cloud_securesourcemanager_v1_FetchBlobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securesourcemanager.v1.FetchBlobRequest getDefaultInstanceForType() {
      return com.google.cloud.securesourcemanager.v1.FetchBlobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securesourcemanager.v1.FetchBlobRequest build() {
      com.google.cloud.securesourcemanager.v1.FetchBlobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securesourcemanager.v1.FetchBlobRequest buildPartial() {
      com.google.cloud.securesourcemanager.v1.FetchBlobRequest result =
          new com.google.cloud.securesourcemanager.v1.FetchBlobRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securesourcemanager.v1.FetchBlobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.repository_ = repository_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sha_ = sha_;
      }
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
      if (other instanceof com.google.cloud.securesourcemanager.v1.FetchBlobRequest) {
        return mergeFrom((com.google.cloud.securesourcemanager.v1.FetchBlobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securesourcemanager.v1.FetchBlobRequest other) {
      if (other == com.google.cloud.securesourcemanager.v1.FetchBlobRequest.getDefaultInstance())
        return this;
      if (!other.getRepository().isEmpty()) {
        repository_ = other.repository_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSha().isEmpty()) {
        sha_ = other.sha_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                repository_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                sha_ = input.readStringRequireUtf8();
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

    private java.lang.Object repository_ = "";

    /**
     *
     *
     * <pre>
     * Required. The format is
     * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
     * Specifies the repository containing the blob.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The repository.
     */
    public java.lang.String getRepository() {
      java.lang.Object ref = repository_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repository_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The format is
     * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
     * Specifies the repository containing the blob.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for repository.
     */
    public com.google.protobuf.ByteString getRepositoryBytes() {
      java.lang.Object ref = repository_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        repository_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The format is
     * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
     * Specifies the repository containing the blob.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The repository to set.
     * @return This builder for chaining.
     */
    public Builder setRepository(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      repository_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The format is
     * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
     * Specifies the repository containing the blob.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRepository() {
      repository_ = getDefaultInstance().getRepository();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The format is
     * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}`.
     * Specifies the repository containing the blob.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for repository to set.
     * @return This builder for chaining.
     */
    public Builder setRepositoryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      repository_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object sha_ = "";

    /**
     *
     *
     * <pre>
     * Required. The SHA-1 hash of the blob to retrieve.
     * </pre>
     *
     * <code>string sha = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The sha.
     */
    public java.lang.String getSha() {
      java.lang.Object ref = sha_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sha_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The SHA-1 hash of the blob to retrieve.
     * </pre>
     *
     * <code>string sha = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for sha.
     */
    public com.google.protobuf.ByteString getShaBytes() {
      java.lang.Object ref = sha_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sha_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The SHA-1 hash of the blob to retrieve.
     * </pre>
     *
     * <code>string sha = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The sha to set.
     * @return This builder for chaining.
     */
    public Builder setSha(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sha_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The SHA-1 hash of the blob to retrieve.
     * </pre>
     *
     * <code>string sha = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSha() {
      sha_ = getDefaultInstance().getSha();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The SHA-1 hash of the blob to retrieve.
     * </pre>
     *
     * <code>string sha = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for sha to set.
     * @return This builder for chaining.
     */
    public Builder setShaBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sha_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securesourcemanager.v1.FetchBlobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securesourcemanager.v1.FetchBlobRequest)
  private static final com.google.cloud.securesourcemanager.v1.FetchBlobRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securesourcemanager.v1.FetchBlobRequest();
  }

  public static com.google.cloud.securesourcemanager.v1.FetchBlobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchBlobRequest> PARSER =
      new com.google.protobuf.AbstractParser<FetchBlobRequest>() {
        @java.lang.Override
        public FetchBlobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<FetchBlobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchBlobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securesourcemanager.v1.FetchBlobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
