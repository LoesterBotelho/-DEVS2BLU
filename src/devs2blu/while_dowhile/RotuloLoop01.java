package devs2blu.while_dowhile;

public class RotuloLoop01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		loop1: for (var i = 0; i <= 10; i++) {
			loop2: for (var j = 0; j <= 10; j++) {

				System.out.printf("%d %d \n", i, j);

				if ((i == 2) && (j == 2)) {
					break loop1;
				}
			}
		}
	}

}
