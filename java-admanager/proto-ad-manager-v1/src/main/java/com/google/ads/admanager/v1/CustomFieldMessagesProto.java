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
// source: google/ads/admanager/v1/custom_field_messages.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public final class CustomFieldMessagesProto {
  private CustomFieldMessagesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_CustomField_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_CustomField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_CustomFieldOption_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_CustomFieldOption_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/admanager/v1/custom_field_m"
          + "essages.proto\022\027google.ads.admanager.v1\0320"
          + "google/ads/admanager/v1/custom_field_enu"
          + "ms.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\"\254\005\n\013CustomF"
          + "ield\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\034\n\017custom_field_"
          + "id\030\002 \001(\003B\003\340A\003\022\031\n\014display_name\030\003 \001(\tB\003\340A\002"
          + "\022\030\n\013description\030\004 \001(\tB\003\340A\001\022U\n\006status\030\005 \001"
          + "(\0162@.google.ads.admanager.v1.CustomField"
          + "StatusEnum.CustomFieldStatusB\003\340A\003\022b\n\013ent"
          + "ity_type\030\007 \001(\0162H.google.ads.admanager.v1"
          + ".CustomFieldEntityTypeEnum.CustomFieldEn"
          + "tityTypeB\003\340A\002\022\\\n\tdata_type\030\010 \001(\0162D.googl"
          + "e.ads.admanager.v1.CustomFieldDataTypeEn"
          + "um.CustomFieldDataTypeB\003\340A\002\022a\n\nvisibilit"
          + "y\030\t \001(\0162H.google.ads.admanager.v1.Custom"
          + "FieldVisibilityEnum.CustomFieldVisibilit"
          + "yB\003\340A\002\022@\n\007options\030\n \003(\0132*.google.ads.adm"
          + "anager.v1.CustomFieldOptionB\003\340A\001:y\352Av\n$a"
          + "dmanager.googleapis.com/CustomField\0223net"
          + "works/{network_code}/customFields/{custo"
          + "m_field}*\014customFields2\013customField\"S\n\021C"
          + "ustomFieldOption\022#\n\026custom_field_option_"
          + "id\030\001 \001(\003B\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002"
          + "B\314\001\n\033com.google.ads.admanager.v1B\030Custom"
          + "FieldMessagesProtoP\001Z@google.golang.org/"
          + "genproto/googleapis/ads/admanager/v1;adm"
          + "anager\252\002\027Google.Ads.AdManager.V1\312\002\027Googl"
          + "e\\Ads\\AdManager\\V1\352\002\032Google::Ads::AdMana"
          + "ger::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.CustomFieldEnumsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_CustomField_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_CustomField_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_CustomField_descriptor,
            new java.lang.String[] {
              "Name",
              "CustomFieldId",
              "DisplayName",
              "Description",
              "Status",
              "EntityType",
              "DataType",
              "Visibility",
              "Options",
            });
    internal_static_google_ads_admanager_v1_CustomFieldOption_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_CustomFieldOption_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_CustomFieldOption_descriptor,
            new java.lang.String[] {
              "CustomFieldOptionId", "DisplayName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.admanager.v1.CustomFieldEnumsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
