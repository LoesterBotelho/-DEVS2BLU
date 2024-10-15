/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Questao;

public class Prova {

	private String prova = "A";
	private Integer serie;
	private Integer ano;
	private Integer bimestre;
	private Disciplina disciplina;
	private Questao[] provaAleatoriaGerada;
	private String[] provaGabarito;

	Prova() {					
		this.setDisciplina(new Disciplina());
		this.setProvaAleatoriaGerada( new Questao[1]);
		this.setProvaGabarito(new String[1]);
		
		this.setProva("A");
		this.setSerie(0);
		this.setAno(0);
		this.setBimestre(0);			
	}

	Prova(String prova, Integer serie, Integer ano, Integer bimestre, Disciplina disciplina) {
		this();
		
		this.setProva(prova);
		this.setSerie(serie);
		this.setAno(ano);
		this.setBimestre(bimestre);
		this.setDisciplina(disciplina);		
		
		this.setProvaAleatoriaGerada( gerarProvaAleatoria(disciplina) );
	}

	public String getProva() {
		return prova;
	}

	public void setProva(String prova) {
		this.prova = prova;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getBimestre() {
		return bimestre;
	}

	public void setBimestre(Integer bimestre) {
		this.bimestre = bimestre;
	}

	public Disciplina disciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Questao[] getProvaAleatoriaGerada() {
		return provaAleatoriaGerada;
	}

	public void setProvaAleatoriaGerada(Questao[] provaAleatoriaGerada) {
		this.provaAleatoriaGerada = provaAleatoriaGerada;
	}

	public String[] getProvaGabarito() {
		return provaGabarito;
	}

	public void setProvaGabarito(String[] provaGabarito) {
		this.provaGabarito = provaGabarito;
	}

	public static boolean ehPar(Integer numero) {

		Boolean retorno = false;

		if (numero >= 2) {
			retorno = numero % 2 == 0;
		}

		return retorno;
	}

	public Questao[] gerarProvaAleatoria(Disciplina disciplina) {

		Questao[] listaOriginal = disciplina.getListaQuestoes();
		Questao[] listaAleatoria = listaOriginal;

		Boolean primeiroPar = this.getProva().equals("A");

		Integer tamanho = listaOriginal.length;

		Questao[] listaPar = new Questao[tamanho];
		Questao[] listaImpar = new Questao[tamanho];

		Integer cursorPar = 0;
		Integer cursorImpar = 0;
		Integer cursorAleatorio = 0;

		// ARMAZENDA LISTA DE PAR
		// ARMAZENA LISTA DE IMPAR
		for (var i = 0; i < listaOriginal.length; i++) {
			if (ehPar(i)) {
				listaPar[cursorPar++] = listaOriginal[i];
			} else {
				listaImpar[cursorImpar++] = listaOriginal[i];
			}
		}

		// SE FOR PROVA A - PRIMEIRO QUESTÕES PAR
		// SE FOR PROVA B - PRIMEIRO QUESTÕES IMPAR
		if (primeiroPar) {
			for (var i = 0; i < cursorPar; i++) {
				listaAleatoria[cursorAleatorio++] = listaPar[i];
			}
			for (var i = 0; i < cursorImpar; i++) {
				listaAleatoria[cursorAleatorio++] = listaImpar[i];
			}
		} else {
			for (var i = 0; i < cursorImpar; i++) {
				listaAleatoria[cursorAleatorio++] = listaImpar[i];
			}
			for (var i = 0; i < cursorPar; i++) {
				listaAleatoria[cursorAleatorio++] = listaPar[i];
			}
		}

		embaralharLista(listaAleatoria, cursorAleatorio);
		
		// showLista(listaOriginal, "ORIGINAL"); showLista(listaAleatoria, "ALEATÓRIA");

		return listaAleatoria;
	}

	// Fisher–Yates shuffle (algoritmo de Fisher–Yates)
	public void embaralharLista(Questao[] lista, int tamanho) {

		// TAMANHO INFORMADO 5 = 0 1 2 3 4
		// AJUSTAR TAMANHO -1
		// PARA COMEÇAR CONTAR DO 0 1 2 3 4

		Integer tamanhoCorrigido = (tamanho - 1);

		// FOR DECRESCENTE
		for (Integer posicaoAtual = tamanhoCorrigido; posicaoAtual > 0; posicaoAtual--) {

			// GERA UM NOVO VALOR ALEATÓRIO
			Integer novoValorAleatorio = (int) (Math.random() * (posicaoAtual + 1));

			// SALVA A POSIÇÃO ATUAL , NO LOCAL TEMPORÁRIO
			Questao localTemporario = lista[posicaoAtual];

			// COLOCA UM NOVO VALOR , NA POSIÇÃO ATUAL
			lista[posicaoAtual] = lista[novoValorAleatorio];

			// O NOVO VALOR ALEATORIO , É O VALOR ANTIGO , PARA NÃO PERDER
			lista[novoValorAleatorio] = localTemporario;
		}

	}

	public static void showLista(Questao[] listaQuestao, String texto) {

		for (Questao item : listaQuestao) {
			System.out.printf("%s - %s . %s %s \n", texto, item.getNumeroQuestao(), item.getDescricao(),
					item.getResposta());

		}

	}

	@Override
	public String toString() {
		String msg = "Ano : %s - Bimestre: %s - Série : %s - Prova : %s \n";

		String msgFormatada = String.format(msg, this.getAno(), this.getBimestre(), this.getSerie() , this.getProva());

		return msgFormatada;
	}

}
