package PatternAssignement;

public class Pattern4 {

	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		char a = 'A';
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print((char) (a + i + j));
			}
			System.out.println();
		}

	}

}
