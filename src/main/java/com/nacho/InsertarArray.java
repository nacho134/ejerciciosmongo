package com.nacho;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;

public class InsertarArray {
    public static void main(String[] args) {
        // Conectar a MongoDB
        MongoClient mongoClient = new MongoClient();
        MongoDatabase db = mongoClient.getDatabase("local");

        // Crear una colección
        MongoCollection<Document> collection = db.getCollection("empleados");

        // Crear un documento con un array
        Document document = new Document("name", "John Doe")
                .append("age", 30)
                .append("hobbies", Arrays.asList("reading", "traveling", "coding"));

        // Insertar el documento en la colección
        collection.insertOne(document);

        System.out.println("Document inserted successfully");
    }
}
