package com.assignment2.grpc.config;

import com.mongodb.MongoWriteException;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class CheckStatus {

    MongoCollection<Document> collection;
    AggregateIterable<Document> result;

    public CheckStatus(MongoCollection<Document> collection,  AggregateIterable<Document> result) {
        this.collection=collection;
        this.result=result;
    }




    public String status(){


       String s = null;

        for (Document doc : result) {

            String docJ = doc.toJson();
            System.out.println(docJ);

            try {
                Document d =  collection.find(doc).first();
                System.out.println(d);

                if (d == null) {

                    collection.insertOne(doc);
                    s = "Document inserted ";
                } else {
                    System.out.println("Document already exists : " + doc.toJson());
                    s = "Document already exists with " + docJ;
                }


            } catch (MongoWriteException e) {
                e.printStackTrace();
                System.out.println("Some error while inserting document with " + doc.toJson());
                s = "Some error while inserting document with " + docJ;
            }


        }

        return s;
    }
}
