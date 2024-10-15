/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.Pedido;

public class Cliente {

	private Integer id;
	private String nome;
	private String cpf;
	
	public Cliente() {
		
	}
	
	public Cliente(Integer id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getIdString() {
		return String.valueOf(id);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {		
		return String.format("Cliente [id=%s, nome=%s, cpf=%s]" , 
				this.getIdString(), 
				this.getNome(), 
				this.getCpf()
				);
	}
	
	
	
}
