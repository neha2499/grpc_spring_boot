package com.assignment2.grpc.query4;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: query4.proto")
public final class EduQueryFourServiceGrpc {

  private EduQueryFourServiceGrpc() {}

  public static final String SERVICE_NAME = "com.assignment2.grpc.query4.EduQueryFourService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.assignment2.grpc.query4.EduQueryFourRequest,
      com.assignment2.grpc.query4.EduQueryFourResponse> getGetEduQueryFourMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEduQueryFour",
      requestType = com.assignment2.grpc.query4.EduQueryFourRequest.class,
      responseType = com.assignment2.grpc.query4.EduQueryFourResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.assignment2.grpc.query4.EduQueryFourRequest,
      com.assignment2.grpc.query4.EduQueryFourResponse> getGetEduQueryFourMethod() {
    io.grpc.MethodDescriptor<com.assignment2.grpc.query4.EduQueryFourRequest, com.assignment2.grpc.query4.EduQueryFourResponse> getGetEduQueryFourMethod;
    if ((getGetEduQueryFourMethod = EduQueryFourServiceGrpc.getGetEduQueryFourMethod) == null) {
      synchronized (EduQueryFourServiceGrpc.class) {
        if ((getGetEduQueryFourMethod = EduQueryFourServiceGrpc.getGetEduQueryFourMethod) == null) {
          EduQueryFourServiceGrpc.getGetEduQueryFourMethod = getGetEduQueryFourMethod =
              io.grpc.MethodDescriptor.<com.assignment2.grpc.query4.EduQueryFourRequest, com.assignment2.grpc.query4.EduQueryFourResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEduQueryFour"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment2.grpc.query4.EduQueryFourRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment2.grpc.query4.EduQueryFourResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EduQueryFourServiceMethodDescriptorSupplier("GetEduQueryFour"))
              .build();
        }
      }
    }
    return getGetEduQueryFourMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EduQueryFourServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryFourServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryFourServiceStub>() {
        @java.lang.Override
        public EduQueryFourServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryFourServiceStub(channel, callOptions);
        }
      };
    return EduQueryFourServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EduQueryFourServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryFourServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryFourServiceBlockingStub>() {
        @java.lang.Override
        public EduQueryFourServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryFourServiceBlockingStub(channel, callOptions);
        }
      };
    return EduQueryFourServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EduQueryFourServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryFourServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryFourServiceFutureStub>() {
        @java.lang.Override
        public EduQueryFourServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryFourServiceFutureStub(channel, callOptions);
        }
      };
    return EduQueryFourServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EduQueryFourServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEduQueryFour(com.assignment2.grpc.query4.EduQueryFourRequest request,
        io.grpc.stub.StreamObserver<com.assignment2.grpc.query4.EduQueryFourResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEduQueryFourMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEduQueryFourMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.assignment2.grpc.query4.EduQueryFourRequest,
                com.assignment2.grpc.query4.EduQueryFourResponse>(
                  this, METHODID_GET_EDU_QUERY_FOUR)))
          .build();
    }
  }

  /**
   */
  public static final class EduQueryFourServiceStub extends io.grpc.stub.AbstractAsyncStub<EduQueryFourServiceStub> {
    private EduQueryFourServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryFourServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryFourServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEduQueryFour(com.assignment2.grpc.query4.EduQueryFourRequest request,
        io.grpc.stub.StreamObserver<com.assignment2.grpc.query4.EduQueryFourResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEduQueryFourMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EduQueryFourServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EduQueryFourServiceBlockingStub> {
    private EduQueryFourServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryFourServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryFourServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.assignment2.grpc.query4.EduQueryFourResponse getEduQueryFour(com.assignment2.grpc.query4.EduQueryFourRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEduQueryFourMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EduQueryFourServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EduQueryFourServiceFutureStub> {
    private EduQueryFourServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryFourServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryFourServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assignment2.grpc.query4.EduQueryFourResponse> getEduQueryFour(
        com.assignment2.grpc.query4.EduQueryFourRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEduQueryFourMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EDU_QUERY_FOUR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EduQueryFourServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EduQueryFourServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EDU_QUERY_FOUR:
          serviceImpl.getEduQueryFour((com.assignment2.grpc.query4.EduQueryFourRequest) request,
              (io.grpc.stub.StreamObserver<com.assignment2.grpc.query4.EduQueryFourResponse>) responseObserver);
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

  private static abstract class EduQueryFourServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EduQueryFourServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.assignment2.grpc.query4.Query4.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EduQueryFourService");
    }
  }

  private static final class EduQueryFourServiceFileDescriptorSupplier
      extends EduQueryFourServiceBaseDescriptorSupplier {
    EduQueryFourServiceFileDescriptorSupplier() {}
  }

  private static final class EduQueryFourServiceMethodDescriptorSupplier
      extends EduQueryFourServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EduQueryFourServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EduQueryFourServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EduQueryFourServiceFileDescriptorSupplier())
              .addMethod(getGetEduQueryFourMethod())
              .build();
        }
      }
    }
    return result;
  }
}
