package TestNg_Annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_Furper extends Generic_Test1
{
     @Test
     public void test1() throws InterruptedException
     {
    	 driver.findElement(By.xpath("//a[@href='/account']")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//input[@id='CustomerEmail']")).sendKeys("ckhardkaur8@gmail.com");
    	 driver.findElement(By.xpath("//input[@id='CustomerPassword']")).sendKeys("Bangalore+123");
    	 driver.findElement(By.xpath("//input[@type='submit']")).click();
    	 Thread.sleep(2000);
    	 String title = driver.getTitle();
    	 System.out.println(title);
     }
}
