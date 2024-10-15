/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Festa;

public class Festa {

	private String dataFesta = "";
	private String horaFestaInicio = "";
	private String horaFestaFim = "";
	private Double valorCobrado = 0.0;
	private Double desconto = 0.0;
	private Double valorPago = 0.0;

	Festa() {
		this.setDataFesta("");
		this.setHoraFestaInicio("");
		this.setHoraFestaFim("");
		this.setValorCobrado(0.0);
		this.setDesconto(0.0);
		this.setValorPago(0.0);
	}

	Festa(String dataFesta, String horaFestaInicio, String horaFestaFim) {
		this();
		
		this.setDataFesta(dataFesta);
		this.setHoraFestaInicio(horaFestaInicio);
		this.setHoraFestaFim(horaFestaFim);

	}

	Festa(String dataFesta, String horaFestaInicio, String horaFestaFim, 
		  Double valorCobrado, Double desconto, Double valorPago) {
		this.setDataFesta(dataFesta);
		this.setHoraFestaInicio(horaFestaInicio);
		this.setHoraFestaFim(horaFestaFim);
		this.setValorCobrado(valorCobrado);
		this.setDesconto(desconto);
		this.setValorPago(valorPago);
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

		String msg = 
				  "Data da Festa ...............................: %s \n"
				+ "Hora do início da festa .....................: %s \n"
				+ "Hora Do Fim Da Festa ........................: %s \n";

		String msgFormatada = String.format(msg, 
				this.getDataFesta(), 
				this.getHoraFestaInicio(),
				this.getHoraFestaFim());

		return msgFormatada;
	}

}
