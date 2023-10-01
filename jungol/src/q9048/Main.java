package q9048;

public class Main {

	public static void main(String[] args) {
		int num = 1;
		for(int i=0; i<=19; i++) {
			int result = num+i;
		if(result % 2 != 0) {
			System.out.print(result);
		} else {
			System.out.print(" ");
		}
		}
	}
}