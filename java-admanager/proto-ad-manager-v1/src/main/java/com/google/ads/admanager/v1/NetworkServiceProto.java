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
// source: google/ads/admanager/v1/network_service.proto

// Protobuf Java Version: 3.25.8
package com.google.ads.admanager.v1;

public final class NetworkServiceProto {
  private NetworkServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_GetNetworkRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_GetNetworkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListNetworksRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListNetworksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListNetworksResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListNetworksResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/admanager/v1/network_servic"
          + "e.proto\022\027google.ads.admanager.v1\032.google"
          + "/ads/admanager/v1/network_messages.proto"
          + "\032\034google/api/annotations.proto\032\027google/a"
          + "pi/client.proto\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\"K\n\021G"
          + "etNetworkRequest\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n "
          + "admanager.googleapis.com/Network\"\025\n\023List"
          + "NetworksRequest\"J\n\024ListNetworksResponse\022"
          + "2\n\010networks\030\001 \003(\0132 .google.ads.admanager"
          + ".v1.Network2\340\002\n\016NetworkService\022\200\001\n\nGetNe"
          + "twork\022*.google.ads.admanager.v1.GetNetwo"
          + "rkRequest\032 .google.ads.admanager.v1.Netw"
          + "ork\"$\332A\004name\202\323\344\223\002\027\022\025/v1/{name=networks/*"
          + "}\022\201\001\n\014ListNetworks\022,.google.ads.admanage"
          + "r.v1.ListNetworksRequest\032-.google.ads.ad"
          + "manager.v1.ListNetworksResponse\"\024\202\323\344\223\002\016\022"
          + "\014/v1/networks\032G\312A\030admanager.googleapis.c"
          + "om\322A)https://www.googleapis.com/auth/adm"
          + "anagerB\307\001\n\033com.google.ads.admanager.v1B\023"
          + "NetworkServiceProtoP\001Z@google.golang.org"
          + "/genproto/googleapis/ads/admanager/v1;ad"
          + "manager\252\002\027Google.Ads.AdManager.V1\312\002\027Goog"
          + "le\\Ads\\AdManager\\V1\352\002\032Google::Ads::AdMan"
          + "ager::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.NetworkMessagesProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_GetNetworkRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_GetNetworkRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_GetNetworkRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_ads_admanager_v1_ListNetworksRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_ListNetworksRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListNetworksRequest_descriptor,
            new java.lang.String[] {});
    internal_static_google_ads_admanager_v1_ListNetworksResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_admanager_v1_ListNetworksResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListNetworksResponse_descriptor,
            new java.lang.String[] {
              "Networks",
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
    com.google.ads.admanager.v1.NetworkMessagesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
