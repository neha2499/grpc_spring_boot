package com.assignment2;

import com.assignment2.grpc.query1.EduQueryOneRequest;
import com.assignment2.grpc.query1.EduQueryOneResponse;
import com.assignment2.grpc.query1.EduQueryOneServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClientQuery1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        EduQueryOneServiceGrpc.EduQueryOneServiceBlockingStub stub
                = EduQueryOneServiceGrpc.newBlockingStub(channel);


        EduQueryOneResponse eduQueryOneResponse= stub.getEduQueryOne(EduQueryOneRequest.newBuilder()
                .setYear(2013)
                .setExpense("Fees/Tuition")
                .setLength("4-year")
                .setState("Alabama")
                .setType("Private")
                .setUrl("mongodb+srv://neha2499:group86731@cluster.ue98hvc.mongodb.net/test?tls=true")
                .build()
        );

        System.out.println(eduQueryOneResponse);

        channel.shutdown();


    }
}