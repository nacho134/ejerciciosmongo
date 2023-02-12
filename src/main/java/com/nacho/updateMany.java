package com.nacho;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class updateMany {
    public static void main(String[] args) {
        MongoClient mc = new MongoClient();
        MongoDatabase md = mc.getDatabase("local");
        MongoCollection mco =md.getCollection("prueba");
        Document d = new Document("edad",22);
        Document d2 = new Document("$set",new Document("nombre","nuno"));
        mco.updateMany(d,d2);
        mc.close();

    }

}
