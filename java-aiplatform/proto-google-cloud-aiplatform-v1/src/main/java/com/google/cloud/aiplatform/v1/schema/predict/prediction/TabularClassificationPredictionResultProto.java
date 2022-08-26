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
// source: google/cloud/aiplatform/v1/schema/predict/prediction/tabular_classification.proto

package com.google.cloud.aiplatform.v1.schema.predict.prediction;

public final class TabularClassificationPredictionResultProto {
  private TabularClassificationPredictionResultProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularClassificationPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nQgoogle/cloud/aiplatform/v1/schema/pred"
          + "ict/prediction/tabular_classification.pr"
          + "oto\0224google.cloud.aiplatform.v1.schema.p"
          + "redict.prediction\"H\n%TabularClassificati"
          + "onPredictionResult\022\017\n\007classes\030\001 \003(\t\022\016\n\006s"
          + "cores\030\002 \003(\002B\363\002\n8com.google.cloud.aiplatf"
          + "orm.v1.schema.predict.predictionB*Tabula"
          + "rClassificationPredictionResultProtoP\001Z^"
          + "google.golang.org/genproto/googleapis/cl"
          + "oud/aiplatform/v1/schema/predict/predict"
          + "ion;prediction\252\0024Google.Cloud.AIPlatform"
          + ".V1.Schema.Predict.Prediction\312\0024Google\\C"
          + "loud\\AIPlatform\\V1\\Schema\\Predict\\Predic"
          + "tion\352\002:Google::Cloud::AIPlatform::V1::Sc"
          + "hema::Predict::Predictionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularClassificationPredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor,
            new java.lang.String[] {
              "Classes", "Scores",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}