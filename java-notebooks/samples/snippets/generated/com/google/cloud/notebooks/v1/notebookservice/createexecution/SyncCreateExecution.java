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

package com.google.cloud.notebooks.v1.samples;

// [START notebooks_v1_generated_NotebookService_CreateExecution_sync]
import com.google.cloud.notebooks.v1.CreateExecutionRequest;
import com.google.cloud.notebooks.v1.Execution;
import com.google.cloud.notebooks.v1.ExecutionName;
import com.google.cloud.notebooks.v1.NotebookServiceClient;

public class SyncCreateExecution {

  public static void main(String[] args) throws Exception {
    syncCreateExecution();
  }

  public static void syncCreateExecution() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NotebookServiceClient notebookServiceClient = NotebookServiceClient.create()) {
      CreateExecutionRequest request =
          CreateExecutionRequest.newBuilder()
              .setParent(ExecutionName.of("[PROJECT]", "[LOCATION]", "[EXECUTION]").toString())
              .setExecutionId("executionId-454906285")
              .setExecution(Execution.newBuilder().build())
              .build();
      Execution response = notebookServiceClient.createExecutionAsync(request).get();
    }
  }
}
// [END notebooks_v1_generated_NotebookService_CreateExecution_sync]
