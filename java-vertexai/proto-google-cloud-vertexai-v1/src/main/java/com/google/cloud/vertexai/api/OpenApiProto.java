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
// source: google/cloud/vertexai/v1/openapi.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public final class OpenApiProto {
  private OpenApiProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Schema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Schema_PropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Schema_PropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/vertexai/v1/openapi.proto"
          + "\022\030google.cloud.vertexai.v1\032\037google/api/f"
          + "ield_behavior.proto\032\034google/protobuf/str"
          + "uct.proto\"\246\006\n\006Schema\0221\n\004type\030\001 \001(\0162\036.goo"
          + "gle.cloud.vertexai.v1.TypeB\003\340A\001\022\023\n\006forma"
          + "t\030\007 \001(\tB\003\340A\001\022\022\n\005title\030\030 \001(\tB\003\340A\001\022\030\n\013desc"
          + "ription\030\010 \001(\tB\003\340A\001\022\025\n\010nullable\030\006 \001(\010B\003\340A"
          + "\001\022,\n\007default\030\027 \001(\0132\026.google.protobuf.Val"
          + "ueB\003\340A\001\0224\n\005items\030\002 \001(\0132 .google.cloud.ve"
          + "rtexai.v1.SchemaB\003\340A\001\022\026\n\tmin_items\030\025 \001(\003"
          + "B\003\340A\001\022\026\n\tmax_items\030\026 \001(\003B\003\340A\001\022\021\n\004enum\030\t "
          + "\003(\tB\003\340A\001\022I\n\nproperties\030\003 \003(\01320.google.cl"
          + "oud.vertexai.v1.Schema.PropertiesEntryB\003"
          + "\340A\001\022\036\n\021property_ordering\030\031 \003(\tB\003\340A\001\022\025\n\010r"
          + "equired\030\005 \003(\tB\003\340A\001\022\033\n\016min_properties\030\016 \001"
          + "(\003B\003\340A\001\022\033\n\016max_properties\030\017 \001(\003B\003\340A\001\022\024\n\007"
          + "minimum\030\020 \001(\001B\003\340A\001\022\024\n\007maximum\030\021 \001(\001B\003\340A\001"
          + "\022\027\n\nmin_length\030\022 \001(\003B\003\340A\001\022\027\n\nmax_length\030"
          + "\023 \001(\003B\003\340A\001\022\024\n\007pattern\030\024 \001(\tB\003\340A\001\022,\n\007exam"
          + "ple\030\004 \001(\0132\026.google.protobuf.ValueB\003\340A\001\0225"
          + "\n\006any_of\030\013 \003(\0132 .google.cloud.vertexai.v"
          + "1.SchemaB\003\340A\001\032S\n\017PropertiesEntry\022\013\n\003key\030"
          + "\001 \001(\t\022/\n\005value\030\002 \001(\0132 .google.cloud.vert"
          + "exai.v1.Schema:\0028\001*e\n\004Type\022\024\n\020TYPE_UNSPE"
          + "CIFIED\020\000\022\n\n\006STRING\020\001\022\n\n\006NUMBER\020\002\022\013\n\007INTE"
          + "GER\020\003\022\013\n\007BOOLEAN\020\004\022\t\n\005ARRAY\020\005\022\n\n\006OBJECT\020"
          + "\006B\311\001\n\035com.google.cloud.vertexai.apiB\014Ope"
          + "nApiProtoP\001Z>cloud.google.com/go/aiplatf"
          + "orm/apiv1/aiplatformpb;aiplatformpb\252\002\032Go"
          + "ogle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\"
          + "AIPlatform\\V1\352\002\035Google::Cloud::AIPlatfor"
          + "m::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_vertexai_v1_Schema_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vertexai_v1_Schema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Schema_descriptor,
            new java.lang.String[] {
              "Type",
              "Format",
              "Title",
              "Description",
              "Nullable",
              "Default",
              "Items",
              "MinItems",
              "MaxItems",
              "Enum",
              "Properties",
              "PropertyOrdering",
              "Required",
              "MinProperties",
              "MaxProperties",
              "Minimum",
              "Maximum",
              "MinLength",
              "MaxLength",
              "Pattern",
              "Example",
              "AnyOf",
            });
    internal_static_google_cloud_vertexai_v1_Schema_PropertiesEntry_descriptor =
        internal_static_google_cloud_vertexai_v1_Schema_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_vertexai_v1_Schema_PropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Schema_PropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
