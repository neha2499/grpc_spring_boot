package com.assignment2.grpc.service;

import com.assignment2.grpc.gRPc.GreetingRequest;
import com.assignment2.grpc.gRPc.GreetingResponse;
import com.assignment2.grpc.gRPc.GreetingServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {


    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
       String message= request.getMessage();
        System.out.println("Received message"+ message);

        //build the response for me
        GreetingResponse greetingResponse=GreetingResponse.newBuilder()
                .setMessage("Hello from server"+ message)
                .build();


        //greeting response need to be sent to the response observer
        responseObserver.onNext(greetingResponse);

        //on completed the connection is closed
        responseObserver.onCompleted();

    }
}
