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

package com.google.cloud.aiplatform.v1beta1.samples;

// [START aiplatform_v1beta1_generated_MemoryBankService_GetMemory_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.aiplatform.v1beta1.GetMemoryRequest;
import com.google.cloud.aiplatform.v1beta1.Memory;
import com.google.cloud.aiplatform.v1beta1.MemoryBankServiceClient;
import com.google.cloud.aiplatform.v1beta1.MemoryName;

public class AsyncGetMemory {

  public static void main(String[] args) throws Exception {
    asyncGetMemory();
  }

  public static void asyncGetMemory() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MemoryBankServiceClient memoryBankServiceClient = MemoryBankServiceClient.create()) {
      GetMemoryRequest request =
          GetMemoryRequest.newBuilder()
              .setName(
                  MemoryName.of("[PROJECT]", "[LOCATION]", "[REASONING_ENGINE]", "[MEMORY]")
                      .toString())
              .build();
      ApiFuture<Memory> future = memoryBankServiceClient.getMemoryCallable().futureCall(request);
      // Do something.
      Memory response = future.get();
    }
  }
}
// [END aiplatform_v1beta1_generated_MemoryBankService_GetMemory_async]
