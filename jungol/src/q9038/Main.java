package q9038;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		if (inp1 > inp2) {
			System.out.println(inp1);
		} else {
			System.out.println(inp2);
		}
	}
}
