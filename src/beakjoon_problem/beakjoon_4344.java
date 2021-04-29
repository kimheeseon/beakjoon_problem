package beakjoon_problem;

import java.util.Scanner;
import java.math.*;

public class beakjoon_4344 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int C = scanner.nextInt();

		for(int i =0; i<C; i++) {
			int count = 0;
			double sum = 0;
			int number = scanner.nextInt();
			int[] scoreList = new int[number];

			for(int j=0; j<number; j++) {
				scoreList[j] = scanner.nextInt();
				sum = sum + scoreList[j];
			}

			double avg = sum/number;

			for(int k = 0; k<number; k++) {
				if(scoreList[k] > avg) {
					count += 1;
				}
			}

			double result = (double) count/number * 100;
			System.out.printf("%.3f%%\n", result);
		}
		scanner.close();
	}
}