/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.ImpostoRenda_ORIGINAL;

public class Faturamento extends FaturamentoAbstrato{
	
	private Double mes01 = 0.0;
	private Double mes02 = 0.0;
	private Double mes03 = 0.0;
	private Double mes04 = 0.0;
	private Double mes05 = 0.0;
	private Double mes06 = 0.0;
	private Double mes07 = 0.0;
	private Double mes08 = 0.0;
	private Double mes09 = 0.0;
	private Double mes10 = 0.0;
	private Double mes11 = 0.0;
	private Double mes12 = 0.0;
	
	public Faturamento() {
		this.setMes01(0.0);
		this.setMes02(0.0);
		this.setMes03(0.0);
		this.setMes04(0.0);
		this.setMes05(0.0);
		this.setMes06(0.0);
		this.setMes07(0.0);
		this.setMes08(0.0);
		this.setMes09(0.0);
		this.setMes10(0.0);
		this.setMes11(0.0);
		this.setMes12(0.0);		
	}
	
	public Faturamento(
			double mes01, double mes02, double mes03, double mes04, double mes05, double mes06, 
			double mes07, double mes08, double mes09, double mes10, double mes11, double mes12) {
		this.setMes01(mes01);
		this.setMes02(mes02);
		this.setMes03(mes03);
		this.setMes04(mes04);
		this.setMes05(mes05);
		this.setMes06(mes06);
		this.setMes07(mes07);
		this.setMes08(mes08);
		this.setMes09(mes09);
		this.setMes10(mes10);
		this.setMes11(mes11);
		this.setMes12(mes12);
		
	}
	
	public Double getMes01() {
	    return (mes01 != null) ? mes01 : 0.0;
	}

	public void setMes01(Double mes01) {
	    this.mes01 = (mes01 != null) ? mes01 : 0.0;
	}

	public Double getMes02() {
	    return (mes02 != null) ? mes02 : 0.0;
	}

	public void setMes02(Double mes02) {
	    this.mes02 = (mes02 != null) ? mes02 : 0.0;
	}

	public Double getMes03() {
	    return (mes03 != null) ? mes03 : 0.0;
	}

	public void setMes03(Double mes03) {
	    this.mes03 = (mes03 != null) ? mes03 : 0.0;
	}

	public Double getMes04() {
	    return (mes04 != null) ? mes04 : 0.0;
	}

	public void setMes04(Double mes04) {
	    this.mes04 = (mes04 != null) ? mes04 : 0.0;
	}

	public Double getMes05() {
	    return (mes05 != null) ? mes05 : 0.0;
	}

	public void setMes05(Double mes05) {
	    this.mes05 = (mes05 != null) ? mes05 : 0.0;
	}

	public Double getMes06() {
	    return (mes06 != null) ? mes06 : 0.0;
	}

	public void setMes06(Double mes06) {
	    this.mes06 = (mes06 != null) ? mes06 : 0.0;
	}

	public Double getMes07() {
	    return (mes07 != null) ? mes07 : 0.0;
	}

	public void setMes07(Double mes07) {
	    this.mes07 = (mes07 != null) ? mes07 : 0.0;
	}

	public Double getMes08() {
	    return (mes08 != null) ? mes08 : 0.0;
	}

	public void setMes08(Double mes08) {
	    this.mes08 = (mes08 != null) ? mes08 : 0.0;
	}

	public Double getMes09() {
	    return (mes09 != null) ? mes09 : 0.0;
	}

	public void setMes09(Double mes09) {
	    this.mes09 = (mes09 != null) ? mes09 : 0.0;
	}

	public Double getMes10() {
	    return (mes10 != null) ? mes10 : 0.0;
	}

	public void setMes10(Double mes10) {
	    this.mes10 = (mes10 != null) ? mes10 : 0.0;
	}

	public Double getMes11() {
	    return (mes11 != null) ? mes11 : 0.0;
	}

	public void setMes11(Double mes11) {
	    this.mes11 = (mes11 != null) ? mes11 : 0.0;
	}

	public Double getMes12() {
	    return (mes12 != null) ? mes12 : 0.0;
	}

	public void setMes12(Double mes12) {
	    this.mes12 = (mes12 != null) ? mes12 : 0.0;
	}

	@Override
	public Double getFaturamentoAnual() {
		 return ( this.getMes01()
				+ this.getMes02()
				+ this.getMes03()
				+ this.getMes04()
				+ this.getMes05()
				+ this.getMes06()
				+ this.getMes07()
				+ this.getMes08()
				+ this.getMes09()
				+ this.getMes10()
				+ this.getMes11()
				+ this.getMes12()
				);
	}
	
	@Override
	public String toString() {
		return String.format("Faturamento [FaturamentoAnual=%s] - [mes01=%s, mes02=%s, mes03=%s, mes04=%s, mes05=%s, mes06=%s, mes07=%s, mes08=%s, mes09=%s, mes10=%s, mes11=%s, mes12=%s]"
				, this.getFaturamentoAnual()
				, this.getMes01()
				, this.getMes02()
				, this.getMes03()
				, this.getMes04()
				, this.getMes05()
				, this.getMes06()
				, this.getMes07()
				, this.getMes08()
				, this.getMes09()
				, this.getMes10()
				, this.getMes11()
				, this.getMes12()				
				);

	}

	@Override
	public void mostrarFaturamento() {
		System.out.printf( "%s\n", this.toString() );
	}

	
}
