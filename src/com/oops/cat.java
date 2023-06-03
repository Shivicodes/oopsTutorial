package com.oops;


//class : properties ,behaviour ,interfaces ,constructor,init,destructor
public class cat {
	String shape;
	int size;
	String name;
	
	public cat() {
		// TODO Auto-generated constructor stub
	}
	public cat(String shape,int size_cat,String name_cat) {
		this.shape=shape;
		this.size=size_cat;
		this.name=name_cat;
		
	}
	//behavior
	//methods  functions
	public void sleep() {
		System.out.println("sleep state");
	}
	public void eat() {
		System.out.println("eat state");
	}
	public int size_generator(){
		return this.size;
	}
	
	
}
	
	
	

