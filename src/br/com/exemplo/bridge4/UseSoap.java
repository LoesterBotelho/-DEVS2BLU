package br.com.exemplo.bridge4;

public class UseSoap extends Technology {
    public UseSoap(Database database) {
        super(database);
    }

    @Override
    public void use() {
        System.out.println("Using SOAP technology.");
        database.connect();
    }
}