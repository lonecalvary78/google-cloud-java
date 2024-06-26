/*
 * Copyright 2024 Google LLC
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
// source: google/ads/admanager/v1/frequency_cap.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public final class FrequencyCapProto {
  private FrequencyCapProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_FrequencyCap_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_FrequencyCap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_TimeUnitEnum_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_TimeUnitEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/ads/admanager/v1/frequency_cap."
          + "proto\022\027google.ads.admanager.v1\"\300\001\n\014Frequ"
          + "encyCap\022\034\n\017max_impressions\030\001 \001(\003H\000\210\001\001\022\030\n"
          + "\013time_amount\030\002 \001(\003H\001\210\001\001\022F\n\ttime_unit\030\003 \001"
          + "(\0162..google.ads.admanager.v1.TimeUnitEnu"
          + "m.TimeUnitH\002\210\001\001B\022\n\020_max_impressionsB\016\n\014_"
          + "time_amountB\014\n\n_time_unit\"\214\001\n\014TimeUnitEn"
          + "um\"|\n\010TimeUnit\022\031\n\025TIME_UNIT_UNSPECIFIED\020"
          + "\000\022\n\n\006MINUTE\020\001\022\010\n\004HOUR\020\002\022\007\n\003DAY\020\003\022\010\n\004WEEK"
          + "\020\004\022\t\n\005MONTH\020\005\022\014\n\010LIFETIME\020\006\022\007\n\003POD\020\007\022\n\n\006"
          + "STREAM\020\010B\256\001\n\033com.google.ads.admanager.v1"
          + "B\021FrequencyCapProtoP\001Z@google.golang.org"
          + "/genproto/googleapis/ads/admanager/v1;ad"
          + "manager\242\002\003GAA\252\002\027Google.Ads.AdManager.V1\312"
          + "\002\027Google\\Ads\\AdManager\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_ads_admanager_v1_FrequencyCap_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_FrequencyCap_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_FrequencyCap_descriptor,
            new java.lang.String[] {
              "MaxImpressions", "TimeAmount", "TimeUnit",
            });
    internal_static_google_ads_admanager_v1_TimeUnitEnum_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_TimeUnitEnum_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_TimeUnitEnum_descriptor,
            new java.lang.String[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
