package oopsinheritance;

import java.util.Date;

public class SoftwareDeveloper {
	int empid;
	String empname;
	String emprole;
	int minimalsal=10000;
	String ejoindate;

	public SoftwareDeveloper() {
		// TODO Auto-generated constructor stub
	}
	public SoftwareDeveloper(int empid, String empname, String emprole, String ejoindate) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emprole = emprole;
		//this.minimalsal = minimalsal;
		this.ejoindate = ejoindate;
	}
	public void displayInfo() {
		System.out.println("details are"+" "+this.empid+" "+this.empname+" "+this.emprole+ " "+this.minimalsal+" "+this.ejoindate);
		
	}
	public void displayworkstate() {
		System.out.println("developers are in working state");
	}
	public int dispalyMinimalsal() {
		return this.minimalsal;
	}
	@Override
	public String toString() {
		return "SoftwareDeveloper [empid=" + empid + ", empname=" + empname + ", emprole=" + emprole + ", minimalsal="
				+ minimalsal + ", ejoindate=" + ejoindate + "]";
	}

	
	

}
