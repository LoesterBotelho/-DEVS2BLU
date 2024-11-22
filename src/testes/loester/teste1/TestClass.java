package testes.loester.teste1;

import java.io.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        
         int N = Integer.parseInt(br.readLine().trim());
         int[][] ratings = new int[N][2];
         
         for(int i_ratings = 0; i_ratings < N; i_ratings++)
         {
         	String[] arr_ratings = br.readLine().split(" ");
         	
         	for(int j_ratings = 0; j_ratings < arr_ratings.length; j_ratings++)
         	{
         		ratings[i_ratings][j_ratings] = Integer.parseInt(arr_ratings[j_ratings]);
         	}
         }

         int out_ = solution(N, ratings);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    

/*

4
512 2
123 3
987 4
123 5
# SAIDA ESPERADA
123


5
987654423 4
987654220 5
987654202 4
987654250 1
987654419 5
# SAIDA ESPERADA
987654220


5
987654171 3
987654478 3
987654092 4
987654421 3
987654001 4
# SAIDA ESPERADA
987654001






 */

    static int solution(int N, int[][] ratings) {

        int bestDish = ratings[0][0];
        int highestRating = ratings[0][1];

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i][1] > highestRating) {
                highestRating = ratings[i][1];
                bestDish = ratings[i][0];
            }
        }

        return bestDish;
    }
}