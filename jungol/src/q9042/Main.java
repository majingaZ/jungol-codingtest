package q9042;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		double avg = 0.0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			int inp = sc.nextInt();
			if (inp != 0) {
				num++;
				sum += inp;
				avg = (double) sum / num;
			} else {
				break;
			}
		}
		sc.close();
		System.out.println("입력된 자료의 개수 = " + num);
		System.out.println("입력된 자료의 합계 = " + sum);
		System.out.printf("%s%.2f", "입력된 자료의 평균 = ", avg);
	}
}