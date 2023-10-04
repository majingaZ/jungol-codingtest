package q9072;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] score = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<score.length; i++) {
			int inp = sc.nextInt();
			score[i] = inp;
			sum += inp;
		}
		sc.close();
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + (double) sum/score.length);
	}

}
