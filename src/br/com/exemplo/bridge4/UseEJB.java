package br.com.exemplo.bridge4;

public class UseEJB extends Technology {
    public UseEJB(Database database) {
        super(database);
    }

    @Override
    public void use() {
        System.out.println("Using EJB technology.");
        database.connect();
    }
}