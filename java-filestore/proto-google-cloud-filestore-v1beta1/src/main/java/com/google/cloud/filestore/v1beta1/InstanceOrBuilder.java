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
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.filestore.v1beta1;

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1beta1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the instance, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
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
   * Output only. The resource name of the instance, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
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
   * The description of the instance (2048 characters or less).
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the instance (2048 characters or less).
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The instance state.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Instance.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The instance state.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Instance.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.filestore.v1beta1.Instance.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the instance state, if available.
   * </pre>
   *
   * <code>string status_message = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the instance state, if available.
   * </pre>
   *
   * <code>string status_message = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The service tier of the instance.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.Instance.Tier tier = 8;</code>
   *
   * @return The enum numeric value on the wire for tier.
   */
  int getTierValue();
  /**
   *
   *
   * <pre>
   * The service tier of the instance.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.Instance.Tier tier = 8;</code>
   *
   * @return The tier.
   */
  com.google.cloud.filestore.v1beta1.Instance.Tier getTier();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
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
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * File system shares on the instance.
   * For this version, only a single file share is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.FileShareConfig file_shares = 10;</code>
   */
  java.util.List<com.google.cloud.filestore.v1beta1.FileShareConfig> getFileSharesList();
  /**
   *
   *
   * <pre>
   * File system shares on the instance.
   * For this version, only a single file share is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.FileShareConfig file_shares = 10;</code>
   */
  com.google.cloud.filestore.v1beta1.FileShareConfig getFileShares(int index);
  /**
   *
   *
   * <pre>
   * File system shares on the instance.
   * For this version, only a single file share is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.FileShareConfig file_shares = 10;</code>
   */
  int getFileSharesCount();
  /**
   *
   *
   * <pre>
   * File system shares on the instance.
   * For this version, only a single file share is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.FileShareConfig file_shares = 10;</code>
   */
  java.util.List<? extends com.google.cloud.filestore.v1beta1.FileShareConfigOrBuilder>
      getFileSharesOrBuilderList();
  /**
   *
   *
   * <pre>
   * File system shares on the instance.
   * For this version, only a single file share is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.FileShareConfig file_shares = 10;</code>
   */
  com.google.cloud.filestore.v1beta1.FileShareConfigOrBuilder getFileSharesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * VPC networks to which the instance is connected.
   * For this version, only a single network is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NetworkConfig networks = 11;</code>
   */
  java.util.List<com.google.cloud.filestore.v1beta1.NetworkConfig> getNetworksList();
  /**
   *
   *
   * <pre>
   * VPC networks to which the instance is connected.
   * For this version, only a single network is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NetworkConfig networks = 11;</code>
   */
  com.google.cloud.filestore.v1beta1.NetworkConfig getNetworks(int index);
  /**
   *
   *
   * <pre>
   * VPC networks to which the instance is connected.
   * For this version, only a single network is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NetworkConfig networks = 11;</code>
   */
  int getNetworksCount();
  /**
   *
   *
   * <pre>
   * VPC networks to which the instance is connected.
   * For this version, only a single network is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NetworkConfig networks = 11;</code>
   */
  java.util.List<? extends com.google.cloud.filestore.v1beta1.NetworkConfigOrBuilder>
      getNetworksOrBuilderList();
  /**
   *
   *
   * <pre>
   * VPC networks to which the instance is connected.
   * For this version, only a single network is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NetworkConfig networks = 11;</code>
   */
  com.google.cloud.filestore.v1beta1.NetworkConfigOrBuilder getNetworksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Server-specified ETag for the instance resource to prevent simultaneous
   * updates from overwriting each other.
   * </pre>
   *
   * <code>string etag = 12;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Server-specified ETag for the instance resource to prevent simultaneous
   * updates from overwriting each other.
   * </pre>
   *
   * <code>string etag = 12;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue satisfies_pzs = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the satisfiesPzs field is set.
   */
  boolean hasSatisfiesPzs();
  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue satisfies_pzs = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The satisfiesPzs.
   */
  com.google.protobuf.BoolValue getSatisfiesPzs();
  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue satisfies_pzs = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.BoolValueOrBuilder getSatisfiesPzsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzi = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzi.
   */
  boolean getSatisfiesPzi();

  /**
   *
   *
   * <pre>
   * KMS key name used for data encryption.
   * </pre>
   *
   * <code>string kms_key_name = 14;</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * KMS key name used for data encryption.
   * </pre>
   *
   * <code>string kms_key_name = 14;</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Field indicates all the reasons the instance is in "SUSPENDED"
   * state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.filestore.v1beta1.Instance.SuspensionReason suspension_reasons = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the suspensionReasons.
   */
  java.util.List<com.google.cloud.filestore.v1beta1.Instance.SuspensionReason>
      getSuspensionReasonsList();
  /**
   *
   *
   * <pre>
   * Output only. Field indicates all the reasons the instance is in "SUSPENDED"
   * state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.filestore.v1beta1.Instance.SuspensionReason suspension_reasons = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of suspensionReasons.
   */
  int getSuspensionReasonsCount();
  /**
   *
   *
   * <pre>
   * Output only. Field indicates all the reasons the instance is in "SUSPENDED"
   * state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.filestore.v1beta1.Instance.SuspensionReason suspension_reasons = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The suspensionReasons at the given index.
   */
  com.google.cloud.filestore.v1beta1.Instance.SuspensionReason getSuspensionReasons(int index);
  /**
   *
   *
   * <pre>
   * Output only. Field indicates all the reasons the instance is in "SUSPENDED"
   * state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.filestore.v1beta1.Instance.SuspensionReason suspension_reasons = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for suspensionReasons.
   */
  java.util.List<java.lang.Integer> getSuspensionReasonsValueList();
  /**
   *
   *
   * <pre>
   * Output only. Field indicates all the reasons the instance is in "SUSPENDED"
   * state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.filestore.v1beta1.Instance.SuspensionReason suspension_reasons = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of suspensionReasons at the given index.
   */
  int getSuspensionReasonsValue(int index);

  /**
   *
   *
   * <pre>
   * Output only. The max capacity of the instance.
   * </pre>
   *
   * <code>int64 max_capacity_gb = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The maxCapacityGb.
   */
  long getMaxCapacityGb();

  /**
   *
   *
   * <pre>
   * Output only. The increase/decrease capacity step size.
   * </pre>
   *
   * <code>int64 capacity_step_size_gb = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The capacityStepSizeGb.
   */
  long getCapacityStepSizeGb();

  /**
   *
   *
   * <pre>
   * The max number of shares allowed.
   * </pre>
   *
   * <code>int64 max_share_count = 18;</code>
   *
   * @return The maxShareCount.
   */
  long getMaxShareCount();

  /**
   *
   *
   * <pre>
   * The storage capacity of the instance in gigabytes (GB = 1024^3 bytes).
   * This capacity can be increased up to `max_capacity_gb` GB in multipliers
   * of `capacity_step_size_gb` GB.
   * </pre>
   *
   * <code>int64 capacity_gb = 19;</code>
   *
   * @return The capacityGb.
   */
  long getCapacityGb();

  /**
   *
   *
   * <pre>
   * Indicates whether this instance uses a multi-share configuration with which
   * it can have more than one file-share or none at all. File-shares are added,
   * updated and removed through the separate file-share APIs.
   * </pre>
   *
   * <code>bool multi_share_enabled = 20;</code>
   *
   * @return The multiShareEnabled.
   */
  boolean getMultiShareEnabled();

  /**
   *
   *
   * <pre>
   * Immutable. The protocol indicates the access protocol for all shares in the
   * instance. This field is immutable and it cannot be changed after the
   * instance has been created. Default value: `NFS_V3`.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Instance.FileProtocol protocol = 21 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for protocol.
   */
  int getProtocolValue();
  /**
   *
   *
   * <pre>
   * Immutable. The protocol indicates the access protocol for all shares in the
   * instance. This field is immutable and it cannot be changed after the
   * instance has been created. Default value: `NFS_V3`.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Instance.FileProtocol protocol = 21 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The protocol.
   */
  com.google.cloud.filestore.v1beta1.Instance.FileProtocol getProtocol();

  /**
   *
   *
   * <pre>
   * Directory Services configuration for Kerberos-based authentication.
   * Should only be set if protocol is "NFS_V4_1".
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.DirectoryServicesConfig directory_services = 24;</code>
   *
   * @return Whether the directoryServices field is set.
   */
  boolean hasDirectoryServices();
  /**
   *
   *
   * <pre>
   * Directory Services configuration for Kerberos-based authentication.
   * Should only be set if protocol is "NFS_V4_1".
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.DirectoryServicesConfig directory_services = 24;</code>
   *
   * @return The directoryServices.
   */
  com.google.cloud.filestore.v1beta1.DirectoryServicesConfig getDirectoryServices();
  /**
   *
   *
   * <pre>
   * Directory Services configuration for Kerberos-based authentication.
   * Should only be set if protocol is "NFS_V4_1".
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.DirectoryServicesConfig directory_services = 24;</code>
   */
  com.google.cloud.filestore.v1beta1.DirectoryServicesConfigOrBuilder
      getDirectoryServicesOrBuilder();
}
