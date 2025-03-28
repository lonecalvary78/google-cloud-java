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
// source: google/cloud/iap/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.iap.v1;

public interface TunnelDestGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iap.v1.TunnelDestGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Immutable. Identifier for the TunnelDestGroup. Must be unique
   * within the project and contain only lower case letters (a-z) and dashes
   * (-).
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Identifier for the TunnelDestGroup. Must be unique
   * within the project and contain only lower case letters (a-z) and dashes
   * (-).
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Unordered list. List of CIDRs that this group applies to.
   * </pre>
   *
   * <code>repeated string cidrs = 2 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @return A list containing the cidrs.
   */
  java.util.List<java.lang.String> getCidrsList();
  /**
   *
   *
   * <pre>
   * Unordered list. List of CIDRs that this group applies to.
   * </pre>
   *
   * <code>repeated string cidrs = 2 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @return The count of cidrs.
   */
  int getCidrsCount();
  /**
   *
   *
   * <pre>
   * Unordered list. List of CIDRs that this group applies to.
   * </pre>
   *
   * <code>repeated string cidrs = 2 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @param index The index of the element to return.
   * @return The cidrs at the given index.
   */
  java.lang.String getCidrs(int index);
  /**
   *
   *
   * <pre>
   * Unordered list. List of CIDRs that this group applies to.
   * </pre>
   *
   * <code>repeated string cidrs = 2 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the cidrs at the given index.
   */
  com.google.protobuf.ByteString getCidrsBytes(int index);

  /**
   *
   *
   * <pre>
   * Unordered list. List of FQDNs that this group applies to.
   * </pre>
   *
   * <code>repeated string fqdns = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @return A list containing the fqdns.
   */
  java.util.List<java.lang.String> getFqdnsList();
  /**
   *
   *
   * <pre>
   * Unordered list. List of FQDNs that this group applies to.
   * </pre>
   *
   * <code>repeated string fqdns = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @return The count of fqdns.
   */
  int getFqdnsCount();
  /**
   *
   *
   * <pre>
   * Unordered list. List of FQDNs that this group applies to.
   * </pre>
   *
   * <code>repeated string fqdns = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @param index The index of the element to return.
   * @return The fqdns at the given index.
   */
  java.lang.String getFqdns(int index);
  /**
   *
   *
   * <pre>
   * Unordered list. List of FQDNs that this group applies to.
   * </pre>
   *
   * <code>repeated string fqdns = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the fqdns at the given index.
   */
  com.google.protobuf.ByteString getFqdnsBytes(int index);
}
