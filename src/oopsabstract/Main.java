package oopsabstract;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	//public Employee(int empid,String empname,String empaddress,String empphno,String empworkd) {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee obj1=new Employee(123,"jyotirmai","varanasi,uttar pradesh","9975438378322","Software Developer");
		Employee sd1=new SoftwareDeveloper(123,"jyotirmai","varanasi,uttar pradesh","9975438378322","Software Developer");
		SoftwareDeveloper sd2=new SoftwareDeveloper(123,"jyotirmai","varanasi,uttar pradesh","9975438378322","Software Developer");

		System.out.println(sd1.workdomain("software developer"));
		System.out.println(sd1.computesalary());
		sd1.displayInfo();
		
		System.out.println(sd2.workdomain("software developer"));
		System.out.println(sd2.computesalary());
		sd2.displayInfo();
		// interface canot be instaciated 
	//	Department d1=new Department();
		Department d1=new AdminDept();
		//AdminDept d2=new AdminDept();
		d1.displayDetails();
		System.out.println(d1.editdeptid());
		
		
		

	}

}
//101  20000 Admin_dept_candy
//201



