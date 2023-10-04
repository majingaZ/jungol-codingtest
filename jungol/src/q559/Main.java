package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] sum = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		double result = sum[a - 1] + sum[b - 1];
		System.out.println(result);

	}
}
