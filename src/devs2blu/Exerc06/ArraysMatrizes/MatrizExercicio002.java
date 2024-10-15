/*
 * Autor: Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc06.ArraysMatrizes;

import java.util.Scanner;

public class MatrizExercicio002 {

    public static void main(String[] args) {
        /***
         *** Questão 1 - Escreva um programa para guardar dados de uma pesquisa feita com
         *** uma amostra de pessoas da avenida mais movimentada da cidade onde você mora.
         ***
         *** A pesquisa consiste em perguntar ao cidadão a quantidade de filhos, o nome
         *** de cada filho e a idade de cada filho.
         ***
         *** Guarde essas informações em uma matriz de forma que cada pessoa entrevistada
         *** ocupe o espaço necessário na memória para armazenar os dados dos filhos.
         ***
         *** Questão 2 - Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos de
         *** cada entrevistado, os respectivos nomes e as idades dos filhos.
         ***/

        imprimirAutor();

        Scanner entrada = new Scanner(System.in);

        System.out.printf("QUANTAS ENTREVISTAS FORAM EFETUADAS? : ");
        int qtdPessoas = Integer.parseInt(entrada.nextLine());

        String[][][] dadoPesquisa = new String[qtdPessoas][][];

        for (int pessoa = 0; pessoa < qtdPessoas; pessoa++) {

            System.out.printf("QUANTOS FILHOS A PESSOA %d TEM? : ", pessoa + 1);
            int qtdFilhos = Integer.parseInt(entrada.nextLine());


            dadoPesquisa[pessoa] = new String[qtdFilhos][2];

            for (int filho = 0; filho < qtdFilhos; filho++) {

                System.out.printf("DIGITE O NOME DO %dº FILHO: ", filho + 1);
                dadoPesquisa[pessoa][filho][0] = entrada.nextLine();

                System.out.printf("DIGITE A IDADE DO %dº FILHO: ", filho + 1);
                dadoPesquisa[pessoa][filho][1] = entrada.nextLine();
            }
        }


        System.out.printf("\nQUANTIDADE DE PESSOAS QUE PARTICIPARAM DA ENTREVISTA : %s \n", qtdPessoas);


        for (int pessoa = 0; pessoa < dadoPesquisa.length; pessoa++) {
            System.out.printf("A PESSOA %d TEM %d FILHOS\n", pessoa + 1, dadoPesquisa[pessoa].length);

            for (int filho = 0; filho < dadoPesquisa[pessoa].length; filho++) {
                String nomeFilho = dadoPesquisa[pessoa][filho][0];
                String idadeFilho = dadoPesquisa[pessoa][filho][1];
                System.out.printf("  FILHO %d: NOME: %s -  IDADE: %s ANOS\n", filho + 1, nomeFilho, idadeFilho);
            }
        }

        entrada.close();
    }

    public static void imprimirAutor() {
        System.out.printf("Exercício 02 - Loester Franco Botelho - Java\n");
        System.out.printf("..............................................\n");
    }
}
