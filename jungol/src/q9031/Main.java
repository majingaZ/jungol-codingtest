package q9031;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		if (inp1 > inp2) {
			System.out.println("입력받은 수 중 큰 수는 " + inp1 + "이고 작은 수는 " + inp2 + "입니다.");
		} else {
			System.out.println("입력받은 수 중 큰 수는 " + inp2 + "이고 작은 수는 " + inp1 + "입니다.");
		}
	}
}
