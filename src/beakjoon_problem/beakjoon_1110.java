package beakjoon_problem;
import java.util.Scanner;

public class beakjoon_1110 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input_num = scanner.nextInt();
		
		int cycle_count = 0;
		int tensPlace = 0;
		int unitsPlace = 0;
		int newNumber = 0;
		int var_num = input_num;
		
		//if(input_num < 0) { input_num = 0 + input_num;} -> X
		
		while(true) {
			tensPlace = var_num / 10;
			unitsPlace = var_num % 10;
			newNumber = tensPlace + unitsPlace;
			var_num = (unitsPlace*10) + (newNumber%10); 
			cycle_count ++;			
			if(input_num == var_num) {break;}
		}
		System.out.print(cycle_count);
		scanner.close();
	}
}