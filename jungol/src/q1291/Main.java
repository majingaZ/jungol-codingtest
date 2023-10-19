package q1291;

import java.util.Scanner;

class Gugudan {
	private int s;
	private int e;

	public Gugudan(int s, int e) {
		this.s = s;
		this.e = e;
	}

	void print() {
		if (s < e) {
			for (int i = 1; i <= 9; i++) {
				for (int j = s; j <= e; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, (j * i));
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i <= 9; i++) {
				for (int j = s; j >= e; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, (j * i));
				}
				System.out.println();
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s, e;

		do {
			s = sc.nextInt();
			e = sc.nextInt();

			if (s < 2 || s > 9 || e < 2 || e > 9) {
				System.out.println("INPUT ERROR!");
			}
		} while (s < 2 || s > 9 || e < 2 || e > 9);

		sc.close();

		Gugudan dan = new Gugudan(s, e);
		dan.print();
	}
}
