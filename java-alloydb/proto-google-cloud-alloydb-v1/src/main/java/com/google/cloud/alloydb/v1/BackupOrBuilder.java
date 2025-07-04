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
// source: google/cloud/alloydb/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.alloydb.v1;

public interface BackupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1.Backup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the backup resource with the format:
   *  * projects/{project}/locations/{region}/backups/{backup_id}
   * where the cluster and backup ID segments should satisfy the regex
   * expression `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`, e.g. 1-63 characters of
   * lowercase letters, numbers, and dashes, starting with a letter, and ending
   * with a letter or number. For more details see https://google.aip.dev/122.
   * The prefix of the backup resource name is the name of the parent
   * resource:
   *  * projects/{project}/locations/{region}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. The name of the backup resource with the format:
   *  * projects/{project}/locations/{region}/backups/{backup_id}
   * where the cluster and backup ID segments should satisfy the regex
   * expression `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`, e.g. 1-63 characters of
   * lowercase letters, numbers, and dashes, starting with a letter, and ending
   * with a letter or number. For more details see https://google.aip.dev/122.
   * The prefix of the backup resource name is the name of the parent
   * resource:
   *  * projects/{project}/locations/{region}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * User-settable and human-readable display name for the Backup.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * User-settable and human-readable display name for the Backup.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The system-generated UID of the resource. The UID is assigned
   * when the resource is created, and it is retained until it is deleted.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. The system-generated UID of the resource. The UID is assigned
   * when the resource is created, and it is retained until it is deleted.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Update time stamp
   *
   * Users should not infer any meaning from this field. Its value is generally
   * unrelated to the timing of the backup creation operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Update time stamp
   *
   * Users should not infer any meaning from this field. Its value is generally
   * unrelated to the timing of the backup creation operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Update time stamp
   *
   * Users should not infer any meaning from this field. Its value is generally
   * unrelated to the timing of the backup creation operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Delete time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. Delete time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. Delete time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the resource finished being created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp create_completion_time = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createCompletionTime field is set.
   */
  boolean hasCreateCompletionTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the resource finished being created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp create_completion_time = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createCompletionTime.
   */
  com.google.protobuf.Timestamp getCreateCompletionTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the resource finished being created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp create_completion_time = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateCompletionTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The current state of the backup.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Backup.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the backup.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Backup.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.alloydb.v1.Backup.State getState();

  /**
   *
   *
   * <pre>
   * The backup type, which suggests the trigger for the backup.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.Backup.Type type = 8;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();

  /**
   *
   *
   * <pre>
   * The backup type, which suggests the trigger for the backup.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.Backup.Type type = 8;</code>
   *
   * @return The type.
   */
  com.google.cloud.alloydb.v1.Backup.Type getType();

  /**
   *
   *
   * <pre>
   * User-provided description of the backup.
   * </pre>
   *
   * <code>string description = 9;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * User-provided description of the backup.
   * </pre>
   *
   * <code>string description = 9;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The system-generated UID of the cluster which was used to
   * create this resource.
   * </pre>
   *
   * <code>string cluster_uid = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterUid.
   */
  java.lang.String getClusterUid();

  /**
   *
   *
   * <pre>
   * Output only. The system-generated UID of the cluster which was used to
   * create this resource.
   * </pre>
   *
   * <code>string cluster_uid = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for clusterUid.
   */
  com.google.protobuf.ByteString getClusterUidBytes();

  /**
   *
   *
   * <pre>
   * Required. The full resource name of the backup source cluster
   * (e.g., projects/{project}/locations/{region}/clusters/{cluster_id}).
   * </pre>
   *
   * <code>
   * string cluster_name = 10 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The clusterName.
   */
  java.lang.String getClusterName();

  /**
   *
   *
   * <pre>
   * Required. The full resource name of the backup source cluster
   * (e.g., projects/{project}/locations/{region}/clusters/{cluster_id}).
   * </pre>
   *
   * <code>
   * string cluster_name = 10 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString getClusterNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Reconciling (https://google.aip.dev/128#reconciliation), if
   * true, indicates that the service is actively updating the resource. This
   * can happen due to user-triggered updates or system actions like failover or
   * maintenance.
   * </pre>
   *
   * <code>bool reconciling = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the
   * backup with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionConfig encryption_config = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();

  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the
   * backup with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionConfig encryption_config = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptionConfig.
   */
  com.google.cloud.alloydb.v1.EncryptionConfig getEncryptionConfig();

  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the
   * backup with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionConfig encryption_config = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.alloydb.v1.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the backup.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionInfo encryption_info = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the encryptionInfo field is set.
   */
  boolean hasEncryptionInfo();

  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the backup.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionInfo encryption_info = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionInfo.
   */
  com.google.cloud.alloydb.v1.EncryptionInfo getEncryptionInfo();

  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the backup.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.EncryptionInfo encryption_info = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1.EncryptionInfoOrBuilder getEncryptionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * For Resource freshness validation (https://google.aip.dev/154)
   * </pre>
   *
   * <code>string etag = 14;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * For Resource freshness validation (https://google.aip.dev/154)
   * </pre>
   *
   * <code>string etag = 14;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 16;</code>
   */
  int getAnnotationsCount();

  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 16;</code>
   */
  boolean containsAnnotations(java.lang.String key);

  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();

  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 16;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();

  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 16;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 16;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The size of the backup in bytes.
   * </pre>
   *
   * <code>int64 size_bytes = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sizeBytes.
   */
  long getSizeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time at which after the backup is eligible to be garbage
   * collected. It is the duration specified by the backup's retention policy,
   * added to the backup's create_time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiry_time = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expiryTime field is set.
   */
  boolean hasExpiryTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which after the backup is eligible to be garbage
   * collected. It is the duration specified by the backup's retention policy,
   * added to the backup's create_time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiry_time = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expiryTime.
   */
  com.google.protobuf.Timestamp getExpiryTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which after the backup is eligible to be garbage
   * collected. It is the duration specified by the backup's retention policy,
   * added to the backup's create_time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiry_time = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpiryTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The QuantityBasedExpiry of the backup, specified by the
   * backup's retention policy. Once the expiry quantity is over retention, the
   * backup is eligible to be garbage collected.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Backup.QuantityBasedExpiry expiry_quantity = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expiryQuantity field is set.
   */
  boolean hasExpiryQuantity();

  /**
   *
   *
   * <pre>
   * Output only. The QuantityBasedExpiry of the backup, specified by the
   * backup's retention policy. Once the expiry quantity is over retention, the
   * backup is eligible to be garbage collected.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Backup.QuantityBasedExpiry expiry_quantity = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expiryQuantity.
   */
  com.google.cloud.alloydb.v1.Backup.QuantityBasedExpiry getExpiryQuantity();

  /**
   *
   *
   * <pre>
   * Output only. The QuantityBasedExpiry of the backup, specified by the
   * backup's retention policy. Once the expiry quantity is over retention, the
   * backup is eligible to be garbage collected.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.Backup.QuantityBasedExpiry expiry_quantity = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1.Backup.QuantityBasedExpiryOrBuilder getExpiryQuantityOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzs = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * Output only. The database engine major version of the cluster this backup
   * was created from. Any restored cluster created from this backup will have
   * the same database version.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.DatabaseVersion database_version = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for databaseVersion.
   */
  int getDatabaseVersionValue();

  /**
   *
   *
   * <pre>
   * Output only. The database engine major version of the cluster this backup
   * was created from. Any restored cluster created from this backup will have
   * the same database version.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.DatabaseVersion database_version = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The databaseVersion.
   */
  com.google.cloud.alloydb.v1.DatabaseVersion getDatabaseVersion();

  /**
   *
   *
   * <pre>
   * Optional. Input only. Immutable. Tag keys/values directly bound to this
   * resource. For example:
   * ```
   * "123/environment": "production",
   * "123/costCenter": "marketing"
   * ```
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; tags = 25 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getTagsCount();

  /**
   *
   *
   * <pre>
   * Optional. Input only. Immutable. Tag keys/values directly bound to this
   * resource. For example:
   * ```
   * "123/environment": "production",
   * "123/costCenter": "marketing"
   * ```
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; tags = 25 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsTags(java.lang.String key);

  /** Use {@link #getTagsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getTags();

  /**
   *
   *
   * <pre>
   * Optional. Input only. Immutable. Tag keys/values directly bound to this
   * resource. For example:
   * ```
   * "123/environment": "production",
   * "123/costCenter": "marketing"
   * ```
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; tags = 25 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getTagsMap();

  /**
   *
   *
   * <pre>
   * Optional. Input only. Immutable. Tag keys/values directly bound to this
   * resource. For example:
   * ```
   * "123/environment": "production",
   * "123/costCenter": "marketing"
   * ```
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; tags = 25 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Input only. Immutable. Tag keys/values directly bound to this
   * resource. For example:
   * ```
   * "123/environment": "production",
   * "123/costCenter": "marketing"
   * ```
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; tags = 25 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getTagsOrThrow(java.lang.String key);
}
