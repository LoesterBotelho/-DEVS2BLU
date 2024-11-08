package diome.java.poo.exercicios01;

public class Candidato {

	private String nome = "";
	private Double salarioPretendido = 0.0;
	private String telefone = "";
	private String resultado = "";
	private Integer tentativasLigacao = 0;
	private Boolean conseguiContatarCandidato = false;

	Candidato() {
		this.setNome("");
		this.setSalarioPretendido(0.0);
		this.setNome("");
		this.setResultado("");
		this.setTentativasLigacao(0);
		this.setConseguiContatarCandidato(false);
	}

	public Candidato(String nome, Double salarioPretendido, String telefone) {
		this();

		this.setNome(nome);
		this.setSalarioPretendido(salarioPretendido);
		this.setTelefone(telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioPretendido() {
		return salarioPretendido;
	}

	public void setSalarioPretendido(Double salarioPretendido) {
		this.salarioPretendido = salarioPretendido;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	protected String getResultado() {
		return resultado;
	}

	protected void setResultado(String resultado) {
		this.resultado = resultado;
	}

	protected Integer getTentativasLigacao() {
		return tentativasLigacao;
	}

	protected void setTentativasLigacao(Integer tentativasLigacao) {
		this.tentativasLigacao = tentativasLigacao;
	}

	protected void setTentativaLigacao() {
		this.tentativasLigacao += 1;
	}

	protected Boolean getConseguiContatarCandidato() {
		return conseguiContatarCandidato;
	}

	protected void setConseguiContatarCandidato(Boolean conseguiContatarCandidato) {
		this.conseguiContatarCandidato = conseguiContatarCandidato;
	}

	protected void setContatoRealizado() {
		this.setConseguiContatarCandidato(true);
	}
	
	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", salarioPretendido=" + salarioPretendido + ", telefone=" + telefone
				+ ", resultado=" + resultado + ", tentativasLigacao=" + tentativasLigacao
				+ ", conseguiContatarCandidato=" + conseguiContatarCandidato + "]";
	}

}
