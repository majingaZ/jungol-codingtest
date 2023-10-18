package q572;

import java.util.Scanner;

public class Main {
	
	static double pi () {
		return 3.14;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		double area = inp*inp*pi();
		
		System.out.printf("%.2f", area);
	}
}
