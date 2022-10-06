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
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface BatchRecognizeTranscriptionMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * How much of the file has been transcribed so far.
   * </pre>
   *
   * <code>int32 progress_percent = 1;</code>
   *
   * @return The progressPercent.
   */
  int getProgressPercent();

  /**
   *
   *
   * <pre>
   * Error if one was encountered.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Error if one was encountered.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Error if one was encountered.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * The GCS URI to which recognition results will be written.
   * </pre>
   *
   * <code>string uri = 3;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * The GCS URI to which recognition results will be written.
   * </pre>
   *
   * <code>string uri = 3;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();
}