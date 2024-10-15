package devs2blu.Exerc03Advanced;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 06 - EXEMPLO DE ANO : 2024 \n");
		System.out.printf("-------------------------------------- \n");

		System.out.printf("Exercício 06 - DIGITE UMA ANO : \n");
		Integer valorDigitado = Integer.parseInt(scanner.nextLine());

		String resultadoAnoBiSexto = verificarAnoBiSexto(valorDigitado);

		System.out.printf("Exercício 06 - O ANO %d É  : %s \n", valorDigitado, resultadoAnoBiSexto);

		scanner.close();

	}

	public static String verificarAnoBiSexto(Integer ano) {

		// https://learn.microsoft.com/pt-br/office/troubleshoot/excel/determine-a-leap-year

		// final Integer BUG_DO_MILENIUM = 2000;

		// Os seguintes anos são bissextos: 1600, 2000, 2400

		// Isso porque eles são uniformemente divisíveis por 100 e 400.

		/***
		 * Como as versões do Microsoft Excel antes do Excel 97 lidam apenas com anos de
		 * 1900 a 2078, apenas o ano de 1900 está sujeito à regra de exclusão 100/400 de
		 * anos bissextos no Microsoft Excel. No entanto, para ser compatível com outros
		 * programas, o Microsoft Excel trata o ano de 1900 como um ano bissexto.
		 ***/

		/***
		 * Como determinar se um ano é bissexto Para determinar se um ano é bissexto,
		 * execute estas etapas:
		 * 
		 * Se o ano for uniformemente divisível por 4, 
		 * vá para a etapa 2. Caso
		 * contrário, vá para a etapa 5. 
		 * Se o ano for uniformemente divisível por 100,
		 * vá para a etapa 3. Caso contrário, 
		 * vá para a etapa 4. Se o ano for
		 * uniformemente divisível por 400, vá para a etapa 4. 
		 * Caso contrário, vá para a etapa 5. 
		 * O ano é bissexto (tem 366 dias). 
		 * O ano não é um ano bissexto (tem 365 dias).
		 ***/

		/*
		 * Um ano solar possui a duração de 365 dias, 5 horas, 48 minutos e 46 segundos,
		 * possuindo no total 365,2422 dias; A partir da determinação de que um ano
		 * solar possui 365,2422 dias, o calendário gregoriano determinou que o ano
		 * bissexto aconteceria a cada quatro anos. Com isso, em "400 ANOS", teríamos
		 * "100 ANOS" bissextos.
		 */
		Double calcAno4 = (ano % 4.0);
		Double calcAno100 = (ano % 100.0);
		Double calcAno400 = (ano % 400.0);

		Boolean biSextoBol = (calcAno4 == 0) && (calcAno100 != 0 || calcAno400 == 0);

		String resultado = ((biSextoBol) ? "É BISEXTO" : "NÃO É BISEXTO");

		return resultado;

	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 06 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
