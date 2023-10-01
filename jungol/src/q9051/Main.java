package q9051;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
		int inp = sc.nextInt();
		
		if (inp % 2 == 0) {
			sum++;
		}
	}
		sc.close();
		System.out.println("입력받은 짝수는 " + sum + "개입니다.");
		
		
//		if (inp % 2 == 0) {
//		System.out.println(inp);
//		}
		
//		String inp = sc.nextLine();
//		sc.close();
//		int num = 0;
//		num = Integer.valueOf(inp);
//		
//		int sum = 0;
//		if (num % 2 == 0) {
//			sum += num;
//		}
//		System.out.println("입력받은 짝수는 " + sum + "개입니다.");
	}
}