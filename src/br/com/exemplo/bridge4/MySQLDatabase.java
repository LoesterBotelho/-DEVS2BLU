package br.com.exemplo.bridge4;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database...");
    }
}