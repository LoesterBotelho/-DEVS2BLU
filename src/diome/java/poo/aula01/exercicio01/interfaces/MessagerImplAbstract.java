package diome.java.poo.aula01.exercicio01.interfaces;


public abstract class MessagerImplAbstract extends Messager{
	public abstract String obterNomeAplicativo();
	
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.printf("APLICATIVO : %s - EXECUTANDO AÇÃO : enviarMensagem();\n", obterNomeAplicativo() );	
		salvarHistorico();
	}
	

	@Override
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.printf("APLICATIVO : %s - EXECUTANDO AÇÃO : receberMensagem();\n", obterNomeAplicativo() );
	}

	// POO : ENCAPSULADO
	private void validarConectadoInternet() {
		System.out.printf("APLICATIVO : %s - EXECUTANDO AÇÃO : validarConectadoInternet();\n", obterNomeAplicativo() );	
	}

	// POO : ENCAPSULADO
	private void salvarHistorico() {
		System.out.printf("APLICATIVO : %s - EXECUTANDO AÇÃO : salvarHistorico();\n", obterNomeAplicativo() );	
	}
}
