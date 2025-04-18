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
// source: google/cloud/speech/v1/cloud_speech.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.speech.v1;

public final class SpeechProto {
  private SpeechProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_TranscriptOutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_TranscriptOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_VoiceActivityTimeout_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_VoiceActivityTimeout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognitionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_RecognitionMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognitionMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_SpeechContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_RecognitionAudio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognitionAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_RecognizeResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_StreamingRecognitionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_WordInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_WordInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_SpeechAdaptationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechAdaptationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/speech/v1/cloud_speech.pr"
          + "oto\022\026google.cloud.speech.v1\032\034google/api/"
          + "annotations.proto\032\027google/api/client.pro"
          + "to\032\037google/api/field_behavior.proto\032%goo"
          + "gle/cloud/speech/v1/resource.proto\032#goog"
          + "le/longrunning/operations.proto\032\036google/"
          + "protobuf/duration.proto\032\037google/protobuf"
          + "/timestamp.proto\032\036google/protobuf/wrappe"
          + "rs.proto\032\027google/rpc/status.proto\"\220\001\n\020Re"
          + "cognizeRequest\022>\n\006config\030\001 \001(\0132).google."
          + "cloud.speech.v1.RecognitionConfigB\003\340A\002\022<"
          + "\n\005audio\030\002 \001(\0132(.google.cloud.speech.v1.R"
          + "ecognitionAudioB\003\340A\002\"\347\001\n\033LongRunningReco"
          + "gnizeRequest\022>\n\006config\030\001 \001(\0132).google.cl"
          + "oud.speech.v1.RecognitionConfigB\003\340A\002\022<\n\005"
          + "audio\030\002 \001(\0132(.google.cloud.speech.v1.Rec"
          + "ognitionAudioB\003\340A\002\022J\n\routput_config\030\004 \001("
          + "\0132..google.cloud.speech.v1.TranscriptOut"
          + "putConfigB\003\340A\001\":\n\026TranscriptOutputConfig"
          + "\022\021\n\007gcs_uri\030\001 \001(\tH\000B\r\n\013output_type\"\231\001\n\031S"
          + "treamingRecognizeRequest\022N\n\020streaming_co"
          + "nfig\030\001 \001(\01322.google.cloud.speech.v1.Stre"
          + "amingRecognitionConfigH\000\022\027\n\raudio_conten"
          + "t\030\002 \001(\014H\000B\023\n\021streaming_request\"\247\003\n\032Strea"
          + "mingRecognitionConfig\022>\n\006config\030\001 \001(\0132)."
          + "google.cloud.speech.v1.RecognitionConfig"
          + "B\003\340A\002\022\030\n\020single_utterance\030\002 \001(\010\022\027\n\017inter"
          + "im_results\030\003 \001(\010\022$\n\034enable_voice_activit"
          + "y_events\030\005 \001(\010\022g\n\026voice_activity_timeout"
          + "\030\006 \001(\0132G.google.cloud.speech.v1.Streamin"
          + "gRecognitionConfig.VoiceActivityTimeout\032"
          + "\206\001\n\024VoiceActivityTimeout\0227\n\024speech_start"
          + "_timeout\030\001 \001(\0132\031.google.protobuf.Duratio"
          + "n\0225\n\022speech_end_timeout\030\002 \001(\0132\031.google.p"
          + "rotobuf.Duration\"\312\010\n\021RecognitionConfig\022I"
          + "\n\010encoding\030\001 \001(\01627.google.cloud.speech.v"
          + "1.RecognitionConfig.AudioEncoding\022\031\n\021sam"
          + "ple_rate_hertz\030\002 \001(\005\022\033\n\023audio_channel_co"
          + "unt\030\007 \001(\005\022/\n\'enable_separate_recognition"
          + "_per_channel\030\014 \001(\010\022\032\n\rlanguage_code\030\003 \001("
          + "\tB\003\340A\002\022\"\n\032alternative_language_codes\030\022 \003"
          + "(\t\022\030\n\020max_alternatives\030\004 \001(\005\022\030\n\020profanit"
          + "y_filter\030\005 \001(\010\022<\n\nadaptation\030\024 \001(\0132(.goo"
          + "gle.cloud.speech.v1.SpeechAdaptation\022V\n\030"
          + "transcript_normalization\030\030 \001(\0132/.google."
          + "cloud.speech.v1.TranscriptNormalizationB"
          + "\003\340A\001\022>\n\017speech_contexts\030\006 \003(\0132%.google.c"
          + "loud.speech.v1.SpeechContext\022 \n\030enable_w"
          + "ord_time_offsets\030\010 \001(\010\022\036\n\026enable_word_co"
          + "nfidence\030\017 \001(\010\022$\n\034enable_automatic_punct"
          + "uation\030\013 \001(\010\022=\n\031enable_spoken_punctuatio"
          + "n\030\026 \001(\0132\032.google.protobuf.BoolValue\0228\n\024e"
          + "nable_spoken_emojis\030\027 \001(\0132\032.google.proto"
          + "buf.BoolValue\022L\n\022diarization_config\030\023 \001("
          + "\01320.google.cloud.speech.v1.SpeakerDiariz"
          + "ationConfig\022=\n\010metadata\030\t \001(\0132+.google.c"
          + "loud.speech.v1.RecognitionMetadata\022\r\n\005mo"
          + "del\030\r \001(\t\022\024\n\014use_enhanced\030\016 \001(\010\"\243\001\n\rAudi"
          + "oEncoding\022\030\n\024ENCODING_UNSPECIFIED\020\000\022\014\n\010L"
          + "INEAR16\020\001\022\010\n\004FLAC\020\002\022\t\n\005MULAW\020\003\022\007\n\003AMR\020\004\022"
          + "\n\n\006AMR_WB\020\005\022\014\n\010OGG_OPUS\020\006\022\032\n\026SPEEX_WITH_"
          + "HEADER_BYTE\020\007\022\007\n\003MP3\020\010\022\r\n\tWEBM_OPUS\020\t\"\220\001"
          + "\n\030SpeakerDiarizationConfig\022\"\n\032enable_spe"
          + "aker_diarization\030\001 \001(\010\022\031\n\021min_speaker_co"
          + "unt\030\002 \001(\005\022\031\n\021max_speaker_count\030\003 \001(\005\022\032\n\013"
          + "speaker_tag\030\005 \001(\005B\005\030\001\340A\003\"\244\010\n\023Recognition"
          + "Metadata\022U\n\020interaction_type\030\001 \001(\0162;.goo"
          + "gle.cloud.speech.v1.RecognitionMetadata."
          + "InteractionType\022$\n\034industry_naics_code_o"
          + "f_audio\030\003 \001(\r\022[\n\023microphone_distance\030\004 \001"
          + "(\0162>.google.cloud.speech.v1.RecognitionM"
          + "etadata.MicrophoneDistance\022Z\n\023original_m"
          + "edia_type\030\005 \001(\0162=.google.cloud.speech.v1"
          + ".RecognitionMetadata.OriginalMediaType\022^"
          + "\n\025recording_device_type\030\006 \001(\0162?.google.c"
          + "loud.speech.v1.RecognitionMetadata.Recor"
          + "dingDeviceType\022\035\n\025recording_device_name\030"
          + "\007 \001(\t\022\032\n\022original_mime_type\030\010 \001(\t\022\023\n\013aud"
          + "io_topic\030\n \001(\t\"\305\001\n\017InteractionType\022 \n\034IN"
          + "TERACTION_TYPE_UNSPECIFIED\020\000\022\016\n\nDISCUSSI"
          + "ON\020\001\022\020\n\014PRESENTATION\020\002\022\016\n\nPHONE_CALL\020\003\022\r"
          + "\n\tVOICEMAIL\020\004\022\033\n\027PROFESSIONALLY_PRODUCED"
          + "\020\005\022\020\n\014VOICE_SEARCH\020\006\022\021\n\rVOICE_COMMAND\020\007\022"
          + "\r\n\tDICTATION\020\010\"d\n\022MicrophoneDistance\022#\n\037"
          + "MICROPHONE_DISTANCE_UNSPECIFIED\020\000\022\r\n\tNEA"
          + "RFIELD\020\001\022\014\n\010MIDFIELD\020\002\022\014\n\010FARFIELD\020\003\"N\n\021"
          + "OriginalMediaType\022#\n\037ORIGINAL_MEDIA_TYPE"
          + "_UNSPECIFIED\020\000\022\t\n\005AUDIO\020\001\022\t\n\005VIDEO\020\002\"\244\001\n"
          + "\023RecordingDeviceType\022%\n!RECORDING_DEVICE"
          + "_TYPE_UNSPECIFIED\020\000\022\016\n\nSMARTPHONE\020\001\022\006\n\002P"
          + "C\020\002\022\016\n\nPHONE_LINE\020\003\022\013\n\007VEHICLE\020\004\022\030\n\024OTHE"
          + "R_OUTDOOR_DEVICE\020\005\022\027\n\023OTHER_INDOOR_DEVIC"
          + "E\020\006:\002\030\001\"/\n\rSpeechContext\022\017\n\007phrases\030\001 \003("
          + "\t\022\r\n\005boost\030\004 \001(\002\"D\n\020RecognitionAudio\022\021\n\007"
          + "content\030\001 \001(\014H\000\022\r\n\003uri\030\002 \001(\tH\000B\016\n\014audio_"
          + "source\"\355\001\n\021RecognizeResponse\022@\n\007results\030"
          + "\002 \003(\0132/.google.cloud.speech.v1.SpeechRec"
          + "ognitionResult\0224\n\021total_billed_time\030\003 \001("
          + "\0132\031.google.protobuf.Duration\022L\n\026speech_a"
          + "daptation_info\030\007 \001(\0132,.google.cloud.spee"
          + "ch.v1.SpeechAdaptationInfo\022\022\n\nrequest_id"
          + "\030\010 \001(\003\"\351\002\n\034LongRunningRecognizeResponse\022"
          + "@\n\007results\030\002 \003(\0132/.google.cloud.speech.v"
          + "1.SpeechRecognitionResult\0224\n\021total_bille"
          + "d_time\030\003 \001(\0132\031.google.protobuf.Duration\022"
          + "E\n\routput_config\030\006 \001(\0132..google.cloud.sp"
          + "eech.v1.TranscriptOutputConfig\022(\n\014output"
          + "_error\030\007 \001(\0132\022.google.rpc.Status\022L\n\026spee"
          + "ch_adaptation_info\030\010 \001(\0132,.google.cloud."
          + "speech.v1.SpeechAdaptationInfo\022\022\n\nreques"
          + "t_id\030\t \001(\003\"\260\001\n\034LongRunningRecognizeMetad"
          + "ata\022\030\n\020progress_percent\030\001 \001(\005\022.\n\nstart_t"
          + "ime\030\002 \001(\0132\032.google.protobuf.Timestamp\0224\n"
          + "\020last_update_time\030\003 \001(\0132\032.google.protobu"
          + "f.Timestamp\022\020\n\003uri\030\004 \001(\tB\003\340A\003\"\321\004\n\032Stream"
          + "ingRecognizeResponse\022!\n\005error\030\001 \001(\0132\022.go"
          + "ogle.rpc.Status\022C\n\007results\030\002 \003(\01322.googl"
          + "e.cloud.speech.v1.StreamingRecognitionRe"
          + "sult\022]\n\021speech_event_type\030\004 \001(\0162B.google"
          + ".cloud.speech.v1.StreamingRecognizeRespo"
          + "nse.SpeechEventType\0224\n\021speech_event_time"
          + "\030\010 \001(\0132\031.google.protobuf.Duration\0224\n\021tot"
          + "al_billed_time\030\005 \001(\0132\031.google.protobuf.D"
          + "uration\022L\n\026speech_adaptation_info\030\t \001(\0132"
          + ",.google.cloud.speech.v1.SpeechAdaptatio"
          + "nInfo\022\022\n\nrequest_id\030\n \001(\003\"\235\001\n\017SpeechEven"
          + "tType\022\034\n\030SPEECH_EVENT_UNSPECIFIED\020\000\022\033\n\027E"
          + "ND_OF_SINGLE_UTTERANCE\020\001\022\031\n\025SPEECH_ACTIV"
          + "ITY_BEGIN\020\002\022\027\n\023SPEECH_ACTIVITY_END\020\003\022\033\n\027"
          + "SPEECH_ACTIVITY_TIMEOUT\020\004\"\362\001\n\032StreamingR"
          + "ecognitionResult\022J\n\014alternatives\030\001 \003(\01324"
          + ".google.cloud.speech.v1.SpeechRecognitio"
          + "nAlternative\022\020\n\010is_final\030\002 \001(\010\022\021\n\tstabil"
          + "ity\030\003 \001(\002\0222\n\017result_end_time\030\004 \001(\0132\031.goo"
          + "gle.protobuf.Duration\022\023\n\013channel_tag\030\005 \001"
          + "(\005\022\032\n\rlanguage_code\030\006 \001(\tB\003\340A\003\"\312\001\n\027Speec"
          + "hRecognitionResult\022J\n\014alternatives\030\001 \003(\013"
          + "24.google.cloud.speech.v1.SpeechRecognit"
          + "ionAlternative\022\023\n\013channel_tag\030\002 \001(\005\0222\n\017r"
          + "esult_end_time\030\004 \001(\0132\031.google.protobuf.D"
          + "uration\022\032\n\rlanguage_code\030\005 \001(\tB\003\340A\003\"w\n\034S"
          + "peechRecognitionAlternative\022\022\n\ntranscrip"
          + "t\030\001 \001(\t\022\022\n\nconfidence\030\002 \001(\002\022/\n\005words\030\003 \003"
          + "(\0132 .google.cloud.speech.v1.WordInfo\"\300\001\n"
          + "\010WordInfo\022-\n\nstart_time\030\001 \001(\0132\031.google.p"
          + "rotobuf.Duration\022+\n\010end_time\030\002 \001(\0132\031.goo"
          + "gle.protobuf.Duration\022\014\n\004word\030\003 \001(\t\022\022\n\nc"
          + "onfidence\030\004 \001(\002\022\032\n\013speaker_tag\030\005 \001(\005B\005\030\001"
          + "\340A\003\022\032\n\rspeaker_label\030\006 \001(\tB\003\340A\003\"K\n\024Speec"
          + "hAdaptationInfo\022\032\n\022adaptation_timeout\030\001 "
          + "\001(\010\022\027\n\017timeout_message\030\004 \001(\t2\321\004\n\006Speech\022"
          + "\220\001\n\tRecognize\022(.google.cloud.speech.v1.R"
          + "ecognizeRequest\032).google.cloud.speech.v1"
          + ".RecognizeResponse\".\332A\014config,audio\202\323\344\223\002"
          + "\031\"\024/v1/speech:recognize:\001*\022\344\001\n\024LongRunni"
          + "ngRecognize\0223.google.cloud.speech.v1.Lon"
          + "gRunningRecognizeRequest\032\035.google.longru"
          + "nning.Operation\"x\312A<\n\034LongRunningRecogni"
          + "zeResponse\022\034LongRunningRecognizeMetadata"
          + "\332A\014config,audio\202\323\344\223\002$\"\037/v1/speech:longru"
          + "nningrecognize:\001*\022\201\001\n\022StreamingRecognize"
          + "\0221.google.cloud.speech.v1.StreamingRecog"
          + "nizeRequest\0322.google.cloud.speech.v1.Str"
          + "eamingRecognizeResponse\"\000(\0010\001\032I\312A\025speech"
          + ".googleapis.com\322A.https://www.googleapis"
          + ".com/auth/cloud-platformBh\n\032com.google.c"
          + "loud.speech.v1B\013SpeechProtoP\001Z2cloud.goo"
          + "gle.com/go/speech/apiv1/speechpb;speechp"
          + "b\370\001\001\242\002\003GCSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.speech.v1.SpeechResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_speech_v1_RecognizeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor,
            new java.lang.String[] {
              "Config", "Audio",
            });
    internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_descriptor,
            new java.lang.String[] {
              "Config", "Audio", "OutputConfig",
            });
    internal_static_google_cloud_speech_v1_TranscriptOutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_speech_v1_TranscriptOutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_TranscriptOutputConfig_descriptor,
            new java.lang.String[] {
              "GcsUri", "OutputType",
            });
    internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor,
            new java.lang.String[] {
              "StreamingConfig", "AudioContent", "StreamingRequest",
            });
    internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor,
            new java.lang.String[] {
              "Config",
              "SingleUtterance",
              "InterimResults",
              "EnableVoiceActivityEvents",
              "VoiceActivityTimeout",
            });
    internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_VoiceActivityTimeout_descriptor =
        internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_VoiceActivityTimeout_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_VoiceActivityTimeout_descriptor,
            new java.lang.String[] {
              "SpeechStartTimeout", "SpeechEndTimeout",
            });
    internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_speech_v1_RecognitionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor,
            new java.lang.String[] {
              "Encoding",
              "SampleRateHertz",
              "AudioChannelCount",
              "EnableSeparateRecognitionPerChannel",
              "LanguageCode",
              "AlternativeLanguageCodes",
              "MaxAlternatives",
              "ProfanityFilter",
              "Adaptation",
              "TranscriptNormalization",
              "SpeechContexts",
              "EnableWordTimeOffsets",
              "EnableWordConfidence",
              "EnableAutomaticPunctuation",
              "EnableSpokenPunctuation",
              "EnableSpokenEmojis",
              "DiarizationConfig",
              "Metadata",
              "Model",
              "UseEnhanced",
            });
    internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_descriptor,
            new java.lang.String[] {
              "EnableSpeakerDiarization", "MinSpeakerCount", "MaxSpeakerCount", "SpeakerTag",
            });
    internal_static_google_cloud_speech_v1_RecognitionMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_speech_v1_RecognitionMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_RecognitionMetadata_descriptor,
            new java.lang.String[] {
              "InteractionType",
              "IndustryNaicsCodeOfAudio",
              "MicrophoneDistance",
              "OriginalMediaType",
              "RecordingDeviceType",
              "RecordingDeviceName",
              "OriginalMimeType",
              "AudioTopic",
            });
    internal_static_google_cloud_speech_v1_SpeechContext_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_speech_v1_SpeechContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_SpeechContext_descriptor,
            new java.lang.String[] {
              "Phrases", "Boost",
            });
    internal_static_google_cloud_speech_v1_RecognitionAudio_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_speech_v1_RecognitionAudio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_RecognitionAudio_descriptor,
            new java.lang.String[] {
              "Content", "Uri", "AudioSource",
            });
    internal_static_google_cloud_speech_v1_RecognizeResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_speech_v1_RecognizeResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_RecognizeResponse_descriptor,
            new java.lang.String[] {
              "Results", "TotalBilledTime", "SpeechAdaptationInfo", "RequestId",
            });
    internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_descriptor,
            new java.lang.String[] {
              "Results",
              "TotalBilledTime",
              "OutputConfig",
              "OutputError",
              "SpeechAdaptationInfo",
              "RequestId",
            });
    internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor,
            new java.lang.String[] {
              "ProgressPercent", "StartTime", "LastUpdateTime", "Uri",
            });
    internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor,
            new java.lang.String[] {
              "Error",
              "Results",
              "SpeechEventType",
              "SpeechEventTime",
              "TotalBilledTime",
              "SpeechAdaptationInfo",
              "RequestId",
            });
    internal_static_google_cloud_speech_v1_StreamingRecognitionResult_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_speech_v1_StreamingRecognitionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_StreamingRecognitionResult_descriptor,
            new java.lang.String[] {
              "Alternatives", "IsFinal", "Stability", "ResultEndTime", "ChannelTag", "LanguageCode",
            });
    internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_speech_v1_SpeechRecognitionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor,
            new java.lang.String[] {
              "Alternatives", "ChannelTag", "ResultEndTime", "LanguageCode",
            });
    internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor,
            new java.lang.String[] {
              "Transcript", "Confidence", "Words",
            });
    internal_static_google_cloud_speech_v1_WordInfo_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_speech_v1_WordInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_WordInfo_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime", "Word", "Confidence", "SpeakerTag", "SpeakerLabel",
            });
    internal_static_google_cloud_speech_v1_SpeechAdaptationInfo_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_speech_v1_SpeechAdaptationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_SpeechAdaptationInfo_descriptor,
            new java.lang.String[] {
              "AdaptationTimeout", "TimeoutMessage",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.speech.v1.SpeechResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
