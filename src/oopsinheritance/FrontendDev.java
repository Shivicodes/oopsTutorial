package oopsinheritance;

import java.util.ArrayList;
import java.util.List;

public class FrontendDev extends SoftwareDeveloper {
	String edomain;
    int  currentsal;
    List<String>  codelang=new ArrayList<> ();
   // int finalsal;
    public FrontendDev() {
		// TODO Auto-generated constructor stub
	}
    
   
	public FrontendDev(int empid,String empname,String emprole,String ejoindate,String edomain, int  currentsal) {
		super(empid,empname,emprole,ejoindate);
		this.edomain = edomain;
		this.currentsal = currentsal;
		//this.codelang = codelang;
	}
	public int salgenerator() {
		return this.minimalsal+this.currentsal;
	}
	public List<String> codelanginfo(){
		this.codelang.add("python");
		this.codelang.add("java");
		this.codelang.add("node");
		
		return codelang;
	}
	@Override
	public String toString() {
		return "FrontendDev [edomain=" + edomain + ", currentsal=" + currentsal + ", codelang=" + codelang + "]";
	}


//	public void displayworkstate() {
//		System.out.println(" frontend developers are in working state");
//	}



	
}
