package PatternAssignement;

public class Pattern15 {

	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int space = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("*");
			}
			col--;
			System.out.println();
		}

	}

}
