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

package com.google.cloud.dialogflow.cx.v3;

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
import com.google.cloud.dialogflow.cx.v3.stub.EntityTypesStub;
import com.google.cloud.dialogflow.cx.v3.stub.EntityTypesStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for managing
 * [EntityTypes][google.cloud.dialogflow.cx.v3.EntityType].
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
 * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
 *   EntityTypeName name =
 *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]");
 *   EntityType response = entityTypesClient.getEntityType(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the EntityTypesClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> GetEntityType</td>
 *      <td><p> Retrieves the specified entity type.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getEntityType(GetEntityTypeRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getEntityType(EntityTypeName name)
 *           <li><p> getEntityType(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getEntityTypeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateEntityType</td>
 *      <td><p> Creates an entity type in the specified agent.
 * <p>  Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createEntityType(CreateEntityTypeRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createEntityType(AgentName parent, EntityType entityType)
 *           <li><p> createEntityType(String parent, EntityType entityType)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createEntityTypeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateEntityType</td>
 *      <td><p> Updates the specified entity type.
 * <p>  Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateEntityType(UpdateEntityTypeRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateEntityType(EntityType entityType, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateEntityTypeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteEntityType</td>
 *      <td><p> Deletes the specified entity type.
 * <p>  Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteEntityType(DeleteEntityTypeRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> deleteEntityType(EntityTypeName name)
 *           <li><p> deleteEntityType(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteEntityTypeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListEntityTypes</td>
 *      <td><p> Returns the list of all entity types in the specified agent.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listEntityTypes(ListEntityTypesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listEntityTypes(AgentName parent)
 *           <li><p> listEntityTypes(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listEntityTypesPagedCallable()
 *           <li><p> listEntityTypesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ExportEntityTypes</td>
 *      <td><p> Exports the selected entity types.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> exportEntityTypesAsync(ExportEntityTypesRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> exportEntityTypesOperationCallable()
 *           <li><p> exportEntityTypesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ImportEntityTypes</td>
 *      <td><p> Imports the specified entitytypes into the agent.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> importEntityTypesAsync(ImportEntityTypesRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> importEntityTypesOperationCallable()
 *           <li><p> importEntityTypesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListLocations</td>
 *      <td><p> Lists information about the supported locations for this service.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listLocations(ListLocationsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listLocationsPagedCallable()
 *           <li><p> listLocationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetLocation</td>
 *      <td><p> Gets information about a location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getLocation(GetLocationRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getLocationCallable()
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
 * <p>This class can be customized by passing in a custom instance of EntityTypesSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * EntityTypesSettings entityTypesSettings =
 *     EntityTypesSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * EntityTypesClient entityTypesClient = EntityTypesClient.create(entityTypesSettings);
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
 * EntityTypesSettings entityTypesSettings =
 *     EntityTypesSettings.newBuilder().setEndpoint(myEndpoint).build();
 * EntityTypesClient entityTypesClient = EntityTypesClient.create(entityTypesSettings);
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
 * EntityTypesSettings entityTypesSettings = EntityTypesSettings.newHttpJsonBuilder().build();
 * EntityTypesClient entityTypesClient = EntityTypesClient.create(entityTypesSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class EntityTypesClient implements BackgroundResource {
  private final EntityTypesSettings settings;
  private final EntityTypesStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of EntityTypesClient with default settings. */
  public static final EntityTypesClient create() throws IOException {
    return create(EntityTypesSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of EntityTypesClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final EntityTypesClient create(EntityTypesSettings settings) throws IOException {
    return new EntityTypesClient(settings);
  }

  /**
   * Constructs an instance of EntityTypesClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(EntityTypesSettings).
   */
  public static final EntityTypesClient create(EntityTypesStub stub) {
    return new EntityTypesClient(stub);
  }

  /**
   * Constructs an instance of EntityTypesClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected EntityTypesClient(EntityTypesSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((EntityTypesStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected EntityTypesClient(EntityTypesStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final EntityTypesSettings getSettings() {
    return settings;
  }

  public EntityTypesStub getStub() {
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
   * Retrieves the specified entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   EntityTypeName name =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]");
   *   EntityType response = entityTypesClient.getEntityType(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the entity type. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/entityTypes/&lt;EntityTypeID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType getEntityType(EntityTypeName name) {
    GetEntityTypeRequest request =
        GetEntityTypeRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   String name =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]").toString();
   *   EntityType response = entityTypesClient.getEntityType(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the entity type. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/entityTypes/&lt;EntityTypeID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType getEntityType(String name) {
    GetEntityTypeRequest request = GetEntityTypeRequest.newBuilder().setName(name).build();
    return getEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   GetEntityTypeRequest request =
   *       GetEntityTypeRequest.newBuilder()
   *           .setName(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   EntityType response = entityTypesClient.getEntityType(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType getEntityType(GetEntityTypeRequest request) {
    return getEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   GetEntityTypeRequest request =
   *       GetEntityTypeRequest.newBuilder()
   *           .setName(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   ApiFuture<EntityType> future = entityTypesClient.getEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   EntityType response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetEntityTypeRequest, EntityType> getEntityTypeCallable() {
    return stub.getEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an entity type in the specified agent.
   *
   * <p>Note: You should always train a flow prior to sending it queries. See the [training
   * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   AgentName parent = AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]");
   *   EntityType entityType = EntityType.newBuilder().build();
   *   EntityType response = entityTypesClient.createEntityType(parent, entityType);
   * }
   * }</pre>
   *
   * @param parent Required. The agent to create a entity type for. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
   * @param entityType Required. The entity type to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType createEntityType(AgentName parent, EntityType entityType) {
    CreateEntityTypeRequest request =
        CreateEntityTypeRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setEntityType(entityType)
            .build();
    return createEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an entity type in the specified agent.
   *
   * <p>Note: You should always train a flow prior to sending it queries. See the [training
   * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   String parent = AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString();
   *   EntityType entityType = EntityType.newBuilder().build();
   *   EntityType response = entityTypesClient.createEntityType(parent, entityType);
   * }
   * }</pre>
   *
   * @param parent Required. The agent to create a entity type for. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
   * @param entityType Required. The entity type to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType createEntityType(String parent, EntityType entityType) {
    CreateEntityTypeRequest request =
        CreateEntityTypeRequest.newBuilder().setParent(parent).setEntityType(entityType).build();
    return createEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an entity type in the specified agent.
   *
   * <p>Note: You should always train a flow prior to sending it queries. See the [training
   * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   CreateEntityTypeRequest request =
   *       CreateEntityTypeRequest.newBuilder()
   *           .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
   *           .setEntityType(EntityType.newBuilder().build())
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   EntityType response = entityTypesClient.createEntityType(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType createEntityType(CreateEntityTypeRequest request) {
    return createEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an entity type in the specified agent.
   *
   * <p>Note: You should always train a flow prior to sending it queries. See the [training
   * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   CreateEntityTypeRequest request =
   *       CreateEntityTypeRequest.newBuilder()
   *           .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
   *           .setEntityType(EntityType.newBuilder().build())
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   ApiFuture<EntityType> future =
   *       entityTypesClient.createEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   EntityType response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateEntityTypeRequest, EntityType> createEntityTypeCallable() {
    return stub.createEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified entity type.
   *
   * <p>Note: You should always train a flow prior to sending it queries. See the [training
   * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   EntityType entityType = EntityType.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   EntityType response = entityTypesClient.updateEntityType(entityType, updateMask);
   * }
   * }</pre>
   *
   * @param entityType Required. The entity type to update.
   * @param updateMask The mask to control which fields get updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType updateEntityType(EntityType entityType, FieldMask updateMask) {
    UpdateEntityTypeRequest request =
        UpdateEntityTypeRequest.newBuilder()
            .setEntityType(entityType)
            .setUpdateMask(updateMask)
            .build();
    return updateEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified entity type.
   *
   * <p>Note: You should always train a flow prior to sending it queries. See the [training
   * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   UpdateEntityTypeRequest request =
   *       UpdateEntityTypeRequest.newBuilder()
   *           .setEntityType(EntityType.newBuilder().build())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   EntityType response = entityTypesClient.updateEntityType(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityType updateEntityType(UpdateEntityTypeRequest request) {
    return updateEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified entity type.
   *
   * <p>Note: You should always train a flow prior to sending it queries. See the [training
   * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   UpdateEntityTypeRequest request =
   *       UpdateEntityTypeRequest.newBuilder()
   *           .setEntityType(EntityType.newBuilder().build())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<EntityType> future =
   *       entityTypesClient.updateEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   EntityType response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateEntityTypeRequest, EntityType> updateEntityTypeCallable() {
    return stub.updateEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified entity type.
   *
   * <p>Note: You should always train a flow prior to sending it queries. See the [training
   * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   EntityTypeName name =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]");
   *   entityTypesClient.deleteEntityType(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the entity type to delete. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/entityTypes/&lt;EntityTypeID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteEntityType(EntityTypeName name) {
    DeleteEntityTypeRequest request =
        DeleteEntityTypeRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified entity type.
   *
   * <p>Note: You should always train a flow prior to sending it queries. See the [training
   * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   String name =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]").toString();
   *   entityTypesClient.deleteEntityType(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the entity type to delete. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/entityTypes/&lt;EntityTypeID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteEntityType(String name) {
    DeleteEntityTypeRequest request = DeleteEntityTypeRequest.newBuilder().setName(name).build();
    deleteEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified entity type.
   *
   * <p>Note: You should always train a flow prior to sending it queries. See the [training
   * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   DeleteEntityTypeRequest request =
   *       DeleteEntityTypeRequest.newBuilder()
   *           .setName(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setForce(true)
   *           .build();
   *   entityTypesClient.deleteEntityType(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteEntityType(DeleteEntityTypeRequest request) {
    deleteEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified entity type.
   *
   * <p>Note: You should always train a flow prior to sending it queries. See the [training
   * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   DeleteEntityTypeRequest request =
   *       DeleteEntityTypeRequest.newBuilder()
   *           .setName(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setForce(true)
   *           .build();
   *   ApiFuture<Empty> future = entityTypesClient.deleteEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteEntityTypeRequest, Empty> deleteEntityTypeCallable() {
    return stub.deleteEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all entity types in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   AgentName parent = AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]");
   *   for (EntityType element : entityTypesClient.listEntityTypes(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The agent to list all entity types for. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEntityTypesPagedResponse listEntityTypes(AgentName parent) {
    ListEntityTypesRequest request =
        ListEntityTypesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listEntityTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all entity types in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   String parent = AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString();
   *   for (EntityType element : entityTypesClient.listEntityTypes(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The agent to list all entity types for. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEntityTypesPagedResponse listEntityTypes(String parent) {
    ListEntityTypesRequest request = ListEntityTypesRequest.newBuilder().setParent(parent).build();
    return listEntityTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all entity types in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ListEntityTypesRequest request =
   *       ListEntityTypesRequest.newBuilder()
   *           .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (EntityType element : entityTypesClient.listEntityTypes(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEntityTypesPagedResponse listEntityTypes(ListEntityTypesRequest request) {
    return listEntityTypesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all entity types in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ListEntityTypesRequest request =
   *       ListEntityTypesRequest.newBuilder()
   *           .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<EntityType> future =
   *       entityTypesClient.listEntityTypesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (EntityType element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListEntityTypesRequest, ListEntityTypesPagedResponse>
      listEntityTypesPagedCallable() {
    return stub.listEntityTypesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all entity types in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ListEntityTypesRequest request =
   *       ListEntityTypesRequest.newBuilder()
   *           .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListEntityTypesResponse response =
   *         entityTypesClient.listEntityTypesCallable().call(request);
   *     for (EntityType element : response.getEntityTypesList()) {
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
  public final UnaryCallable<ListEntityTypesRequest, ListEntityTypesResponse>
      listEntityTypesCallable() {
    return stub.listEntityTypesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports the selected entity types.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ExportEntityTypesRequest request =
   *       ExportEntityTypesRequest.newBuilder()
   *           .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
   *           .addAllEntityTypes(new ArrayList<String>())
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   ExportEntityTypesResponse response = entityTypesClient.exportEntityTypesAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ExportEntityTypesResponse, ExportEntityTypesMetadata>
      exportEntityTypesAsync(ExportEntityTypesRequest request) {
    return exportEntityTypesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports the selected entity types.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ExportEntityTypesRequest request =
   *       ExportEntityTypesRequest.newBuilder()
   *           .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
   *           .addAllEntityTypes(new ArrayList<String>())
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   OperationFuture<ExportEntityTypesResponse, ExportEntityTypesMetadata> future =
   *       entityTypesClient.exportEntityTypesOperationCallable().futureCall(request);
   *   // Do something.
   *   ExportEntityTypesResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          ExportEntityTypesRequest, ExportEntityTypesResponse, ExportEntityTypesMetadata>
      exportEntityTypesOperationCallable() {
    return stub.exportEntityTypesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports the selected entity types.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ExportEntityTypesRequest request =
   *       ExportEntityTypesRequest.newBuilder()
   *           .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
   *           .addAllEntityTypes(new ArrayList<String>())
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   ApiFuture<Operation> future =
   *       entityTypesClient.exportEntityTypesCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ExportEntityTypesRequest, Operation> exportEntityTypesCallable() {
    return stub.exportEntityTypesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports the specified entitytypes into the agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ImportEntityTypesRequest request =
   *       ImportEntityTypesRequest.newBuilder()
   *           .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
   *           .setTargetEntityType(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .build();
   *   ImportEntityTypesResponse response = entityTypesClient.importEntityTypesAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ImportEntityTypesResponse, ImportEntityTypesMetadata>
      importEntityTypesAsync(ImportEntityTypesRequest request) {
    return importEntityTypesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports the specified entitytypes into the agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ImportEntityTypesRequest request =
   *       ImportEntityTypesRequest.newBuilder()
   *           .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
   *           .setTargetEntityType(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .build();
   *   OperationFuture<ImportEntityTypesResponse, ImportEntityTypesMetadata> future =
   *       entityTypesClient.importEntityTypesOperationCallable().futureCall(request);
   *   // Do something.
   *   ImportEntityTypesResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          ImportEntityTypesRequest, ImportEntityTypesResponse, ImportEntityTypesMetadata>
      importEntityTypesOperationCallable() {
    return stub.importEntityTypesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports the specified entitytypes into the agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ImportEntityTypesRequest request =
   *       ImportEntityTypesRequest.newBuilder()
   *           .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
   *           .setTargetEntityType(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       entityTypesClient.importEntityTypesCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ImportEntityTypesRequest, Operation> importEntityTypesCallable() {
    return stub.importEntityTypesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Location element : entityTypesClient.listLocations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLocationsPagedResponse listLocations(ListLocationsRequest request) {
    return listLocationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Location> future =
   *       entityTypesClient.listLocationsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Location element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return stub.listLocationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListLocationsResponse response = entityTypesClient.listLocationsCallable().call(request);
   *     for (Location element : response.getLocationsList()) {
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
  public final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return stub.listLocationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   Location response = entityTypesClient.getLocation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Location getLocation(GetLocationRequest request) {
    return getLocationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Location> future = entityTypesClient.getLocationCallable().futureCall(request);
   *   // Do something.
   *   Location response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return stub.getLocationCallable();
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

  public static class ListEntityTypesPagedResponse
      extends AbstractPagedListResponse<
          ListEntityTypesRequest,
          ListEntityTypesResponse,
          EntityType,
          ListEntityTypesPage,
          ListEntityTypesFixedSizeCollection> {

    public static ApiFuture<ListEntityTypesPagedResponse> createAsync(
        PageContext<ListEntityTypesRequest, ListEntityTypesResponse, EntityType> context,
        ApiFuture<ListEntityTypesResponse> futureResponse) {
      ApiFuture<ListEntityTypesPage> futurePage =
          ListEntityTypesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListEntityTypesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListEntityTypesPagedResponse(ListEntityTypesPage page) {
      super(page, ListEntityTypesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListEntityTypesPage
      extends AbstractPage<
          ListEntityTypesRequest, ListEntityTypesResponse, EntityType, ListEntityTypesPage> {

    private ListEntityTypesPage(
        PageContext<ListEntityTypesRequest, ListEntityTypesResponse, EntityType> context,
        ListEntityTypesResponse response) {
      super(context, response);
    }

    private static ListEntityTypesPage createEmptyPage() {
      return new ListEntityTypesPage(null, null);
    }

    @Override
    protected ListEntityTypesPage createPage(
        PageContext<ListEntityTypesRequest, ListEntityTypesResponse, EntityType> context,
        ListEntityTypesResponse response) {
      return new ListEntityTypesPage(context, response);
    }

    @Override
    public ApiFuture<ListEntityTypesPage> createPageAsync(
        PageContext<ListEntityTypesRequest, ListEntityTypesResponse, EntityType> context,
        ApiFuture<ListEntityTypesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListEntityTypesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListEntityTypesRequest,
          ListEntityTypesResponse,
          EntityType,
          ListEntityTypesPage,
          ListEntityTypesFixedSizeCollection> {

    private ListEntityTypesFixedSizeCollection(
        List<ListEntityTypesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListEntityTypesFixedSizeCollection createEmptyCollection() {
      return new ListEntityTypesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListEntityTypesFixedSizeCollection createCollection(
        List<ListEntityTypesPage> pages, int collectionSize) {
      return new ListEntityTypesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListLocationsPagedResponse
      extends AbstractPagedListResponse<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    public static ApiFuture<ListLocationsPagedResponse> createAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      ApiFuture<ListLocationsPage> futurePage =
          ListLocationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListLocationsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListLocationsPagedResponse(ListLocationsPage page) {
      super(page, ListLocationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListLocationsPage
      extends AbstractPage<
          ListLocationsRequest, ListLocationsResponse, Location, ListLocationsPage> {

    private ListLocationsPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      super(context, response);
    }

    private static ListLocationsPage createEmptyPage() {
      return new ListLocationsPage(null, null);
    }

    @Override
    protected ListLocationsPage createPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      return new ListLocationsPage(context, response);
    }

    @Override
    public ApiFuture<ListLocationsPage> createPageAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListLocationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    private ListLocationsFixedSizeCollection(List<ListLocationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListLocationsFixedSizeCollection createEmptyCollection() {
      return new ListLocationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListLocationsFixedSizeCollection createCollection(
        List<ListLocationsPage> pages, int collectionSize) {
      return new ListLocationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
