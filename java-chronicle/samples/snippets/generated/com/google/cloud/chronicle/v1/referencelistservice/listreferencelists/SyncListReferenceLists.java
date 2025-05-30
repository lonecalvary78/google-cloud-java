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

package com.google.cloud.chronicle.v1.samples;

// [START chronicle_v1_generated_ReferenceListService_ListReferenceLists_sync]
import com.google.cloud.chronicle.v1.InstanceName;
import com.google.cloud.chronicle.v1.ListReferenceListsRequest;
import com.google.cloud.chronicle.v1.ReferenceList;
import com.google.cloud.chronicle.v1.ReferenceListServiceClient;
import com.google.cloud.chronicle.v1.ReferenceListView;

public class SyncListReferenceLists {

  public static void main(String[] args) throws Exception {
    syncListReferenceLists();
  }

  public static void syncListReferenceLists() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ReferenceListServiceClient referenceListServiceClient =
        ReferenceListServiceClient.create()) {
      ListReferenceListsRequest request =
          ListReferenceListsRequest.newBuilder()
              .setParent(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setView(ReferenceListView.forNumber(0))
              .build();
      for (ReferenceList element :
          referenceListServiceClient.listReferenceLists(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END chronicle_v1_generated_ReferenceListService_ListReferenceLists_sync]
