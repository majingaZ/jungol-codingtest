package q614;

import java.util.Scanner;
import q614.School;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		School sc1 = new School ("Jejuelementary", 6);
		School sc2 = new School (name, grade);
		sc1.print();
		sc2.print();
		}
	}
