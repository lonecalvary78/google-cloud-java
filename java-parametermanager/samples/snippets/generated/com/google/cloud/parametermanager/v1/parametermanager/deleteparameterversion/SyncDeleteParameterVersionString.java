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

package com.google.cloud.parametermanager.v1.samples;

// [START parametermanager_v1_generated_ParameterManager_DeleteParameterVersion_String_sync]
import com.google.cloud.parametermanager.v1.ParameterManagerClient;
import com.google.cloud.parametermanager.v1.ParameterVersionName;
import com.google.protobuf.Empty;

public class SyncDeleteParameterVersionString {

  public static void main(String[] args) throws Exception {
    syncDeleteParameterVersionString();
  }

  public static void syncDeleteParameterVersionString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ParameterManagerClient parameterManagerClient = ParameterManagerClient.create()) {
      String name =
          ParameterVersionName.of("[PROJECT]", "[LOCATION]", "[PARAMETER]", "[PARAMETER_VERSION]")
              .toString();
      parameterManagerClient.deleteParameterVersion(name);
    }
  }
}
// [END parametermanager_v1_generated_ParameterManager_DeleteParameterVersion_String_sync]
