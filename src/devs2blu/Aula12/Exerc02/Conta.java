/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula12.Exerc02;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	private String titular;
	private double saldo;
	private List<String> transacoes;

	public Conta() {

	}

	public Conta(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
		this.transacoes = new ArrayList<>();
		transacoes.add("Conta criada com saldo inicial de: " + saldoInicial);
	}

	public void depositar(double valor) {
		saldo += valor;
		transacoes.add("Depósito de: " + valor);
	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			transacoes.add("Saque de: " + valor);
		} else {
			transacoes.add("Tentativa de saque sem saldo suficiente: " + valor);
		}
	}

	public double obterSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public List<String> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<String> transacoes) {
		this.transacoes = transacoes;
	}

	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", saldo=" + saldo + ", transacoes=" + transacoes + "]";
	}

}
