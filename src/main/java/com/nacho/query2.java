package com.nacho;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;
import static com.mongodb.client.model.Filters.*;

import static javax.management.Query.*;

public class query2 {
    public static void main(String[] args) {


        MongoClient mc = new MongoClient();
        MongoDatabase md = mc.getDatabase("local");
        MongoCollection mco =md.getCollection("productos");

// Crea el filtro BSON para la consulta
        Bson filter = and(eq("descripción", "tableta chocolate"), gt("precio", 5), lt("precio", 30));

// Realiza la consulta
        FindIterable<Document> iterable = mco.find(filter);

// Recorre los documentos devueltos por la consulta
        for (Document doc : iterable) {
            System.out.println(doc.toJson());
        }

// Cierra la conexión
        mc.close();

    }
}
