package q124;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		int a = 28;
		int b = 30;
		int c = 31;
		
		switch(inp) {
		case 2:
			System.out.println(a);
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(b);
			break;
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:
			System.out.println(c);
			break;
		}
	}
}
