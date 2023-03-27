package com.assignment2.grpc.query5;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: query5.proto")
public final class EduQueryFiveServiceGrpc {

  private EduQueryFiveServiceGrpc() {}

  public static final String SERVICE_NAME = "com.assignment2.grpc.query5.EduQueryFiveService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.assignment2.grpc.query5.EduQueryFiveRequest,
      com.assignment2.grpc.query5.EduQueryFiveResponse> getGetEduQueryFiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEduQueryFive",
      requestType = com.assignment2.grpc.query5.EduQueryFiveRequest.class,
      responseType = com.assignment2.grpc.query5.EduQueryFiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.assignment2.grpc.query5.EduQueryFiveRequest,
      com.assignment2.grpc.query5.EduQueryFiveResponse> getGetEduQueryFiveMethod() {
    io.grpc.MethodDescriptor<com.assignment2.grpc.query5.EduQueryFiveRequest, com.assignment2.grpc.query5.EduQueryFiveResponse> getGetEduQueryFiveMethod;
    if ((getGetEduQueryFiveMethod = EduQueryFiveServiceGrpc.getGetEduQueryFiveMethod) == null) {
      synchronized (EduQueryFiveServiceGrpc.class) {
        if ((getGetEduQueryFiveMethod = EduQueryFiveServiceGrpc.getGetEduQueryFiveMethod) == null) {
          EduQueryFiveServiceGrpc.getGetEduQueryFiveMethod = getGetEduQueryFiveMethod =
              io.grpc.MethodDescriptor.<com.assignment2.grpc.query5.EduQueryFiveRequest, com.assignment2.grpc.query5.EduQueryFiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEduQueryFive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment2.grpc.query5.EduQueryFiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment2.grpc.query5.EduQueryFiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EduQueryFiveServiceMethodDescriptorSupplier("GetEduQueryFive"))
              .build();
        }
      }
    }
    return getGetEduQueryFiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EduQueryFiveServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryFiveServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryFiveServiceStub>() {
        @java.lang.Override
        public EduQueryFiveServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryFiveServiceStub(channel, callOptions);
        }
      };
    return EduQueryFiveServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EduQueryFiveServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryFiveServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryFiveServiceBlockingStub>() {
        @java.lang.Override
        public EduQueryFiveServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryFiveServiceBlockingStub(channel, callOptions);
        }
      };
    return EduQueryFiveServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EduQueryFiveServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryFiveServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryFiveServiceFutureStub>() {
        @java.lang.Override
        public EduQueryFiveServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryFiveServiceFutureStub(channel, callOptions);
        }
      };
    return EduQueryFiveServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EduQueryFiveServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEduQueryFive(com.assignment2.grpc.query5.EduQueryFiveRequest request,
        io.grpc.stub.StreamObserver<com.assignment2.grpc.query5.EduQueryFiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEduQueryFiveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEduQueryFiveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.assignment2.grpc.query5.EduQueryFiveRequest,
                com.assignment2.grpc.query5.EduQueryFiveResponse>(
                  this, METHODID_GET_EDU_QUERY_FIVE)))
          .build();
    }
  }

  /**
   */
  public static final class EduQueryFiveServiceStub extends io.grpc.stub.AbstractAsyncStub<EduQueryFiveServiceStub> {
    private EduQueryFiveServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryFiveServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryFiveServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEduQueryFive(com.assignment2.grpc.query5.EduQueryFiveRequest request,
        io.grpc.stub.StreamObserver<com.assignment2.grpc.query5.EduQueryFiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEduQueryFiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EduQueryFiveServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EduQueryFiveServiceBlockingStub> {
    private EduQueryFiveServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryFiveServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryFiveServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.assignment2.grpc.query5.EduQueryFiveResponse getEduQueryFive(com.assignment2.grpc.query5.EduQueryFiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEduQueryFiveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EduQueryFiveServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EduQueryFiveServiceFutureStub> {
    private EduQueryFiveServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryFiveServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryFiveServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assignment2.grpc.query5.EduQueryFiveResponse> getEduQueryFive(
        com.assignment2.grpc.query5.EduQueryFiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEduQueryFiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EDU_QUERY_FIVE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EduQueryFiveServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EduQueryFiveServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EDU_QUERY_FIVE:
          serviceImpl.getEduQueryFive((com.assignment2.grpc.query5.EduQueryFiveRequest) request,
              (io.grpc.stub.StreamObserver<com.assignment2.grpc.query5.EduQueryFiveResponse>) responseObserver);
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

  private static abstract class EduQueryFiveServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EduQueryFiveServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.assignment2.grpc.query5.Query5.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EduQueryFiveService");
    }
  }

  private static final class EduQueryFiveServiceFileDescriptorSupplier
      extends EduQueryFiveServiceBaseDescriptorSupplier {
    EduQueryFiveServiceFileDescriptorSupplier() {}
  }

  private static final class EduQueryFiveServiceMethodDescriptorSupplier
      extends EduQueryFiveServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EduQueryFiveServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EduQueryFiveServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EduQueryFiveServiceFileDescriptorSupplier())
              .addMethod(getGetEduQueryFiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
