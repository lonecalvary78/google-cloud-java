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
// source: google/cloud/developerconnect/v1/insights_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.developerconnect.v1;

public final class InsightsConfigProto {
  private InsightsConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_InsightsConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_InsightsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_InsightsConfig_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_InsightsConfig_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_InsightsConfig_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_InsightsConfig_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_RuntimeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_RuntimeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_GKEWorkload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_GKEWorkload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_AppHubWorkload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_AppHubWorkload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_ArtifactConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_ArtifactConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_GoogleArtifactAnalysis_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_GoogleArtifactAnalysis_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_GoogleArtifactRegistry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_GoogleArtifactRegistry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_CreateInsightsConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_CreateInsightsConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_GetInsightsConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_GetInsightsConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_ListInsightsConfigsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_ListInsightsConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_ListInsightsConfigsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_ListInsightsConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_DeleteInsightsConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_DeleteInsightsConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_developerconnect_v1_UpdateInsightsConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_developerconnect_v1_UpdateInsightsConfigRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "6google/cloud/developerconnect/v1/insights_config.proto\022 google.cloud.developer"
          + "connect.v1\032\034google/api/annotations.proto"
          + "\032\027google/api/client.proto\032\037google/api/fi"
          + "eld_behavior.proto\032\033google/api/field_inf"
          + "o.proto\032\031google/api/resource.proto\0328goog"
          + "le/cloud/developerconnect/v1/developer_connect.proto\032#google/longrunning/operati"
          + "ons.proto\032\033google/protobuf/empty.proto\032\037"
          + "google/protobuf/timestamp.proto\032\027google/rpc/status.proto\"\374\007\n"
          + "\016InsightsConfig\022\"\n"
          + "\023app_hub_application\030\004 \001(\tB\003\340A\001H\000\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\0224\n"
          + "\013create_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022M\n"
          + "\017runtime_configs\030\005"
          + " \003(\0132/.google.cloud.developerconnect.v1.RuntimeConfigB\003\340A\003\022O\n"
          + "\020artifact_configs\030\006 \003(\01320.google.cloud.d"
          + "eveloperconnect.v1.ArtifactConfigB\003\340A\001\022J\n"
          + "\005state\030\007"
          + " \001(\01626.google.cloud.developerconnect.v1.InsightsConfig.StateB\003\340A\001\022[\n"
          + "\013annotations\030\010 \003(\0132A.google.cloud.developer"
          + "connect.v1.InsightsConfig.AnnotationsEntryB\003\340A\001\022Q\n"
          + "\006labels\030\t \003(\0132<.google.cloud.d"
          + "eveloperconnect.v1.InsightsConfig.LabelsEntryB\003\340A\001\022\030\n"
          + "\013reconciling\030\n"
          + " \001(\010B\003\340A\003\022\'\n"
          + "\006errors\030\013 \003(\0132\022.google.rpc.StatusB\003\340A\003\0322\n"
          + "\020AnnotationsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"D\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\013\n"
          + "\007PENDING\020\005\022\014\n"
          + "\010COMPLETE\020\003\022\t\n"
          + "\005ERROR\020\004:\243\001\352A\237\001\n"
          + ".developerconnect.googleapis.com/InsightsConfig\022Iprojects/{project"
          + "}/locations/{location}/insightsConfigs/{"
          + "insights_config}*\017insightsConfigs2\016insightsConfigR\001\001B\031\n"
          + "\027insights_config_context\"\343\002\n\r"
          + "RuntimeConfig\022J\n"
          + "\014gke_workload\030\003 \001(\0132"
          + "-.google.cloud.developerconnect.v1.GKEWorkloadB\003\340A\003H\000\022Q\n"
          + "\020app_hub_workload\030\004 \001(\0132"
          + "0.google.cloud.developerconnect.v1.AppHubWorkloadB\003\340A\003H\001\022\023\n"
          + "\003uri\030\001 \001(\tB\006\340A\002\340A\005\022I\n"
          + "\005state\030\002"
          + " \001(\01625.google.cloud.developerconnect.v1.RuntimeConfig.StateB\003\340A\003\"8\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\n\n"
          + "\006LINKED\020\001\022\014\n"
          + "\010UNLINKED\020\002B\t\n"
          + "\007runtimeB\016\n"
          + "\014derived_from\"?\n"
          + "\013GKEWorkload\022\027\n"
          + "\007cluster\030\001 \001(\tB\006\340A\002\340A\005\022\027\n"
          + "\n"
          + "deployment\030\002 \001(\tB\003\340A\003\"a\n"
          + "\016AppHubWorkload\022\033\n"
          + "\010workload\030\001 \001(\tB\t\340A\002\340A\005\340A\003\022\030\n"
          + "\013criticality\030\002 \001(\tB\003\340A\003\022\030\n"
          + "\013environment\030\003 \001(\tB\003\340A\003\"\234\002\n"
          + "\016ArtifactConfig\022a\n"
          + "\030google_artifact_registry\030\002 \001(\01328.google.cloud.developerc"
          + "onnect.v1.GoogleArtifactRegistryB\003\340A\001H\000\022a\n"
          + "\030google_artifact_analysis\030\003 \001(\01328.goog"
          + "le.cloud.developerconnect.v1.GoogleArtifactAnalysisB\003\340A\001H\001\022\023\n"
          + "\003uri\030\001 \001(\tB\006\340A\002\340A\005B\022\n"
          + "\020artifact_storageB\033\n"
          + "\031artifact_metadata_storage\"1\n"
          + "\026GoogleArtifactAnalysis\022\027\n\n"
          + "project_id\030\001 \001(\tB\003\340A\002\"\\\n"
          + "\026GoogleArtifactRegistry\022\027\n\n"
          + "project_id\030\001 \001(\tB\003\340A\002\022)\n"
          + "\031artifact_registry_package\030\002 \001(\tB\006\340A\002\340A\005\"\362\001\n"
          + "\033CreateInsightsConfigRequest\022F\n"
          + "\006parent\030\001 \001("
          + "\tB6\340A\002\372A0\022.developerconnect.googleapis.com/InsightsConfig\022\037\n"
          + "\022insights_config_id\030\002 \001(\tB\003\340A\002\022N\n"
          + "\017insights_config\030\003 \001(\01320.go"
          + "ogle.cloud.developerconnect.v1.InsightsConfigB\003\340A\002\022\032\n\r"
          + "validate_only\030\004 \001(\010B\003\340A\001\"`\n"
          + "\030GetInsightsConfigRequest\022D\n"
          + "\004name\030\001 \001(\tB6\340A\002\372A0\n"
          + ".developerconnect.googleapis.com/InsightsConfig\"\301\001\n"
          + "\032ListInsightsConfigsRequest\022F\n"
          + "\006parent\030\001 \001(\tB6\340A\002\372A0\022.develop"
          + "erconnect.googleapis.com/InsightsConfig\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\022\025\n"
          + "\010order_by\030\005 \001(\tB\003\340A\001\"\227\001\n"
          + "\033ListInsightsConfigsResponse\022J\n"
          + "\020insights_configs\030\001 \003(\01320.google."
          + "cloud.developerconnect.v1.InsightsConfig\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n"
          + "\013unreachable\030\003 \003(\t\"\263\001\n"
          + "\033DeleteInsightsConfigRequest\022D\n"
          + "\004name\030\001 \001(\tB6\340A\002\372A0\n"
          + ".developerconnect.googleapis.com/InsightsConfig\022\037\n\n"
          + "request_id\030\002 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\022\032\n\r"
          + "validate_only\030\003 \001(\010B\003\340A\001\022\021\n"
          + "\004etag\030\004 \001(\tB\003\340A\001\"\306\001\n"
          + "\033UpdateInsightsConfigRequest\022N\n"
          + "\017insights_config\030\002"
          + " \001(\01320.google.cloud.developerconnect.v1.InsightsConfigB\003\340A\002\022\037\n\n"
          + "request_id\030\003 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\022\032\n\r"
          + "allow_missing\030\004 \001(\010B\003\340A\001\022\032\n\r"
          + "validate_only\030\005 \001(\010B\003\340A\0012\357\n\n"
          + "\025InsightsConfigService\022\330\001\n"
          + "\023ListInsightsConfigs\022<.google.cloud.developerconnect.v1.ListI"
          + "nsightsConfigsRequest\032=.google.cloud.developerconnect.v1.ListInsightsConfigsResp"
          + "onse\"D\332A\006parent\202\323\344\223\0025\0223/v1/{parent=projects/*/locations/*}/insightsConfigs\022\266\002\n"
          + "\024CreateInsightsConfig\022=.google.cloud.devel"
          + "operconnect.v1.CreateInsightsConfigRequest\032\035.google.longrunning.Operation\"\277\001\312AD\n"
          + "\016InsightsConfig\0222google.cloud.developerc"
          + "onnect.v1.OperationMetadata\332A)parent,ins"
          + "ights_config,insights_config_id\202\323\344\223\002F\"3/"
          + "v1/{parent=projects/*/locations/*}/insightsConfigs:\017insights_config\022\305\001\n"
          + "\021GetInsightsConfig\022:.google.cloud.developerconnec"
          + "t.v1.GetInsightsConfigRequest\0320.google.cloud.developerconnect.v1.InsightsConfig\""
          + "B\332A\004name\202\323\344\223\0025\0223/v1/{name=projects/*/locations/*/insightsConfigs/*}\022\232\002\n"
          + "\024UpdateInsightsConfig\022=.google.cloud.developercon"
          + "nect.v1.UpdateInsightsConfigRequest\032\035.google.longrunning.Operation\"\243\001\312AD\n"
          + "\016InsightsConfig\0222google.cloud.developerconnect."
          + "v1.OperationMetadata\202\323\344\223\002V2C/v1/{insight"
          + "s_config.name=projects/*/locations/*/insightsConfigs/*}:\017insights_config\022\207\002\n"
          + "\024DeleteInsightsConfig\022=.google.cloud.develop"
          + "erconnect.v1.DeleteInsightsConfigRequest\032\035.google.longrunning.Operation\"\220\001\312AK\n"
          + "\025google.protobuf.Empty\0222google.cloud.devel"
          + "operconnect.v1.OperationMetadata\332A\004name\202"
          + "\323\344\223\0025*3/v1/{name=projects/*/locations/*/"
          + "insightsConfigs/*}\032S\312A\037developerconnect."
          + "googleapis.com\322A.https://www.googleapis.com/auth/cloud-platformB\325\001\n"
          + "$com.google.cloud.developerconnect.v1B\023InsightsConfig"
          + "ProtoP\001ZPcloud.google.com/go/developerco"
          + "nnect/apiv1/developerconnectpb;developerconnectpb\252\002"
          + " Google.Cloud.DeveloperConnect.V1\312\002 Google\\Cloud\\DeveloperConnect\\V1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.developerconnect.v1.DeveloperConnectProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_developerconnect_v1_InsightsConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_developerconnect_v1_InsightsConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_InsightsConfig_descriptor,
            new java.lang.String[] {
              "AppHubApplication",
              "Name",
              "CreateTime",
              "UpdateTime",
              "RuntimeConfigs",
              "ArtifactConfigs",
              "State",
              "Annotations",
              "Labels",
              "Reconciling",
              "Errors",
              "InsightsConfigContext",
            });
    internal_static_google_cloud_developerconnect_v1_InsightsConfig_AnnotationsEntry_descriptor =
        internal_static_google_cloud_developerconnect_v1_InsightsConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_developerconnect_v1_InsightsConfig_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_InsightsConfig_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_developerconnect_v1_InsightsConfig_LabelsEntry_descriptor =
        internal_static_google_cloud_developerconnect_v1_InsightsConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_developerconnect_v1_InsightsConfig_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_InsightsConfig_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_developerconnect_v1_RuntimeConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_developerconnect_v1_RuntimeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_RuntimeConfig_descriptor,
            new java.lang.String[] {
              "GkeWorkload", "AppHubWorkload", "Uri", "State", "Runtime", "DerivedFrom",
            });
    internal_static_google_cloud_developerconnect_v1_GKEWorkload_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_developerconnect_v1_GKEWorkload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_GKEWorkload_descriptor,
            new java.lang.String[] {
              "Cluster", "Deployment",
            });
    internal_static_google_cloud_developerconnect_v1_AppHubWorkload_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_developerconnect_v1_AppHubWorkload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_AppHubWorkload_descriptor,
            new java.lang.String[] {
              "Workload", "Criticality", "Environment",
            });
    internal_static_google_cloud_developerconnect_v1_ArtifactConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_developerconnect_v1_ArtifactConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_ArtifactConfig_descriptor,
            new java.lang.String[] {
              "GoogleArtifactRegistry",
              "GoogleArtifactAnalysis",
              "Uri",
              "ArtifactStorage",
              "ArtifactMetadataStorage",
            });
    internal_static_google_cloud_developerconnect_v1_GoogleArtifactAnalysis_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_developerconnect_v1_GoogleArtifactAnalysis_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_GoogleArtifactAnalysis_descriptor,
            new java.lang.String[] {
              "ProjectId",
            });
    internal_static_google_cloud_developerconnect_v1_GoogleArtifactRegistry_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_developerconnect_v1_GoogleArtifactRegistry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_GoogleArtifactRegistry_descriptor,
            new java.lang.String[] {
              "ProjectId", "ArtifactRegistryPackage",
            });
    internal_static_google_cloud_developerconnect_v1_CreateInsightsConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_developerconnect_v1_CreateInsightsConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_CreateInsightsConfigRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InsightsConfigId", "InsightsConfig", "ValidateOnly",
            });
    internal_static_google_cloud_developerconnect_v1_GetInsightsConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_developerconnect_v1_GetInsightsConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_GetInsightsConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_developerconnect_v1_ListInsightsConfigsRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_developerconnect_v1_ListInsightsConfigsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_ListInsightsConfigsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_developerconnect_v1_ListInsightsConfigsResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_developerconnect_v1_ListInsightsConfigsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_ListInsightsConfigsResponse_descriptor,
            new java.lang.String[] {
              "InsightsConfigs", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_developerconnect_v1_DeleteInsightsConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_developerconnect_v1_DeleteInsightsConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_DeleteInsightsConfigRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId", "ValidateOnly", "Etag",
            });
    internal_static_google_cloud_developerconnect_v1_UpdateInsightsConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_developerconnect_v1_UpdateInsightsConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_developerconnect_v1_UpdateInsightsConfigRequest_descriptor,
            new java.lang.String[] {
              "InsightsConfig", "RequestId", "AllowMissing", "ValidateOnly",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.FieldInfoProto.fieldInfo);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.developerconnect.v1.DeveloperConnectProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
