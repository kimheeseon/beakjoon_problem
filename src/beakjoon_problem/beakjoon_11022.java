package beakjoon_problem;

import java.util.Scanner;

public class beakjoon_11022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();//caseÀÇ °³¼ö T

		for(int i = 1; i<=T; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			int num3 = num1 + num2;
			
			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + num3);
		}
		scanner.close();
	}
}