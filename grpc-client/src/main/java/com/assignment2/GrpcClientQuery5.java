package com.assignment2;

import com.assignment2.grpc.query4.EduQueryFourRequest;
import com.assignment2.grpc.query4.EduQueryFourResponse;
import com.assignment2.grpc.query4.EduQueryFourServiceGrpc;
import com.assignment2.grpc.query5.EduQueryFiveRequest;
import com.assignment2.grpc.query5.EduQueryFiveResponse;
import com.assignment2.grpc.query5.EduQueryFiveServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClientQuery5 {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        EduQueryFiveServiceGrpc.EduQueryFiveServiceBlockingStub stub
                = EduQueryFiveServiceGrpc.newBlockingStub(channel);


        EduQueryFiveResponse eduQueryFiveResponse= stub.getEduQueryFive(EduQueryFiveRequest.newBuilder()
                .setYear(2013)
                .setLength("4-year")
                .setType("Private")
                .setUrl("mongodb+srv://neha2499:group86731@cluster.ue98hvc.mongodb.net/test?tls=true")
                .build()
        );

        System.out.println(eduQueryFiveResponse);

        channel.shutdown();


    }
}
