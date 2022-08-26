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

// [START dataproc_v1_generated_jobcontrollerclient_listjobs_sync]
import com.google.cloud.dataproc.v1.Job;
import com.google.cloud.dataproc.v1.JobControllerClient;
import com.google.cloud.dataproc.v1.ListJobsRequest;

public class SyncListJobs {

  public static void main(String[] args) throws Exception {
    syncListJobs();
  }

  public static void syncListJobs() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
      ListJobsRequest request =
          ListJobsRequest.newBuilder()
              .setProjectId("projectId-894832108")
              .setRegion("region-934795532")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setClusterName("clusterName-1141738587")
              .setFilter("filter-1274492040")
              .build();
      for (Job element : jobControllerClient.listJobs(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END dataproc_v1_generated_jobcontrollerclient_listjobs_sync]