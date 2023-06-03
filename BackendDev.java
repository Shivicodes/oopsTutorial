package oopsinheritance;

import java.util.ArrayList;
import java.util.List;

public class BackendDev extends SoftwareDeveloper {
	String  ecloudid;
	String edbpasskey;
	List<String> dbaccess= new ArrayList<>();
	

	public BackendDev(int empid, String empname, String emprole, String ejoindate,String ecloudid, String edbpasskey) {
		super(empid,empname,emprole,ejoindate);
		this.ecloudid = ecloudid;
		this.edbpasskey = edbpasskey;
		//this.dbaccess = dbaccess;
	}


	public BackendDev() {
		// TODO Auto-generated constructor stub
	}
	public void displayworkstate() {
		System.out.println(" backenmd developers are in working state");
	}
	public List<String> dbinfo(){
		String defaultdb="dbadmin.dev";
		this.dbaccess.add(defaultdb);
		return this.dbaccess;	}
	public String cloudinfo() {
		return this.ecloudid;
	}
	

	
}
