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

public interface ResolvePullRequestCommentsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securesourcemanager.v1.ResolvePullRequestCommentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of pull request comments resolved.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securesourcemanager.v1.PullRequestComment pull_request_comments = 1;
   * </code>
   */
  java.util.List<com.google.cloud.securesourcemanager.v1.PullRequestComment>
      getPullRequestCommentsList();

  /**
   *
   *
   * <pre>
   * The list of pull request comments resolved.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securesourcemanager.v1.PullRequestComment pull_request_comments = 1;
   * </code>
   */
  com.google.cloud.securesourcemanager.v1.PullRequestComment getPullRequestComments(int index);

  /**
   *
   *
   * <pre>
   * The list of pull request comments resolved.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securesourcemanager.v1.PullRequestComment pull_request_comments = 1;
   * </code>
   */
  int getPullRequestCommentsCount();

  /**
   *
   *
   * <pre>
   * The list of pull request comments resolved.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securesourcemanager.v1.PullRequestComment pull_request_comments = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.securesourcemanager.v1.PullRequestCommentOrBuilder>
      getPullRequestCommentsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The list of pull request comments resolved.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securesourcemanager.v1.PullRequestComment pull_request_comments = 1;
   * </code>
   */
  com.google.cloud.securesourcemanager.v1.PullRequestCommentOrBuilder
      getPullRequestCommentsOrBuilder(int index);
}
