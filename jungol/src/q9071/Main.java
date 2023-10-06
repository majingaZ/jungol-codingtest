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
		for (int i=0; i<inp.length; i++) {
			if(inp[i] % 2 == 0) {
				if (max < inp[i]) {
					max = inp[i];
				} else {
					if (min > inp[i]) {
						min = inp[i];
					}
				}
			}
		}
			System.out.println(min + " " + max);

//		int[] a = new int[10];
//		int[] b = new int[10];
//
//		for (int i = 0; i < inp.length; i++) {
//			inp[i] = sc.nextInt();
//		}
//		sc.close();
//        
//		int m1 = Integer.MAX_VALUE;
//		int m2 = Integer.MIN_VALUE;
//		
//		for (int i = 0; i < inp.length; i++) {
//			if (inp[i] % 2 == 0) {
//				a[i] += inp[i];
//				m1 = Math.max(m1, inp[i]);
//			} else {
//				b[i] += inp[i];
//				m2 = Math.min(m2, inp[i]);
//			}
//		}
//
//		System.out.println(m1);
//		System.out.println(m2);
	}
}
