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

package com.google.api.cloudquotas.v1beta.samples;

// [START cloudquotas_v1beta_generated_QuotaAdjusterSettingsManager_GetQuotaAdjusterSettings_async]
import com.google.api.cloudquotas.v1beta.GetQuotaAdjusterSettingsRequest;
import com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings;
import com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsManagerClient;
import com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsName;
import com.google.api.core.ApiFuture;

public class AsyncGetQuotaAdjusterSettings {

  public static void main(String[] args) throws Exception {
    asyncGetQuotaAdjusterSettings();
  }

  public static void asyncGetQuotaAdjusterSettings() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (QuotaAdjusterSettingsManagerClient quotaAdjusterSettingsManagerClient =
        QuotaAdjusterSettingsManagerClient.create()) {
      GetQuotaAdjusterSettingsRequest request =
          GetQuotaAdjusterSettingsRequest.newBuilder()
              .setName(
                  QuotaAdjusterSettingsName.ofProjectLocationName("[PROJECT]", "[LOCATION]")
                      .toString())
              .build();
      ApiFuture<QuotaAdjusterSettings> future =
          quotaAdjusterSettingsManagerClient.getQuotaAdjusterSettingsCallable().futureCall(request);
      // Do something.
      QuotaAdjusterSettings response = future.get();
    }
  }
}
// [END cloudquotas_v1beta_generated_QuotaAdjusterSettingsManager_GetQuotaAdjusterSettings_async]
