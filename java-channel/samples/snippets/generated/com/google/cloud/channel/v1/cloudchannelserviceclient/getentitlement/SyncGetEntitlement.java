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

package com.google.cloud.channel.v1.samples;

// [START channel_v1_generated_cloudchannelserviceclient_getentitlement_sync]
import com.google.cloud.channel.v1.CloudChannelServiceClient;
import com.google.cloud.channel.v1.Entitlement;
import com.google.cloud.channel.v1.EntitlementName;
import com.google.cloud.channel.v1.GetEntitlementRequest;

public class SyncGetEntitlement {

  public static void main(String[] args) throws Exception {
    syncGetEntitlement();
  }

  public static void syncGetEntitlement() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudChannelServiceClient cloudChannelServiceClient = CloudChannelServiceClient.create()) {
      GetEntitlementRequest request =
          GetEntitlementRequest.newBuilder()
              .setName(EntitlementName.of("[ACCOUNT]", "[CUSTOMER]", "[ENTITLEMENT]").toString())
              .build();
      Entitlement response = cloudChannelServiceClient.getEntitlement(request);
    }
  }
}
// [END channel_v1_generated_cloudchannelserviceclient_getentitlement_sync]