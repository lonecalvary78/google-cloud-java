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

package com.google.cloud.iot.v1.samples;

// [START cloudiot_v1_generated_DeviceManager_CreateDeviceRegistry_sync]
import com.google.cloud.iot.v1.CreateDeviceRegistryRequest;
import com.google.cloud.iot.v1.DeviceManagerClient;
import com.google.cloud.iot.v1.DeviceRegistry;
import com.google.cloud.iot.v1.LocationName;

public class SyncCreateDeviceRegistry {

  public static void main(String[] args) throws Exception {
    syncCreateDeviceRegistry();
  }

  public static void syncCreateDeviceRegistry() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
      CreateDeviceRegistryRequest request =
          CreateDeviceRegistryRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setDeviceRegistry(DeviceRegistry.newBuilder().build())
              .build();
      DeviceRegistry response = deviceManagerClient.createDeviceRegistry(request);
    }
  }
}
// [END cloudiot_v1_generated_DeviceManager_CreateDeviceRegistry_sync]
