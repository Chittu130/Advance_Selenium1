package TestNG_BasicScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Dependencies 
{
	@Test
    public void compose()
    {
  	  Reporter.log("compose", true);
    }
    @Test(dependsOnMethods="compose")
    public void sentItems()
    {
  	  Reporter.log("SentItems", true);
    }
    @Test(dependsOnMethods="sentItems")
    public void trash()
    {
  	  Reporter.log("trash", true);
    }
}
