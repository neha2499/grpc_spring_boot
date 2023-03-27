package com.assignment2.grpc.query2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: query2.proto")
public final class EduQueryTwoServiceGrpc {

  private EduQueryTwoServiceGrpc() {}

  public static final String SERVICE_NAME = "com.assignment2.grpc.query2.EduQueryTwoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.assignment2.grpc.query2.EduQueryTwoRequest,
      com.assignment2.grpc.query2.EduQueryTwoResponse> getGetEduQueryTwoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEduQueryTwo",
      requestType = com.assignment2.grpc.query2.EduQueryTwoRequest.class,
      responseType = com.assignment2.grpc.query2.EduQueryTwoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.assignment2.grpc.query2.EduQueryTwoRequest,
      com.assignment2.grpc.query2.EduQueryTwoResponse> getGetEduQueryTwoMethod() {
    io.grpc.MethodDescriptor<com.assignment2.grpc.query2.EduQueryTwoRequest, com.assignment2.grpc.query2.EduQueryTwoResponse> getGetEduQueryTwoMethod;
    if ((getGetEduQueryTwoMethod = EduQueryTwoServiceGrpc.getGetEduQueryTwoMethod) == null) {
      synchronized (EduQueryTwoServiceGrpc.class) {
        if ((getGetEduQueryTwoMethod = EduQueryTwoServiceGrpc.getGetEduQueryTwoMethod) == null) {
          EduQueryTwoServiceGrpc.getGetEduQueryTwoMethod = getGetEduQueryTwoMethod =
              io.grpc.MethodDescriptor.<com.assignment2.grpc.query2.EduQueryTwoRequest, com.assignment2.grpc.query2.EduQueryTwoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEduQueryTwo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment2.grpc.query2.EduQueryTwoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assignment2.grpc.query2.EduQueryTwoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EduQueryTwoServiceMethodDescriptorSupplier("GetEduQueryTwo"))
              .build();
        }
      }
    }
    return getGetEduQueryTwoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EduQueryTwoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryTwoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryTwoServiceStub>() {
        @java.lang.Override
        public EduQueryTwoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryTwoServiceStub(channel, callOptions);
        }
      };
    return EduQueryTwoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EduQueryTwoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryTwoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryTwoServiceBlockingStub>() {
        @java.lang.Override
        public EduQueryTwoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryTwoServiceBlockingStub(channel, callOptions);
        }
      };
    return EduQueryTwoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EduQueryTwoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EduQueryTwoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EduQueryTwoServiceFutureStub>() {
        @java.lang.Override
        public EduQueryTwoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EduQueryTwoServiceFutureStub(channel, callOptions);
        }
      };
    return EduQueryTwoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EduQueryTwoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEduQueryTwo(com.assignment2.grpc.query2.EduQueryTwoRequest request,
        io.grpc.stub.StreamObserver<com.assignment2.grpc.query2.EduQueryTwoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEduQueryTwoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEduQueryTwoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.assignment2.grpc.query2.EduQueryTwoRequest,
                com.assignment2.grpc.query2.EduQueryTwoResponse>(
                  this, METHODID_GET_EDU_QUERY_TWO)))
          .build();
    }
  }

  /**
   */
  public static final class EduQueryTwoServiceStub extends io.grpc.stub.AbstractAsyncStub<EduQueryTwoServiceStub> {
    private EduQueryTwoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryTwoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryTwoServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEduQueryTwo(com.assignment2.grpc.query2.EduQueryTwoRequest request,
        io.grpc.stub.StreamObserver<com.assignment2.grpc.query2.EduQueryTwoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEduQueryTwoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EduQueryTwoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EduQueryTwoServiceBlockingStub> {
    private EduQueryTwoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryTwoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryTwoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.assignment2.grpc.query2.EduQueryTwoResponse getEduQueryTwo(com.assignment2.grpc.query2.EduQueryTwoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEduQueryTwoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EduQueryTwoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EduQueryTwoServiceFutureStub> {
    private EduQueryTwoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EduQueryTwoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EduQueryTwoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assignment2.grpc.query2.EduQueryTwoResponse> getEduQueryTwo(
        com.assignment2.grpc.query2.EduQueryTwoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEduQueryTwoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EDU_QUERY_TWO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EduQueryTwoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EduQueryTwoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EDU_QUERY_TWO:
          serviceImpl.getEduQueryTwo((com.assignment2.grpc.query2.EduQueryTwoRequest) request,
              (io.grpc.stub.StreamObserver<com.assignment2.grpc.query2.EduQueryTwoResponse>) responseObserver);
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

  private static abstract class EduQueryTwoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EduQueryTwoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.assignment2.grpc.query2.Query2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EduQueryTwoService");
    }
  }

  private static final class EduQueryTwoServiceFileDescriptorSupplier
      extends EduQueryTwoServiceBaseDescriptorSupplier {
    EduQueryTwoServiceFileDescriptorSupplier() {}
  }

  private static final class EduQueryTwoServiceMethodDescriptorSupplier
      extends EduQueryTwoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EduQueryTwoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EduQueryTwoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EduQueryTwoServiceFileDescriptorSupplier())
              .addMethod(getGetEduQueryTwoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
