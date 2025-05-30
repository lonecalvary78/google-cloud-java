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

package com.google.shopping.merchant.accounts.v1beta.samples;

// [START merchantapi_v1beta_generated_GbpAccountsService_ListGbpAccounts_Paged_async]
import com.google.common.base.Strings;
import com.google.shopping.merchant.accounts.v1beta.AccountName;
import com.google.shopping.merchant.accounts.v1beta.GbpAccount;
import com.google.shopping.merchant.accounts.v1beta.GbpAccountsServiceClient;
import com.google.shopping.merchant.accounts.v1beta.ListGbpAccountsRequest;
import com.google.shopping.merchant.accounts.v1beta.ListGbpAccountsResponse;

public class AsyncListGbpAccountsPaged {

  public static void main(String[] args) throws Exception {
    asyncListGbpAccountsPaged();
  }

  public static void asyncListGbpAccountsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (GbpAccountsServiceClient gbpAccountsServiceClient = GbpAccountsServiceClient.create()) {
      ListGbpAccountsRequest request =
          ListGbpAccountsRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListGbpAccountsResponse response =
            gbpAccountsServiceClient.listGbpAccountsCallable().call(request);
        for (GbpAccount element : response.getGbpAccountsList()) {
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
// [END merchantapi_v1beta_generated_GbpAccountsService_ListGbpAccounts_Paged_async]
