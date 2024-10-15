/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Questao;

public class ProvaTeste {
	public static void main(String[] args) {

		imprimirAutor();

		Materia matematica = new Materia("Adição", 1);

		Questao questao1Serie1 = new Questao(1, "Quanto é 2 + 2?", "4", matematica, 1);
		Questao questao2Serie1 = new Questao(2, "Quanto é 5 - 2?", "3", matematica, 1);
		Questao questao3Serie1 = new Questao(3, "Quanto é 6 * 3?", "18", matematica, 1);
		Questao questao4Serie1 = new Questao(4, "Quanto é 10 / 2?", "5", matematica, 1);
		Questao questao5Serie1 = new Questao(5, "Quanto é 15 - 7?", "8", matematica, 1);

		Questao questao1Serie2 = new Questao(1, "Quanto é 3 + 5?", "8", matematica, 2);
		Questao questao2Serie2 = new Questao(2, "Quanto é 8 + 8?", "16", matematica, 2);
		Questao questao3Serie2 = new Questao(3, "Quanto é 12 * 2?", "24", matematica, 2);
		Questao questao4Serie2 = new Questao(4, "Quanto é 20 / 4?", "5", matematica, 2);
		Questao questao5Serie2 = new Questao(5, "Quanto é 9 - 4?", "5", matematica, 2);

		Questao questao1Serie3 = new Questao(1, "Quanto é 5 * 6?", "30", matematica, 3);
		Questao questao2Serie3 = new Questao(2, "Quanto é 7 + 10?", "17", matematica, 3);
		Questao questao3Serie3 = new Questao(3, "Quanto é 18 / 3?", "6", matematica, 3);
		Questao questao4Serie3 = new Questao(4, "Quanto é 25 - 7?", "18", matematica, 3);
		Questao questao5Serie3 = new Questao(5, "Quanto é 4 * 9?", "36", matematica, 3);

		Questao questao1Serie4 = new Questao(1, "Quanto é 10 + 15?", "25", matematica, 4);
		Questao questao2Serie4 = new Questao(2, "Quanto é 12 / 2?", "6", matematica, 4);
		Questao questao3Serie4 = new Questao(3, "Quanto é 14 - 9?", "5", matematica, 4);
		Questao questao4Serie4 = new Questao(4, "Quanto é 8 * 7?", "56", matematica, 4);
		Questao questao5Serie4 = new Questao(5, "Quanto é 16 + 5?", "21", matematica, 4);

		Questao[] listaQuestoes1Serie = { questao1Serie1, questao2Serie1, questao3Serie1, questao4Serie1,
				questao5Serie1 };
		Questao[] listaQuestoes2Serie = { questao1Serie2, questao2Serie2, questao3Serie2, questao4Serie2,
				questao5Serie2 };
		Questao[] listaQuestoes3Serie = { questao1Serie3, questao2Serie3, questao3Serie3, questao4Serie3,
				questao5Serie3 };
		Questao[] listaQuestoes4Serie = { questao1Serie4, questao2Serie4, questao3Serie4, questao4Serie4,
				questao5Serie4 };

		Disciplina disciplinaMatematica1Serie = new Disciplina("Matemática 1ª Série", listaQuestoes1Serie);
		Disciplina disciplinaMatematica2Serie = new Disciplina("Matemática 2ª Série", listaQuestoes2Serie);
		Disciplina disciplinaMatematica3Serie = new Disciplina("Matemática 3ª Série", listaQuestoes3Serie);
		Disciplina disciplinaMatematica4Serie = new Disciplina("Matemática 4ª Série", listaQuestoes4Serie);

		Prova prova1SerieMatematicaAleatoriaA = new Prova(gerarProvaAleatorio(), 1, 2024, 1,
				disciplinaMatematica1Serie);
		Prova prova1SerieMatematicaAleatoriaB = new Prova(gerarProvaAleatorio(), 1, 2024, 1,
				disciplinaMatematica1Serie);

		Prova prova2SerieMatematicaAleatoriaA = new Prova(gerarProvaAleatorio(), 2, 2024, 1,
				disciplinaMatematica2Serie);
		Prova prova2SerieMatematicaAleatoriaB = new Prova(gerarProvaAleatorio(), 2, 2024, 1,
				disciplinaMatematica2Serie);

		Prova prova3SerieMatematicaAleatoriaA = new Prova(gerarProvaAleatorio(), 3, 2024, 1,
				disciplinaMatematica3Serie);
		Prova prova3SerieMatematicaAleatoriaB = new Prova(gerarProvaAleatorio(), 3, 2024, 1,
				disciplinaMatematica3Serie);

		Prova prova4SerieMatematicaAleatoriaA = new Prova(gerarProvaAleatorio(), 4, 2024, 1,
				disciplinaMatematica4Serie);
		Prova prova4SerieMatematicaAleatoriaB = new Prova(gerarProvaAleatorio(), 4, 2024, 1,
				disciplinaMatematica4Serie);

		Aluno sofia = new Aluno(1, "Sofia   ");
		String[] respostasSofia = { "4", "7", "18", "5", "8" };
		ProvaGabarito sofiaGabarito = new ProvaGabarito(prova1SerieMatematicaAleatoriaA, sofia, respostasSofia);
		sofiaGabarito.corrigirProva();

		Aluno gabriel = new Aluno(1, "Gabriel ");
		String[] respostasGabriel = { "3", "4", "16", "5", "7" };
		ProvaGabarito gabrielGabarito = new ProvaGabarito(prova1SerieMatematicaAleatoriaB, gabriel, respostasGabriel);
		gabrielGabarito.corrigirProva();

		Aluno beatriz = new Aluno(2, "Beatriz ");
		String[] respostasBeatriz = { "8", "16", "24", "5", "5" };
		ProvaGabarito beatrizGabarito = new ProvaGabarito(prova2SerieMatematicaAleatoriaA, beatriz, respostasBeatriz);
		beatrizGabarito.corrigirProva();

		Aluno samuel = new Aluno(2, "Samuel  ");
		String[] respostasSamuel = { "16", "8", "22", "6", "6" };
		ProvaGabarito samuelGabarito = new ProvaGabarito(prova2SerieMatematicaAleatoriaB, samuel, respostasSamuel);
		samuelGabarito.corrigirProva();

		Aluno laura = new Aluno(3, "Laura   ");
		String[] respostasLaura = { "30", "17", "6", "18", "36" };
		ProvaGabarito lauraGabarito = new ProvaGabarito(prova3SerieMatematicaAleatoriaA, laura, respostasLaura);
		lauraGabarito.corrigirProva();

		Aluno joao = new Aluno(3, "João    ");
		String[] respostasJoao = { "29", "16", "7", "19", "36" };
		ProvaGabarito joaoGabarito = new ProvaGabarito(prova3SerieMatematicaAleatoriaB, joao, respostasJoao);
		joaoGabarito.corrigirProva();

		Aluno ana = new Aluno(4, "Ana     ");
		String[] respostasAna = { "25", "6", "5", "56", "21" };
		ProvaGabarito anaGabarito = new ProvaGabarito(prova4SerieMatematicaAleatoriaA, ana, respostasAna);
		anaGabarito.corrigirProva();

		Aluno pedro = new Aluno(4, "Pedro   ");
		String[] respostasPedro = { "26", "7", "4", "55", "22" };
		ProvaGabarito pedroGabarito = new ProvaGabarito(prova4SerieMatematicaAleatoriaB, pedro, respostasPedro);
		pedroGabarito.corrigirProva();

		// MOSTRAR QUESTÕES
		Boolean mostrarQuestoes = false;

		if (mostrarQuestoes) {
			System.out.printf("............................................ \n");
			System.out.printf("prova1SerieMatematicaAleatoriaA \n\n");
			for (var item : prova1SerieMatematicaAleatoriaA.getProvaAleatoriaGerada()) {
				System.out.printf(item.toString());
			}

			System.out.printf("............................................ \n");
			System.out.printf("prova1SerieMatematicaAleatoriaB \n\n");
			for (var item : prova1SerieMatematicaAleatoriaB.getProvaAleatoriaGerada()) {
				System.out.printf(item.toString());
			}

			System.out.printf("............................................ \n");
			System.out.printf("prova2SerieMatematicaAleatoriaA \n\n");
			for (var item : prova2SerieMatematicaAleatoriaA.getProvaAleatoriaGerada()) {
				System.out.printf(item.toString());
			}

			System.out.printf("............................................ \n");
			System.out.printf("prova2SerieMatematicaAleatoriaB \n\n");
			for (var item : prova2SerieMatematicaAleatoriaB.getProvaAleatoriaGerada()) {
				System.out.printf(item.toString());
			}

			System.out.printf("............................................ \n");
			System.out.printf("prova3SerieMatematicaAleatoriaA \n\n");
			for (var item : prova3SerieMatematicaAleatoriaA.getProvaAleatoriaGerada()) {
				System.out.printf(item.toString());
			}

			System.out.printf("............................................ \n");
			System.out.printf("prova3SerieMatematicaAleatoriaB \n\n");
			for (var item : prova3SerieMatematicaAleatoriaB.getProvaAleatoriaGerada()) {
				System.out.printf(item.toString());
			}

			System.out.printf("............................................ \n");
			System.out.printf("prova4SerieMatematicaAleatoriaA \n\n");
			for (var item : prova4SerieMatematicaAleatoriaA.getProvaAleatoriaGerada()) {
				System.out.printf(item.toString());
			}

			System.out.printf("............................................ \n");
			System.out.printf("prova4SerieMatematicaAleatoriaB \n\n");
			for (var item : prova4SerieMatematicaAleatoriaB.getProvaAleatoriaGerada()) {
				System.out.printf(item.toString());
			}

		}
	}

	public static void imprimirAutor() {
		System.out.printf("Autor : Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

	public static String gerarProvaAleatorio() {
		String[] provas = { "A", "B" };
		int aleatorio = (int) (Math.random() * provas.length);
		return provas[aleatorio];
	}
}
