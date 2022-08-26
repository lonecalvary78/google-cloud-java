/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1beta;

public interface SyncErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1beta.SyncError)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An ACM defined error code
   * </pre>
   *
   * <code>string code = 1;</code>
   *
   * @return The code.
   */
  java.lang.String getCode();
  /**
   *
   *
   * <pre>
   * An ACM defined error code
   * </pre>
   *
   * <code>string code = 1;</code>
   *
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString getCodeBytes();

  /**
   *
   *
   * <pre>
   * A description of the error
   * </pre>
   *
   * <code>string error_message = 2;</code>
   *
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   *
   *
   * <pre>
   * A description of the error
   * </pre>
   *
   * <code>string error_message = 2;</code>
   *
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString getErrorMessageBytes();

  /**
   *
   *
   * <pre>
   * A list of config(s) associated with the error, if any
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.ErrorResource error_resources = 3;
   * </code>
   */
  java.util.List<com.google.cloud.gkehub.configmanagement.v1beta.ErrorResource>
      getErrorResourcesList();
  /**
   *
   *
   * <pre>
   * A list of config(s) associated with the error, if any
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.ErrorResource error_resources = 3;
   * </code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ErrorResource getErrorResources(int index);
  /**
   *
   *
   * <pre>
   * A list of config(s) associated with the error, if any
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.ErrorResource error_resources = 3;
   * </code>
   */
  int getErrorResourcesCount();
  /**
   *
   *
   * <pre>
   * A list of config(s) associated with the error, if any
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.ErrorResource error_resources = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.gkehub.configmanagement.v1beta.ErrorResourceOrBuilder>
      getErrorResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of config(s) associated with the error, if any
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.ErrorResource error_resources = 3;
   * </code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ErrorResourceOrBuilder getErrorResourcesOrBuilder(
      int index);
}