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

package com.google.cloud.datacatalog.v1beta1.stub;

import static com.google.cloud.datacatalog.v1beta1.PolicyTagManagerClient.ListPolicyTagsPagedResponse;
import static com.google.cloud.datacatalog.v1beta1.PolicyTagManagerClient.ListTaxonomiesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest;
import com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest;
import com.google.cloud.datacatalog.v1beta1.DeletePolicyTagRequest;
import com.google.cloud.datacatalog.v1beta1.DeleteTaxonomyRequest;
import com.google.cloud.datacatalog.v1beta1.GetPolicyTagRequest;
import com.google.cloud.datacatalog.v1beta1.GetTaxonomyRequest;
import com.google.cloud.datacatalog.v1beta1.ListPolicyTagsRequest;
import com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse;
import com.google.cloud.datacatalog.v1beta1.ListTaxonomiesRequest;
import com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse;
import com.google.cloud.datacatalog.v1beta1.PolicyTag;
import com.google.cloud.datacatalog.v1beta1.Taxonomy;
import com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest;
import com.google.cloud.datacatalog.v1beta1.UpdateTaxonomyRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link PolicyTagManagerStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (datacatalog.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createTaxonomy:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * PolicyTagManagerStubSettings.Builder policyTagManagerSettingsBuilder =
 *     PolicyTagManagerStubSettings.newBuilder();
 * policyTagManagerSettingsBuilder
 *     .createTaxonomySettings()
 *     .setRetrySettings(
 *         policyTagManagerSettingsBuilder
 *             .createTaxonomySettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * PolicyTagManagerStubSettings policyTagManagerSettings = policyTagManagerSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class PolicyTagManagerStubSettings extends StubSettings<PolicyTagManagerStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateTaxonomyRequest, Taxonomy> createTaxonomySettings;
  private final UnaryCallSettings<DeleteTaxonomyRequest, Empty> deleteTaxonomySettings;
  private final UnaryCallSettings<UpdateTaxonomyRequest, Taxonomy> updateTaxonomySettings;
  private final PagedCallSettings<
          ListTaxonomiesRequest, ListTaxonomiesResponse, ListTaxonomiesPagedResponse>
      listTaxonomiesSettings;
  private final UnaryCallSettings<GetTaxonomyRequest, Taxonomy> getTaxonomySettings;
  private final UnaryCallSettings<CreatePolicyTagRequest, PolicyTag> createPolicyTagSettings;
  private final UnaryCallSettings<DeletePolicyTagRequest, Empty> deletePolicyTagSettings;
  private final UnaryCallSettings<UpdatePolicyTagRequest, PolicyTag> updatePolicyTagSettings;
  private final PagedCallSettings<
          ListPolicyTagsRequest, ListPolicyTagsResponse, ListPolicyTagsPagedResponse>
      listPolicyTagsSettings;
  private final UnaryCallSettings<GetPolicyTagRequest, PolicyTag> getPolicyTagSettings;
  private final UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings;
  private final UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings;
  private final UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings;

  private static final PagedListDescriptor<ListTaxonomiesRequest, ListTaxonomiesResponse, Taxonomy>
      LIST_TAXONOMIES_PAGE_STR_DESC =
          new PagedListDescriptor<ListTaxonomiesRequest, ListTaxonomiesResponse, Taxonomy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTaxonomiesRequest injectToken(ListTaxonomiesRequest payload, String token) {
              return ListTaxonomiesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTaxonomiesRequest injectPageSize(
                ListTaxonomiesRequest payload, int pageSize) {
              return ListTaxonomiesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTaxonomiesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTaxonomiesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Taxonomy> extractResources(ListTaxonomiesResponse payload) {
              return payload.getTaxonomiesList();
            }
          };

  private static final PagedListDescriptor<ListPolicyTagsRequest, ListPolicyTagsResponse, PolicyTag>
      LIST_POLICY_TAGS_PAGE_STR_DESC =
          new PagedListDescriptor<ListPolicyTagsRequest, ListPolicyTagsResponse, PolicyTag>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPolicyTagsRequest injectToken(ListPolicyTagsRequest payload, String token) {
              return ListPolicyTagsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListPolicyTagsRequest injectPageSize(
                ListPolicyTagsRequest payload, int pageSize) {
              return ListPolicyTagsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListPolicyTagsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListPolicyTagsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<PolicyTag> extractResources(ListPolicyTagsResponse payload) {
              return payload.getPolicyTagsList();
            }
          };

  private static final PagedListResponseFactory<
          ListTaxonomiesRequest, ListTaxonomiesResponse, ListTaxonomiesPagedResponse>
      LIST_TAXONOMIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTaxonomiesRequest, ListTaxonomiesResponse, ListTaxonomiesPagedResponse>() {
            @Override
            public ApiFuture<ListTaxonomiesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTaxonomiesRequest, ListTaxonomiesResponse> callable,
                ListTaxonomiesRequest request,
                ApiCallContext context,
                ApiFuture<ListTaxonomiesResponse> futureResponse) {
              PageContext<ListTaxonomiesRequest, ListTaxonomiesResponse, Taxonomy> pageContext =
                  PageContext.create(callable, LIST_TAXONOMIES_PAGE_STR_DESC, request, context);
              return ListTaxonomiesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListPolicyTagsRequest, ListPolicyTagsResponse, ListPolicyTagsPagedResponse>
      LIST_POLICY_TAGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPolicyTagsRequest, ListPolicyTagsResponse, ListPolicyTagsPagedResponse>() {
            @Override
            public ApiFuture<ListPolicyTagsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListPolicyTagsRequest, ListPolicyTagsResponse> callable,
                ListPolicyTagsRequest request,
                ApiCallContext context,
                ApiFuture<ListPolicyTagsResponse> futureResponse) {
              PageContext<ListPolicyTagsRequest, ListPolicyTagsResponse, PolicyTag> pageContext =
                  PageContext.create(callable, LIST_POLICY_TAGS_PAGE_STR_DESC, request, context);
              return ListPolicyTagsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createTaxonomy. */
  public UnaryCallSettings<CreateTaxonomyRequest, Taxonomy> createTaxonomySettings() {
    return createTaxonomySettings;
  }

  /** Returns the object with the settings used for calls to deleteTaxonomy. */
  public UnaryCallSettings<DeleteTaxonomyRequest, Empty> deleteTaxonomySettings() {
    return deleteTaxonomySettings;
  }

  /** Returns the object with the settings used for calls to updateTaxonomy. */
  public UnaryCallSettings<UpdateTaxonomyRequest, Taxonomy> updateTaxonomySettings() {
    return updateTaxonomySettings;
  }

  /** Returns the object with the settings used for calls to listTaxonomies. */
  public PagedCallSettings<
          ListTaxonomiesRequest, ListTaxonomiesResponse, ListTaxonomiesPagedResponse>
      listTaxonomiesSettings() {
    return listTaxonomiesSettings;
  }

  /** Returns the object with the settings used for calls to getTaxonomy. */
  public UnaryCallSettings<GetTaxonomyRequest, Taxonomy> getTaxonomySettings() {
    return getTaxonomySettings;
  }

  /** Returns the object with the settings used for calls to createPolicyTag. */
  public UnaryCallSettings<CreatePolicyTagRequest, PolicyTag> createPolicyTagSettings() {
    return createPolicyTagSettings;
  }

  /** Returns the object with the settings used for calls to deletePolicyTag. */
  public UnaryCallSettings<DeletePolicyTagRequest, Empty> deletePolicyTagSettings() {
    return deletePolicyTagSettings;
  }

  /** Returns the object with the settings used for calls to updatePolicyTag. */
  public UnaryCallSettings<UpdatePolicyTagRequest, PolicyTag> updatePolicyTagSettings() {
    return updatePolicyTagSettings;
  }

  /** Returns the object with the settings used for calls to listPolicyTags. */
  public PagedCallSettings<
          ListPolicyTagsRequest, ListPolicyTagsResponse, ListPolicyTagsPagedResponse>
      listPolicyTagsSettings() {
    return listPolicyTagsSettings;
  }

  /** Returns the object with the settings used for calls to getPolicyTag. */
  public UnaryCallSettings<GetPolicyTagRequest, PolicyTag> getPolicyTagSettings() {
    return getPolicyTagSettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  public PolicyTagManagerStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcPolicyTagManagerStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonPolicyTagManagerStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "datacatalog";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "datacatalog.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "datacatalog.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultGrpcApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(PolicyTagManagerStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(PolicyTagManagerStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return PolicyTagManagerStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected PolicyTagManagerStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createTaxonomySettings = settingsBuilder.createTaxonomySettings().build();
    deleteTaxonomySettings = settingsBuilder.deleteTaxonomySettings().build();
    updateTaxonomySettings = settingsBuilder.updateTaxonomySettings().build();
    listTaxonomiesSettings = settingsBuilder.listTaxonomiesSettings().build();
    getTaxonomySettings = settingsBuilder.getTaxonomySettings().build();
    createPolicyTagSettings = settingsBuilder.createPolicyTagSettings().build();
    deletePolicyTagSettings = settingsBuilder.deletePolicyTagSettings().build();
    updatePolicyTagSettings = settingsBuilder.updatePolicyTagSettings().build();
    listPolicyTagsSettings = settingsBuilder.listPolicyTagsSettings().build();
    getPolicyTagSettings = settingsBuilder.getPolicyTagSettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
  }

  /** Builder for PolicyTagManagerStubSettings. */
  public static class Builder extends StubSettings.Builder<PolicyTagManagerStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateTaxonomyRequest, Taxonomy> createTaxonomySettings;
    private final UnaryCallSettings.Builder<DeleteTaxonomyRequest, Empty> deleteTaxonomySettings;
    private final UnaryCallSettings.Builder<UpdateTaxonomyRequest, Taxonomy> updateTaxonomySettings;
    private final PagedCallSettings.Builder<
            ListTaxonomiesRequest, ListTaxonomiesResponse, ListTaxonomiesPagedResponse>
        listTaxonomiesSettings;
    private final UnaryCallSettings.Builder<GetTaxonomyRequest, Taxonomy> getTaxonomySettings;
    private final UnaryCallSettings.Builder<CreatePolicyTagRequest, PolicyTag>
        createPolicyTagSettings;
    private final UnaryCallSettings.Builder<DeletePolicyTagRequest, Empty> deletePolicyTagSettings;
    private final UnaryCallSettings.Builder<UpdatePolicyTagRequest, PolicyTag>
        updatePolicyTagSettings;
    private final PagedCallSettings.Builder<
            ListPolicyTagsRequest, ListPolicyTagsResponse, ListPolicyTagsPagedResponse>
        listPolicyTagsSettings;
    private final UnaryCallSettings.Builder<GetPolicyTagRequest, PolicyTag> getPolicyTagSettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings;
    private final UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createTaxonomySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteTaxonomySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateTaxonomySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listTaxonomiesSettings = PagedCallSettings.newBuilder(LIST_TAXONOMIES_PAGE_STR_FACT);
      getTaxonomySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createPolicyTagSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deletePolicyTagSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updatePolicyTagSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listPolicyTagsSettings = PagedCallSettings.newBuilder(LIST_POLICY_TAGS_PAGE_STR_FACT);
      getPolicyTagSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createTaxonomySettings,
              deleteTaxonomySettings,
              updateTaxonomySettings,
              listTaxonomiesSettings,
              getTaxonomySettings,
              createPolicyTagSettings,
              deletePolicyTagSettings,
              updatePolicyTagSettings,
              listPolicyTagsSettings,
              getPolicyTagSettings,
              getIamPolicySettings,
              setIamPolicySettings,
              testIamPermissionsSettings);
      initDefaults(this);
    }

    protected Builder(PolicyTagManagerStubSettings settings) {
      super(settings);

      createTaxonomySettings = settings.createTaxonomySettings.toBuilder();
      deleteTaxonomySettings = settings.deleteTaxonomySettings.toBuilder();
      updateTaxonomySettings = settings.updateTaxonomySettings.toBuilder();
      listTaxonomiesSettings = settings.listTaxonomiesSettings.toBuilder();
      getTaxonomySettings = settings.getTaxonomySettings.toBuilder();
      createPolicyTagSettings = settings.createPolicyTagSettings.toBuilder();
      deletePolicyTagSettings = settings.deletePolicyTagSettings.toBuilder();
      updatePolicyTagSettings = settings.updatePolicyTagSettings.toBuilder();
      listPolicyTagsSettings = settings.listPolicyTagsSettings.toBuilder();
      getPolicyTagSettings = settings.getPolicyTagSettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createTaxonomySettings,
              deleteTaxonomySettings,
              updateTaxonomySettings,
              listTaxonomiesSettings,
              getTaxonomySettings,
              createPolicyTagSettings,
              deletePolicyTagSettings,
              updatePolicyTagSettings,
              listPolicyTagsSettings,
              getPolicyTagSettings,
              getIamPolicySettings,
              setIamPolicySettings,
              testIamPermissionsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder createHttpJsonDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultHttpJsonTransportProviderBuilder().build());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultHttpJsonApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .createTaxonomySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteTaxonomySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateTaxonomySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listTaxonomiesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getTaxonomySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .createPolicyTagSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deletePolicyTagSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updatePolicyTagSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listPolicyTagsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getPolicyTagSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .testIamPermissionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createTaxonomy. */
    public UnaryCallSettings.Builder<CreateTaxonomyRequest, Taxonomy> createTaxonomySettings() {
      return createTaxonomySettings;
    }

    /** Returns the builder for the settings used for calls to deleteTaxonomy. */
    public UnaryCallSettings.Builder<DeleteTaxonomyRequest, Empty> deleteTaxonomySettings() {
      return deleteTaxonomySettings;
    }

    /** Returns the builder for the settings used for calls to updateTaxonomy. */
    public UnaryCallSettings.Builder<UpdateTaxonomyRequest, Taxonomy> updateTaxonomySettings() {
      return updateTaxonomySettings;
    }

    /** Returns the builder for the settings used for calls to listTaxonomies. */
    public PagedCallSettings.Builder<
            ListTaxonomiesRequest, ListTaxonomiesResponse, ListTaxonomiesPagedResponse>
        listTaxonomiesSettings() {
      return listTaxonomiesSettings;
    }

    /** Returns the builder for the settings used for calls to getTaxonomy. */
    public UnaryCallSettings.Builder<GetTaxonomyRequest, Taxonomy> getTaxonomySettings() {
      return getTaxonomySettings;
    }

    /** Returns the builder for the settings used for calls to createPolicyTag. */
    public UnaryCallSettings.Builder<CreatePolicyTagRequest, PolicyTag> createPolicyTagSettings() {
      return createPolicyTagSettings;
    }

    /** Returns the builder for the settings used for calls to deletePolicyTag. */
    public UnaryCallSettings.Builder<DeletePolicyTagRequest, Empty> deletePolicyTagSettings() {
      return deletePolicyTagSettings;
    }

    /** Returns the builder for the settings used for calls to updatePolicyTag. */
    public UnaryCallSettings.Builder<UpdatePolicyTagRequest, PolicyTag> updatePolicyTagSettings() {
      return updatePolicyTagSettings;
    }

    /** Returns the builder for the settings used for calls to listPolicyTags. */
    public PagedCallSettings.Builder<
            ListPolicyTagsRequest, ListPolicyTagsResponse, ListPolicyTagsPagedResponse>
        listPolicyTagsSettings() {
      return listPolicyTagsSettings;
    }

    /** Returns the builder for the settings used for calls to getPolicyTag. */
    public UnaryCallSettings.Builder<GetPolicyTagRequest, PolicyTag> getPolicyTagSettings() {
      return getPolicyTagSettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    @Override
    public PolicyTagManagerStubSettings build() throws IOException {
      return new PolicyTagManagerStubSettings(this);
    }
  }
}
