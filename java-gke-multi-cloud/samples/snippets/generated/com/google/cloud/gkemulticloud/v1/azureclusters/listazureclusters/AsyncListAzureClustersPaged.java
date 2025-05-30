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

package com.google.cloud.gkemulticloud.v1.samples;

// [START gkemulticloud_v1_generated_AzureClusters_ListAzureClusters_Paged_async]
import com.google.cloud.gkemulticloud.v1.AzureCluster;
import com.google.cloud.gkemulticloud.v1.AzureClustersClient;
import com.google.cloud.gkemulticloud.v1.ListAzureClustersRequest;
import com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse;
import com.google.cloud.gkemulticloud.v1.LocationName;
import com.google.common.base.Strings;

public class AsyncListAzureClustersPaged {

  public static void main(String[] args) throws Exception {
    asyncListAzureClustersPaged();
  }

  public static void asyncListAzureClustersPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AzureClustersClient azureClustersClient = AzureClustersClient.create()) {
      ListAzureClustersRequest request =
          ListAzureClustersRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListAzureClustersResponse response =
            azureClustersClient.listAzureClustersCallable().call(request);
        for (AzureCluster element : response.getAzureClustersList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END gkemulticloud_v1_generated_AzureClusters_ListAzureClusters_Paged_async]
