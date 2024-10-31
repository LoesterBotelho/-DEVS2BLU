package devs2blu.Aula14.Solid.Exerc01;

class ImpressoraGenericaFazTudoImpl implements ImpressoraColorida , ImpressoraGerencial, ImpressoraPretoBranco {
    
	public void imprimirTexto() {
        System.out.println("Impressora Avançada - Imprimindo texto - Preto e Branco.");
    }

    public void imprimirImagem() {
    	System.out.println("Impressora Avançada - Imprimindo Imagem - Colorida.");
    }

    public void imprimirRelatorioFinanceiro() {
    	System.out.println("Impressora Avançada - Imprimindo Relatório Gerencial de Alta qualidade.");
    }
}