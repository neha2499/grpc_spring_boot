package com.assignment2.grpc.service;


import com.assignment2.grpc.dao.EduCostStatQueryThreeDao;

import com.assignment2.grpc.query3.EduQueryThreeRequest;
import com.assignment2.grpc.query3.EduQueryThreeResponse;
import com.assignment2.grpc.query3.EduQueryThreeServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EduQueryThreeServiceImpl extends EduQueryThreeServiceGrpc.EduQueryThreeServiceImplBase {

    @Override
    public void getEduQueryThree(EduQueryThreeRequest request, StreamObserver<EduQueryThreeResponse> responseObserver) {

        int year = request.getYear();
        String type = request.getType();
        String length = request.getLength();
        String url = request.getUrl();

        EduCostStatQueryThreeDao eduCostQueryThreeDao = new EduCostStatQueryThreeDao(year,type,length,url);
        String s = eduCostQueryThreeDao.queryThree();

        EduQueryThreeResponse eduQueryThreeResponse=EduQueryThreeResponse.newBuilder()
                .setMessage("Hello from server  "+ s)
                .build();


        //greeting response need to be sent to the response observer
        responseObserver.onNext(eduQueryThreeResponse);

        //on completed the connection is closed
        responseObserver.onCompleted();
    }
}
