/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.ImpostoRenda_ORIGINAL;

public class ImpostoPJ extends Imposto {

	private PessoaPJ pessoaPJ = new PessoaPJ();
	private Double impostoPessoaJuridica = 0.0 ;	
	
	public ImpostoPJ() {
		this.setPessoaPJ( null );
		this.setImpostoPessoaJuridica( null );
		this.setMeses( null );
		this.setFaturamento( null );
	}
	
	// V1
	public ImpostoPJ(PessoaPJ pessoaPJ, Double impostoPessoaJuridica, Faturamento faturamentoPJ) {
		this.setV1(true);
		this.setPessoaPJ(pessoaPJ);
		this.setImpostoPessoaJuridica(impostoPessoaJuridica);
		this.setFaturamento(faturamentoPJ);
	}

	// V2
	public ImpostoPJ(PessoaPJ pessoaPJ, Double impostoPessoaJuridica, Double[] faturamentoPJ) {
		this.setV2(true);
		this.setPessoaPJ(pessoaPJ);
		this.setImpostoPessoaJuridica(impostoPessoaJuridica);
		this.setMeses(faturamentoPJ);
	}

	public PessoaPJ getPessoaPJ() {  
		return (pessoaPJ != null) ? pessoaPJ : new PessoaPJ(); 
		}
   
    public void setPessoaPJ(PessoaPJ pessoaPJ) { 
    	this.pessoaPJ = (pessoaPJ != null) ? pessoaPJ : new PessoaPJ(); 
    }

    public Double getImpostoPessoaJuridica() { 
    	return (impostoPessoaJuridica != null) ? impostoPessoaJuridica : 0.0; 
    }

    public void setImpostoPessoaJuridica(Double impostoPessoaJuridica) {
        this.impostoPessoaJuridica = (impostoPessoaJuridica != null) ? impostoPessoaJuridica : 0.0;
    }

	@Override
	public String toString() {
		
		if ( this.getV1() ) {			
			return String.format("ImpostoPJ [pessoaPJ=%s, impostoPessoaJuridica=%s, faturamento=%s]\n"
					, this.getPessoaPJ()
					, this.getImpostoPessoaJuridica()
					, this.getFaturamento()
					);
		} 
		
		if ( this.getV2() ) {
			
			return String.format("ImpostoPJ [pessoaPJ=%s, impostoPessoaJuridica=%s, meses=%s]\n"
					, this.getPessoaPJ()
					, this.getImpostoPessoaJuridica()
					, this.getMesesAsString()
					);			
		}
		
		return "";
	}
	
	@Override
	public void calcularImpostoV1() {
		Double faturamentoBrutoAnual = this.getFaturamento().getFaturamentoAnual();
		
		Double impostoCobrado = faturamentoBrutoAnual * this.getImpostoPessoaJuridica(); 
		
		System.out.printf("V1 - PJ - Imposto Devido é : %s , sobre o Faturamento de : %s \n" 
				, impostoCobrado
				, faturamentoBrutoAnual
						);
	}

	@Override
	public void calcularImpostoV2() {
		Double faturamentoBrutoAnual = this.getTotalMeses();
		
		Double impostoCobrado = faturamentoBrutoAnual * this.getImpostoPessoaJuridica(); 
		
		System.out.printf("V2 - PJ - Imposto Devido é : %s , sobre o Faturamento de : %s \n" 
				, impostoCobrado
				, faturamentoBrutoAnual
						);
	}
	
	@Override
	public void mostrarImpostoV1() {
		System.out.printf( "V1 - %s" , this.toString() );
	}

	@Override
	public void mostrarImpostoV2() {
		System.out.printf( "V2 - %s" , this.toString() );
	}
	
}
