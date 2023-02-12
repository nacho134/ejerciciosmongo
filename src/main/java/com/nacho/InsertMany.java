package com.nacho;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class    InsertMany {
    public static void main(String[] args) {
        MongoClient mc = new MongoClient();
        MongoDatabase md = mc.getDatabase("local");
        MongoCollection mco = md.getCollection("productos");
        List<Document> productos = new ArrayList<>();
        producto p2 = new producto(2,20,"crema cacahuete",5);
        producto p3 = new producto(3,20,"kinder bueno",3);
        producto p4 = new producto(4,20,"snickecdoodle",7);
        Document d = new Document("id",p2.getId())
                .append("precio",p2.getPrecio())
                .append("descrip",p2.getDescrip())
                .append("cantidad",p2.getCantidad());
        productos.add(d);
        d = new Document("id",p3.getId())
                .append("precio",p3.getPrecio())
                .append("descrip",p3.getDescrip())
                .append("cantidad",p3.getCantidad());
        productos.add(d);
        d= new Document("id",p4.getId())
                .append("precio",p4.getPrecio())
                .append("descrip",p3.getDescrip())
                .append("cantidad",p3.getCantidad());
        productos.add(d);
        mco.insertMany(productos);
        mc.close();
    }
}
