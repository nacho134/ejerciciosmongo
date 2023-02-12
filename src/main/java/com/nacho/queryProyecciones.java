package com.nacho;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import org.bson.Document;

import javax.print.Doc;

public class queryProyecciones {
    public static void main(String[] args) {
        MongoClient mc = new MongoClient();
        MongoDatabase md = mc.getDatabase("local");
        MongoCollection<Document> mco =md.getCollection("productos");


        FindIterable<Document> results = mco.find().projection(Projections.fields(
                Projections.include("descripción"), Projections.include("precio"),
                Projections.excludeId()));
        for (Document result : results) {
            String description = result.getString("descripción");
            double price = result.getDouble("precio");
            System.out.println("descripción: " + description + ", precio: " + price);
        }
    }
}
