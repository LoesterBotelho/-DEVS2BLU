/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.ImpostoRenda_ORIGINAL;

import java.util.Arrays;
import java.util.Objects;

public class Faturamento2 extends FaturamentoAbstrato{
	
	private Double[] meses = new Double[12];

	
	public Faturamento2() {
		meses = new Double[12];
		meses[0] = 0.0;
		meses[1] = 0.0;
		meses[2] = 0.0;
		meses[3] = 0.0;
		meses[4] = 0.0;
		meses[5] = 0.0;
		meses[6] = 0.0;
		meses[7] = 0.0;
		meses[8] = 0.0;
		meses[9] = 0.0;
		meses[10] = 0.0;
		meses[11] = 0.0;	
	}
	
	public Faturamento2(Double[] meses) {
		super();
		this.meses = meses;
	}

	public Double getMes(int mes) {
	    return (mes >= 1 && mes <= 12) ? (meses[mes - 1] != null ? meses[mes - 1] : 0.0) : null;
	}

	public void setMes(int mes, Double valor) {
	    if (mes >= 1 && mes <= 12) {
	        meses[mes - 1] = (valor != null) ? valor : 0.0;
	    }
	}

	public Double[] getMeses() {
		return this.meses;
	}
	
	@Override
	public Double getFaturamentoAnual() {
		
		// EXPRESSÃO LAMBDA - COUNT
		// A NOTAÇÃO "SuppressWarnings" SERVE PARA A IDE ECLIPSE NÃO COLOCAR HINT 
		// NO CODIGO PORQUE NÃO USEI , EXEMPLO DE CODIGO LAMBDA
		@SuppressWarnings("unused")
		long contagemRegistros = Arrays.stream(meses)
		        .filter(Objects::nonNull)
		        .count();
		
		// EXPRESSÃO LAMBDA - SUM
		Double somaFaturamentoAnual = Arrays.stream(meses)
		        .filter(Objects::nonNull)
		        .mapToDouble(Double::doubleValue)
		        .sum();
		
		 return ( somaFaturamentoAnual );
	}
	
	@Override
	public String toString() {		
		return String.format("Faturamento2 [FaturamentoAnual=%s] - [meses=%s]"
				, Arrays.toString( this.getMeses() )
				, this.getFaturamentoAnual() 
							);
	}

	@Override
	public void mostrarFaturamento() {
		System.out.printf( "%s\n", this.toString() );
	}

}

