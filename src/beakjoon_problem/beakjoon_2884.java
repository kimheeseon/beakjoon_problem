package beakjoon_problem;

//�ǵ�� : ���� - �ð� ��� �� �� ���� ���� ���ľ� ��(ex) 45���� �ƴ϶� 50���� ��� ���� 4�� �ٲ�� ��
import java.util.Scanner;

public class beakjoon_2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//����̰� �˶� ������ �ð� : hour�� minute��
		//(0 �� hour �� 23, 0 �� minute �� 59)
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		
		if(minute >= 45)//minute�� 45���� ũ�� 45�� ���� �����ص� �ð��� �ٲ��� ����
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
