package diome.java.poo.exercicios03;

public class Teste {

	private String servico = "";
	private String entradaCliente = "";
	private String retorno = "";

	public Teste() {
		this.setServico("");
		this.setEntradaCliente("");
		this.setServico("");
	}

	public Teste(String servico, String entradaCliente, String retorno) {
		this.setServico(servico);
		this.setEntradaCliente(entradaCliente);
		this.setRetorno(retorno);
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
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
		return "Teste [servico=" + servico + ", entradaCliente=" + entradaCliente + ", retorno=" + retorno + "]";
	}

	// METODOS : LO
	
	public String validar() {
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        String resposta = "Nao";
        boolean contratado = false;
        
        // Verificando se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }
        
        // Imprimindo o resultado
        if (contratado) {
        	resposta = "Sim";
        }
        
        Boolean validado = resposta == this.getRetorno() ;
        
        System.out.printf("Validado : %s - Resposta : %s - Nome do Cliente : %s \n"
        		, validado
        		, resposta
        		, nomeCliente
        		);
        
        return resposta;
	}
}
