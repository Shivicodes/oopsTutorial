package com.oops;
// properties empid,empname,empage,emprole
//displayDetails, calcSalary, roleBonus
public class Employee {
	protected int empid;
	protected String empname;
	protected int empage;
	protected int basesal=10000;
	protected int bonus;
	protected String emprole;
		public Employee() {
		// TODO Auto-generated constructor stub
	    }
		public Employee(int empid,String empname,int empage,String emprole) {
			this.empid=empid;
			this.empname=empname;
			this.empage=empage;
			this.emprole=emprole;
			
		}
		public Employee(String empname,int empage,String emprole) {
			//this.empid=empid;
			this.empname=empname;
			this.empage=empage;
			this.emprole=emprole;
			
		}
		public Employee(String empname,int empage,String emprole,int bonus) {
			//this.empid=empid;
			this.empname=empname;
			this.empage=empage;
			this.emprole=emprole;
			this.bonus=bonus;
			
		}
		public void displayDetails() {
			System.out.println("employee details"+ " "+this.empid+ " "+this.empname+ " "+ this.emprole);
		}
		public int calcsalary(int bonus) {
			return basesal+bonus;
		}
		// role ="Software dev"  bonus=20000
		//role ="admin bonus=10000
		//others bonus=5000
		public int roleBonus() {
			if(this.emprole=="Software developer") {
				this.bonus=20000;
			}
			else if(this.emprole=="Admin") {
				this.bonus=10000;
			}
			else {
				this.bonus=5000;
			}
			
			
			return this.bonus;
		}
 
	

}


