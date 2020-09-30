
public class Idproof extends Employee {

	
	int adharnob;
	int pannob;
	
	public Idproof(int empid, String empname, String emppos, double empsal, int adharnob, int pannob) {
		super(empid, empname, emppos, empsal);
		this.adharnob = adharnob;
		this.pannob = pannob;
	}

	@Override
	public String toString() {
		return "Idproof [adharnob=" + adharnob + ", pannob=" + pannob + ", empid=" + empid + ", empname=" + empname
				+ ", emppos=" + emppos + ", empsal=" + empsal + "]";
	}
	
	@Override
	void show() {
		System.out.println("Method of child class");
	}
	
	
}
