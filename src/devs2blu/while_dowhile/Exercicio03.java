package devs2blu.while_dowhile;

public class Exercicio03 {

	public static void main(String[] args) {

		// for (var i = 0; i < 100; i += 2) {

		for (var i = 0; i < 100; i++) {

			if ((i > 50) && (i < 60)) {
				continue;
			}

			if ((i > 70)) {
				break;
			}
			
			System.out.printf("%d \n", i);
		}
	}
}
