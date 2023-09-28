package q103;

public class Main {

	public static void main(String[] args) {
        char t = 'T';

        for(int i=1; i<=10; i++) {
            System.out.print(t);
        }
        System.out.println();
        
        for(int i=1; i<=10; i++) {
        	System.out.print(t);
        }
        System.out.println();
        for(int j=1; j<=3; j++) {
        	System.out.printf("%6s\n", "TT");
        }
	}
}