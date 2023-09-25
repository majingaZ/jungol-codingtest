package q613;

import java.util.Scanner;
import q613.Student;

public class Main {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String inp = sc.nextLine();

//		String[] str = new String[3];
//		sc.close();
//		
//		System.out.println("Name : " + str[0] + " ");
//		System.out.println("School : " + str[1] + " ");
//		System.out.println("Grade : " + str[2]);

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();

		Student stu1 = new Student(name, school, grade);
		stu1.print();
	}
}
