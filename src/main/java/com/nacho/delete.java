package com.nacho;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class delete {
    public static void main(String[] args) {
        MongoClient mc = new MongoClient();
        MongoDatabase md = mc.getDatabase("local");
        MongoCollection mco = md.getCollection("productos");
    mco.deleteOne(new Document("precio",5));
    }
}
