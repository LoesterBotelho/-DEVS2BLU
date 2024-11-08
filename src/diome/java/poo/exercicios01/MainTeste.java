package diome.java.poo.exercicios01;

import java.util.ArrayList;
import java.util.List;

public class MainTeste {
	public static void main(String[] args) {

		Candidato candidato01 = new Candidato("Maria",1800.0,"(47)987777-7777");
		Candidato candidato02 = new Candidato("Jose" ,2000.0,"(47)985555-7777");
		Candidato candidato03 = new Candidato("Fernanda",2800.0,"(47)987777-7777");
		Candidato candidato04 = new Candidato("Matheus",3000.0,"(47)987777-7777");
		Candidato candidato05 = new Candidato("Antonio",1500.0,"(47)987777-7777");
		
		List<Candidato> listaCandidatos = new ArrayList<Candidato>();
		listaCandidatos.add(candidato01);
		listaCandidatos.add(candidato02);
		listaCandidatos.add(candidato03);
		listaCandidatos.add(candidato04);
		listaCandidatos.add(candidato05);
				
		ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();
		processoSeletivo.processar(listaCandidatos);
		processoSeletivo.processarLigacao(listaCandidatos);
		processoSeletivo.mostrarResultados(listaCandidatos);
		
		
	}
}
