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

package com.google.cloud.dataproc.v1;

import static com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient.ListWorkflowTemplatesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings;
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
 * Settings class to configure an instance of {@link WorkflowTemplateServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dataproc.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createWorkflowTemplate:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * WorkflowTemplateServiceSettings.Builder workflowTemplateServiceSettingsBuilder =
 *     WorkflowTemplateServiceSettings.newBuilder();
 * workflowTemplateServiceSettingsBuilder
 *     .createWorkflowTemplateSettings()
 *     .setRetrySettings(
 *         workflowTemplateServiceSettingsBuilder
 *             .createWorkflowTemplateSettings()
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
 * WorkflowTemplateServiceSettings workflowTemplateServiceSettings =
 *     workflowTemplateServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for instantiateWorkflowTemplate:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * WorkflowTemplateServiceSettings.Builder workflowTemplateServiceSettingsBuilder =
 *     WorkflowTemplateServiceSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * workflowTemplateServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class WorkflowTemplateServiceSettings
    extends ClientSettings<WorkflowTemplateServiceSettings> {

  /** Returns the object with the settings used for calls to createWorkflowTemplate. */
  public UnaryCallSettings<CreateWorkflowTemplateRequest, WorkflowTemplate>
      createWorkflowTemplateSettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings())
        .createWorkflowTemplateSettings();
  }

  /** Returns the object with the settings used for calls to getWorkflowTemplate. */
  public UnaryCallSettings<GetWorkflowTemplateRequest, WorkflowTemplate>
      getWorkflowTemplateSettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings()).getWorkflowTemplateSettings();
  }

  /** Returns the object with the settings used for calls to instantiateWorkflowTemplate. */
  public UnaryCallSettings<InstantiateWorkflowTemplateRequest, Operation>
      instantiateWorkflowTemplateSettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings())
        .instantiateWorkflowTemplateSettings();
  }

  /** Returns the object with the settings used for calls to instantiateWorkflowTemplate. */
  public OperationCallSettings<InstantiateWorkflowTemplateRequest, Empty, WorkflowMetadata>
      instantiateWorkflowTemplateOperationSettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings())
        .instantiateWorkflowTemplateOperationSettings();
  }

  /** Returns the object with the settings used for calls to instantiateInlineWorkflowTemplate. */
  public UnaryCallSettings<InstantiateInlineWorkflowTemplateRequest, Operation>
      instantiateInlineWorkflowTemplateSettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings())
        .instantiateInlineWorkflowTemplateSettings();
  }

  /** Returns the object with the settings used for calls to instantiateInlineWorkflowTemplate. */
  public OperationCallSettings<InstantiateInlineWorkflowTemplateRequest, Empty, WorkflowMetadata>
      instantiateInlineWorkflowTemplateOperationSettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings())
        .instantiateInlineWorkflowTemplateOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateWorkflowTemplate. */
  public UnaryCallSettings<UpdateWorkflowTemplateRequest, WorkflowTemplate>
      updateWorkflowTemplateSettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings())
        .updateWorkflowTemplateSettings();
  }

  /** Returns the object with the settings used for calls to listWorkflowTemplates. */
  public PagedCallSettings<
          ListWorkflowTemplatesRequest,
          ListWorkflowTemplatesResponse,
          ListWorkflowTemplatesPagedResponse>
      listWorkflowTemplatesSettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings())
        .listWorkflowTemplatesSettings();
  }

  /** Returns the object with the settings used for calls to deleteWorkflowTemplate. */
  public UnaryCallSettings<DeleteWorkflowTemplateRequest, Empty> deleteWorkflowTemplateSettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings())
        .deleteWorkflowTemplateSettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings()).setIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings()).getIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return ((WorkflowTemplateServiceStubSettings) getStubSettings()).testIamPermissionsSettings();
  }

  public static final WorkflowTemplateServiceSettings create(
      WorkflowTemplateServiceStubSettings stub) throws IOException {
    return new WorkflowTemplateServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return WorkflowTemplateServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return WorkflowTemplateServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return WorkflowTemplateServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return WorkflowTemplateServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return WorkflowTemplateServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return WorkflowTemplateServiceStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return WorkflowTemplateServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return WorkflowTemplateServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected WorkflowTemplateServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for WorkflowTemplateServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<WorkflowTemplateServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(WorkflowTemplateServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(WorkflowTemplateServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(WorkflowTemplateServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(WorkflowTemplateServiceStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(WorkflowTemplateServiceStubSettings.newHttpJsonBuilder());
    }

    public WorkflowTemplateServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((WorkflowTemplateServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createWorkflowTemplate. */
    public UnaryCallSettings.Builder<CreateWorkflowTemplateRequest, WorkflowTemplate>
        createWorkflowTemplateSettings() {
      return getStubSettingsBuilder().createWorkflowTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to getWorkflowTemplate. */
    public UnaryCallSettings.Builder<GetWorkflowTemplateRequest, WorkflowTemplate>
        getWorkflowTemplateSettings() {
      return getStubSettingsBuilder().getWorkflowTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to instantiateWorkflowTemplate. */
    public UnaryCallSettings.Builder<InstantiateWorkflowTemplateRequest, Operation>
        instantiateWorkflowTemplateSettings() {
      return getStubSettingsBuilder().instantiateWorkflowTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to instantiateWorkflowTemplate. */
    public OperationCallSettings.Builder<
            InstantiateWorkflowTemplateRequest, Empty, WorkflowMetadata>
        instantiateWorkflowTemplateOperationSettings() {
      return getStubSettingsBuilder().instantiateWorkflowTemplateOperationSettings();
    }

    /** Returns the builder for the settings used for calls to instantiateInlineWorkflowTemplate. */
    public UnaryCallSettings.Builder<InstantiateInlineWorkflowTemplateRequest, Operation>
        instantiateInlineWorkflowTemplateSettings() {
      return getStubSettingsBuilder().instantiateInlineWorkflowTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to instantiateInlineWorkflowTemplate. */
    public OperationCallSettings.Builder<
            InstantiateInlineWorkflowTemplateRequest, Empty, WorkflowMetadata>
        instantiateInlineWorkflowTemplateOperationSettings() {
      return getStubSettingsBuilder().instantiateInlineWorkflowTemplateOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateWorkflowTemplate. */
    public UnaryCallSettings.Builder<UpdateWorkflowTemplateRequest, WorkflowTemplate>
        updateWorkflowTemplateSettings() {
      return getStubSettingsBuilder().updateWorkflowTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to listWorkflowTemplates. */
    public PagedCallSettings.Builder<
            ListWorkflowTemplatesRequest,
            ListWorkflowTemplatesResponse,
            ListWorkflowTemplatesPagedResponse>
        listWorkflowTemplatesSettings() {
      return getStubSettingsBuilder().listWorkflowTemplatesSettings();
    }

    /** Returns the builder for the settings used for calls to deleteWorkflowTemplate. */
    public UnaryCallSettings.Builder<DeleteWorkflowTemplateRequest, Empty>
        deleteWorkflowTemplateSettings() {
      return getStubSettingsBuilder().deleteWorkflowTemplateSettings();
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
    public WorkflowTemplateServiceSettings build() throws IOException {
      return new WorkflowTemplateServiceSettings(this);
    }
  }
}
