package br.com.exemplo.bridge4;

public class UseRest extends Technology {
    public UseRest(Database database) {
        super(database);
    }

    @Override
    public void use() {
        System.out.println("Using REST technology.");
        database.connect();
    }
}