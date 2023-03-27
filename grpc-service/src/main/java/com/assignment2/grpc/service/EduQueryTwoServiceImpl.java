package com.assignment2.grpc.service;



import com.assignment2.grpc.dao.EduCostStatQueryTwoDao;
import com.assignment2.grpc.query2.EduQueryTwoRequest;
import com.assignment2.grpc.query2.EduQueryTwoResponse;
import com.assignment2.grpc.query2.EduQueryTwoServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EduQueryTwoServiceImpl extends EduQueryTwoServiceGrpc.EduQueryTwoServiceImplBase{
    @Override
    public void getEduQueryTwo(EduQueryTwoRequest request, StreamObserver<EduQueryTwoResponse> responseObserver) {

        int year = request.getYear();
        String type = request.getType();
        String length = request.getLength();
        String url = request.getUrl();

        EduCostStatQueryTwoDao eduCostStatQueryTwoDao = new EduCostStatQueryTwoDao(year,type,length,url);
        String s= eduCostStatQueryTwoDao.queryTwo();

        EduQueryTwoResponse eduQueryTwoResponse=EduQueryTwoResponse.newBuilder()
                .setMessage("Hello from server  "+ s)
                .build();


        //greeting response need to be sent to the response observer
        responseObserver.onNext(eduQueryTwoResponse);

        //on completed the connection is closed
        responseObserver.onCompleted();
    }
}
