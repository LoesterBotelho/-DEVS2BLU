package devs2blu.Aula09.Exer09.Parte01;

import java.util.Arrays;

public class Agenda {
	
	private String nomeAgenda = "";
	private Contato[] listaContato;

	public Agenda() {
		this.setNomeAgenda("");
	}

	Agenda(Contato[] listaContato) {
		this();
		
		this.listaContato = listaContato;
	}

	
	public Agenda(String nomeAgenda, Contato[] listaContato) {
		this.nomeAgenda = nomeAgenda;
		this.listaContato = listaContato;		
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public Contato[] getListaContato() {
		return listaContato;
	}

	public void setListaContato(Contato[] listaContato) {
		this.listaContato = listaContato;
	}

	@Override
	public String toString() {
		return "Agenda [listaContato=" + Arrays.toString(listaContato) + "]";
	}

}
