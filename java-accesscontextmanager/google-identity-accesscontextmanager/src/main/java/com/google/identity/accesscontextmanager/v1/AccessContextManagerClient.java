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

package com.google.identity.accesscontextmanager.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.longrunning.OperationsClient;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.identity.accesscontextmanager.v1.stub.AccessContextManagerStub;
import com.google.identity.accesscontextmanager.v1.stub.AccessContextManagerStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: API for setting [access levels]
 * [google.identity.accesscontextmanager.v1.AccessLevel] and [service perimeters]
 * [google.identity.accesscontextmanager.v1.ServicePerimeter] for Google Cloud projects. Each
 * organization has one [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] that
 * contains the [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] and [service
 * perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter]. This [access policy]
 * [google.identity.accesscontextmanager.v1.AccessPolicy] is applicable to all resources in the
 * organization. AccessPolicies
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (AccessContextManagerClient accessContextManagerClient =
 *     AccessContextManagerClient.create()) {
 *   AccessPolicyName name = AccessPolicyName.of("[ACCESS_POLICY]");
 *   AccessPolicy response = accessContextManagerClient.getAccessPolicy(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AccessContextManagerClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ListAccessPolicies</td>
 *      <td><p> Lists all [access policies] [google.identity.accesscontextmanager.v1.AccessPolicy] in an organization.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listAccessPolicies(ListAccessPoliciesRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listAccessPoliciesPagedCallable()
 *           <li><p> listAccessPoliciesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetAccessPolicy</td>
 *      <td><p> Returns an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] based on the name.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getAccessPolicy(GetAccessPolicyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getAccessPolicy(AccessPolicyName name)
 *           <li><p> getAccessPolicy(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getAccessPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateAccessPolicy</td>
 *      <td><p> Creates an access policy. This method fails if the organization already has an access policy. The long-running operation has a successful status after the access policy propagates to long-lasting storage. Syntactic and basic semantic errors are returned in `metadata` as a BadRequest proto.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createAccessPolicyAsync(AccessPolicy request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createAccessPolicyOperationCallable()
 *           <li><p> createAccessPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateAccessPolicy</td>
 *      <td><p> Updates an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy]. The long-running operation from this RPC has a successful status after the changes to the [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] propagate to long-lasting storage.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateAccessPolicyAsync(UpdateAccessPolicyRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateAccessPolicyAsync(AccessPolicy policy, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateAccessPolicyOperationCallable()
 *           <li><p> updateAccessPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteAccessPolicy</td>
 *      <td><p> Deletes an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] based on the resource name. The long-running operation has a successful status after the [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] is removed from long-lasting storage.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteAccessPolicyAsync(DeleteAccessPolicyRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteAccessPolicyAsync(AccessPolicyName name)
 *           <li><p> deleteAccessPolicyAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteAccessPolicyOperationCallable()
 *           <li><p> deleteAccessPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListAccessLevels</td>
 *      <td><p> Lists all [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] for an access policy.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listAccessLevels(ListAccessLevelsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listAccessLevels(AccessPolicyName parent)
 *           <li><p> listAccessLevels(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listAccessLevelsPagedCallable()
 *           <li><p> listAccessLevelsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetAccessLevel</td>
 *      <td><p> Gets an [access level] [google.identity.accesscontextmanager.v1.AccessLevel] based on the resource name.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getAccessLevel(GetAccessLevelRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getAccessLevel(AccessLevelName name)
 *           <li><p> getAccessLevel(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getAccessLevelCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateAccessLevel</td>
 *      <td><p> Creates an [access level] [google.identity.accesscontextmanager.v1.AccessLevel]. The long-running operation from this RPC has a successful status after the [access level] [google.identity.accesscontextmanager.v1.AccessLevel] propagates to long-lasting storage. If [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contain errors, an error response is returned for the first error encountered.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createAccessLevelAsync(CreateAccessLevelRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createAccessLevelAsync(AccessPolicyName parent, AccessLevel accessLevel)
 *           <li><p> createAccessLevelAsync(String parent, AccessLevel accessLevel)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createAccessLevelOperationCallable()
 *           <li><p> createAccessLevelCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateAccessLevel</td>
 *      <td><p> Updates an [access level] [google.identity.accesscontextmanager.v1.AccessLevel]. The long-running operation from this RPC has a successful status after the changes to the [access level] [google.identity.accesscontextmanager.v1.AccessLevel] propagate to long-lasting storage. If [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contain errors, an error response is returned for the first error encountered.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateAccessLevelAsync(UpdateAccessLevelRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateAccessLevelAsync(AccessLevel accessLevel, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateAccessLevelOperationCallable()
 *           <li><p> updateAccessLevelCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteAccessLevel</td>
 *      <td><p> Deletes an [access level] [google.identity.accesscontextmanager.v1.AccessLevel] based on the resource name. The long-running operation from this RPC has a successful status after the [access level] [google.identity.accesscontextmanager.v1.AccessLevel] has been removed from long-lasting storage.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteAccessLevelAsync(DeleteAccessLevelRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteAccessLevelAsync(AccessLevelName name)
 *           <li><p> deleteAccessLevelAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteAccessLevelOperationCallable()
 *           <li><p> deleteAccessLevelCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ReplaceAccessLevels</td>
 *      <td><p> Replaces all existing [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] in an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] with the [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] provided. This is done atomically. The long-running operation from this RPC has a successful status after all replacements propagate to long-lasting storage. If the replacement contains errors, an error response is returned for the first error encountered.  Upon error, the replacement is cancelled, and existing [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] are not affected. The Operation.response field contains ReplaceAccessLevelsResponse. Removing [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contained in existing [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] result in an error.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> replaceAccessLevelsAsync(ReplaceAccessLevelsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> replaceAccessLevelsOperationCallable()
 *           <li><p> replaceAccessLevelsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListServicePerimeters</td>
 *      <td><p> Lists all [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] for an access policy.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listServicePerimeters(ListServicePerimetersRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listServicePerimeters(AccessPolicyName parent)
 *           <li><p> listServicePerimeters(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listServicePerimetersPagedCallable()
 *           <li><p> listServicePerimetersCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetServicePerimeter</td>
 *      <td><p> Gets a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] based on the resource name.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getServicePerimeter(GetServicePerimeterRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getServicePerimeter(ServicePerimeterName name)
 *           <li><p> getServicePerimeter(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getServicePerimeterCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateServicePerimeter</td>
 *      <td><p> Creates a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter]. The long-running operation from this RPC has a successful status after the [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] propagates to long-lasting storage. If a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] contains errors, an error response is returned for the first error encountered.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createServicePerimeterAsync(CreateServicePerimeterRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createServicePerimeterAsync(AccessPolicyName parent, ServicePerimeter servicePerimeter)
 *           <li><p> createServicePerimeterAsync(String parent, ServicePerimeter servicePerimeter)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createServicePerimeterOperationCallable()
 *           <li><p> createServicePerimeterCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateServicePerimeter</td>
 *      <td><p> Updates a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter]. The long-running operation from this RPC has a successful status after the [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] propagates to long-lasting storage. If a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] contains errors, an error response is returned for the first error encountered.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateServicePerimeterAsync(UpdateServicePerimeterRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateServicePerimeterAsync(ServicePerimeter servicePerimeter, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateServicePerimeterOperationCallable()
 *           <li><p> updateServicePerimeterCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteServicePerimeter</td>
 *      <td><p> Deletes a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] based on the resource name. The long-running operation from this RPC has a successful status after the [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] is removed from long-lasting storage.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteServicePerimeterAsync(DeleteServicePerimeterRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteServicePerimeterAsync(ServicePerimeterName name)
 *           <li><p> deleteServicePerimeterAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteServicePerimeterOperationCallable()
 *           <li><p> deleteServicePerimeterCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ReplaceServicePerimeters</td>
 *      <td><p> Replace all existing [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] in an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] with the [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] provided. This is done atomically. The long-running operation from this RPC has a successful status after all replacements propagate to long-lasting storage. Replacements containing errors result in an error response for the first error encountered. Upon an error, replacement are cancelled and existing [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] are not affected. The Operation.response field contains ReplaceServicePerimetersResponse.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> replaceServicePerimetersAsync(ReplaceServicePerimetersRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> replaceServicePerimetersOperationCallable()
 *           <li><p> replaceServicePerimetersCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CommitServicePerimeters</td>
 *      <td><p> Commits the dry-run specification for all the [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] in an [access policy][google.identity.accesscontextmanager.v1.AccessPolicy]. A commit operation on a service perimeter involves copying its `spec` field to the `status` field of the service perimeter. Only [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] with `use_explicit_dry_run_spec` field set to true are affected by a commit operation. The long-running operation from this RPC has a successful status after the dry-run specifications for all the [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] have been committed. If a commit fails, it causes the long-running operation to return an error response and the entire commit operation is cancelled. When successful, the Operation.response field contains CommitServicePerimetersResponse. The `dry_run` and the `spec` fields are cleared after a successful commit operation.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> commitServicePerimetersAsync(CommitServicePerimetersRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> commitServicePerimetersOperationCallable()
 *           <li><p> commitServicePerimetersCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListGcpUserAccessBindings</td>
 *      <td><p> Lists all [GcpUserAccessBindings] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding] for a Google Cloud organization.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listGcpUserAccessBindings(ListGcpUserAccessBindingsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listGcpUserAccessBindings(OrganizationName parent)
 *           <li><p> listGcpUserAccessBindings(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listGcpUserAccessBindingsPagedCallable()
 *           <li><p> listGcpUserAccessBindingsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetGcpUserAccessBinding</td>
 *      <td><p> Gets the [GcpUserAccessBinding] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding] with the given name.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getGcpUserAccessBinding(GetGcpUserAccessBindingRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getGcpUserAccessBinding(GcpUserAccessBindingName name)
 *           <li><p> getGcpUserAccessBinding(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getGcpUserAccessBindingCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateGcpUserAccessBinding</td>
 *      <td><p> Creates a [GcpUserAccessBinding] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. If the client specifies a [name] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.name], the server ignores it. Fails if a resource already exists with the same [group_key] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.group_key]. Completion of this long-running operation does not necessarily signify that the new binding is deployed onto all affected users, which may take more time.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createGcpUserAccessBindingAsync(CreateGcpUserAccessBindingRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createGcpUserAccessBindingAsync(OrganizationName parent, GcpUserAccessBinding gcpUserAccessBinding)
 *           <li><p> createGcpUserAccessBindingAsync(String parent, GcpUserAccessBinding gcpUserAccessBinding)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createGcpUserAccessBindingOperationCallable()
 *           <li><p> createGcpUserAccessBindingCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateGcpUserAccessBinding</td>
 *      <td><p> Updates a [GcpUserAccessBinding] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. Completion of this long-running operation does not necessarily signify that the changed binding is deployed onto all affected users, which may take more time.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateGcpUserAccessBindingAsync(UpdateGcpUserAccessBindingRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateGcpUserAccessBindingAsync(GcpUserAccessBinding gcpUserAccessBinding, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateGcpUserAccessBindingOperationCallable()
 *           <li><p> updateGcpUserAccessBindingCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteGcpUserAccessBinding</td>
 *      <td><p> Deletes a [GcpUserAccessBinding] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. Completion of this long-running operation does not necessarily signify that the binding deletion is deployed onto all affected users, which may take more time.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteGcpUserAccessBindingAsync(DeleteGcpUserAccessBindingRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteGcpUserAccessBindingAsync(GcpUserAccessBindingName name)
 *           <li><p> deleteGcpUserAccessBindingAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteGcpUserAccessBindingOperationCallable()
 *           <li><p> deleteGcpUserAccessBindingCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SetIamPolicy</td>
 *      <td><p> Sets the IAM policy for the specified Access Context Manager [access policy][google.identity.accesscontextmanager.v1.AccessPolicy]. This method replaces the existing IAM policy on the access policy. The IAM policy controls the set of users who can perform specific operations on the Access Context Manager [access policy][google.identity.accesscontextmanager.v1.AccessPolicy].</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> setIamPolicy(SetIamPolicyRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> setIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetIamPolicy</td>
 *      <td><p> Gets the IAM policy for the specified Access Context Manager [access policy][google.identity.accesscontextmanager.v1.AccessPolicy].</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getIamPolicy(GetIamPolicyRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> TestIamPermissions</td>
 *      <td><p> Returns the IAM permissions that the caller has on the specified Access Context Manager resource. The resource can be an [AccessPolicy][google.identity.accesscontextmanager.v1.AccessPolicy], [AccessLevel][google.identity.accesscontextmanager.v1.AccessLevel], or [ServicePerimeter][google.identity.accesscontextmanager.v1.ServicePerimeter ]. This method does not support other resources.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> testIamPermissions(TestIamPermissionsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> testIamPermissionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of AccessContextManagerSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AccessContextManagerSettings accessContextManagerSettings =
 *     AccessContextManagerSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AccessContextManagerClient accessContextManagerClient =
 *     AccessContextManagerClient.create(accessContextManagerSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AccessContextManagerSettings accessContextManagerSettings =
 *     AccessContextManagerSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AccessContextManagerClient accessContextManagerClient =
 *     AccessContextManagerClient.create(accessContextManagerSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AccessContextManagerSettings accessContextManagerSettings =
 *     AccessContextManagerSettings.newHttpJsonBuilder().build();
 * AccessContextManagerClient accessContextManagerClient =
 *     AccessContextManagerClient.create(accessContextManagerSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AccessContextManagerClient implements BackgroundResource {
  private final AccessContextManagerSettings settings;
  private final AccessContextManagerStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of AccessContextManagerClient with default settings. */
  public static final AccessContextManagerClient create() throws IOException {
    return create(AccessContextManagerSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AccessContextManagerClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AccessContextManagerClient create(AccessContextManagerSettings settings)
      throws IOException {
    return new AccessContextManagerClient(settings);
  }

  /**
   * Constructs an instance of AccessContextManagerClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(AccessContextManagerSettings).
   */
  public static final AccessContextManagerClient create(AccessContextManagerStub stub) {
    return new AccessContextManagerClient(stub);
  }

  /**
   * Constructs an instance of AccessContextManagerClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AccessContextManagerClient(AccessContextManagerSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AccessContextManagerStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected AccessContextManagerClient(AccessContextManagerStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final AccessContextManagerSettings getSettings() {
    return settings;
  }

  public AccessContextManagerStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final com.google.longrunning.OperationsClient getOperationsClient() {
    return operationsClient;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi
  public final OperationsClient getHttpJsonOperationsClient() {
    return httpJsonOperationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [access policies] [google.identity.accesscontextmanager.v1.AccessPolicy] in an
   * organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListAccessPoliciesRequest request =
   *       ListAccessPoliciesRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (AccessPolicy element :
   *       accessContextManagerClient.listAccessPolicies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAccessPoliciesPagedResponse listAccessPolicies(
      ListAccessPoliciesRequest request) {
    return listAccessPoliciesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [access policies] [google.identity.accesscontextmanager.v1.AccessPolicy] in an
   * organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListAccessPoliciesRequest request =
   *       ListAccessPoliciesRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<AccessPolicy> future =
   *       accessContextManagerClient.listAccessPoliciesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (AccessPolicy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAccessPoliciesRequest, ListAccessPoliciesPagedResponse>
      listAccessPoliciesPagedCallable() {
    return stub.listAccessPoliciesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [access policies] [google.identity.accesscontextmanager.v1.AccessPolicy] in an
   * organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListAccessPoliciesRequest request =
   *       ListAccessPoliciesRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListAccessPoliciesResponse response =
   *         accessContextManagerClient.listAccessPoliciesCallable().call(request);
   *     for (AccessPolicy element : response.getAccessPoliciesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAccessPoliciesRequest, ListAccessPoliciesResponse>
      listAccessPoliciesCallable() {
    return stub.listAccessPoliciesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] based on the
   * name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessPolicyName name = AccessPolicyName.of("[ACCESS_POLICY]");
   *   AccessPolicy response = accessContextManagerClient.getAccessPolicy(name);
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the access policy to get.
   *     <p>Format `accessPolicies/{policy_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccessPolicy getAccessPolicy(AccessPolicyName name) {
    GetAccessPolicyRequest request =
        GetAccessPolicyRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getAccessPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] based on the
   * name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String name = AccessPolicyName.of("[ACCESS_POLICY]").toString();
   *   AccessPolicy response = accessContextManagerClient.getAccessPolicy(name);
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the access policy to get.
   *     <p>Format `accessPolicies/{policy_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccessPolicy getAccessPolicy(String name) {
    GetAccessPolicyRequest request = GetAccessPolicyRequest.newBuilder().setName(name).build();
    return getAccessPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] based on the
   * name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GetAccessPolicyRequest request =
   *       GetAccessPolicyRequest.newBuilder()
   *           .setName(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .build();
   *   AccessPolicy response = accessContextManagerClient.getAccessPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccessPolicy getAccessPolicy(GetAccessPolicyRequest request) {
    return getAccessPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] based on the
   * name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GetAccessPolicyRequest request =
   *       GetAccessPolicyRequest.newBuilder()
   *           .setName(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .build();
   *   ApiFuture<AccessPolicy> future =
   *       accessContextManagerClient.getAccessPolicyCallable().futureCall(request);
   *   // Do something.
   *   AccessPolicy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetAccessPolicyRequest, AccessPolicy> getAccessPolicyCallable() {
    return stub.getAccessPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an access policy. This method fails if the organization already has an access policy.
   * The long-running operation has a successful status after the access policy propagates to
   * long-lasting storage. Syntactic and basic semantic errors are returned in `metadata` as a
   * BadRequest proto.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessPolicy request =
   *       AccessPolicy.newBuilder()
   *           .setName(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setParent("parent-995424086")
   *           .setTitle("title110371416")
   *           .addAllScopes(new ArrayList<String>())
   *           .setCreateTime(Timestamp.newBuilder().build())
   *           .setUpdateTime(Timestamp.newBuilder().build())
   *           .setEtag("etag3123477")
   *           .build();
   *   AccessPolicy response = accessContextManagerClient.createAccessPolicyAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AccessPolicy, AccessContextManagerOperationMetadata>
      createAccessPolicyAsync(AccessPolicy request) {
    return createAccessPolicyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an access policy. This method fails if the organization already has an access policy.
   * The long-running operation has a successful status after the access policy propagates to
   * long-lasting storage. Syntactic and basic semantic errors are returned in `metadata` as a
   * BadRequest proto.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessPolicy request =
   *       AccessPolicy.newBuilder()
   *           .setName(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setParent("parent-995424086")
   *           .setTitle("title110371416")
   *           .addAllScopes(new ArrayList<String>())
   *           .setCreateTime(Timestamp.newBuilder().build())
   *           .setUpdateTime(Timestamp.newBuilder().build())
   *           .setEtag("etag3123477")
   *           .build();
   *   OperationFuture<AccessPolicy, AccessContextManagerOperationMetadata> future =
   *       accessContextManagerClient.createAccessPolicyOperationCallable().futureCall(request);
   *   // Do something.
   *   AccessPolicy response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<AccessPolicy, AccessPolicy, AccessContextManagerOperationMetadata>
      createAccessPolicyOperationCallable() {
    return stub.createAccessPolicyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an access policy. This method fails if the organization already has an access policy.
   * The long-running operation has a successful status after the access policy propagates to
   * long-lasting storage. Syntactic and basic semantic errors are returned in `metadata` as a
   * BadRequest proto.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessPolicy request =
   *       AccessPolicy.newBuilder()
   *           .setName(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setParent("parent-995424086")
   *           .setTitle("title110371416")
   *           .addAllScopes(new ArrayList<String>())
   *           .setCreateTime(Timestamp.newBuilder().build())
   *           .setUpdateTime(Timestamp.newBuilder().build())
   *           .setEtag("etag3123477")
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.createAccessPolicyCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<AccessPolicy, Operation> createAccessPolicyCallable() {
    return stub.createAccessPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy]. The
   * long-running operation from this RPC has a successful status after the changes to the [access
   * policy] [google.identity.accesscontextmanager.v1.AccessPolicy] propagate to long-lasting
   * storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessPolicy policy = AccessPolicy.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   AccessPolicy response =
   *       accessContextManagerClient.updateAccessPolicyAsync(policy, updateMask).get();
   * }
   * }</pre>
   *
   * @param policy Required. The updated AccessPolicy.
   * @param updateMask Required. Mask to control which fields get updated. Must be non-empty.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AccessPolicy, AccessContextManagerOperationMetadata>
      updateAccessPolicyAsync(AccessPolicy policy, FieldMask updateMask) {
    UpdateAccessPolicyRequest request =
        UpdateAccessPolicyRequest.newBuilder().setPolicy(policy).setUpdateMask(updateMask).build();
    return updateAccessPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy]. The
   * long-running operation from this RPC has a successful status after the changes to the [access
   * policy] [google.identity.accesscontextmanager.v1.AccessPolicy] propagate to long-lasting
   * storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateAccessPolicyRequest request =
   *       UpdateAccessPolicyRequest.newBuilder()
   *           .setPolicy(AccessPolicy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   AccessPolicy response = accessContextManagerClient.updateAccessPolicyAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AccessPolicy, AccessContextManagerOperationMetadata>
      updateAccessPolicyAsync(UpdateAccessPolicyRequest request) {
    return updateAccessPolicyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy]. The
   * long-running operation from this RPC has a successful status after the changes to the [access
   * policy] [google.identity.accesscontextmanager.v1.AccessPolicy] propagate to long-lasting
   * storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateAccessPolicyRequest request =
   *       UpdateAccessPolicyRequest.newBuilder()
   *           .setPolicy(AccessPolicy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OperationFuture<AccessPolicy, AccessContextManagerOperationMetadata> future =
   *       accessContextManagerClient.updateAccessPolicyOperationCallable().futureCall(request);
   *   // Do something.
   *   AccessPolicy response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateAccessPolicyRequest, AccessPolicy, AccessContextManagerOperationMetadata>
      updateAccessPolicyOperationCallable() {
    return stub.updateAccessPolicyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy]. The
   * long-running operation from this RPC has a successful status after the changes to the [access
   * policy] [google.identity.accesscontextmanager.v1.AccessPolicy] propagate to long-lasting
   * storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateAccessPolicyRequest request =
   *       UpdateAccessPolicyRequest.newBuilder()
   *           .setPolicy(AccessPolicy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.updateAccessPolicyCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateAccessPolicyRequest, Operation> updateAccessPolicyCallable() {
    return stub.updateAccessPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] based on the
   * resource name. The long-running operation has a successful status after the [access policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] is removed from long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessPolicyName name = AccessPolicyName.of("[ACCESS_POLICY]");
   *   accessContextManagerClient.deleteAccessPolicyAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the access policy to delete.
   *     <p>Format `accessPolicies/{policy_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, AccessContextManagerOperationMetadata>
      deleteAccessPolicyAsync(AccessPolicyName name) {
    DeleteAccessPolicyRequest request =
        DeleteAccessPolicyRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteAccessPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] based on the
   * resource name. The long-running operation has a successful status after the [access policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] is removed from long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String name = AccessPolicyName.of("[ACCESS_POLICY]").toString();
   *   accessContextManagerClient.deleteAccessPolicyAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the access policy to delete.
   *     <p>Format `accessPolicies/{policy_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, AccessContextManagerOperationMetadata>
      deleteAccessPolicyAsync(String name) {
    DeleteAccessPolicyRequest request =
        DeleteAccessPolicyRequest.newBuilder().setName(name).build();
    return deleteAccessPolicyAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] based on the
   * resource name. The long-running operation has a successful status after the [access policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] is removed from long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteAccessPolicyRequest request =
   *       DeleteAccessPolicyRequest.newBuilder()
   *           .setName(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .build();
   *   accessContextManagerClient.deleteAccessPolicyAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, AccessContextManagerOperationMetadata>
      deleteAccessPolicyAsync(DeleteAccessPolicyRequest request) {
    return deleteAccessPolicyOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] based on the
   * resource name. The long-running operation has a successful status after the [access policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] is removed from long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteAccessPolicyRequest request =
   *       DeleteAccessPolicyRequest.newBuilder()
   *           .setName(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .build();
   *   OperationFuture<Empty, AccessContextManagerOperationMetadata> future =
   *       accessContextManagerClient.deleteAccessPolicyOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          DeleteAccessPolicyRequest, Empty, AccessContextManagerOperationMetadata>
      deleteAccessPolicyOperationCallable() {
    return stub.deleteAccessPolicyOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] based on the
   * resource name. The long-running operation has a successful status after the [access policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] is removed from long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteAccessPolicyRequest request =
   *       DeleteAccessPolicyRequest.newBuilder()
   *           .setName(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.deleteAccessPolicyCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteAccessPolicyRequest, Operation> deleteAccessPolicyCallable() {
    return stub.deleteAccessPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] for an access
   * policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessPolicyName parent = AccessPolicyName.of("[ACCESS_POLICY]");
   *   for (AccessLevel element : accessContextManagerClient.listAccessLevels(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Resource name for the access policy to list [Access Levels]
   *     [google.identity.accesscontextmanager.v1.AccessLevel] from.
   *     <p>Format: `accessPolicies/{policy_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAccessLevelsPagedResponse listAccessLevels(AccessPolicyName parent) {
    ListAccessLevelsRequest request =
        ListAccessLevelsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listAccessLevels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] for an access
   * policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String parent = AccessPolicyName.of("[ACCESS_POLICY]").toString();
   *   for (AccessLevel element : accessContextManagerClient.listAccessLevels(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Resource name for the access policy to list [Access Levels]
   *     [google.identity.accesscontextmanager.v1.AccessLevel] from.
   *     <p>Format: `accessPolicies/{policy_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAccessLevelsPagedResponse listAccessLevels(String parent) {
    ListAccessLevelsRequest request =
        ListAccessLevelsRequest.newBuilder().setParent(parent).build();
    return listAccessLevels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] for an access
   * policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListAccessLevelsRequest request =
   *       ListAccessLevelsRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setAccessLevelFormat(LevelFormat.forNumber(0))
   *           .build();
   *   for (AccessLevel element :
   *       accessContextManagerClient.listAccessLevels(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAccessLevelsPagedResponse listAccessLevels(ListAccessLevelsRequest request) {
    return listAccessLevelsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] for an access
   * policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListAccessLevelsRequest request =
   *       ListAccessLevelsRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setAccessLevelFormat(LevelFormat.forNumber(0))
   *           .build();
   *   ApiFuture<AccessLevel> future =
   *       accessContextManagerClient.listAccessLevelsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (AccessLevel element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAccessLevelsRequest, ListAccessLevelsPagedResponse>
      listAccessLevelsPagedCallable() {
    return stub.listAccessLevelsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] for an access
   * policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListAccessLevelsRequest request =
   *       ListAccessLevelsRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setAccessLevelFormat(LevelFormat.forNumber(0))
   *           .build();
   *   while (true) {
   *     ListAccessLevelsResponse response =
   *         accessContextManagerClient.listAccessLevelsCallable().call(request);
   *     for (AccessLevel element : response.getAccessLevelsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAccessLevelsRequest, ListAccessLevelsResponse>
      listAccessLevelsCallable() {
    return stub.listAccessLevelsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets an [access level] [google.identity.accesscontextmanager.v1.AccessLevel] based on the
   * resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessLevelName name = AccessLevelName.of("[ACCESS_POLICY]", "[ACCESS_LEVEL]");
   *   AccessLevel response = accessContextManagerClient.getAccessLevel(name);
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the [Access Level]
   *     [google.identity.accesscontextmanager.v1.AccessLevel].
   *     <p>Format: `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccessLevel getAccessLevel(AccessLevelName name) {
    GetAccessLevelRequest request =
        GetAccessLevelRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getAccessLevel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets an [access level] [google.identity.accesscontextmanager.v1.AccessLevel] based on the
   * resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String name = AccessLevelName.of("[ACCESS_POLICY]", "[ACCESS_LEVEL]").toString();
   *   AccessLevel response = accessContextManagerClient.getAccessLevel(name);
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the [Access Level]
   *     [google.identity.accesscontextmanager.v1.AccessLevel].
   *     <p>Format: `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccessLevel getAccessLevel(String name) {
    GetAccessLevelRequest request = GetAccessLevelRequest.newBuilder().setName(name).build();
    return getAccessLevel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets an [access level] [google.identity.accesscontextmanager.v1.AccessLevel] based on the
   * resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GetAccessLevelRequest request =
   *       GetAccessLevelRequest.newBuilder()
   *           .setName(AccessLevelName.of("[ACCESS_POLICY]", "[ACCESS_LEVEL]").toString())
   *           .setAccessLevelFormat(LevelFormat.forNumber(0))
   *           .build();
   *   AccessLevel response = accessContextManagerClient.getAccessLevel(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccessLevel getAccessLevel(GetAccessLevelRequest request) {
    return getAccessLevelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets an [access level] [google.identity.accesscontextmanager.v1.AccessLevel] based on the
   * resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GetAccessLevelRequest request =
   *       GetAccessLevelRequest.newBuilder()
   *           .setName(AccessLevelName.of("[ACCESS_POLICY]", "[ACCESS_LEVEL]").toString())
   *           .setAccessLevelFormat(LevelFormat.forNumber(0))
   *           .build();
   *   ApiFuture<AccessLevel> future =
   *       accessContextManagerClient.getAccessLevelCallable().futureCall(request);
   *   // Do something.
   *   AccessLevel response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetAccessLevelRequest, AccessLevel> getAccessLevelCallable() {
    return stub.getAccessLevelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an [access level] [google.identity.accesscontextmanager.v1.AccessLevel]. The
   * long-running operation from this RPC has a successful status after the [access level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] propagates to long-lasting storage. If
   * [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contain errors, an error
   * response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessPolicyName parent = AccessPolicyName.of("[ACCESS_POLICY]");
   *   AccessLevel accessLevel = AccessLevel.newBuilder().build();
   *   AccessLevel response =
   *       accessContextManagerClient.createAccessLevelAsync(parent, accessLevel).get();
   * }
   * }</pre>
   *
   * @param parent Required. Resource name for the access policy which owns this [Access Level]
   *     [google.identity.accesscontextmanager.v1.AccessLevel].
   *     <p>Format: `accessPolicies/{policy_id}`
   * @param accessLevel Required. The [Access Level]
   *     [google.identity.accesscontextmanager.v1.AccessLevel] to create. Syntactic correctness of
   *     the [Access Level] [google.identity.accesscontextmanager.v1.AccessLevel] is a precondition
   *     for creation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AccessLevel, AccessContextManagerOperationMetadata>
      createAccessLevelAsync(AccessPolicyName parent, AccessLevel accessLevel) {
    CreateAccessLevelRequest request =
        CreateAccessLevelRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setAccessLevel(accessLevel)
            .build();
    return createAccessLevelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an [access level] [google.identity.accesscontextmanager.v1.AccessLevel]. The
   * long-running operation from this RPC has a successful status after the [access level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] propagates to long-lasting storage. If
   * [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contain errors, an error
   * response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String parent = AccessPolicyName.of("[ACCESS_POLICY]").toString();
   *   AccessLevel accessLevel = AccessLevel.newBuilder().build();
   *   AccessLevel response =
   *       accessContextManagerClient.createAccessLevelAsync(parent, accessLevel).get();
   * }
   * }</pre>
   *
   * @param parent Required. Resource name for the access policy which owns this [Access Level]
   *     [google.identity.accesscontextmanager.v1.AccessLevel].
   *     <p>Format: `accessPolicies/{policy_id}`
   * @param accessLevel Required. The [Access Level]
   *     [google.identity.accesscontextmanager.v1.AccessLevel] to create. Syntactic correctness of
   *     the [Access Level] [google.identity.accesscontextmanager.v1.AccessLevel] is a precondition
   *     for creation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AccessLevel, AccessContextManagerOperationMetadata>
      createAccessLevelAsync(String parent, AccessLevel accessLevel) {
    CreateAccessLevelRequest request =
        CreateAccessLevelRequest.newBuilder().setParent(parent).setAccessLevel(accessLevel).build();
    return createAccessLevelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an [access level] [google.identity.accesscontextmanager.v1.AccessLevel]. The
   * long-running operation from this RPC has a successful status after the [access level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] propagates to long-lasting storage. If
   * [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contain errors, an error
   * response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CreateAccessLevelRequest request =
   *       CreateAccessLevelRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setAccessLevel(AccessLevel.newBuilder().build())
   *           .build();
   *   AccessLevel response = accessContextManagerClient.createAccessLevelAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AccessLevel, AccessContextManagerOperationMetadata>
      createAccessLevelAsync(CreateAccessLevelRequest request) {
    return createAccessLevelOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an [access level] [google.identity.accesscontextmanager.v1.AccessLevel]. The
   * long-running operation from this RPC has a successful status after the [access level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] propagates to long-lasting storage. If
   * [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contain errors, an error
   * response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CreateAccessLevelRequest request =
   *       CreateAccessLevelRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setAccessLevel(AccessLevel.newBuilder().build())
   *           .build();
   *   OperationFuture<AccessLevel, AccessContextManagerOperationMetadata> future =
   *       accessContextManagerClient.createAccessLevelOperationCallable().futureCall(request);
   *   // Do something.
   *   AccessLevel response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateAccessLevelRequest, AccessLevel, AccessContextManagerOperationMetadata>
      createAccessLevelOperationCallable() {
    return stub.createAccessLevelOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an [access level] [google.identity.accesscontextmanager.v1.AccessLevel]. The
   * long-running operation from this RPC has a successful status after the [access level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] propagates to long-lasting storage. If
   * [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contain errors, an error
   * response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CreateAccessLevelRequest request =
   *       CreateAccessLevelRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setAccessLevel(AccessLevel.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.createAccessLevelCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateAccessLevelRequest, Operation> createAccessLevelCallable() {
    return stub.createAccessLevelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an [access level] [google.identity.accesscontextmanager.v1.AccessLevel]. The
   * long-running operation from this RPC has a successful status after the changes to the [access
   * level] [google.identity.accesscontextmanager.v1.AccessLevel] propagate to long-lasting storage.
   * If [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contain errors, an
   * error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessLevel accessLevel = AccessLevel.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   AccessLevel response =
   *       accessContextManagerClient.updateAccessLevelAsync(accessLevel, updateMask).get();
   * }
   * }</pre>
   *
   * @param accessLevel Required. The updated [Access Level]
   *     [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic correctness of the [Access
   *     Level] [google.identity.accesscontextmanager.v1.AccessLevel] is a precondition for
   *     creation.
   * @param updateMask Required. Mask to control which fields get updated. Must be non-empty.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AccessLevel, AccessContextManagerOperationMetadata>
      updateAccessLevelAsync(AccessLevel accessLevel, FieldMask updateMask) {
    UpdateAccessLevelRequest request =
        UpdateAccessLevelRequest.newBuilder()
            .setAccessLevel(accessLevel)
            .setUpdateMask(updateMask)
            .build();
    return updateAccessLevelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an [access level] [google.identity.accesscontextmanager.v1.AccessLevel]. The
   * long-running operation from this RPC has a successful status after the changes to the [access
   * level] [google.identity.accesscontextmanager.v1.AccessLevel] propagate to long-lasting storage.
   * If [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contain errors, an
   * error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateAccessLevelRequest request =
   *       UpdateAccessLevelRequest.newBuilder()
   *           .setAccessLevel(AccessLevel.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   AccessLevel response = accessContextManagerClient.updateAccessLevelAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AccessLevel, AccessContextManagerOperationMetadata>
      updateAccessLevelAsync(UpdateAccessLevelRequest request) {
    return updateAccessLevelOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an [access level] [google.identity.accesscontextmanager.v1.AccessLevel]. The
   * long-running operation from this RPC has a successful status after the changes to the [access
   * level] [google.identity.accesscontextmanager.v1.AccessLevel] propagate to long-lasting storage.
   * If [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contain errors, an
   * error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateAccessLevelRequest request =
   *       UpdateAccessLevelRequest.newBuilder()
   *           .setAccessLevel(AccessLevel.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OperationFuture<AccessLevel, AccessContextManagerOperationMetadata> future =
   *       accessContextManagerClient.updateAccessLevelOperationCallable().futureCall(request);
   *   // Do something.
   *   AccessLevel response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateAccessLevelRequest, AccessLevel, AccessContextManagerOperationMetadata>
      updateAccessLevelOperationCallable() {
    return stub.updateAccessLevelOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an [access level] [google.identity.accesscontextmanager.v1.AccessLevel]. The
   * long-running operation from this RPC has a successful status after the changes to the [access
   * level] [google.identity.accesscontextmanager.v1.AccessLevel] propagate to long-lasting storage.
   * If [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] contain errors, an
   * error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateAccessLevelRequest request =
   *       UpdateAccessLevelRequest.newBuilder()
   *           .setAccessLevel(AccessLevel.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.updateAccessLevelCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateAccessLevelRequest, Operation> updateAccessLevelCallable() {
    return stub.updateAccessLevelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an [access level] [google.identity.accesscontextmanager.v1.AccessLevel] based on the
   * resource name. The long-running operation from this RPC has a successful status after the
   * [access level] [google.identity.accesscontextmanager.v1.AccessLevel] has been removed from
   * long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessLevelName name = AccessLevelName.of("[ACCESS_POLICY]", "[ACCESS_LEVEL]");
   *   accessContextManagerClient.deleteAccessLevelAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the [Access Level]
   *     [google.identity.accesscontextmanager.v1.AccessLevel].
   *     <p>Format: `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, AccessContextManagerOperationMetadata> deleteAccessLevelAsync(
      AccessLevelName name) {
    DeleteAccessLevelRequest request =
        DeleteAccessLevelRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteAccessLevelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an [access level] [google.identity.accesscontextmanager.v1.AccessLevel] based on the
   * resource name. The long-running operation from this RPC has a successful status after the
   * [access level] [google.identity.accesscontextmanager.v1.AccessLevel] has been removed from
   * long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String name = AccessLevelName.of("[ACCESS_POLICY]", "[ACCESS_LEVEL]").toString();
   *   accessContextManagerClient.deleteAccessLevelAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the [Access Level]
   *     [google.identity.accesscontextmanager.v1.AccessLevel].
   *     <p>Format: `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, AccessContextManagerOperationMetadata> deleteAccessLevelAsync(
      String name) {
    DeleteAccessLevelRequest request = DeleteAccessLevelRequest.newBuilder().setName(name).build();
    return deleteAccessLevelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an [access level] [google.identity.accesscontextmanager.v1.AccessLevel] based on the
   * resource name. The long-running operation from this RPC has a successful status after the
   * [access level] [google.identity.accesscontextmanager.v1.AccessLevel] has been removed from
   * long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteAccessLevelRequest request =
   *       DeleteAccessLevelRequest.newBuilder()
   *           .setName(AccessLevelName.of("[ACCESS_POLICY]", "[ACCESS_LEVEL]").toString())
   *           .build();
   *   accessContextManagerClient.deleteAccessLevelAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, AccessContextManagerOperationMetadata> deleteAccessLevelAsync(
      DeleteAccessLevelRequest request) {
    return deleteAccessLevelOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an [access level] [google.identity.accesscontextmanager.v1.AccessLevel] based on the
   * resource name. The long-running operation from this RPC has a successful status after the
   * [access level] [google.identity.accesscontextmanager.v1.AccessLevel] has been removed from
   * long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteAccessLevelRequest request =
   *       DeleteAccessLevelRequest.newBuilder()
   *           .setName(AccessLevelName.of("[ACCESS_POLICY]", "[ACCESS_LEVEL]").toString())
   *           .build();
   *   OperationFuture<Empty, AccessContextManagerOperationMetadata> future =
   *       accessContextManagerClient.deleteAccessLevelOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          DeleteAccessLevelRequest, Empty, AccessContextManagerOperationMetadata>
      deleteAccessLevelOperationCallable() {
    return stub.deleteAccessLevelOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an [access level] [google.identity.accesscontextmanager.v1.AccessLevel] based on the
   * resource name. The long-running operation from this RPC has a successful status after the
   * [access level] [google.identity.accesscontextmanager.v1.AccessLevel] has been removed from
   * long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteAccessLevelRequest request =
   *       DeleteAccessLevelRequest.newBuilder()
   *           .setName(AccessLevelName.of("[ACCESS_POLICY]", "[ACCESS_LEVEL]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.deleteAccessLevelCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteAccessLevelRequest, Operation> deleteAccessLevelCallable() {
    return stub.deleteAccessLevelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Replaces all existing [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] in
   * an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] with the [access
   * levels] [google.identity.accesscontextmanager.v1.AccessLevel] provided. This is done
   * atomically. The long-running operation from this RPC has a successful status after all
   * replacements propagate to long-lasting storage. If the replacement contains errors, an error
   * response is returned for the first error encountered. Upon error, the replacement is cancelled,
   * and existing [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] are not
   * affected. The Operation.response field contains ReplaceAccessLevelsResponse. Removing [access
   * levels] [google.identity.accesscontextmanager.v1.AccessLevel] contained in existing [service
   * perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] result in an error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ReplaceAccessLevelsRequest request =
   *       ReplaceAccessLevelsRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .addAllAccessLevels(new ArrayList<AccessLevel>())
   *           .setEtag("etag3123477")
   *           .build();
   *   ReplaceAccessLevelsResponse response =
   *       accessContextManagerClient.replaceAccessLevelsAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ReplaceAccessLevelsResponse, AccessContextManagerOperationMetadata>
      replaceAccessLevelsAsync(ReplaceAccessLevelsRequest request) {
    return replaceAccessLevelsOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Replaces all existing [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] in
   * an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] with the [access
   * levels] [google.identity.accesscontextmanager.v1.AccessLevel] provided. This is done
   * atomically. The long-running operation from this RPC has a successful status after all
   * replacements propagate to long-lasting storage. If the replacement contains errors, an error
   * response is returned for the first error encountered. Upon error, the replacement is cancelled,
   * and existing [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] are not
   * affected. The Operation.response field contains ReplaceAccessLevelsResponse. Removing [access
   * levels] [google.identity.accesscontextmanager.v1.AccessLevel] contained in existing [service
   * perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] result in an error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ReplaceAccessLevelsRequest request =
   *       ReplaceAccessLevelsRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .addAllAccessLevels(new ArrayList<AccessLevel>())
   *           .setEtag("etag3123477")
   *           .build();
   *   OperationFuture<ReplaceAccessLevelsResponse, AccessContextManagerOperationMetadata> future =
   *       accessContextManagerClient.replaceAccessLevelsOperationCallable().futureCall(request);
   *   // Do something.
   *   ReplaceAccessLevelsResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          ReplaceAccessLevelsRequest,
          ReplaceAccessLevelsResponse,
          AccessContextManagerOperationMetadata>
      replaceAccessLevelsOperationCallable() {
    return stub.replaceAccessLevelsOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Replaces all existing [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] in
   * an [access policy] [google.identity.accesscontextmanager.v1.AccessPolicy] with the [access
   * levels] [google.identity.accesscontextmanager.v1.AccessLevel] provided. This is done
   * atomically. The long-running operation from this RPC has a successful status after all
   * replacements propagate to long-lasting storage. If the replacement contains errors, an error
   * response is returned for the first error encountered. Upon error, the replacement is cancelled,
   * and existing [access levels] [google.identity.accesscontextmanager.v1.AccessLevel] are not
   * affected. The Operation.response field contains ReplaceAccessLevelsResponse. Removing [access
   * levels] [google.identity.accesscontextmanager.v1.AccessLevel] contained in existing [service
   * perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] result in an error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ReplaceAccessLevelsRequest request =
   *       ReplaceAccessLevelsRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .addAllAccessLevels(new ArrayList<AccessLevel>())
   *           .setEtag("etag3123477")
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.replaceAccessLevelsCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ReplaceAccessLevelsRequest, Operation> replaceAccessLevelsCallable() {
    return stub.replaceAccessLevelsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] for
   * an access policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessPolicyName parent = AccessPolicyName.of("[ACCESS_POLICY]");
   *   for (ServicePerimeter element :
   *       accessContextManagerClient.listServicePerimeters(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Resource name for the access policy to list [Service Perimeters]
   *     [google.identity.accesscontextmanager.v1.ServicePerimeter] from.
   *     <p>Format: `accessPolicies/{policy_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServicePerimetersPagedResponse listServicePerimeters(AccessPolicyName parent) {
    ListServicePerimetersRequest request =
        ListServicePerimetersRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listServicePerimeters(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] for
   * an access policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String parent = AccessPolicyName.of("[ACCESS_POLICY]").toString();
   *   for (ServicePerimeter element :
   *       accessContextManagerClient.listServicePerimeters(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Resource name for the access policy to list [Service Perimeters]
   *     [google.identity.accesscontextmanager.v1.ServicePerimeter] from.
   *     <p>Format: `accessPolicies/{policy_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServicePerimetersPagedResponse listServicePerimeters(String parent) {
    ListServicePerimetersRequest request =
        ListServicePerimetersRequest.newBuilder().setParent(parent).build();
    return listServicePerimeters(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] for
   * an access policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListServicePerimetersRequest request =
   *       ListServicePerimetersRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (ServicePerimeter element :
   *       accessContextManagerClient.listServicePerimeters(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServicePerimetersPagedResponse listServicePerimeters(
      ListServicePerimetersRequest request) {
    return listServicePerimetersPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] for
   * an access policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListServicePerimetersRequest request =
   *       ListServicePerimetersRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<ServicePerimeter> future =
   *       accessContextManagerClient.listServicePerimetersPagedCallable().futureCall(request);
   *   // Do something.
   *   for (ServicePerimeter element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListServicePerimetersRequest, ListServicePerimetersPagedResponse>
      listServicePerimetersPagedCallable() {
    return stub.listServicePerimetersPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] for
   * an access policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListServicePerimetersRequest request =
   *       ListServicePerimetersRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListServicePerimetersResponse response =
   *         accessContextManagerClient.listServicePerimetersCallable().call(request);
   *     for (ServicePerimeter element : response.getServicePerimetersList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListServicePerimetersRequest, ListServicePerimetersResponse>
      listServicePerimetersCallable() {
    return stub.listServicePerimetersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] based on
   * the resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ServicePerimeterName name = ServicePerimeterName.of("[ACCESS_POLICY]", "[SERVICE_PERIMETER]");
   *   ServicePerimeter response = accessContextManagerClient.getServicePerimeter(name);
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the [Service Perimeter]
   *     [google.identity.accesscontextmanager.v1.ServicePerimeter].
   *     <p>Format: `accessPolicies/{policy_id}/servicePerimeters/{service_perimeters_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServicePerimeter getServicePerimeter(ServicePerimeterName name) {
    GetServicePerimeterRequest request =
        GetServicePerimeterRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getServicePerimeter(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] based on
   * the resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String name = ServicePerimeterName.of("[ACCESS_POLICY]", "[SERVICE_PERIMETER]").toString();
   *   ServicePerimeter response = accessContextManagerClient.getServicePerimeter(name);
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the [Service Perimeter]
   *     [google.identity.accesscontextmanager.v1.ServicePerimeter].
   *     <p>Format: `accessPolicies/{policy_id}/servicePerimeters/{service_perimeters_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServicePerimeter getServicePerimeter(String name) {
    GetServicePerimeterRequest request =
        GetServicePerimeterRequest.newBuilder().setName(name).build();
    return getServicePerimeter(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] based on
   * the resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GetServicePerimeterRequest request =
   *       GetServicePerimeterRequest.newBuilder()
   *           .setName(ServicePerimeterName.of("[ACCESS_POLICY]", "[SERVICE_PERIMETER]").toString())
   *           .build();
   *   ServicePerimeter response = accessContextManagerClient.getServicePerimeter(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServicePerimeter getServicePerimeter(GetServicePerimeterRequest request) {
    return getServicePerimeterCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] based on
   * the resource name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GetServicePerimeterRequest request =
   *       GetServicePerimeterRequest.newBuilder()
   *           .setName(ServicePerimeterName.of("[ACCESS_POLICY]", "[SERVICE_PERIMETER]").toString())
   *           .build();
   *   ApiFuture<ServicePerimeter> future =
   *       accessContextManagerClient.getServicePerimeterCallable().futureCall(request);
   *   // Do something.
   *   ServicePerimeter response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetServicePerimeterRequest, ServicePerimeter>
      getServicePerimeterCallable() {
    return stub.getServicePerimeterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter]. The
   * long-running operation from this RPC has a successful status after the [service perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] propagates to long-lasting storage.
   * If a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] contains
   * errors, an error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   AccessPolicyName parent = AccessPolicyName.of("[ACCESS_POLICY]");
   *   ServicePerimeter servicePerimeter = ServicePerimeter.newBuilder().build();
   *   ServicePerimeter response =
   *       accessContextManagerClient.createServicePerimeterAsync(parent, servicePerimeter).get();
   * }
   * }</pre>
   *
   * @param parent Required. Resource name for the access policy which owns this [Service Perimeter]
   *     [google.identity.accesscontextmanager.v1.ServicePerimeter].
   *     <p>Format: `accessPolicies/{policy_id}`
   * @param servicePerimeter Required. The [Service Perimeter]
   *     [google.identity.accesscontextmanager.v1.ServicePerimeter] to create. Syntactic correctness
   *     of the [Service Perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] is a
   *     precondition for creation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ServicePerimeter, AccessContextManagerOperationMetadata>
      createServicePerimeterAsync(AccessPolicyName parent, ServicePerimeter servicePerimeter) {
    CreateServicePerimeterRequest request =
        CreateServicePerimeterRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setServicePerimeter(servicePerimeter)
            .build();
    return createServicePerimeterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter]. The
   * long-running operation from this RPC has a successful status after the [service perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] propagates to long-lasting storage.
   * If a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] contains
   * errors, an error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String parent = AccessPolicyName.of("[ACCESS_POLICY]").toString();
   *   ServicePerimeter servicePerimeter = ServicePerimeter.newBuilder().build();
   *   ServicePerimeter response =
   *       accessContextManagerClient.createServicePerimeterAsync(parent, servicePerimeter).get();
   * }
   * }</pre>
   *
   * @param parent Required. Resource name for the access policy which owns this [Service Perimeter]
   *     [google.identity.accesscontextmanager.v1.ServicePerimeter].
   *     <p>Format: `accessPolicies/{policy_id}`
   * @param servicePerimeter Required. The [Service Perimeter]
   *     [google.identity.accesscontextmanager.v1.ServicePerimeter] to create. Syntactic correctness
   *     of the [Service Perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] is a
   *     precondition for creation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ServicePerimeter, AccessContextManagerOperationMetadata>
      createServicePerimeterAsync(String parent, ServicePerimeter servicePerimeter) {
    CreateServicePerimeterRequest request =
        CreateServicePerimeterRequest.newBuilder()
            .setParent(parent)
            .setServicePerimeter(servicePerimeter)
            .build();
    return createServicePerimeterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter]. The
   * long-running operation from this RPC has a successful status after the [service perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] propagates to long-lasting storage.
   * If a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] contains
   * errors, an error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CreateServicePerimeterRequest request =
   *       CreateServicePerimeterRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setServicePerimeter(ServicePerimeter.newBuilder().build())
   *           .build();
   *   ServicePerimeter response =
   *       accessContextManagerClient.createServicePerimeterAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ServicePerimeter, AccessContextManagerOperationMetadata>
      createServicePerimeterAsync(CreateServicePerimeterRequest request) {
    return createServicePerimeterOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter]. The
   * long-running operation from this RPC has a successful status after the [service perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] propagates to long-lasting storage.
   * If a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] contains
   * errors, an error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CreateServicePerimeterRequest request =
   *       CreateServicePerimeterRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setServicePerimeter(ServicePerimeter.newBuilder().build())
   *           .build();
   *   OperationFuture<ServicePerimeter, AccessContextManagerOperationMetadata> future =
   *       accessContextManagerClient.createServicePerimeterOperationCallable().futureCall(request);
   *   // Do something.
   *   ServicePerimeter response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateServicePerimeterRequest, ServicePerimeter, AccessContextManagerOperationMetadata>
      createServicePerimeterOperationCallable() {
    return stub.createServicePerimeterOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter]. The
   * long-running operation from this RPC has a successful status after the [service perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] propagates to long-lasting storage.
   * If a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] contains
   * errors, an error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CreateServicePerimeterRequest request =
   *       CreateServicePerimeterRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setServicePerimeter(ServicePerimeter.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.createServicePerimeterCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateServicePerimeterRequest, Operation>
      createServicePerimeterCallable() {
    return stub.createServicePerimeterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter]. The
   * long-running operation from this RPC has a successful status after the [service perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] propagates to long-lasting storage.
   * If a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] contains
   * errors, an error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ServicePerimeter servicePerimeter = ServicePerimeter.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   ServicePerimeter response =
   *       accessContextManagerClient
   *           .updateServicePerimeterAsync(servicePerimeter, updateMask)
   *           .get();
   * }
   * }</pre>
   *
   * @param servicePerimeter Required. The updated `ServicePerimeter`. Syntactic correctness of the
   *     `ServicePerimeter` is a precondition for creation.
   * @param updateMask Required. Mask to control which fields get updated. Must be non-empty.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ServicePerimeter, AccessContextManagerOperationMetadata>
      updateServicePerimeterAsync(ServicePerimeter servicePerimeter, FieldMask updateMask) {
    UpdateServicePerimeterRequest request =
        UpdateServicePerimeterRequest.newBuilder()
            .setServicePerimeter(servicePerimeter)
            .setUpdateMask(updateMask)
            .build();
    return updateServicePerimeterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter]. The
   * long-running operation from this RPC has a successful status after the [service perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] propagates to long-lasting storage.
   * If a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] contains
   * errors, an error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateServicePerimeterRequest request =
   *       UpdateServicePerimeterRequest.newBuilder()
   *           .setServicePerimeter(ServicePerimeter.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ServicePerimeter response =
   *       accessContextManagerClient.updateServicePerimeterAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ServicePerimeter, AccessContextManagerOperationMetadata>
      updateServicePerimeterAsync(UpdateServicePerimeterRequest request) {
    return updateServicePerimeterOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter]. The
   * long-running operation from this RPC has a successful status after the [service perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] propagates to long-lasting storage.
   * If a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] contains
   * errors, an error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateServicePerimeterRequest request =
   *       UpdateServicePerimeterRequest.newBuilder()
   *           .setServicePerimeter(ServicePerimeter.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OperationFuture<ServicePerimeter, AccessContextManagerOperationMetadata> future =
   *       accessContextManagerClient.updateServicePerimeterOperationCallable().futureCall(request);
   *   // Do something.
   *   ServicePerimeter response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateServicePerimeterRequest, ServicePerimeter, AccessContextManagerOperationMetadata>
      updateServicePerimeterOperationCallable() {
    return stub.updateServicePerimeterOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter]. The
   * long-running operation from this RPC has a successful status after the [service perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] propagates to long-lasting storage.
   * If a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] contains
   * errors, an error response is returned for the first error encountered.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateServicePerimeterRequest request =
   *       UpdateServicePerimeterRequest.newBuilder()
   *           .setServicePerimeter(ServicePerimeter.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.updateServicePerimeterCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateServicePerimeterRequest, Operation>
      updateServicePerimeterCallable() {
    return stub.updateServicePerimeterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] based
   * on the resource name. The long-running operation from this RPC has a successful status after
   * the [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] is removed
   * from long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ServicePerimeterName name = ServicePerimeterName.of("[ACCESS_POLICY]", "[SERVICE_PERIMETER]");
   *   accessContextManagerClient.deleteServicePerimeterAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the [Service Perimeter]
   *     [google.identity.accesscontextmanager.v1.ServicePerimeter].
   *     <p>Format: `accessPolicies/{policy_id}/servicePerimeters/{service_perimeter_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, AccessContextManagerOperationMetadata>
      deleteServicePerimeterAsync(ServicePerimeterName name) {
    DeleteServicePerimeterRequest request =
        DeleteServicePerimeterRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteServicePerimeterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] based
   * on the resource name. The long-running operation from this RPC has a successful status after
   * the [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] is removed
   * from long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String name = ServicePerimeterName.of("[ACCESS_POLICY]", "[SERVICE_PERIMETER]").toString();
   *   accessContextManagerClient.deleteServicePerimeterAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Resource name for the [Service Perimeter]
   *     [google.identity.accesscontextmanager.v1.ServicePerimeter].
   *     <p>Format: `accessPolicies/{policy_id}/servicePerimeters/{service_perimeter_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, AccessContextManagerOperationMetadata>
      deleteServicePerimeterAsync(String name) {
    DeleteServicePerimeterRequest request =
        DeleteServicePerimeterRequest.newBuilder().setName(name).build();
    return deleteServicePerimeterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] based
   * on the resource name. The long-running operation from this RPC has a successful status after
   * the [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] is removed
   * from long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteServicePerimeterRequest request =
   *       DeleteServicePerimeterRequest.newBuilder()
   *           .setName(ServicePerimeterName.of("[ACCESS_POLICY]", "[SERVICE_PERIMETER]").toString())
   *           .build();
   *   accessContextManagerClient.deleteServicePerimeterAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, AccessContextManagerOperationMetadata>
      deleteServicePerimeterAsync(DeleteServicePerimeterRequest request) {
    return deleteServicePerimeterOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] based
   * on the resource name. The long-running operation from this RPC has a successful status after
   * the [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] is removed
   * from long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteServicePerimeterRequest request =
   *       DeleteServicePerimeterRequest.newBuilder()
   *           .setName(ServicePerimeterName.of("[ACCESS_POLICY]", "[SERVICE_PERIMETER]").toString())
   *           .build();
   *   OperationFuture<Empty, AccessContextManagerOperationMetadata> future =
   *       accessContextManagerClient.deleteServicePerimeterOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          DeleteServicePerimeterRequest, Empty, AccessContextManagerOperationMetadata>
      deleteServicePerimeterOperationCallable() {
    return stub.deleteServicePerimeterOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] based
   * on the resource name. The long-running operation from this RPC has a successful status after
   * the [service perimeter] [google.identity.accesscontextmanager.v1.ServicePerimeter] is removed
   * from long-lasting storage.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteServicePerimeterRequest request =
   *       DeleteServicePerimeterRequest.newBuilder()
   *           .setName(ServicePerimeterName.of("[ACCESS_POLICY]", "[SERVICE_PERIMETER]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.deleteServicePerimeterCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteServicePerimeterRequest, Operation>
      deleteServicePerimeterCallable() {
    return stub.deleteServicePerimeterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Replace all existing [service perimeters]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] in an [access policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] with the [service perimeters]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] provided. This is done atomically.
   * The long-running operation from this RPC has a successful status after all replacements
   * propagate to long-lasting storage. Replacements containing errors result in an error response
   * for the first error encountered. Upon an error, replacement are cancelled and existing [service
   * perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] are not affected. The
   * Operation.response field contains ReplaceServicePerimetersResponse.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ReplaceServicePerimetersRequest request =
   *       ReplaceServicePerimetersRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .addAllServicePerimeters(new ArrayList<ServicePerimeter>())
   *           .setEtag("etag3123477")
   *           .build();
   *   ReplaceServicePerimetersResponse response =
   *       accessContextManagerClient.replaceServicePerimetersAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<
          ReplaceServicePerimetersResponse, AccessContextManagerOperationMetadata>
      replaceServicePerimetersAsync(ReplaceServicePerimetersRequest request) {
    return replaceServicePerimetersOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Replace all existing [service perimeters]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] in an [access policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] with the [service perimeters]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] provided. This is done atomically.
   * The long-running operation from this RPC has a successful status after all replacements
   * propagate to long-lasting storage. Replacements containing errors result in an error response
   * for the first error encountered. Upon an error, replacement are cancelled and existing [service
   * perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] are not affected. The
   * Operation.response field contains ReplaceServicePerimetersResponse.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ReplaceServicePerimetersRequest request =
   *       ReplaceServicePerimetersRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .addAllServicePerimeters(new ArrayList<ServicePerimeter>())
   *           .setEtag("etag3123477")
   *           .build();
   *   OperationFuture<ReplaceServicePerimetersResponse, AccessContextManagerOperationMetadata>
   *       future =
   *           accessContextManagerClient
   *               .replaceServicePerimetersOperationCallable()
   *               .futureCall(request);
   *   // Do something.
   *   ReplaceServicePerimetersResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          ReplaceServicePerimetersRequest,
          ReplaceServicePerimetersResponse,
          AccessContextManagerOperationMetadata>
      replaceServicePerimetersOperationCallable() {
    return stub.replaceServicePerimetersOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Replace all existing [service perimeters]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] in an [access policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] with the [service perimeters]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] provided. This is done atomically.
   * The long-running operation from this RPC has a successful status after all replacements
   * propagate to long-lasting storage. Replacements containing errors result in an error response
   * for the first error encountered. Upon an error, replacement are cancelled and existing [service
   * perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] are not affected. The
   * Operation.response field contains ReplaceServicePerimetersResponse.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ReplaceServicePerimetersRequest request =
   *       ReplaceServicePerimetersRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .addAllServicePerimeters(new ArrayList<ServicePerimeter>())
   *           .setEtag("etag3123477")
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.replaceServicePerimetersCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ReplaceServicePerimetersRequest, Operation>
      replaceServicePerimetersCallable() {
    return stub.replaceServicePerimetersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Commits the dry-run specification for all the [service perimeters]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] in an [access
   * policy][google.identity.accesscontextmanager.v1.AccessPolicy]. A commit operation on a service
   * perimeter involves copying its `spec` field to the `status` field of the service perimeter.
   * Only [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] with
   * `use_explicit_dry_run_spec` field set to true are affected by a commit operation. The
   * long-running operation from this RPC has a successful status after the dry-run specifications
   * for all the [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter]
   * have been committed. If a commit fails, it causes the long-running operation to return an error
   * response and the entire commit operation is cancelled. When successful, the Operation.response
   * field contains CommitServicePerimetersResponse. The `dry_run` and the `spec` fields are cleared
   * after a successful commit operation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CommitServicePerimetersRequest request =
   *       CommitServicePerimetersRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setEtag("etag3123477")
   *           .build();
   *   CommitServicePerimetersResponse response =
   *       accessContextManagerClient.commitServicePerimetersAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<
          CommitServicePerimetersResponse, AccessContextManagerOperationMetadata>
      commitServicePerimetersAsync(CommitServicePerimetersRequest request) {
    return commitServicePerimetersOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Commits the dry-run specification for all the [service perimeters]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] in an [access
   * policy][google.identity.accesscontextmanager.v1.AccessPolicy]. A commit operation on a service
   * perimeter involves copying its `spec` field to the `status` field of the service perimeter.
   * Only [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] with
   * `use_explicit_dry_run_spec` field set to true are affected by a commit operation. The
   * long-running operation from this RPC has a successful status after the dry-run specifications
   * for all the [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter]
   * have been committed. If a commit fails, it causes the long-running operation to return an error
   * response and the entire commit operation is cancelled. When successful, the Operation.response
   * field contains CommitServicePerimetersResponse. The `dry_run` and the `spec` fields are cleared
   * after a successful commit operation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CommitServicePerimetersRequest request =
   *       CommitServicePerimetersRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setEtag("etag3123477")
   *           .build();
   *   OperationFuture<CommitServicePerimetersResponse, AccessContextManagerOperationMetadata>
   *       future =
   *           accessContextManagerClient
   *               .commitServicePerimetersOperationCallable()
   *               .futureCall(request);
   *   // Do something.
   *   CommitServicePerimetersResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CommitServicePerimetersRequest,
          CommitServicePerimetersResponse,
          AccessContextManagerOperationMetadata>
      commitServicePerimetersOperationCallable() {
    return stub.commitServicePerimetersOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Commits the dry-run specification for all the [service perimeters]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] in an [access
   * policy][google.identity.accesscontextmanager.v1.AccessPolicy]. A commit operation on a service
   * perimeter involves copying its `spec` field to the `status` field of the service perimeter.
   * Only [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter] with
   * `use_explicit_dry_run_spec` field set to true are affected by a commit operation. The
   * long-running operation from this RPC has a successful status after the dry-run specifications
   * for all the [service perimeters] [google.identity.accesscontextmanager.v1.ServicePerimeter]
   * have been committed. If a commit fails, it causes the long-running operation to return an error
   * response and the entire commit operation is cancelled. When successful, the Operation.response
   * field contains CommitServicePerimetersResponse. The `dry_run` and the `spec` fields are cleared
   * after a successful commit operation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CommitServicePerimetersRequest request =
   *       CommitServicePerimetersRequest.newBuilder()
   *           .setParent(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setEtag("etag3123477")
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.commitServicePerimetersCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CommitServicePerimetersRequest, Operation>
      commitServicePerimetersCallable() {
    return stub.commitServicePerimetersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [GcpUserAccessBindings]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding] for a Google Cloud organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   OrganizationName parent = OrganizationName.of("[ORGANIZATION]");
   *   for (GcpUserAccessBinding element :
   *       accessContextManagerClient.listGcpUserAccessBindings(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Example: "organizations/256"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListGcpUserAccessBindingsPagedResponse listGcpUserAccessBindings(
      OrganizationName parent) {
    ListGcpUserAccessBindingsRequest request =
        ListGcpUserAccessBindingsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listGcpUserAccessBindings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [GcpUserAccessBindings]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding] for a Google Cloud organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String parent = OrganizationName.of("[ORGANIZATION]").toString();
   *   for (GcpUserAccessBinding element :
   *       accessContextManagerClient.listGcpUserAccessBindings(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Example: "organizations/256"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListGcpUserAccessBindingsPagedResponse listGcpUserAccessBindings(String parent) {
    ListGcpUserAccessBindingsRequest request =
        ListGcpUserAccessBindingsRequest.newBuilder().setParent(parent).build();
    return listGcpUserAccessBindings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [GcpUserAccessBindings]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding] for a Google Cloud organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListGcpUserAccessBindingsRequest request =
   *       ListGcpUserAccessBindingsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (GcpUserAccessBinding element :
   *       accessContextManagerClient.listGcpUserAccessBindings(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListGcpUserAccessBindingsPagedResponse listGcpUserAccessBindings(
      ListGcpUserAccessBindingsRequest request) {
    return listGcpUserAccessBindingsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [GcpUserAccessBindings]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding] for a Google Cloud organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListGcpUserAccessBindingsRequest request =
   *       ListGcpUserAccessBindingsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<GcpUserAccessBinding> future =
   *       accessContextManagerClient.listGcpUserAccessBindingsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (GcpUserAccessBinding element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListGcpUserAccessBindingsRequest, ListGcpUserAccessBindingsPagedResponse>
      listGcpUserAccessBindingsPagedCallable() {
    return stub.listGcpUserAccessBindingsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all [GcpUserAccessBindings]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding] for a Google Cloud organization.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   ListGcpUserAccessBindingsRequest request =
   *       ListGcpUserAccessBindingsRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListGcpUserAccessBindingsResponse response =
   *         accessContextManagerClient.listGcpUserAccessBindingsCallable().call(request);
   *     for (GcpUserAccessBinding element : response.getGcpUserAccessBindingsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListGcpUserAccessBindingsRequest, ListGcpUserAccessBindingsResponse>
      listGcpUserAccessBindingsCallable() {
    return stub.listGcpUserAccessBindingsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the [GcpUserAccessBinding] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * with the given name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GcpUserAccessBindingName name =
   *       GcpUserAccessBindingName.of("[ORGANIZATION]", "[GCP_USER_ACCESS_BINDING]");
   *   GcpUserAccessBinding response = accessContextManagerClient.getGcpUserAccessBinding(name);
   * }
   * }</pre>
   *
   * @param name Required. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GcpUserAccessBinding getGcpUserAccessBinding(GcpUserAccessBindingName name) {
    GetGcpUserAccessBindingRequest request =
        GetGcpUserAccessBindingRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getGcpUserAccessBinding(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the [GcpUserAccessBinding] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * with the given name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String name =
   *       GcpUserAccessBindingName.of("[ORGANIZATION]", "[GCP_USER_ACCESS_BINDING]").toString();
   *   GcpUserAccessBinding response = accessContextManagerClient.getGcpUserAccessBinding(name);
   * }
   * }</pre>
   *
   * @param name Required. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GcpUserAccessBinding getGcpUserAccessBinding(String name) {
    GetGcpUserAccessBindingRequest request =
        GetGcpUserAccessBindingRequest.newBuilder().setName(name).build();
    return getGcpUserAccessBinding(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the [GcpUserAccessBinding] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * with the given name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GetGcpUserAccessBindingRequest request =
   *       GetGcpUserAccessBindingRequest.newBuilder()
   *           .setName(
   *               GcpUserAccessBindingName.of("[ORGANIZATION]", "[GCP_USER_ACCESS_BINDING]")
   *                   .toString())
   *           .build();
   *   GcpUserAccessBinding response = accessContextManagerClient.getGcpUserAccessBinding(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GcpUserAccessBinding getGcpUserAccessBinding(
      GetGcpUserAccessBindingRequest request) {
    return getGcpUserAccessBindingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the [GcpUserAccessBinding] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * with the given name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GetGcpUserAccessBindingRequest request =
   *       GetGcpUserAccessBindingRequest.newBuilder()
   *           .setName(
   *               GcpUserAccessBindingName.of("[ORGANIZATION]", "[GCP_USER_ACCESS_BINDING]")
   *                   .toString())
   *           .build();
   *   ApiFuture<GcpUserAccessBinding> future =
   *       accessContextManagerClient.getGcpUserAccessBindingCallable().futureCall(request);
   *   // Do something.
   *   GcpUserAccessBinding response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetGcpUserAccessBindingRequest, GcpUserAccessBinding>
      getGcpUserAccessBindingCallable() {
    return stub.getGcpUserAccessBindingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. If the client specifies a
   * [name] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.name], the server ignores
   * it. Fails if a resource already exists with the same [group_key]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.group_key]. Completion of this
   * long-running operation does not necessarily signify that the new binding is deployed onto all
   * affected users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   OrganizationName parent = OrganizationName.of("[ORGANIZATION]");
   *   GcpUserAccessBinding gcpUserAccessBinding = GcpUserAccessBinding.newBuilder().build();
   *   GcpUserAccessBinding response =
   *       accessContextManagerClient
   *           .createGcpUserAccessBindingAsync(parent, gcpUserAccessBinding)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. Example: "organizations/256"
   * @param gcpUserAccessBinding Required. [GcpUserAccessBinding]
   *     [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<GcpUserAccessBinding, GcpUserAccessBindingOperationMetadata>
      createGcpUserAccessBindingAsync(
          OrganizationName parent, GcpUserAccessBinding gcpUserAccessBinding) {
    CreateGcpUserAccessBindingRequest request =
        CreateGcpUserAccessBindingRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setGcpUserAccessBinding(gcpUserAccessBinding)
            .build();
    return createGcpUserAccessBindingAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. If the client specifies a
   * [name] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.name], the server ignores
   * it. Fails if a resource already exists with the same [group_key]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.group_key]. Completion of this
   * long-running operation does not necessarily signify that the new binding is deployed onto all
   * affected users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String parent = OrganizationName.of("[ORGANIZATION]").toString();
   *   GcpUserAccessBinding gcpUserAccessBinding = GcpUserAccessBinding.newBuilder().build();
   *   GcpUserAccessBinding response =
   *       accessContextManagerClient
   *           .createGcpUserAccessBindingAsync(parent, gcpUserAccessBinding)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. Example: "organizations/256"
   * @param gcpUserAccessBinding Required. [GcpUserAccessBinding]
   *     [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<GcpUserAccessBinding, GcpUserAccessBindingOperationMetadata>
      createGcpUserAccessBindingAsync(String parent, GcpUserAccessBinding gcpUserAccessBinding) {
    CreateGcpUserAccessBindingRequest request =
        CreateGcpUserAccessBindingRequest.newBuilder()
            .setParent(parent)
            .setGcpUserAccessBinding(gcpUserAccessBinding)
            .build();
    return createGcpUserAccessBindingAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. If the client specifies a
   * [name] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.name], the server ignores
   * it. Fails if a resource already exists with the same [group_key]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.group_key]. Completion of this
   * long-running operation does not necessarily signify that the new binding is deployed onto all
   * affected users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CreateGcpUserAccessBindingRequest request =
   *       CreateGcpUserAccessBindingRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setGcpUserAccessBinding(GcpUserAccessBinding.newBuilder().build())
   *           .build();
   *   GcpUserAccessBinding response =
   *       accessContextManagerClient.createGcpUserAccessBindingAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<GcpUserAccessBinding, GcpUserAccessBindingOperationMetadata>
      createGcpUserAccessBindingAsync(CreateGcpUserAccessBindingRequest request) {
    return createGcpUserAccessBindingOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. If the client specifies a
   * [name] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.name], the server ignores
   * it. Fails if a resource already exists with the same [group_key]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.group_key]. Completion of this
   * long-running operation does not necessarily signify that the new binding is deployed onto all
   * affected users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CreateGcpUserAccessBindingRequest request =
   *       CreateGcpUserAccessBindingRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setGcpUserAccessBinding(GcpUserAccessBinding.newBuilder().build())
   *           .build();
   *   OperationFuture<GcpUserAccessBinding, GcpUserAccessBindingOperationMetadata> future =
   *       accessContextManagerClient
   *           .createGcpUserAccessBindingOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   GcpUserAccessBinding response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateGcpUserAccessBindingRequest,
          GcpUserAccessBinding,
          GcpUserAccessBindingOperationMetadata>
      createGcpUserAccessBindingOperationCallable() {
    return stub.createGcpUserAccessBindingOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. If the client specifies a
   * [name] [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.name], the server ignores
   * it. Fails if a resource already exists with the same [group_key]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding.group_key]. Completion of this
   * long-running operation does not necessarily signify that the new binding is deployed onto all
   * affected users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   CreateGcpUserAccessBindingRequest request =
   *       CreateGcpUserAccessBindingRequest.newBuilder()
   *           .setParent(OrganizationName.of("[ORGANIZATION]").toString())
   *           .setGcpUserAccessBinding(GcpUserAccessBinding.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.createGcpUserAccessBindingCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateGcpUserAccessBindingRequest, Operation>
      createGcpUserAccessBindingCallable() {
    return stub.createGcpUserAccessBindingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. Completion of this long-running
   * operation does not necessarily signify that the changed binding is deployed onto all affected
   * users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GcpUserAccessBinding gcpUserAccessBinding = GcpUserAccessBinding.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   GcpUserAccessBinding response =
   *       accessContextManagerClient
   *           .updateGcpUserAccessBindingAsync(gcpUserAccessBinding, updateMask)
   *           .get();
   * }
   * }</pre>
   *
   * @param gcpUserAccessBinding Required. [GcpUserAccessBinding]
   *     [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * @param updateMask Required. Only the fields specified in this mask are updated. Because name
   *     and group_key cannot be changed, update_mask is required and must always be:
   *     <p>update_mask { paths: "access_levels" }
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<GcpUserAccessBinding, GcpUserAccessBindingOperationMetadata>
      updateGcpUserAccessBindingAsync(
          GcpUserAccessBinding gcpUserAccessBinding, FieldMask updateMask) {
    UpdateGcpUserAccessBindingRequest request =
        UpdateGcpUserAccessBindingRequest.newBuilder()
            .setGcpUserAccessBinding(gcpUserAccessBinding)
            .setUpdateMask(updateMask)
            .build();
    return updateGcpUserAccessBindingAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. Completion of this long-running
   * operation does not necessarily signify that the changed binding is deployed onto all affected
   * users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateGcpUserAccessBindingRequest request =
   *       UpdateGcpUserAccessBindingRequest.newBuilder()
   *           .setGcpUserAccessBinding(GcpUserAccessBinding.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   GcpUserAccessBinding response =
   *       accessContextManagerClient.updateGcpUserAccessBindingAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<GcpUserAccessBinding, GcpUserAccessBindingOperationMetadata>
      updateGcpUserAccessBindingAsync(UpdateGcpUserAccessBindingRequest request) {
    return updateGcpUserAccessBindingOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. Completion of this long-running
   * operation does not necessarily signify that the changed binding is deployed onto all affected
   * users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateGcpUserAccessBindingRequest request =
   *       UpdateGcpUserAccessBindingRequest.newBuilder()
   *           .setGcpUserAccessBinding(GcpUserAccessBinding.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OperationFuture<GcpUserAccessBinding, GcpUserAccessBindingOperationMetadata> future =
   *       accessContextManagerClient
   *           .updateGcpUserAccessBindingOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   GcpUserAccessBinding response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateGcpUserAccessBindingRequest,
          GcpUserAccessBinding,
          GcpUserAccessBindingOperationMetadata>
      updateGcpUserAccessBindingOperationCallable() {
    return stub.updateGcpUserAccessBindingOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. Completion of this long-running
   * operation does not necessarily signify that the changed binding is deployed onto all affected
   * users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   UpdateGcpUserAccessBindingRequest request =
   *       UpdateGcpUserAccessBindingRequest.newBuilder()
   *           .setGcpUserAccessBinding(GcpUserAccessBinding.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.updateGcpUserAccessBindingCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateGcpUserAccessBindingRequest, Operation>
      updateGcpUserAccessBindingCallable() {
    return stub.updateGcpUserAccessBindingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. Completion of this long-running
   * operation does not necessarily signify that the binding deletion is deployed onto all affected
   * users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GcpUserAccessBindingName name =
   *       GcpUserAccessBindingName.of("[ORGANIZATION]", "[GCP_USER_ACCESS_BINDING]");
   *   accessContextManagerClient.deleteGcpUserAccessBindingAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, GcpUserAccessBindingOperationMetadata>
      deleteGcpUserAccessBindingAsync(GcpUserAccessBindingName name) {
    DeleteGcpUserAccessBindingRequest request =
        DeleteGcpUserAccessBindingRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteGcpUserAccessBindingAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. Completion of this long-running
   * operation does not necessarily signify that the binding deletion is deployed onto all affected
   * users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   String name =
   *       GcpUserAccessBindingName.of("[ORGANIZATION]", "[GCP_USER_ACCESS_BINDING]").toString();
   *   accessContextManagerClient.deleteGcpUserAccessBindingAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, GcpUserAccessBindingOperationMetadata>
      deleteGcpUserAccessBindingAsync(String name) {
    DeleteGcpUserAccessBindingRequest request =
        DeleteGcpUserAccessBindingRequest.newBuilder().setName(name).build();
    return deleteGcpUserAccessBindingAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. Completion of this long-running
   * operation does not necessarily signify that the binding deletion is deployed onto all affected
   * users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteGcpUserAccessBindingRequest request =
   *       DeleteGcpUserAccessBindingRequest.newBuilder()
   *           .setName(
   *               GcpUserAccessBindingName.of("[ORGANIZATION]", "[GCP_USER_ACCESS_BINDING]")
   *                   .toString())
   *           .build();
   *   accessContextManagerClient.deleteGcpUserAccessBindingAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, GcpUserAccessBindingOperationMetadata>
      deleteGcpUserAccessBindingAsync(DeleteGcpUserAccessBindingRequest request) {
    return deleteGcpUserAccessBindingOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. Completion of this long-running
   * operation does not necessarily signify that the binding deletion is deployed onto all affected
   * users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteGcpUserAccessBindingRequest request =
   *       DeleteGcpUserAccessBindingRequest.newBuilder()
   *           .setName(
   *               GcpUserAccessBindingName.of("[ORGANIZATION]", "[GCP_USER_ACCESS_BINDING]")
   *                   .toString())
   *           .build();
   *   OperationFuture<Empty, GcpUserAccessBindingOperationMetadata> future =
   *       accessContextManagerClient
   *           .deleteGcpUserAccessBindingOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          DeleteGcpUserAccessBindingRequest, Empty, GcpUserAccessBindingOperationMetadata>
      deleteGcpUserAccessBindingOperationCallable() {
    return stub.deleteGcpUserAccessBindingOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]. Completion of this long-running
   * operation does not necessarily signify that the binding deletion is deployed onto all affected
   * users, which may take more time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   DeleteGcpUserAccessBindingRequest request =
   *       DeleteGcpUserAccessBindingRequest.newBuilder()
   *           .setName(
   *               GcpUserAccessBindingName.of("[ORGANIZATION]", "[GCP_USER_ACCESS_BINDING]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       accessContextManagerClient.deleteGcpUserAccessBindingCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteGcpUserAccessBindingRequest, Operation>
      deleteGcpUserAccessBindingCallable() {
    return stub.deleteGcpUserAccessBindingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the IAM policy for the specified Access Context Manager [access
   * policy][google.identity.accesscontextmanager.v1.AccessPolicy]. This method replaces the
   * existing IAM policy on the access policy. The IAM policy controls the set of users who can
   * perform specific operations on the Access Context Manager [access
   * policy][google.identity.accesscontextmanager.v1.AccessPolicy].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Policy response = accessContextManagerClient.setIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the IAM policy for the specified Access Context Manager [access
   * policy][google.identity.accesscontextmanager.v1.AccessPolicy]. This method replaces the
   * existing IAM policy on the access policy. The IAM policy controls the set of users who can
   * perform specific operations on the Access Context Manager [access
   * policy][google.identity.accesscontextmanager.v1.AccessPolicy].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future =
   *       accessContextManagerClient.setIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the IAM policy for the specified Access Context Manager [access
   * policy][google.identity.accesscontextmanager.v1.AccessPolicy].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   Policy response = accessContextManagerClient.getIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the IAM policy for the specified Access Context Manager [access
   * policy][google.identity.accesscontextmanager.v1.AccessPolicy].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(AccessPolicyName.of("[ACCESS_POLICY]").toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future =
   *       accessContextManagerClient.getIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the IAM permissions that the caller has on the specified Access Context Manager
   * resource. The resource can be an
   * [AccessPolicy][google.identity.accesscontextmanager.v1.AccessPolicy],
   * [AccessLevel][google.identity.accesscontextmanager.v1.AccessLevel], or
   * [ServicePerimeter][google.identity.accesscontextmanager.v1.ServicePerimeter ]. This method does
   * not support other resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(AccessLevelName.of("[ACCESS_POLICY]", "[ACCESS_LEVEL]").toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   TestIamPermissionsResponse response = accessContextManagerClient.testIamPermissions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(TestIamPermissionsRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the IAM permissions that the caller has on the specified Access Context Manager
   * resource. The resource can be an
   * [AccessPolicy][google.identity.accesscontextmanager.v1.AccessPolicy],
   * [AccessLevel][google.identity.accesscontextmanager.v1.AccessLevel], or
   * [ServicePerimeter][google.identity.accesscontextmanager.v1.ServicePerimeter ]. This method does
   * not support other resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccessContextManagerClient accessContextManagerClient =
   *     AccessContextManagerClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(AccessLevelName.of("[ACCESS_POLICY]", "[ACCESS_LEVEL]").toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   ApiFuture<TestIamPermissionsResponse> future =
   *       accessContextManagerClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something.
   *   TestIamPermissionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListAccessPoliciesPagedResponse
      extends AbstractPagedListResponse<
          ListAccessPoliciesRequest,
          ListAccessPoliciesResponse,
          AccessPolicy,
          ListAccessPoliciesPage,
          ListAccessPoliciesFixedSizeCollection> {

    public static ApiFuture<ListAccessPoliciesPagedResponse> createAsync(
        PageContext<ListAccessPoliciesRequest, ListAccessPoliciesResponse, AccessPolicy> context,
        ApiFuture<ListAccessPoliciesResponse> futureResponse) {
      ApiFuture<ListAccessPoliciesPage> futurePage =
          ListAccessPoliciesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListAccessPoliciesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListAccessPoliciesPagedResponse(ListAccessPoliciesPage page) {
      super(page, ListAccessPoliciesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListAccessPoliciesPage
      extends AbstractPage<
          ListAccessPoliciesRequest,
          ListAccessPoliciesResponse,
          AccessPolicy,
          ListAccessPoliciesPage> {

    private ListAccessPoliciesPage(
        PageContext<ListAccessPoliciesRequest, ListAccessPoliciesResponse, AccessPolicy> context,
        ListAccessPoliciesResponse response) {
      super(context, response);
    }

    private static ListAccessPoliciesPage createEmptyPage() {
      return new ListAccessPoliciesPage(null, null);
    }

    @Override
    protected ListAccessPoliciesPage createPage(
        PageContext<ListAccessPoliciesRequest, ListAccessPoliciesResponse, AccessPolicy> context,
        ListAccessPoliciesResponse response) {
      return new ListAccessPoliciesPage(context, response);
    }

    @Override
    public ApiFuture<ListAccessPoliciesPage> createPageAsync(
        PageContext<ListAccessPoliciesRequest, ListAccessPoliciesResponse, AccessPolicy> context,
        ApiFuture<ListAccessPoliciesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListAccessPoliciesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListAccessPoliciesRequest,
          ListAccessPoliciesResponse,
          AccessPolicy,
          ListAccessPoliciesPage,
          ListAccessPoliciesFixedSizeCollection> {

    private ListAccessPoliciesFixedSizeCollection(
        List<ListAccessPoliciesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAccessPoliciesFixedSizeCollection createEmptyCollection() {
      return new ListAccessPoliciesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAccessPoliciesFixedSizeCollection createCollection(
        List<ListAccessPoliciesPage> pages, int collectionSize) {
      return new ListAccessPoliciesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListAccessLevelsPagedResponse
      extends AbstractPagedListResponse<
          ListAccessLevelsRequest,
          ListAccessLevelsResponse,
          AccessLevel,
          ListAccessLevelsPage,
          ListAccessLevelsFixedSizeCollection> {

    public static ApiFuture<ListAccessLevelsPagedResponse> createAsync(
        PageContext<ListAccessLevelsRequest, ListAccessLevelsResponse, AccessLevel> context,
        ApiFuture<ListAccessLevelsResponse> futureResponse) {
      ApiFuture<ListAccessLevelsPage> futurePage =
          ListAccessLevelsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListAccessLevelsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListAccessLevelsPagedResponse(ListAccessLevelsPage page) {
      super(page, ListAccessLevelsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListAccessLevelsPage
      extends AbstractPage<
          ListAccessLevelsRequest, ListAccessLevelsResponse, AccessLevel, ListAccessLevelsPage> {

    private ListAccessLevelsPage(
        PageContext<ListAccessLevelsRequest, ListAccessLevelsResponse, AccessLevel> context,
        ListAccessLevelsResponse response) {
      super(context, response);
    }

    private static ListAccessLevelsPage createEmptyPage() {
      return new ListAccessLevelsPage(null, null);
    }

    @Override
    protected ListAccessLevelsPage createPage(
        PageContext<ListAccessLevelsRequest, ListAccessLevelsResponse, AccessLevel> context,
        ListAccessLevelsResponse response) {
      return new ListAccessLevelsPage(context, response);
    }

    @Override
    public ApiFuture<ListAccessLevelsPage> createPageAsync(
        PageContext<ListAccessLevelsRequest, ListAccessLevelsResponse, AccessLevel> context,
        ApiFuture<ListAccessLevelsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListAccessLevelsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListAccessLevelsRequest,
          ListAccessLevelsResponse,
          AccessLevel,
          ListAccessLevelsPage,
          ListAccessLevelsFixedSizeCollection> {

    private ListAccessLevelsFixedSizeCollection(
        List<ListAccessLevelsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAccessLevelsFixedSizeCollection createEmptyCollection() {
      return new ListAccessLevelsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAccessLevelsFixedSizeCollection createCollection(
        List<ListAccessLevelsPage> pages, int collectionSize) {
      return new ListAccessLevelsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListServicePerimetersPagedResponse
      extends AbstractPagedListResponse<
          ListServicePerimetersRequest,
          ListServicePerimetersResponse,
          ServicePerimeter,
          ListServicePerimetersPage,
          ListServicePerimetersFixedSizeCollection> {

    public static ApiFuture<ListServicePerimetersPagedResponse> createAsync(
        PageContext<ListServicePerimetersRequest, ListServicePerimetersResponse, ServicePerimeter>
            context,
        ApiFuture<ListServicePerimetersResponse> futureResponse) {
      ApiFuture<ListServicePerimetersPage> futurePage =
          ListServicePerimetersPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListServicePerimetersPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListServicePerimetersPagedResponse(ListServicePerimetersPage page) {
      super(page, ListServicePerimetersFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListServicePerimetersPage
      extends AbstractPage<
          ListServicePerimetersRequest,
          ListServicePerimetersResponse,
          ServicePerimeter,
          ListServicePerimetersPage> {

    private ListServicePerimetersPage(
        PageContext<ListServicePerimetersRequest, ListServicePerimetersResponse, ServicePerimeter>
            context,
        ListServicePerimetersResponse response) {
      super(context, response);
    }

    private static ListServicePerimetersPage createEmptyPage() {
      return new ListServicePerimetersPage(null, null);
    }

    @Override
    protected ListServicePerimetersPage createPage(
        PageContext<ListServicePerimetersRequest, ListServicePerimetersResponse, ServicePerimeter>
            context,
        ListServicePerimetersResponse response) {
      return new ListServicePerimetersPage(context, response);
    }

    @Override
    public ApiFuture<ListServicePerimetersPage> createPageAsync(
        PageContext<ListServicePerimetersRequest, ListServicePerimetersResponse, ServicePerimeter>
            context,
        ApiFuture<ListServicePerimetersResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListServicePerimetersFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListServicePerimetersRequest,
          ListServicePerimetersResponse,
          ServicePerimeter,
          ListServicePerimetersPage,
          ListServicePerimetersFixedSizeCollection> {

    private ListServicePerimetersFixedSizeCollection(
        List<ListServicePerimetersPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListServicePerimetersFixedSizeCollection createEmptyCollection() {
      return new ListServicePerimetersFixedSizeCollection(null, 0);
    }

    @Override
    protected ListServicePerimetersFixedSizeCollection createCollection(
        List<ListServicePerimetersPage> pages, int collectionSize) {
      return new ListServicePerimetersFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListGcpUserAccessBindingsPagedResponse
      extends AbstractPagedListResponse<
          ListGcpUserAccessBindingsRequest,
          ListGcpUserAccessBindingsResponse,
          GcpUserAccessBinding,
          ListGcpUserAccessBindingsPage,
          ListGcpUserAccessBindingsFixedSizeCollection> {

    public static ApiFuture<ListGcpUserAccessBindingsPagedResponse> createAsync(
        PageContext<
                ListGcpUserAccessBindingsRequest,
                ListGcpUserAccessBindingsResponse,
                GcpUserAccessBinding>
            context,
        ApiFuture<ListGcpUserAccessBindingsResponse> futureResponse) {
      ApiFuture<ListGcpUserAccessBindingsPage> futurePage =
          ListGcpUserAccessBindingsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListGcpUserAccessBindingsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListGcpUserAccessBindingsPagedResponse(ListGcpUserAccessBindingsPage page) {
      super(page, ListGcpUserAccessBindingsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListGcpUserAccessBindingsPage
      extends AbstractPage<
          ListGcpUserAccessBindingsRequest,
          ListGcpUserAccessBindingsResponse,
          GcpUserAccessBinding,
          ListGcpUserAccessBindingsPage> {

    private ListGcpUserAccessBindingsPage(
        PageContext<
                ListGcpUserAccessBindingsRequest,
                ListGcpUserAccessBindingsResponse,
                GcpUserAccessBinding>
            context,
        ListGcpUserAccessBindingsResponse response) {
      super(context, response);
    }

    private static ListGcpUserAccessBindingsPage createEmptyPage() {
      return new ListGcpUserAccessBindingsPage(null, null);
    }

    @Override
    protected ListGcpUserAccessBindingsPage createPage(
        PageContext<
                ListGcpUserAccessBindingsRequest,
                ListGcpUserAccessBindingsResponse,
                GcpUserAccessBinding>
            context,
        ListGcpUserAccessBindingsResponse response) {
      return new ListGcpUserAccessBindingsPage(context, response);
    }

    @Override
    public ApiFuture<ListGcpUserAccessBindingsPage> createPageAsync(
        PageContext<
                ListGcpUserAccessBindingsRequest,
                ListGcpUserAccessBindingsResponse,
                GcpUserAccessBinding>
            context,
        ApiFuture<ListGcpUserAccessBindingsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListGcpUserAccessBindingsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListGcpUserAccessBindingsRequest,
          ListGcpUserAccessBindingsResponse,
          GcpUserAccessBinding,
          ListGcpUserAccessBindingsPage,
          ListGcpUserAccessBindingsFixedSizeCollection> {

    private ListGcpUserAccessBindingsFixedSizeCollection(
        List<ListGcpUserAccessBindingsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListGcpUserAccessBindingsFixedSizeCollection createEmptyCollection() {
      return new ListGcpUserAccessBindingsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListGcpUserAccessBindingsFixedSizeCollection createCollection(
        List<ListGcpUserAccessBindingsPage> pages, int collectionSize) {
      return new ListGcpUserAccessBindingsFixedSizeCollection(pages, collectionSize);
    }
  }
}
