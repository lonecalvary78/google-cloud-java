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
// source: google/cloud/aiplatform/v1/notebook_software_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface ColabImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ColabImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The release name of the NotebookRuntime Colab image, e.g.
   * "py310". If not specified, detault to the latest release.
   * </pre>
   *
   * <code>string release_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The releaseName.
   */
  java.lang.String getReleaseName();

  /**
   *
   *
   * <pre>
   * Optional. The release name of the NotebookRuntime Colab image, e.g.
   * "py310". If not specified, detault to the latest release.
   * </pre>
   *
   * <code>string release_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for releaseName.
   */
  com.google.protobuf.ByteString getReleaseNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A human-readable description of the specified colab image
   * release, populated by the system. Example: "Python 3.10", "Latest - current
   * Python 3.11"
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Output only. A human-readable description of the specified colab image
   * release, populated by the system. Example: "Python 3.10", "Latest - current
   * Python 3.11"
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
