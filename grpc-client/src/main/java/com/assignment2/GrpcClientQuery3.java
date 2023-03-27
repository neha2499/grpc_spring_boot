package com.assignment2;

import com.assignment2.grpc.query2.EduQueryTwoRequest;
import com.assignment2.grpc.query2.EduQueryTwoResponse;
import com.assignment2.grpc.query2.EduQueryTwoServiceGrpc;
import com.assignment2.grpc.query3.EduQueryThreeRequest;
import com.assignment2.grpc.query3.EduQueryThreeResponse;
import com.assignment2.grpc.query3.EduQueryThreeServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClientQuery3 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        EduQueryThreeServiceGrpc.EduQueryThreeServiceBlockingStub stub
                = EduQueryThreeServiceGrpc.newBlockingStub(channel);


        EduQueryThreeResponse eduQueryThreeResponse= stub.getEduQueryThree(EduQueryThreeRequest.newBuilder()
                .setYear(2013)
                .setLength("4-year")
                .setType("Private")
                .setUrl("mongodb+srv://neha2499:group86731@cluster.ue98hvc.mongodb.net/test?tls=true")
                .build()
        );

        System.out.println(eduQueryThreeResponse);

        channel.shutdown();


    }
}
