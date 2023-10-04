package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cont = 0;
		for(;;) {
			int inp = sc.nextInt();
			if (inp >= 100 & inp >= 0) {
				sum += inp;
				cont++;
			} else {
				sc.close();
				break;
			}
		}
		double result = (double) sum/cont;
		System.out.println("sum : " + sum);
		System.out.printf("%s%4.1f", "avg : ", result);
	}
}
