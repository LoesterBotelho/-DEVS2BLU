package diome.java.poo.exercicios02;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = Integer.parseInt(terminal.nextLine());

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = Integer.parseInt(terminal.nextLine());
		 
		
		/*
		int parametroUm = 12;
		int parametroDois = 30;
		*/
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		} finally {
			terminal.close();
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int contagem = parametroDois - parametroUm;

		for (var i=1 ; i <= contagem ; i++) {
			 System.out.println("Imprimindo o número " + i);
		}
	}
}