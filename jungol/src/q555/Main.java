package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[] ar = new char[10];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<=9; i++) {
			ar[i] = scanner.next().charAt(0);
		}
		scanner.close();
		
/*		ar[0] = scanner.next().charAt(0);
		ar[1] = scanner.next().charAt(0);
		ar[2] = scanner.next().charAt(0);
		ar[3] = scanner.next().charAt(0);
		ar[4] = scanner.next().charAt(0);
		ar[5] = scanner.next().charAt(0);
		ar[6] = scanner.next().charAt(0);
		ar[7] = scanner.next().charAt(0);
		ar[8] = scanner.next().charAt(0);
		ar[9] = scanner.next().charAt(0);
*/
		scanner.close();
		String out = "";
		for(int i=0; i<=9; i++) {
			out += ar[i];
		}
		System.out.println(out);
		
//		System.out.print("" + ar[0] + ar[1] + ar[2] + ar[3] + ar[4] + ar[5] + ar[6] + ar[7] + ar[8] + ar[9]);
	}

}
