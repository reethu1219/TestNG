package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx {
	
	
	@Parameters({"nameparam"})
	@Test
	public void testcase1(String name) {
		System.out.println("Hi : " +name);
	}

}
