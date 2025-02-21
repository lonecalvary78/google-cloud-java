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
// source: google/cloud/discoveryengine/v1alpha/control_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public final class ControlServiceProto {
  private ControlServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CreateControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CreateControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_GetControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_GetControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListControlsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListControlsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListControlsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListControlsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/discoveryengine/v1alpha/c"
          + "ontrol_service.proto\022$google.cloud.disco"
          + "veryengine.v1alpha\032\034google/api/annotatio"
          + "ns.proto\032\027google/api/client.proto\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\0322google/cloud/discoveryeng"
          + "ine/v1alpha/control.proto\032\033google/protob"
          + "uf/empty.proto\032 google/protobuf/field_ma"
          + "sk.proto\"\264\001\n\024CreateControlRequest\022>\n\006par"
          + "ent\030\001 \001(\tB.\340A\002\372A(\022&discoveryengine.googl"
          + "eapis.com/Control\022C\n\007control\030\002 \001(\0132-.goo"
          + "gle.cloud.discoveryengine.v1alpha.Contro"
          + "lB\003\340A\002\022\027\n\ncontrol_id\030\003 \001(\tB\003\340A\002\"\221\001\n\024Upda"
          + "teControlRequest\022C\n\007control\030\001 \001(\0132-.goog"
          + "le.cloud.discoveryengine.v1alpha.Control"
          + "B\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google.prot"
          + "obuf.FieldMaskB\003\340A\001\"T\n\024DeleteControlRequ"
          + "est\022<\n\004name\030\001 \001(\tB.\340A\002\372A(\n&discoveryengi"
          + "ne.googleapis.com/Control\"Q\n\021GetControlR"
          + "equest\022<\n\004name\030\001 \001(\tB.\340A\002\372A(\n&discoverye"
          + "ngine.googleapis.com/Control\"\233\001\n\023ListCon"
          + "trolsRequest\022>\n\006parent\030\001 \001(\tB.\340A\002\372A(\022&di"
          + "scoveryengine.googleapis.com/Control\022\026\n\t"
          + "page_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\t"
          + "B\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\"p\n\024ListContro"
          + "lsResponse\022?\n\010controls\030\001 \003(\0132-.google.cl"
          + "oud.discoveryengine.v1alpha.Control\022\027\n\017n"
          + "ext_page_token\030\002 \001(\t2\335\017\n\016ControlService\022"
          + "\230\003\n\rCreateControl\022:.google.cloud.discove"
          + "ryengine.v1alpha.CreateControlRequest\032-."
          + "google.cloud.discoveryengine.v1alpha.Con"
          + "trol\"\233\002\332A\031parent,control,control_id\202\323\344\223\002"
          + "\370\001\">/v1alpha/{parent=projects/*/location"
          + "s/*/dataStores/*}/controls:\007controlZW\"L/"
          + "v1alpha/{parent=projects/*/locations/*/c"
          + "ollections/*/dataStores/*}/controls:\007con"
          + "trolZT\"I/v1alpha/{parent=projects/*/loca"
          + "tions/*/collections/*/engines/*}/control"
          + "s:\007control\022\321\002\n\rDeleteControl\022:.google.cl"
          + "oud.discoveryengine.v1alpha.DeleteContro"
          + "lRequest\032\026.google.protobuf.Empty\"\353\001\332A\004na"
          + "me\202\323\344\223\002\335\001*>/v1alpha/{name=projects/*/loc"
          + "ations/*/dataStores/*/controls/*}ZN*L/v1"
          + "alpha/{name=projects/*/locations/*/colle"
          + "ctions/*/dataStores/*/controls/*}ZK*I/v1"
          + "alpha/{name=projects/*/locations/*/colle"
          + "ctions/*/engines/*/controls/*}\022\252\003\n\rUpdat"
          + "eControl\022:.google.cloud.discoveryengine."
          + "v1alpha.UpdateControlRequest\032-.google.cl"
          + "oud.discoveryengine.v1alpha.Control\"\255\002\332A"
          + "\023control,update_mask\202\323\344\223\002\220\0022F/v1alpha/{c"
          + "ontrol.name=projects/*/locations/*/dataS"
          + "tores/*/controls/*}:\007controlZ_2T/v1alpha"
          + "/{control.name=projects/*/locations/*/co"
          + "llections/*/dataStores/*/controls/*}:\007co"
          + "ntrolZ\\2Q/v1alpha/{control.name=projects"
          + "/*/locations/*/collections/*/engines/*/c"
          + "ontrols/*}:\007control\022\342\002\n\nGetControl\0227.goo"
          + "gle.cloud.discoveryengine.v1alpha.GetCon"
          + "trolRequest\032-.google.cloud.discoveryengi"
          + "ne.v1alpha.Control\"\353\001\332A\004name\202\323\344\223\002\335\001\022>/v1"
          + "alpha/{name=projects/*/locations/*/dataS"
          + "tores/*/controls/*}ZN\022L/v1alpha/{name=pr"
          + "ojects/*/locations/*/collections/*/dataS"
          + "tores/*/controls/*}ZK\022I/v1alpha/{name=pr"
          + "ojects/*/locations/*/collections/*/engin"
          + "es/*/controls/*}\022\365\002\n\014ListControls\0229.goog"
          + "le.cloud.discoveryengine.v1alpha.ListCon"
          + "trolsRequest\032:.google.cloud.discoveryeng"
          + "ine.v1alpha.ListControlsResponse\"\355\001\332A\006pa"
          + "rent\202\323\344\223\002\335\001\022>/v1alpha/{parent=projects/*"
          + "/locations/*/dataStores/*}/controlsZN\022L/"
          + "v1alpha/{parent=projects/*/locations/*/c"
          + "ollections/*/dataStores/*}/controlsZK\022I/"
          + "v1alpha/{parent=projects/*/locations/*/c"
          + "ollections/*/engines/*}/controls\032R\312A\036dis"
          + "coveryengine.googleapis.com\322A.https://ww"
          + "w.googleapis.com/auth/cloud-platformB\237\002\n"
          + "(com.google.cloud.discoveryengine.v1alph"
          + "aB\023ControlServiceProtoP\001ZRcloud.google.c"
          + "om/go/discoveryengine/apiv1alpha/discove"
          + "ryenginepb;discoveryenginepb\242\002\017DISCOVERY"
          + "ENGINE\252\002$Google.Cloud.DiscoveryEngine.V1"
          + "Alpha\312\002$Google\\Cloud\\DiscoveryEngine\\V1a"
          + "lpha\352\002\'Google::Cloud::DiscoveryEngine::V"
          + "1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.ControlProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CreateControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_CreateControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CreateControlRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Control", "ControlId",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_UpdateControlRequest_descriptor,
            new java.lang.String[] {
              "Control", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_DeleteControlRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_GetControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_GetControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_GetControlRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListControlsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1alpha_ListControlsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListControlsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListControlsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1alpha_ListControlsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListControlsResponse_descriptor,
            new java.lang.String[] {
              "Controls", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.ControlProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
