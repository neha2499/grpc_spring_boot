package com.assignment2.grpc.query3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: query3.proto")
public final class EduQueryThreeServiceGrpc {

  private EduQueryThreeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.assignment2.grpc.query3.EduQueryThreeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.assignment2.grpc.query3.EduQueryThreeRequest,
      com.assignment2.grpc.query3.EduQueryThreeResponse> getGetEduQueryThreeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEduQueryThree",
      requestType = com.assignment2.grpc.query3.EduQueryThreeRequest.class,
      responseType = com.assignment2.grpc.query3.EduQueryThreeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.assignment2.grpc.query3.EduQueryThreeRequest,
      com.assignment2.grpc.query3.EduQueryThreeResponse> getGetEduQueryThreeMethod() {
    io.grpc.MethodDescriptor<com.assignment2.grpc.query3.EduQueryThreeRequest, com.assignment2.grpc.query3.EduQueryThreeResponse> getGetEduQueryThreeMethod;
    if ((getGetEduQueryThreeMethod = EduQueryThreeServiceGrpc.getGetEduQueryThreeMethod) == null) {
      synchronized (EduQueryThreeServiceGrpc.class) {
        if ((getGetEduQueryThreeMethod = EduQueryThreeServiceGrpc.getGetEduQueryThreeMethod) == null) {
          EduQueryThreeServiceGrpc.getGetEduQueryThreeMethod = getGetEduQueryThreeMethod =
              io.grpc.MethodDescriptor.<com.assignment2.grpc.query3.EduQueryThreeRequest, com.assignment2.grpc.query3.EduQueryThreeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEduQueryThree"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment2.grpc.query3.EduQueryThreeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment2.grpc.query3.EduQueryThreeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EduQueryThreeServiceMethodDescriptorSupplier("GetEduQueryThree"))
              .build();
        }
      }
    }
    return getGetEduQueryThreeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EduQueryThreeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryThreeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryThreeServiceStub>() {
        @java.lang.Override
        public EduQueryThreeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryThreeServiceStub(channel, callOptions);
        }
      };
    return EduQueryThreeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EduQueryThreeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryThreeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryThreeServiceBlockingStub>() {
        @java.lang.Override
        public EduQueryThreeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryThreeServiceBlockingStub(channel, callOptions);
        }
      };
    return EduQueryThreeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EduQueryThreeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryThreeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryThreeServiceFutureStub>() {
        @java.lang.Override
        public EduQueryThreeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryThreeServiceFutureStub(channel, callOptions);
        }
      };
    return EduQueryThreeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EduQueryThreeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEduQueryThree(com.assignment2.grpc.query3.EduQueryThreeRequest request,
        io.grpc.stub.StreamObserver<com.assignment2.grpc.query3.EduQueryThreeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEduQueryThreeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEduQueryThreeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.assignment2.grpc.query3.EduQueryThreeRequest,
                com.assignment2.grpc.query3.EduQueryThreeResponse>(
                  this, METHODID_GET_EDU_QUERY_THREE)))
          .build();
    }
  }

  /**
   */
  public static final class EduQueryThreeServiceStub extends io.grpc.stub.AbstractAsyncStub<EduQueryThreeServiceStub> {
    private EduQueryThreeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryThreeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryThreeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEduQueryThree(com.assignment2.grpc.query3.EduQueryThreeRequest request,
        io.grpc.stub.StreamObserver<com.assignment2.grpc.query3.EduQueryThreeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEduQueryThreeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EduQueryThreeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EduQueryThreeServiceBlockingStub> {
    private EduQueryThreeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryThreeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryThreeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.assignment2.grpc.query3.EduQueryThreeResponse getEduQueryThree(com.assignment2.grpc.query3.EduQueryThreeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEduQueryThreeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EduQueryThreeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EduQueryThreeServiceFutureStub> {
    private EduQueryThreeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryThreeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryThreeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assignment2.grpc.query3.EduQueryThreeResponse> getEduQueryThree(
        com.assignment2.grpc.query3.EduQueryThreeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEduQueryThreeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EDU_QUERY_THREE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EduQueryThreeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EduQueryThreeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EDU_QUERY_THREE:
          serviceImpl.getEduQueryThree((com.assignment2.grpc.query3.EduQueryThreeRequest) request,
              (io.grpc.stub.StreamObserver<com.assignment2.grpc.query3.EduQueryThreeResponse>) responseObserver);
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

  private static abstract class EduQueryThreeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EduQueryThreeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.assignment2.grpc.query3.Query3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EduQueryThreeService");
    }
  }

  private static final class EduQueryThreeServiceFileDescriptorSupplier
      extends EduQueryThreeServiceBaseDescriptorSupplier {
    EduQueryThreeServiceFileDescriptorSupplier() {}
  }

  private static final class EduQueryThreeServiceMethodDescriptorSupplier
      extends EduQueryThreeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EduQueryThreeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EduQueryThreeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EduQueryThreeServiceFileDescriptorSupplier())
              .addMethod(getGetEduQueryThreeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
