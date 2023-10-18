package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int num = 1000;
		for(int i=0;i<inp.length; i++) {
			inp[i] = sc.nextInt();
			for (int j : inp) {
				num = Math.min(num, inp[i]);
			}
		}
		sc.close();
		System.out.println(num);
		
//		for(int i=0;i<inp.length; i++) {
//		inp[i] = sc.nextInt();
//		}
//		sc.close();
//		
//		int min = Integer.MAX_VALUE;
//		for (int i=0; i<inp.length; i++) {
//			if (inp[i] < min) {
//				min = inp[i];
//			}
//		}
//		System.out.println(min);
	}
}