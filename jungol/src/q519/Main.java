package q519;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int sum = a+100;
		int avg = b % 10;
		
		System.out.println(sum + " " + avg);
	}
}
