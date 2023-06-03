package oopsabstract;

public class AdminDept implements Department{

	public AdminDept() {
		// TODO Auto-generated constructor stub
	}
//	public AdminDept(int depid,String depname) {
//		this.deptid=depid;
//		this.deptname=depname;
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void displayDetails() {
		//this.deptid=10001;
		
		
		System.out.println("All details are here");
		System.out.println(this.deptid+ " "+this.deptname+" "+this.increment+" "+this.role_candidate);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public int editdeptid() {
		return this.deptid+100;
		// TODO Auto-generated method stub
		
	}

}

//101  20000 Admin_dept_candy
//201