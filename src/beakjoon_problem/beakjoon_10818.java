package beakjoon_problem;
import java.util.Scanner;

public class beakjoon_10818 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int[] numList = new int[num];
		
		for(int i = 0; i<num; i++) {
			numList[i] = scanner.nextInt();
		}
		int max = numList[0];
		int min = numList[0];
		
		for(int i =0; i<num; i++) {
			if(numList[i] > max) {
				max = numList[i];
			}
		}
		
		for(int i = 0; i<num; i++) {
			if(numList[i] < min) {
				min = numList[i];
			}
		}
		
		System.out.print(min + " " + max);
		
		scanner.close();
	}
}
