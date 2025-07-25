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

package com.google.ads.admanager.v1.stub;

import static com.google.ads.admanager.v1.OperatingSystemServiceClient.ListOperatingSystemsPagedResponse;

import com.google.ads.admanager.v1.GetOperatingSystemRequest;
import com.google.ads.admanager.v1.ListOperatingSystemsRequest;
import com.google.ads.admanager.v1.ListOperatingSystemsResponse;
import com.google.ads.admanager.v1.OperatingSystem;
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
 * REST stub implementation for the OperatingSystemService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class HttpJsonOperatingSystemServiceStub extends OperatingSystemServiceStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<GetOperatingSystemRequest, OperatingSystem>
      getOperatingSystemMethodDescriptor =
          ApiMethodDescriptor.<GetOperatingSystemRequest, OperatingSystem>newBuilder()
              .setFullMethodName(
                  "google.ads.admanager.v1.OperatingSystemService/GetOperatingSystem")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetOperatingSystemRequest>newBuilder()
                      .setPath(
                          "/v1/{name=networks/*/operatingSystems/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetOperatingSystemRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetOperatingSystemRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<OperatingSystem>newBuilder()
                      .setDefaultInstance(OperatingSystem.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<
          ListOperatingSystemsRequest, ListOperatingSystemsResponse>
      listOperatingSystemsMethodDescriptor =
          ApiMethodDescriptor
              .<ListOperatingSystemsRequest, ListOperatingSystemsResponse>newBuilder()
              .setFullMethodName(
                  "google.ads.admanager.v1.OperatingSystemService/ListOperatingSystems")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListOperatingSystemsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=networks/*}/operatingSystems",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListOperatingSystemsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListOperatingSystemsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "skip", request.getSkip());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListOperatingSystemsResponse>newBuilder()
                      .setDefaultInstance(ListOperatingSystemsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<GetOperatingSystemRequest, OperatingSystem>
      getOperatingSystemCallable;
  private final UnaryCallable<ListOperatingSystemsRequest, ListOperatingSystemsResponse>
      listOperatingSystemsCallable;
  private final UnaryCallable<ListOperatingSystemsRequest, ListOperatingSystemsPagedResponse>
      listOperatingSystemsPagedCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonOperatingSystemServiceStub create(
      OperatingSystemServiceStubSettings settings) throws IOException {
    return new HttpJsonOperatingSystemServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonOperatingSystemServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonOperatingSystemServiceStub(
        OperatingSystemServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonOperatingSystemServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonOperatingSystemServiceStub(
        OperatingSystemServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonOperatingSystemServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonOperatingSystemServiceStub(
      OperatingSystemServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonOperatingSystemServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonOperatingSystemServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonOperatingSystemServiceStub(
      OperatingSystemServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<GetOperatingSystemRequest, OperatingSystem>
        getOperatingSystemTransportSettings =
            HttpJsonCallSettings.<GetOperatingSystemRequest, OperatingSystem>newBuilder()
                .setMethodDescriptor(getOperatingSystemMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<ListOperatingSystemsRequest, ListOperatingSystemsResponse>
        listOperatingSystemsTransportSettings =
            HttpJsonCallSettings
                .<ListOperatingSystemsRequest, ListOperatingSystemsResponse>newBuilder()
                .setMethodDescriptor(listOperatingSystemsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();

    this.getOperatingSystemCallable =
        callableFactory.createUnaryCallable(
            getOperatingSystemTransportSettings,
            settings.getOperatingSystemSettings(),
            clientContext);
    this.listOperatingSystemsCallable =
        callableFactory.createUnaryCallable(
            listOperatingSystemsTransportSettings,
            settings.listOperatingSystemsSettings(),
            clientContext);
    this.listOperatingSystemsPagedCallable =
        callableFactory.createPagedCallable(
            listOperatingSystemsTransportSettings,
            settings.listOperatingSystemsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(getOperatingSystemMethodDescriptor);
    methodDescriptors.add(listOperatingSystemsMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<GetOperatingSystemRequest, OperatingSystem> getOperatingSystemCallable() {
    return getOperatingSystemCallable;
  }

  @Override
  public UnaryCallable<ListOperatingSystemsRequest, ListOperatingSystemsResponse>
      listOperatingSystemsCallable() {
    return listOperatingSystemsCallable;
  }

  @Override
  public UnaryCallable<ListOperatingSystemsRequest, ListOperatingSystemsPagedResponse>
      listOperatingSystemsPagedCallable() {
    return listOperatingSystemsPagedCallable;
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
