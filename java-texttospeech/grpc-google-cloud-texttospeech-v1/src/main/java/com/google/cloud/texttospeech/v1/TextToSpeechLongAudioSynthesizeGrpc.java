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
package com.google.cloud.texttospeech.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Service that implements Google Cloud Text-to-Speech API.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/texttospeech/v1/cloud_tts_lrs.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TextToSpeechLongAudioSynthesizeGrpc {

  private TextToSpeechLongAudioSynthesizeGrpc() {}

  public static final java.lang.String SERVICE_NAME =
      "google.cloud.texttospeech.v1.TextToSpeechLongAudioSynthesize";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest,
          com.google.longrunning.Operation>
      getSynthesizeLongAudioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SynthesizeLongAudio",
      requestType = com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest,
          com.google.longrunning.Operation>
      getSynthesizeLongAudioMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest,
            com.google.longrunning.Operation>
        getSynthesizeLongAudioMethod;
    if ((getSynthesizeLongAudioMethod =
            TextToSpeechLongAudioSynthesizeGrpc.getSynthesizeLongAudioMethod)
        == null) {
      synchronized (TextToSpeechLongAudioSynthesizeGrpc.class) {
        if ((getSynthesizeLongAudioMethod =
                TextToSpeechLongAudioSynthesizeGrpc.getSynthesizeLongAudioMethod)
            == null) {
          TextToSpeechLongAudioSynthesizeGrpc.getSynthesizeLongAudioMethod =
              getSynthesizeLongAudioMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "SynthesizeLongAudio"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new TextToSpeechLongAudioSynthesizeMethodDescriptorSupplier(
                              "SynthesizeLongAudio"))
                      .build();
        }
      }
    }
    return getSynthesizeLongAudioMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static TextToSpeechLongAudioSynthesizeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextToSpeechLongAudioSynthesizeStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<TextToSpeechLongAudioSynthesizeStub>() {
          @java.lang.Override
          public TextToSpeechLongAudioSynthesizeStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TextToSpeechLongAudioSynthesizeStub(channel, callOptions);
          }
        };
    return TextToSpeechLongAudioSynthesizeStub.newStub(factory, channel);
  }

  /** Creates a new blocking-style stub that supports all types of calls on the service */
  public static TextToSpeechLongAudioSynthesizeBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextToSpeechLongAudioSynthesizeBlockingV2Stub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<TextToSpeechLongAudioSynthesizeBlockingV2Stub>() {
          @java.lang.Override
          public TextToSpeechLongAudioSynthesizeBlockingV2Stub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TextToSpeechLongAudioSynthesizeBlockingV2Stub(channel, callOptions);
          }
        };
    return TextToSpeechLongAudioSynthesizeBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextToSpeechLongAudioSynthesizeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextToSpeechLongAudioSynthesizeBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<TextToSpeechLongAudioSynthesizeBlockingStub>() {
          @java.lang.Override
          public TextToSpeechLongAudioSynthesizeBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TextToSpeechLongAudioSynthesizeBlockingStub(channel, callOptions);
          }
        };
    return TextToSpeechLongAudioSynthesizeBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static TextToSpeechLongAudioSynthesizeFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextToSpeechLongAudioSynthesizeFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<TextToSpeechLongAudioSynthesizeFutureStub>() {
          @java.lang.Override
          public TextToSpeechLongAudioSynthesizeFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TextToSpeechLongAudioSynthesizeFutureStub(channel, callOptions);
          }
        };
    return TextToSpeechLongAudioSynthesizeFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Service that implements Google Cloud Text-to-Speech API.
   * </pre>
   */
  public interface AsyncService {

    /**
     *
     *
     * <pre>
     * Synthesizes long form text asynchronously.
     * </pre>
     */
    default void synthesizeLongAudio(
        com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getSynthesizeLongAudioMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TextToSpeechLongAudioSynthesize.
   *
   * <pre>
   * Service that implements Google Cloud Text-to-Speech API.
   * </pre>
   */
  public abstract static class TextToSpeechLongAudioSynthesizeImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return TextToSpeechLongAudioSynthesizeGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service
   * TextToSpeechLongAudioSynthesize.
   *
   * <pre>
   * Service that implements Google Cloud Text-to-Speech API.
   * </pre>
   */
  public static final class TextToSpeechLongAudioSynthesizeStub
      extends io.grpc.stub.AbstractAsyncStub<TextToSpeechLongAudioSynthesizeStub> {
    private TextToSpeechLongAudioSynthesizeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextToSpeechLongAudioSynthesizeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextToSpeechLongAudioSynthesizeStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Synthesizes long form text asynchronously.
     * </pre>
     */
    public void synthesizeLongAudio(
        com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSynthesizeLongAudioMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TextToSpeechLongAudioSynthesize.
   *
   * <pre>
   * Service that implements Google Cloud Text-to-Speech API.
   * </pre>
   */
  public static final class TextToSpeechLongAudioSynthesizeBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TextToSpeechLongAudioSynthesizeBlockingV2Stub> {
    private TextToSpeechLongAudioSynthesizeBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextToSpeechLongAudioSynthesizeBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextToSpeechLongAudioSynthesizeBlockingV2Stub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Synthesizes long form text asynchronously.
     * </pre>
     */
    public com.google.longrunning.Operation synthesizeLongAudio(
        com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSynthesizeLongAudioMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service
   * TextToSpeechLongAudioSynthesize.
   *
   * <pre>
   * Service that implements Google Cloud Text-to-Speech API.
   * </pre>
   */
  public static final class TextToSpeechLongAudioSynthesizeBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TextToSpeechLongAudioSynthesizeBlockingStub> {
    private TextToSpeechLongAudioSynthesizeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextToSpeechLongAudioSynthesizeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextToSpeechLongAudioSynthesizeBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Synthesizes long form text asynchronously.
     * </pre>
     */
    public com.google.longrunning.Operation synthesizeLongAudio(
        com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSynthesizeLongAudioMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service
   * TextToSpeechLongAudioSynthesize.
   *
   * <pre>
   * Service that implements Google Cloud Text-to-Speech API.
   * </pre>
   */
  public static final class TextToSpeechLongAudioSynthesizeFutureStub
      extends io.grpc.stub.AbstractFutureStub<TextToSpeechLongAudioSynthesizeFutureStub> {
    private TextToSpeechLongAudioSynthesizeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextToSpeechLongAudioSynthesizeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextToSpeechLongAudioSynthesizeFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Synthesizes long form text asynchronously.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        synthesizeLongAudio(com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSynthesizeLongAudioMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SYNTHESIZE_LONG_AUDIO = 0;

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
        case METHODID_SYNTHESIZE_LONG_AUDIO:
          serviceImpl.synthesizeLongAudio(
              (com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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
            getSynthesizeLongAudioMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.texttospeech.v1.SynthesizeLongAudioRequest,
                    com.google.longrunning.Operation>(service, METHODID_SYNTHESIZE_LONG_AUDIO)))
        .build();
  }

  private abstract static class TextToSpeechLongAudioSynthesizeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextToSpeechLongAudioSynthesizeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.texttospeech.v1.TextToSpeechLongAudioSynthesisProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextToSpeechLongAudioSynthesize");
    }
  }

  private static final class TextToSpeechLongAudioSynthesizeFileDescriptorSupplier
      extends TextToSpeechLongAudioSynthesizeBaseDescriptorSupplier {
    TextToSpeechLongAudioSynthesizeFileDescriptorSupplier() {}
  }

  private static final class TextToSpeechLongAudioSynthesizeMethodDescriptorSupplier
      extends TextToSpeechLongAudioSynthesizeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TextToSpeechLongAudioSynthesizeMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TextToSpeechLongAudioSynthesizeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(
                          new TextToSpeechLongAudioSynthesizeFileDescriptorSupplier())
                      .addMethod(getSynthesizeLongAudioMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
