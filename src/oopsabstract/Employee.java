package oopsabstract;

public abstract class Employee {
	private int empid;
	private String empname;
	private String empaddress;
	private String empphno;
	public String workdomain;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid,String empname,String empaddress,String empphno) {
		this.empid=empid;
		this.empname=empname;
		this.empaddress=empaddress;
		this.empphno=empphno;
		
	}
	public Employee(int empid,String empname,String empaddress,String empphno,String empworkd) {
		this.empid=empid;
		this.empname=empname;
		this.empaddress=empaddress;
		this.empphno=empphno;
		this.workdomain=empworkd;
		
	}
	public double computesalary() {
		return 0.0;
		
	}
	public String workdomain(String empwork) {
		return workdomain;
		
	}
	public void displayInfo() {
		System.out.println("all details");
		System.out.println(this.empid+ " "+this.empname+ " "+this.empaddress+ ""+this.workdomain);

		
	}
	

}
