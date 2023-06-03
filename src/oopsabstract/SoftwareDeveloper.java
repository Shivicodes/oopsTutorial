package oopsabstract;

public class SoftwareDeveloper extends Employee{
	//String workdomain="Software Developer";
	int minimalsal=10000;

	public SoftwareDeveloper(int empid,String empname,String empaddress,String empphno,String workdomain) {
		super(empid,empname,empaddress,empphno,workdomain);
		// TODO Auto-generated constructor stub
	}

	public double computesalary() {
		return minimalsal+20000;
		
	}
	public String workdomain(String empwork) {
		String domain="SDE1";
		return workdomain+domain;
		
	}
	// abstract class method compusory not to define every method s or property of base class 
	

}

