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
// source: google/cloud/modelarmor/v1beta/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.modelarmor.v1beta;

public interface RaiFilterSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.modelarmor.v1beta.RaiFilterSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. List of Responsible AI filters enabled for template.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.modelarmor.v1beta.RaiFilterSettings.RaiFilter rai_filters = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.modelarmor.v1beta.RaiFilterSettings.RaiFilter>
      getRaiFiltersList();

  /**
   *
   *
   * <pre>
   * Required. List of Responsible AI filters enabled for template.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.modelarmor.v1beta.RaiFilterSettings.RaiFilter rai_filters = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.modelarmor.v1beta.RaiFilterSettings.RaiFilter getRaiFilters(int index);

  /**
   *
   *
   * <pre>
   * Required. List of Responsible AI filters enabled for template.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.modelarmor.v1beta.RaiFilterSettings.RaiFilter rai_filters = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRaiFiltersCount();

  /**
   *
   *
   * <pre>
   * Required. List of Responsible AI filters enabled for template.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.modelarmor.v1beta.RaiFilterSettings.RaiFilter rai_filters = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.modelarmor.v1beta.RaiFilterSettings.RaiFilterOrBuilder>
      getRaiFiltersOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. List of Responsible AI filters enabled for template.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.modelarmor.v1beta.RaiFilterSettings.RaiFilter rai_filters = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.modelarmor.v1beta.RaiFilterSettings.RaiFilterOrBuilder getRaiFiltersOrBuilder(
      int index);
}
