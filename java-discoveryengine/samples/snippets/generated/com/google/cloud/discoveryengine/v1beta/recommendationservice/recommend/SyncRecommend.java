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

package com.google.cloud.discoveryengine.v1beta.samples;

// [START discoveryengine_v1beta_generated_RecommendationService_Recommend_sync]
import com.google.cloud.discoveryengine.v1beta.RecommendRequest;
import com.google.cloud.discoveryengine.v1beta.RecommendResponse;
import com.google.cloud.discoveryengine.v1beta.RecommendationServiceClient;
import com.google.cloud.discoveryengine.v1beta.ServingConfigName;
import com.google.cloud.discoveryengine.v1beta.UserEvent;
import com.google.protobuf.Value;
import java.util.HashMap;

public class SyncRecommend {

  public static void main(String[] args) throws Exception {
    syncRecommend();
  }

  public static void syncRecommend() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RecommendationServiceClient recommendationServiceClient =
        RecommendationServiceClient.create()) {
      RecommendRequest request =
          RecommendRequest.newBuilder()
              .setServingConfig(
                  ServingConfigName.ofProjectLocationDataStoreServingConfigName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[SERVING_CONFIG]")
                      .toString())
              .setUserEvent(UserEvent.newBuilder().build())
              .setPageSize(883849137)
              .setFilter("filter-1274492040")
              .setValidateOnly(true)
              .putAllParams(new HashMap<String, Value>())
              .putAllUserLabels(new HashMap<String, String>())
              .build();
      RecommendResponse response = recommendationServiceClient.recommend(request);
    }
  }
}
// [END discoveryengine_v1beta_generated_RecommendationService_Recommend_sync]
