package TestNg_Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test1 
{
	WebDriver driver;
	@BeforeMethod
	public void OpenAppln()
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.furper.com/");
	}
	@AfterMethod
	public void closeAppln() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
