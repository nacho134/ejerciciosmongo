package com.nacho;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class query {
    public static void main(String[] args) {
        MongoClient mc = new MongoClient();
        MongoDatabase md = mc.getDatabase("local");
        MongoCollection mco =md.getCollection("prueba");
        FindIterable<Document> iterable = mco.find();
    //Lista toda la tabla productos
        for(Document doc : iterable)
        {
            System.out.println(doc.toJson());
        }
        mc.close();
    }
}
