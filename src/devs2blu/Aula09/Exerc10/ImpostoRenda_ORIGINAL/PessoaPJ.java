/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.ImpostoRenda_ORIGINAL;

public class PessoaPJ extends Pessoa {
    private String cnpj;    
    private String inscricaoEstadual;
    private String razaoSocial;
    

    public PessoaPJ() {    	
    }
    
    public PessoaPJ(Long id, String nome, Endereco endereco, String cnpj, String razaoSocial, String inscricaoEstadual) {
        super(id, nome, endereco);
        this.setCnpj(cnpj);
        this.setRazaoSocial(razaoSocial);
        this.setInscricaoEstadual(inscricaoEstadual);
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

	@Override
	public String toString() {
		return String.format("PessoaPJ [cnpj=%s, razaoSocial=%s, inscricaoEstadual=%s]"
				, this.getCnpj()
				, this.getRazaoSocial()
				, this.getInscricaoEstadual()
							);
	}
	
	@Override
	public void mostrarPessoa() {
		System.out.printf( "%s%s\n","PessoaPJ::MostrarPessoa -> ", super.toString() );
		System.out.printf( "%s%s\n","PessoaPJ::MostrarPessoa -> ", this.toString() );				
	}
}

