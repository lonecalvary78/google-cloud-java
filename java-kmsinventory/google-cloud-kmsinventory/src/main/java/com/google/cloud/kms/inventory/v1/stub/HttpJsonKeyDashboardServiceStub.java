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

package com.google.cloud.kms.inventory.v1.stub;

import static com.google.cloud.kms.inventory.v1.KeyDashboardServiceClient.ListCryptoKeysPagedResponse;

import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.kms.inventory.v1.ListCryptoKeysRequest;
import com.google.cloud.kms.inventory.v1.ListCryptoKeysResponse;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the KeyDashboardService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class HttpJsonKeyDashboardServiceStub extends KeyDashboardServiceStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<ListCryptoKeysRequest, ListCryptoKeysResponse>
      listCryptoKeysMethodDescriptor =
          ApiMethodDescriptor.<ListCryptoKeysRequest, ListCryptoKeysResponse>newBuilder()
              .setFullMethodName("google.cloud.kms.inventory.v1.KeyDashboardService/ListCryptoKeys")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListCryptoKeysRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*}/cryptoKeys",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListCryptoKeysRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListCryptoKeysRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListCryptoKeysResponse>newBuilder()
                      .setDefaultInstance(ListCryptoKeysResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<ListCryptoKeysRequest, ListCryptoKeysResponse> listCryptoKeysCallable;
  private final UnaryCallable<ListCryptoKeysRequest, ListCryptoKeysPagedResponse>
      listCryptoKeysPagedCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonKeyDashboardServiceStub create(
      KeyDashboardServiceStubSettings settings) throws IOException {
    return new HttpJsonKeyDashboardServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonKeyDashboardServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonKeyDashboardServiceStub(
        KeyDashboardServiceStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonKeyDashboardServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonKeyDashboardServiceStub(
        KeyDashboardServiceStubSettings.newHttpJsonBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonKeyDashboardServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonKeyDashboardServiceStub(
      KeyDashboardServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonKeyDashboardServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonKeyDashboardServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonKeyDashboardServiceStub(
      KeyDashboardServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<ListCryptoKeysRequest, ListCryptoKeysResponse>
        listCryptoKeysTransportSettings =
            HttpJsonCallSettings.<ListCryptoKeysRequest, ListCryptoKeysResponse>newBuilder()
                .setMethodDescriptor(listCryptoKeysMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();

    this.listCryptoKeysCallable =
        callableFactory.createUnaryCallable(
            listCryptoKeysTransportSettings, settings.listCryptoKeysSettings(), clientContext);
    this.listCryptoKeysPagedCallable =
        callableFactory.createPagedCallable(
            listCryptoKeysTransportSettings, settings.listCryptoKeysSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(listCryptoKeysMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<ListCryptoKeysRequest, ListCryptoKeysResponse> listCryptoKeysCallable() {
    return listCryptoKeysCallable;
  }

  @Override
  public UnaryCallable<ListCryptoKeysRequest, ListCryptoKeysPagedResponse>
      listCryptoKeysPagedCallable() {
    return listCryptoKeysPagedCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
