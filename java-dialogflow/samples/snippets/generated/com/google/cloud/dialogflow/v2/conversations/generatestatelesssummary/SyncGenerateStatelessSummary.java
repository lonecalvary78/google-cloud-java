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

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_Conversations_GenerateStatelessSummary_sync]
import com.google.cloud.dialogflow.v2.ConversationProfile;
import com.google.cloud.dialogflow.v2.ConversationsClient;
import com.google.cloud.dialogflow.v2.GenerateStatelessSummaryRequest;
import com.google.cloud.dialogflow.v2.GenerateStatelessSummaryResponse;
import com.google.cloud.dialogflow.v2.MessageName;

public class SyncGenerateStatelessSummary {

  public static void main(String[] args) throws Exception {
    syncGenerateStatelessSummary();
  }

  public static void syncGenerateStatelessSummary() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ConversationsClient conversationsClient = ConversationsClient.create()) {
      GenerateStatelessSummaryRequest request =
          GenerateStatelessSummaryRequest.newBuilder()
              .setStatelessConversation(
                  GenerateStatelessSummaryRequest.MinimalConversation.newBuilder().build())
              .setConversationProfile(ConversationProfile.newBuilder().build())
              .setLatestMessage(
                  MessageName.ofProjectConversationMessageName(
                          "[PROJECT]", "[CONVERSATION]", "[MESSAGE]")
                      .toString())
              .setMaxContextSize(-1134084212)
              .build();
      GenerateStatelessSummaryResponse response =
          conversationsClient.generateStatelessSummary(request);
    }
  }
}
// [END dialogflow_v2_generated_Conversations_GenerateStatelessSummary_sync]
