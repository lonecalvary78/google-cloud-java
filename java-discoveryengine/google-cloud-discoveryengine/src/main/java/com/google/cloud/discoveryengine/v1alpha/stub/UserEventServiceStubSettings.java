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

import com.google.api.HttpBody;
import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest;
import com.google.cloud.discoveryengine.v1alpha.ImportUserEventsMetadata;
import com.google.cloud.discoveryengine.v1alpha.ImportUserEventsRequest;
import com.google.cloud.discoveryengine.v1alpha.ImportUserEventsResponse;
import com.google.cloud.discoveryengine.v1alpha.PurgeUserEventsMetadata;
import com.google.cloud.discoveryengine.v1alpha.PurgeUserEventsRequest;
import com.google.cloud.discoveryengine.v1alpha.PurgeUserEventsResponse;
import com.google.cloud.discoveryengine.v1alpha.UserEvent;
import com.google.cloud.discoveryengine.v1alpha.WriteUserEventRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link UserEventServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (discoveryengine.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of writeUserEvent:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * UserEventServiceStubSettings.Builder userEventServiceSettingsBuilder =
 *     UserEventServiceStubSettings.newBuilder();
 * userEventServiceSettingsBuilder
 *     .writeUserEventSettings()
 *     .setRetrySettings(
 *         userEventServiceSettingsBuilder
 *             .writeUserEventSettings()
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
 * UserEventServiceStubSettings userEventServiceSettings = userEventServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for purgeUserEvents:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * UserEventServiceStubSettings.Builder userEventServiceSettingsBuilder =
 *     UserEventServiceStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * userEventServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class UserEventServiceStubSettings extends StubSettings<UserEventServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<WriteUserEventRequest, UserEvent> writeUserEventSettings;
  private final UnaryCallSettings<CollectUserEventRequest, HttpBody> collectUserEventSettings;
  private final UnaryCallSettings<PurgeUserEventsRequest, Operation> purgeUserEventsSettings;
  private final OperationCallSettings<
          PurgeUserEventsRequest, PurgeUserEventsResponse, PurgeUserEventsMetadata>
      purgeUserEventsOperationSettings;
  private final UnaryCallSettings<ImportUserEventsRequest, Operation> importUserEventsSettings;
  private final OperationCallSettings<
          ImportUserEventsRequest, ImportUserEventsResponse, ImportUserEventsMetadata>
      importUserEventsOperationSettings;

  /** Returns the object with the settings used for calls to writeUserEvent. */
  public UnaryCallSettings<WriteUserEventRequest, UserEvent> writeUserEventSettings() {
    return writeUserEventSettings;
  }

  /** Returns the object with the settings used for calls to collectUserEvent. */
  public UnaryCallSettings<CollectUserEventRequest, HttpBody> collectUserEventSettings() {
    return collectUserEventSettings;
  }

  /** Returns the object with the settings used for calls to purgeUserEvents. */
  public UnaryCallSettings<PurgeUserEventsRequest, Operation> purgeUserEventsSettings() {
    return purgeUserEventsSettings;
  }

  /** Returns the object with the settings used for calls to purgeUserEvents. */
  public OperationCallSettings<
          PurgeUserEventsRequest, PurgeUserEventsResponse, PurgeUserEventsMetadata>
      purgeUserEventsOperationSettings() {
    return purgeUserEventsOperationSettings;
  }

  /** Returns the object with the settings used for calls to importUserEvents. */
  public UnaryCallSettings<ImportUserEventsRequest, Operation> importUserEventsSettings() {
    return importUserEventsSettings;
  }

  /** Returns the object with the settings used for calls to importUserEvents. */
  public OperationCallSettings<
          ImportUserEventsRequest, ImportUserEventsResponse, ImportUserEventsMetadata>
      importUserEventsOperationSettings() {
    return importUserEventsOperationSettings;
  }

  public UserEventServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcUserEventServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonUserEventServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "discoveryengine";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "discoveryengine.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "discoveryengine.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(UserEventServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(UserEventServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return UserEventServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected UserEventServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    writeUserEventSettings = settingsBuilder.writeUserEventSettings().build();
    collectUserEventSettings = settingsBuilder.collectUserEventSettings().build();
    purgeUserEventsSettings = settingsBuilder.purgeUserEventsSettings().build();
    purgeUserEventsOperationSettings = settingsBuilder.purgeUserEventsOperationSettings().build();
    importUserEventsSettings = settingsBuilder.importUserEventsSettings().build();
    importUserEventsOperationSettings = settingsBuilder.importUserEventsOperationSettings().build();
  }

  /** Builder for UserEventServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<UserEventServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<WriteUserEventRequest, UserEvent>
        writeUserEventSettings;
    private final UnaryCallSettings.Builder<CollectUserEventRequest, HttpBody>
        collectUserEventSettings;
    private final UnaryCallSettings.Builder<PurgeUserEventsRequest, Operation>
        purgeUserEventsSettings;
    private final OperationCallSettings.Builder<
            PurgeUserEventsRequest, PurgeUserEventsResponse, PurgeUserEventsMetadata>
        purgeUserEventsOperationSettings;
    private final UnaryCallSettings.Builder<ImportUserEventsRequest, Operation>
        importUserEventsSettings;
    private final OperationCallSettings.Builder<
            ImportUserEventsRequest, ImportUserEventsResponse, ImportUserEventsMetadata>
        importUserEventsOperationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_1_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      definitions.put(
          "retry_policy_2_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(10000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(30000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(30000L))
              .setTotalTimeoutDuration(Duration.ofMillis(30000L))
              .build();
      definitions.put("retry_policy_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(30000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(300000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(300000L))
              .setTotalTimeoutDuration(Duration.ofMillis(300000L))
              .build();
      definitions.put("retry_policy_2_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      writeUserEventSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      collectUserEventSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      purgeUserEventsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      purgeUserEventsOperationSettings = OperationCallSettings.newBuilder();
      importUserEventsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      importUserEventsOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              writeUserEventSettings,
              collectUserEventSettings,
              purgeUserEventsSettings,
              importUserEventsSettings);
      initDefaults(this);
    }

    protected Builder(UserEventServiceStubSettings settings) {
      super(settings);

      writeUserEventSettings = settings.writeUserEventSettings.toBuilder();
      collectUserEventSettings = settings.collectUserEventSettings.toBuilder();
      purgeUserEventsSettings = settings.purgeUserEventsSettings.toBuilder();
      purgeUserEventsOperationSettings = settings.purgeUserEventsOperationSettings.toBuilder();
      importUserEventsSettings = settings.importUserEventsSettings.toBuilder();
      importUserEventsOperationSettings = settings.importUserEventsOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              writeUserEventSettings,
              collectUserEventSettings,
              purgeUserEventsSettings,
              importUserEventsSettings);
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
          .writeUserEventSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .collectUserEventSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .purgeUserEventsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .importUserEventsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .purgeUserEventsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PurgeUserEventsRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(PurgeUserEventsResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(PurgeUserEventsMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .importUserEventsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ImportUserEventsRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ImportUserEventsResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(ImportUserEventsMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

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

    /** Returns the builder for the settings used for calls to writeUserEvent. */
    public UnaryCallSettings.Builder<WriteUserEventRequest, UserEvent> writeUserEventSettings() {
      return writeUserEventSettings;
    }

    /** Returns the builder for the settings used for calls to collectUserEvent. */
    public UnaryCallSettings.Builder<CollectUserEventRequest, HttpBody> collectUserEventSettings() {
      return collectUserEventSettings;
    }

    /** Returns the builder for the settings used for calls to purgeUserEvents. */
    public UnaryCallSettings.Builder<PurgeUserEventsRequest, Operation> purgeUserEventsSettings() {
      return purgeUserEventsSettings;
    }

    /** Returns the builder for the settings used for calls to purgeUserEvents. */
    public OperationCallSettings.Builder<
            PurgeUserEventsRequest, PurgeUserEventsResponse, PurgeUserEventsMetadata>
        purgeUserEventsOperationSettings() {
      return purgeUserEventsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to importUserEvents. */
    public UnaryCallSettings.Builder<ImportUserEventsRequest, Operation>
        importUserEventsSettings() {
      return importUserEventsSettings;
    }

    /** Returns the builder for the settings used for calls to importUserEvents. */
    public OperationCallSettings.Builder<
            ImportUserEventsRequest, ImportUserEventsResponse, ImportUserEventsMetadata>
        importUserEventsOperationSettings() {
      return importUserEventsOperationSettings;
    }

    @Override
    public UserEventServiceStubSettings build() throws IOException {
      return new UserEventServiceStubSettings(this);
    }
  }
}
