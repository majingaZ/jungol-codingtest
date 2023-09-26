package q632;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		
		if(a<b && a<c) {
			System.out.println(a);
		}
		else if (b<c && b<a) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		
//		2. 배열을 이용하는 방법
//		Scanner sc = new Scanner(System.in);
//		int[] ar = new int[3];
//		for (int i=0; i<ar.length; i++) {
//			ar[i] = sc.nextInt();
//		}
//		sc.close();
//		
//		for (int i=0; i<ar.length; i++) {
//			System.out.println(ar[i] + " ");
//		}
//		
//		if(ar[0] > ar[1]) {
//			if(ar[1] > ar[2]) {
//				System.out.println(ar[2]);
//			} else {
//				System.out.println(ar[1]);
//			}
//		} else {
//			if(ar[0] > ar[2]) {
//			} else {
//			System.out.println(ar[1]);
//			}
//		}
		
//		3. 삼항 연산자를 이용한 방법
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		sc.close();
//		
//		int i = (a<b) ? a:b;
//		i = (i<c) ? i:c;
//		
//		System.out.printf("%d", i);
		
	}

}
