package diome.java.poo.exercicios04;

import java.util.Scanner;

public class Main {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Iterando sobre os serviços contratados
        for (String servico : servicosContratados) {
            // Verificando se o serviço foi contratado
            if (servico.trim().equalsIgnoreCase("movel")) {
                movelContratado = true;
            }
            if (servico.trim().equalsIgnoreCase("banda larga")) {
                bandaLargaContratada = true;
            }
            if (servico.trim().equalsIgnoreCase("tv")) {
                tvContratada = true;
            }
        }

        // Verificando se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}
