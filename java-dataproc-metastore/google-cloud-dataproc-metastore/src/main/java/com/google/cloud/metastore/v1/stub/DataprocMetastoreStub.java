/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.metastore.v1.stub;

import static com.google.cloud.metastore.v1.DataprocMetastoreClient.ListBackupsPagedResponse;
import static com.google.cloud.metastore.v1.DataprocMetastoreClient.ListLocationsPagedResponse;
import static com.google.cloud.metastore.v1.DataprocMetastoreClient.ListMetadataImportsPagedResponse;
import static com.google.cloud.metastore.v1.DataprocMetastoreClient.ListServicesPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.metastore.v1.AlterMetadataResourceLocationRequest;
import com.google.cloud.metastore.v1.AlterMetadataResourceLocationResponse;
import com.google.cloud.metastore.v1.Backup;
import com.google.cloud.metastore.v1.CreateBackupRequest;
import com.google.cloud.metastore.v1.CreateMetadataImportRequest;
import com.google.cloud.metastore.v1.CreateServiceRequest;
import com.google.cloud.metastore.v1.DeleteBackupRequest;
import com.google.cloud.metastore.v1.DeleteServiceRequest;
import com.google.cloud.metastore.v1.ExportMetadataRequest;
import com.google.cloud.metastore.v1.GetBackupRequest;
import com.google.cloud.metastore.v1.GetMetadataImportRequest;
import com.google.cloud.metastore.v1.GetServiceRequest;
import com.google.cloud.metastore.v1.ListBackupsRequest;
import com.google.cloud.metastore.v1.ListBackupsResponse;
import com.google.cloud.metastore.v1.ListMetadataImportsRequest;
import com.google.cloud.metastore.v1.ListMetadataImportsResponse;
import com.google.cloud.metastore.v1.ListServicesRequest;
import com.google.cloud.metastore.v1.ListServicesResponse;
import com.google.cloud.metastore.v1.MetadataExport;
import com.google.cloud.metastore.v1.MetadataImport;
import com.google.cloud.metastore.v1.MoveTableToDatabaseRequest;
import com.google.cloud.metastore.v1.MoveTableToDatabaseResponse;
import com.google.cloud.metastore.v1.OperationMetadata;
import com.google.cloud.metastore.v1.QueryMetadataRequest;
import com.google.cloud.metastore.v1.QueryMetadataResponse;
import com.google.cloud.metastore.v1.Restore;
import com.google.cloud.metastore.v1.RestoreServiceRequest;
import com.google.cloud.metastore.v1.Service;
import com.google.cloud.metastore.v1.UpdateMetadataImportRequest;
import com.google.cloud.metastore.v1.UpdateServiceRequest;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the DataprocMetastore service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class DataprocMetastoreStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<ListServicesRequest, ListServicesPagedResponse> listServicesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listServicesPagedCallable()");
  }

  public UnaryCallable<ListServicesRequest, ListServicesResponse> listServicesCallable() {
    throw new UnsupportedOperationException("Not implemented: listServicesCallable()");
  }

  public UnaryCallable<GetServiceRequest, Service> getServiceCallable() {
    throw new UnsupportedOperationException("Not implemented: getServiceCallable()");
  }

  public OperationCallable<CreateServiceRequest, Service, OperationMetadata>
      createServiceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createServiceOperationCallable()");
  }

  public UnaryCallable<CreateServiceRequest, Operation> createServiceCallable() {
    throw new UnsupportedOperationException("Not implemented: createServiceCallable()");
  }

  public OperationCallable<UpdateServiceRequest, Service, OperationMetadata>
      updateServiceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateServiceOperationCallable()");
  }

  public UnaryCallable<UpdateServiceRequest, Operation> updateServiceCallable() {
    throw new UnsupportedOperationException("Not implemented: updateServiceCallable()");
  }

  public OperationCallable<DeleteServiceRequest, Empty, OperationMetadata>
      deleteServiceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteServiceOperationCallable()");
  }

  public UnaryCallable<DeleteServiceRequest, Operation> deleteServiceCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteServiceCallable()");
  }

  public UnaryCallable<ListMetadataImportsRequest, ListMetadataImportsPagedResponse>
      listMetadataImportsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listMetadataImportsPagedCallable()");
  }

  public UnaryCallable<ListMetadataImportsRequest, ListMetadataImportsResponse>
      listMetadataImportsCallable() {
    throw new UnsupportedOperationException("Not implemented: listMetadataImportsCallable()");
  }

  public UnaryCallable<GetMetadataImportRequest, MetadataImport> getMetadataImportCallable() {
    throw new UnsupportedOperationException("Not implemented: getMetadataImportCallable()");
  }

  public OperationCallable<CreateMetadataImportRequest, MetadataImport, OperationMetadata>
      createMetadataImportOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createMetadataImportOperationCallable()");
  }

  public UnaryCallable<CreateMetadataImportRequest, Operation> createMetadataImportCallable() {
    throw new UnsupportedOperationException("Not implemented: createMetadataImportCallable()");
  }

  public OperationCallable<UpdateMetadataImportRequest, MetadataImport, OperationMetadata>
      updateMetadataImportOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateMetadataImportOperationCallable()");
  }

  public UnaryCallable<UpdateMetadataImportRequest, Operation> updateMetadataImportCallable() {
    throw new UnsupportedOperationException("Not implemented: updateMetadataImportCallable()");
  }

  public OperationCallable<ExportMetadataRequest, MetadataExport, OperationMetadata>
      exportMetadataOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: exportMetadataOperationCallable()");
  }

  public UnaryCallable<ExportMetadataRequest, Operation> exportMetadataCallable() {
    throw new UnsupportedOperationException("Not implemented: exportMetadataCallable()");
  }

  public OperationCallable<RestoreServiceRequest, Restore, OperationMetadata>
      restoreServiceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: restoreServiceOperationCallable()");
  }

  public UnaryCallable<RestoreServiceRequest, Operation> restoreServiceCallable() {
    throw new UnsupportedOperationException("Not implemented: restoreServiceCallable()");
  }

  public UnaryCallable<ListBackupsRequest, ListBackupsPagedResponse> listBackupsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listBackupsPagedCallable()");
  }

  public UnaryCallable<ListBackupsRequest, ListBackupsResponse> listBackupsCallable() {
    throw new UnsupportedOperationException("Not implemented: listBackupsCallable()");
  }

  public UnaryCallable<GetBackupRequest, Backup> getBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: getBackupCallable()");
  }

  public OperationCallable<CreateBackupRequest, Backup, OperationMetadata>
      createBackupOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createBackupOperationCallable()");
  }

  public UnaryCallable<CreateBackupRequest, Operation> createBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: createBackupCallable()");
  }

  public OperationCallable<DeleteBackupRequest, Empty, OperationMetadata>
      deleteBackupOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteBackupOperationCallable()");
  }

  public UnaryCallable<DeleteBackupRequest, Operation> deleteBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteBackupCallable()");
  }

  public OperationCallable<QueryMetadataRequest, QueryMetadataResponse, OperationMetadata>
      queryMetadataOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: queryMetadataOperationCallable()");
  }

  public UnaryCallable<QueryMetadataRequest, Operation> queryMetadataCallable() {
    throw new UnsupportedOperationException("Not implemented: queryMetadataCallable()");
  }

  public OperationCallable<
          MoveTableToDatabaseRequest, MoveTableToDatabaseResponse, OperationMetadata>
      moveTableToDatabaseOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: moveTableToDatabaseOperationCallable()");
  }

  public UnaryCallable<MoveTableToDatabaseRequest, Operation> moveTableToDatabaseCallable() {
    throw new UnsupportedOperationException("Not implemented: moveTableToDatabaseCallable()");
  }

  public OperationCallable<
          AlterMetadataResourceLocationRequest,
          AlterMetadataResourceLocationResponse,
          OperationMetadata>
      alterMetadataResourceLocationOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: alterMetadataResourceLocationOperationCallable()");
  }

  public UnaryCallable<AlterMetadataResourceLocationRequest, Operation>
      alterMetadataResourceLocationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: alterMetadataResourceLocationCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsPagedCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsCallable()");
  }

  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    throw new UnsupportedOperationException("Not implemented: getLocationCallable()");
  }

  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicyCallable()");
  }

  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicyCallable()");
  }

  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    throw new UnsupportedOperationException("Not implemented: testIamPermissionsCallable()");
  }

  @Override
  public abstract void close();
}
