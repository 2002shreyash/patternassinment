package PatternAssignement;

public class Pattern8 {

	public static void main(String[] args) {
		int row = 5;
		int col = 2;
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				System.out.print(j);
			}
			col++;
			System.out.println();
		}

	}

}
