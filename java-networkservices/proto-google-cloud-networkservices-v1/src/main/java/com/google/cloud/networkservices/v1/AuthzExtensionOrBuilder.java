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
// source: google/cloud/networkservices/v1/dep.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.networkservices.v1;

public interface AuthzExtensionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.AuthzExtension)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Identifier. Name of the `AuthzExtension` resource in the
   * following format:
   * `projects/{project}/locations/{location}/authzExtensions/{authz_extension}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Identifier. Name of the `AuthzExtension` resource in the
   * following format:
   * `projects/{project}/locations/{location}/authzExtensions/{authz_extension}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
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
   * Output only. The timestamp when the resource was created.
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
   * Output only. The timestamp when the resource was created.
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
   * Output only. The timestamp when the resource was updated.
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
   * Output only. The timestamp when the resource was updated.
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
   * Output only. The timestamp when the resource was updated.
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
   * Optional. A human-readable description of the resource.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. A human-readable description of the resource.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Set of labels associated with the `AuthzExtension`
   * resource.
   *
   * The format must comply with [the requirements for
   * labels](/compute/docs/labeling-resources#requirements) for Google Cloud
   * resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. Set of labels associated with the `AuthzExtension`
   * resource.
   *
   * The format must comply with [the requirements for
   * labels](/compute/docs/labeling-resources#requirements) for Google Cloud
   * resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. Set of labels associated with the `AuthzExtension`
   * resource.
   *
   * The format must comply with [the requirements for
   * labels](/compute/docs/labeling-resources#requirements) for Google Cloud
   * resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. Set of labels associated with the `AuthzExtension`
   * resource.
   *
   * The format must comply with [the requirements for
   * labels](/compute/docs/labeling-resources#requirements) for Google Cloud
   * resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Set of labels associated with the `AuthzExtension`
   * resource.
   *
   * The format must comply with [the requirements for
   * labels](/compute/docs/labeling-resources#requirements) for Google Cloud
   * resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. All backend services and forwarding rules referenced by this
   * extension must share the same load balancing scheme. Supported values:
   * `INTERNAL_MANAGED`, `EXTERNAL_MANAGED`. For more information, refer to
   * [Backend services
   * overview](https://cloud.google.com/load-balancing/docs/backend-service).
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.LoadBalancingScheme load_balancing_scheme = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for loadBalancingScheme.
   */
  int getLoadBalancingSchemeValue();

  /**
   *
   *
   * <pre>
   * Required. All backend services and forwarding rules referenced by this
   * extension must share the same load balancing scheme. Supported values:
   * `INTERNAL_MANAGED`, `EXTERNAL_MANAGED`. For more information, refer to
   * [Backend services
   * overview](https://cloud.google.com/load-balancing/docs/backend-service).
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.LoadBalancingScheme load_balancing_scheme = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The loadBalancingScheme.
   */
  com.google.cloud.networkservices.v1.LoadBalancingScheme getLoadBalancingScheme();

  /**
   *
   *
   * <pre>
   * Required. The `:authority` header in the gRPC request sent from Envoy
   * to the extension service.
   * </pre>
   *
   * <code>string authority = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The authority.
   */
  java.lang.String getAuthority();

  /**
   *
   *
   * <pre>
   * Required. The `:authority` header in the gRPC request sent from Envoy
   * to the extension service.
   * </pre>
   *
   * <code>string authority = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString getAuthorityBytes();

  /**
   *
   *
   * <pre>
   * Required. The reference to the service that runs the extension.
   *
   * To configure a callout extension, `service` must be a fully-qualified
   * reference
   * to a [backend
   * service](https://cloud.google.com/compute/docs/reference/rest/v1/backendServices)
   * in the format:
   * `https://www.googleapis.com/compute/v1/projects/{project}/regions/{region}/backendServices/{backendService}`
   * or
   * `https://www.googleapis.com/compute/v1/projects/{project}/global/backendServices/{backendService}`.
   * </pre>
   *
   * <code>string service = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The service.
   */
  java.lang.String getService();

  /**
   *
   *
   * <pre>
   * Required. The reference to the service that runs the extension.
   *
   * To configure a callout extension, `service` must be a fully-qualified
   * reference
   * to a [backend
   * service](https://cloud.google.com/compute/docs/reference/rest/v1/backendServices)
   * in the format:
   * `https://www.googleapis.com/compute/v1/projects/{project}/regions/{region}/backendServices/{backendService}`
   * or
   * `https://www.googleapis.com/compute/v1/projects/{project}/global/backendServices/{backendService}`.
   * </pre>
   *
   * <code>string service = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * Required. Specifies the timeout for each individual message on the stream.
   * The timeout must be between 10-10000 milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();

  /**
   *
   *
   * <pre>
   * Required. Specifies the timeout for each individual message on the stream.
   * The timeout must be between 10-10000 milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();

  /**
   *
   *
   * <pre>
   * Required. Specifies the timeout for each individual message on the stream.
   * The timeout must be between 10-10000 milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Determines how the proxy behaves if the call to the extension
   * fails or times out.
   *
   * When set to `TRUE`, request or response processing continues without
   * error. Any subsequent extensions in the extension chain are also
   * executed. When set to `FALSE` or the default setting of `FALSE` is used,
   * one of the following happens:
   *
   * * If response headers have not been delivered to the downstream client,
   * a generic 500 error is returned to the client. The error response can be
   * tailored by configuring a custom error response in the load balancer.
   *
   * * If response headers have been delivered, then the HTTP stream to the
   * downstream client is reset.
   * </pre>
   *
   * <code>bool fail_open = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The failOpen.
   */
  boolean getFailOpen();

  /**
   *
   *
   * <pre>
   * Optional. The metadata provided here is included as part of the
   * `metadata_context` (of type `google.protobuf.Struct`) in the
   * `ProcessingRequest` message sent to the extension
   * server. The metadata is available under the namespace
   * `com.google.authz_extension.&lt;resource_name&gt;`.
   * The following variables are supported in the metadata Struct:
   *
   * `{forwarding_rule_id}` - substituted with the forwarding rule's fully
   *   qualified resource name.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();

  /**
   *
   *
   * <pre>
   * Optional. The metadata provided here is included as part of the
   * `metadata_context` (of type `google.protobuf.Struct`) in the
   * `ProcessingRequest` message sent to the extension
   * server. The metadata is available under the namespace
   * `com.google.authz_extension.&lt;resource_name&gt;`.
   * The following variables are supported in the metadata Struct:
   *
   * `{forwarding_rule_id}` - substituted with the forwarding rule's fully
   *   qualified resource name.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();

  /**
   *
   *
   * <pre>
   * Optional. The metadata provided here is included as part of the
   * `metadata_context` (of type `google.protobuf.Struct`) in the
   * `ProcessingRequest` message sent to the extension
   * server. The metadata is available under the namespace
   * `com.google.authz_extension.&lt;resource_name&gt;`.
   * The following variables are supported in the metadata Struct:
   *
   * `{forwarding_rule_id}` - substituted with the forwarding rule's fully
   *   qualified resource name.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. List of the HTTP headers to forward to the extension
   * (from the client). If omitted, all headers are sent.
   * Each element is a string indicating the header name.
   * </pre>
   *
   * <code>repeated string forward_headers = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the forwardHeaders.
   */
  java.util.List<java.lang.String> getForwardHeadersList();

  /**
   *
   *
   * <pre>
   * Optional. List of the HTTP headers to forward to the extension
   * (from the client). If omitted, all headers are sent.
   * Each element is a string indicating the header name.
   * </pre>
   *
   * <code>repeated string forward_headers = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of forwardHeaders.
   */
  int getForwardHeadersCount();

  /**
   *
   *
   * <pre>
   * Optional. List of the HTTP headers to forward to the extension
   * (from the client). If omitted, all headers are sent.
   * Each element is a string indicating the header name.
   * </pre>
   *
   * <code>repeated string forward_headers = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The forwardHeaders at the given index.
   */
  java.lang.String getForwardHeaders(int index);

  /**
   *
   *
   * <pre>
   * Optional. List of the HTTP headers to forward to the extension
   * (from the client). If omitted, all headers are sent.
   * Each element is a string indicating the header name.
   * </pre>
   *
   * <code>repeated string forward_headers = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the forwardHeaders at the given index.
   */
  com.google.protobuf.ByteString getForwardHeadersBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The format of communication supported by the callout extension.
   * If not specified, the default value `EXT_PROC_GRPC` is used.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.WireFormat wire_format = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for wireFormat.
   */
  int getWireFormatValue();

  /**
   *
   *
   * <pre>
   * Optional. The format of communication supported by the callout extension.
   * If not specified, the default value `EXT_PROC_GRPC` is used.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.WireFormat wire_format = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The wireFormat.
   */
  com.google.cloud.networkservices.v1.WireFormat getWireFormat();
}
