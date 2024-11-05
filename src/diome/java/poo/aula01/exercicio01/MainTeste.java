package diome.java.poo.aula01.exercicio01;

public class MainTeste {
	public static void main(String[] args) {
		
		Mensagem msg = new MSNMessage();
		msg.validarConectadoInternet();		
		msg.receberMensagem();
		msg.enviarMensagem();
		msg.salvarHistorico();
		
	}
}
