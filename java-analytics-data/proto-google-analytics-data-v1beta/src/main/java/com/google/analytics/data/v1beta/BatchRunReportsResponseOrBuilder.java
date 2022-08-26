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
// source: google/analytics/data/v1beta/analytics_data_api.proto

package com.google.analytics.data.v1beta;

public interface BatchRunReportsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.BatchRunReportsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.RunReportResponse> getReportsList();
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
   */
  com.google.analytics.data.v1beta.RunReportResponse getReports(int index);
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
   */
  int getReportsCount();
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.RunReportResponseOrBuilder>
      getReportsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
   */
  com.google.analytics.data.v1beta.RunReportResponseOrBuilder getReportsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Identifies what kind of resource this message is. This `kind` is always the
   * fixed string "analyticsData#batchRunReports". Useful to distinguish between
   * response types in JSON.
   * </pre>
   *
   * <code>string kind = 2;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * Identifies what kind of resource this message is. This `kind` is always the
   * fixed string "analyticsData#batchRunReports". Useful to distinguish between
   * response types in JSON.
   * </pre>
   *
   * <code>string kind = 2;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();
}