/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.dataproc.v1.samples;

// [START dataproc_v1_generated_clustercontrollerclient_getcluster_stringstringstring_sync]
import com.google.cloud.dataproc.v1.Cluster;
import com.google.cloud.dataproc.v1.ClusterControllerClient;

public class SyncGetClusterStringStringString {

  public static void main(String[] args) throws Exception {
    syncGetClusterStringStringString();
  }

  public static void syncGetClusterStringStringString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
      String projectId = "projectId-894832108";
      String region = "region-934795532";
      String clusterName = "clusterName-1141738587";
      Cluster response = clusterControllerClient.getCluster(projectId, region, clusterName);
    }
  }
}
// [END dataproc_v1_generated_clustercontrollerclient_getcluster_stringstringstring_sync]