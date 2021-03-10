package test;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups= {"Sanity"})
	public void method1(){
	System.out.println("method1 is Executed");
	}
	
	@Test(groups= {"Regression"})
	public void method2(){
	System.out.println("method2 is Executed");
	}
	
	@Test(groups= {"Regression"})
	public void method3(){
	System.out.println("method3 is Executed");
	}

}
