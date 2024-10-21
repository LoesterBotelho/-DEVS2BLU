package diome.java.basico.aula04.enums;

public class MainTeste {
    public static void main(String[] args) {
    	
        // Testar a obtenção do código para cada status
        System.out.println("Testando a obtenção do código para cada status:");
        for (Status status : Status.values()) {
            System.out.printf("Status: %s, Código: %d%n", status, status.getCodigo());
        }

        // Testar a conversão de código para status
        System.out.println("\nTestando a conversão de código para status:");
        for (int i = 0; i <= 3; i++) {
            try {
                Status status = Status.fromCodigo(i);
                System.out.printf("Código: %d, Status: %s%n", i, status);
            } catch (IllegalArgumentException e) {
                System.out.printf("Código: %d, Erro: %s%n", i, e.getMessage());
            }
        }

        // Testar a conversão com um código inválido
        System.out.println("\nTestando a conversão com um código inválido:");
        try {
            Status statusInvalido = Status.fromCodigo(5);
            System.out.printf("Código: 5, Status: %s%n", statusInvalido);
        } catch (IllegalArgumentException e) {
            System.out.printf("Código: 5, Erro: %s%n", e.getMessage());
        }
    }
}
