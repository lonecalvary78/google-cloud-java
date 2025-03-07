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
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.datatransfer.v1;

public final class TransferProto {
  private TransferProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptionsV2_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptionsV2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_TimeBasedSchedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TimeBasedSchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ManualSchedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ManualSchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_EventDrivenSchedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_EventDrivenSchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_UserInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_EncryptionConfiguration_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_EncryptionConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/bigquery/datatransfer/v1/"
          + "transfer.proto\022%google.cloud.bigquery.da"
          + "tatransfer.v1\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032\034googl"
          + "e/protobuf/struct.proto\032\037google/protobuf"
          + "/timestamp.proto\032\036google/protobuf/wrappe"
          + "rs.proto\032\027google/rpc/status.proto\"0\n\020Ema"
          + "ilPreferences\022\034\n\024enable_failure_email\030\001 "
          + "\001(\010\"\220\001\n\017ScheduleOptions\022\037\n\027disable_auto_"
          + "scheduling\030\003 \001(\010\022.\n\nstart_time\030\001 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\022,\n\010end_time\030\002 \001"
          + "(\0132\032.google.protobuf.Timestamp\"\247\002\n\021Sched"
          + "uleOptionsV2\022W\n\023time_based_schedule\030\001 \001("
          + "\01328.google.cloud.bigquery.datatransfer.v"
          + "1.TimeBasedScheduleH\000\022P\n\017manual_schedule"
          + "\030\002 \001(\01325.google.cloud.bigquery.datatrans"
          + "fer.v1.ManualScheduleH\000\022[\n\025event_driven_"
          + "schedule\030\003 \001(\0132:.google.cloud.bigquery.d"
          + "atatransfer.v1.EventDrivenScheduleH\000B\n\n\010"
          + "schedule\"\203\001\n\021TimeBasedSchedule\022\020\n\010schedu"
          + "le\030\001 \001(\t\022.\n\nstart_time\030\002 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\022,\n\010end_time\030\003 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\"\020\n\016ManualSchedule"
          + "\"2\n\023EventDrivenSchedule\022\033\n\023pubsub_subscr"
          + "iption\030\001 \001(\t\"(\n\010UserInfo\022\022\n\005email\030\001 \001(\tH"
          + "\000\210\001\001B\010\n\006_email\"\233\t\n\016TransferConfig\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\010\022 \n\026destination_dataset_id\030\002"
          + " \001(\tH\000\022\024\n\014display_name\030\003 \001(\t\022\026\n\016data_sou"
          + "rce_id\030\005 \001(\t\022\'\n\006params\030\t \001(\0132\027.google.pr"
          + "otobuf.Struct\022\020\n\010schedule\030\007 \001(\t\022P\n\020sched"
          + "ule_options\030\030 \001(\01326.google.cloud.bigquer"
          + "y.datatransfer.v1.ScheduleOptions\022U\n\023sch"
          + "edule_options_v2\030\037 \001(\01328.google.cloud.bi"
          + "gquery.datatransfer.v1.ScheduleOptionsV2"
          + "\022 \n\030data_refresh_window_days\030\014 \001(\005\022\020\n\010di"
          + "sabled\030\r \001(\010\0224\n\013update_time\030\004 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\0226\n\rnext_run_t"
          + "ime\030\010 \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\022H\n\005state\030\n \001(\01624.google.cloud.bigquer"
          + "y.datatransfer.v1.TransferStateB\003\340A\003\022\017\n\007"
          + "user_id\030\013 \001(\003\022\033\n\016dataset_region\030\016 \001(\tB\003\340"
          + "A\003\022!\n\031notification_pubsub_topic\030\017 \001(\t\022R\n"
          + "\021email_preferences\030\022 \001(\01327.google.cloud."
          + "bigquery.datatransfer.v1.EmailPreference"
          + "s\022M\n\nowner_info\030\033 \001(\0132/.google.cloud.big"
          + "query.datatransfer.v1.UserInfoB\003\340A\003H\001\210\001\001"
          + "\022`\n\030encryption_configuration\030\034 \001(\0132>.goo"
          + "gle.cloud.bigquery.datatransfer.v1.Encry"
          + "ptionConfiguration\022&\n\005error\030  \001(\0132\022.goog"
          + "le.rpc.StatusB\003\340A\003:\271\001\352A\265\001\n2bigquerydatat"
          + "ransfer.googleapis.com/TransferConfig\0224p"
          + "rojects/{project}/transferConfigs/{trans"
          + "fer_config}\022Iprojects/{project}/location"
          + "s/{location}/transferConfigs/{transfer_c"
          + "onfig}B\r\n\013destinationB\r\n\013_owner_info\"M\n\027"
          + "EncryptionConfiguration\0222\n\014kms_key_name\030"
          + "\001 \001(\0132\034.google.protobuf.StringValue\"\377\006\n\013"
          + "TransferRun\022\021\n\004name\030\001 \001(\tB\003\340A\010\0221\n\rschedu"
          + "le_time\030\003 \001(\0132\032.google.protobuf.Timestam"
          + "p\022,\n\010run_time\030\n \001(\0132\032.google.protobuf.Ti"
          + "mestamp\022(\n\014error_status\030\025 \001(\0132\022.google.r"
          + "pc.Status\0223\n\nstart_time\030\004 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\0221\n\010end_time\030\005 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\0224\n\013upd"
          + "ate_time\030\006 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\022,\n\006params\030\t \001(\0132\027.google.protobu"
          + "f.StructB\003\340A\003\022%\n\026destination_dataset_id\030"
          + "\002 \001(\tB\003\340A\003H\000\022\033\n\016data_source_id\030\007 \001(\tB\003\340A"
          + "\003\022C\n\005state\030\010 \001(\01624.google.cloud.bigquery"
          + ".datatransfer.v1.TransferState\022\017\n\007user_i"
          + "d\030\013 \001(\003\022\025\n\010schedule\030\014 \001(\tB\003\340A\003\022&\n\031notifi"
          + "cation_pubsub_topic\030\027 \001(\tB\003\340A\003\022W\n\021email_"
          + "preferences\030\031 \001(\01327.google.cloud.bigquer"
          + "y.datatransfer.v1.EmailPreferencesB\003\340A\003:"
          + "\304\001\352A\300\001\n\'bigquerydatatransfer.googleapis."
          + "com/Run\022?projects/{project}/transferConf"
          + "igs/{transfer_config}/runs/{run}\022Tprojec"
          + "ts/{project}/locations/{location}/transf"
          + "erConfigs/{transfer_config}/runs/{run}B\r"
          + "\n\013destination\"\212\002\n\017TransferMessage\0220\n\014mes"
          + "sage_time\030\001 \001(\0132\032.google.protobuf.Timest"
          + "amp\022X\n\010severity\030\002 \001(\0162F.google.cloud.big"
          + "query.datatransfer.v1.TransferMessage.Me"
          + "ssageSeverity\022\024\n\014message_text\030\003 \001(\t\"U\n\017M"
          + "essageSeverity\022 \n\034MESSAGE_SEVERITY_UNSPE"
          + "CIFIED\020\000\022\010\n\004INFO\020\001\022\013\n\007WARNING\020\002\022\t\n\005ERROR"
          + "\020\003*K\n\014TransferType\022\035\n\031TRANSFER_TYPE_UNSP"
          + "ECIFIED\020\000\022\t\n\005BATCH\020\001\022\r\n\tSTREAMING\020\002\032\002\030\001*"
          + "s\n\rTransferState\022\036\n\032TRANSFER_STATE_UNSPE"
          + "CIFIED\020\000\022\013\n\007PENDING\020\002\022\013\n\007RUNNING\020\003\022\r\n\tSU"
          + "CCEEDED\020\004\022\n\n\006FAILED\020\005\022\r\n\tCANCELLED\020\006B\217\002\n"
          + ")com.google.cloud.bigquery.datatransfer."
          + "v1B\rTransferProtoP\001ZMcloud.google.com/go"
          + "/bigquery/datatransfer/apiv1/datatransfe"
          + "rpb;datatransferpb\242\002\005GCBDT\252\002%Google.Clou"
          + "d.BigQuery.DataTransfer.V1\312\002%Google\\Clou"
          + "d\\BigQuery\\DataTransfer\\V1\352\002)Google::Clo"
          + "ud::Bigquery::DataTransfer::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor,
            new java.lang.String[] {
              "EnableFailureEmail",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor,
            new java.lang.String[] {
              "DisableAutoScheduling", "StartTime", "EndTime",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptionsV2_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptionsV2_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptionsV2_descriptor,
            new java.lang.String[] {
              "TimeBasedSchedule", "ManualSchedule", "EventDrivenSchedule", "Schedule",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_TimeBasedSchedule_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_datatransfer_v1_TimeBasedSchedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_TimeBasedSchedule_descriptor,
            new java.lang.String[] {
              "Schedule", "StartTime", "EndTime",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_ManualSchedule_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_bigquery_datatransfer_v1_ManualSchedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ManualSchedule_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_bigquery_datatransfer_v1_EventDrivenSchedule_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_bigquery_datatransfer_v1_EventDrivenSchedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_EventDrivenSchedule_descriptor,
            new java.lang.String[] {
              "PubsubSubscription",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_UserInfo_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_bigquery_datatransfer_v1_UserInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_UserInfo_descriptor,
            new java.lang.String[] {
              "Email",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "DestinationDatasetId",
              "DisplayName",
              "DataSourceId",
              "Params",
              "Schedule",
              "ScheduleOptions",
              "ScheduleOptionsV2",
              "DataRefreshWindowDays",
              "Disabled",
              "UpdateTime",
              "NextRunTime",
              "State",
              "UserId",
              "DatasetRegion",
              "NotificationPubsubTopic",
              "EmailPreferences",
              "OwnerInfo",
              "EncryptionConfiguration",
              "Error",
              "Destination",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_EncryptionConfiguration_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_bigquery_datatransfer_v1_EncryptionConfiguration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_EncryptionConfiguration_descriptor,
            new java.lang.String[] {
              "KmsKeyName",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor,
            new java.lang.String[] {
              "Name",
              "ScheduleTime",
              "RunTime",
              "ErrorStatus",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Params",
              "DestinationDatasetId",
              "DataSourceId",
              "State",
              "UserId",
              "Schedule",
              "NotificationPubsubTopic",
              "EmailPreferences",
              "Destination",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor,
            new java.lang.String[] {
              "MessageTime", "Severity", "MessageText",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
