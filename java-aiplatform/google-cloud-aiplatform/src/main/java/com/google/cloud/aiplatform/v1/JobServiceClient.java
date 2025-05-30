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

package com.google.cloud.aiplatform.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1.stub.JobServiceStub;
import com.google.cloud.aiplatform.v1.stub.JobServiceStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: A service for creating and managing Vertex AI's jobs.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   CustomJob customJob = CustomJob.newBuilder().build();
 *   CustomJob response = jobServiceClient.createCustomJob(parent, customJob);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the JobServiceClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> CreateCustomJob</td>
 *      <td><p> Creates a CustomJob. A created CustomJob right away will be attempted to be run.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createCustomJob(CreateCustomJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createCustomJob(LocationName parent, CustomJob customJob)
 *           <li><p> createCustomJob(String parent, CustomJob customJob)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createCustomJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetCustomJob</td>
 *      <td><p> Gets a CustomJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getCustomJob(GetCustomJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getCustomJob(CustomJobName name)
 *           <li><p> getCustomJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getCustomJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListCustomJobs</td>
 *      <td><p> Lists CustomJobs in a Location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listCustomJobs(ListCustomJobsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listCustomJobs(LocationName parent)
 *           <li><p> listCustomJobs(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listCustomJobsPagedCallable()
 *           <li><p> listCustomJobsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteCustomJob</td>
 *      <td><p> Deletes a CustomJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteCustomJobAsync(DeleteCustomJobRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteCustomJobAsync(CustomJobName name)
 *           <li><p> deleteCustomJobAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteCustomJobOperationCallable()
 *           <li><p> deleteCustomJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CancelCustomJob</td>
 *      <td><p> Cancels a CustomJob. Starts asynchronous cancellation on the CustomJob. The server makes a best effort to cancel the job, but success is not guaranteed. Clients can use [JobService.GetCustomJob][google.cloud.aiplatform.v1.JobService.GetCustomJob] or other methods to check whether the cancellation succeeded or whether the job completed despite cancellation. On successful cancellation, the CustomJob is not deleted; instead it becomes a job with a [CustomJob.error][google.cloud.aiplatform.v1.CustomJob.error] value with a [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to `Code.CANCELLED`, and [CustomJob.state][google.cloud.aiplatform.v1.CustomJob.state] is set to `CANCELLED`.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> cancelCustomJob(CancelCustomJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> cancelCustomJob(CustomJobName name)
 *           <li><p> cancelCustomJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> cancelCustomJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateDataLabelingJob</td>
 *      <td><p> Creates a DataLabelingJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createDataLabelingJob(CreateDataLabelingJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createDataLabelingJob(LocationName parent, DataLabelingJob dataLabelingJob)
 *           <li><p> createDataLabelingJob(String parent, DataLabelingJob dataLabelingJob)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createDataLabelingJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetDataLabelingJob</td>
 *      <td><p> Gets a DataLabelingJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getDataLabelingJob(GetDataLabelingJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getDataLabelingJob(DataLabelingJobName name)
 *           <li><p> getDataLabelingJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getDataLabelingJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListDataLabelingJobs</td>
 *      <td><p> Lists DataLabelingJobs in a Location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listDataLabelingJobs(ListDataLabelingJobsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listDataLabelingJobs(LocationName parent)
 *           <li><p> listDataLabelingJobs(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listDataLabelingJobsPagedCallable()
 *           <li><p> listDataLabelingJobsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteDataLabelingJob</td>
 *      <td><p> Deletes a DataLabelingJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteDataLabelingJobAsync(DeleteDataLabelingJobRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteDataLabelingJobAsync(DataLabelingJobName name)
 *           <li><p> deleteDataLabelingJobAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteDataLabelingJobOperationCallable()
 *           <li><p> deleteDataLabelingJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CancelDataLabelingJob</td>
 *      <td><p> Cancels a DataLabelingJob. Success of cancellation is not guaranteed.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> cancelDataLabelingJob(CancelDataLabelingJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> cancelDataLabelingJob(DataLabelingJobName name)
 *           <li><p> cancelDataLabelingJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> cancelDataLabelingJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateHyperparameterTuningJob</td>
 *      <td><p> Creates a HyperparameterTuningJob</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createHyperparameterTuningJob(CreateHyperparameterTuningJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createHyperparameterTuningJob(LocationName parent, HyperparameterTuningJob hyperparameterTuningJob)
 *           <li><p> createHyperparameterTuningJob(String parent, HyperparameterTuningJob hyperparameterTuningJob)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createHyperparameterTuningJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetHyperparameterTuningJob</td>
 *      <td><p> Gets a HyperparameterTuningJob</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getHyperparameterTuningJob(GetHyperparameterTuningJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getHyperparameterTuningJob(HyperparameterTuningJobName name)
 *           <li><p> getHyperparameterTuningJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getHyperparameterTuningJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListHyperparameterTuningJobs</td>
 *      <td><p> Lists HyperparameterTuningJobs in a Location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listHyperparameterTuningJobs(ListHyperparameterTuningJobsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listHyperparameterTuningJobs(LocationName parent)
 *           <li><p> listHyperparameterTuningJobs(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listHyperparameterTuningJobsPagedCallable()
 *           <li><p> listHyperparameterTuningJobsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteHyperparameterTuningJob</td>
 *      <td><p> Deletes a HyperparameterTuningJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteHyperparameterTuningJobAsync(DeleteHyperparameterTuningJobRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteHyperparameterTuningJobAsync(HyperparameterTuningJobName name)
 *           <li><p> deleteHyperparameterTuningJobAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteHyperparameterTuningJobOperationCallable()
 *           <li><p> deleteHyperparameterTuningJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CancelHyperparameterTuningJob</td>
 *      <td><p> Cancels a HyperparameterTuningJob. Starts asynchronous cancellation on the HyperparameterTuningJob. The server makes a best effort to cancel the job, but success is not guaranteed. Clients can use [JobService.GetHyperparameterTuningJob][google.cloud.aiplatform.v1.JobService.GetHyperparameterTuningJob] or other methods to check whether the cancellation succeeded or whether the job completed despite cancellation. On successful cancellation, the HyperparameterTuningJob is not deleted; instead it becomes a job with a [HyperparameterTuningJob.error][google.cloud.aiplatform.v1.HyperparameterTuningJob.error] value with a [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to `Code.CANCELLED`, and [HyperparameterTuningJob.state][google.cloud.aiplatform.v1.HyperparameterTuningJob.state] is set to `CANCELLED`.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> cancelHyperparameterTuningJob(CancelHyperparameterTuningJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> cancelHyperparameterTuningJob(HyperparameterTuningJobName name)
 *           <li><p> cancelHyperparameterTuningJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> cancelHyperparameterTuningJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateNasJob</td>
 *      <td><p> Creates a NasJob</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createNasJob(CreateNasJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createNasJob(LocationName parent, NasJob nasJob)
 *           <li><p> createNasJob(String parent, NasJob nasJob)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createNasJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetNasJob</td>
 *      <td><p> Gets a NasJob</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getNasJob(GetNasJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getNasJob(NasJobName name)
 *           <li><p> getNasJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getNasJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListNasJobs</td>
 *      <td><p> Lists NasJobs in a Location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listNasJobs(ListNasJobsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listNasJobs(LocationName parent)
 *           <li><p> listNasJobs(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listNasJobsPagedCallable()
 *           <li><p> listNasJobsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteNasJob</td>
 *      <td><p> Deletes a NasJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteNasJobAsync(DeleteNasJobRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteNasJobAsync(NasJobName name)
 *           <li><p> deleteNasJobAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteNasJobOperationCallable()
 *           <li><p> deleteNasJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CancelNasJob</td>
 *      <td><p> Cancels a NasJob. Starts asynchronous cancellation on the NasJob. The server makes a best effort to cancel the job, but success is not guaranteed. Clients can use [JobService.GetNasJob][google.cloud.aiplatform.v1.JobService.GetNasJob] or other methods to check whether the cancellation succeeded or whether the job completed despite cancellation. On successful cancellation, the NasJob is not deleted; instead it becomes a job with a [NasJob.error][google.cloud.aiplatform.v1.NasJob.error] value with a [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to `Code.CANCELLED`, and [NasJob.state][google.cloud.aiplatform.v1.NasJob.state] is set to `CANCELLED`.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> cancelNasJob(CancelNasJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> cancelNasJob(NasJobName name)
 *           <li><p> cancelNasJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> cancelNasJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetNasTrialDetail</td>
 *      <td><p> Gets a NasTrialDetail.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getNasTrialDetail(GetNasTrialDetailRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getNasTrialDetail(NasTrialDetailName name)
 *           <li><p> getNasTrialDetail(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getNasTrialDetailCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListNasTrialDetails</td>
 *      <td><p> List top NasTrialDetails of a NasJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listNasTrialDetails(ListNasTrialDetailsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listNasTrialDetails(NasJobName parent)
 *           <li><p> listNasTrialDetails(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listNasTrialDetailsPagedCallable()
 *           <li><p> listNasTrialDetailsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateBatchPredictionJob</td>
 *      <td><p> Creates a BatchPredictionJob. A BatchPredictionJob once created will right away be attempted to start.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createBatchPredictionJob(CreateBatchPredictionJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createBatchPredictionJob(LocationName parent, BatchPredictionJob batchPredictionJob)
 *           <li><p> createBatchPredictionJob(String parent, BatchPredictionJob batchPredictionJob)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createBatchPredictionJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetBatchPredictionJob</td>
 *      <td><p> Gets a BatchPredictionJob</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getBatchPredictionJob(GetBatchPredictionJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getBatchPredictionJob(BatchPredictionJobName name)
 *           <li><p> getBatchPredictionJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getBatchPredictionJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListBatchPredictionJobs</td>
 *      <td><p> Lists BatchPredictionJobs in a Location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listBatchPredictionJobs(ListBatchPredictionJobsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listBatchPredictionJobs(LocationName parent)
 *           <li><p> listBatchPredictionJobs(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listBatchPredictionJobsPagedCallable()
 *           <li><p> listBatchPredictionJobsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteBatchPredictionJob</td>
 *      <td><p> Deletes a BatchPredictionJob. Can only be called on jobs that already finished.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteBatchPredictionJobAsync(DeleteBatchPredictionJobRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteBatchPredictionJobAsync(BatchPredictionJobName name)
 *           <li><p> deleteBatchPredictionJobAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteBatchPredictionJobOperationCallable()
 *           <li><p> deleteBatchPredictionJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CancelBatchPredictionJob</td>
 *      <td><p> Cancels a BatchPredictionJob.
 * <p>  Starts asynchronous cancellation on the BatchPredictionJob. The server makes the best effort to cancel the job, but success is not guaranteed. Clients can use [JobService.GetBatchPredictionJob][google.cloud.aiplatform.v1.JobService.GetBatchPredictionJob] or other methods to check whether the cancellation succeeded or whether the job completed despite cancellation. On a successful cancellation, the BatchPredictionJob is not deleted;instead its [BatchPredictionJob.state][google.cloud.aiplatform.v1.BatchPredictionJob.state] is set to `CANCELLED`. Any files already outputted by the job are not deleted.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> cancelBatchPredictionJob(CancelBatchPredictionJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> cancelBatchPredictionJob(BatchPredictionJobName name)
 *           <li><p> cancelBatchPredictionJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> cancelBatchPredictionJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateModelDeploymentMonitoringJob</td>
 *      <td><p> Creates a ModelDeploymentMonitoringJob. It will run periodically on a configured interval.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createModelDeploymentMonitoringJob(CreateModelDeploymentMonitoringJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createModelDeploymentMonitoringJob(LocationName parent, ModelDeploymentMonitoringJob modelDeploymentMonitoringJob)
 *           <li><p> createModelDeploymentMonitoringJob(String parent, ModelDeploymentMonitoringJob modelDeploymentMonitoringJob)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createModelDeploymentMonitoringJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SearchModelDeploymentMonitoringStatsAnomalies</td>
 *      <td><p> Searches Model Monitoring Statistics generated within a given time window.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> searchModelDeploymentMonitoringStatsAnomalies(SearchModelDeploymentMonitoringStatsAnomaliesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> searchModelDeploymentMonitoringStatsAnomalies(ModelDeploymentMonitoringJobName modelDeploymentMonitoringJob, String deployedModelId)
 *           <li><p> searchModelDeploymentMonitoringStatsAnomalies(String modelDeploymentMonitoringJob, String deployedModelId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> searchModelDeploymentMonitoringStatsAnomaliesPagedCallable()
 *           <li><p> searchModelDeploymentMonitoringStatsAnomaliesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetModelDeploymentMonitoringJob</td>
 *      <td><p> Gets a ModelDeploymentMonitoringJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getModelDeploymentMonitoringJob(GetModelDeploymentMonitoringJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getModelDeploymentMonitoringJob(ModelDeploymentMonitoringJobName name)
 *           <li><p> getModelDeploymentMonitoringJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getModelDeploymentMonitoringJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListModelDeploymentMonitoringJobs</td>
 *      <td><p> Lists ModelDeploymentMonitoringJobs in a Location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listModelDeploymentMonitoringJobs(ListModelDeploymentMonitoringJobsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listModelDeploymentMonitoringJobs(LocationName parent)
 *           <li><p> listModelDeploymentMonitoringJobs(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listModelDeploymentMonitoringJobsPagedCallable()
 *           <li><p> listModelDeploymentMonitoringJobsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateModelDeploymentMonitoringJob</td>
 *      <td><p> Updates a ModelDeploymentMonitoringJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateModelDeploymentMonitoringJobAsync(UpdateModelDeploymentMonitoringJobRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateModelDeploymentMonitoringJobAsync(ModelDeploymentMonitoringJob modelDeploymentMonitoringJob, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateModelDeploymentMonitoringJobOperationCallable()
 *           <li><p> updateModelDeploymentMonitoringJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteModelDeploymentMonitoringJob</td>
 *      <td><p> Deletes a ModelDeploymentMonitoringJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteModelDeploymentMonitoringJobAsync(DeleteModelDeploymentMonitoringJobRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteModelDeploymentMonitoringJobAsync(ModelDeploymentMonitoringJobName name)
 *           <li><p> deleteModelDeploymentMonitoringJobAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteModelDeploymentMonitoringJobOperationCallable()
 *           <li><p> deleteModelDeploymentMonitoringJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> PauseModelDeploymentMonitoringJob</td>
 *      <td><p> Pauses a ModelDeploymentMonitoringJob. If the job is running, the server makes a best effort to cancel the job. Will mark [ModelDeploymentMonitoringJob.state][google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.state] to 'PAUSED'.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> pauseModelDeploymentMonitoringJob(PauseModelDeploymentMonitoringJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> pauseModelDeploymentMonitoringJob(ModelDeploymentMonitoringJobName name)
 *           <li><p> pauseModelDeploymentMonitoringJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> pauseModelDeploymentMonitoringJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ResumeModelDeploymentMonitoringJob</td>
 *      <td><p> Resumes a paused ModelDeploymentMonitoringJob. It will start to run from next scheduled time. A deleted ModelDeploymentMonitoringJob can't be resumed.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> resumeModelDeploymentMonitoringJob(ResumeModelDeploymentMonitoringJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> resumeModelDeploymentMonitoringJob(ModelDeploymentMonitoringJobName name)
 *           <li><p> resumeModelDeploymentMonitoringJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> resumeModelDeploymentMonitoringJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListLocations</td>
 *      <td><p> Lists information about the supported locations for this service.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listLocations(ListLocationsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listLocationsPagedCallable()
 *           <li><p> listLocationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetLocation</td>
 *      <td><p> Gets information about a location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getLocation(GetLocationRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getLocationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SetIamPolicy</td>
 *      <td><p> Sets the access control policy on the specified resource. Replacesany existing policy.
 * <p> Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED`errors.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> setIamPolicy(SetIamPolicyRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> setIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetIamPolicy</td>
 *      <td><p> Gets the access control policy for a resource. Returns an empty policyif the resource exists and does not have a policy set.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getIamPolicy(GetIamPolicyRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> TestIamPermissions</td>
 *      <td><p> Returns permissions that a caller has on the specified resource. If theresource does not exist, this will return an empty set ofpermissions, not a `NOT_FOUND` error.
 * <p> Note: This operation is designed to be used for buildingpermission-aware UIs and command-line tools, not for authorizationchecking. This operation may "fail open" without warning.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> testIamPermissions(TestIamPermissionsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> testIamPermissionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of JobServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * JobServiceSettings jobServiceSettings =
 *     JobServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * JobServiceClient jobServiceClient = JobServiceClient.create(jobServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * JobServiceSettings jobServiceSettings =
 *     JobServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * JobServiceClient jobServiceClient = JobServiceClient.create(jobServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class JobServiceClient implements BackgroundResource {
  private final JobServiceSettings settings;
  private final JobServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of JobServiceClient with default settings. */
  public static final JobServiceClient create() throws IOException {
    return create(JobServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of JobServiceClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final JobServiceClient create(JobServiceSettings settings) throws IOException {
    return new JobServiceClient(settings);
  }

  /**
   * Constructs an instance of JobServiceClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(JobServiceSettings).
   */
  public static final JobServiceClient create(JobServiceStub stub) {
    return new JobServiceClient(stub);
  }

  /**
   * Constructs an instance of JobServiceClient, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected JobServiceClient(JobServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((JobServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  protected JobServiceClient(JobServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final JobServiceSettings getSettings() {
    return settings;
  }

  public JobServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a CustomJob. A created CustomJob right away will be attempted to be run.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   CustomJob customJob = CustomJob.newBuilder().build();
   *   CustomJob response = jobServiceClient.createCustomJob(parent, customJob);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create the CustomJob in. Format:
   *     `projects/{project}/locations/{location}`
   * @param customJob Required. The CustomJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomJob createCustomJob(LocationName parent, CustomJob customJob) {
    CreateCustomJobRequest request =
        CreateCustomJobRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setCustomJob(customJob)
            .build();
    return createCustomJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a CustomJob. A created CustomJob right away will be attempted to be run.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   CustomJob customJob = CustomJob.newBuilder().build();
   *   CustomJob response = jobServiceClient.createCustomJob(parent, customJob);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create the CustomJob in. Format:
   *     `projects/{project}/locations/{location}`
   * @param customJob Required. The CustomJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomJob createCustomJob(String parent, CustomJob customJob) {
    CreateCustomJobRequest request =
        CreateCustomJobRequest.newBuilder().setParent(parent).setCustomJob(customJob).build();
    return createCustomJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a CustomJob. A created CustomJob right away will be attempted to be run.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateCustomJobRequest request =
   *       CreateCustomJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setCustomJob(CustomJob.newBuilder().build())
   *           .build();
   *   CustomJob response = jobServiceClient.createCustomJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomJob createCustomJob(CreateCustomJobRequest request) {
    return createCustomJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a CustomJob. A created CustomJob right away will be attempted to be run.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateCustomJobRequest request =
   *       CreateCustomJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setCustomJob(CustomJob.newBuilder().build())
   *           .build();
   *   ApiFuture<CustomJob> future = jobServiceClient.createCustomJobCallable().futureCall(request);
   *   // Do something.
   *   CustomJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateCustomJobRequest, CustomJob> createCustomJobCallable() {
    return stub.createCustomJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a CustomJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CustomJobName name = CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]");
   *   CustomJob response = jobServiceClient.getCustomJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the CustomJob resource. Format:
   *     `projects/{project}/locations/{location}/customJobs/{custom_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomJob getCustomJob(CustomJobName name) {
    GetCustomJobRequest request =
        GetCustomJobRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getCustomJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a CustomJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name = CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]").toString();
   *   CustomJob response = jobServiceClient.getCustomJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the CustomJob resource. Format:
   *     `projects/{project}/locations/{location}/customJobs/{custom_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomJob getCustomJob(String name) {
    GetCustomJobRequest request = GetCustomJobRequest.newBuilder().setName(name).build();
    return getCustomJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a CustomJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetCustomJobRequest request =
   *       GetCustomJobRequest.newBuilder()
   *           .setName(CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]").toString())
   *           .build();
   *   CustomJob response = jobServiceClient.getCustomJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomJob getCustomJob(GetCustomJobRequest request) {
    return getCustomJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a CustomJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetCustomJobRequest request =
   *       GetCustomJobRequest.newBuilder()
   *           .setName(CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]").toString())
   *           .build();
   *   ApiFuture<CustomJob> future = jobServiceClient.getCustomJobCallable().futureCall(request);
   *   // Do something.
   *   CustomJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetCustomJobRequest, CustomJob> getCustomJobCallable() {
    return stub.getCustomJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists CustomJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (CustomJob element : jobServiceClient.listCustomJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list the CustomJobs from. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCustomJobsPagedResponse listCustomJobs(LocationName parent) {
    ListCustomJobsRequest request =
        ListCustomJobsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listCustomJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists CustomJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (CustomJob element : jobServiceClient.listCustomJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list the CustomJobs from. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCustomJobsPagedResponse listCustomJobs(String parent) {
    ListCustomJobsRequest request = ListCustomJobsRequest.newBuilder().setParent(parent).build();
    return listCustomJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists CustomJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListCustomJobsRequest request =
   *       ListCustomJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   for (CustomJob element : jobServiceClient.listCustomJobs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCustomJobsPagedResponse listCustomJobs(ListCustomJobsRequest request) {
    return listCustomJobsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists CustomJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListCustomJobsRequest request =
   *       ListCustomJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<CustomJob> future =
   *       jobServiceClient.listCustomJobsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (CustomJob element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListCustomJobsRequest, ListCustomJobsPagedResponse>
      listCustomJobsPagedCallable() {
    return stub.listCustomJobsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists CustomJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListCustomJobsRequest request =
   *       ListCustomJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   while (true) {
   *     ListCustomJobsResponse response = jobServiceClient.listCustomJobsCallable().call(request);
   *     for (CustomJob element : response.getCustomJobsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListCustomJobsRequest, ListCustomJobsResponse>
      listCustomJobsCallable() {
    return stub.listCustomJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a CustomJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CustomJobName name = CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]");
   *   jobServiceClient.deleteCustomJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the CustomJob resource to be deleted. Format:
   *     `projects/{project}/locations/{location}/customJobs/{custom_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteCustomJobAsync(
      CustomJobName name) {
    DeleteCustomJobRequest request =
        DeleteCustomJobRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteCustomJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a CustomJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name = CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]").toString();
   *   jobServiceClient.deleteCustomJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the CustomJob resource to be deleted. Format:
   *     `projects/{project}/locations/{location}/customJobs/{custom_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteCustomJobAsync(String name) {
    DeleteCustomJobRequest request = DeleteCustomJobRequest.newBuilder().setName(name).build();
    return deleteCustomJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a CustomJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteCustomJobRequest request =
   *       DeleteCustomJobRequest.newBuilder()
   *           .setName(CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]").toString())
   *           .build();
   *   jobServiceClient.deleteCustomJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteCustomJobAsync(
      DeleteCustomJobRequest request) {
    return deleteCustomJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a CustomJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteCustomJobRequest request =
   *       DeleteCustomJobRequest.newBuilder()
   *           .setName(CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]").toString())
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       jobServiceClient.deleteCustomJobOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteCustomJobRequest, Empty, DeleteOperationMetadata>
      deleteCustomJobOperationCallable() {
    return stub.deleteCustomJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a CustomJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteCustomJobRequest request =
   *       DeleteCustomJobRequest.newBuilder()
   *           .setName(CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]").toString())
   *           .build();
   *   ApiFuture<Operation> future = jobServiceClient.deleteCustomJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteCustomJobRequest, Operation> deleteCustomJobCallable() {
    return stub.deleteCustomJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a CustomJob. Starts asynchronous cancellation on the CustomJob. The server makes a best
   * effort to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetCustomJob][google.cloud.aiplatform.v1.JobService.GetCustomJob] or other methods
   * to check whether the cancellation succeeded or whether the job completed despite cancellation.
   * On successful cancellation, the CustomJob is not deleted; instead it becomes a job with a
   * [CustomJob.error][google.cloud.aiplatform.v1.CustomJob.error] value with a
   * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to `Code.CANCELLED`, and
   * [CustomJob.state][google.cloud.aiplatform.v1.CustomJob.state] is set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CustomJobName name = CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]");
   *   jobServiceClient.cancelCustomJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the CustomJob to cancel. Format:
   *     `projects/{project}/locations/{location}/customJobs/{custom_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelCustomJob(CustomJobName name) {
    CancelCustomJobRequest request =
        CancelCustomJobRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    cancelCustomJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a CustomJob. Starts asynchronous cancellation on the CustomJob. The server makes a best
   * effort to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetCustomJob][google.cloud.aiplatform.v1.JobService.GetCustomJob] or other methods
   * to check whether the cancellation succeeded or whether the job completed despite cancellation.
   * On successful cancellation, the CustomJob is not deleted; instead it becomes a job with a
   * [CustomJob.error][google.cloud.aiplatform.v1.CustomJob.error] value with a
   * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to `Code.CANCELLED`, and
   * [CustomJob.state][google.cloud.aiplatform.v1.CustomJob.state] is set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name = CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]").toString();
   *   jobServiceClient.cancelCustomJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the CustomJob to cancel. Format:
   *     `projects/{project}/locations/{location}/customJobs/{custom_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelCustomJob(String name) {
    CancelCustomJobRequest request = CancelCustomJobRequest.newBuilder().setName(name).build();
    cancelCustomJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a CustomJob. Starts asynchronous cancellation on the CustomJob. The server makes a best
   * effort to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetCustomJob][google.cloud.aiplatform.v1.JobService.GetCustomJob] or other methods
   * to check whether the cancellation succeeded or whether the job completed despite cancellation.
   * On successful cancellation, the CustomJob is not deleted; instead it becomes a job with a
   * [CustomJob.error][google.cloud.aiplatform.v1.CustomJob.error] value with a
   * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to `Code.CANCELLED`, and
   * [CustomJob.state][google.cloud.aiplatform.v1.CustomJob.state] is set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CancelCustomJobRequest request =
   *       CancelCustomJobRequest.newBuilder()
   *           .setName(CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]").toString())
   *           .build();
   *   jobServiceClient.cancelCustomJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelCustomJob(CancelCustomJobRequest request) {
    cancelCustomJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a CustomJob. Starts asynchronous cancellation on the CustomJob. The server makes a best
   * effort to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetCustomJob][google.cloud.aiplatform.v1.JobService.GetCustomJob] or other methods
   * to check whether the cancellation succeeded or whether the job completed despite cancellation.
   * On successful cancellation, the CustomJob is not deleted; instead it becomes a job with a
   * [CustomJob.error][google.cloud.aiplatform.v1.CustomJob.error] value with a
   * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to `Code.CANCELLED`, and
   * [CustomJob.state][google.cloud.aiplatform.v1.CustomJob.state] is set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CancelCustomJobRequest request =
   *       CancelCustomJobRequest.newBuilder()
   *           .setName(CustomJobName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_JOB]").toString())
   *           .build();
   *   ApiFuture<Empty> future = jobServiceClient.cancelCustomJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CancelCustomJobRequest, Empty> cancelCustomJobCallable() {
    return stub.cancelCustomJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   DataLabelingJob dataLabelingJob = DataLabelingJob.newBuilder().build();
   *   DataLabelingJob response = jobServiceClient.createDataLabelingJob(parent, dataLabelingJob);
   * }
   * }</pre>
   *
   * @param parent Required. The parent of the DataLabelingJob. Format:
   *     `projects/{project}/locations/{location}`
   * @param dataLabelingJob Required. The DataLabelingJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataLabelingJob createDataLabelingJob(
      LocationName parent, DataLabelingJob dataLabelingJob) {
    CreateDataLabelingJobRequest request =
        CreateDataLabelingJobRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setDataLabelingJob(dataLabelingJob)
            .build();
    return createDataLabelingJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   DataLabelingJob dataLabelingJob = DataLabelingJob.newBuilder().build();
   *   DataLabelingJob response = jobServiceClient.createDataLabelingJob(parent, dataLabelingJob);
   * }
   * }</pre>
   *
   * @param parent Required. The parent of the DataLabelingJob. Format:
   *     `projects/{project}/locations/{location}`
   * @param dataLabelingJob Required. The DataLabelingJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataLabelingJob createDataLabelingJob(
      String parent, DataLabelingJob dataLabelingJob) {
    CreateDataLabelingJobRequest request =
        CreateDataLabelingJobRequest.newBuilder()
            .setParent(parent)
            .setDataLabelingJob(dataLabelingJob)
            .build();
    return createDataLabelingJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateDataLabelingJobRequest request =
   *       CreateDataLabelingJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setDataLabelingJob(DataLabelingJob.newBuilder().build())
   *           .build();
   *   DataLabelingJob response = jobServiceClient.createDataLabelingJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataLabelingJob createDataLabelingJob(CreateDataLabelingJobRequest request) {
    return createDataLabelingJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateDataLabelingJobRequest request =
   *       CreateDataLabelingJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setDataLabelingJob(DataLabelingJob.newBuilder().build())
   *           .build();
   *   ApiFuture<DataLabelingJob> future =
   *       jobServiceClient.createDataLabelingJobCallable().futureCall(request);
   *   // Do something.
   *   DataLabelingJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateDataLabelingJobRequest, DataLabelingJob>
      createDataLabelingJobCallable() {
    return stub.createDataLabelingJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DataLabelingJobName name =
   *       DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]");
   *   DataLabelingJob response = jobServiceClient.getDataLabelingJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the DataLabelingJob. Format:
   *     `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataLabelingJob getDataLabelingJob(DataLabelingJobName name) {
    GetDataLabelingJobRequest request =
        GetDataLabelingJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getDataLabelingJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]").toString();
   *   DataLabelingJob response = jobServiceClient.getDataLabelingJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the DataLabelingJob. Format:
   *     `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataLabelingJob getDataLabelingJob(String name) {
    GetDataLabelingJobRequest request =
        GetDataLabelingJobRequest.newBuilder().setName(name).build();
    return getDataLabelingJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetDataLabelingJobRequest request =
   *       GetDataLabelingJobRequest.newBuilder()
   *           .setName(
   *               DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]")
   *                   .toString())
   *           .build();
   *   DataLabelingJob response = jobServiceClient.getDataLabelingJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataLabelingJob getDataLabelingJob(GetDataLabelingJobRequest request) {
    return getDataLabelingJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetDataLabelingJobRequest request =
   *       GetDataLabelingJobRequest.newBuilder()
   *           .setName(
   *               DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<DataLabelingJob> future =
   *       jobServiceClient.getDataLabelingJobCallable().futureCall(request);
   *   // Do something.
   *   DataLabelingJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetDataLabelingJobRequest, DataLabelingJob>
      getDataLabelingJobCallable() {
    return stub.getDataLabelingJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists DataLabelingJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (DataLabelingJob element : jobServiceClient.listDataLabelingJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent of the DataLabelingJob. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDataLabelingJobsPagedResponse listDataLabelingJobs(LocationName parent) {
    ListDataLabelingJobsRequest request =
        ListDataLabelingJobsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listDataLabelingJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists DataLabelingJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (DataLabelingJob element : jobServiceClient.listDataLabelingJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent of the DataLabelingJob. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDataLabelingJobsPagedResponse listDataLabelingJobs(String parent) {
    ListDataLabelingJobsRequest request =
        ListDataLabelingJobsRequest.newBuilder().setParent(parent).build();
    return listDataLabelingJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists DataLabelingJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListDataLabelingJobsRequest request =
   *       ListDataLabelingJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (DataLabelingJob element : jobServiceClient.listDataLabelingJobs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDataLabelingJobsPagedResponse listDataLabelingJobs(
      ListDataLabelingJobsRequest request) {
    return listDataLabelingJobsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists DataLabelingJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListDataLabelingJobsRequest request =
   *       ListDataLabelingJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<DataLabelingJob> future =
   *       jobServiceClient.listDataLabelingJobsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (DataLabelingJob element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListDataLabelingJobsRequest, ListDataLabelingJobsPagedResponse>
      listDataLabelingJobsPagedCallable() {
    return stub.listDataLabelingJobsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists DataLabelingJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListDataLabelingJobsRequest request =
   *       ListDataLabelingJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListDataLabelingJobsResponse response =
   *         jobServiceClient.listDataLabelingJobsCallable().call(request);
   *     for (DataLabelingJob element : response.getDataLabelingJobsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListDataLabelingJobsRequest, ListDataLabelingJobsResponse>
      listDataLabelingJobsCallable() {
    return stub.listDataLabelingJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DataLabelingJobName name =
   *       DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]");
   *   jobServiceClient.deleteDataLabelingJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the DataLabelingJob to be deleted. Format:
   *     `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteDataLabelingJobAsync(
      DataLabelingJobName name) {
    DeleteDataLabelingJobRequest request =
        DeleteDataLabelingJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteDataLabelingJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]").toString();
   *   jobServiceClient.deleteDataLabelingJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the DataLabelingJob to be deleted. Format:
   *     `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteDataLabelingJobAsync(
      String name) {
    DeleteDataLabelingJobRequest request =
        DeleteDataLabelingJobRequest.newBuilder().setName(name).build();
    return deleteDataLabelingJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteDataLabelingJobRequest request =
   *       DeleteDataLabelingJobRequest.newBuilder()
   *           .setName(
   *               DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]")
   *                   .toString())
   *           .build();
   *   jobServiceClient.deleteDataLabelingJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteDataLabelingJobAsync(
      DeleteDataLabelingJobRequest request) {
    return deleteDataLabelingJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteDataLabelingJobRequest request =
   *       DeleteDataLabelingJobRequest.newBuilder()
   *           .setName(
   *               DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]")
   *                   .toString())
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       jobServiceClient.deleteDataLabelingJobOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteDataLabelingJobRequest, Empty, DeleteOperationMetadata>
      deleteDataLabelingJobOperationCallable() {
    return stub.deleteDataLabelingJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a DataLabelingJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteDataLabelingJobRequest request =
   *       DeleteDataLabelingJobRequest.newBuilder()
   *           .setName(
   *               DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       jobServiceClient.deleteDataLabelingJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteDataLabelingJobRequest, Operation>
      deleteDataLabelingJobCallable() {
    return stub.deleteDataLabelingJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a DataLabelingJob. Success of cancellation is not guaranteed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DataLabelingJobName name =
   *       DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]");
   *   jobServiceClient.cancelDataLabelingJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the DataLabelingJob. Format:
   *     `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelDataLabelingJob(DataLabelingJobName name) {
    CancelDataLabelingJobRequest request =
        CancelDataLabelingJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    cancelDataLabelingJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a DataLabelingJob. Success of cancellation is not guaranteed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]").toString();
   *   jobServiceClient.cancelDataLabelingJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the DataLabelingJob. Format:
   *     `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelDataLabelingJob(String name) {
    CancelDataLabelingJobRequest request =
        CancelDataLabelingJobRequest.newBuilder().setName(name).build();
    cancelDataLabelingJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a DataLabelingJob. Success of cancellation is not guaranteed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CancelDataLabelingJobRequest request =
   *       CancelDataLabelingJobRequest.newBuilder()
   *           .setName(
   *               DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]")
   *                   .toString())
   *           .build();
   *   jobServiceClient.cancelDataLabelingJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelDataLabelingJob(CancelDataLabelingJobRequest request) {
    cancelDataLabelingJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a DataLabelingJob. Success of cancellation is not guaranteed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CancelDataLabelingJobRequest request =
   *       CancelDataLabelingJobRequest.newBuilder()
   *           .setName(
   *               DataLabelingJobName.of("[PROJECT]", "[LOCATION]", "[DATA_LABELING_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       jobServiceClient.cancelDataLabelingJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CancelDataLabelingJobRequest, Empty> cancelDataLabelingJobCallable() {
    return stub.cancelDataLabelingJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a HyperparameterTuningJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   HyperparameterTuningJob hyperparameterTuningJob =
   *       HyperparameterTuningJob.newBuilder().build();
   *   HyperparameterTuningJob response =
   *       jobServiceClient.createHyperparameterTuningJob(parent, hyperparameterTuningJob);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create the HyperparameterTuningJob
   *     in. Format: `projects/{project}/locations/{location}`
   * @param hyperparameterTuningJob Required. The HyperparameterTuningJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final HyperparameterTuningJob createHyperparameterTuningJob(
      LocationName parent, HyperparameterTuningJob hyperparameterTuningJob) {
    CreateHyperparameterTuningJobRequest request =
        CreateHyperparameterTuningJobRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setHyperparameterTuningJob(hyperparameterTuningJob)
            .build();
    return createHyperparameterTuningJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a HyperparameterTuningJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   HyperparameterTuningJob hyperparameterTuningJob =
   *       HyperparameterTuningJob.newBuilder().build();
   *   HyperparameterTuningJob response =
   *       jobServiceClient.createHyperparameterTuningJob(parent, hyperparameterTuningJob);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create the HyperparameterTuningJob
   *     in. Format: `projects/{project}/locations/{location}`
   * @param hyperparameterTuningJob Required. The HyperparameterTuningJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final HyperparameterTuningJob createHyperparameterTuningJob(
      String parent, HyperparameterTuningJob hyperparameterTuningJob) {
    CreateHyperparameterTuningJobRequest request =
        CreateHyperparameterTuningJobRequest.newBuilder()
            .setParent(parent)
            .setHyperparameterTuningJob(hyperparameterTuningJob)
            .build();
    return createHyperparameterTuningJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a HyperparameterTuningJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateHyperparameterTuningJobRequest request =
   *       CreateHyperparameterTuningJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setHyperparameterTuningJob(HyperparameterTuningJob.newBuilder().build())
   *           .build();
   *   HyperparameterTuningJob response = jobServiceClient.createHyperparameterTuningJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final HyperparameterTuningJob createHyperparameterTuningJob(
      CreateHyperparameterTuningJobRequest request) {
    return createHyperparameterTuningJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a HyperparameterTuningJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateHyperparameterTuningJobRequest request =
   *       CreateHyperparameterTuningJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setHyperparameterTuningJob(HyperparameterTuningJob.newBuilder().build())
   *           .build();
   *   ApiFuture<HyperparameterTuningJob> future =
   *       jobServiceClient.createHyperparameterTuningJobCallable().futureCall(request);
   *   // Do something.
   *   HyperparameterTuningJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateHyperparameterTuningJobRequest, HyperparameterTuningJob>
      createHyperparameterTuningJobCallable() {
    return stub.createHyperparameterTuningJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a HyperparameterTuningJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   HyperparameterTuningJobName name =
   *       HyperparameterTuningJobName.of("[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]");
   *   HyperparameterTuningJob response = jobServiceClient.getHyperparameterTuningJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the HyperparameterTuningJob resource. Format:
   *     `projects/{project}/locations/{location}/hyperparameterTuningJobs/{hyperparameter_tuning_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final HyperparameterTuningJob getHyperparameterTuningJob(
      HyperparameterTuningJobName name) {
    GetHyperparameterTuningJobRequest request =
        GetHyperparameterTuningJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getHyperparameterTuningJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a HyperparameterTuningJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       HyperparameterTuningJobName.of("[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]")
   *           .toString();
   *   HyperparameterTuningJob response = jobServiceClient.getHyperparameterTuningJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the HyperparameterTuningJob resource. Format:
   *     `projects/{project}/locations/{location}/hyperparameterTuningJobs/{hyperparameter_tuning_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final HyperparameterTuningJob getHyperparameterTuningJob(String name) {
    GetHyperparameterTuningJobRequest request =
        GetHyperparameterTuningJobRequest.newBuilder().setName(name).build();
    return getHyperparameterTuningJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a HyperparameterTuningJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetHyperparameterTuningJobRequest request =
   *       GetHyperparameterTuningJobRequest.newBuilder()
   *           .setName(
   *               HyperparameterTuningJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]")
   *                   .toString())
   *           .build();
   *   HyperparameterTuningJob response = jobServiceClient.getHyperparameterTuningJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final HyperparameterTuningJob getHyperparameterTuningJob(
      GetHyperparameterTuningJobRequest request) {
    return getHyperparameterTuningJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a HyperparameterTuningJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetHyperparameterTuningJobRequest request =
   *       GetHyperparameterTuningJobRequest.newBuilder()
   *           .setName(
   *               HyperparameterTuningJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<HyperparameterTuningJob> future =
   *       jobServiceClient.getHyperparameterTuningJobCallable().futureCall(request);
   *   // Do something.
   *   HyperparameterTuningJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetHyperparameterTuningJobRequest, HyperparameterTuningJob>
      getHyperparameterTuningJobCallable() {
    return stub.getHyperparameterTuningJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists HyperparameterTuningJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (HyperparameterTuningJob element :
   *       jobServiceClient.listHyperparameterTuningJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list the HyperparameterTuningJobs
   *     from. Format: `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListHyperparameterTuningJobsPagedResponse listHyperparameterTuningJobs(
      LocationName parent) {
    ListHyperparameterTuningJobsRequest request =
        ListHyperparameterTuningJobsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listHyperparameterTuningJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists HyperparameterTuningJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (HyperparameterTuningJob element :
   *       jobServiceClient.listHyperparameterTuningJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list the HyperparameterTuningJobs
   *     from. Format: `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListHyperparameterTuningJobsPagedResponse listHyperparameterTuningJobs(
      String parent) {
    ListHyperparameterTuningJobsRequest request =
        ListHyperparameterTuningJobsRequest.newBuilder().setParent(parent).build();
    return listHyperparameterTuningJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists HyperparameterTuningJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListHyperparameterTuningJobsRequest request =
   *       ListHyperparameterTuningJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   for (HyperparameterTuningJob element :
   *       jobServiceClient.listHyperparameterTuningJobs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListHyperparameterTuningJobsPagedResponse listHyperparameterTuningJobs(
      ListHyperparameterTuningJobsRequest request) {
    return listHyperparameterTuningJobsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists HyperparameterTuningJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListHyperparameterTuningJobsRequest request =
   *       ListHyperparameterTuningJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<HyperparameterTuningJob> future =
   *       jobServiceClient.listHyperparameterTuningJobsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (HyperparameterTuningJob element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListHyperparameterTuningJobsRequest, ListHyperparameterTuningJobsPagedResponse>
      listHyperparameterTuningJobsPagedCallable() {
    return stub.listHyperparameterTuningJobsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists HyperparameterTuningJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListHyperparameterTuningJobsRequest request =
   *       ListHyperparameterTuningJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   while (true) {
   *     ListHyperparameterTuningJobsResponse response =
   *         jobServiceClient.listHyperparameterTuningJobsCallable().call(request);
   *     for (HyperparameterTuningJob element : response.getHyperparameterTuningJobsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListHyperparameterTuningJobsRequest, ListHyperparameterTuningJobsResponse>
      listHyperparameterTuningJobsCallable() {
    return stub.listHyperparameterTuningJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a HyperparameterTuningJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   HyperparameterTuningJobName name =
   *       HyperparameterTuningJobName.of("[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]");
   *   jobServiceClient.deleteHyperparameterTuningJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the HyperparameterTuningJob resource to be deleted. Format:
   *     `projects/{project}/locations/{location}/hyperparameterTuningJobs/{hyperparameter_tuning_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteHyperparameterTuningJobAsync(
      HyperparameterTuningJobName name) {
    DeleteHyperparameterTuningJobRequest request =
        DeleteHyperparameterTuningJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteHyperparameterTuningJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a HyperparameterTuningJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       HyperparameterTuningJobName.of("[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]")
   *           .toString();
   *   jobServiceClient.deleteHyperparameterTuningJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the HyperparameterTuningJob resource to be deleted. Format:
   *     `projects/{project}/locations/{location}/hyperparameterTuningJobs/{hyperparameter_tuning_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteHyperparameterTuningJobAsync(
      String name) {
    DeleteHyperparameterTuningJobRequest request =
        DeleteHyperparameterTuningJobRequest.newBuilder().setName(name).build();
    return deleteHyperparameterTuningJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a HyperparameterTuningJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteHyperparameterTuningJobRequest request =
   *       DeleteHyperparameterTuningJobRequest.newBuilder()
   *           .setName(
   *               HyperparameterTuningJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]")
   *                   .toString())
   *           .build();
   *   jobServiceClient.deleteHyperparameterTuningJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteHyperparameterTuningJobAsync(
      DeleteHyperparameterTuningJobRequest request) {
    return deleteHyperparameterTuningJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a HyperparameterTuningJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteHyperparameterTuningJobRequest request =
   *       DeleteHyperparameterTuningJobRequest.newBuilder()
   *           .setName(
   *               HyperparameterTuningJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]")
   *                   .toString())
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       jobServiceClient.deleteHyperparameterTuningJobOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          DeleteHyperparameterTuningJobRequest, Empty, DeleteOperationMetadata>
      deleteHyperparameterTuningJobOperationCallable() {
    return stub.deleteHyperparameterTuningJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a HyperparameterTuningJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteHyperparameterTuningJobRequest request =
   *       DeleteHyperparameterTuningJobRequest.newBuilder()
   *           .setName(
   *               HyperparameterTuningJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       jobServiceClient.deleteHyperparameterTuningJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteHyperparameterTuningJobRequest, Operation>
      deleteHyperparameterTuningJobCallable() {
    return stub.deleteHyperparameterTuningJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a HyperparameterTuningJob. Starts asynchronous cancellation on the
   * HyperparameterTuningJob. The server makes a best effort to cancel the job, but success is not
   * guaranteed. Clients can use
   * [JobService.GetHyperparameterTuningJob][google.cloud.aiplatform.v1.JobService.GetHyperparameterTuningJob]
   * or other methods to check whether the cancellation succeeded or whether the job completed
   * despite cancellation. On successful cancellation, the HyperparameterTuningJob is not deleted;
   * instead it becomes a job with a
   * [HyperparameterTuningJob.error][google.cloud.aiplatform.v1.HyperparameterTuningJob.error] value
   * with a [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to
   * `Code.CANCELLED`, and
   * [HyperparameterTuningJob.state][google.cloud.aiplatform.v1.HyperparameterTuningJob.state] is
   * set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   HyperparameterTuningJobName name =
   *       HyperparameterTuningJobName.of("[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]");
   *   jobServiceClient.cancelHyperparameterTuningJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the HyperparameterTuningJob to cancel. Format:
   *     `projects/{project}/locations/{location}/hyperparameterTuningJobs/{hyperparameter_tuning_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelHyperparameterTuningJob(HyperparameterTuningJobName name) {
    CancelHyperparameterTuningJobRequest request =
        CancelHyperparameterTuningJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    cancelHyperparameterTuningJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a HyperparameterTuningJob. Starts asynchronous cancellation on the
   * HyperparameterTuningJob. The server makes a best effort to cancel the job, but success is not
   * guaranteed. Clients can use
   * [JobService.GetHyperparameterTuningJob][google.cloud.aiplatform.v1.JobService.GetHyperparameterTuningJob]
   * or other methods to check whether the cancellation succeeded or whether the job completed
   * despite cancellation. On successful cancellation, the HyperparameterTuningJob is not deleted;
   * instead it becomes a job with a
   * [HyperparameterTuningJob.error][google.cloud.aiplatform.v1.HyperparameterTuningJob.error] value
   * with a [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to
   * `Code.CANCELLED`, and
   * [HyperparameterTuningJob.state][google.cloud.aiplatform.v1.HyperparameterTuningJob.state] is
   * set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       HyperparameterTuningJobName.of("[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]")
   *           .toString();
   *   jobServiceClient.cancelHyperparameterTuningJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the HyperparameterTuningJob to cancel. Format:
   *     `projects/{project}/locations/{location}/hyperparameterTuningJobs/{hyperparameter_tuning_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelHyperparameterTuningJob(String name) {
    CancelHyperparameterTuningJobRequest request =
        CancelHyperparameterTuningJobRequest.newBuilder().setName(name).build();
    cancelHyperparameterTuningJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a HyperparameterTuningJob. Starts asynchronous cancellation on the
   * HyperparameterTuningJob. The server makes a best effort to cancel the job, but success is not
   * guaranteed. Clients can use
   * [JobService.GetHyperparameterTuningJob][google.cloud.aiplatform.v1.JobService.GetHyperparameterTuningJob]
   * or other methods to check whether the cancellation succeeded or whether the job completed
   * despite cancellation. On successful cancellation, the HyperparameterTuningJob is not deleted;
   * instead it becomes a job with a
   * [HyperparameterTuningJob.error][google.cloud.aiplatform.v1.HyperparameterTuningJob.error] value
   * with a [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to
   * `Code.CANCELLED`, and
   * [HyperparameterTuningJob.state][google.cloud.aiplatform.v1.HyperparameterTuningJob.state] is
   * set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CancelHyperparameterTuningJobRequest request =
   *       CancelHyperparameterTuningJobRequest.newBuilder()
   *           .setName(
   *               HyperparameterTuningJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]")
   *                   .toString())
   *           .build();
   *   jobServiceClient.cancelHyperparameterTuningJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelHyperparameterTuningJob(CancelHyperparameterTuningJobRequest request) {
    cancelHyperparameterTuningJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a HyperparameterTuningJob. Starts asynchronous cancellation on the
   * HyperparameterTuningJob. The server makes a best effort to cancel the job, but success is not
   * guaranteed. Clients can use
   * [JobService.GetHyperparameterTuningJob][google.cloud.aiplatform.v1.JobService.GetHyperparameterTuningJob]
   * or other methods to check whether the cancellation succeeded or whether the job completed
   * despite cancellation. On successful cancellation, the HyperparameterTuningJob is not deleted;
   * instead it becomes a job with a
   * [HyperparameterTuningJob.error][google.cloud.aiplatform.v1.HyperparameterTuningJob.error] value
   * with a [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to
   * `Code.CANCELLED`, and
   * [HyperparameterTuningJob.state][google.cloud.aiplatform.v1.HyperparameterTuningJob.state] is
   * set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CancelHyperparameterTuningJobRequest request =
   *       CancelHyperparameterTuningJobRequest.newBuilder()
   *           .setName(
   *               HyperparameterTuningJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[HYPERPARAMETER_TUNING_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       jobServiceClient.cancelHyperparameterTuningJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CancelHyperparameterTuningJobRequest, Empty>
      cancelHyperparameterTuningJobCallable() {
    return stub.cancelHyperparameterTuningJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a NasJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   NasJob nasJob = NasJob.newBuilder().build();
   *   NasJob response = jobServiceClient.createNasJob(parent, nasJob);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create the NasJob in. Format:
   *     `projects/{project}/locations/{location}`
   * @param nasJob Required. The NasJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NasJob createNasJob(LocationName parent, NasJob nasJob) {
    CreateNasJobRequest request =
        CreateNasJobRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setNasJob(nasJob)
            .build();
    return createNasJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a NasJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   NasJob nasJob = NasJob.newBuilder().build();
   *   NasJob response = jobServiceClient.createNasJob(parent, nasJob);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create the NasJob in. Format:
   *     `projects/{project}/locations/{location}`
   * @param nasJob Required. The NasJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NasJob createNasJob(String parent, NasJob nasJob) {
    CreateNasJobRequest request =
        CreateNasJobRequest.newBuilder().setParent(parent).setNasJob(nasJob).build();
    return createNasJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a NasJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateNasJobRequest request =
   *       CreateNasJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setNasJob(NasJob.newBuilder().build())
   *           .build();
   *   NasJob response = jobServiceClient.createNasJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NasJob createNasJob(CreateNasJobRequest request) {
    return createNasJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a NasJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateNasJobRequest request =
   *       CreateNasJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setNasJob(NasJob.newBuilder().build())
   *           .build();
   *   ApiFuture<NasJob> future = jobServiceClient.createNasJobCallable().futureCall(request);
   *   // Do something.
   *   NasJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateNasJobRequest, NasJob> createNasJobCallable() {
    return stub.createNasJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a NasJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   NasJobName name = NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]");
   *   NasJob response = jobServiceClient.getNasJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the NasJob resource. Format:
   *     `projects/{project}/locations/{location}/nasJobs/{nas_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NasJob getNasJob(NasJobName name) {
    GetNasJobRequest request =
        GetNasJobRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getNasJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a NasJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name = NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString();
   *   NasJob response = jobServiceClient.getNasJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the NasJob resource. Format:
   *     `projects/{project}/locations/{location}/nasJobs/{nas_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NasJob getNasJob(String name) {
    GetNasJobRequest request = GetNasJobRequest.newBuilder().setName(name).build();
    return getNasJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a NasJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetNasJobRequest request =
   *       GetNasJobRequest.newBuilder()
   *           .setName(NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString())
   *           .build();
   *   NasJob response = jobServiceClient.getNasJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NasJob getNasJob(GetNasJobRequest request) {
    return getNasJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a NasJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetNasJobRequest request =
   *       GetNasJobRequest.newBuilder()
   *           .setName(NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString())
   *           .build();
   *   ApiFuture<NasJob> future = jobServiceClient.getNasJobCallable().futureCall(request);
   *   // Do something.
   *   NasJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetNasJobRequest, NasJob> getNasJobCallable() {
    return stub.getNasJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists NasJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (NasJob element : jobServiceClient.listNasJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list the NasJobs from. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNasJobsPagedResponse listNasJobs(LocationName parent) {
    ListNasJobsRequest request =
        ListNasJobsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listNasJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists NasJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (NasJob element : jobServiceClient.listNasJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list the NasJobs from. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNasJobsPagedResponse listNasJobs(String parent) {
    ListNasJobsRequest request = ListNasJobsRequest.newBuilder().setParent(parent).build();
    return listNasJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists NasJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListNasJobsRequest request =
   *       ListNasJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   for (NasJob element : jobServiceClient.listNasJobs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNasJobsPagedResponse listNasJobs(ListNasJobsRequest request) {
    return listNasJobsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists NasJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListNasJobsRequest request =
   *       ListNasJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<NasJob> future = jobServiceClient.listNasJobsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (NasJob element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListNasJobsRequest, ListNasJobsPagedResponse>
      listNasJobsPagedCallable() {
    return stub.listNasJobsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists NasJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListNasJobsRequest request =
   *       ListNasJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   while (true) {
   *     ListNasJobsResponse response = jobServiceClient.listNasJobsCallable().call(request);
   *     for (NasJob element : response.getNasJobsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListNasJobsRequest, ListNasJobsResponse> listNasJobsCallable() {
    return stub.listNasJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a NasJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   NasJobName name = NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]");
   *   jobServiceClient.deleteNasJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the NasJob resource to be deleted. Format:
   *     `projects/{project}/locations/{location}/nasJobs/{nas_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteNasJobAsync(NasJobName name) {
    DeleteNasJobRequest request =
        DeleteNasJobRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteNasJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a NasJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name = NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString();
   *   jobServiceClient.deleteNasJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the NasJob resource to be deleted. Format:
   *     `projects/{project}/locations/{location}/nasJobs/{nas_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteNasJobAsync(String name) {
    DeleteNasJobRequest request = DeleteNasJobRequest.newBuilder().setName(name).build();
    return deleteNasJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a NasJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteNasJobRequest request =
   *       DeleteNasJobRequest.newBuilder()
   *           .setName(NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString())
   *           .build();
   *   jobServiceClient.deleteNasJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteNasJobAsync(
      DeleteNasJobRequest request) {
    return deleteNasJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a NasJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteNasJobRequest request =
   *       DeleteNasJobRequest.newBuilder()
   *           .setName(NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString())
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       jobServiceClient.deleteNasJobOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteNasJobRequest, Empty, DeleteOperationMetadata>
      deleteNasJobOperationCallable() {
    return stub.deleteNasJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a NasJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteNasJobRequest request =
   *       DeleteNasJobRequest.newBuilder()
   *           .setName(NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString())
   *           .build();
   *   ApiFuture<Operation> future = jobServiceClient.deleteNasJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteNasJobRequest, Operation> deleteNasJobCallable() {
    return stub.deleteNasJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a NasJob. Starts asynchronous cancellation on the NasJob. The server makes a best
   * effort to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetNasJob][google.cloud.aiplatform.v1.JobService.GetNasJob] or other methods to
   * check whether the cancellation succeeded or whether the job completed despite cancellation. On
   * successful cancellation, the NasJob is not deleted; instead it becomes a job with a
   * [NasJob.error][google.cloud.aiplatform.v1.NasJob.error] value with a
   * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to `Code.CANCELLED`, and
   * [NasJob.state][google.cloud.aiplatform.v1.NasJob.state] is set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   NasJobName name = NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]");
   *   jobServiceClient.cancelNasJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the NasJob to cancel. Format:
   *     `projects/{project}/locations/{location}/nasJobs/{nas_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelNasJob(NasJobName name) {
    CancelNasJobRequest request =
        CancelNasJobRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    cancelNasJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a NasJob. Starts asynchronous cancellation on the NasJob. The server makes a best
   * effort to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetNasJob][google.cloud.aiplatform.v1.JobService.GetNasJob] or other methods to
   * check whether the cancellation succeeded or whether the job completed despite cancellation. On
   * successful cancellation, the NasJob is not deleted; instead it becomes a job with a
   * [NasJob.error][google.cloud.aiplatform.v1.NasJob.error] value with a
   * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to `Code.CANCELLED`, and
   * [NasJob.state][google.cloud.aiplatform.v1.NasJob.state] is set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name = NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString();
   *   jobServiceClient.cancelNasJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the NasJob to cancel. Format:
   *     `projects/{project}/locations/{location}/nasJobs/{nas_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelNasJob(String name) {
    CancelNasJobRequest request = CancelNasJobRequest.newBuilder().setName(name).build();
    cancelNasJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a NasJob. Starts asynchronous cancellation on the NasJob. The server makes a best
   * effort to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetNasJob][google.cloud.aiplatform.v1.JobService.GetNasJob] or other methods to
   * check whether the cancellation succeeded or whether the job completed despite cancellation. On
   * successful cancellation, the NasJob is not deleted; instead it becomes a job with a
   * [NasJob.error][google.cloud.aiplatform.v1.NasJob.error] value with a
   * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to `Code.CANCELLED`, and
   * [NasJob.state][google.cloud.aiplatform.v1.NasJob.state] is set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CancelNasJobRequest request =
   *       CancelNasJobRequest.newBuilder()
   *           .setName(NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString())
   *           .build();
   *   jobServiceClient.cancelNasJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelNasJob(CancelNasJobRequest request) {
    cancelNasJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a NasJob. Starts asynchronous cancellation on the NasJob. The server makes a best
   * effort to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetNasJob][google.cloud.aiplatform.v1.JobService.GetNasJob] or other methods to
   * check whether the cancellation succeeded or whether the job completed despite cancellation. On
   * successful cancellation, the NasJob is not deleted; instead it becomes a job with a
   * [NasJob.error][google.cloud.aiplatform.v1.NasJob.error] value with a
   * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to `Code.CANCELLED`, and
   * [NasJob.state][google.cloud.aiplatform.v1.NasJob.state] is set to `CANCELLED`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CancelNasJobRequest request =
   *       CancelNasJobRequest.newBuilder()
   *           .setName(NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString())
   *           .build();
   *   ApiFuture<Empty> future = jobServiceClient.cancelNasJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CancelNasJobRequest, Empty> cancelNasJobCallable() {
    return stub.cancelNasJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a NasTrialDetail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   NasTrialDetailName name =
   *       NasTrialDetailName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]", "[NAS_TRIAL_DETAIL]");
   *   NasTrialDetail response = jobServiceClient.getNasTrialDetail(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the NasTrialDetail resource. Format:
   *     `projects/{project}/locations/{location}/nasJobs/{nas_job}/nasTrialDetails/{nas_trial_detail}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NasTrialDetail getNasTrialDetail(NasTrialDetailName name) {
    GetNasTrialDetailRequest request =
        GetNasTrialDetailRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getNasTrialDetail(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a NasTrialDetail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       NasTrialDetailName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]", "[NAS_TRIAL_DETAIL]")
   *           .toString();
   *   NasTrialDetail response = jobServiceClient.getNasTrialDetail(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the NasTrialDetail resource. Format:
   *     `projects/{project}/locations/{location}/nasJobs/{nas_job}/nasTrialDetails/{nas_trial_detail}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NasTrialDetail getNasTrialDetail(String name) {
    GetNasTrialDetailRequest request = GetNasTrialDetailRequest.newBuilder().setName(name).build();
    return getNasTrialDetail(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a NasTrialDetail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetNasTrialDetailRequest request =
   *       GetNasTrialDetailRequest.newBuilder()
   *           .setName(
   *               NasTrialDetailName.of(
   *                       "[PROJECT]", "[LOCATION]", "[NAS_JOB]", "[NAS_TRIAL_DETAIL]")
   *                   .toString())
   *           .build();
   *   NasTrialDetail response = jobServiceClient.getNasTrialDetail(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NasTrialDetail getNasTrialDetail(GetNasTrialDetailRequest request) {
    return getNasTrialDetailCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a NasTrialDetail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetNasTrialDetailRequest request =
   *       GetNasTrialDetailRequest.newBuilder()
   *           .setName(
   *               NasTrialDetailName.of(
   *                       "[PROJECT]", "[LOCATION]", "[NAS_JOB]", "[NAS_TRIAL_DETAIL]")
   *                   .toString())
   *           .build();
   *   ApiFuture<NasTrialDetail> future =
   *       jobServiceClient.getNasTrialDetailCallable().futureCall(request);
   *   // Do something.
   *   NasTrialDetail response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetNasTrialDetailRequest, NasTrialDetail> getNasTrialDetailCallable() {
    return stub.getNasTrialDetailCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List top NasTrialDetails of a NasJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   NasJobName parent = NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]");
   *   for (NasTrialDetail element : jobServiceClient.listNasTrialDetails(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the NasJob resource. Format:
   *     `projects/{project}/locations/{location}/nasJobs/{nas_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNasTrialDetailsPagedResponse listNasTrialDetails(NasJobName parent) {
    ListNasTrialDetailsRequest request =
        ListNasTrialDetailsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listNasTrialDetails(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List top NasTrialDetails of a NasJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString();
   *   for (NasTrialDetail element : jobServiceClient.listNasTrialDetails(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the NasJob resource. Format:
   *     `projects/{project}/locations/{location}/nasJobs/{nas_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNasTrialDetailsPagedResponse listNasTrialDetails(String parent) {
    ListNasTrialDetailsRequest request =
        ListNasTrialDetailsRequest.newBuilder().setParent(parent).build();
    return listNasTrialDetails(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List top NasTrialDetails of a NasJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListNasTrialDetailsRequest request =
   *       ListNasTrialDetailsRequest.newBuilder()
   *           .setParent(NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (NasTrialDetail element : jobServiceClient.listNasTrialDetails(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNasTrialDetailsPagedResponse listNasTrialDetails(
      ListNasTrialDetailsRequest request) {
    return listNasTrialDetailsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List top NasTrialDetails of a NasJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListNasTrialDetailsRequest request =
   *       ListNasTrialDetailsRequest.newBuilder()
   *           .setParent(NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<NasTrialDetail> future =
   *       jobServiceClient.listNasTrialDetailsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (NasTrialDetail element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListNasTrialDetailsRequest, ListNasTrialDetailsPagedResponse>
      listNasTrialDetailsPagedCallable() {
    return stub.listNasTrialDetailsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List top NasTrialDetails of a NasJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListNasTrialDetailsRequest request =
   *       ListNasTrialDetailsRequest.newBuilder()
   *           .setParent(NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListNasTrialDetailsResponse response =
   *         jobServiceClient.listNasTrialDetailsCallable().call(request);
   *     for (NasTrialDetail element : response.getNasTrialDetailsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListNasTrialDetailsRequest, ListNasTrialDetailsResponse>
      listNasTrialDetailsCallable() {
    return stub.listNasTrialDetailsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a BatchPredictionJob. A BatchPredictionJob once created will right away be attempted to
   * start.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   BatchPredictionJob batchPredictionJob = BatchPredictionJob.newBuilder().build();
   *   BatchPredictionJob response =
   *       jobServiceClient.createBatchPredictionJob(parent, batchPredictionJob);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create the BatchPredictionJob in.
   *     Format: `projects/{project}/locations/{location}`
   * @param batchPredictionJob Required. The BatchPredictionJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchPredictionJob createBatchPredictionJob(
      LocationName parent, BatchPredictionJob batchPredictionJob) {
    CreateBatchPredictionJobRequest request =
        CreateBatchPredictionJobRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setBatchPredictionJob(batchPredictionJob)
            .build();
    return createBatchPredictionJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a BatchPredictionJob. A BatchPredictionJob once created will right away be attempted to
   * start.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   BatchPredictionJob batchPredictionJob = BatchPredictionJob.newBuilder().build();
   *   BatchPredictionJob response =
   *       jobServiceClient.createBatchPredictionJob(parent, batchPredictionJob);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create the BatchPredictionJob in.
   *     Format: `projects/{project}/locations/{location}`
   * @param batchPredictionJob Required. The BatchPredictionJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchPredictionJob createBatchPredictionJob(
      String parent, BatchPredictionJob batchPredictionJob) {
    CreateBatchPredictionJobRequest request =
        CreateBatchPredictionJobRequest.newBuilder()
            .setParent(parent)
            .setBatchPredictionJob(batchPredictionJob)
            .build();
    return createBatchPredictionJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a BatchPredictionJob. A BatchPredictionJob once created will right away be attempted to
   * start.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateBatchPredictionJobRequest request =
   *       CreateBatchPredictionJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setBatchPredictionJob(BatchPredictionJob.newBuilder().build())
   *           .build();
   *   BatchPredictionJob response = jobServiceClient.createBatchPredictionJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchPredictionJob createBatchPredictionJob(
      CreateBatchPredictionJobRequest request) {
    return createBatchPredictionJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a BatchPredictionJob. A BatchPredictionJob once created will right away be attempted to
   * start.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateBatchPredictionJobRequest request =
   *       CreateBatchPredictionJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setBatchPredictionJob(BatchPredictionJob.newBuilder().build())
   *           .build();
   *   ApiFuture<BatchPredictionJob> future =
   *       jobServiceClient.createBatchPredictionJobCallable().futureCall(request);
   *   // Do something.
   *   BatchPredictionJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateBatchPredictionJobRequest, BatchPredictionJob>
      createBatchPredictionJobCallable() {
    return stub.createBatchPredictionJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a BatchPredictionJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   BatchPredictionJobName name =
   *       BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]");
   *   BatchPredictionJob response = jobServiceClient.getBatchPredictionJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the BatchPredictionJob resource. Format:
   *     `projects/{project}/locations/{location}/batchPredictionJobs/{batch_prediction_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchPredictionJob getBatchPredictionJob(BatchPredictionJobName name) {
    GetBatchPredictionJobRequest request =
        GetBatchPredictionJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getBatchPredictionJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a BatchPredictionJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]").toString();
   *   BatchPredictionJob response = jobServiceClient.getBatchPredictionJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the BatchPredictionJob resource. Format:
   *     `projects/{project}/locations/{location}/batchPredictionJobs/{batch_prediction_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchPredictionJob getBatchPredictionJob(String name) {
    GetBatchPredictionJobRequest request =
        GetBatchPredictionJobRequest.newBuilder().setName(name).build();
    return getBatchPredictionJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a BatchPredictionJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetBatchPredictionJobRequest request =
   *       GetBatchPredictionJobRequest.newBuilder()
   *           .setName(
   *               BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]")
   *                   .toString())
   *           .build();
   *   BatchPredictionJob response = jobServiceClient.getBatchPredictionJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchPredictionJob getBatchPredictionJob(GetBatchPredictionJobRequest request) {
    return getBatchPredictionJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a BatchPredictionJob
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetBatchPredictionJobRequest request =
   *       GetBatchPredictionJobRequest.newBuilder()
   *           .setName(
   *               BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<BatchPredictionJob> future =
   *       jobServiceClient.getBatchPredictionJobCallable().futureCall(request);
   *   // Do something.
   *   BatchPredictionJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetBatchPredictionJobRequest, BatchPredictionJob>
      getBatchPredictionJobCallable() {
    return stub.getBatchPredictionJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists BatchPredictionJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (BatchPredictionJob element :
   *       jobServiceClient.listBatchPredictionJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list the BatchPredictionJobs from.
   *     Format: `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBatchPredictionJobsPagedResponse listBatchPredictionJobs(LocationName parent) {
    ListBatchPredictionJobsRequest request =
        ListBatchPredictionJobsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listBatchPredictionJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists BatchPredictionJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (BatchPredictionJob element :
   *       jobServiceClient.listBatchPredictionJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list the BatchPredictionJobs from.
   *     Format: `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBatchPredictionJobsPagedResponse listBatchPredictionJobs(String parent) {
    ListBatchPredictionJobsRequest request =
        ListBatchPredictionJobsRequest.newBuilder().setParent(parent).build();
    return listBatchPredictionJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists BatchPredictionJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListBatchPredictionJobsRequest request =
   *       ListBatchPredictionJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   for (BatchPredictionJob element :
   *       jobServiceClient.listBatchPredictionJobs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBatchPredictionJobsPagedResponse listBatchPredictionJobs(
      ListBatchPredictionJobsRequest request) {
    return listBatchPredictionJobsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists BatchPredictionJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListBatchPredictionJobsRequest request =
   *       ListBatchPredictionJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<BatchPredictionJob> future =
   *       jobServiceClient.listBatchPredictionJobsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (BatchPredictionJob element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListBatchPredictionJobsRequest, ListBatchPredictionJobsPagedResponse>
      listBatchPredictionJobsPagedCallable() {
    return stub.listBatchPredictionJobsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists BatchPredictionJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListBatchPredictionJobsRequest request =
   *       ListBatchPredictionJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   while (true) {
   *     ListBatchPredictionJobsResponse response =
   *         jobServiceClient.listBatchPredictionJobsCallable().call(request);
   *     for (BatchPredictionJob element : response.getBatchPredictionJobsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListBatchPredictionJobsRequest, ListBatchPredictionJobsResponse>
      listBatchPredictionJobsCallable() {
    return stub.listBatchPredictionJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a BatchPredictionJob. Can only be called on jobs that already finished.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   BatchPredictionJobName name =
   *       BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]");
   *   jobServiceClient.deleteBatchPredictionJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the BatchPredictionJob resource to be deleted. Format:
   *     `projects/{project}/locations/{location}/batchPredictionJobs/{batch_prediction_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteBatchPredictionJobAsync(
      BatchPredictionJobName name) {
    DeleteBatchPredictionJobRequest request =
        DeleteBatchPredictionJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteBatchPredictionJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a BatchPredictionJob. Can only be called on jobs that already finished.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]").toString();
   *   jobServiceClient.deleteBatchPredictionJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the BatchPredictionJob resource to be deleted. Format:
   *     `projects/{project}/locations/{location}/batchPredictionJobs/{batch_prediction_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteBatchPredictionJobAsync(
      String name) {
    DeleteBatchPredictionJobRequest request =
        DeleteBatchPredictionJobRequest.newBuilder().setName(name).build();
    return deleteBatchPredictionJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a BatchPredictionJob. Can only be called on jobs that already finished.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteBatchPredictionJobRequest request =
   *       DeleteBatchPredictionJobRequest.newBuilder()
   *           .setName(
   *               BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]")
   *                   .toString())
   *           .build();
   *   jobServiceClient.deleteBatchPredictionJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteBatchPredictionJobAsync(
      DeleteBatchPredictionJobRequest request) {
    return deleteBatchPredictionJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a BatchPredictionJob. Can only be called on jobs that already finished.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteBatchPredictionJobRequest request =
   *       DeleteBatchPredictionJobRequest.newBuilder()
   *           .setName(
   *               BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]")
   *                   .toString())
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       jobServiceClient.deleteBatchPredictionJobOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteBatchPredictionJobRequest, Empty, DeleteOperationMetadata>
      deleteBatchPredictionJobOperationCallable() {
    return stub.deleteBatchPredictionJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a BatchPredictionJob. Can only be called on jobs that already finished.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteBatchPredictionJobRequest request =
   *       DeleteBatchPredictionJobRequest.newBuilder()
   *           .setName(
   *               BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       jobServiceClient.deleteBatchPredictionJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteBatchPredictionJobRequest, Operation>
      deleteBatchPredictionJobCallable() {
    return stub.deleteBatchPredictionJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a BatchPredictionJob.
   *
   * <p>Starts asynchronous cancellation on the BatchPredictionJob. The server makes the best effort
   * to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetBatchPredictionJob][google.cloud.aiplatform.v1.JobService.GetBatchPredictionJob]
   * or other methods to check whether the cancellation succeeded or whether the job completed
   * despite cancellation. On a successful cancellation, the BatchPredictionJob is not
   * deleted;instead its
   * [BatchPredictionJob.state][google.cloud.aiplatform.v1.BatchPredictionJob.state] is set to
   * `CANCELLED`. Any files already outputted by the job are not deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   BatchPredictionJobName name =
   *       BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]");
   *   jobServiceClient.cancelBatchPredictionJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the BatchPredictionJob to cancel. Format:
   *     `projects/{project}/locations/{location}/batchPredictionJobs/{batch_prediction_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelBatchPredictionJob(BatchPredictionJobName name) {
    CancelBatchPredictionJobRequest request =
        CancelBatchPredictionJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    cancelBatchPredictionJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a BatchPredictionJob.
   *
   * <p>Starts asynchronous cancellation on the BatchPredictionJob. The server makes the best effort
   * to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetBatchPredictionJob][google.cloud.aiplatform.v1.JobService.GetBatchPredictionJob]
   * or other methods to check whether the cancellation succeeded or whether the job completed
   * despite cancellation. On a successful cancellation, the BatchPredictionJob is not
   * deleted;instead its
   * [BatchPredictionJob.state][google.cloud.aiplatform.v1.BatchPredictionJob.state] is set to
   * `CANCELLED`. Any files already outputted by the job are not deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]").toString();
   *   jobServiceClient.cancelBatchPredictionJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the BatchPredictionJob to cancel. Format:
   *     `projects/{project}/locations/{location}/batchPredictionJobs/{batch_prediction_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelBatchPredictionJob(String name) {
    CancelBatchPredictionJobRequest request =
        CancelBatchPredictionJobRequest.newBuilder().setName(name).build();
    cancelBatchPredictionJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a BatchPredictionJob.
   *
   * <p>Starts asynchronous cancellation on the BatchPredictionJob. The server makes the best effort
   * to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetBatchPredictionJob][google.cloud.aiplatform.v1.JobService.GetBatchPredictionJob]
   * or other methods to check whether the cancellation succeeded or whether the job completed
   * despite cancellation. On a successful cancellation, the BatchPredictionJob is not
   * deleted;instead its
   * [BatchPredictionJob.state][google.cloud.aiplatform.v1.BatchPredictionJob.state] is set to
   * `CANCELLED`. Any files already outputted by the job are not deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CancelBatchPredictionJobRequest request =
   *       CancelBatchPredictionJobRequest.newBuilder()
   *           .setName(
   *               BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]")
   *                   .toString())
   *           .build();
   *   jobServiceClient.cancelBatchPredictionJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelBatchPredictionJob(CancelBatchPredictionJobRequest request) {
    cancelBatchPredictionJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a BatchPredictionJob.
   *
   * <p>Starts asynchronous cancellation on the BatchPredictionJob. The server makes the best effort
   * to cancel the job, but success is not guaranteed. Clients can use
   * [JobService.GetBatchPredictionJob][google.cloud.aiplatform.v1.JobService.GetBatchPredictionJob]
   * or other methods to check whether the cancellation succeeded or whether the job completed
   * despite cancellation. On a successful cancellation, the BatchPredictionJob is not
   * deleted;instead its
   * [BatchPredictionJob.state][google.cloud.aiplatform.v1.BatchPredictionJob.state] is set to
   * `CANCELLED`. Any files already outputted by the job are not deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CancelBatchPredictionJobRequest request =
   *       CancelBatchPredictionJobRequest.newBuilder()
   *           .setName(
   *               BatchPredictionJobName.of("[PROJECT]", "[LOCATION]", "[BATCH_PREDICTION_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       jobServiceClient.cancelBatchPredictionJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CancelBatchPredictionJobRequest, Empty>
      cancelBatchPredictionJobCallable() {
    return stub.cancelBatchPredictionJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a ModelDeploymentMonitoringJob. It will run periodically on a configured interval.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ModelDeploymentMonitoringJob modelDeploymentMonitoringJob =
   *       ModelDeploymentMonitoringJob.newBuilder().build();
   *   ModelDeploymentMonitoringJob response =
   *       jobServiceClient.createModelDeploymentMonitoringJob(parent, modelDeploymentMonitoringJob);
   * }
   * }</pre>
   *
   * @param parent Required. The parent of the ModelDeploymentMonitoringJob. Format:
   *     `projects/{project}/locations/{location}`
   * @param modelDeploymentMonitoringJob Required. The ModelDeploymentMonitoringJob to create
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ModelDeploymentMonitoringJob createModelDeploymentMonitoringJob(
      LocationName parent, ModelDeploymentMonitoringJob modelDeploymentMonitoringJob) {
    CreateModelDeploymentMonitoringJobRequest request =
        CreateModelDeploymentMonitoringJobRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setModelDeploymentMonitoringJob(modelDeploymentMonitoringJob)
            .build();
    return createModelDeploymentMonitoringJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a ModelDeploymentMonitoringJob. It will run periodically on a configured interval.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   ModelDeploymentMonitoringJob modelDeploymentMonitoringJob =
   *       ModelDeploymentMonitoringJob.newBuilder().build();
   *   ModelDeploymentMonitoringJob response =
   *       jobServiceClient.createModelDeploymentMonitoringJob(parent, modelDeploymentMonitoringJob);
   * }
   * }</pre>
   *
   * @param parent Required. The parent of the ModelDeploymentMonitoringJob. Format:
   *     `projects/{project}/locations/{location}`
   * @param modelDeploymentMonitoringJob Required. The ModelDeploymentMonitoringJob to create
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ModelDeploymentMonitoringJob createModelDeploymentMonitoringJob(
      String parent, ModelDeploymentMonitoringJob modelDeploymentMonitoringJob) {
    CreateModelDeploymentMonitoringJobRequest request =
        CreateModelDeploymentMonitoringJobRequest.newBuilder()
            .setParent(parent)
            .setModelDeploymentMonitoringJob(modelDeploymentMonitoringJob)
            .build();
    return createModelDeploymentMonitoringJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a ModelDeploymentMonitoringJob. It will run periodically on a configured interval.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateModelDeploymentMonitoringJobRequest request =
   *       CreateModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setModelDeploymentMonitoringJob(ModelDeploymentMonitoringJob.newBuilder().build())
   *           .build();
   *   ModelDeploymentMonitoringJob response =
   *       jobServiceClient.createModelDeploymentMonitoringJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ModelDeploymentMonitoringJob createModelDeploymentMonitoringJob(
      CreateModelDeploymentMonitoringJobRequest request) {
    return createModelDeploymentMonitoringJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a ModelDeploymentMonitoringJob. It will run periodically on a configured interval.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   CreateModelDeploymentMonitoringJobRequest request =
   *       CreateModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setModelDeploymentMonitoringJob(ModelDeploymentMonitoringJob.newBuilder().build())
   *           .build();
   *   ApiFuture<ModelDeploymentMonitoringJob> future =
   *       jobServiceClient.createModelDeploymentMonitoringJobCallable().futureCall(request);
   *   // Do something.
   *   ModelDeploymentMonitoringJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          CreateModelDeploymentMonitoringJobRequest, ModelDeploymentMonitoringJob>
      createModelDeploymentMonitoringJobCallable() {
    return stub.createModelDeploymentMonitoringJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches Model Monitoring Statistics generated within a given time window.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ModelDeploymentMonitoringJobName modelDeploymentMonitoringJob =
   *       ModelDeploymentMonitoringJobName.of(
   *           "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]");
   *   String deployedModelId = "deployedModelId-1817547906";
   *   for (ModelMonitoringStatsAnomalies element :
   *       jobServiceClient
   *           .searchModelDeploymentMonitoringStatsAnomalies(
   *               modelDeploymentMonitoringJob, deployedModelId)
   *           .iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param modelDeploymentMonitoringJob Required. ModelDeploymentMonitoring Job resource name.
   *     Format:
   *     `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * @param deployedModelId Required. The DeployedModel ID of the
   *     [ModelDeploymentMonitoringObjectiveConfig.deployed_model_id].
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse
      searchModelDeploymentMonitoringStatsAnomalies(
          ModelDeploymentMonitoringJobName modelDeploymentMonitoringJob, String deployedModelId) {
    SearchModelDeploymentMonitoringStatsAnomaliesRequest request =
        SearchModelDeploymentMonitoringStatsAnomaliesRequest.newBuilder()
            .setModelDeploymentMonitoringJob(
                modelDeploymentMonitoringJob == null
                    ? null
                    : modelDeploymentMonitoringJob.toString())
            .setDeployedModelId(deployedModelId)
            .build();
    return searchModelDeploymentMonitoringStatsAnomalies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches Model Monitoring Statistics generated within a given time window.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String modelDeploymentMonitoringJob =
   *       ModelDeploymentMonitoringJobName.of(
   *               "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *           .toString();
   *   String deployedModelId = "deployedModelId-1817547906";
   *   for (ModelMonitoringStatsAnomalies element :
   *       jobServiceClient
   *           .searchModelDeploymentMonitoringStatsAnomalies(
   *               modelDeploymentMonitoringJob, deployedModelId)
   *           .iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param modelDeploymentMonitoringJob Required. ModelDeploymentMonitoring Job resource name.
   *     Format:
   *     `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * @param deployedModelId Required. The DeployedModel ID of the
   *     [ModelDeploymentMonitoringObjectiveConfig.deployed_model_id].
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse
      searchModelDeploymentMonitoringStatsAnomalies(
          String modelDeploymentMonitoringJob, String deployedModelId) {
    SearchModelDeploymentMonitoringStatsAnomaliesRequest request =
        SearchModelDeploymentMonitoringStatsAnomaliesRequest.newBuilder()
            .setModelDeploymentMonitoringJob(modelDeploymentMonitoringJob)
            .setDeployedModelId(deployedModelId)
            .build();
    return searchModelDeploymentMonitoringStatsAnomalies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches Model Monitoring Statistics generated within a given time window.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   SearchModelDeploymentMonitoringStatsAnomaliesRequest request =
   *       SearchModelDeploymentMonitoringStatsAnomaliesRequest.newBuilder()
   *           .setModelDeploymentMonitoringJob(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .setDeployedModelId("deployedModelId-1817547906")
   *           .setFeatureDisplayName("featureDisplayName-1741181545")
   *           .addAllObjectives(
   *               new ArrayList<
   *                   SearchModelDeploymentMonitoringStatsAnomaliesRequest
   *                       .StatsAnomaliesObjective>())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setStartTime(Timestamp.newBuilder().build())
   *           .setEndTime(Timestamp.newBuilder().build())
   *           .build();
   *   for (ModelMonitoringStatsAnomalies element :
   *       jobServiceClient.searchModelDeploymentMonitoringStatsAnomalies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse
      searchModelDeploymentMonitoringStatsAnomalies(
          SearchModelDeploymentMonitoringStatsAnomaliesRequest request) {
    return searchModelDeploymentMonitoringStatsAnomaliesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches Model Monitoring Statistics generated within a given time window.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   SearchModelDeploymentMonitoringStatsAnomaliesRequest request =
   *       SearchModelDeploymentMonitoringStatsAnomaliesRequest.newBuilder()
   *           .setModelDeploymentMonitoringJob(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .setDeployedModelId("deployedModelId-1817547906")
   *           .setFeatureDisplayName("featureDisplayName-1741181545")
   *           .addAllObjectives(
   *               new ArrayList<
   *                   SearchModelDeploymentMonitoringStatsAnomaliesRequest
   *                       .StatsAnomaliesObjective>())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setStartTime(Timestamp.newBuilder().build())
   *           .setEndTime(Timestamp.newBuilder().build())
   *           .build();
   *   ApiFuture<ModelMonitoringStatsAnomalies> future =
   *       jobServiceClient
   *           .searchModelDeploymentMonitoringStatsAnomaliesPagedCallable()
   *           .futureCall(request);
   *   // Do something.
   *   for (ModelMonitoringStatsAnomalies element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          SearchModelDeploymentMonitoringStatsAnomaliesRequest,
          SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse>
      searchModelDeploymentMonitoringStatsAnomaliesPagedCallable() {
    return stub.searchModelDeploymentMonitoringStatsAnomaliesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches Model Monitoring Statistics generated within a given time window.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   SearchModelDeploymentMonitoringStatsAnomaliesRequest request =
   *       SearchModelDeploymentMonitoringStatsAnomaliesRequest.newBuilder()
   *           .setModelDeploymentMonitoringJob(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .setDeployedModelId("deployedModelId-1817547906")
   *           .setFeatureDisplayName("featureDisplayName-1741181545")
   *           .addAllObjectives(
   *               new ArrayList<
   *                   SearchModelDeploymentMonitoringStatsAnomaliesRequest
   *                       .StatsAnomaliesObjective>())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setStartTime(Timestamp.newBuilder().build())
   *           .setEndTime(Timestamp.newBuilder().build())
   *           .build();
   *   while (true) {
   *     SearchModelDeploymentMonitoringStatsAnomaliesResponse response =
   *         jobServiceClient.searchModelDeploymentMonitoringStatsAnomaliesCallable().call(request);
   *     for (ModelMonitoringStatsAnomalies element : response.getMonitoringStatsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          SearchModelDeploymentMonitoringStatsAnomaliesRequest,
          SearchModelDeploymentMonitoringStatsAnomaliesResponse>
      searchModelDeploymentMonitoringStatsAnomaliesCallable() {
    return stub.searchModelDeploymentMonitoringStatsAnomaliesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ModelDeploymentMonitoringJobName name =
   *       ModelDeploymentMonitoringJobName.of(
   *           "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]");
   *   ModelDeploymentMonitoringJob response =
   *       jobServiceClient.getModelDeploymentMonitoringJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the ModelDeploymentMonitoringJob. Format:
   *     `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ModelDeploymentMonitoringJob getModelDeploymentMonitoringJob(
      ModelDeploymentMonitoringJobName name) {
    GetModelDeploymentMonitoringJobRequest request =
        GetModelDeploymentMonitoringJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getModelDeploymentMonitoringJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       ModelDeploymentMonitoringJobName.of(
   *               "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *           .toString();
   *   ModelDeploymentMonitoringJob response =
   *       jobServiceClient.getModelDeploymentMonitoringJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the ModelDeploymentMonitoringJob. Format:
   *     `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ModelDeploymentMonitoringJob getModelDeploymentMonitoringJob(String name) {
    GetModelDeploymentMonitoringJobRequest request =
        GetModelDeploymentMonitoringJobRequest.newBuilder().setName(name).build();
    return getModelDeploymentMonitoringJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetModelDeploymentMonitoringJobRequest request =
   *       GetModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setName(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .build();
   *   ModelDeploymentMonitoringJob response =
   *       jobServiceClient.getModelDeploymentMonitoringJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ModelDeploymentMonitoringJob getModelDeploymentMonitoringJob(
      GetModelDeploymentMonitoringJobRequest request) {
    return getModelDeploymentMonitoringJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetModelDeploymentMonitoringJobRequest request =
   *       GetModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setName(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<ModelDeploymentMonitoringJob> future =
   *       jobServiceClient.getModelDeploymentMonitoringJobCallable().futureCall(request);
   *   // Do something.
   *   ModelDeploymentMonitoringJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetModelDeploymentMonitoringJobRequest, ModelDeploymentMonitoringJob>
      getModelDeploymentMonitoringJobCallable() {
    return stub.getModelDeploymentMonitoringJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists ModelDeploymentMonitoringJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (ModelDeploymentMonitoringJob element :
   *       jobServiceClient.listModelDeploymentMonitoringJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent of the ModelDeploymentMonitoringJob. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListModelDeploymentMonitoringJobsPagedResponse listModelDeploymentMonitoringJobs(
      LocationName parent) {
    ListModelDeploymentMonitoringJobsRequest request =
        ListModelDeploymentMonitoringJobsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listModelDeploymentMonitoringJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists ModelDeploymentMonitoringJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (ModelDeploymentMonitoringJob element :
   *       jobServiceClient.listModelDeploymentMonitoringJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent of the ModelDeploymentMonitoringJob. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListModelDeploymentMonitoringJobsPagedResponse listModelDeploymentMonitoringJobs(
      String parent) {
    ListModelDeploymentMonitoringJobsRequest request =
        ListModelDeploymentMonitoringJobsRequest.newBuilder().setParent(parent).build();
    return listModelDeploymentMonitoringJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists ModelDeploymentMonitoringJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListModelDeploymentMonitoringJobsRequest request =
   *       ListModelDeploymentMonitoringJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   for (ModelDeploymentMonitoringJob element :
   *       jobServiceClient.listModelDeploymentMonitoringJobs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListModelDeploymentMonitoringJobsPagedResponse listModelDeploymentMonitoringJobs(
      ListModelDeploymentMonitoringJobsRequest request) {
    return listModelDeploymentMonitoringJobsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists ModelDeploymentMonitoringJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListModelDeploymentMonitoringJobsRequest request =
   *       ListModelDeploymentMonitoringJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<ModelDeploymentMonitoringJob> future =
   *       jobServiceClient.listModelDeploymentMonitoringJobsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (ModelDeploymentMonitoringJob element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListModelDeploymentMonitoringJobsRequest, ListModelDeploymentMonitoringJobsPagedResponse>
      listModelDeploymentMonitoringJobsPagedCallable() {
    return stub.listModelDeploymentMonitoringJobsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists ModelDeploymentMonitoringJobs in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListModelDeploymentMonitoringJobsRequest request =
   *       ListModelDeploymentMonitoringJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   while (true) {
   *     ListModelDeploymentMonitoringJobsResponse response =
   *         jobServiceClient.listModelDeploymentMonitoringJobsCallable().call(request);
   *     for (ModelDeploymentMonitoringJob element :
   *         response.getModelDeploymentMonitoringJobsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListModelDeploymentMonitoringJobsRequest, ListModelDeploymentMonitoringJobsResponse>
      listModelDeploymentMonitoringJobsCallable() {
    return stub.listModelDeploymentMonitoringJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ModelDeploymentMonitoringJob modelDeploymentMonitoringJob =
   *       ModelDeploymentMonitoringJob.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   ModelDeploymentMonitoringJob response =
   *       jobServiceClient
   *           .updateModelDeploymentMonitoringJobAsync(modelDeploymentMonitoringJob, updateMask)
   *           .get();
   * }
   * }</pre>
   *
   * @param modelDeploymentMonitoringJob Required. The model monitoring configuration which replaces
   *     the resource on the server.
   * @param updateMask Required. The update mask is used to specify the fields to be overwritten in
   *     the ModelDeploymentMonitoringJob resource by the update. The fields specified in the
   *     update_mask are relative to the resource, not the full request. A field will be overwritten
   *     if it is in the mask. If the user does not provide a mask then only the non-empty fields
   *     present in the request will be overwritten. Set the update_mask to `&#42;` to override all
   *     fields. For the objective config, the user can either provide the update mask for
   *     model_deployment_monitoring_objective_configs or any combination of its nested fields, such
   *     as: model_deployment_monitoring_objective_configs.objective_config.training_dataset.
   *     <p>Updatable fields:
   *     <p>&#42; `display_name` &#42; `model_deployment_monitoring_schedule_config` &#42;
   *     `model_monitoring_alert_config` &#42; `logging_sampling_strategy` &#42; `labels` &#42;
   *     `log_ttl` &#42; `enable_monitoring_pipeline_logs` . and &#42;
   *     `model_deployment_monitoring_objective_configs` . or &#42;
   *     `model_deployment_monitoring_objective_configs.objective_config.training_dataset` &#42;
   *     `model_deployment_monitoring_objective_configs.objective_config.training_prediction_skew_detection_config`
   *     &#42;
   *     `model_deployment_monitoring_objective_configs.objective_config.prediction_drift_detection_config`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<
          ModelDeploymentMonitoringJob, UpdateModelDeploymentMonitoringJobOperationMetadata>
      updateModelDeploymentMonitoringJobAsync(
          ModelDeploymentMonitoringJob modelDeploymentMonitoringJob, FieldMask updateMask) {
    UpdateModelDeploymentMonitoringJobRequest request =
        UpdateModelDeploymentMonitoringJobRequest.newBuilder()
            .setModelDeploymentMonitoringJob(modelDeploymentMonitoringJob)
            .setUpdateMask(updateMask)
            .build();
    return updateModelDeploymentMonitoringJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   UpdateModelDeploymentMonitoringJobRequest request =
   *       UpdateModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setModelDeploymentMonitoringJob(ModelDeploymentMonitoringJob.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ModelDeploymentMonitoringJob response =
   *       jobServiceClient.updateModelDeploymentMonitoringJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<
          ModelDeploymentMonitoringJob, UpdateModelDeploymentMonitoringJobOperationMetadata>
      updateModelDeploymentMonitoringJobAsync(UpdateModelDeploymentMonitoringJobRequest request) {
    return updateModelDeploymentMonitoringJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   UpdateModelDeploymentMonitoringJobRequest request =
   *       UpdateModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setModelDeploymentMonitoringJob(ModelDeploymentMonitoringJob.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OperationFuture<
   *           ModelDeploymentMonitoringJob, UpdateModelDeploymentMonitoringJobOperationMetadata>
   *       future =
   *           jobServiceClient
   *               .updateModelDeploymentMonitoringJobOperationCallable()
   *               .futureCall(request);
   *   // Do something.
   *   ModelDeploymentMonitoringJob response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateModelDeploymentMonitoringJobRequest,
          ModelDeploymentMonitoringJob,
          UpdateModelDeploymentMonitoringJobOperationMetadata>
      updateModelDeploymentMonitoringJobOperationCallable() {
    return stub.updateModelDeploymentMonitoringJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   UpdateModelDeploymentMonitoringJobRequest request =
   *       UpdateModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setModelDeploymentMonitoringJob(ModelDeploymentMonitoringJob.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       jobServiceClient.updateModelDeploymentMonitoringJobCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateModelDeploymentMonitoringJobRequest, Operation>
      updateModelDeploymentMonitoringJobCallable() {
    return stub.updateModelDeploymentMonitoringJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ModelDeploymentMonitoringJobName name =
   *       ModelDeploymentMonitoringJobName.of(
   *           "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]");
   *   jobServiceClient.deleteModelDeploymentMonitoringJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the model monitoring job to delete. Format:
   *     `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata>
      deleteModelDeploymentMonitoringJobAsync(ModelDeploymentMonitoringJobName name) {
    DeleteModelDeploymentMonitoringJobRequest request =
        DeleteModelDeploymentMonitoringJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteModelDeploymentMonitoringJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       ModelDeploymentMonitoringJobName.of(
   *               "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *           .toString();
   *   jobServiceClient.deleteModelDeploymentMonitoringJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the model monitoring job to delete. Format:
   *     `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata>
      deleteModelDeploymentMonitoringJobAsync(String name) {
    DeleteModelDeploymentMonitoringJobRequest request =
        DeleteModelDeploymentMonitoringJobRequest.newBuilder().setName(name).build();
    return deleteModelDeploymentMonitoringJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteModelDeploymentMonitoringJobRequest request =
   *       DeleteModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setName(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .build();
   *   jobServiceClient.deleteModelDeploymentMonitoringJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata>
      deleteModelDeploymentMonitoringJobAsync(DeleteModelDeploymentMonitoringJobRequest request) {
    return deleteModelDeploymentMonitoringJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteModelDeploymentMonitoringJobRequest request =
   *       DeleteModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setName(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       jobServiceClient
   *           .deleteModelDeploymentMonitoringJobOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          DeleteModelDeploymentMonitoringJobRequest, Empty, DeleteOperationMetadata>
      deleteModelDeploymentMonitoringJobOperationCallable() {
    return stub.deleteModelDeploymentMonitoringJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a ModelDeploymentMonitoringJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   DeleteModelDeploymentMonitoringJobRequest request =
   *       DeleteModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setName(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       jobServiceClient.deleteModelDeploymentMonitoringJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteModelDeploymentMonitoringJobRequest, Operation>
      deleteModelDeploymentMonitoringJobCallable() {
    return stub.deleteModelDeploymentMonitoringJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Pauses a ModelDeploymentMonitoringJob. If the job is running, the server makes a best effort to
   * cancel the job. Will mark
   * [ModelDeploymentMonitoringJob.state][google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.state]
   * to 'PAUSED'.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ModelDeploymentMonitoringJobName name =
   *       ModelDeploymentMonitoringJobName.of(
   *           "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]");
   *   jobServiceClient.pauseModelDeploymentMonitoringJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the ModelDeploymentMonitoringJob to pause. Format:
   *     `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void pauseModelDeploymentMonitoringJob(ModelDeploymentMonitoringJobName name) {
    PauseModelDeploymentMonitoringJobRequest request =
        PauseModelDeploymentMonitoringJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    pauseModelDeploymentMonitoringJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Pauses a ModelDeploymentMonitoringJob. If the job is running, the server makes a best effort to
   * cancel the job. Will mark
   * [ModelDeploymentMonitoringJob.state][google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.state]
   * to 'PAUSED'.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       ModelDeploymentMonitoringJobName.of(
   *               "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *           .toString();
   *   jobServiceClient.pauseModelDeploymentMonitoringJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the ModelDeploymentMonitoringJob to pause. Format:
   *     `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void pauseModelDeploymentMonitoringJob(String name) {
    PauseModelDeploymentMonitoringJobRequest request =
        PauseModelDeploymentMonitoringJobRequest.newBuilder().setName(name).build();
    pauseModelDeploymentMonitoringJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Pauses a ModelDeploymentMonitoringJob. If the job is running, the server makes a best effort to
   * cancel the job. Will mark
   * [ModelDeploymentMonitoringJob.state][google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.state]
   * to 'PAUSED'.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   PauseModelDeploymentMonitoringJobRequest request =
   *       PauseModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setName(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .build();
   *   jobServiceClient.pauseModelDeploymentMonitoringJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void pauseModelDeploymentMonitoringJob(
      PauseModelDeploymentMonitoringJobRequest request) {
    pauseModelDeploymentMonitoringJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Pauses a ModelDeploymentMonitoringJob. If the job is running, the server makes a best effort to
   * cancel the job. Will mark
   * [ModelDeploymentMonitoringJob.state][google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.state]
   * to 'PAUSED'.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   PauseModelDeploymentMonitoringJobRequest request =
   *       PauseModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setName(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       jobServiceClient.pauseModelDeploymentMonitoringJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PauseModelDeploymentMonitoringJobRequest, Empty>
      pauseModelDeploymentMonitoringJobCallable() {
    return stub.pauseModelDeploymentMonitoringJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resumes a paused ModelDeploymentMonitoringJob. It will start to run from next scheduled time. A
   * deleted ModelDeploymentMonitoringJob can't be resumed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ModelDeploymentMonitoringJobName name =
   *       ModelDeploymentMonitoringJobName.of(
   *           "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]");
   *   jobServiceClient.resumeModelDeploymentMonitoringJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the ModelDeploymentMonitoringJob to resume. Format:
   *     `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void resumeModelDeploymentMonitoringJob(ModelDeploymentMonitoringJobName name) {
    ResumeModelDeploymentMonitoringJobRequest request =
        ResumeModelDeploymentMonitoringJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    resumeModelDeploymentMonitoringJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resumes a paused ModelDeploymentMonitoringJob. It will start to run from next scheduled time. A
   * deleted ModelDeploymentMonitoringJob can't be resumed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   String name =
   *       ModelDeploymentMonitoringJobName.of(
   *               "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *           .toString();
   *   jobServiceClient.resumeModelDeploymentMonitoringJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the ModelDeploymentMonitoringJob to resume. Format:
   *     `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void resumeModelDeploymentMonitoringJob(String name) {
    ResumeModelDeploymentMonitoringJobRequest request =
        ResumeModelDeploymentMonitoringJobRequest.newBuilder().setName(name).build();
    resumeModelDeploymentMonitoringJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resumes a paused ModelDeploymentMonitoringJob. It will start to run from next scheduled time. A
   * deleted ModelDeploymentMonitoringJob can't be resumed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ResumeModelDeploymentMonitoringJobRequest request =
   *       ResumeModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setName(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .build();
   *   jobServiceClient.resumeModelDeploymentMonitoringJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void resumeModelDeploymentMonitoringJob(
      ResumeModelDeploymentMonitoringJobRequest request) {
    resumeModelDeploymentMonitoringJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resumes a paused ModelDeploymentMonitoringJob. It will start to run from next scheduled time. A
   * deleted ModelDeploymentMonitoringJob can't be resumed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ResumeModelDeploymentMonitoringJobRequest request =
   *       ResumeModelDeploymentMonitoringJobRequest.newBuilder()
   *           .setName(
   *               ModelDeploymentMonitoringJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       jobServiceClient.resumeModelDeploymentMonitoringJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ResumeModelDeploymentMonitoringJobRequest, Empty>
      resumeModelDeploymentMonitoringJobCallable() {
    return stub.resumeModelDeploymentMonitoringJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Location element : jobServiceClient.listLocations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLocationsPagedResponse listLocations(ListLocationsRequest request) {
    return listLocationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Location> future =
   *       jobServiceClient.listLocationsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Location element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return stub.listLocationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListLocationsResponse response = jobServiceClient.listLocationsCallable().call(request);
   *     for (Location element : response.getLocationsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return stub.listLocationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   Location response = jobServiceClient.getLocation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Location getLocation(GetLocationRequest request) {
    return getLocationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Location> future = jobServiceClient.getLocationCallable().futureCall(request);
   *   // Do something.
   *   Location response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return stub.getLocationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replacesany existing policy.
   *
   * <p>Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED`errors.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Policy response = jobServiceClient.setIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replacesany existing policy.
   *
   * <p>Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED`errors.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future = jobServiceClient.setIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. Returns an empty policyif the resource exists
   * and does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   Policy response = jobServiceClient.getIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. Returns an empty policyif the resource exists
   * and does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future = jobServiceClient.getIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource. If theresource does not exist,
   * this will return an empty set ofpermissions, not a `NOT_FOUND` error.
   *
   * <p>Note: This operation is designed to be used for buildingpermission-aware UIs and
   * command-line tools, not for authorizationchecking. This operation may "fail open" without
   * warning.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   TestIamPermissionsResponse response = jobServiceClient.testIamPermissions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(TestIamPermissionsRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource. If theresource does not exist,
   * this will return an empty set ofpermissions, not a `NOT_FOUND` error.
   *
   * <p>Note: This operation is designed to be used for buildingpermission-aware UIs and
   * command-line tools, not for authorizationchecking. This operation may "fail open" without
   * warning.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   ApiFuture<TestIamPermissionsResponse> future =
   *       jobServiceClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something.
   *   TestIamPermissionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListCustomJobsPagedResponse
      extends AbstractPagedListResponse<
          ListCustomJobsRequest,
          ListCustomJobsResponse,
          CustomJob,
          ListCustomJobsPage,
          ListCustomJobsFixedSizeCollection> {

    public static ApiFuture<ListCustomJobsPagedResponse> createAsync(
        PageContext<ListCustomJobsRequest, ListCustomJobsResponse, CustomJob> context,
        ApiFuture<ListCustomJobsResponse> futureResponse) {
      ApiFuture<ListCustomJobsPage> futurePage =
          ListCustomJobsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListCustomJobsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListCustomJobsPagedResponse(ListCustomJobsPage page) {
      super(page, ListCustomJobsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListCustomJobsPage
      extends AbstractPage<
          ListCustomJobsRequest, ListCustomJobsResponse, CustomJob, ListCustomJobsPage> {

    private ListCustomJobsPage(
        PageContext<ListCustomJobsRequest, ListCustomJobsResponse, CustomJob> context,
        ListCustomJobsResponse response) {
      super(context, response);
    }

    private static ListCustomJobsPage createEmptyPage() {
      return new ListCustomJobsPage(null, null);
    }

    @Override
    protected ListCustomJobsPage createPage(
        PageContext<ListCustomJobsRequest, ListCustomJobsResponse, CustomJob> context,
        ListCustomJobsResponse response) {
      return new ListCustomJobsPage(context, response);
    }

    @Override
    public ApiFuture<ListCustomJobsPage> createPageAsync(
        PageContext<ListCustomJobsRequest, ListCustomJobsResponse, CustomJob> context,
        ApiFuture<ListCustomJobsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListCustomJobsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListCustomJobsRequest,
          ListCustomJobsResponse,
          CustomJob,
          ListCustomJobsPage,
          ListCustomJobsFixedSizeCollection> {

    private ListCustomJobsFixedSizeCollection(List<ListCustomJobsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListCustomJobsFixedSizeCollection createEmptyCollection() {
      return new ListCustomJobsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListCustomJobsFixedSizeCollection createCollection(
        List<ListCustomJobsPage> pages, int collectionSize) {
      return new ListCustomJobsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListDataLabelingJobsPagedResponse
      extends AbstractPagedListResponse<
          ListDataLabelingJobsRequest,
          ListDataLabelingJobsResponse,
          DataLabelingJob,
          ListDataLabelingJobsPage,
          ListDataLabelingJobsFixedSizeCollection> {

    public static ApiFuture<ListDataLabelingJobsPagedResponse> createAsync(
        PageContext<ListDataLabelingJobsRequest, ListDataLabelingJobsResponse, DataLabelingJob>
            context,
        ApiFuture<ListDataLabelingJobsResponse> futureResponse) {
      ApiFuture<ListDataLabelingJobsPage> futurePage =
          ListDataLabelingJobsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListDataLabelingJobsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListDataLabelingJobsPagedResponse(ListDataLabelingJobsPage page) {
      super(page, ListDataLabelingJobsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListDataLabelingJobsPage
      extends AbstractPage<
          ListDataLabelingJobsRequest,
          ListDataLabelingJobsResponse,
          DataLabelingJob,
          ListDataLabelingJobsPage> {

    private ListDataLabelingJobsPage(
        PageContext<ListDataLabelingJobsRequest, ListDataLabelingJobsResponse, DataLabelingJob>
            context,
        ListDataLabelingJobsResponse response) {
      super(context, response);
    }

    private static ListDataLabelingJobsPage createEmptyPage() {
      return new ListDataLabelingJobsPage(null, null);
    }

    @Override
    protected ListDataLabelingJobsPage createPage(
        PageContext<ListDataLabelingJobsRequest, ListDataLabelingJobsResponse, DataLabelingJob>
            context,
        ListDataLabelingJobsResponse response) {
      return new ListDataLabelingJobsPage(context, response);
    }

    @Override
    public ApiFuture<ListDataLabelingJobsPage> createPageAsync(
        PageContext<ListDataLabelingJobsRequest, ListDataLabelingJobsResponse, DataLabelingJob>
            context,
        ApiFuture<ListDataLabelingJobsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListDataLabelingJobsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListDataLabelingJobsRequest,
          ListDataLabelingJobsResponse,
          DataLabelingJob,
          ListDataLabelingJobsPage,
          ListDataLabelingJobsFixedSizeCollection> {

    private ListDataLabelingJobsFixedSizeCollection(
        List<ListDataLabelingJobsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListDataLabelingJobsFixedSizeCollection createEmptyCollection() {
      return new ListDataLabelingJobsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListDataLabelingJobsFixedSizeCollection createCollection(
        List<ListDataLabelingJobsPage> pages, int collectionSize) {
      return new ListDataLabelingJobsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListHyperparameterTuningJobsPagedResponse
      extends AbstractPagedListResponse<
          ListHyperparameterTuningJobsRequest,
          ListHyperparameterTuningJobsResponse,
          HyperparameterTuningJob,
          ListHyperparameterTuningJobsPage,
          ListHyperparameterTuningJobsFixedSizeCollection> {

    public static ApiFuture<ListHyperparameterTuningJobsPagedResponse> createAsync(
        PageContext<
                ListHyperparameterTuningJobsRequest,
                ListHyperparameterTuningJobsResponse,
                HyperparameterTuningJob>
            context,
        ApiFuture<ListHyperparameterTuningJobsResponse> futureResponse) {
      ApiFuture<ListHyperparameterTuningJobsPage> futurePage =
          ListHyperparameterTuningJobsPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListHyperparameterTuningJobsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListHyperparameterTuningJobsPagedResponse(ListHyperparameterTuningJobsPage page) {
      super(page, ListHyperparameterTuningJobsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListHyperparameterTuningJobsPage
      extends AbstractPage<
          ListHyperparameterTuningJobsRequest,
          ListHyperparameterTuningJobsResponse,
          HyperparameterTuningJob,
          ListHyperparameterTuningJobsPage> {

    private ListHyperparameterTuningJobsPage(
        PageContext<
                ListHyperparameterTuningJobsRequest,
                ListHyperparameterTuningJobsResponse,
                HyperparameterTuningJob>
            context,
        ListHyperparameterTuningJobsResponse response) {
      super(context, response);
    }

    private static ListHyperparameterTuningJobsPage createEmptyPage() {
      return new ListHyperparameterTuningJobsPage(null, null);
    }

    @Override
    protected ListHyperparameterTuningJobsPage createPage(
        PageContext<
                ListHyperparameterTuningJobsRequest,
                ListHyperparameterTuningJobsResponse,
                HyperparameterTuningJob>
            context,
        ListHyperparameterTuningJobsResponse response) {
      return new ListHyperparameterTuningJobsPage(context, response);
    }

    @Override
    public ApiFuture<ListHyperparameterTuningJobsPage> createPageAsync(
        PageContext<
                ListHyperparameterTuningJobsRequest,
                ListHyperparameterTuningJobsResponse,
                HyperparameterTuningJob>
            context,
        ApiFuture<ListHyperparameterTuningJobsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListHyperparameterTuningJobsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListHyperparameterTuningJobsRequest,
          ListHyperparameterTuningJobsResponse,
          HyperparameterTuningJob,
          ListHyperparameterTuningJobsPage,
          ListHyperparameterTuningJobsFixedSizeCollection> {

    private ListHyperparameterTuningJobsFixedSizeCollection(
        List<ListHyperparameterTuningJobsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListHyperparameterTuningJobsFixedSizeCollection createEmptyCollection() {
      return new ListHyperparameterTuningJobsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListHyperparameterTuningJobsFixedSizeCollection createCollection(
        List<ListHyperparameterTuningJobsPage> pages, int collectionSize) {
      return new ListHyperparameterTuningJobsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListNasJobsPagedResponse
      extends AbstractPagedListResponse<
          ListNasJobsRequest,
          ListNasJobsResponse,
          NasJob,
          ListNasJobsPage,
          ListNasJobsFixedSizeCollection> {

    public static ApiFuture<ListNasJobsPagedResponse> createAsync(
        PageContext<ListNasJobsRequest, ListNasJobsResponse, NasJob> context,
        ApiFuture<ListNasJobsResponse> futureResponse) {
      ApiFuture<ListNasJobsPage> futurePage =
          ListNasJobsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListNasJobsPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListNasJobsPagedResponse(ListNasJobsPage page) {
      super(page, ListNasJobsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListNasJobsPage
      extends AbstractPage<ListNasJobsRequest, ListNasJobsResponse, NasJob, ListNasJobsPage> {

    private ListNasJobsPage(
        PageContext<ListNasJobsRequest, ListNasJobsResponse, NasJob> context,
        ListNasJobsResponse response) {
      super(context, response);
    }

    private static ListNasJobsPage createEmptyPage() {
      return new ListNasJobsPage(null, null);
    }

    @Override
    protected ListNasJobsPage createPage(
        PageContext<ListNasJobsRequest, ListNasJobsResponse, NasJob> context,
        ListNasJobsResponse response) {
      return new ListNasJobsPage(context, response);
    }

    @Override
    public ApiFuture<ListNasJobsPage> createPageAsync(
        PageContext<ListNasJobsRequest, ListNasJobsResponse, NasJob> context,
        ApiFuture<ListNasJobsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListNasJobsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListNasJobsRequest,
          ListNasJobsResponse,
          NasJob,
          ListNasJobsPage,
          ListNasJobsFixedSizeCollection> {

    private ListNasJobsFixedSizeCollection(List<ListNasJobsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListNasJobsFixedSizeCollection createEmptyCollection() {
      return new ListNasJobsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListNasJobsFixedSizeCollection createCollection(
        List<ListNasJobsPage> pages, int collectionSize) {
      return new ListNasJobsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListNasTrialDetailsPagedResponse
      extends AbstractPagedListResponse<
          ListNasTrialDetailsRequest,
          ListNasTrialDetailsResponse,
          NasTrialDetail,
          ListNasTrialDetailsPage,
          ListNasTrialDetailsFixedSizeCollection> {

    public static ApiFuture<ListNasTrialDetailsPagedResponse> createAsync(
        PageContext<ListNasTrialDetailsRequest, ListNasTrialDetailsResponse, NasTrialDetail>
            context,
        ApiFuture<ListNasTrialDetailsResponse> futureResponse) {
      ApiFuture<ListNasTrialDetailsPage> futurePage =
          ListNasTrialDetailsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListNasTrialDetailsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListNasTrialDetailsPagedResponse(ListNasTrialDetailsPage page) {
      super(page, ListNasTrialDetailsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListNasTrialDetailsPage
      extends AbstractPage<
          ListNasTrialDetailsRequest,
          ListNasTrialDetailsResponse,
          NasTrialDetail,
          ListNasTrialDetailsPage> {

    private ListNasTrialDetailsPage(
        PageContext<ListNasTrialDetailsRequest, ListNasTrialDetailsResponse, NasTrialDetail>
            context,
        ListNasTrialDetailsResponse response) {
      super(context, response);
    }

    private static ListNasTrialDetailsPage createEmptyPage() {
      return new ListNasTrialDetailsPage(null, null);
    }

    @Override
    protected ListNasTrialDetailsPage createPage(
        PageContext<ListNasTrialDetailsRequest, ListNasTrialDetailsResponse, NasTrialDetail>
            context,
        ListNasTrialDetailsResponse response) {
      return new ListNasTrialDetailsPage(context, response);
    }

    @Override
    public ApiFuture<ListNasTrialDetailsPage> createPageAsync(
        PageContext<ListNasTrialDetailsRequest, ListNasTrialDetailsResponse, NasTrialDetail>
            context,
        ApiFuture<ListNasTrialDetailsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListNasTrialDetailsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListNasTrialDetailsRequest,
          ListNasTrialDetailsResponse,
          NasTrialDetail,
          ListNasTrialDetailsPage,
          ListNasTrialDetailsFixedSizeCollection> {

    private ListNasTrialDetailsFixedSizeCollection(
        List<ListNasTrialDetailsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListNasTrialDetailsFixedSizeCollection createEmptyCollection() {
      return new ListNasTrialDetailsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListNasTrialDetailsFixedSizeCollection createCollection(
        List<ListNasTrialDetailsPage> pages, int collectionSize) {
      return new ListNasTrialDetailsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListBatchPredictionJobsPagedResponse
      extends AbstractPagedListResponse<
          ListBatchPredictionJobsRequest,
          ListBatchPredictionJobsResponse,
          BatchPredictionJob,
          ListBatchPredictionJobsPage,
          ListBatchPredictionJobsFixedSizeCollection> {

    public static ApiFuture<ListBatchPredictionJobsPagedResponse> createAsync(
        PageContext<
                ListBatchPredictionJobsRequest, ListBatchPredictionJobsResponse, BatchPredictionJob>
            context,
        ApiFuture<ListBatchPredictionJobsResponse> futureResponse) {
      ApiFuture<ListBatchPredictionJobsPage> futurePage =
          ListBatchPredictionJobsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListBatchPredictionJobsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListBatchPredictionJobsPagedResponse(ListBatchPredictionJobsPage page) {
      super(page, ListBatchPredictionJobsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListBatchPredictionJobsPage
      extends AbstractPage<
          ListBatchPredictionJobsRequest,
          ListBatchPredictionJobsResponse,
          BatchPredictionJob,
          ListBatchPredictionJobsPage> {

    private ListBatchPredictionJobsPage(
        PageContext<
                ListBatchPredictionJobsRequest, ListBatchPredictionJobsResponse, BatchPredictionJob>
            context,
        ListBatchPredictionJobsResponse response) {
      super(context, response);
    }

    private static ListBatchPredictionJobsPage createEmptyPage() {
      return new ListBatchPredictionJobsPage(null, null);
    }

    @Override
    protected ListBatchPredictionJobsPage createPage(
        PageContext<
                ListBatchPredictionJobsRequest, ListBatchPredictionJobsResponse, BatchPredictionJob>
            context,
        ListBatchPredictionJobsResponse response) {
      return new ListBatchPredictionJobsPage(context, response);
    }

    @Override
    public ApiFuture<ListBatchPredictionJobsPage> createPageAsync(
        PageContext<
                ListBatchPredictionJobsRequest, ListBatchPredictionJobsResponse, BatchPredictionJob>
            context,
        ApiFuture<ListBatchPredictionJobsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListBatchPredictionJobsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListBatchPredictionJobsRequest,
          ListBatchPredictionJobsResponse,
          BatchPredictionJob,
          ListBatchPredictionJobsPage,
          ListBatchPredictionJobsFixedSizeCollection> {

    private ListBatchPredictionJobsFixedSizeCollection(
        List<ListBatchPredictionJobsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListBatchPredictionJobsFixedSizeCollection createEmptyCollection() {
      return new ListBatchPredictionJobsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListBatchPredictionJobsFixedSizeCollection createCollection(
        List<ListBatchPredictionJobsPage> pages, int collectionSize) {
      return new ListBatchPredictionJobsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse
      extends AbstractPagedListResponse<
          SearchModelDeploymentMonitoringStatsAnomaliesRequest,
          SearchModelDeploymentMonitoringStatsAnomaliesResponse,
          ModelMonitoringStatsAnomalies,
          SearchModelDeploymentMonitoringStatsAnomaliesPage,
          SearchModelDeploymentMonitoringStatsAnomaliesFixedSizeCollection> {

    public static ApiFuture<SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse> createAsync(
        PageContext<
                SearchModelDeploymentMonitoringStatsAnomaliesRequest,
                SearchModelDeploymentMonitoringStatsAnomaliesResponse,
                ModelMonitoringStatsAnomalies>
            context,
        ApiFuture<SearchModelDeploymentMonitoringStatsAnomaliesResponse> futureResponse) {
      ApiFuture<SearchModelDeploymentMonitoringStatsAnomaliesPage> futurePage =
          SearchModelDeploymentMonitoringStatsAnomaliesPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private SearchModelDeploymentMonitoringStatsAnomaliesPagedResponse(
        SearchModelDeploymentMonitoringStatsAnomaliesPage page) {
      super(
          page,
          SearchModelDeploymentMonitoringStatsAnomaliesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class SearchModelDeploymentMonitoringStatsAnomaliesPage
      extends AbstractPage<
          SearchModelDeploymentMonitoringStatsAnomaliesRequest,
          SearchModelDeploymentMonitoringStatsAnomaliesResponse,
          ModelMonitoringStatsAnomalies,
          SearchModelDeploymentMonitoringStatsAnomaliesPage> {

    private SearchModelDeploymentMonitoringStatsAnomaliesPage(
        PageContext<
                SearchModelDeploymentMonitoringStatsAnomaliesRequest,
                SearchModelDeploymentMonitoringStatsAnomaliesResponse,
                ModelMonitoringStatsAnomalies>
            context,
        SearchModelDeploymentMonitoringStatsAnomaliesResponse response) {
      super(context, response);
    }

    private static SearchModelDeploymentMonitoringStatsAnomaliesPage createEmptyPage() {
      return new SearchModelDeploymentMonitoringStatsAnomaliesPage(null, null);
    }

    @Override
    protected SearchModelDeploymentMonitoringStatsAnomaliesPage createPage(
        PageContext<
                SearchModelDeploymentMonitoringStatsAnomaliesRequest,
                SearchModelDeploymentMonitoringStatsAnomaliesResponse,
                ModelMonitoringStatsAnomalies>
            context,
        SearchModelDeploymentMonitoringStatsAnomaliesResponse response) {
      return new SearchModelDeploymentMonitoringStatsAnomaliesPage(context, response);
    }

    @Override
    public ApiFuture<SearchModelDeploymentMonitoringStatsAnomaliesPage> createPageAsync(
        PageContext<
                SearchModelDeploymentMonitoringStatsAnomaliesRequest,
                SearchModelDeploymentMonitoringStatsAnomaliesResponse,
                ModelMonitoringStatsAnomalies>
            context,
        ApiFuture<SearchModelDeploymentMonitoringStatsAnomaliesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class SearchModelDeploymentMonitoringStatsAnomaliesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          SearchModelDeploymentMonitoringStatsAnomaliesRequest,
          SearchModelDeploymentMonitoringStatsAnomaliesResponse,
          ModelMonitoringStatsAnomalies,
          SearchModelDeploymentMonitoringStatsAnomaliesPage,
          SearchModelDeploymentMonitoringStatsAnomaliesFixedSizeCollection> {

    private SearchModelDeploymentMonitoringStatsAnomaliesFixedSizeCollection(
        List<SearchModelDeploymentMonitoringStatsAnomaliesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static SearchModelDeploymentMonitoringStatsAnomaliesFixedSizeCollection
        createEmptyCollection() {
      return new SearchModelDeploymentMonitoringStatsAnomaliesFixedSizeCollection(null, 0);
    }

    @Override
    protected SearchModelDeploymentMonitoringStatsAnomaliesFixedSizeCollection createCollection(
        List<SearchModelDeploymentMonitoringStatsAnomaliesPage> pages, int collectionSize) {
      return new SearchModelDeploymentMonitoringStatsAnomaliesFixedSizeCollection(
          pages, collectionSize);
    }
  }

  public static class ListModelDeploymentMonitoringJobsPagedResponse
      extends AbstractPagedListResponse<
          ListModelDeploymentMonitoringJobsRequest,
          ListModelDeploymentMonitoringJobsResponse,
          ModelDeploymentMonitoringJob,
          ListModelDeploymentMonitoringJobsPage,
          ListModelDeploymentMonitoringJobsFixedSizeCollection> {

    public static ApiFuture<ListModelDeploymentMonitoringJobsPagedResponse> createAsync(
        PageContext<
                ListModelDeploymentMonitoringJobsRequest,
                ListModelDeploymentMonitoringJobsResponse,
                ModelDeploymentMonitoringJob>
            context,
        ApiFuture<ListModelDeploymentMonitoringJobsResponse> futureResponse) {
      ApiFuture<ListModelDeploymentMonitoringJobsPage> futurePage =
          ListModelDeploymentMonitoringJobsPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListModelDeploymentMonitoringJobsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListModelDeploymentMonitoringJobsPagedResponse(
        ListModelDeploymentMonitoringJobsPage page) {
      super(page, ListModelDeploymentMonitoringJobsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListModelDeploymentMonitoringJobsPage
      extends AbstractPage<
          ListModelDeploymentMonitoringJobsRequest,
          ListModelDeploymentMonitoringJobsResponse,
          ModelDeploymentMonitoringJob,
          ListModelDeploymentMonitoringJobsPage> {

    private ListModelDeploymentMonitoringJobsPage(
        PageContext<
                ListModelDeploymentMonitoringJobsRequest,
                ListModelDeploymentMonitoringJobsResponse,
                ModelDeploymentMonitoringJob>
            context,
        ListModelDeploymentMonitoringJobsResponse response) {
      super(context, response);
    }

    private static ListModelDeploymentMonitoringJobsPage createEmptyPage() {
      return new ListModelDeploymentMonitoringJobsPage(null, null);
    }

    @Override
    protected ListModelDeploymentMonitoringJobsPage createPage(
        PageContext<
                ListModelDeploymentMonitoringJobsRequest,
                ListModelDeploymentMonitoringJobsResponse,
                ModelDeploymentMonitoringJob>
            context,
        ListModelDeploymentMonitoringJobsResponse response) {
      return new ListModelDeploymentMonitoringJobsPage(context, response);
    }

    @Override
    public ApiFuture<ListModelDeploymentMonitoringJobsPage> createPageAsync(
        PageContext<
                ListModelDeploymentMonitoringJobsRequest,
                ListModelDeploymentMonitoringJobsResponse,
                ModelDeploymentMonitoringJob>
            context,
        ApiFuture<ListModelDeploymentMonitoringJobsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListModelDeploymentMonitoringJobsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListModelDeploymentMonitoringJobsRequest,
          ListModelDeploymentMonitoringJobsResponse,
          ModelDeploymentMonitoringJob,
          ListModelDeploymentMonitoringJobsPage,
          ListModelDeploymentMonitoringJobsFixedSizeCollection> {

    private ListModelDeploymentMonitoringJobsFixedSizeCollection(
        List<ListModelDeploymentMonitoringJobsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListModelDeploymentMonitoringJobsFixedSizeCollection createEmptyCollection() {
      return new ListModelDeploymentMonitoringJobsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListModelDeploymentMonitoringJobsFixedSizeCollection createCollection(
        List<ListModelDeploymentMonitoringJobsPage> pages, int collectionSize) {
      return new ListModelDeploymentMonitoringJobsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListLocationsPagedResponse
      extends AbstractPagedListResponse<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    public static ApiFuture<ListLocationsPagedResponse> createAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      ApiFuture<ListLocationsPage> futurePage =
          ListLocationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListLocationsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListLocationsPagedResponse(ListLocationsPage page) {
      super(page, ListLocationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListLocationsPage
      extends AbstractPage<
          ListLocationsRequest, ListLocationsResponse, Location, ListLocationsPage> {

    private ListLocationsPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      super(context, response);
    }

    private static ListLocationsPage createEmptyPage() {
      return new ListLocationsPage(null, null);
    }

    @Override
    protected ListLocationsPage createPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      return new ListLocationsPage(context, response);
    }

    @Override
    public ApiFuture<ListLocationsPage> createPageAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListLocationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    private ListLocationsFixedSizeCollection(List<ListLocationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListLocationsFixedSizeCollection createEmptyCollection() {
      return new ListLocationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListLocationsFixedSizeCollection createCollection(
        List<ListLocationsPage> pages, int collectionSize) {
      return new ListLocationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
