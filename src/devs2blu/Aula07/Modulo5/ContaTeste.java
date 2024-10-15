package devs2blu.Aula07.Modulo5;

public class ContaTeste {

	public static void main(String[] args) {

		Conta ccTeste2 = new Conta("Teste",447577,0.0);
		
		Conta ccLoester = new Conta("Loester",7845877,8000000.0);
		ccLoester.depositar(80000.0);
		ccLoester.saque(8000.0);
		ccLoester.apresentarCC();
		ccLoester.transferencia(ccTeste2, 72000.0);
		
		ccTeste2.apresentarCC();
		
		
	}

}
