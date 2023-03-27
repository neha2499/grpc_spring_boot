package com.assignment2.grpc.query1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: query1.proto")
public final class EduQueryOneServiceGrpc {

  private EduQueryOneServiceGrpc() {}

  public static final String SERVICE_NAME = "com.assignment2.grpc.query1.EduQueryOneService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.assignment2.grpc.query1.EduQueryOneRequest,
      com.assignment2.grpc.query1.EduQueryOneResponse> getGetEduQueryOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEduQueryOne",
      requestType = com.assignment2.grpc.query1.EduQueryOneRequest.class,
      responseType = com.assignment2.grpc.query1.EduQueryOneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.assignment2.grpc.query1.EduQueryOneRequest,
      com.assignment2.grpc.query1.EduQueryOneResponse> getGetEduQueryOneMethod() {
    io.grpc.MethodDescriptor<com.assignment2.grpc.query1.EduQueryOneRequest, com.assignment2.grpc.query1.EduQueryOneResponse> getGetEduQueryOneMethod;
    if ((getGetEduQueryOneMethod = EduQueryOneServiceGrpc.getGetEduQueryOneMethod) == null) {
      synchronized (EduQueryOneServiceGrpc.class) {
        if ((getGetEduQueryOneMethod = EduQueryOneServiceGrpc.getGetEduQueryOneMethod) == null) {
          EduQueryOneServiceGrpc.getGetEduQueryOneMethod = getGetEduQueryOneMethod =
              io.grpc.MethodDescriptor.<com.assignment2.grpc.query1.EduQueryOneRequest, com.assignment2.grpc.query1.EduQueryOneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEduQueryOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment2.grpc.query1.EduQueryOneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment2.grpc.query1.EduQueryOneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EduQueryOneServiceMethodDescriptorSupplier("GetEduQueryOne"))
              .build();
        }
      }
    }
    return getGetEduQueryOneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EduQueryOneServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryOneServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryOneServiceStub>() {
        @java.lang.Override
        public EduQueryOneServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryOneServiceStub(channel, callOptions);
        }
      };
    return EduQueryOneServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EduQueryOneServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryOneServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryOneServiceBlockingStub>() {
        @java.lang.Override
        public EduQueryOneServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryOneServiceBlockingStub(channel, callOptions);
        }
      };
    return EduQueryOneServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EduQueryOneServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryOneServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryOneServiceFutureStub>() {
        @java.lang.Override
        public EduQueryOneServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryOneServiceFutureStub(channel, callOptions);
        }
      };
    return EduQueryOneServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EduQueryOneServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEduQueryOne(com.assignment2.grpc.query1.EduQueryOneRequest request,
        io.grpc.stub.StreamObserver<com.assignment2.grpc.query1.EduQueryOneResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEduQueryOneMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEduQueryOneMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.assignment2.grpc.query1.EduQueryOneRequest,
                com.assignment2.grpc.query1.EduQueryOneResponse>(
                  this, METHODID_GET_EDU_QUERY_ONE)))
          .build();
    }
  }

  /**
   */
  public static final class EduQueryOneServiceStub extends io.grpc.stub.AbstractAsyncStub<EduQueryOneServiceStub> {
    private EduQueryOneServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryOneServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryOneServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEduQueryOne(com.assignment2.grpc.query1.EduQueryOneRequest request,
        io.grpc.stub.StreamObserver<com.assignment2.grpc.query1.EduQueryOneResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEduQueryOneMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EduQueryOneServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EduQueryOneServiceBlockingStub> {
    private EduQueryOneServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryOneServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryOneServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.assignment2.grpc.query1.EduQueryOneResponse getEduQueryOne(com.assignment2.grpc.query1.EduQueryOneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEduQueryOneMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EduQueryOneServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EduQueryOneServiceFutureStub> {
    private EduQueryOneServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryOneServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryOneServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assignment2.grpc.query1.EduQueryOneResponse> getEduQueryOne(
        com.assignment2.grpc.query1.EduQueryOneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEduQueryOneMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EDU_QUERY_ONE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EduQueryOneServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EduQueryOneServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EDU_QUERY_ONE:
          serviceImpl.getEduQueryOne((com.assignment2.grpc.query1.EduQueryOneRequest) request,
              (io.grpc.stub.StreamObserver<com.assignment2.grpc.query1.EduQueryOneResponse>) responseObserver);
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

  private static abstract class EduQueryOneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EduQueryOneServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.assignment2.grpc.query1.Query1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EduQueryOneService");
    }
  }

  private static final class EduQueryOneServiceFileDescriptorSupplier
      extends EduQueryOneServiceBaseDescriptorSupplier {
    EduQueryOneServiceFileDescriptorSupplier() {}
  }

  private static final class EduQueryOneServiceMethodDescriptorSupplier
      extends EduQueryOneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EduQueryOneServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EduQueryOneServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EduQueryOneServiceFileDescriptorSupplier())
              .addMethod(getGetEduQueryOneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
