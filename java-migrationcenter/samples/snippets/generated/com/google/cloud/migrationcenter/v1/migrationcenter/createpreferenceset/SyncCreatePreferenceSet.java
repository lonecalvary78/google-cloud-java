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

package com.google.cloud.migrationcenter.v1.samples;

// [START migrationcenter_v1_generated_MigrationCenter_CreatePreferenceSet_sync]
import com.google.cloud.migrationcenter.v1.CreatePreferenceSetRequest;
import com.google.cloud.migrationcenter.v1.LocationName;
import com.google.cloud.migrationcenter.v1.MigrationCenterClient;
import com.google.cloud.migrationcenter.v1.PreferenceSet;

public class SyncCreatePreferenceSet {

  public static void main(String[] args) throws Exception {
    syncCreatePreferenceSet();
  }

  public static void syncCreatePreferenceSet() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MigrationCenterClient migrationCenterClient = MigrationCenterClient.create()) {
      CreatePreferenceSetRequest request =
          CreatePreferenceSetRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPreferenceSetId("preferenceSetId-569419518")
              .setPreferenceSet(PreferenceSet.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      PreferenceSet response = migrationCenterClient.createPreferenceSetAsync(request).get();
    }
  }
}
// [END migrationcenter_v1_generated_MigrationCenter_CreatePreferenceSet_sync]
