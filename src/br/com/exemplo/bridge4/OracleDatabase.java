package br.com.exemplo.bridge4;

public class OracleDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle Database...");
    }
    
}
