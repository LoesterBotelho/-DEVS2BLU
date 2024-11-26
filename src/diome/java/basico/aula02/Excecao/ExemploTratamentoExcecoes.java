package diome.java.basico.aula02.Excecao;

public class ExemploTratamentoExcecoes {

    public static void main(String[] args) {
    	
        ExemploTratamentoExcecoes exemplo = new ExemploTratamentoExcecoes();
        
        exemplo.executar();
    }

    public void executar() {
      
    	try {
            // Código que pode gerar exceções
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro de aritmética: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Erro de ponteiro nulo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro geral: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado.");
        }
    }

    public int dividir(int a, int b) {
        return a / b;
    }
}