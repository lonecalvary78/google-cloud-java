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
// source: google/ads/admanager/v1/company_messages.proto

// Protobuf Java Version: 3.25.8
package com.google.ads.admanager.v1;

public final class CompanyMessagesProto {
  private CompanyMessagesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_Company_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_Company_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ".google/ads/admanager/v1/company_messag"
          + "es.proto\022\027google.ads.admanager.v1\032+googl"
          + "e/ads/admanager/v1/applied_label.proto\032+google/ads/admanager/v1/company_enums.pr"
          + "oto\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\032\037google/protobuf/timestamp.proto\"\234\006\n"
          + "\007Company\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022\027\n\n"
          + "company_id\030\002 \001(\003B\003\340A\003\022\031\n"
          + "\014display_name\030\003 \001(\tB\003\340A\002\022G\n"
          + "\004type\030\004 \001(\01624.goog"
          + "le.ads.admanager.v1.CompanyTypeEnum.CompanyTypeB\003\340A\002\022\024\n"
          + "\007address\030\005 \001(\tB\003\340A\001\022\022\n"
          + "\005email\030\006 \001(\tB\003\340A\001\022\020\n"
          + "\003fax\030\007 \001(\tB\003\340A\001\022\022\n"
          + "\005phone\030\010 \001(\tB\003\340A\001\022\030\n"
          + "\013external_id\030\t \001(\tB\003\340A\001\022\024\n"
          + "\007comment\030\n"
          + " \001(\tB\003\340A\001\022`\n\r"
          + "credit_status\030\013 \001(\0162D.google.ads.admanager.v1.CompanyCre"
          + "ditStatusEnum.CompanyCreditStatusB\003\340A\001\022B\n"
          + "\016applied_labels\030\014"
          + " \003(\0132%.google.ads.admanager.v1.AppliedLabelB\003\340A\001\022F\n"
          + "\017primary_contact\030\r"
          + " \001(\tB(\340A\001\372A\"\n"
          + " admanager.googleapis.com/ContactH\000\210\001\001\022<\n\r"
          + "applied_teams\030\016 \003(\tB%\340A\001\372A\037\n"
          + "\035admanager.googleapis.com/Team\022#\n"
          + "\026third_party_company_id\030\020 \001(\003B\003\340A\001\0224\n"
          + "\013update_time\030\017"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003:f\352Ac\n"
          + " admanager.googleapis.com/Company\022+networks/{network_code}/companies/{company}*"
          + "\tcompanies2\007companyB\022\n"
          + "\020_primary_contactB\310\001\n"
          + "\033com.google.ads.admanager.v1B\024CompanyMessagesProtoP\001Z@google."
          + "golang.org/genproto/googleapis/ads/adman"
          + "ager/v1;admanager\252\002\027Google.Ads.AdManager"
          + ".V1\312\002\027Google\\Ads\\AdManager\\V1\352\002\032Google::"
          + "Ads::AdManager::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.AppliedLabelProto.getDescriptor(),
              com.google.ads.admanager.v1.CompanyEnumsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_Company_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_Company_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_Company_descriptor,
            new java.lang.String[] {
              "Name",
              "CompanyId",
              "DisplayName",
              "Type",
              "Address",
              "Email",
              "Fax",
              "Phone",
              "ExternalId",
              "Comment",
              "CreditStatus",
              "AppliedLabels",
              "PrimaryContact",
              "AppliedTeams",
              "ThirdPartyCompanyId",
              "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.admanager.v1.AppliedLabelProto.getDescriptor();
    com.google.ads.admanager.v1.CompanyEnumsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
