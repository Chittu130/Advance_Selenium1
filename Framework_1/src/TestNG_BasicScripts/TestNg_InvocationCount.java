package TestNG_BasicScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_InvocationCount 
{
	 @Test
     public void test1()
     {
   	  Reporter.log("1", true);
     }
     @Test(invocationCount=3)
     public void test2()
     {
   	  Reporter.log("2", true);
     }
}
