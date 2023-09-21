package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char grade = sc.next().charAt(0);
		sc.close();
		
		System.out.println();
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Usually");
			break;
		case 'D':
			System.out.println("Effort");
			break;
		case 'F':
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
			break;
		}
		
		
		// 2.
		
//		String grade = sc.next();
//		sc.close();
//		
//		System.out.println(grade);
//		
//		if(grade.equals("A")) {
//			System.out.println("Excellent");
//		}else if(grade.equals("B")) {
//			System.out.println("Good");
//		}
		
		// 3.
//		char grade = sc.next().charAt(0);
//		System.out.println(grade);
//		sc.close();
//		
//		
//		if(grade == 'A') {
//			System.out.println("Excellent");
//		}
//		else if(grade == 'B') {
//			System.out.println("Good");
//		}
//		else if(grade == 'C') {
//			System.out.println("Usually");
//		}
//		else if(grade == 'D') {
//			System.out.println("Effort");
//		}
//		else if(grade == 'F'); {
//		System.out.println("Failure");
//		} else {
//			System.out.println("error");
//		}
	}
}
