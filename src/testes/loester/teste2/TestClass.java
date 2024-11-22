package testes.loester.teste2;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        
        // Imprime a conversão no formato desejado
        if (hours > 0 && remainingMinutes > 0) {
            System.out.println(hours + " hour(s) and " + remainingMinutes + " minute(s)");
        } else if (hours > 0) {
            System.out.println(hours + " hour(s)");
        } else {
            System.out.println(remainingMinutes + " minute(s)");
        }

        scanner.close();
    }
}
