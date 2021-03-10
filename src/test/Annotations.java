package test;

 

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

public class Annotations {
    
    @BeforeTest
    public void beforetest() {
        System.out.println("before test is executed");
    }
    
    @BeforeMethod
    public void beforemethod() {
        System.out.println("before method is executed");
    }
    
    @Test
    public void method1() {
        System.out.println("method1 is Executed");
    }
     
    @Test
    public void method2() {
        System.out.println("method2 is Executed");
    }
    
    @AfterMethod
    public void aftermethod() {
        System.out.println("after method is executed");
    }
    
    @AfterTest
    public void aftertest() {
        System.out.println("after test is executed");
    }

 

}
 