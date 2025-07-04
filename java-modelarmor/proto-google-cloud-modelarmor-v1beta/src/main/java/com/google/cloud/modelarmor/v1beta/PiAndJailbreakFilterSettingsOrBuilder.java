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

public interface PiAndJailbreakFilterSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.modelarmor.v1beta.PiAndJailbreakFilterSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Tells whether Prompt injection and Jailbreak filter is enabled or
   * disabled.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1beta.PiAndJailbreakFilterSettings.PiAndJailbreakFilterEnforcement filter_enforcement = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for filterEnforcement.
   */
  int getFilterEnforcementValue();

  /**
   *
   *
   * <pre>
   * Optional. Tells whether Prompt injection and Jailbreak filter is enabled or
   * disabled.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1beta.PiAndJailbreakFilterSettings.PiAndJailbreakFilterEnforcement filter_enforcement = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The filterEnforcement.
   */
  com.google.cloud.modelarmor.v1beta.PiAndJailbreakFilterSettings.PiAndJailbreakFilterEnforcement
      getFilterEnforcement();

  /**
   *
   *
   * <pre>
   * Optional. Confidence level for this filter.
   * Confidence level is used to determine the threshold for the filter. If
   * detection confidence is equal to or greater than the specified level, a
   * positive match is reported. Confidence level will only be used if the
   * filter is enabled.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1beta.DetectionConfidenceLevel confidence_level = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for confidenceLevel.
   */
  int getConfidenceLevelValue();

  /**
   *
   *
   * <pre>
   * Optional. Confidence level for this filter.
   * Confidence level is used to determine the threshold for the filter. If
   * detection confidence is equal to or greater than the specified level, a
   * positive match is reported. Confidence level will only be used if the
   * filter is enabled.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1beta.DetectionConfidenceLevel confidence_level = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The confidenceLevel.
   */
  com.google.cloud.modelarmor.v1beta.DetectionConfidenceLevel getConfidenceLevel();
}
