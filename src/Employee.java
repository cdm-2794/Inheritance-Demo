
public class Employee {
	
	int empid;
	String empname;
	String emppos;
	double empsal;
	
	public Employee(int empid, String empname, String emppos, double empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emppos = emppos;
		this.empsal = empsal;
	}	
	
	 void show()
	{
		System.out.println("Method of Parent class");
	}
}
