package diome.java.poo.exercicios01;

import java.util.List;
import java.util.Random;

public class ProcessoSeletivo {

	private Double salarioAanalise = 2000.0;

	ProcessoSeletivo() {
	}

	public void processar(List<Candidato> listaCandidatos) {
		for (var candidato : listaCandidatos) {

			if (candidato.getSalarioPretendido().compareTo(salarioAanalise) == 0) {

				candidato.setResultado("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

			} else if (candidato.getSalarioPretendido().compareTo(salarioAanalise) < 0) {

				candidato.setResultado("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");

			} else {
				candidato.setResultado("LIGAR PARA O CANDIDATO");
			}

		}
	}

	public void processarLigacao(List<Candidato> listaCandidatos) {
		entrarEmContato(listaCandidatos);
	}

	public void mostrarResultados(List<Candidato> listaCandidatos) {
		for (var candidato : listaCandidatos) {
			System.out.println(candidato.toString());

		}
	}

	public void entrarEmContato(List<Candidato> listaCandidatos) {

		for (var candidato : listaCandidatos) {

			for (var tentativas = 0; tentativas < 3; tentativas++) {

				candidato.setTentativaLigacao();

				if ( efetuarLigacaoAtendeuTelefone() ) {
					candidato.setContatoRealizado();
					break;
				}

			}

		}
	}

	public Boolean efetuarLigacaoAtendeuTelefone() {
		return new Random().nextInt(3) == 1;
	}

}
