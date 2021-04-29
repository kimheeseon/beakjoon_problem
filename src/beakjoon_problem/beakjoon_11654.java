package beakjoon_problem;
import java.util.Scanner;

public class beakjoon_11654 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		char ascii = input.charAt(0);
		int toAscii = ((int)ascii);
		
		System.out.print(toAscii);
		
		scanner.close();
	}
}
