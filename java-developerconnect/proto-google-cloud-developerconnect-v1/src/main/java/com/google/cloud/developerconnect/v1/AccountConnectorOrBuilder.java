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
// source: google/cloud/developerconnect/v1/developer_connect.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.developerconnect.v1;

public interface AccountConnectorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.developerconnect.v1.AccountConnector)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Provider OAuth config.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.ProviderOAuthConfig provider_oauth_config = 5;</code>
   *
   * @return Whether the providerOauthConfig field is set.
   */
  boolean hasProviderOauthConfig();

  /**
   *
   *
   * <pre>
   * Provider OAuth config.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.ProviderOAuthConfig provider_oauth_config = 5;</code>
   *
   * @return The providerOauthConfig.
   */
  com.google.cloud.developerconnect.v1.ProviderOAuthConfig getProviderOauthConfig();

  /**
   *
   *
   * <pre>
   * Provider OAuth config.
   * </pre>
   *
   * <code>.google.cloud.developerconnect.v1.ProviderOAuthConfig provider_oauth_config = 5;</code>
   */
  com.google.cloud.developerconnect.v1.ProviderOAuthConfigOrBuilder
      getProviderOauthConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the accountConnector, in the format
   * `projects/{project}/locations/{location}/accountConnectors/{account_connector_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the accountConnector, in the format
   * `projects/{project}/locations/{location}/accountConnectors/{account_connector_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the accountConnector was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the accountConnector was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the accountConnector was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the accountConnector was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the accountConnector was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the accountConnector was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Allows users to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnnotationsCount();

  /**
   *
   *
   * <pre>
   * Optional. Allows users to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);

  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();

  /**
   *
   *
   * <pre>
   * Optional. Allows users to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();

  /**
   *
   *
   * <pre>
   * Optional. Allows users to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
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
   * Optional. Allows users to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Start OAuth flow by clicking on this URL.
   * </pre>
   *
   * <code>string oauth_start_uri = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The oauthStartUri.
   */
  java.lang.String getOauthStartUri();

  /**
   *
   *
   * <pre>
   * Output only. Start OAuth flow by clicking on this URL.
   * </pre>
   *
   * <code>string oauth_start_uri = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for oauthStartUri.
   */
  com.google.protobuf.ByteString getOauthStartUriBytes();

  com.google.cloud.developerconnect.v1.AccountConnector.AccountConnectorConfigCase
      getAccountConnectorConfigCase();
}
