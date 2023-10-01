package q9067;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		int inp = 0;
		for(int i=0; i<num.length; i++) {
			inp = sc.nextInt();
			num[i] = inp;
		}
		sc.close();
		System.out.print(num[2] + " " + num[4] + " " + num[9]);
	}
}
