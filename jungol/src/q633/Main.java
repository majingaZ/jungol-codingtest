package q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String korea = "Seoul";
		String usa = "Washington";
		String japan = "Tokyo";
		String china = "Beijing";
		
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.println("number? ");
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println(korea);
		} else if (num==2) {
			System.out.println(usa);
		} else if (num==3) {
			System.out.println(japan);
		} else if (num==4) {
			System.out.println(china);
		} else {
			System.out.println("none");
			sc.close();
			break;
		}
		}
	}

}
