package oops_design;

import oops.poly.mathmatics;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	
	}
	public static void main(String[] args) {
		cohesion obj_cohesion=new cohesion();
		System.out.println(obj_cohesion.add(10));
		System.out.println(obj_cohesion.add(10,1000));
		System.out.println(obj_cohesion.subtract(45,12));
		System.out.println(obj_cohesion.subtract(45));
		System.out.println(obj_cohesion.multiply(78,89));
		//tight coupling
		couplingEmployee e1=new couplingEmployee();
	
		//e1.tightcoupling();
		
		
		//loose coupling 
		
		couplinginterface i1=(couplinginterface) new couplingAddress();
		couplinginterface.cityName();
		
		
		
	}
		

}
