/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.ImpostoRenda;

public class PessoaPF extends Pessoa {	
	    private String cpf;
	    private String rg;
	    private String dataNascimento;

	    public PessoaPF() {
	    	
	    }
	    	    
	    public PessoaPF(Long id, String nome, Endereco endereco, String cpf, String rg, String dataNascimento) {
	        super(id, nome, endereco);
	        this.setCpf(cpf);
	        this.setRg(rg);
	        this.setDataNascimento(dataNascimento);
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    public String getRg() {
	        return rg;
	    }

	    public void setRg(String rg) {
	        this.rg = rg;
	    }

	    public String getDataNascimento() {
	        return dataNascimento;
	    }

	    public void setDataNascimento(String dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }

		@Override
		public String toString() {
			return String.format("PessoaPF [cpf=%s, rg=%s, dataNascimento=%s]"
					, this.getCpf()
					, this.getRg()
					, this.getDataNascimento()					
								);
		}
	    
		@Override
		public void mostrarPessoa() {
			System.out.printf( "%s%s\n","PessoaPF::MostrarPessoa -> ", super.toString() );
			System.out.printf( "%s%s\n","PessoaPF::MostrarPessoa -> ", this.toString() );								
		}
		
	}
