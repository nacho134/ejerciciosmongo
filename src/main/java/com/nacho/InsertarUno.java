package com.nacho;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;

public class InsertarUno
{
    public static void main(String[] args)
    {
        MongoClient mongoClient = new MongoClient();
        MongoDatabase db = mongoClient.getDatabase("local");
        MongoCollection mco = db.getCollection("productos");
        producto p1 = new producto(1,15,"crema cacahuete",5);
        Document d = new Document("id",p1.getId())
                .append("precio",p1.getPrecio())
                        .append("descrip",p1.getDescrip())
                                .append("cantidad", Arrays.asList(1,2,3));
        System.out.println("Bien insertado");
        mongoClient.close();

    }
}
