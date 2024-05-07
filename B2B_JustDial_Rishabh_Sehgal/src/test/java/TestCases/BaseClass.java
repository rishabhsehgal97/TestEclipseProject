package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String basURL = "https://www.justdial.com/";
/*	public String LoginNumber = "7738176962";
	public String OTPvalue = "123456"; */
	
	

	
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir") + "/Drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
