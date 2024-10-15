/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.ImpostoRenda;

public class Pessoa extends PessoaAbstrata{
    private Long id;
    private String nome;
    private Endereco endereco;

    public Pessoa() {
    	this.setEndereco( new Endereco() );
    }
    
    public Pessoa(Long id, String nome, Endereco endereco) {
        this.setId(id);
        this.setNome(nome);
        this.setEndereco(endereco);
    }

    public Long getId() {
        return id;
    }

	public String getIdString() {
		return String.valueOf(id);
	}
	
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

	@Override
	public String toString() {
		return String.format("Pessoa [id=%s, nome=%s, endereco=%s]"
				, this.getIdString()
				, this.getNome()
				, this.getEndereco().toString()
							);
	}

	@Override
	public void mostrarPessoa() {
		System.out.printf( "%s", this.toString() );
		
	}
    
    
}
