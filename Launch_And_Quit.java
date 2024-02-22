package fiveScenarios_ofPayment;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_And_Quit 
{
	FirefoxDriver driver;
	@BeforeMethod
	public void Launch()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
	}
	@AfterMethod
	public void Quit() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.quit();
	}

}
