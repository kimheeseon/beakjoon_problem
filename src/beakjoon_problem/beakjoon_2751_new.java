package beakjoon_problem;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class beakjoon_2751_new {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		//StringBuilder -> 문자열 더할 때 새로운 객체 생성하는 것이 아니라 기존의 데이터에 더하는 방식 사용
		
		int count = scanner.nextInt();
		ArrayList<Integer> numberList = new ArrayList<>();
		
		for(int i = 0; i<count; i++) {
			numberList.add(scanner.nextInt());
		}
		
		Collections.sort(numberList);
		//오름차순으로 정렬		
		
		for(int i = 0; i<count; i++) {
			sb.append(numberList.get(i) + "\n");
		}
		
		System.out.println(sb);
		
		scanner.close();

	}

}
