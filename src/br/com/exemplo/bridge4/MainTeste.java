package br.com.exemplo.bridge4;

public class MainTeste {
	  public static void main(String[] args) {
	        Technology restWithOracle = new UseRest(new OracleDatabase());
	        restWithOracle.use();

	        System.out.println("");
	        
	        Technology ejbWithPostgreSQL = new UseEJB(new PostgreSQLDatabase());
	        ejbWithPostgreSQL.use();

	        System.out.println("");
	        
	        Technology soapWithMySQL = new UseSoap(new MySQLDatabase());
	        soapWithMySQL.use();

	        System.out.println("");
	        
	        Technology restWithMongoDB = new UseRest(new MongoDBDatabase());
	        restWithMongoDB.use();
	    }
	}