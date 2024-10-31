package devs2blu.Aula14.Solid.Exerc01;

public class MainTeste {

	public static void main(String[] args) {

		ImpressoraColorida printers01 = new ImpressoraColoridaImpl();
		printers01.imprimirImagem();
		
		System.out.println("");

		ImpressoraPretoBranco printers02 = new ImpressoraPretoBrancoImpl();
		printers02.imprimirTexto();
		
		System.out.println("");
		
		ImpressoraGerencial printers03 = new ImpressoraGerencialImpl();
		printers03.imprimirRelatorioFinanceiro();
		
		
		System.out.println("");
		
		ImpressoraGenericaFazTudoImpl printers04 = new ImpressoraGenericaFazTudoImpl();
		printers04.imprimirImagem();
		printers04.imprimirTexto();
		printers04.imprimirRelatorioFinanceiro();
		
		
		
	}

}
