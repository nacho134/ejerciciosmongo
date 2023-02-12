package com.nacho;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.Arrays;

public class queryAgregaciones {
    public static void main(String[] args) {
        MongoClient mc = new MongoClient();
        MongoDatabase database = mc.getDatabase("local");
        MongoCollection<Document> collection = database.getCollection("productos");

        // Contamos el total de documentos de la collection
        long totalDocuments = collection.countDocuments();
        System.out.println("Documentos totales: " + totalDocuments);

        // Perform an aggregation to sum the values of a specific field
        Document result = collection.aggregate(Arrays.asList(
                Aggregates.match(Filters.gt("fieldName", 0)),
                Aggregates.group(null, Accumulators.sum("sum", "$fieldName"))
        )).first();
        int sum = result.getInteger("sum");
        System.out.println("Sum: " + sum);
    }
}

