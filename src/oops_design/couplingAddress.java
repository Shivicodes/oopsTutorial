package oops_design;

public class couplingAddress {
	
	public void  cityName() {
	    System.out.println("the city details are");
	    //System.out.println("the city details are"+"banaras");
	    //Now if we chane the implementation of our cityname() function
	    //then it will be reflected in employee
	    System.out.println("the city details are"+"noida");

	    
	}
	

}
