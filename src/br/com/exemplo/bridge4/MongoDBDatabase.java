package br.com.exemplo.bridge4;

public class MongoDBDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB Database...");
    }
}