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

package com.google.cloud.notebooks.v1;

import static com.google.cloud.notebooks.v1.ManagedNotebookServiceClient.ListLocationsPagedResponse;
import static com.google.cloud.notebooks.v1.ManagedNotebookServiceClient.ListRuntimesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.notebooks.v1.stub.ManagedNotebookServiceStubSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ManagedNotebookServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (notebooks.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of getRuntime:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ManagedNotebookServiceSettings.Builder managedNotebookServiceSettingsBuilder =
 *     ManagedNotebookServiceSettings.newBuilder();
 * managedNotebookServiceSettingsBuilder
 *     .getRuntimeSettings()
 *     .setRetrySettings(
 *         managedNotebookServiceSettingsBuilder
 *             .getRuntimeSettings()
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
 * ManagedNotebookServiceSettings managedNotebookServiceSettings =
 *     managedNotebookServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for createRuntime:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ManagedNotebookServiceSettings.Builder managedNotebookServiceSettingsBuilder =
 *     ManagedNotebookServiceSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * managedNotebookServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class ManagedNotebookServiceSettings extends ClientSettings<ManagedNotebookServiceSettings> {

  /** Returns the object with the settings used for calls to listRuntimes. */
  public PagedCallSettings<ListRuntimesRequest, ListRuntimesResponse, ListRuntimesPagedResponse>
      listRuntimesSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).listRuntimesSettings();
  }

  /** Returns the object with the settings used for calls to getRuntime. */
  public UnaryCallSettings<GetRuntimeRequest, Runtime> getRuntimeSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).getRuntimeSettings();
  }

  /** Returns the object with the settings used for calls to createRuntime. */
  public UnaryCallSettings<CreateRuntimeRequest, Operation> createRuntimeSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).createRuntimeSettings();
  }

  /** Returns the object with the settings used for calls to createRuntime. */
  public OperationCallSettings<CreateRuntimeRequest, Runtime, OperationMetadata>
      createRuntimeOperationSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings())
        .createRuntimeOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateRuntime. */
  public UnaryCallSettings<UpdateRuntimeRequest, Operation> updateRuntimeSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).updateRuntimeSettings();
  }

  /** Returns the object with the settings used for calls to updateRuntime. */
  public OperationCallSettings<UpdateRuntimeRequest, Runtime, OperationMetadata>
      updateRuntimeOperationSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings())
        .updateRuntimeOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteRuntime. */
  public UnaryCallSettings<DeleteRuntimeRequest, Operation> deleteRuntimeSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).deleteRuntimeSettings();
  }

  /** Returns the object with the settings used for calls to deleteRuntime. */
  public OperationCallSettings<DeleteRuntimeRequest, Empty, OperationMetadata>
      deleteRuntimeOperationSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings())
        .deleteRuntimeOperationSettings();
  }

  /** Returns the object with the settings used for calls to startRuntime. */
  public UnaryCallSettings<StartRuntimeRequest, Operation> startRuntimeSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).startRuntimeSettings();
  }

  /** Returns the object with the settings used for calls to startRuntime. */
  public OperationCallSettings<StartRuntimeRequest, Runtime, OperationMetadata>
      startRuntimeOperationSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).startRuntimeOperationSettings();
  }

  /** Returns the object with the settings used for calls to stopRuntime. */
  public UnaryCallSettings<StopRuntimeRequest, Operation> stopRuntimeSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).stopRuntimeSettings();
  }

  /** Returns the object with the settings used for calls to stopRuntime. */
  public OperationCallSettings<StopRuntimeRequest, Runtime, OperationMetadata>
      stopRuntimeOperationSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).stopRuntimeOperationSettings();
  }

  /** Returns the object with the settings used for calls to switchRuntime. */
  public UnaryCallSettings<SwitchRuntimeRequest, Operation> switchRuntimeSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).switchRuntimeSettings();
  }

  /** Returns the object with the settings used for calls to switchRuntime. */
  public OperationCallSettings<SwitchRuntimeRequest, Runtime, OperationMetadata>
      switchRuntimeOperationSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings())
        .switchRuntimeOperationSettings();
  }

  /** Returns the object with the settings used for calls to resetRuntime. */
  public UnaryCallSettings<ResetRuntimeRequest, Operation> resetRuntimeSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).resetRuntimeSettings();
  }

  /** Returns the object with the settings used for calls to resetRuntime. */
  public OperationCallSettings<ResetRuntimeRequest, Runtime, OperationMetadata>
      resetRuntimeOperationSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).resetRuntimeOperationSettings();
  }

  /** Returns the object with the settings used for calls to upgradeRuntime. */
  public UnaryCallSettings<UpgradeRuntimeRequest, Operation> upgradeRuntimeSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).upgradeRuntimeSettings();
  }

  /** Returns the object with the settings used for calls to upgradeRuntime. */
  public OperationCallSettings<UpgradeRuntimeRequest, Runtime, OperationMetadata>
      upgradeRuntimeOperationSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings())
        .upgradeRuntimeOperationSettings();
  }

  /** Returns the object with the settings used for calls to reportRuntimeEvent. */
  public UnaryCallSettings<ReportRuntimeEventRequest, Operation> reportRuntimeEventSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).reportRuntimeEventSettings();
  }

  /** Returns the object with the settings used for calls to reportRuntimeEvent. */
  public OperationCallSettings<ReportRuntimeEventRequest, Runtime, OperationMetadata>
      reportRuntimeEventOperationSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings())
        .reportRuntimeEventOperationSettings();
  }

  /** Returns the object with the settings used for calls to refreshRuntimeTokenInternal. */
  public UnaryCallSettings<RefreshRuntimeTokenInternalRequest, RefreshRuntimeTokenInternalResponse>
      refreshRuntimeTokenInternalSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings())
        .refreshRuntimeTokenInternalSettings();
  }

  /** Returns the object with the settings used for calls to diagnoseRuntime. */
  public UnaryCallSettings<DiagnoseRuntimeRequest, Operation> diagnoseRuntimeSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).diagnoseRuntimeSettings();
  }

  /** Returns the object with the settings used for calls to diagnoseRuntime. */
  public OperationCallSettings<DiagnoseRuntimeRequest, Runtime, OperationMetadata>
      diagnoseRuntimeOperationSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings())
        .diagnoseRuntimeOperationSettings();
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).listLocationsSettings();
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).getLocationSettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).setIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).getIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return ((ManagedNotebookServiceStubSettings) getStubSettings()).testIamPermissionsSettings();
  }

  public static final ManagedNotebookServiceSettings create(ManagedNotebookServiceStubSettings stub)
      throws IOException {
    return new ManagedNotebookServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ManagedNotebookServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ManagedNotebookServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ManagedNotebookServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ManagedNotebookServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return ManagedNotebookServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ManagedNotebookServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ManagedNotebookServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected ManagedNotebookServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ManagedNotebookServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<ManagedNotebookServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(ManagedNotebookServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(ManagedNotebookServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ManagedNotebookServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(ManagedNotebookServiceStubSettings.newBuilder());
    }

    public ManagedNotebookServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((ManagedNotebookServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listRuntimes. */
    public PagedCallSettings.Builder<
            ListRuntimesRequest, ListRuntimesResponse, ListRuntimesPagedResponse>
        listRuntimesSettings() {
      return getStubSettingsBuilder().listRuntimesSettings();
    }

    /** Returns the builder for the settings used for calls to getRuntime. */
    public UnaryCallSettings.Builder<GetRuntimeRequest, Runtime> getRuntimeSettings() {
      return getStubSettingsBuilder().getRuntimeSettings();
    }

    /** Returns the builder for the settings used for calls to createRuntime. */
    public UnaryCallSettings.Builder<CreateRuntimeRequest, Operation> createRuntimeSettings() {
      return getStubSettingsBuilder().createRuntimeSettings();
    }

    /** Returns the builder for the settings used for calls to createRuntime. */
    public OperationCallSettings.Builder<CreateRuntimeRequest, Runtime, OperationMetadata>
        createRuntimeOperationSettings() {
      return getStubSettingsBuilder().createRuntimeOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateRuntime. */
    public UnaryCallSettings.Builder<UpdateRuntimeRequest, Operation> updateRuntimeSettings() {
      return getStubSettingsBuilder().updateRuntimeSettings();
    }

    /** Returns the builder for the settings used for calls to updateRuntime. */
    public OperationCallSettings.Builder<UpdateRuntimeRequest, Runtime, OperationMetadata>
        updateRuntimeOperationSettings() {
      return getStubSettingsBuilder().updateRuntimeOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteRuntime. */
    public UnaryCallSettings.Builder<DeleteRuntimeRequest, Operation> deleteRuntimeSettings() {
      return getStubSettingsBuilder().deleteRuntimeSettings();
    }

    /** Returns the builder for the settings used for calls to deleteRuntime. */
    public OperationCallSettings.Builder<DeleteRuntimeRequest, Empty, OperationMetadata>
        deleteRuntimeOperationSettings() {
      return getStubSettingsBuilder().deleteRuntimeOperationSettings();
    }

    /** Returns the builder for the settings used for calls to startRuntime. */
    public UnaryCallSettings.Builder<StartRuntimeRequest, Operation> startRuntimeSettings() {
      return getStubSettingsBuilder().startRuntimeSettings();
    }

    /** Returns the builder for the settings used for calls to startRuntime. */
    public OperationCallSettings.Builder<StartRuntimeRequest, Runtime, OperationMetadata>
        startRuntimeOperationSettings() {
      return getStubSettingsBuilder().startRuntimeOperationSettings();
    }

    /** Returns the builder for the settings used for calls to stopRuntime. */
    public UnaryCallSettings.Builder<StopRuntimeRequest, Operation> stopRuntimeSettings() {
      return getStubSettingsBuilder().stopRuntimeSettings();
    }

    /** Returns the builder for the settings used for calls to stopRuntime. */
    public OperationCallSettings.Builder<StopRuntimeRequest, Runtime, OperationMetadata>
        stopRuntimeOperationSettings() {
      return getStubSettingsBuilder().stopRuntimeOperationSettings();
    }

    /** Returns the builder for the settings used for calls to switchRuntime. */
    public UnaryCallSettings.Builder<SwitchRuntimeRequest, Operation> switchRuntimeSettings() {
      return getStubSettingsBuilder().switchRuntimeSettings();
    }

    /** Returns the builder for the settings used for calls to switchRuntime. */
    public OperationCallSettings.Builder<SwitchRuntimeRequest, Runtime, OperationMetadata>
        switchRuntimeOperationSettings() {
      return getStubSettingsBuilder().switchRuntimeOperationSettings();
    }

    /** Returns the builder for the settings used for calls to resetRuntime. */
    public UnaryCallSettings.Builder<ResetRuntimeRequest, Operation> resetRuntimeSettings() {
      return getStubSettingsBuilder().resetRuntimeSettings();
    }

    /** Returns the builder for the settings used for calls to resetRuntime. */
    public OperationCallSettings.Builder<ResetRuntimeRequest, Runtime, OperationMetadata>
        resetRuntimeOperationSettings() {
      return getStubSettingsBuilder().resetRuntimeOperationSettings();
    }

    /** Returns the builder for the settings used for calls to upgradeRuntime. */
    public UnaryCallSettings.Builder<UpgradeRuntimeRequest, Operation> upgradeRuntimeSettings() {
      return getStubSettingsBuilder().upgradeRuntimeSettings();
    }

    /** Returns the builder for the settings used for calls to upgradeRuntime. */
    public OperationCallSettings.Builder<UpgradeRuntimeRequest, Runtime, OperationMetadata>
        upgradeRuntimeOperationSettings() {
      return getStubSettingsBuilder().upgradeRuntimeOperationSettings();
    }

    /** Returns the builder for the settings used for calls to reportRuntimeEvent. */
    public UnaryCallSettings.Builder<ReportRuntimeEventRequest, Operation>
        reportRuntimeEventSettings() {
      return getStubSettingsBuilder().reportRuntimeEventSettings();
    }

    /** Returns the builder for the settings used for calls to reportRuntimeEvent. */
    public OperationCallSettings.Builder<ReportRuntimeEventRequest, Runtime, OperationMetadata>
        reportRuntimeEventOperationSettings() {
      return getStubSettingsBuilder().reportRuntimeEventOperationSettings();
    }

    /** Returns the builder for the settings used for calls to refreshRuntimeTokenInternal. */
    public UnaryCallSettings.Builder<
            RefreshRuntimeTokenInternalRequest, RefreshRuntimeTokenInternalResponse>
        refreshRuntimeTokenInternalSettings() {
      return getStubSettingsBuilder().refreshRuntimeTokenInternalSettings();
    }

    /** Returns the builder for the settings used for calls to diagnoseRuntime. */
    public UnaryCallSettings.Builder<DiagnoseRuntimeRequest, Operation> diagnoseRuntimeSettings() {
      return getStubSettingsBuilder().diagnoseRuntimeSettings();
    }

    /** Returns the builder for the settings used for calls to diagnoseRuntime. */
    public OperationCallSettings.Builder<DiagnoseRuntimeRequest, Runtime, OperationMetadata>
        diagnoseRuntimeOperationSettings() {
      return getStubSettingsBuilder().diagnoseRuntimeOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return getStubSettingsBuilder().listLocationsSettings();
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getStubSettingsBuilder().getLocationSettings();
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return getStubSettingsBuilder().setIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getStubSettingsBuilder().getIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return getStubSettingsBuilder().testIamPermissionsSettings();
    }

    @Override
    public ManagedNotebookServiceSettings build() throws IOException {
      return new ManagedNotebookServiceSettings(this);
    }
  }
}
