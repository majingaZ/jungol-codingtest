package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
	
		char[] arr = str.toCharArray();
		
		System.out.print(arr[0] + " " + arr[3] + " " + arr[6]);

		
//		char[] inp = new char[10];
//		for (int i=0; i<inp.length; i++) {
//			inp[i] = sc.next().charAt(0);
//		}
//		sc.close();
//		
//			System.out.print(inp[0] + " " + inp[3] + " " + inp[6]);
	}
}
