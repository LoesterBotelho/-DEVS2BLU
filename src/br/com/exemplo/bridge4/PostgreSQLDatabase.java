package br.com.exemplo.bridge4;

public class PostgreSQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL Database...");
    }
}
