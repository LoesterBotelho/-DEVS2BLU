/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula12.Exerc02;

import java.util.List;

public class Relatorio {


    public void gerarRelatorioSaldo(Conta conta) {
        System.out.println("");
        System.out.println("Relatório de Saldo");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo atual: " + conta.getSaldo());
    }

    public void gerarRelatorioTransacoes(List<String> transacoes) {
    	System.out.println("");
    	
        System.out.println("Relatório de tranzações");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }
    
}
