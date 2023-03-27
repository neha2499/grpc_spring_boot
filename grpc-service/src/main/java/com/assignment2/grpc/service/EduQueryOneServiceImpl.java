package com.assignment2.grpc.service;

import com.assignment2.grpc.dao.EduCostStatQueryOneDao;
import com.assignment2.grpc.gRPc.GreetingResponse;
import com.assignment2.grpc.query1.EduQueryOneRequest;
import com.assignment2.grpc.query1.EduQueryOneResponse;
import com.assignment2.grpc.query1.EduQueryOneServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EduQueryOneServiceImpl extends EduQueryOneServiceGrpc.EduQueryOneServiceImplBase {

    @Override
    public void getEduQueryOne(EduQueryOneRequest request, StreamObserver<EduQueryOneResponse> responseObserver) {
//        super.getEduQueryOne(request, responseObserver);
        int year= request.getYear();
        String state= request.getState();
        String type= request.getType();
        String length=request.getLength();
        String expense=request.getExpense();
        String url = request.getUrl();


        EduCostStatQueryOneDao eduCostStatQueryOneDao= new EduCostStatQueryOneDao(year,state,type,length,expense,url);

        String s=eduCostStatQueryOneDao.queryOne();

        EduQueryOneResponse eduQueryOneResponse=EduQueryOneResponse.newBuilder()
                .setMessage("Hello from server  "+ s)
                .build();


        //greeting response need to be sent to the response observer
        responseObserver.onNext(eduQueryOneResponse);

        //on completed the connection is closed
        responseObserver.onCompleted();

    }
}
