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

package com.google.cloud.billing.budgets.v1.samples;

// [START billingbudgets_v1_generated_BudgetService_GetBudget_sync]
import com.google.cloud.billing.budgets.v1.Budget;
import com.google.cloud.billing.budgets.v1.BudgetName;
import com.google.cloud.billing.budgets.v1.BudgetServiceClient;
import com.google.cloud.billing.budgets.v1.GetBudgetRequest;

public class SyncGetBudget {

  public static void main(String[] args) throws Exception {
    syncGetBudget();
  }

  public static void syncGetBudget() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BudgetServiceClient budgetServiceClient = BudgetServiceClient.create()) {
      GetBudgetRequest request =
          GetBudgetRequest.newBuilder()
              .setName(BudgetName.of("[BILLING_ACCOUNT]", "[BUDGET]").toString())
              .build();
      Budget response = budgetServiceClient.getBudget(request);
    }
  }
}
// [END billingbudgets_v1_generated_BudgetService_GetBudget_sync]
