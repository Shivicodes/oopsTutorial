package oops.poly;
//polymorphism
//method overload 
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		mathmatics m1=new mathmatics();
	
		System.out.println(m1.area(10));
		System.out.println(m1.area(10,20));	
		System.out.println(m1.area(10,50,78));	
		System.out.println(m1.area(10.861,12.378));	
		Animal a1=new cat();
		a1.eat();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
//100
//200
//39000
//67.21872900000001