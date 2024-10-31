package devs2blu.Aula14.Solid1.Exerc01;

import java.util.ArrayList;
import java.util.List;

public class MainTeste {
	public static void main(String[] args) {

		Produto prdRoupa = new Produto("ROUPA", 200.0);
		Produto prdEletronico = new Produto("ELETRONICO", 2000.0);
		Produto prdEletroDomestico = new Produto("ELETRODOMESTICO", 3000.0);
		Produto prdAlimento = new Produto("ALIMENTO", 1000.0);
		Produto prdFerramentas = new Produto("FERRAMENTAS", 800.0);

		Desconto dscRoupa = new DescontoRoupa();
		Desconto dscEletronico = new DescontoEletronico();
		Desconto dscEletroDomestico = new DescontoEletroDomestico();
		Desconto dscAlimento = new DescontoAlimento();
		Desconto dscFerramentas = new DescontoFerramentas();

		List<Produto> listaPrd = new ArrayList<Produto>();
		listaPrd.add(prdRoupa);
		listaPrd.add(prdEletronico);
		listaPrd.add(prdEletroDomestico);
		listaPrd.add(prdAlimento);
		listaPrd.add(prdFerramentas);
		
		List<Desconto> listaDsc = new ArrayList<Desconto>();
		listaDsc.add(dscRoupa);
		listaDsc.add(dscEletronico);
		listaDsc.add(dscEletroDomestico);
		listaDsc.add(dscAlimento);
		listaDsc.add(dscFerramentas);		
		
		CalculadoraDesconto calculadora = new CalculadoraDesconto();

		calculadora.calcularDescontoTotal(listaPrd, listaDsc);
		
	}
}
