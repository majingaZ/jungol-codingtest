package q571;

import java.util.Scanner;

public class Main {
	public static void print() {
		System.out.println("~!@#$^&*()_+|");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		System.out.println(inp);

//		Main m = new Main();
		for (int i = 0; i < inp; i++) {
//			m.print();
			print();
//			Main.print();
		}
	}
}