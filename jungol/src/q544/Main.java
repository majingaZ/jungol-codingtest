package q544;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		int result = 0;
		for(int i=inp; i<=100; i++) {
			result += i;
		}
		System.out.println(result);
	}
}