package beakjoon_problem;

//피드백 : 윤휘 - 시간 계산 할 때 여러 개를 고쳐야 함(ex) 45분이 아니라 50분인 경우 숫자 4개 바꿔야 함
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
