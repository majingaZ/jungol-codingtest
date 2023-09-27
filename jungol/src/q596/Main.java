package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i = sc.nextInt();
		sc.close();

		if (str.length() < i) {
			for (int j = str.length() - 1; j >= 0; j--) {
				System.out.print(str.charAt(j));
			}
		} else {
			for (int j = str.length() - 1, c = 0; c < i; j--, c++) {
				System.out.print(str.charAt(j));
			}
		}

//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		int numToPrint = sc.nextInt();
//		sc.close();
//
//		char[] arr = str.toCharArray();
//
//		// 입력받은 정수 값이 문자열 길이보다 큰 경우 처리
//		int startIndex = Math.max(0, arr.length - numToPrint);
//
//		// 입력받은 정수 값만큼 문자 출력 (뒤에서부터 출력)
//		for (int j = arr.length - 1; j >= startIndex; j--) {
//			System.out.print(arr[j]);
//		}

	}

}
