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

package com.google.cloud.retail.v2.samples;

// [START retail_v2_generated_SearchService_Search_Paged_async]
import com.google.cloud.retail.v2.BranchName;
import com.google.cloud.retail.v2.SearchRequest;
import com.google.cloud.retail.v2.SearchResponse;
import com.google.cloud.retail.v2.SearchServiceClient;
import com.google.cloud.retail.v2.StringList;
import com.google.cloud.retail.v2.UserInfo;
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.HashMap;

public class AsyncSearchPaged {

  public static void main(String[] args) throws Exception {
    asyncSearchPaged();
  }

  public static void asyncSearchPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SearchServiceClient searchServiceClient = SearchServiceClient.create()) {
      SearchRequest request =
          SearchRequest.newBuilder()
              .setPlacement("placement1792938725")
              .setBranch(
                  BranchName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[BRANCH]").toString())
              .setQuery("query107944136")
              .setVisitorId("visitorId1880545833")
              .setUserInfo(UserInfo.newBuilder().build())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setOffset(-1019779949)
              .setFilter("filter-1274492040")
              .setCanonicalFilter("canonicalFilter-722283124")
              .setOrderBy("orderBy-1207110587")
              .addAllFacetSpecs(new ArrayList<SearchRequest.FacetSpec>())
              .setDynamicFacetSpec(SearchRequest.DynamicFacetSpec.newBuilder().build())
              .setBoostSpec(SearchRequest.BoostSpec.newBuilder().build())
              .setQueryExpansionSpec(SearchRequest.QueryExpansionSpec.newBuilder().build())
              .addAllVariantRollupKeys(new ArrayList<String>())
              .addAllPageCategories(new ArrayList<String>())
              .setPersonalizationSpec(SearchRequest.PersonalizationSpec.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .setSpellCorrectionSpec(SearchRequest.SpellCorrectionSpec.newBuilder().build())
              .setEntity("entity-1298275357")
              .setConversationalSearchSpec(
                  SearchRequest.ConversationalSearchSpec.newBuilder().build())
              .setTileNavigationSpec(SearchRequest.TileNavigationSpec.newBuilder().build())
              .setLanguageCode("languageCode-2092349083")
              .setRegionCode("regionCode-1991004415")
              .setPlaceId("placeId-494224254")
              .putAllUserAttributes(new HashMap<String, StringList>())
              .build();
      while (true) {
        SearchResponse response = searchServiceClient.searchCallable().call(request);
        for (SearchResponse.SearchResult element : response.getResultsList()) {
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
// [END retail_v2_generated_SearchService_Search_Paged_async]
