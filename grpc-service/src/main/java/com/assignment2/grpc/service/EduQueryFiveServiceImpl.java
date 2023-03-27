package com.assignment2.grpc.service;


import com.assignment2.grpc.dao.EduCostStatQueryFiveDao;
import com.assignment2.grpc.query4.EduQueryFourResponse;
import com.assignment2.grpc.query5.EduQueryFiveRequest;
import com.assignment2.grpc.query5.EduQueryFiveResponse;
import com.assignment2.grpc.query5.EduQueryFiveServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EduQueryFiveServiceImpl extends EduQueryFiveServiceGrpc.EduQueryFiveServiceImplBase {


    @Override
    public void getEduQueryFive(EduQueryFiveRequest request, StreamObserver<EduQueryFiveResponse> responseObserver) {
        int year = request.getYear();
        String type = request.getType();
        String length = request.getLength();
        String url = request.getUrl();


        EduCostStatQueryFiveDao eduCostStatQueryFiveDao= new EduCostStatQueryFiveDao(year,type,length,url);
        String s= eduCostStatQueryFiveDao.queryFive();

        EduQueryFiveResponse eduQueryFiveResponse=EduQueryFiveResponse.newBuilder()
                .setMessage("Hello from server  "+ s)
                .build();


        //greeting response need to be sent to the response observer
        responseObserver.onNext(eduQueryFiveResponse);

        //on completed the connection is closed
        responseObserver.onCompleted();
    }
}
