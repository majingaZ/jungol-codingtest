package q9068;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		
		while (true) {
			for(int i=0; i<num.length; i++) {
			int inp = sc.nextInt();
			if (inp != 0) {
				num[i] = inp;
			} else {
				sc.close();
			}
			if (i % 2 == 0) {
			System.out.print(num[i]);
			} else {
				System.out.print(" ");
			}
				break;
			}
		}
	}
}
