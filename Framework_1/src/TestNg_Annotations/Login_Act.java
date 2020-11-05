package TestNg_Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_Act extends Generic_Test1
{
     @Test
     public void testLogin() throws InterruptedException
     {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.id("username")).sendKeys("admin");
    	driver.findElement(By.name("pwd")).sendKeys("manager");
    	driver.findElement(By.xpath("//a[@id='loginButton']"));
    	//Thread.sleep(2000);
    	String title = driver.getTitle();
    	System.out.println(title);
     }
}
