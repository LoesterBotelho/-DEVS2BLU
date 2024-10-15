package devs2blu.Aula09.Exerc09.Festa;

public class LocacoesSaldo {

	private Cliente cliente;
	private Double saldoAnterior = 0.0;

	public LocacoesSaldo() {
		this.setSaldoAnterior(0.0);
	}

	public LocacoesSaldo(Cliente cliente) {
		this();
		
		this.cliente = cliente;		
	}
	
	public LocacoesSaldo(Cliente cliente, Double saldoAnterior) {
		this.cliente = cliente;
		this.saldoAnterior = saldoAnterior;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldoAnterior() {
		return saldoAnterior;
	}

	public void setSaldoAnterior(Double saldoAnterior) {
		this.saldoAnterior += saldoAnterior;
	}

	@Override
	public String toString() {
		return "LocacoesSaldo [cliente=" + cliente + ", saldoAnterior=" + saldoAnterior + "]";
	}

}
