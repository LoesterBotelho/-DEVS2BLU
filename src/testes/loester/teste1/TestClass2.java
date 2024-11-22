package testes.loester.teste1;

import java.io.*;

public class TestClass2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        
        int N = Integer.parseInt(br.readLine().trim()); // Ler número de entradas
        int[][] ratings = new int[N][2]; // Inicializar o array de ratings
        
        // Ler os valores de ratings
        for (int i_ratings = 0; i_ratings < N; i_ratings++) {
            String[] arr_ratings = br.readLine().split(" ");
            for (int j_ratings = 0; j_ratings < arr_ratings.length; j_ratings++) {
                ratings[i_ratings][j_ratings] = Integer.parseInt(arr_ratings[j_ratings]);
            }
        }

        // Chama a função que resolve o problema
        int out_ = solution(N, ratings);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static int solution(int N, int[][] ratings) {

        int bestDish = Integer.MAX_VALUE;
        int highestRating = -1;


        for (int i = 0; i < N; i++) {
            int valorParametroUm = ratings[i][0]; //  dish
            int valorParametroDois = ratings[i][1]; // rating

            if (valorParametroDois > highestRating) {
                highestRating = valorParametroDois;
                bestDish = valorParametroUm;
            } else if (valorParametroDois == highestRating) {
                if (valorParametroUm < bestDish) {
                    bestDish = valorParametroUm;
                }
            }
        }

        return bestDish;
    }
}
