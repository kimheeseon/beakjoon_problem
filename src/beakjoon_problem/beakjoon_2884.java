package beakjoon_problem;

import java.util.Scanner;

public class beakjoon_2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//상근이가 알람 설정한 시간 : hour시 minute분
		//(0 ≤ hour ≤ 23, 0 ≤ minute ≤ 59)
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		
		if(minute >= 45)//minute가 45보다 크면 45분 일찍 설정해도 시간이 바뀌지 않음
			System.out.print(hour + " " + (minute-45));
		else {
			if(hour == 0)
				System.out.print(23 + " " + (60-45+minute));
			else
				System.out.println((hour-1) + " " +(60-45+minute));
		}
		scanner.close();
	}
}
