package beakjoon_problem;

import java.util.Scanner;

public class beakjoon_2750 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int [] numlist = new int[count];
		
		for(int i = 0; i<count; i++) {
			numlist[i] = scanner.nextInt();
		}
				
		for(int i=1; i<count; i++) {
			int loc = i-1;
			int newnumber = numlist[i];
			
			while(loc >= 0 && newnumber<numlist[loc]) {
				int temp = numlist[loc+1];
				numlist[loc + 1] = numlist[loc];
				numlist[loc] = temp;
				loc--;
			}			
			numlist[loc+1] = newnumber;
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(numlist[i]);
		}
		
		scanner.close();
	}

}
