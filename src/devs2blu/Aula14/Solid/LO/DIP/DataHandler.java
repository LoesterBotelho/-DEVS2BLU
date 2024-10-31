package devs2blu.Aula14.Solid.LO.DIP;

public class DataHandler {
    private Database database;

    public DataHandler(Database database) {
        this.database = database;
    }

    public void saveData(String data) {
        database.save(data);
    }
}
