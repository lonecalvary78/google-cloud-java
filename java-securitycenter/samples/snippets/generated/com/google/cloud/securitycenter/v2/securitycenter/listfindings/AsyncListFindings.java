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

package com.google.cloud.securitycenter.v2.samples;

// [START securitycenter_v2_generated_SecurityCenter_ListFindings_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.securitycenter.v2.ListFindingsRequest;
import com.google.cloud.securitycenter.v2.ListFindingsResponse;
import com.google.cloud.securitycenter.v2.SecurityCenterClient;
import com.google.cloud.securitycenter.v2.SourceName;
import com.google.protobuf.FieldMask;

public class AsyncListFindings {

  public static void main(String[] args) throws Exception {
    asyncListFindings();
  }

  public static void asyncListFindings() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      ListFindingsRequest request =
          ListFindingsRequest.newBuilder()
              .setParent(
                  SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .setFieldMask(FieldMask.newBuilder().build())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      ApiFuture<ListFindingsResponse.ListFindingsResult> future =
          securityCenterClient.listFindingsPagedCallable().futureCall(request);
      // Do something.
      for (ListFindingsResponse.ListFindingsResult element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END securitycenter_v2_generated_SecurityCenter_ListFindings_async]
