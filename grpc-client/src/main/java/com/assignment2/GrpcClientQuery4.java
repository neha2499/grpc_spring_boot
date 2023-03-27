package com.assignment2;

import com.assignment2.grpc.query3.EduQueryThreeRequest;
import com.assignment2.grpc.query3.EduQueryThreeResponse;
import com.assignment2.grpc.query3.EduQueryThreeServiceGrpc;
import com.assignment2.grpc.query4.EduQueryFourRequest;
import com.assignment2.grpc.query4.EduQueryFourResponse;
import com.assignment2.grpc.query4.EduQueryFourServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClientQuery4 {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        EduQueryFourServiceGrpc.EduQueryFourServiceBlockingStub stub
                = EduQueryFourServiceGrpc.newBlockingStub(channel);


        EduQueryFourResponse eduQueryFourResponse= stub.getEduQueryFour(EduQueryFourRequest.newBuilder()
                .setYearRange(5)
                .setLength("4-year")
                .setType("Private")
                .setUrl("mongodb+srv://neha2499:group86731@cluster.ue98hvc.mongodb.net/test?tls=true")
                .build()
        );

        System.out.println(eduQueryFourResponse);

        channel.shutdown();


    }
}
