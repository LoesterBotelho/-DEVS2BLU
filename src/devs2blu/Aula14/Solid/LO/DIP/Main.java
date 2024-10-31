package devs2blu.Aula14.Solid.LO.DIP;

public class Main {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        DataHandler handler = new DataHandler(db);
        handler.saveData("Exemplo de dados");
    }
}
