package ejercicios;

public class contornoRombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;

		for (int j = 0; j <= n; j++) {
			for (int k = n - j; k >= 0; k--) {
				System.out.print(" ");
			}

			if (j >= 0) {

				for (int i = 0; i < 1; i++) {
					System.out.print(" *");
				}

				for (int z = 2; z < j; z++) {
					System.out.print("  ");
				}

				if (j > 1) {
					System.out.print(" *");
				}
			}

			System.out.println("");

		}
		for (int k = 0; k <= n; k++) {
			for (int i = 0; i < n + k - (n - 2); i++) {

				System.out.print(" ");
			}

			if (k < (n - 1)) {

				System.out.print(" *");
				for (int i = n - 3; i > k; i--) {
					System.out.print("  ");
				}

				if (k < (n - 2)) {

					System.out.print(" *");

				}
			}

			System.out.println("");
		}
	}

}
