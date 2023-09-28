package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.close();
		
		int s = w+100-h;
		System.out.println(s);
		if (s>0) {
			System.out.println("Obesity");
		}

	}

}
