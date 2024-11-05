package diome.java.poo.aula01.exercicio01;

public class MSNMessage implements Mensagem{

	@Override
	public void enviarMensagem() {
		System.out.println("EXECUTANDO AÇÃO : enviarMensagem();");	
	}
	

	@Override
	public void receberMensagem() {
		System.out.println("EXECUTANDO AÇÃO : receberMensagem();");	
	}

	@Override
	public void validarConectadoInternet() {
		System.out.println("EXECUTANDO AÇÃO : validarConectadoInternet();");	
	}

	@Override
	public void salvarHistorico() {
		System.out.println("EXECUTANDO AÇÃO : salvarHistorico();");	
	}


			
}
