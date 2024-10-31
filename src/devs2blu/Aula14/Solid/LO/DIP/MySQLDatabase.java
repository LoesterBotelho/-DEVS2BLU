package devs2blu.Aula14.Solid.LO.DIP;

public class MySQLDatabase implements Database {

	@Override 
	public void save(String data) { 
		System.out.println("Salvando dados no MySQL: " + data); 
	}
	
}
