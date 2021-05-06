package beakjoon_problem;

import java.util.Scanner;

public class beakjoon_2577 {

	public static void main(String[] args) {
		String stringNumber[] = new String[10];
		for(int i = 0; i<10; i++) {stringNumber[i] = Integer.toString(i);}

		int countNumber[] = new int[10];

		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int sum = num1 * num2 * num3;

		String sumToString = Integer.toString(sum);
		String sumArray[] = new String[sumToString.length()];
		for(int i=0; i<sumToString.length(); i++) {
			sumArray[i] = sumToString.substring(i, i+1);
		}
		
		for(int i=0; i<stringNumber.length; i++) {
			for(int j=0; j<sumArray.length; j++) {
				if(stringNumber[i].equals(sumArray[j])){
					countNumber[i] = countNumber[i] + 1;
				}
			}
		}
		for(int i=0; i<countNumber.length; i++) {System.out.println(countNumber[i]);}
		scanner.close();
	}
}
