package q9068;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		
		boolean bplay = true;
		while (bplay) {
			for (int i = 0; i < num.length; i++) {
				int inp = sc.nextInt();
				
				if (inp != 0) {
					num[i] = inp;
				} else {
					bplay = false;
					break;
				}
			}
		}
		sc.close();
		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 1 && num[i]!=0) {
				System.out.print(num[i]+" ");
			} 
		}

	}
}
