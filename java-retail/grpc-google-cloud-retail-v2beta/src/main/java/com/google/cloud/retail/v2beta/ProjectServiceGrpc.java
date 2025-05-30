/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.retail.v2beta;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Service for settings at Project level.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/retail/v2beta/project_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectServiceGrpc {

  private ProjectServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.cloud.retail.v2beta.ProjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.retail.v2beta.GetAlertConfigRequest,
          com.google.cloud.retail.v2beta.AlertConfig>
      getGetAlertConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlertConfig",
      requestType = com.google.cloud.retail.v2beta.GetAlertConfigRequest.class,
      responseType = com.google.cloud.retail.v2beta.AlertConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.retail.v2beta.GetAlertConfigRequest,
          com.google.cloud.retail.v2beta.AlertConfig>
      getGetAlertConfigMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.retail.v2beta.GetAlertConfigRequest,
            com.google.cloud.retail.v2beta.AlertConfig>
        getGetAlertConfigMethod;
    if ((getGetAlertConfigMethod = ProjectServiceGrpc.getGetAlertConfigMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetAlertConfigMethod = ProjectServiceGrpc.getGetAlertConfigMethod) == null) {
          ProjectServiceGrpc.getGetAlertConfigMethod =
              getGetAlertConfigMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.retail.v2beta.GetAlertConfigRequest,
                          com.google.cloud.retail.v2beta.AlertConfig>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAlertConfig"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.retail.v2beta.GetAlertConfigRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.retail.v2beta.AlertConfig.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ProjectServiceMethodDescriptorSupplier("GetAlertConfig"))
                      .build();
        }
      }
    }
    return getGetAlertConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.retail.v2beta.UpdateAlertConfigRequest,
          com.google.cloud.retail.v2beta.AlertConfig>
      getUpdateAlertConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAlertConfig",
      requestType = com.google.cloud.retail.v2beta.UpdateAlertConfigRequest.class,
      responseType = com.google.cloud.retail.v2beta.AlertConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.retail.v2beta.UpdateAlertConfigRequest,
          com.google.cloud.retail.v2beta.AlertConfig>
      getUpdateAlertConfigMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.retail.v2beta.UpdateAlertConfigRequest,
            com.google.cloud.retail.v2beta.AlertConfig>
        getUpdateAlertConfigMethod;
    if ((getUpdateAlertConfigMethod = ProjectServiceGrpc.getUpdateAlertConfigMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateAlertConfigMethod = ProjectServiceGrpc.getUpdateAlertConfigMethod) == null) {
          ProjectServiceGrpc.getUpdateAlertConfigMethod =
              getUpdateAlertConfigMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.retail.v2beta.UpdateAlertConfigRequest,
                          com.google.cloud.retail.v2beta.AlertConfig>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAlertConfig"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.retail.v2beta.UpdateAlertConfigRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.retail.v2beta.AlertConfig.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ProjectServiceMethodDescriptorSupplier("UpdateAlertConfig"))
                      .build();
        }
      }
    }
    return getUpdateAlertConfigMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static ProjectServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub>() {
          @java.lang.Override
          public ProjectServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ProjectServiceStub(channel, callOptions);
          }
        };
    return ProjectServiceStub.newStub(factory, channel);
  }

  /** Creates a new blocking-style stub that supports all types of calls on the service */
  public static ProjectServiceBlockingV2Stub newBlockingV2Stub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingV2Stub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingV2Stub>() {
          @java.lang.Override
          public ProjectServiceBlockingV2Stub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ProjectServiceBlockingV2Stub(channel, callOptions);
          }
        };
    return ProjectServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub>() {
          @java.lang.Override
          public ProjectServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ProjectServiceBlockingStub(channel, callOptions);
          }
        };
    return ProjectServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static ProjectServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub>() {
          @java.lang.Override
          public ProjectServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ProjectServiceFutureStub(channel, callOptions);
          }
        };
    return ProjectServiceFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Service for settings at Project level.
   * </pre>
   */
  public interface AsyncService {

    /**
     *
     *
     * <pre>
     * Get the [AlertConfig][google.cloud.retail.v2beta.AlertConfig] of the
     * requested project.
     * </pre>
     */
    default void getAlertConfig(
        com.google.cloud.retail.v2beta.GetAlertConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.retail.v2beta.AlertConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetAlertConfigMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Update the alert config of the requested project.
     * </pre>
     */
    default void updateAlertConfig(
        com.google.cloud.retail.v2beta.UpdateAlertConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.retail.v2beta.AlertConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUpdateAlertConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProjectService.
   *
   * <pre>
   * Service for settings at Project level.
   * </pre>
   */
  public abstract static class ProjectServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return ProjectServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProjectService.
   *
   * <pre>
   * Service for settings at Project level.
   * </pre>
   */
  public static final class ProjectServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProjectServiceStub> {
    private ProjectServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Get the [AlertConfig][google.cloud.retail.v2beta.AlertConfig] of the
     * requested project.
     * </pre>
     */
    public void getAlertConfig(
        com.google.cloud.retail.v2beta.GetAlertConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.retail.v2beta.AlertConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAlertConfigMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Update the alert config of the requested project.
     * </pre>
     */
    public void updateAlertConfig(
        com.google.cloud.retail.v2beta.UpdateAlertConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.retail.v2beta.AlertConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAlertConfigMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProjectService.
   *
   * <pre>
   * Service for settings at Project level.
   * </pre>
   */
  public static final class ProjectServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProjectServiceBlockingV2Stub> {
    private ProjectServiceBlockingV2Stub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Get the [AlertConfig][google.cloud.retail.v2beta.AlertConfig] of the
     * requested project.
     * </pre>
     */
    public com.google.cloud.retail.v2beta.AlertConfig getAlertConfig(
        com.google.cloud.retail.v2beta.GetAlertConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAlertConfigMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Update the alert config of the requested project.
     * </pre>
     */
    public com.google.cloud.retail.v2beta.AlertConfig updateAlertConfig(
        com.google.cloud.retail.v2beta.UpdateAlertConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAlertConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProjectService.
   *
   * <pre>
   * Service for settings at Project level.
   * </pre>
   */
  public static final class ProjectServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProjectServiceBlockingStub> {
    private ProjectServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Get the [AlertConfig][google.cloud.retail.v2beta.AlertConfig] of the
     * requested project.
     * </pre>
     */
    public com.google.cloud.retail.v2beta.AlertConfig getAlertConfig(
        com.google.cloud.retail.v2beta.GetAlertConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAlertConfigMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Update the alert config of the requested project.
     * </pre>
     */
    public com.google.cloud.retail.v2beta.AlertConfig updateAlertConfig(
        com.google.cloud.retail.v2beta.UpdateAlertConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAlertConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProjectService.
   *
   * <pre>
   * Service for settings at Project level.
   * </pre>
   */
  public static final class ProjectServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProjectServiceFutureStub> {
    private ProjectServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Get the [AlertConfig][google.cloud.retail.v2beta.AlertConfig] of the
     * requested project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.retail.v2beta.AlertConfig>
        getAlertConfig(com.google.cloud.retail.v2beta.GetAlertConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAlertConfigMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Update the alert config of the requested project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.retail.v2beta.AlertConfig>
        updateAlertConfig(com.google.cloud.retail.v2beta.UpdateAlertConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAlertConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALERT_CONFIG = 0;
  private static final int METHODID_UPDATE_ALERT_CONFIG = 1;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALERT_CONFIG:
          serviceImpl.getAlertConfig(
              (com.google.cloud.retail.v2beta.GetAlertConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.retail.v2beta.AlertConfig>)
                  responseObserver);
          break;
        case METHODID_UPDATE_ALERT_CONFIG:
          serviceImpl.updateAlertConfig(
              (com.google.cloud.retail.v2beta.UpdateAlertConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.retail.v2beta.AlertConfig>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
            getGetAlertConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.retail.v2beta.GetAlertConfigRequest,
                    com.google.cloud.retail.v2beta.AlertConfig>(
                    service, METHODID_GET_ALERT_CONFIG)))
        .addMethod(
            getUpdateAlertConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.retail.v2beta.UpdateAlertConfigRequest,
                    com.google.cloud.retail.v2beta.AlertConfig>(
                    service, METHODID_UPDATE_ALERT_CONFIG)))
        .build();
  }

  private abstract static class ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.retail.v2beta.ProjectServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectService");
    }
  }

  private static final class ProjectServiceFileDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier {
    ProjectServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectServiceMethodDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProjectServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new ProjectServiceFileDescriptorSupplier())
                      .addMethod(getGetAlertConfigMethod())
                      .addMethod(getUpdateAlertConfigMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
