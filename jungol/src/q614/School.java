package q614;

public class School {
	private String pname;
	private int pgrade;
	
	public School(String pname, int pgrade) {
		this.pname = pname;
		this.pgrade = pgrade;
	}
	
	public void print() {
		System.out.println(pgrade + " grade in " + pname + " School ");
	}
}
