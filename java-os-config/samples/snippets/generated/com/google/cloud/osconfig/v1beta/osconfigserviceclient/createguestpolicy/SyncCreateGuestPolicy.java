/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.osconfig.v1beta.samples;

// [START osconfig_v1beta_generated_osconfigserviceclient_createguestpolicy_sync]
import com.google.cloud.osconfig.v1beta.GuestPolicies;
import com.google.cloud.osconfig.v1beta.OsConfigServiceClient;
import com.google.cloud.osconfig.v1beta.ProjectName;

public class SyncCreateGuestPolicy {

  public static void main(String[] args) throws Exception {
    syncCreateGuestPolicy();
  }

  public static void syncCreateGuestPolicy() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (OsConfigServiceClient osConfigServiceClient = OsConfigServiceClient.create()) {
      GuestPolicies.CreateGuestPolicyRequest request =
          GuestPolicies.CreateGuestPolicyRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setGuestPolicyId("guestPolicyId1234592741")
              .setGuestPolicy(GuestPolicies.GuestPolicy.newBuilder().build())
              .build();
      GuestPolicies.GuestPolicy response = osConfigServiceClient.createGuestPolicy(request);
    }
  }
}
// [END osconfig_v1beta_generated_osconfigserviceclient_createguestpolicy_sync]