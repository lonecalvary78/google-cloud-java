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

package com.google.cloud.policytroubleshooter.iam.v3.samples;

// [START policytroubleshooter_v3_generated_PolicyTroubleshooter_TroubleshootIamPolicy_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.policytroubleshooter.iam.v3.AccessTuple;
import com.google.cloud.policytroubleshooter.iam.v3.PolicyTroubleshooterClient;
import com.google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyRequest;
import com.google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse;

public class AsyncTroubleshootIamPolicy {

  public static void main(String[] args) throws Exception {
    asyncTroubleshootIamPolicy();
  }

  public static void asyncTroubleshootIamPolicy() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (PolicyTroubleshooterClient policyTroubleshooterClient =
        PolicyTroubleshooterClient.create()) {
      TroubleshootIamPolicyRequest request =
          TroubleshootIamPolicyRequest.newBuilder()
              .setAccessTuple(AccessTuple.newBuilder().build())
              .build();
      ApiFuture<TroubleshootIamPolicyResponse> future =
          policyTroubleshooterClient.troubleshootIamPolicyCallable().futureCall(request);
      // Do something.
      TroubleshootIamPolicyResponse response = future.get();
    }
  }
}
// [END policytroubleshooter_v3_generated_PolicyTroubleshooter_TroubleshootIamPolicy_async]
