package br.com.exemplo.bridge4;

public abstract class Technology {
    protected Database database;

    protected Technology(Database database) {
        this.database = database;
    }

    abstract public void use();
}