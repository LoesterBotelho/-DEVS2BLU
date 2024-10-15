package devs2blu.Aula07.Modulo5;

public class Conta {

	private String nomeTitular = "";
	private Integer numeroConta = 0;
	private Double saldo = 0.0;

	Conta() {
	}

	Conta(String nomeTitular, Integer numeroConta) {
		this.setNomeTitular(nomeTitular);
		this.setNumeroConta(numeroConta);
	}

	Conta(String nomeTitular, Integer numeroConta, Double saldo) {
		this.setNomeTitular(nomeTitular);
		this.setNumeroConta(numeroConta);
		this.saldo = saldo;
	}

	public Boolean depositar(Double valor) {
		saldo += valor;
		System.out.printf("OPERAÇÃO 1 - Deposito efetuado no valor de %.2f , saldo restante : %.2f \n", valor, saldo);
		return true;
	}

	public Boolean saque(Double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.printf("OPERAÇÃO 2 - Saque efetuado no valor de %.2f , saldo restante : %.2f \n", valor, saldo);
			return true;
		} else {
			System.out.printf("ERROR 1 - Não existe saldo para efetuar o saque, saldo : %.2f \n", saldo);
			return false;
		}
	}

	public Boolean transferencia(Conta outraconta, Double valor) {
		if (this.saldo >= valor) {
			saldo -= valor;
			outraconta.depositar(valor);
			System.out.printf("OPERAÇÃO 3 - Transferencia efetuado no valor de %.2f , saldo restante : %.2f \n", valor, saldo);
			return true;
		} else {
			System.out.printf("Não existe saldo para transferencia o saque, saldo : %.2f \n", saldo);
			return false;
		}
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void apresentarCC() {
		System.out.printf("OPERAÇÃO 4 - CC Número : %d - Titular : %s - Saldo : %.2f \n", this.getNumeroConta(),
				this.getNomeTitular(), this.getSaldo());
	}
}
