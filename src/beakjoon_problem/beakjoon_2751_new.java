package beakjoon_problem;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class beakjoon_2751_new {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		//StringBuilder -> ���ڿ� ���� �� ���ο� ��ü �����ϴ� ���� �ƴ϶� ������ �����Ϳ� ���ϴ� ��� ���
		
		int count = scanner.nextInt();
		ArrayList<Integer> numberList = new ArrayList<>();
		
		for(int i = 0; i<count; i++) {
			numberList.add(scanner.nextInt());
		}
		
		Collections.sort(numberList);
		//������������ ����		
		
		for(int i = 0; i<count; i++) {
			sb.append(numberList.get(i) + "\n");
		}
		
		System.out.println(sb);
		
		scanner.close();

	}

}
