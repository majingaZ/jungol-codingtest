package q9035;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 수를 입력하세요. ");
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		int inp3 = sc.nextInt();
		sc.close();
		
		int max = (inp1 > inp2) ? inp1 : inp2;
		max = (max > inp3) ? max : inp3;
		System.out.println("입력받은 수 중 가장 큰 수는 " + max + "입니다.");
	}
}
