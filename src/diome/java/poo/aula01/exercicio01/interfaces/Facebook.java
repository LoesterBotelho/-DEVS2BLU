package diome.java.poo.aula01.exercicio01.interfaces;

public class Facebook implements Mensagem{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("EXECUTANDO AÇÃO : enviarMensagem();");	
		salvarHistorico();
	}
	

	@Override
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("EXECUTANDO AÇÃO : receberMensagem();");	
	}

	// POO : ENCAPSULADO
	private void validarConectadoInternet() {
		System.out.println("EXECUTANDO AÇÃO : validarConectadoInternet();");	
	}

	// POO : ENCAPSULADO
	private void salvarHistorico() {
		System.out.println("EXECUTANDO AÇÃO : salvarHistorico();");	
	}


			
}
