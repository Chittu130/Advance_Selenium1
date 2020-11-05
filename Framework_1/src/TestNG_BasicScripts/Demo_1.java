package TestNG_BasicScripts;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo_1 
{
		@Test
		public void test1()
		{
			Reporter.log("1", true);
		}
}
