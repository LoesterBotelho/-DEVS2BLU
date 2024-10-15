package devs2blu.Aula07.Exerc07;

public class Exercicio01 {

	private String nome = "";
	private String telefone = "";
	private String enderecoCompleto = "";
	private String temaEscolhido = "";
	private String dataFesta = "";
	private String horaFestaInicio = "";
	private String horaFestaFim = "";
	private Double valorCobrado = 0.0;
	private Double desconto = 0.0;
	private Double valorPago = 0.0;
	
	public Exercicio01(){
		
	}
	
	public Exercicio01(String nome, String telefone, String enderecoCompleto, String temaEscolhido, String dataFesta,
			String horaFestaInicio, String horaFestaFim, Double valorCobrado, Double desconto, Double valorPago) {
		this.nome = nome;
		this.telefone = telefone;
		this.enderecoCompleto = enderecoCompleto;
		this.temaEscolhido = temaEscolhido;
		this.dataFesta = dataFesta;
		this.horaFestaInicio = horaFestaInicio;
		this.horaFestaFim = horaFestaFim;
		this.valorCobrado = valorCobrado;
		this.desconto = desconto;
		this.valorPago = valorPago;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}
	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}
	public String getTemaEscolhido() {
		return temaEscolhido;
	}
	public void setTemaEscolhido(String temaEscolhido) {
		this.temaEscolhido = temaEscolhido;
	}
	public String getDataFesta() {
		return dataFesta;
	}
	public void setDataFesta(String dataFesta) {
		this.dataFesta = dataFesta;
	}
	public String getHoraFestaInicio() {
		return horaFestaInicio;
	}
	public void setHoraFestaInicio(String horaFestaInicio) {
		this.horaFestaInicio = horaFestaInicio;
	}
	public String getHoraFestaFim() {
		return horaFestaFim;
	}
	public void setHoraFestaFim(String horaFestaFim) {
		this.horaFestaFim = horaFestaFim;
	}
	public Double getValorCobrado() {
		return valorCobrado;
	}
	public void setValorCobrado(Double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Double getValorPago() {
		return valorPago;
	}
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
	@Override
	public String toString() {
		return "Exercicio01 [nome=" + nome + ", telefone=" + telefone + ", enderecoCompleto=" + enderecoCompleto
				+ ", temaEscolhido=" + temaEscolhido + ", dataFesta=" + dataFesta + ", horaFestaInicio="
				+ horaFestaInicio + ", horaFestaFim=" + horaFestaFim + ", valorCobrado=" + valorCobrado + ", desconto="
				+ desconto + ", valorPago=" + valorPago + "]";
	}
	
	
	
	// lista itens
	
	// Rafaela possui vários temas de festas infantis para aluguel. 
	
	/*



	Para cada tema, é preciso controlar: 
	a lista de itens que compõem o tema
	(ex: 
	castelo 
	boneca da Cinderela
	bruxa etc.), 
	
	o valor do aluguel e a cor da
	toalha da mesa que deve ser usada com o tema. 	
	  
1.	- Identifique as classes, atributos e métodos marcando no cenário
2.	– Crie as classes com os atributos e métodos do cenário
3.	– Crie a classe de teste do cenário.

	 */
}
