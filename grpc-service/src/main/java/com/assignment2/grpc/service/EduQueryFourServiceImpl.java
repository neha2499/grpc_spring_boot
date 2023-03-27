package com.assignment2.grpc.service;

import com.assignment2.grpc.dao.EduCostStatQueryFourDao;


import com.assignment2.grpc.query4.EduQueryFourRequest;
import com.assignment2.grpc.query4.EduQueryFourResponse;
import com.assignment2.grpc.query4.EduQueryFourServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EduQueryFourServiceImpl extends EduQueryFourServiceGrpc.EduQueryFourServiceImplBase {


    @Override
    public void getEduQueryFour(EduQueryFourRequest request, StreamObserver<EduQueryFourResponse> responseObserver) {


        int year_range = request.getYearRange();
        String type = request.getType();
        String length = request.getLength();
        String url = request.getUrl();


        EduCostStatQueryFourDao eduCostStatQueryFourDao= new EduCostStatQueryFourDao(year_range, type,length,url);
        String s= eduCostStatQueryFourDao.queryFour();

        EduQueryFourResponse eduQueryFourResponse=EduQueryFourResponse.newBuilder()
                .setMessage("Hello from server  "+ s)
                .build();


        //greeting response need to be sent to the response observer
        responseObserver.onNext(eduQueryFourResponse);

        //on completed the connection is closed
        responseObserver.onCompleted();
    }
}
