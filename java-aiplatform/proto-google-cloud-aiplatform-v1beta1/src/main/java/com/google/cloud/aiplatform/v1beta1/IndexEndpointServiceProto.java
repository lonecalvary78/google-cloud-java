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
// source: google/cloud/aiplatform/v1beta1/index_endpoint_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public final class IndexEndpointServiceProto {
  private IndexEndpointServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetIndexEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetIndexEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteIndexEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteIndexEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployIndexResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployIndexResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployIndexOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/aiplatform/v1beta1/index_"
          + "endpoint_service.proto\022\037google.cloud.aip"
          + "latform.v1beta1\032\034google/api/annotations."
          + "proto\032\027google/api/client.proto\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\0324google/cloud/aiplatform/v1be"
          + "ta1/index_endpoint.proto\032/google/cloud/a"
          + "iplatform/v1beta1/operation.proto\032#googl"
          + "e/longrunning/operations.proto\032\033google/p"
          + "rotobuf/empty.proto\032 google/protobuf/fie"
          + "ld_mask.proto\"\244\001\n\032CreateIndexEndpointReq"
          + "uest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations."
          + "googleapis.com/Location\022K\n\016index_endpoin"
          + "t\030\002 \001(\0132..google.cloud.aiplatform.v1beta"
          + "1.IndexEndpointB\003\340A\002\"{\n$CreateIndexEndpo"
          + "intOperationMetadata\022S\n\020generic_metadata"
          + "\030\001 \001(\01329.google.cloud.aiplatform.v1beta1"
          + ".GenericOperationMetadata\"X\n\027GetIndexEnd"
          + "pointRequest\022=\n\004name\030\001 \001(\tB/\340A\002\372A)\n\'aipl"
          + "atform.googleapis.com/IndexEndpoint\"\320\001\n\031"
          + "ListIndexEndpointsRequest\0229\n\006parent\030\001 \001("
          + "\tB)\340A\002\372A#\n!locations.googleapis.com/Loca"
          + "tion\022\023\n\006filter\030\002 \001(\tB\003\340A\001\022\026\n\tpage_size\030\003"
          + " \001(\005B\003\340A\001\022\027\n\npage_token\030\004 \001(\tB\003\340A\001\0222\n\tre"
          + "ad_mask\030\005 \001(\0132\032.google.protobuf.FieldMas"
          + "kB\003\340A\001\"~\n\032ListIndexEndpointsResponse\022G\n\017"
          + "index_endpoints\030\001 \003(\0132..google.cloud.aip"
          + "latform.v1beta1.IndexEndpoint\022\027\n\017next_pa"
          + "ge_token\030\002 \001(\t\"\237\001\n\032UpdateIndexEndpointRe"
          + "quest\022K\n\016index_endpoint\030\001 \001(\0132..google.c"
          + "loud.aiplatform.v1beta1.IndexEndpointB\003\340"
          + "A\002\0224\n\013update_mask\030\002 \001(\0132\032.google.protobu"
          + "f.FieldMaskB\003\340A\002\"[\n\032DeleteIndexEndpointR"
          + "equest\022=\n\004name\030\001 \001(\tB/\340A\002\372A)\n\'aiplatform"
          + ".googleapis.com/IndexEndpoint\"\252\001\n\022Deploy"
          + "IndexRequest\022G\n\016index_endpoint\030\001 \001(\tB/\340A"
          + "\002\372A)\n\'aiplatform.googleapis.com/IndexEnd"
          + "point\022K\n\016deployed_index\030\002 \001(\0132..google.c"
          + "loud.aiplatform.v1beta1.DeployedIndexB\003\340"
          + "A\002\"]\n\023DeployIndexResponse\022F\n\016deployed_in"
          + "dex\030\001 \001(\0132..google.cloud.aiplatform.v1be"
          + "ta1.DeployedIndex\"\216\001\n\034DeployIndexOperati"
          + "onMetadata\022S\n\020generic_metadata\030\001 \001(\01329.g"
          + "oogle.cloud.aiplatform.v1beta1.GenericOp"
          + "erationMetadata\022\031\n\021deployed_index_id\030\002 \001"
          + "(\t\"\177\n\024UndeployIndexRequest\022G\n\016index_endp"
          + "oint\030\001 \001(\tB/\340A\002\372A)\n\'aiplatform.googleapi"
          + "s.com/IndexEndpoint\022\036\n\021deployed_index_id"
          + "\030\002 \001(\tB\003\340A\002\"\027\n\025UndeployIndexResponse\"u\n\036"
          + "UndeployIndexOperationMetadata\022S\n\020generi"
          + "c_metadata\030\001 \001(\01329.google.cloud.aiplatfo"
          + "rm.v1beta1.GenericOperationMetadata\"\262\001\n\032"
          + "MutateDeployedIndexRequest\022G\n\016index_endp"
          + "oint\030\001 \001(\tB/\340A\002\372A)\n\'aiplatform.googleapi"
          + "s.com/IndexEndpoint\022K\n\016deployed_index\030\002 "
          + "\001(\0132..google.cloud.aiplatform.v1beta1.De"
          + "ployedIndexB\003\340A\002\"e\n\033MutateDeployedIndexR"
          + "esponse\022F\n\016deployed_index\030\001 \001(\0132..google"
          + ".cloud.aiplatform.v1beta1.DeployedIndex\""
          + "\226\001\n$MutateDeployedIndexOperationMetadata"
          + "\022S\n\020generic_metadata\030\001 \001(\01329.google.clou"
          + "d.aiplatform.v1beta1.GenericOperationMet"
          + "adata\022\031\n\021deployed_index_id\030\002 \001(\t2\216\021\n\024Ind"
          + "exEndpointService\022\223\002\n\023CreateIndexEndpoin"
          + "t\022;.google.cloud.aiplatform.v1beta1.Crea"
          + "teIndexEndpointRequest\032\035.google.longrunn"
          + "ing.Operation\"\237\001\312A5\n\rIndexEndpoint\022$Crea"
          + "teIndexEndpointOperationMetadata\332A\025paren"
          + "t,index_endpoint\202\323\344\223\002I\"7/v1beta1/{parent"
          + "=projects/*/locations/*}/indexEndpoints:"
          + "\016index_endpoint\022\304\001\n\020GetIndexEndpoint\0228.g"
          + "oogle.cloud.aiplatform.v1beta1.GetIndexE"
          + "ndpointRequest\032..google.cloud.aiplatform"
          + ".v1beta1.IndexEndpoint\"F\332A\004name\202\323\344\223\0029\0227/"
          + "v1beta1/{name=projects/*/locations/*/ind"
          + "exEndpoints/*}\022\327\001\n\022ListIndexEndpoints\022:."
          + "google.cloud.aiplatform.v1beta1.ListInde"
          + "xEndpointsRequest\032;.google.cloud.aiplatf"
          + "orm.v1beta1.ListIndexEndpointsResponse\"H"
          + "\332A\006parent\202\323\344\223\0029\0227/v1beta1/{parent=projec"
          + "ts/*/locations/*}/indexEndpoints\022\377\001\n\023Upd"
          + "ateIndexEndpoint\022;.google.cloud.aiplatfo"
          + "rm.v1beta1.UpdateIndexEndpointRequest\032.."
          + "google.cloud.aiplatform.v1beta1.IndexEnd"
          + "point\"{\332A\032index_endpoint,update_mask\202\323\344\223"
          + "\002X2F/v1beta1/{index_endpoint.name=projec"
          + "ts/*/locations/*/indexEndpoints/*}:\016inde"
          + "x_endpoint\022\354\001\n\023DeleteIndexEndpoint\022;.goo"
          + "gle.cloud.aiplatform.v1beta1.DeleteIndex"
          + "EndpointRequest\032\035.google.longrunning.Ope"
          + "ration\"y\312A0\n\025google.protobuf.Empty\022\027Dele"
          + "teOperationMetadata\332A\004name\202\323\344\223\0029*7/v1bet"
          + "a1/{name=projects/*/locations/*/indexEnd"
          + "points/*}\022\222\002\n\013DeployIndex\0223.google.cloud"
          + ".aiplatform.v1beta1.DeployIndexRequest\032\035"
          + ".google.longrunning.Operation\"\256\001\312A3\n\023Dep"
          + "loyIndexResponse\022\034DeployIndexOperationMe"
          + "tadata\332A\035index_endpoint,deployed_index\202\323"
          + "\344\223\002R\"M/v1beta1/{index_endpoint=projects/"
          + "*/locations/*/indexEndpoints/*}:deployIn"
          + "dex:\001*\022\237\002\n\rUndeployIndex\0225.google.cloud."
          + "aiplatform.v1beta1.UndeployIndexRequest\032"
          + "\035.google.longrunning.Operation\"\267\001\312A7\n\025Un"
          + "deployIndexResponse\022\036UndeployIndexOperat"
          + "ionMetadata\332A index_endpoint,deployed_in"
          + "dex_id\202\323\344\223\002T\"O/v1beta1/{index_endpoint=p"
          + "rojects/*/locations/*/indexEndpoints/*}:"
          + "undeployIndex:\001*\022\307\002\n\023MutateDeployedIndex"
          + "\022;.google.cloud.aiplatform.v1beta1.Mutat"
          + "eDeployedIndexRequest\032\035.google.longrunni"
          + "ng.Operation\"\323\001\312AC\n\033MutateDeployedIndexR"
          + "esponse\022$MutateDeployedIndexOperationMet"
          + "adata\332A\035index_endpoint,deployed_index\202\323\344"
          + "\223\002g\"U/v1beta1/{index_endpoint=projects/*"
          + "/locations/*/indexEndpoints/*}:mutateDep"
          + "loyedIndex:\016deployed_index\032M\312A\031aiplatfor"
          + "m.googleapis.com\322A.https://www.googleapi"
          + "s.com/auth/cloud-platformB\360\001\n#com.google"
          + ".cloud.aiplatform.v1beta1B\031IndexEndpoint"
          + "ServiceProtoP\001ZCcloud.google.com/go/aipl"
          + "atform/apiv1beta1/aiplatformpb;aiplatfor"
          + "mpb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037"
          + "Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Google"
          + "::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IndexEndpointProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointRequest_descriptor,
            new java.lang.String[] {
              "Parent", "IndexEndpoint",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetIndexEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GetIndexEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetIndexEndpointRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListIndexEndpointsResponse_descriptor,
            new java.lang.String[] {
              "IndexEndpoints", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexEndpointRequest_descriptor,
            new java.lang.String[] {
              "IndexEndpoint", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteIndexEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteIndexEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteIndexEndpointRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_DeployIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployIndexRequest_descriptor,
            new java.lang.String[] {
              "IndexEndpoint", "DeployedIndex",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployIndexResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_DeployIndexResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployIndexResponse_descriptor,
            new java.lang.String[] {
              "DeployedIndex",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployIndexOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_DeployIndexOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployIndexOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "DeployedIndexId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexRequest_descriptor,
            new java.lang.String[] {
              "IndexEndpoint", "DeployedIndexId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexRequest_descriptor,
            new java.lang.String[] {
              "IndexEndpoint", "DeployedIndex",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexResponse_descriptor,
            new java.lang.String[] {
              "DeployedIndex",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedIndexOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "DeployedIndexId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IndexEndpointProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
