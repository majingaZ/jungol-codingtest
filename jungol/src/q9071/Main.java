package q9071;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		int max = -10000, min = 10000;
		for (int i = 0; i < inp.length; i++) {
			if (inp[i] % 2 == 0) {
				if (inp[i] > max) {
					max = inp[i];
				}
			} else {
				if (inp[i] < min) {
					min = inp[i];
				}
			}
		}
		System.out.println(min + " " + max);
	}
}
