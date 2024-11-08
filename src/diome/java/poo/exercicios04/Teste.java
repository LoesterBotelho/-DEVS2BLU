package diome.java.poo.exercicios04;

public class Teste {

	private String entradaCliente = "";
	private String retorno = "";
    boolean movelContratado = false;
    boolean bandaLargaContratada = false;
    boolean tvContratada = false;	

	public Teste() {
		this.setEntradaCliente("");
		this.setRetorno("");
	}

	public Teste(String entradaCliente, String retorno) {
		this.setEntradaCliente(entradaCliente);
		this.setRetorno(retorno);
	}

	public String getEntradaCliente() {
		return entradaCliente;
	}

	public void setEntradaCliente(String entradaCliente) {
		this.entradaCliente = entradaCliente;
	}

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

	@Override
	public String toString() {
		return "Teste [entradaCliente=" + entradaCliente + ", retorno=" + retorno + "]";
	}

	// METODOS : LO

	public String validar() {
		String[] servicosContratados = entradaCliente.split(",");
		String resposta = "Combo Incompleto";

        // Iterando sobre os serviços contratados
        for (String servico : servicosContratados) {
        	
            // Verificando se o serviço foi contratado
            if (servico.trim().equalsIgnoreCase("movel")) {
                movelContratado = true;
            }
            if (servico.trim().equalsIgnoreCase("banda larga")) {
                bandaLargaContratada = true;
            }
            if (servico.trim().equalsIgnoreCase("tv")) {
                tvContratada = true;
            }
        }

        // Verificando se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
        	resposta = "Combo Completo";
        }
        
        Boolean validado = resposta == this.getRetorno() ;
        
        System.out.printf("Validado : %s - Resposta : %s \n"
        		, validado
        		, resposta
        		);
        

		return resposta;
	}
}
