
public class WfhAllownce extends Employee {

	int int_allownce;
	int elect_allownce;
	
	
	public WfhAllownce(int empid, String empname, String emppos, double empsal, int int_allownce, int elect_allownce) {
		super(empid, empname, emppos, empsal);
		this.int_allownce = int_allownce;
		this.elect_allownce = elect_allownce;
	}


	@Override
	public String toString() {
		return "WfhAllownce [int_allownce=" + int_allownce + ", elect_allownce=" + elect_allownce + ", empid=" + empid
				+ ", empname=" + empname + ", emppos=" + emppos + ", empsal=" + empsal + "]";
	}


	
	
}


