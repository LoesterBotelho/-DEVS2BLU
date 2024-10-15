/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.ImpostoRenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ImpostoPF extends Imposto {

	private PessoaPF pessoaPF;
	private List<Aliquota> listaAliquotaPF;
		
	public ImpostoPF(){
		this.setPessoaPF( null );
		this.setListaAliquotaPF( null  );
		this.setFaturamento( null );		
	}
	
	// V1
	public ImpostoPF(PessoaPF pessoaPF01, List<Aliquota> listaAliquotaPF, Faturamento faturamentoAnual) {
		this.setV1(true);
		this.setPessoaPF(pessoaPF01);
		this.setListaAliquotaPF(listaAliquotaPF);
		this.setFaturamento(faturamentoAnual);
	}

	// V2
	public ImpostoPF(PessoaPF pessoaPF01, List<Aliquota> listaAliquotaPF, Double[] meses) {
		this.setV2(true);
		this.setPessoaPF(pessoaPF01);
		this.setListaAliquotaPF(listaAliquotaPF);
		this.setMeses(meses);
	}
	
	
    public PessoaPF getPessoaPF() {
        return (pessoaPF != null) ? pessoaPF : new PessoaPF();
    }

    public void setPessoaPF(PessoaPF pessoaPF) {
        this.pessoaPF = (pessoaPF != null) ? pessoaPF : new PessoaPF();
    }

    public List<Aliquota> getListaAliquotaPF() {
        return (listaAliquotaPF != null) ? listaAliquotaPF : new ArrayList<>();
    }

    public void setListaAliquotaPF(List<Aliquota> listaAliquotaPF) {
        this.listaAliquotaPF = (listaAliquotaPF != null) ? listaAliquotaPF : new ArrayList<>();
    }

    // EXPRESSÃO LAMBDA
    public String getListaAliquotaPFAsString() {
        return (listaAliquotaPF != null && !listaAliquotaPF.isEmpty()) 
            ? listaAliquotaPF.stream()
                .map(Aliquota::toString)
                .reduce((a, b) -> a + ", " + b)
                .orElse("")
            : "ERRO : NENHUMA ALIQUOTA";
    }
		
 // EXPRESSÃO LAMBDA
    public Optional<Aliquota> buscarAliquotaPorRenda(Double salarioBrutoMensal) {
        if (salarioBrutoMensal == null) {
            return Optional.empty();
        }
        return listaAliquotaPF.stream()
            .filter(a -> a.getRendaBrutaInicial() != null && a.getRendaBrutaFinal() != null)
            .filter(a -> salarioBrutoMensal >= a.getRendaBrutaInicial() && salarioBrutoMensal <= a.getRendaBrutaFinal())
            .findFirst();
    }
	
    public Optional<Aliquota> buscarAliquotaPorRenda2(Double salarioBrutoMensal) {
        return listaAliquotaPF.stream()
            .filter(a -> salarioBrutoMensal >= a.getRendaBrutaInicial() && salarioBrutoMensal <= a.getRendaBrutaFinal())
            .findFirst();
    }

    
	@Override
	public String toString() {
		
		if ( this.getV1() ) {			
			return String.format("ImpostoPF [pessoaPJ=%s, listaAliquotaPF=%s, faturamentoAnual=%s]\n"
					, this.getPessoaPF()
					, this.getListaAliquotaPFAsString()
					, this.getFaturamento()
					);
		} 
		
		if ( this.getV2() ) {
			
			return String.format("ImpostoPF [pessoaPJ=%s, listaAliquotaPF=%s, meses=%s]\n"
					, this.getPessoaPF()
					, this.getListaAliquotaPFAsString()
					, this.getMesesAsString()
					);			
		}
		
		return "";
	}

	@Override
	public void calcularImpostoV1() {

		/*
		for (Aliquota a : listaAliquotaPF) {
		    System.out.println("DEBUG - Aliquota: " + a.getRendaBrutaInicial() + " - " + a.getRendaBrutaFinal());
		}
		 System.out.printf("\n\n");
		*/
		
		Faturamento impostoPagar = new Faturamento();

		for (var i = 0; i < 12; i++) {

			Integer key = i + 1;
			Double valor = 0.0;

			switch (key) {
				case  1: { valor = this.getFaturamento().getMes01(); }
				case  2: { valor = this.getFaturamento().getMes02(); }
				case  3: { valor = this.getFaturamento().getMes03(); }
				case  4: { valor = this.getFaturamento().getMes04(); }
				case  5: { valor = this.getFaturamento().getMes05(); }
				case  6: { valor = this.getFaturamento().getMes06(); }
				case  7: { valor = this.getFaturamento().getMes07(); }
				case  8: { valor = this.getFaturamento().getMes08(); }
				case  9: { valor = this.getFaturamento().getMes09(); }
				case 10: { valor = this.getFaturamento().getMes10(); }
				case 11: { valor = this.getFaturamento().getMes11(); }
				case 12: { valor = this.getFaturamento().getMes12(); }			
						 }

			// System.out.printf("DEBUG - %s\n\n", valor);
			Optional<Aliquota> aliquotaEncontrada = buscarAliquotaPorRenda2(valor);

			if (aliquotaEncontrada.isPresent()) {
				Aliquota aliquota = aliquotaEncontrada.get();
				// System.out.printf("DEBUG - ALIQUOTA : %s \n", aliquota.getAliquota());

				Double impostoPagarMensal = aliquota.getParcelaDeduzir();

				// System.out.printf("DEBUG - " + String.valueOf(valor) + " , ");

				switch (key) {
				case  1: { impostoPagar.setMes01(impostoPagarMensal); }
				case  2: { impostoPagar.setMes02(impostoPagarMensal); }
				case  3: { impostoPagar.setMes03(impostoPagarMensal); }
				case  4: { impostoPagar.setMes04(impostoPagarMensal); }
				case  5: { impostoPagar.setMes05(impostoPagarMensal); }
				case  6: { impostoPagar.setMes06(impostoPagarMensal); }
				case  7: { impostoPagar.setMes07(impostoPagarMensal); }
				case  8: { impostoPagar.setMes08(impostoPagarMensal); }
				case  9: { impostoPagar.setMes09(impostoPagarMensal); }
				case 10: { impostoPagar.setMes10(impostoPagarMensal); }
				case 11: { impostoPagar.setMes11(impostoPagarMensal); }
				case 12: { impostoPagar.setMes12(impostoPagarMensal); }			
							 }

			} else {
				System.out.printf( " ERRO : NÃO FOI ENCONTRADO ALIQUOTA NO VALOR DE : %s \n", valor.toString() );
			}

			
		}
		
		System.out.printf( "V1 - PF - IMPOSTO A PAGAR - %s", impostoPagar.toString() );
		System.out.printf("\n");

	}
	
	@Override
	public void calcularImpostoV2() {
		
		Faturamento impostoPagar = new Faturamento();

		for (var i = 0; i < 12; i++) {

			Integer key = i + 1;
			Double valor = 0.0;

			switch (key) {
				case  1: { valor = this.getMes(1); }
				case  2: { valor = this.getMes(2); }
				case  3: { valor = this.getMes(3); }
				case  4: { valor = this.getMes(4); }
				case  5: { valor = this.getMes(5); }
				case  6: { valor = this.getMes(6); }
				case  7: { valor = this.getMes(7); }
				case  8: { valor = this.getMes(8); }
				case  9: { valor = this.getMes(9); }
				case 10: { valor = this.getMes(10); }
				case 11: { valor = this.getMes(11); }
				case 12: { valor = this.getMes(12); }			
					 }

			Optional<Aliquota> aliquotaEncontrada = buscarAliquotaPorRenda2(valor);

			if (aliquotaEncontrada.isPresent()) {
				Aliquota aliquota = aliquotaEncontrada.get();

				Double impostoPagarMensal = aliquota.getParcelaDeduzir();

				switch (key) {
				case  1: { impostoPagar.setMes01(impostoPagarMensal); }
				case  2: { impostoPagar.setMes02(impostoPagarMensal); }
				case  3: { impostoPagar.setMes03(impostoPagarMensal); }
				case  4: { impostoPagar.setMes04(impostoPagarMensal); }
				case  5: { impostoPagar.setMes05(impostoPagarMensal); }
				case  6: { impostoPagar.setMes06(impostoPagarMensal); }
				case  7: { impostoPagar.setMes07(impostoPagarMensal); }
				case  8: { impostoPagar.setMes08(impostoPagarMensal); }
				case  9: { impostoPagar.setMes09(impostoPagarMensal); }
				case 10: { impostoPagar.setMes10(impostoPagarMensal); }
				case 11: { impostoPagar.setMes11(impostoPagarMensal); }
				case 12: { impostoPagar.setMes12(impostoPagarMensal); }			
							 }

			} else {
				System.out.printf( " ERRO : NÃO FOI ENCONTRADO ALIQUOTA NO VALOR DE : %s \n", valor.toString() );
			}

			
		}
		
		System.out.printf( "V2 - PF - IMPOSTO A PAGAR - %s", impostoPagar.toString() );
		System.out.printf("\n");		
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
