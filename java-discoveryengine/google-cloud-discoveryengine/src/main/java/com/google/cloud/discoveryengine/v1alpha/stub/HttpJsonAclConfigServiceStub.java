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

package com.google.cloud.discoveryengine.v1alpha.stub;

import com.google.api.core.BetaApi;
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
import com.google.cloud.discoveryengine.v1alpha.AclConfig;
import com.google.cloud.discoveryengine.v1alpha.GetAclConfigRequest;
import com.google.cloud.discoveryengine.v1alpha.UpdateAclConfigRequest;
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
 * REST stub implementation for the AclConfigService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonAclConfigServiceStub extends AclConfigServiceStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<UpdateAclConfigRequest, AclConfig>
      updateAclConfigMethodDescriptor =
          ApiMethodDescriptor.<UpdateAclConfigRequest, AclConfig>newBuilder()
              .setFullMethodName(
                  "google.cloud.discoveryengine.v1alpha.AclConfigService/UpdateAclConfig")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateAclConfigRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{aclConfig.name=projects/*/locations/*/aclConfig}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateAclConfigRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "aclConfig.name", request.getAclConfig().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateAclConfigRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("aclConfig", request.getAclConfig(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<AclConfig>newBuilder()
                      .setDefaultInstance(AclConfig.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetAclConfigRequest, AclConfig>
      getAclConfigMethodDescriptor =
          ApiMethodDescriptor.<GetAclConfigRequest, AclConfig>newBuilder()
              .setFullMethodName(
                  "google.cloud.discoveryengine.v1alpha.AclConfigService/GetAclConfig")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetAclConfigRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{name=projects/*/locations/*/aclConfig}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetAclConfigRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetAclConfigRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<AclConfig>newBuilder()
                      .setDefaultInstance(AclConfig.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<UpdateAclConfigRequest, AclConfig> updateAclConfigCallable;
  private final UnaryCallable<GetAclConfigRequest, AclConfig> getAclConfigCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonAclConfigServiceStub create(AclConfigServiceStubSettings settings)
      throws IOException {
    return new HttpJsonAclConfigServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonAclConfigServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonAclConfigServiceStub(
        AclConfigServiceStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonAclConfigServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonAclConfigServiceStub(
        AclConfigServiceStubSettings.newHttpJsonBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonAclConfigServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonAclConfigServiceStub(
      AclConfigServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonAclConfigServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonAclConfigServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonAclConfigServiceStub(
      AclConfigServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<UpdateAclConfigRequest, AclConfig> updateAclConfigTransportSettings =
        HttpJsonCallSettings.<UpdateAclConfigRequest, AclConfig>newBuilder()
            .setMethodDescriptor(updateAclConfigMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("acl_config.name", String.valueOf(request.getAclConfig().getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetAclConfigRequest, AclConfig> getAclConfigTransportSettings =
        HttpJsonCallSettings.<GetAclConfigRequest, AclConfig>newBuilder()
            .setMethodDescriptor(getAclConfigMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();

    this.updateAclConfigCallable =
        callableFactory.createUnaryCallable(
            updateAclConfigTransportSettings, settings.updateAclConfigSettings(), clientContext);
    this.getAclConfigCallable =
        callableFactory.createUnaryCallable(
            getAclConfigTransportSettings, settings.getAclConfigSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(updateAclConfigMethodDescriptor);
    methodDescriptors.add(getAclConfigMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<UpdateAclConfigRequest, AclConfig> updateAclConfigCallable() {
    return updateAclConfigCallable;
  }

  @Override
  public UnaryCallable<GetAclConfigRequest, AclConfig> getAclConfigCallable() {
    return getAclConfigCallable;
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
