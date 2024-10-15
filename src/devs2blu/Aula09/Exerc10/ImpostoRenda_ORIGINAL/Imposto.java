/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.ImpostoRenda_ORIGINAL;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Imposto extends ImpostoAbstrato {

	protected Faturamento faturamento;
	protected Double[] meses;
	protected Boolean v1 = false;
	protected Boolean v2 = false;
	
	protected Boolean getV1() { 
		return this.v1; 
	}
	
	protected void setV1(Boolean v1) {
		this.v1 = v1;
		this.v2 = ! v1;
	}

	protected Boolean getV2() {
		return this.v2;
	}

	protected void setV2(Boolean v2) {
		this.v2 = v2;
		this.v1 = ! v2;
	}
	
	protected Faturamento getFaturamento() {
        return (faturamento != null) ? faturamento : new Faturamento();
    }

	protected void setFaturamento(Faturamento faturamento) {
        this.faturamento = (faturamento != null) ? faturamento : new Faturamento();
    }

    public void setMeses(Double[] meses) {
        if (meses != null) {
            this.meses = meses;
        } else {
            this.meses = new Double[12];
            Arrays.fill(this.meses, 0.0);
        }
    }
    
    public Double getMes( Integer mes) {
        if (meses == null) {
            meses = new Double[12];
        }
        return meses[mes-1];
    }
    
    public Double[] getMeses() {
        if (meses == null) {
            meses = new Double[12];
            Arrays.fill(meses, 0.0);
        }
        return meses;
    }

    // EXPRESSÃO LAMBDA
    public Double getTotalMeses() { 
    return Arrays.stream(meses)
    	    .map(mes -> (mes != null) ? mes : 0.0)
    	    .reduce(0.0, Double::sum);
    }
    
    // EXPRESSÃO LAMBDA
    public String getMesesAsString() {
        return Arrays.stream(meses)
                     .map(mes -> (mes != null) ? String.format("%.2f", mes) : "0.00")
                     .collect(Collectors.joining(", "));
    }
    
	@Override
	public void calcularImpostoV1(){}

	@Override
	public void calcularImpostoV2(){}

	@Override
	public void mostrarImpostoV1(){}

	@Override
	public void mostrarImpostoV2(){}
	
	

}
