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

package com.google.cloud.aiplatform.v1.stub;

import static com.google.cloud.aiplatform.v1.JobServiceClient.ListBatchPredictionJobsPagedResponse;
import static com.google.cloud.aiplatform.v1.JobServiceClient.ListCustomJobsPagedResponse;
import static com.google.cloud.aiplatform.v1.JobServiceClient.ListDataLabelingJobsPagedResponse;
import static com.google.cloud.aiplatform.v1.JobServiceClient.ListHyperparameterTuningJobsPagedResponse;
import static com.google.cloud.aiplatform.v1.JobServiceClient.ListLocationsPagedResponse;
import static com.google.cloud.aiplatform.v1.JobServiceClient.ListModelDeploymentMonitoringJobsPagedResponse;
import static com.google.cloud.aiplatform.v1.JobServiceClient.ListNasJobsPagedResponse;
import static com.google.cloud.aiplatform.v1.JobServiceClient.ListNasTrialDetailsPagedResponse;
import static com.google.cloud.aiplatform.v1.JobServiceClient.SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1.BatchPredictionJob;
import com.google.cloud.aiplatform.v1.CancelBatchPredictionJobRequest;
import com.google.cloud.aiplatform.v1.CancelCustomJobRequest;
import com.google.cloud.aiplatform.v1.CancelDataLabelingJobRequest;
import com.google.cloud.aiplatform.v1.CancelHyperparameterTuningJobRequest;
import com.google.cloud.aiplatform.v1.CancelNasJobRequest;
import com.google.cloud.aiplatform.v1.CreateBatchPredictionJobRequest;
import com.google.cloud.aiplatform.v1.CreateCustomJobRequest;
import com.google.cloud.aiplatform.v1.CreateDataLabelingJobRequest;
import com.google.cloud.aiplatform.v1.CreateHyperparameterTuningJobRequest;
import com.google.cloud.aiplatform.v1.CreateModelDeploymentMonitoringJobRequest;
import com.google.cloud.aiplatform.v1.CreateNasJobRequest;
import com.google.cloud.aiplatform.v1.CustomJob;
import com.google.cloud.aiplatform.v1.DataLabelingJob;
import com.google.cloud.aiplatform.v1.DeleteBatchPredictionJobRequest;
import com.google.cloud.aiplatform.v1.DeleteCustomJobRequest;
import com.google.cloud.aiplatform.v1.DeleteDataLabelingJobRequest;
import com.google.cloud.aiplatform.v1.DeleteHyperparameterTuningJobRequest;
import com.google.cloud.aiplatform.v1.DeleteModelDeploymentMonitoringJobRequest;
import com.google.cloud.aiplatform.v1.DeleteNasJobRequest;
import com.google.cloud.aiplatform.v1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1.GetBatchPredictionJobRequest;
import com.google.cloud.aiplatform.v1.GetCustomJobRequest;
import com.google.cloud.aiplatform.v1.GetDataLabelingJobRequest;
import com.google.cloud.aiplatform.v1.GetHyperparameterTuningJobRequest;
import com.google.cloud.aiplatform.v1.GetModelDeploymentMonitoringJobRequest;
import com.google.cloud.aiplatform.v1.GetNasJobRequest;
import com.google.cloud.aiplatform.v1.GetNasTrialDetailRequest;
import com.google.cloud.aiplatform.v1.HyperparameterTuningJob;
import com.google.cloud.aiplatform.v1.ListBatchPredictionJobsRequest;
import com.google.cloud.aiplatform.v1.ListBatchPredictionJobsResponse;
import com.google.cloud.aiplatform.v1.ListCustomJobsRequest;
import com.google.cloud.aiplatform.v1.ListCustomJobsResponse;
import com.google.cloud.aiplatform.v1.ListDataLabelingJobsRequest;
import com.google.cloud.aiplatform.v1.ListDataLabelingJobsResponse;
import com.google.cloud.aiplatform.v1.ListHyperparameterTuningJobsRequest;
import com.google.cloud.aiplatform.v1.ListHyperparameterTuningJobsResponse;
import com.google.cloud.aiplatform.v1.ListModelDeploymentMonitoringJobsRequest;
import com.google.cloud.aiplatform.v1.ListModelDeploymentMonitoringJobsResponse;
import com.google.cloud.aiplatform.v1.ListNasJobsRequest;
import com.google.cloud.aiplatform.v1.ListNasJobsResponse;
import com.google.cloud.aiplatform.v1.ListNasTrialDetailsRequest;
import com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse;
import com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob;
import com.google.cloud.aiplatform.v1.ModelMonitoringStatsAnomalies;
import com.google.cloud.aiplatform.v1.NasJob;
import com.google.cloud.aiplatform.v1.NasTrialDetail;
import com.google.cloud.aiplatform.v1.PauseModelDeploymentMonitoringJobRequest;
import com.google.cloud.aiplatform.v1.ResumeModelDeploymentMonitoringJobRequest;
import com.google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest;
import com.google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesResponse;
import com.google.cloud.aiplatform.v1.UpdateModelDeploymentMonitoringJobOperationMetadata;
import com.google.cloud.aiplatform.v1.UpdateModelDeploymentMonitoringJobRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link JobServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (aiplatform.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createCustomJob:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * JobServiceStubSettings.Builder jobServiceSettingsBuilder = JobServiceStubSettings.newBuilder();
 * jobServiceSettingsBuilder
 *     .createCustomJobSettings()
 *     .setRetrySettings(
 *         jobServiceSettingsBuilder
 *             .createCustomJobSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * JobServiceStubSettings jobServiceSettings = jobServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for deleteCustomJob:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * JobServiceStubSettings.Builder jobServiceSettingsBuilder = JobServiceStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * jobServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class JobServiceStubSettings extends StubSettings<JobServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloud-platform.read-only")
          .build();

  private final UnaryCallSettings<CreateCustomJobRequest, CustomJob> createCustomJobSettings;
  private final UnaryCallSettings<GetCustomJobRequest, CustomJob> getCustomJobSettings;
  private final PagedCallSettings<
          ListCustomJobsRequest, ListCustomJobsResponse, ListCustomJobsPagedResponse>
      listCustomJobsSettings;
  private final UnaryCallSettings<DeleteCustomJobRequest, Operation> deleteCustomJobSettings;
  private final OperationCallSettings<DeleteCustomJobRequest, Empty, DeleteOperationMetadata>
      deleteCustomJobOperationSettings;
  private final UnaryCallSettings<CancelCustomJobRequest, Empty> cancelCustomJobSettings;
  private final UnaryCallSettings<CreateDataLabelingJobRequest, DataLabelingJob>
      createDataLabelingJobSettings;
  private final UnaryCallSettings<GetDataLabelingJobRequest, DataLabelingJob>
      getDataLabelingJobSettings;
  private final PagedCallSettings<
          ListDataLabelingJobsRequest,
          ListDataLabelingJobsResponse,
          ListDataLabelingJobsPagedResponse>
      listDataLabelingJobsSettings;
  private final UnaryCallSettings<DeleteDataLabelingJobRequest, Operation>
      deleteDataLabelingJobSettings;
  private final OperationCallSettings<DeleteDataLabelingJobRequest, Empty, DeleteOperationMetadata>
      deleteDataLabelingJobOperationSettings;
  private final UnaryCallSettings<CancelDataLabelingJobRequest, Empty>
      cancelDataLabelingJobSettings;
  private final UnaryCallSettings<CreateHyperparameterTuningJobRequest, HyperparameterTuningJob>
      createHyperparameterTuningJobSettings;
  private final UnaryCallSettings<GetHyperparameterTuningJobRequest, HyperparameterTuningJob>
      getHyperparameterTuningJobSettings;
  private final PagedCallSettings<
          ListHyperparameterTuningJobsRequest,
          ListHyperparameterTuningJobsResponse,
          ListHyperparameterTuningJobsPagedResponse>
      listHyperparameterTuningJobsSettings;
  private final UnaryCallSettings<DeleteHyperparameterTuningJobRequest, Operation>
      deleteHyperparameterTuningJobSettings;
  private final OperationCallSettings<
          DeleteHyperparameterTuningJobRequest, Empty, DeleteOperationMetadata>
      deleteHyperparameterTuningJobOperationSettings;
  private final UnaryCallSettings<CancelHyperparameterTuningJobRequest, Empty>
      cancelHyperparameterTuningJobSettings;
  private final UnaryCallSettings<CreateNasJobRequest, NasJob> createNasJobSettings;
  private final UnaryCallSettings<GetNasJobRequest, NasJob> getNasJobSettings;
  private final PagedCallSettings<ListNasJobsRequest, ListNasJobsResponse, ListNasJobsPagedResponse>
      listNasJobsSettings;
  private final UnaryCallSettings<DeleteNasJobRequest, Operation> deleteNasJobSettings;
  private final OperationCallSettings<DeleteNasJobRequest, Empty, DeleteOperationMetadata>
      deleteNasJobOperationSettings;
  private final UnaryCallSettings<CancelNasJobRequest, Empty> cancelNasJobSettings;
  private final UnaryCallSettings<GetNasTrialDetailRequest, NasTrialDetail>
      getNasTrialDetailSettings;
  private final PagedCallSettings<
          ListNasTrialDetailsRequest, ListNasTrialDetailsResponse, ListNasTrialDetailsPagedResponse>
      listNasTrialDetailsSettings;
  private final UnaryCallSettings<CreateBatchPredictionJobRequest, BatchPredictionJob>
      createBatchPredictionJobSettings;
  private final UnaryCallSettings<GetBatchPredictionJobRequest, BatchPredictionJob>
      getBatchPredictionJobSettings;
  private final PagedCallSettings<
          ListBatchPredictionJobsRequest,
          ListBatchPredictionJobsResponse,
          ListBatchPredictionJobsPagedResponse>
      listBatchPredictionJobsSettings;
  private final UnaryCallSettings<DeleteBatchPredictionJobRequest, Operation>
      deleteBatchPredictionJobSettings;
  private final OperationCallSettings<
          DeleteBatchPredictionJobRequest, Empty, DeleteOperationMetadata>
      deleteBatchPredictionJobOperationSettings;
  private final UnaryCallSettings<CancelBatchPredictionJobRequest, Empty>
      cancelBatchPredictionJobSettings;
  private final UnaryCallSettings<
          CreateModelDeploymentMonitoringJobRequest, ModelDeploymentMonitoringJob>
      createModelDeploymentMonitoringJobSettings;
  private final PagedCallSettings<
          SearchModelDeploymentMonitoringStatsAnomaliesRequest,
          SearchModelDeploymentMonitoringStatsAnomaliesResponse,
          SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse>
      searchModelDeploymentMonitoringStatsAnomaliesSettings;
  private final UnaryCallSettings<
          GetModelDeploymentMonitoringJobRequest, ModelDeploymentMonitoringJob>
      getModelDeploymentMonitoringJobSettings;
  private final PagedCallSettings<
          ListModelDeploymentMonitoringJobsRequest,
          ListModelDeploymentMonitoringJobsResponse,
          ListModelDeploymentMonitoringJobsPagedResponse>
      listModelDeploymentMonitoringJobsSettings;
  private final UnaryCallSettings<UpdateModelDeploymentMonitoringJobRequest, Operation>
      updateModelDeploymentMonitoringJobSettings;
  private final OperationCallSettings<
          UpdateModelDeploymentMonitoringJobRequest,
          ModelDeploymentMonitoringJob,
          UpdateModelDeploymentMonitoringJobOperationMetadata>
      updateModelDeploymentMonitoringJobOperationSettings;
  private final UnaryCallSettings<DeleteModelDeploymentMonitoringJobRequest, Operation>
      deleteModelDeploymentMonitoringJobSettings;
  private final OperationCallSettings<
          DeleteModelDeploymentMonitoringJobRequest, Empty, DeleteOperationMetadata>
      deleteModelDeploymentMonitoringJobOperationSettings;
  private final UnaryCallSettings<PauseModelDeploymentMonitoringJobRequest, Empty>
      pauseModelDeploymentMonitoringJobSettings;
  private final UnaryCallSettings<ResumeModelDeploymentMonitoringJobRequest, Empty>
      resumeModelDeploymentMonitoringJobSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;
  private final UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings;
  private final UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings;
  private final UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings;

  private static final PagedListDescriptor<ListCustomJobsRequest, ListCustomJobsResponse, CustomJob>
      LIST_CUSTOM_JOBS_PAGE_STR_DESC =
          new PagedListDescriptor<ListCustomJobsRequest, ListCustomJobsResponse, CustomJob>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListCustomJobsRequest injectToken(ListCustomJobsRequest payload, String token) {
              return ListCustomJobsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListCustomJobsRequest injectPageSize(
                ListCustomJobsRequest payload, int pageSize) {
              return ListCustomJobsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListCustomJobsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListCustomJobsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<CustomJob> extractResources(ListCustomJobsResponse payload) {
              return payload.getCustomJobsList();
            }
          };

  private static final PagedListDescriptor<
          ListDataLabelingJobsRequest, ListDataLabelingJobsResponse, DataLabelingJob>
      LIST_DATA_LABELING_JOBS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListDataLabelingJobsRequest, ListDataLabelingJobsResponse, DataLabelingJob>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListDataLabelingJobsRequest injectToken(
                ListDataLabelingJobsRequest payload, String token) {
              return ListDataLabelingJobsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListDataLabelingJobsRequest injectPageSize(
                ListDataLabelingJobsRequest payload, int pageSize) {
              return ListDataLabelingJobsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListDataLabelingJobsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListDataLabelingJobsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<DataLabelingJob> extractResources(
                ListDataLabelingJobsResponse payload) {
              return payload.getDataLabelingJobsList();
            }
          };

  private static final PagedListDescriptor<
          ListHyperparameterTuningJobsRequest,
          ListHyperparameterTuningJobsResponse,
          HyperparameterTuningJob>
      LIST_HYPERPARAMETER_TUNING_JOBS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListHyperparameterTuningJobsRequest,
              ListHyperparameterTuningJobsResponse,
              HyperparameterTuningJob>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListHyperparameterTuningJobsRequest injectToken(
                ListHyperparameterTuningJobsRequest payload, String token) {
              return ListHyperparameterTuningJobsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListHyperparameterTuningJobsRequest injectPageSize(
                ListHyperparameterTuningJobsRequest payload, int pageSize) {
              return ListHyperparameterTuningJobsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListHyperparameterTuningJobsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListHyperparameterTuningJobsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<HyperparameterTuningJob> extractResources(
                ListHyperparameterTuningJobsResponse payload) {
              return payload.getHyperparameterTuningJobsList();
            }
          };

  private static final PagedListDescriptor<ListNasJobsRequest, ListNasJobsResponse, NasJob>
      LIST_NAS_JOBS_PAGE_STR_DESC =
          new PagedListDescriptor<ListNasJobsRequest, ListNasJobsResponse, NasJob>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListNasJobsRequest injectToken(ListNasJobsRequest payload, String token) {
              return ListNasJobsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListNasJobsRequest injectPageSize(ListNasJobsRequest payload, int pageSize) {
              return ListNasJobsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListNasJobsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListNasJobsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<NasJob> extractResources(ListNasJobsResponse payload) {
              return payload.getNasJobsList();
            }
          };

  private static final PagedListDescriptor<
          ListNasTrialDetailsRequest, ListNasTrialDetailsResponse, NasTrialDetail>
      LIST_NAS_TRIAL_DETAILS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListNasTrialDetailsRequest, ListNasTrialDetailsResponse, NasTrialDetail>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListNasTrialDetailsRequest injectToken(
                ListNasTrialDetailsRequest payload, String token) {
              return ListNasTrialDetailsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListNasTrialDetailsRequest injectPageSize(
                ListNasTrialDetailsRequest payload, int pageSize) {
              return ListNasTrialDetailsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListNasTrialDetailsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListNasTrialDetailsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<NasTrialDetail> extractResources(ListNasTrialDetailsResponse payload) {
              return payload.getNasTrialDetailsList();
            }
          };

  private static final PagedListDescriptor<
          ListBatchPredictionJobsRequest, ListBatchPredictionJobsResponse, BatchPredictionJob>
      LIST_BATCH_PREDICTION_JOBS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListBatchPredictionJobsRequest,
              ListBatchPredictionJobsResponse,
              BatchPredictionJob>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListBatchPredictionJobsRequest injectToken(
                ListBatchPredictionJobsRequest payload, String token) {
              return ListBatchPredictionJobsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListBatchPredictionJobsRequest injectPageSize(
                ListBatchPredictionJobsRequest payload, int pageSize) {
              return ListBatchPredictionJobsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListBatchPredictionJobsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListBatchPredictionJobsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<BatchPredictionJob> extractResources(
                ListBatchPredictionJobsResponse payload) {
              return payload.getBatchPredictionJobsList();
            }
          };

  private static final PagedListDescriptor<
          SearchModelDeploymentMonitoringStatsAnomaliesRequest,
          SearchModelDeploymentMonitoringStatsAnomaliesResponse,
          ModelMonitoringStatsAnomalies>
      SEARCH_MODEL_DEPLOYMENT_MONITORING_STATS_ANOMALIES_PAGE_STR_DESC =
          new PagedListDescriptor<
              SearchModelDeploymentMonitoringStatsAnomaliesRequest,
              SearchModelDeploymentMonitoringStatsAnomaliesResponse,
              ModelMonitoringStatsAnomalies>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public SearchModelDeploymentMonitoringStatsAnomaliesRequest injectToken(
                SearchModelDeploymentMonitoringStatsAnomaliesRequest payload, String token) {
              return SearchModelDeploymentMonitoringStatsAnomaliesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public SearchModelDeploymentMonitoringStatsAnomaliesRequest injectPageSize(
                SearchModelDeploymentMonitoringStatsAnomaliesRequest payload, int pageSize) {
              return SearchModelDeploymentMonitoringStatsAnomaliesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                SearchModelDeploymentMonitoringStatsAnomaliesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(
                SearchModelDeploymentMonitoringStatsAnomaliesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ModelMonitoringStatsAnomalies> extractResources(
                SearchModelDeploymentMonitoringStatsAnomaliesResponse payload) {
              return payload.getMonitoringStatsList();
            }
          };

  private static final PagedListDescriptor<
          ListModelDeploymentMonitoringJobsRequest,
          ListModelDeploymentMonitoringJobsResponse,
          ModelDeploymentMonitoringJob>
      LIST_MODEL_DEPLOYMENT_MONITORING_JOBS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListModelDeploymentMonitoringJobsRequest,
              ListModelDeploymentMonitoringJobsResponse,
              ModelDeploymentMonitoringJob>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListModelDeploymentMonitoringJobsRequest injectToken(
                ListModelDeploymentMonitoringJobsRequest payload, String token) {
              return ListModelDeploymentMonitoringJobsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListModelDeploymentMonitoringJobsRequest injectPageSize(
                ListModelDeploymentMonitoringJobsRequest payload, int pageSize) {
              return ListModelDeploymentMonitoringJobsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListModelDeploymentMonitoringJobsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListModelDeploymentMonitoringJobsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ModelDeploymentMonitoringJob> extractResources(
                ListModelDeploymentMonitoringJobsResponse payload) {
              return payload.getModelDeploymentMonitoringJobsList();
            }
          };

  private static final PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>
      LIST_LOCATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListLocationsRequest injectToken(ListLocationsRequest payload, String token) {
              return ListLocationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListLocationsRequest injectPageSize(ListLocationsRequest payload, int pageSize) {
              return ListLocationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListLocationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListLocationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Location> extractResources(ListLocationsResponse payload) {
              return payload.getLocationsList();
            }
          };

  private static final PagedListResponseFactory<
          ListCustomJobsRequest, ListCustomJobsResponse, ListCustomJobsPagedResponse>
      LIST_CUSTOM_JOBS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListCustomJobsRequest, ListCustomJobsResponse, ListCustomJobsPagedResponse>() {
            @Override
            public ApiFuture<ListCustomJobsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListCustomJobsRequest, ListCustomJobsResponse> callable,
                ListCustomJobsRequest request,
                ApiCallContext context,
                ApiFuture<ListCustomJobsResponse> futureResponse) {
              PageContext<ListCustomJobsRequest, ListCustomJobsResponse, CustomJob> pageContext =
                  PageContext.create(callable, LIST_CUSTOM_JOBS_PAGE_STR_DESC, request, context);
              return ListCustomJobsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListDataLabelingJobsRequest,
          ListDataLabelingJobsResponse,
          ListDataLabelingJobsPagedResponse>
      LIST_DATA_LABELING_JOBS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListDataLabelingJobsRequest,
              ListDataLabelingJobsResponse,
              ListDataLabelingJobsPagedResponse>() {
            @Override
            public ApiFuture<ListDataLabelingJobsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListDataLabelingJobsRequest, ListDataLabelingJobsResponse> callable,
                ListDataLabelingJobsRequest request,
                ApiCallContext context,
                ApiFuture<ListDataLabelingJobsResponse> futureResponse) {
              PageContext<
                      ListDataLabelingJobsRequest, ListDataLabelingJobsResponse, DataLabelingJob>
                  pageContext =
                      PageContext.create(
                          callable, LIST_DATA_LABELING_JOBS_PAGE_STR_DESC, request, context);
              return ListDataLabelingJobsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListHyperparameterTuningJobsRequest,
          ListHyperparameterTuningJobsResponse,
          ListHyperparameterTuningJobsPagedResponse>
      LIST_HYPERPARAMETER_TUNING_JOBS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListHyperparameterTuningJobsRequest,
              ListHyperparameterTuningJobsResponse,
              ListHyperparameterTuningJobsPagedResponse>() {
            @Override
            public ApiFuture<ListHyperparameterTuningJobsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListHyperparameterTuningJobsRequest, ListHyperparameterTuningJobsResponse>
                    callable,
                ListHyperparameterTuningJobsRequest request,
                ApiCallContext context,
                ApiFuture<ListHyperparameterTuningJobsResponse> futureResponse) {
              PageContext<
                      ListHyperparameterTuningJobsRequest,
                      ListHyperparameterTuningJobsResponse,
                      HyperparameterTuningJob>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_HYPERPARAMETER_TUNING_JOBS_PAGE_STR_DESC,
                          request,
                          context);
              return ListHyperparameterTuningJobsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListNasJobsRequest, ListNasJobsResponse, ListNasJobsPagedResponse>
      LIST_NAS_JOBS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListNasJobsRequest, ListNasJobsResponse, ListNasJobsPagedResponse>() {
            @Override
            public ApiFuture<ListNasJobsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListNasJobsRequest, ListNasJobsResponse> callable,
                ListNasJobsRequest request,
                ApiCallContext context,
                ApiFuture<ListNasJobsResponse> futureResponse) {
              PageContext<ListNasJobsRequest, ListNasJobsResponse, NasJob> pageContext =
                  PageContext.create(callable, LIST_NAS_JOBS_PAGE_STR_DESC, request, context);
              return ListNasJobsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListNasTrialDetailsRequest, ListNasTrialDetailsResponse, ListNasTrialDetailsPagedResponse>
      LIST_NAS_TRIAL_DETAILS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListNasTrialDetailsRequest,
              ListNasTrialDetailsResponse,
              ListNasTrialDetailsPagedResponse>() {
            @Override
            public ApiFuture<ListNasTrialDetailsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListNasTrialDetailsRequest, ListNasTrialDetailsResponse> callable,
                ListNasTrialDetailsRequest request,
                ApiCallContext context,
                ApiFuture<ListNasTrialDetailsResponse> futureResponse) {
              PageContext<ListNasTrialDetailsRequest, ListNasTrialDetailsResponse, NasTrialDetail>
                  pageContext =
                      PageContext.create(
                          callable, LIST_NAS_TRIAL_DETAILS_PAGE_STR_DESC, request, context);
              return ListNasTrialDetailsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListBatchPredictionJobsRequest,
          ListBatchPredictionJobsResponse,
          ListBatchPredictionJobsPagedResponse>
      LIST_BATCH_PREDICTION_JOBS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListBatchPredictionJobsRequest,
              ListBatchPredictionJobsResponse,
              ListBatchPredictionJobsPagedResponse>() {
            @Override
            public ApiFuture<ListBatchPredictionJobsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListBatchPredictionJobsRequest, ListBatchPredictionJobsResponse>
                    callable,
                ListBatchPredictionJobsRequest request,
                ApiCallContext context,
                ApiFuture<ListBatchPredictionJobsResponse> futureResponse) {
              PageContext<
                      ListBatchPredictionJobsRequest,
                      ListBatchPredictionJobsResponse,
                      BatchPredictionJob>
                  pageContext =
                      PageContext.create(
                          callable, LIST_BATCH_PREDICTION_JOBS_PAGE_STR_DESC, request, context);
              return ListBatchPredictionJobsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          SearchModelDeploymentMonitoringStatsAnomaliesRequest,
          SearchModelDeploymentMonitoringStatsAnomaliesResponse,
          SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse>
      SEARCH_MODEL_DEPLOYMENT_MONITORING_STATS_ANOMALIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              SearchModelDeploymentMonitoringStatsAnomaliesRequest,
              SearchModelDeploymentMonitoringStatsAnomaliesResponse,
              SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse>() {
            @Override
            public ApiFuture<SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            SearchModelDeploymentMonitoringStatsAnomaliesRequest,
                            SearchModelDeploymentMonitoringStatsAnomaliesResponse>
                        callable,
                    SearchModelDeploymentMonitoringStatsAnomaliesRequest request,
                    ApiCallContext context,
                    ApiFuture<SearchModelDeploymentMonitoringStatsAnomaliesResponse>
                        futureResponse) {
              PageContext<
                      SearchModelDeploymentMonitoringStatsAnomaliesRequest,
                      SearchModelDeploymentMonitoringStatsAnomaliesResponse,
                      ModelMonitoringStatsAnomalies>
                  pageContext =
                      PageContext.create(
                          callable,
                          SEARCH_MODEL_DEPLOYMENT_MONITORING_STATS_ANOMALIES_PAGE_STR_DESC,
                          request,
                          context);
              return SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListModelDeploymentMonitoringJobsRequest,
          ListModelDeploymentMonitoringJobsResponse,
          ListModelDeploymentMonitoringJobsPagedResponse>
      LIST_MODEL_DEPLOYMENT_MONITORING_JOBS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListModelDeploymentMonitoringJobsRequest,
              ListModelDeploymentMonitoringJobsResponse,
              ListModelDeploymentMonitoringJobsPagedResponse>() {
            @Override
            public ApiFuture<ListModelDeploymentMonitoringJobsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListModelDeploymentMonitoringJobsRequest,
                        ListModelDeploymentMonitoringJobsResponse>
                    callable,
                ListModelDeploymentMonitoringJobsRequest request,
                ApiCallContext context,
                ApiFuture<ListModelDeploymentMonitoringJobsResponse> futureResponse) {
              PageContext<
                      ListModelDeploymentMonitoringJobsRequest,
                      ListModelDeploymentMonitoringJobsResponse,
                      ModelDeploymentMonitoringJob>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_MODEL_DEPLOYMENT_MONITORING_JOBS_PAGE_STR_DESC,
                          request,
                          context);
              return ListModelDeploymentMonitoringJobsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      LIST_LOCATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>() {
            @Override
            public ApiFuture<ListLocationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListLocationsRequest, ListLocationsResponse> callable,
                ListLocationsRequest request,
                ApiCallContext context,
                ApiFuture<ListLocationsResponse> futureResponse) {
              PageContext<ListLocationsRequest, ListLocationsResponse, Location> pageContext =
                  PageContext.create(callable, LIST_LOCATIONS_PAGE_STR_DESC, request, context);
              return ListLocationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createCustomJob. */
  public UnaryCallSettings<CreateCustomJobRequest, CustomJob> createCustomJobSettings() {
    return createCustomJobSettings;
  }

  /** Returns the object with the settings used for calls to getCustomJob. */
  public UnaryCallSettings<GetCustomJobRequest, CustomJob> getCustomJobSettings() {
    return getCustomJobSettings;
  }

  /** Returns the object with the settings used for calls to listCustomJobs. */
  public PagedCallSettings<
          ListCustomJobsRequest, ListCustomJobsResponse, ListCustomJobsPagedResponse>
      listCustomJobsSettings() {
    return listCustomJobsSettings;
  }

  /** Returns the object with the settings used for calls to deleteCustomJob. */
  public UnaryCallSettings<DeleteCustomJobRequest, Operation> deleteCustomJobSettings() {
    return deleteCustomJobSettings;
  }

  /** Returns the object with the settings used for calls to deleteCustomJob. */
  public OperationCallSettings<DeleteCustomJobRequest, Empty, DeleteOperationMetadata>
      deleteCustomJobOperationSettings() {
    return deleteCustomJobOperationSettings;
  }

  /** Returns the object with the settings used for calls to cancelCustomJob. */
  public UnaryCallSettings<CancelCustomJobRequest, Empty> cancelCustomJobSettings() {
    return cancelCustomJobSettings;
  }

  /** Returns the object with the settings used for calls to createDataLabelingJob. */
  public UnaryCallSettings<CreateDataLabelingJobRequest, DataLabelingJob>
      createDataLabelingJobSettings() {
    return createDataLabelingJobSettings;
  }

  /** Returns the object with the settings used for calls to getDataLabelingJob. */
  public UnaryCallSettings<GetDataLabelingJobRequest, DataLabelingJob>
      getDataLabelingJobSettings() {
    return getDataLabelingJobSettings;
  }

  /** Returns the object with the settings used for calls to listDataLabelingJobs. */
  public PagedCallSettings<
          ListDataLabelingJobsRequest,
          ListDataLabelingJobsResponse,
          ListDataLabelingJobsPagedResponse>
      listDataLabelingJobsSettings() {
    return listDataLabelingJobsSettings;
  }

  /** Returns the object with the settings used for calls to deleteDataLabelingJob. */
  public UnaryCallSettings<DeleteDataLabelingJobRequest, Operation>
      deleteDataLabelingJobSettings() {
    return deleteDataLabelingJobSettings;
  }

  /** Returns the object with the settings used for calls to deleteDataLabelingJob. */
  public OperationCallSettings<DeleteDataLabelingJobRequest, Empty, DeleteOperationMetadata>
      deleteDataLabelingJobOperationSettings() {
    return deleteDataLabelingJobOperationSettings;
  }

  /** Returns the object with the settings used for calls to cancelDataLabelingJob. */
  public UnaryCallSettings<CancelDataLabelingJobRequest, Empty> cancelDataLabelingJobSettings() {
    return cancelDataLabelingJobSettings;
  }

  /** Returns the object with the settings used for calls to createHyperparameterTuningJob. */
  public UnaryCallSettings<CreateHyperparameterTuningJobRequest, HyperparameterTuningJob>
      createHyperparameterTuningJobSettings() {
    return createHyperparameterTuningJobSettings;
  }

  /** Returns the object with the settings used for calls to getHyperparameterTuningJob. */
  public UnaryCallSettings<GetHyperparameterTuningJobRequest, HyperparameterTuningJob>
      getHyperparameterTuningJobSettings() {
    return getHyperparameterTuningJobSettings;
  }

  /** Returns the object with the settings used for calls to listHyperparameterTuningJobs. */
  public PagedCallSettings<
          ListHyperparameterTuningJobsRequest,
          ListHyperparameterTuningJobsResponse,
          ListHyperparameterTuningJobsPagedResponse>
      listHyperparameterTuningJobsSettings() {
    return listHyperparameterTuningJobsSettings;
  }

  /** Returns the object with the settings used for calls to deleteHyperparameterTuningJob. */
  public UnaryCallSettings<DeleteHyperparameterTuningJobRequest, Operation>
      deleteHyperparameterTuningJobSettings() {
    return deleteHyperparameterTuningJobSettings;
  }

  /** Returns the object with the settings used for calls to deleteHyperparameterTuningJob. */
  public OperationCallSettings<DeleteHyperparameterTuningJobRequest, Empty, DeleteOperationMetadata>
      deleteHyperparameterTuningJobOperationSettings() {
    return deleteHyperparameterTuningJobOperationSettings;
  }

  /** Returns the object with the settings used for calls to cancelHyperparameterTuningJob. */
  public UnaryCallSettings<CancelHyperparameterTuningJobRequest, Empty>
      cancelHyperparameterTuningJobSettings() {
    return cancelHyperparameterTuningJobSettings;
  }

  /** Returns the object with the settings used for calls to createNasJob. */
  public UnaryCallSettings<CreateNasJobRequest, NasJob> createNasJobSettings() {
    return createNasJobSettings;
  }

  /** Returns the object with the settings used for calls to getNasJob. */
  public UnaryCallSettings<GetNasJobRequest, NasJob> getNasJobSettings() {
    return getNasJobSettings;
  }

  /** Returns the object with the settings used for calls to listNasJobs. */
  public PagedCallSettings<ListNasJobsRequest, ListNasJobsResponse, ListNasJobsPagedResponse>
      listNasJobsSettings() {
    return listNasJobsSettings;
  }

  /** Returns the object with the settings used for calls to deleteNasJob. */
  public UnaryCallSettings<DeleteNasJobRequest, Operation> deleteNasJobSettings() {
    return deleteNasJobSettings;
  }

  /** Returns the object with the settings used for calls to deleteNasJob. */
  public OperationCallSettings<DeleteNasJobRequest, Empty, DeleteOperationMetadata>
      deleteNasJobOperationSettings() {
    return deleteNasJobOperationSettings;
  }

  /** Returns the object with the settings used for calls to cancelNasJob. */
  public UnaryCallSettings<CancelNasJobRequest, Empty> cancelNasJobSettings() {
    return cancelNasJobSettings;
  }

  /** Returns the object with the settings used for calls to getNasTrialDetail. */
  public UnaryCallSettings<GetNasTrialDetailRequest, NasTrialDetail> getNasTrialDetailSettings() {
    return getNasTrialDetailSettings;
  }

  /** Returns the object with the settings used for calls to listNasTrialDetails. */
  public PagedCallSettings<
          ListNasTrialDetailsRequest, ListNasTrialDetailsResponse, ListNasTrialDetailsPagedResponse>
      listNasTrialDetailsSettings() {
    return listNasTrialDetailsSettings;
  }

  /** Returns the object with the settings used for calls to createBatchPredictionJob. */
  public UnaryCallSettings<CreateBatchPredictionJobRequest, BatchPredictionJob>
      createBatchPredictionJobSettings() {
    return createBatchPredictionJobSettings;
  }

  /** Returns the object with the settings used for calls to getBatchPredictionJob. */
  public UnaryCallSettings<GetBatchPredictionJobRequest, BatchPredictionJob>
      getBatchPredictionJobSettings() {
    return getBatchPredictionJobSettings;
  }

  /** Returns the object with the settings used for calls to listBatchPredictionJobs. */
  public PagedCallSettings<
          ListBatchPredictionJobsRequest,
          ListBatchPredictionJobsResponse,
          ListBatchPredictionJobsPagedResponse>
      listBatchPredictionJobsSettings() {
    return listBatchPredictionJobsSettings;
  }

  /** Returns the object with the settings used for calls to deleteBatchPredictionJob. */
  public UnaryCallSettings<DeleteBatchPredictionJobRequest, Operation>
      deleteBatchPredictionJobSettings() {
    return deleteBatchPredictionJobSettings;
  }

  /** Returns the object with the settings used for calls to deleteBatchPredictionJob. */
  public OperationCallSettings<DeleteBatchPredictionJobRequest, Empty, DeleteOperationMetadata>
      deleteBatchPredictionJobOperationSettings() {
    return deleteBatchPredictionJobOperationSettings;
  }

  /** Returns the object with the settings used for calls to cancelBatchPredictionJob. */
  public UnaryCallSettings<CancelBatchPredictionJobRequest, Empty>
      cancelBatchPredictionJobSettings() {
    return cancelBatchPredictionJobSettings;
  }

  /** Returns the object with the settings used for calls to createModelDeploymentMonitoringJob. */
  public UnaryCallSettings<CreateModelDeploymentMonitoringJobRequest, ModelDeploymentMonitoringJob>
      createModelDeploymentMonitoringJobSettings() {
    return createModelDeploymentMonitoringJobSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * searchModelDeploymentMonitoringStatsAnomalies.
   */
  public PagedCallSettings<
          SearchModelDeploymentMonitoringStatsAnomaliesRequest,
          SearchModelDeploymentMonitoringStatsAnomaliesResponse,
          SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse>
      searchModelDeploymentMonitoringStatsAnomaliesSettings() {
    return searchModelDeploymentMonitoringStatsAnomaliesSettings;
  }

  /** Returns the object with the settings used for calls to getModelDeploymentMonitoringJob. */
  public UnaryCallSettings<GetModelDeploymentMonitoringJobRequest, ModelDeploymentMonitoringJob>
      getModelDeploymentMonitoringJobSettings() {
    return getModelDeploymentMonitoringJobSettings;
  }

  /** Returns the object with the settings used for calls to listModelDeploymentMonitoringJobs. */
  public PagedCallSettings<
          ListModelDeploymentMonitoringJobsRequest,
          ListModelDeploymentMonitoringJobsResponse,
          ListModelDeploymentMonitoringJobsPagedResponse>
      listModelDeploymentMonitoringJobsSettings() {
    return listModelDeploymentMonitoringJobsSettings;
  }

  /** Returns the object with the settings used for calls to updateModelDeploymentMonitoringJob. */
  public UnaryCallSettings<UpdateModelDeploymentMonitoringJobRequest, Operation>
      updateModelDeploymentMonitoringJobSettings() {
    return updateModelDeploymentMonitoringJobSettings;
  }

  /** Returns the object with the settings used for calls to updateModelDeploymentMonitoringJob. */
  public OperationCallSettings<
          UpdateModelDeploymentMonitoringJobRequest,
          ModelDeploymentMonitoringJob,
          UpdateModelDeploymentMonitoringJobOperationMetadata>
      updateModelDeploymentMonitoringJobOperationSettings() {
    return updateModelDeploymentMonitoringJobOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteModelDeploymentMonitoringJob. */
  public UnaryCallSettings<DeleteModelDeploymentMonitoringJobRequest, Operation>
      deleteModelDeploymentMonitoringJobSettings() {
    return deleteModelDeploymentMonitoringJobSettings;
  }

  /** Returns the object with the settings used for calls to deleteModelDeploymentMonitoringJob. */
  public OperationCallSettings<
          DeleteModelDeploymentMonitoringJobRequest, Empty, DeleteOperationMetadata>
      deleteModelDeploymentMonitoringJobOperationSettings() {
    return deleteModelDeploymentMonitoringJobOperationSettings;
  }

  /** Returns the object with the settings used for calls to pauseModelDeploymentMonitoringJob. */
  public UnaryCallSettings<PauseModelDeploymentMonitoringJobRequest, Empty>
      pauseModelDeploymentMonitoringJobSettings() {
    return pauseModelDeploymentMonitoringJobSettings;
  }

  /** Returns the object with the settings used for calls to resumeModelDeploymentMonitoringJob. */
  public UnaryCallSettings<ResumeModelDeploymentMonitoringJobRequest, Empty>
      resumeModelDeploymentMonitoringJobSettings() {
    return resumeModelDeploymentMonitoringJobSettings;
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return listLocationsSettings;
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return getLocationSettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  public JobServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcJobServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "aiplatform";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "aiplatform.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "aiplatform.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(JobServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected JobServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createCustomJobSettings = settingsBuilder.createCustomJobSettings().build();
    getCustomJobSettings = settingsBuilder.getCustomJobSettings().build();
    listCustomJobsSettings = settingsBuilder.listCustomJobsSettings().build();
    deleteCustomJobSettings = settingsBuilder.deleteCustomJobSettings().build();
    deleteCustomJobOperationSettings = settingsBuilder.deleteCustomJobOperationSettings().build();
    cancelCustomJobSettings = settingsBuilder.cancelCustomJobSettings().build();
    createDataLabelingJobSettings = settingsBuilder.createDataLabelingJobSettings().build();
    getDataLabelingJobSettings = settingsBuilder.getDataLabelingJobSettings().build();
    listDataLabelingJobsSettings = settingsBuilder.listDataLabelingJobsSettings().build();
    deleteDataLabelingJobSettings = settingsBuilder.deleteDataLabelingJobSettings().build();
    deleteDataLabelingJobOperationSettings =
        settingsBuilder.deleteDataLabelingJobOperationSettings().build();
    cancelDataLabelingJobSettings = settingsBuilder.cancelDataLabelingJobSettings().build();
    createHyperparameterTuningJobSettings =
        settingsBuilder.createHyperparameterTuningJobSettings().build();
    getHyperparameterTuningJobSettings =
        settingsBuilder.getHyperparameterTuningJobSettings().build();
    listHyperparameterTuningJobsSettings =
        settingsBuilder.listHyperparameterTuningJobsSettings().build();
    deleteHyperparameterTuningJobSettings =
        settingsBuilder.deleteHyperparameterTuningJobSettings().build();
    deleteHyperparameterTuningJobOperationSettings =
        settingsBuilder.deleteHyperparameterTuningJobOperationSettings().build();
    cancelHyperparameterTuningJobSettings =
        settingsBuilder.cancelHyperparameterTuningJobSettings().build();
    createNasJobSettings = settingsBuilder.createNasJobSettings().build();
    getNasJobSettings = settingsBuilder.getNasJobSettings().build();
    listNasJobsSettings = settingsBuilder.listNasJobsSettings().build();
    deleteNasJobSettings = settingsBuilder.deleteNasJobSettings().build();
    deleteNasJobOperationSettings = settingsBuilder.deleteNasJobOperationSettings().build();
    cancelNasJobSettings = settingsBuilder.cancelNasJobSettings().build();
    getNasTrialDetailSettings = settingsBuilder.getNasTrialDetailSettings().build();
    listNasTrialDetailsSettings = settingsBuilder.listNasTrialDetailsSettings().build();
    createBatchPredictionJobSettings = settingsBuilder.createBatchPredictionJobSettings().build();
    getBatchPredictionJobSettings = settingsBuilder.getBatchPredictionJobSettings().build();
    listBatchPredictionJobsSettings = settingsBuilder.listBatchPredictionJobsSettings().build();
    deleteBatchPredictionJobSettings = settingsBuilder.deleteBatchPredictionJobSettings().build();
    deleteBatchPredictionJobOperationSettings =
        settingsBuilder.deleteBatchPredictionJobOperationSettings().build();
    cancelBatchPredictionJobSettings = settingsBuilder.cancelBatchPredictionJobSettings().build();
    createModelDeploymentMonitoringJobSettings =
        settingsBuilder.createModelDeploymentMonitoringJobSettings().build();
    searchModelDeploymentMonitoringStatsAnomaliesSettings =
        settingsBuilder.searchModelDeploymentMonitoringStatsAnomaliesSettings().build();
    getModelDeploymentMonitoringJobSettings =
        settingsBuilder.getModelDeploymentMonitoringJobSettings().build();
    listModelDeploymentMonitoringJobsSettings =
        settingsBuilder.listModelDeploymentMonitoringJobsSettings().build();
    updateModelDeploymentMonitoringJobSettings =
        settingsBuilder.updateModelDeploymentMonitoringJobSettings().build();
    updateModelDeploymentMonitoringJobOperationSettings =
        settingsBuilder.updateModelDeploymentMonitoringJobOperationSettings().build();
    deleteModelDeploymentMonitoringJobSettings =
        settingsBuilder.deleteModelDeploymentMonitoringJobSettings().build();
    deleteModelDeploymentMonitoringJobOperationSettings =
        settingsBuilder.deleteModelDeploymentMonitoringJobOperationSettings().build();
    pauseModelDeploymentMonitoringJobSettings =
        settingsBuilder.pauseModelDeploymentMonitoringJobSettings().build();
    resumeModelDeploymentMonitoringJobSettings =
        settingsBuilder.resumeModelDeploymentMonitoringJobSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
  }

  /** Builder for JobServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<JobServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateCustomJobRequest, CustomJob>
        createCustomJobSettings;
    private final UnaryCallSettings.Builder<GetCustomJobRequest, CustomJob> getCustomJobSettings;
    private final PagedCallSettings.Builder<
            ListCustomJobsRequest, ListCustomJobsResponse, ListCustomJobsPagedResponse>
        listCustomJobsSettings;
    private final UnaryCallSettings.Builder<DeleteCustomJobRequest, Operation>
        deleteCustomJobSettings;
    private final OperationCallSettings.Builder<
            DeleteCustomJobRequest, Empty, DeleteOperationMetadata>
        deleteCustomJobOperationSettings;
    private final UnaryCallSettings.Builder<CancelCustomJobRequest, Empty> cancelCustomJobSettings;
    private final UnaryCallSettings.Builder<CreateDataLabelingJobRequest, DataLabelingJob>
        createDataLabelingJobSettings;
    private final UnaryCallSettings.Builder<GetDataLabelingJobRequest, DataLabelingJob>
        getDataLabelingJobSettings;
    private final PagedCallSettings.Builder<
            ListDataLabelingJobsRequest,
            ListDataLabelingJobsResponse,
            ListDataLabelingJobsPagedResponse>
        listDataLabelingJobsSettings;
    private final UnaryCallSettings.Builder<DeleteDataLabelingJobRequest, Operation>
        deleteDataLabelingJobSettings;
    private final OperationCallSettings.Builder<
            DeleteDataLabelingJobRequest, Empty, DeleteOperationMetadata>
        deleteDataLabelingJobOperationSettings;
    private final UnaryCallSettings.Builder<CancelDataLabelingJobRequest, Empty>
        cancelDataLabelingJobSettings;
    private final UnaryCallSettings.Builder<
            CreateHyperparameterTuningJobRequest, HyperparameterTuningJob>
        createHyperparameterTuningJobSettings;
    private final UnaryCallSettings.Builder<
            GetHyperparameterTuningJobRequest, HyperparameterTuningJob>
        getHyperparameterTuningJobSettings;
    private final PagedCallSettings.Builder<
            ListHyperparameterTuningJobsRequest,
            ListHyperparameterTuningJobsResponse,
            ListHyperparameterTuningJobsPagedResponse>
        listHyperparameterTuningJobsSettings;
    private final UnaryCallSettings.Builder<DeleteHyperparameterTuningJobRequest, Operation>
        deleteHyperparameterTuningJobSettings;
    private final OperationCallSettings.Builder<
            DeleteHyperparameterTuningJobRequest, Empty, DeleteOperationMetadata>
        deleteHyperparameterTuningJobOperationSettings;
    private final UnaryCallSettings.Builder<CancelHyperparameterTuningJobRequest, Empty>
        cancelHyperparameterTuningJobSettings;
    private final UnaryCallSettings.Builder<CreateNasJobRequest, NasJob> createNasJobSettings;
    private final UnaryCallSettings.Builder<GetNasJobRequest, NasJob> getNasJobSettings;
    private final PagedCallSettings.Builder<
            ListNasJobsRequest, ListNasJobsResponse, ListNasJobsPagedResponse>
        listNasJobsSettings;
    private final UnaryCallSettings.Builder<DeleteNasJobRequest, Operation> deleteNasJobSettings;
    private final OperationCallSettings.Builder<DeleteNasJobRequest, Empty, DeleteOperationMetadata>
        deleteNasJobOperationSettings;
    private final UnaryCallSettings.Builder<CancelNasJobRequest, Empty> cancelNasJobSettings;
    private final UnaryCallSettings.Builder<GetNasTrialDetailRequest, NasTrialDetail>
        getNasTrialDetailSettings;
    private final PagedCallSettings.Builder<
            ListNasTrialDetailsRequest,
            ListNasTrialDetailsResponse,
            ListNasTrialDetailsPagedResponse>
        listNasTrialDetailsSettings;
    private final UnaryCallSettings.Builder<CreateBatchPredictionJobRequest, BatchPredictionJob>
        createBatchPredictionJobSettings;
    private final UnaryCallSettings.Builder<GetBatchPredictionJobRequest, BatchPredictionJob>
        getBatchPredictionJobSettings;
    private final PagedCallSettings.Builder<
            ListBatchPredictionJobsRequest,
            ListBatchPredictionJobsResponse,
            ListBatchPredictionJobsPagedResponse>
        listBatchPredictionJobsSettings;
    private final UnaryCallSettings.Builder<DeleteBatchPredictionJobRequest, Operation>
        deleteBatchPredictionJobSettings;
    private final OperationCallSettings.Builder<
            DeleteBatchPredictionJobRequest, Empty, DeleteOperationMetadata>
        deleteBatchPredictionJobOperationSettings;
    private final UnaryCallSettings.Builder<CancelBatchPredictionJobRequest, Empty>
        cancelBatchPredictionJobSettings;
    private final UnaryCallSettings.Builder<
            CreateModelDeploymentMonitoringJobRequest, ModelDeploymentMonitoringJob>
        createModelDeploymentMonitoringJobSettings;
    private final PagedCallSettings.Builder<
            SearchModelDeploymentMonitoringStatsAnomaliesRequest,
            SearchModelDeploymentMonitoringStatsAnomaliesResponse,
            SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse>
        searchModelDeploymentMonitoringStatsAnomaliesSettings;
    private final UnaryCallSettings.Builder<
            GetModelDeploymentMonitoringJobRequest, ModelDeploymentMonitoringJob>
        getModelDeploymentMonitoringJobSettings;
    private final PagedCallSettings.Builder<
            ListModelDeploymentMonitoringJobsRequest,
            ListModelDeploymentMonitoringJobsResponse,
            ListModelDeploymentMonitoringJobsPagedResponse>
        listModelDeploymentMonitoringJobsSettings;
    private final UnaryCallSettings.Builder<UpdateModelDeploymentMonitoringJobRequest, Operation>
        updateModelDeploymentMonitoringJobSettings;
    private final OperationCallSettings.Builder<
            UpdateModelDeploymentMonitoringJobRequest,
            ModelDeploymentMonitoringJob,
            UpdateModelDeploymentMonitoringJobOperationMetadata>
        updateModelDeploymentMonitoringJobOperationSettings;
    private final UnaryCallSettings.Builder<DeleteModelDeploymentMonitoringJobRequest, Operation>
        deleteModelDeploymentMonitoringJobSettings;
    private final OperationCallSettings.Builder<
            DeleteModelDeploymentMonitoringJobRequest, Empty, DeleteOperationMetadata>
        deleteModelDeploymentMonitoringJobOperationSettings;
    private final UnaryCallSettings.Builder<PauseModelDeploymentMonitoringJobRequest, Empty>
        pauseModelDeploymentMonitoringJobSettings;
    private final UnaryCallSettings.Builder<ResumeModelDeploymentMonitoringJobRequest, Empty>
        resumeModelDeploymentMonitoringJobSettings;
    private final PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings;
    private final UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings;
    private final UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createCustomJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getCustomJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listCustomJobsSettings = PagedCallSettings.newBuilder(LIST_CUSTOM_JOBS_PAGE_STR_FACT);
      deleteCustomJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteCustomJobOperationSettings = OperationCallSettings.newBuilder();
      cancelCustomJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createDataLabelingJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getDataLabelingJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listDataLabelingJobsSettings =
          PagedCallSettings.newBuilder(LIST_DATA_LABELING_JOBS_PAGE_STR_FACT);
      deleteDataLabelingJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteDataLabelingJobOperationSettings = OperationCallSettings.newBuilder();
      cancelDataLabelingJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createHyperparameterTuningJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getHyperparameterTuningJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listHyperparameterTuningJobsSettings =
          PagedCallSettings.newBuilder(LIST_HYPERPARAMETER_TUNING_JOBS_PAGE_STR_FACT);
      deleteHyperparameterTuningJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteHyperparameterTuningJobOperationSettings = OperationCallSettings.newBuilder();
      cancelHyperparameterTuningJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createNasJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getNasJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listNasJobsSettings = PagedCallSettings.newBuilder(LIST_NAS_JOBS_PAGE_STR_FACT);
      deleteNasJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteNasJobOperationSettings = OperationCallSettings.newBuilder();
      cancelNasJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getNasTrialDetailSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listNasTrialDetailsSettings =
          PagedCallSettings.newBuilder(LIST_NAS_TRIAL_DETAILS_PAGE_STR_FACT);
      createBatchPredictionJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getBatchPredictionJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listBatchPredictionJobsSettings =
          PagedCallSettings.newBuilder(LIST_BATCH_PREDICTION_JOBS_PAGE_STR_FACT);
      deleteBatchPredictionJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteBatchPredictionJobOperationSettings = OperationCallSettings.newBuilder();
      cancelBatchPredictionJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createModelDeploymentMonitoringJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      searchModelDeploymentMonitoringStatsAnomaliesSettings =
          PagedCallSettings.newBuilder(
              SEARCH_MODEL_DEPLOYMENT_MONITORING_STATS_ANOMALIES_PAGE_STR_FACT);
      getModelDeploymentMonitoringJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listModelDeploymentMonitoringJobsSettings =
          PagedCallSettings.newBuilder(LIST_MODEL_DEPLOYMENT_MONITORING_JOBS_PAGE_STR_FACT);
      updateModelDeploymentMonitoringJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateModelDeploymentMonitoringJobOperationSettings = OperationCallSettings.newBuilder();
      deleteModelDeploymentMonitoringJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteModelDeploymentMonitoringJobOperationSettings = OperationCallSettings.newBuilder();
      pauseModelDeploymentMonitoringJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      resumeModelDeploymentMonitoringJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createCustomJobSettings,
              getCustomJobSettings,
              listCustomJobsSettings,
              deleteCustomJobSettings,
              cancelCustomJobSettings,
              createDataLabelingJobSettings,
              getDataLabelingJobSettings,
              listDataLabelingJobsSettings,
              deleteDataLabelingJobSettings,
              cancelDataLabelingJobSettings,
              createHyperparameterTuningJobSettings,
              getHyperparameterTuningJobSettings,
              listHyperparameterTuningJobsSettings,
              deleteHyperparameterTuningJobSettings,
              cancelHyperparameterTuningJobSettings,
              createNasJobSettings,
              getNasJobSettings,
              listNasJobsSettings,
              deleteNasJobSettings,
              cancelNasJobSettings,
              getNasTrialDetailSettings,
              listNasTrialDetailsSettings,
              createBatchPredictionJobSettings,
              getBatchPredictionJobSettings,
              listBatchPredictionJobsSettings,
              deleteBatchPredictionJobSettings,
              cancelBatchPredictionJobSettings,
              createModelDeploymentMonitoringJobSettings,
              searchModelDeploymentMonitoringStatsAnomaliesSettings,
              getModelDeploymentMonitoringJobSettings,
              listModelDeploymentMonitoringJobsSettings,
              updateModelDeploymentMonitoringJobSettings,
              deleteModelDeploymentMonitoringJobSettings,
              pauseModelDeploymentMonitoringJobSettings,
              resumeModelDeploymentMonitoringJobSettings,
              listLocationsSettings,
              getLocationSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
      initDefaults(this);
    }

    protected Builder(JobServiceStubSettings settings) {
      super(settings);

      createCustomJobSettings = settings.createCustomJobSettings.toBuilder();
      getCustomJobSettings = settings.getCustomJobSettings.toBuilder();
      listCustomJobsSettings = settings.listCustomJobsSettings.toBuilder();
      deleteCustomJobSettings = settings.deleteCustomJobSettings.toBuilder();
      deleteCustomJobOperationSettings = settings.deleteCustomJobOperationSettings.toBuilder();
      cancelCustomJobSettings = settings.cancelCustomJobSettings.toBuilder();
      createDataLabelingJobSettings = settings.createDataLabelingJobSettings.toBuilder();
      getDataLabelingJobSettings = settings.getDataLabelingJobSettings.toBuilder();
      listDataLabelingJobsSettings = settings.listDataLabelingJobsSettings.toBuilder();
      deleteDataLabelingJobSettings = settings.deleteDataLabelingJobSettings.toBuilder();
      deleteDataLabelingJobOperationSettings =
          settings.deleteDataLabelingJobOperationSettings.toBuilder();
      cancelDataLabelingJobSettings = settings.cancelDataLabelingJobSettings.toBuilder();
      createHyperparameterTuningJobSettings =
          settings.createHyperparameterTuningJobSettings.toBuilder();
      getHyperparameterTuningJobSettings = settings.getHyperparameterTuningJobSettings.toBuilder();
      listHyperparameterTuningJobsSettings =
          settings.listHyperparameterTuningJobsSettings.toBuilder();
      deleteHyperparameterTuningJobSettings =
          settings.deleteHyperparameterTuningJobSettings.toBuilder();
      deleteHyperparameterTuningJobOperationSettings =
          settings.deleteHyperparameterTuningJobOperationSettings.toBuilder();
      cancelHyperparameterTuningJobSettings =
          settings.cancelHyperparameterTuningJobSettings.toBuilder();
      createNasJobSettings = settings.createNasJobSettings.toBuilder();
      getNasJobSettings = settings.getNasJobSettings.toBuilder();
      listNasJobsSettings = settings.listNasJobsSettings.toBuilder();
      deleteNasJobSettings = settings.deleteNasJobSettings.toBuilder();
      deleteNasJobOperationSettings = settings.deleteNasJobOperationSettings.toBuilder();
      cancelNasJobSettings = settings.cancelNasJobSettings.toBuilder();
      getNasTrialDetailSettings = settings.getNasTrialDetailSettings.toBuilder();
      listNasTrialDetailsSettings = settings.listNasTrialDetailsSettings.toBuilder();
      createBatchPredictionJobSettings = settings.createBatchPredictionJobSettings.toBuilder();
      getBatchPredictionJobSettings = settings.getBatchPredictionJobSettings.toBuilder();
      listBatchPredictionJobsSettings = settings.listBatchPredictionJobsSettings.toBuilder();
      deleteBatchPredictionJobSettings = settings.deleteBatchPredictionJobSettings.toBuilder();
      deleteBatchPredictionJobOperationSettings =
          settings.deleteBatchPredictionJobOperationSettings.toBuilder();
      cancelBatchPredictionJobSettings = settings.cancelBatchPredictionJobSettings.toBuilder();
      createModelDeploymentMonitoringJobSettings =
          settings.createModelDeploymentMonitoringJobSettings.toBuilder();
      searchModelDeploymentMonitoringStatsAnomaliesSettings =
          settings.searchModelDeploymentMonitoringStatsAnomaliesSettings.toBuilder();
      getModelDeploymentMonitoringJobSettings =
          settings.getModelDeploymentMonitoringJobSettings.toBuilder();
      listModelDeploymentMonitoringJobsSettings =
          settings.listModelDeploymentMonitoringJobsSettings.toBuilder();
      updateModelDeploymentMonitoringJobSettings =
          settings.updateModelDeploymentMonitoringJobSettings.toBuilder();
      updateModelDeploymentMonitoringJobOperationSettings =
          settings.updateModelDeploymentMonitoringJobOperationSettings.toBuilder();
      deleteModelDeploymentMonitoringJobSettings =
          settings.deleteModelDeploymentMonitoringJobSettings.toBuilder();
      deleteModelDeploymentMonitoringJobOperationSettings =
          settings.deleteModelDeploymentMonitoringJobOperationSettings.toBuilder();
      pauseModelDeploymentMonitoringJobSettings =
          settings.pauseModelDeploymentMonitoringJobSettings.toBuilder();
      resumeModelDeploymentMonitoringJobSettings =
          settings.resumeModelDeploymentMonitoringJobSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createCustomJobSettings,
              getCustomJobSettings,
              listCustomJobsSettings,
              deleteCustomJobSettings,
              cancelCustomJobSettings,
              createDataLabelingJobSettings,
              getDataLabelingJobSettings,
              listDataLabelingJobsSettings,
              deleteDataLabelingJobSettings,
              cancelDataLabelingJobSettings,
              createHyperparameterTuningJobSettings,
              getHyperparameterTuningJobSettings,
              listHyperparameterTuningJobsSettings,
              deleteHyperparameterTuningJobSettings,
              cancelHyperparameterTuningJobSettings,
              createNasJobSettings,
              getNasJobSettings,
              listNasJobsSettings,
              deleteNasJobSettings,
              cancelNasJobSettings,
              getNasTrialDetailSettings,
              listNasTrialDetailsSettings,
              createBatchPredictionJobSettings,
              getBatchPredictionJobSettings,
              listBatchPredictionJobsSettings,
              deleteBatchPredictionJobSettings,
              cancelBatchPredictionJobSettings,
              createModelDeploymentMonitoringJobSettings,
              searchModelDeploymentMonitoringStatsAnomaliesSettings,
              getModelDeploymentMonitoringJobSettings,
              listModelDeploymentMonitoringJobsSettings,
              updateModelDeploymentMonitoringJobSettings,
              deleteModelDeploymentMonitoringJobSettings,
              pauseModelDeploymentMonitoringJobSettings,
              resumeModelDeploymentMonitoringJobSettings,
              listLocationsSettings,
              getLocationSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .createCustomJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getCustomJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listCustomJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteCustomJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .cancelCustomJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createDataLabelingJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getDataLabelingJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listDataLabelingJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteDataLabelingJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .cancelDataLabelingJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createHyperparameterTuningJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getHyperparameterTuningJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listHyperparameterTuningJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteHyperparameterTuningJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .cancelHyperparameterTuningJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createNasJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getNasJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listNasJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteNasJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .cancelNasJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getNasTrialDetailSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listNasTrialDetailsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createBatchPredictionJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getBatchPredictionJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listBatchPredictionJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteBatchPredictionJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .cancelBatchPredictionJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createModelDeploymentMonitoringJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .searchModelDeploymentMonitoringStatsAnomaliesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getModelDeploymentMonitoringJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listModelDeploymentMonitoringJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateModelDeploymentMonitoringJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteModelDeploymentMonitoringJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .pauseModelDeploymentMonitoringJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .resumeModelDeploymentMonitoringJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getLocationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .testIamPermissionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteCustomJobOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteCustomJobRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(DeleteOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteDataLabelingJobOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteDataLabelingJobRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(DeleteOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteHyperparameterTuningJobOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteHyperparameterTuningJobRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(DeleteOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteNasJobOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteNasJobRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(DeleteOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteBatchPredictionJobOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteBatchPredictionJobRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(DeleteOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .updateModelDeploymentMonitoringJobOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateModelDeploymentMonitoringJobRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  ModelDeploymentMonitoringJob.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  UpdateModelDeploymentMonitoringJobOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteModelDeploymentMonitoringJobOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteModelDeploymentMonitoringJobRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(DeleteOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createCustomJob. */
    public UnaryCallSettings.Builder<CreateCustomJobRequest, CustomJob> createCustomJobSettings() {
      return createCustomJobSettings;
    }

    /** Returns the builder for the settings used for calls to getCustomJob. */
    public UnaryCallSettings.Builder<GetCustomJobRequest, CustomJob> getCustomJobSettings() {
      return getCustomJobSettings;
    }

    /** Returns the builder for the settings used for calls to listCustomJobs. */
    public PagedCallSettings.Builder<
            ListCustomJobsRequest, ListCustomJobsResponse, ListCustomJobsPagedResponse>
        listCustomJobsSettings() {
      return listCustomJobsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteCustomJob. */
    public UnaryCallSettings.Builder<DeleteCustomJobRequest, Operation> deleteCustomJobSettings() {
      return deleteCustomJobSettings;
    }

    /** Returns the builder for the settings used for calls to deleteCustomJob. */
    public OperationCallSettings.Builder<DeleteCustomJobRequest, Empty, DeleteOperationMetadata>
        deleteCustomJobOperationSettings() {
      return deleteCustomJobOperationSettings;
    }

    /** Returns the builder for the settings used for calls to cancelCustomJob. */
    public UnaryCallSettings.Builder<CancelCustomJobRequest, Empty> cancelCustomJobSettings() {
      return cancelCustomJobSettings;
    }

    /** Returns the builder for the settings used for calls to createDataLabelingJob. */
    public UnaryCallSettings.Builder<CreateDataLabelingJobRequest, DataLabelingJob>
        createDataLabelingJobSettings() {
      return createDataLabelingJobSettings;
    }

    /** Returns the builder for the settings used for calls to getDataLabelingJob. */
    public UnaryCallSettings.Builder<GetDataLabelingJobRequest, DataLabelingJob>
        getDataLabelingJobSettings() {
      return getDataLabelingJobSettings;
    }

    /** Returns the builder for the settings used for calls to listDataLabelingJobs. */
    public PagedCallSettings.Builder<
            ListDataLabelingJobsRequest,
            ListDataLabelingJobsResponse,
            ListDataLabelingJobsPagedResponse>
        listDataLabelingJobsSettings() {
      return listDataLabelingJobsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteDataLabelingJob. */
    public UnaryCallSettings.Builder<DeleteDataLabelingJobRequest, Operation>
        deleteDataLabelingJobSettings() {
      return deleteDataLabelingJobSettings;
    }

    /** Returns the builder for the settings used for calls to deleteDataLabelingJob. */
    public OperationCallSettings.Builder<
            DeleteDataLabelingJobRequest, Empty, DeleteOperationMetadata>
        deleteDataLabelingJobOperationSettings() {
      return deleteDataLabelingJobOperationSettings;
    }

    /** Returns the builder for the settings used for calls to cancelDataLabelingJob. */
    public UnaryCallSettings.Builder<CancelDataLabelingJobRequest, Empty>
        cancelDataLabelingJobSettings() {
      return cancelDataLabelingJobSettings;
    }

    /** Returns the builder for the settings used for calls to createHyperparameterTuningJob. */
    public UnaryCallSettings.Builder<CreateHyperparameterTuningJobRequest, HyperparameterTuningJob>
        createHyperparameterTuningJobSettings() {
      return createHyperparameterTuningJobSettings;
    }

    /** Returns the builder for the settings used for calls to getHyperparameterTuningJob. */
    public UnaryCallSettings.Builder<GetHyperparameterTuningJobRequest, HyperparameterTuningJob>
        getHyperparameterTuningJobSettings() {
      return getHyperparameterTuningJobSettings;
    }

    /** Returns the builder for the settings used for calls to listHyperparameterTuningJobs. */
    public PagedCallSettings.Builder<
            ListHyperparameterTuningJobsRequest,
            ListHyperparameterTuningJobsResponse,
            ListHyperparameterTuningJobsPagedResponse>
        listHyperparameterTuningJobsSettings() {
      return listHyperparameterTuningJobsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteHyperparameterTuningJob. */
    public UnaryCallSettings.Builder<DeleteHyperparameterTuningJobRequest, Operation>
        deleteHyperparameterTuningJobSettings() {
      return deleteHyperparameterTuningJobSettings;
    }

    /** Returns the builder for the settings used for calls to deleteHyperparameterTuningJob. */
    public OperationCallSettings.Builder<
            DeleteHyperparameterTuningJobRequest, Empty, DeleteOperationMetadata>
        deleteHyperparameterTuningJobOperationSettings() {
      return deleteHyperparameterTuningJobOperationSettings;
    }

    /** Returns the builder for the settings used for calls to cancelHyperparameterTuningJob. */
    public UnaryCallSettings.Builder<CancelHyperparameterTuningJobRequest, Empty>
        cancelHyperparameterTuningJobSettings() {
      return cancelHyperparameterTuningJobSettings;
    }

    /** Returns the builder for the settings used for calls to createNasJob. */
    public UnaryCallSettings.Builder<CreateNasJobRequest, NasJob> createNasJobSettings() {
      return createNasJobSettings;
    }

    /** Returns the builder for the settings used for calls to getNasJob. */
    public UnaryCallSettings.Builder<GetNasJobRequest, NasJob> getNasJobSettings() {
      return getNasJobSettings;
    }

    /** Returns the builder for the settings used for calls to listNasJobs. */
    public PagedCallSettings.Builder<
            ListNasJobsRequest, ListNasJobsResponse, ListNasJobsPagedResponse>
        listNasJobsSettings() {
      return listNasJobsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteNasJob. */
    public UnaryCallSettings.Builder<DeleteNasJobRequest, Operation> deleteNasJobSettings() {
      return deleteNasJobSettings;
    }

    /** Returns the builder for the settings used for calls to deleteNasJob. */
    public OperationCallSettings.Builder<DeleteNasJobRequest, Empty, DeleteOperationMetadata>
        deleteNasJobOperationSettings() {
      return deleteNasJobOperationSettings;
    }

    /** Returns the builder for the settings used for calls to cancelNasJob. */
    public UnaryCallSettings.Builder<CancelNasJobRequest, Empty> cancelNasJobSettings() {
      return cancelNasJobSettings;
    }

    /** Returns the builder for the settings used for calls to getNasTrialDetail. */
    public UnaryCallSettings.Builder<GetNasTrialDetailRequest, NasTrialDetail>
        getNasTrialDetailSettings() {
      return getNasTrialDetailSettings;
    }

    /** Returns the builder for the settings used for calls to listNasTrialDetails. */
    public PagedCallSettings.Builder<
            ListNasTrialDetailsRequest,
            ListNasTrialDetailsResponse,
            ListNasTrialDetailsPagedResponse>
        listNasTrialDetailsSettings() {
      return listNasTrialDetailsSettings;
    }

    /** Returns the builder for the settings used for calls to createBatchPredictionJob. */
    public UnaryCallSettings.Builder<CreateBatchPredictionJobRequest, BatchPredictionJob>
        createBatchPredictionJobSettings() {
      return createBatchPredictionJobSettings;
    }

    /** Returns the builder for the settings used for calls to getBatchPredictionJob. */
    public UnaryCallSettings.Builder<GetBatchPredictionJobRequest, BatchPredictionJob>
        getBatchPredictionJobSettings() {
      return getBatchPredictionJobSettings;
    }

    /** Returns the builder for the settings used for calls to listBatchPredictionJobs. */
    public PagedCallSettings.Builder<
            ListBatchPredictionJobsRequest,
            ListBatchPredictionJobsResponse,
            ListBatchPredictionJobsPagedResponse>
        listBatchPredictionJobsSettings() {
      return listBatchPredictionJobsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteBatchPredictionJob. */
    public UnaryCallSettings.Builder<DeleteBatchPredictionJobRequest, Operation>
        deleteBatchPredictionJobSettings() {
      return deleteBatchPredictionJobSettings;
    }

    /** Returns the builder for the settings used for calls to deleteBatchPredictionJob. */
    public OperationCallSettings.Builder<
            DeleteBatchPredictionJobRequest, Empty, DeleteOperationMetadata>
        deleteBatchPredictionJobOperationSettings() {
      return deleteBatchPredictionJobOperationSettings;
    }

    /** Returns the builder for the settings used for calls to cancelBatchPredictionJob. */
    public UnaryCallSettings.Builder<CancelBatchPredictionJobRequest, Empty>
        cancelBatchPredictionJobSettings() {
      return cancelBatchPredictionJobSettings;
    }

    /**
     * Returns the builder for the settings used for calls to createModelDeploymentMonitoringJob.
     */
    public UnaryCallSettings.Builder<
            CreateModelDeploymentMonitoringJobRequest, ModelDeploymentMonitoringJob>
        createModelDeploymentMonitoringJobSettings() {
      return createModelDeploymentMonitoringJobSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * searchModelDeploymentMonitoringStatsAnomalies.
     */
    public PagedCallSettings.Builder<
            SearchModelDeploymentMonitoringStatsAnomaliesRequest,
            SearchModelDeploymentMonitoringStatsAnomaliesResponse,
            SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse>
        searchModelDeploymentMonitoringStatsAnomaliesSettings() {
      return searchModelDeploymentMonitoringStatsAnomaliesSettings;
    }

    /** Returns the builder for the settings used for calls to getModelDeploymentMonitoringJob. */
    public UnaryCallSettings.Builder<
            GetModelDeploymentMonitoringJobRequest, ModelDeploymentMonitoringJob>
        getModelDeploymentMonitoringJobSettings() {
      return getModelDeploymentMonitoringJobSettings;
    }

    /** Returns the builder for the settings used for calls to listModelDeploymentMonitoringJobs. */
    public PagedCallSettings.Builder<
            ListModelDeploymentMonitoringJobsRequest,
            ListModelDeploymentMonitoringJobsResponse,
            ListModelDeploymentMonitoringJobsPagedResponse>
        listModelDeploymentMonitoringJobsSettings() {
      return listModelDeploymentMonitoringJobsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to updateModelDeploymentMonitoringJob.
     */
    public UnaryCallSettings.Builder<UpdateModelDeploymentMonitoringJobRequest, Operation>
        updateModelDeploymentMonitoringJobSettings() {
      return updateModelDeploymentMonitoringJobSettings;
    }

    /**
     * Returns the builder for the settings used for calls to updateModelDeploymentMonitoringJob.
     */
    public OperationCallSettings.Builder<
            UpdateModelDeploymentMonitoringJobRequest,
            ModelDeploymentMonitoringJob,
            UpdateModelDeploymentMonitoringJobOperationMetadata>
        updateModelDeploymentMonitoringJobOperationSettings() {
      return updateModelDeploymentMonitoringJobOperationSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteModelDeploymentMonitoringJob.
     */
    public UnaryCallSettings.Builder<DeleteModelDeploymentMonitoringJobRequest, Operation>
        deleteModelDeploymentMonitoringJobSettings() {
      return deleteModelDeploymentMonitoringJobSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteModelDeploymentMonitoringJob.
     */
    public OperationCallSettings.Builder<
            DeleteModelDeploymentMonitoringJobRequest, Empty, DeleteOperationMetadata>
        deleteModelDeploymentMonitoringJobOperationSettings() {
      return deleteModelDeploymentMonitoringJobOperationSettings;
    }

    /** Returns the builder for the settings used for calls to pauseModelDeploymentMonitoringJob. */
    public UnaryCallSettings.Builder<PauseModelDeploymentMonitoringJobRequest, Empty>
        pauseModelDeploymentMonitoringJobSettings() {
      return pauseModelDeploymentMonitoringJobSettings;
    }

    /**
     * Returns the builder for the settings used for calls to resumeModelDeploymentMonitoringJob.
     */
    public UnaryCallSettings.Builder<ResumeModelDeploymentMonitoringJobRequest, Empty>
        resumeModelDeploymentMonitoringJobSettings() {
      return resumeModelDeploymentMonitoringJobSettings;
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return listLocationsSettings;
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getLocationSettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    @Override
    public JobServiceStubSettings build() throws IOException {
      return new JobServiceStubSettings(this);
    }
  }
}
