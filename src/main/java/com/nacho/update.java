package com.nacho;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class update {
    public static void main(String[] args) {
        MongoClient mc = new MongoClient();
        MongoDatabase md = mc.getDatabase("local");
        MongoCollection mco =md.getCollection("productos");
        Document d = new Document("id",3);
        Document d2 = new Document("$set",new Document("precio",5));
        mco.updateOne(d,d2);
        mc.close();

    }

}
