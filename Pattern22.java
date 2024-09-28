package PatternAssignement;

public class Pattern22 {
	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				if ((i + j == 6) || (i == j))
					System.out.print("X");
				else
					System.out.print("0");

			}
			System.out.println();
		}

	}

}
