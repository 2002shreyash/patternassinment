package PatternAssignement;

public class Pattern12 {
	public static void main(String[] args) {
		int s = 5;
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			s--;
			System.out.println();
		}
	}
}
