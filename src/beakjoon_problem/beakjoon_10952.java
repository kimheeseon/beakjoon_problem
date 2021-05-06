package beakjoon_problem;

import java.util.Scanner;

public class beakjoon_10952 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		int num1;
		int num2;
		
		while(true) {
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			if(num1 ==0 && num2 == 0) {
				break;
			}
			System.out.println(num1 + num2);
		}
		
		scanner.close();
	}
}
