package q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int sum = a + b + c;
		int avg = sum / 3;

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
//		int[] inp = new int[3];
//		int sum = 0;
//		for (int i=0; i<inp.length; i++) {
//			sum += inp[i];
//		}
//		int avg = 0;
//		System.out.println("sum : " + sum);
//		System.out.println("avg : " + sum/avg);
	}
}
