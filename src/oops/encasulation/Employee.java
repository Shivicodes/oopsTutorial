package oops.encasulation;

public class Employee {
	private int empid;
	private String empname;
	private String emproles;
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmproles() {
		return emproles;
	}

	public void setEmproles(String emproles) {
		this.emproles = emproles;
	}

	public String getEmpphno() {
		return empphno;
	}

	public void setEmpphno(String empphno) {
		this.empphno = empphno;
	}

	private String empphno;
	
	public Employee(int empid, String empname, String emproles, String empphno) {
		//super();
		this.empid = empid;
		this.empname = empname;
		this.emproles = emproles;
		this.empphno = empphno;
	}

	public void displayinfo() {
		System.out.println("extracting all details");
	}

	

}
