package Random_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("ckhardkaur8@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bangalore+123");
		driver.findElement(By.xpath("//button[.='Log In']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@role='button'])[3]")).click();
		Thread.sleep(2000);
		
		//JavascriptExecutor JSE =(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
		
		/*Point LOC= ele.getLocation();
		System.out.println(LOC);
		int x= LOC.getX();
		System.out.println(x);
		int y=LOC.getY();
		System.out.println(y);
		
		JSE.executeScript("window.scrollBy("+x+","+y+")");*/		
	}
}
