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

package com.google.cloud.billing.v1.samples;

// [START cloudbilling_v1_generated_CloudBilling_UpdateBillingAccount_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.billing.v1.BillingAccount;
import com.google.cloud.billing.v1.BillingAccountName;
import com.google.cloud.billing.v1.CloudBillingClient;
import com.google.cloud.billing.v1.UpdateBillingAccountRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateBillingAccount {

  public static void main(String[] args) throws Exception {
    asyncUpdateBillingAccount();
  }

  public static void asyncUpdateBillingAccount() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudBillingClient cloudBillingClient = CloudBillingClient.create()) {
      UpdateBillingAccountRequest request =
          UpdateBillingAccountRequest.newBuilder()
              .setName(BillingAccountName.ofBillingAccountName("[BILLING_ACCOUNT]").toString())
              .setAccount(BillingAccount.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<BillingAccount> future =
          cloudBillingClient.updateBillingAccountCallable().futureCall(request);
      // Do something.
      BillingAccount response = future.get();
    }
  }
}
// [END cloudbilling_v1_generated_CloudBilling_UpdateBillingAccount_async]
