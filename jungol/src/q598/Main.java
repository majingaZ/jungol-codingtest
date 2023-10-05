package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			char inp = sc.next().charAt(0);
			
			if (inp >= 48 && inp <= 57) {
				System.out.printf("%d\n", (int)inp);
			} else if (inp >= 65 && inp <= 90 || inp >= 97 && inp <= 122) {
				System.out.printf("%c\n", inp);
			} else {
				sc.close();
				break;
			}
//			if(Character.isAlphabetic(inp)) {
//				System.out.println(inp);
//			} else if (Character.isDigit(inp)) {
//				System.out.printf("%d\n", (int)inp);
//			} else {
//				sc.close();
//				break;
//			}
		}
	}
}
