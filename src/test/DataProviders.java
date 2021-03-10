package test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {                  //class,java proj name shld b same while annotation shld not be same as them
	
	@DataProvider (name = "data-provider")
    
    public Object[][] dpMethod(){
        
        return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
     }
    

	
	@Test(dataProvider="data-provider")
	public void additiontest(int a,int b,int result) {
		int c=a+b;
		System.out.println(c);
		System.out.println(result);

		
		if(c==result) {
			System.out.println("TC Passed");

		}else {
			System.out.println("TC Failed");

		}

	}
	

}
