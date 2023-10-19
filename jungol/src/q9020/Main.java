package q9020;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String inp = "";
//		try {
//			System.out.print("5개의 수를 입력하시오. ");
//			inp = br.readLine();
//			System.out.println(inp);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		StringTokenizer st = new StringTokenizer(inp);
//		int[] num = new int[5];
//		int i = 0;
//		while (st.hasMoreTokens()) {
//			num[i++] = Integer.parseInt(st.nextToken());
//		}
//
//		num[0] += 3;
//		num[1] -= 3;
//		num[2] *= 3;
//		num[3] /= 3;
//		num[4] %= 3;
//
//		for (int j = 0; j < num.length; j++) {
//			System.out.print(num[j] + " ");
//		}

		int[] inp = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 수를 입력하시오. ");
		for (int i=0; i<5; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		inp[0] += 3;
		inp[1] -= 3;
		inp[2] *= 3;
		inp[3] /= 3;
		inp[4] %= 3;

		for (int j = 0; j < inp.length; j++) {
			System.out.print(inp[j] + " ");
		}
	}
}
