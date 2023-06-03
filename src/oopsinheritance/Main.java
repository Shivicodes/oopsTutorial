package oopsinheritance;

import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		FrontendDev ob1=new FrontendDev(101,"jyotirmai","software dev","12-12-12","backend",55000);
		System.out.println(ob1.codelanginfo());
		System.out.println(ob1.salgenerator());
		ob1.displayworkstate();
		System.out.println(ob1.toString());
		
		BackendDev obj2=new BackendDev(101,"jyotirmai","software dev","12-12-12","shallow","password1001pass");
		obj2.displayworkstate();
		System.out.println(obj2.cloudinfo());
		System.out.println(obj2.dbinfo());
		
		BackendDev obj3=new BackendDev();
		obj2.displayworkstate();
		System.out.println(obj3.cloudinfo());
		System.out.println(obj3.dbinfo());



		

		
		




		


	}

}
