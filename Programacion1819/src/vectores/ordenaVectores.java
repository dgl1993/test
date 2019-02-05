package vectores;

public class ordenaVectores {

	public static void main(String[] args) {

		int[] vec = { 5, 1, 7, 3, 9 };

		Ordenavector(vec);

	}

	public static void Ordenavector(int[] vec) {

		int temp = 0;

		for (int i = 0; i < vec.length; i++) {

			for (int j = i; j < vec.length; j++) {

				if (vec[j] < vec[i]) {

					vec[i] = vec[j];

				}

			}

		}

	}
}

