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

package com.google.cloud.domains.v1beta1.samples;

// [START domains_v1beta1_generated_Domains_TransferDomain_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.domains.v1beta1.AuthorizationCode;
import com.google.cloud.domains.v1beta1.ContactNotice;
import com.google.cloud.domains.v1beta1.DomainsClient;
import com.google.cloud.domains.v1beta1.LocationName;
import com.google.cloud.domains.v1beta1.Registration;
import com.google.cloud.domains.v1beta1.TransferDomainRequest;
import com.google.longrunning.Operation;
import com.google.type.Money;
import java.util.ArrayList;

public class AsyncTransferDomain {

  public static void main(String[] args) throws Exception {
    asyncTransferDomain();
  }

  public static void asyncTransferDomain() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DomainsClient domainsClient = DomainsClient.create()) {
      TransferDomainRequest request =
          TransferDomainRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setRegistration(Registration.newBuilder().build())
              .addAllContactNotices(new ArrayList<ContactNotice>())
              .setYearlyPrice(Money.newBuilder().build())
              .setAuthorizationCode(AuthorizationCode.newBuilder().build())
              .setValidateOnly(true)
              .build();
      ApiFuture<Operation> future = domainsClient.transferDomainCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END domains_v1beta1_generated_Domains_TransferDomain_async]
