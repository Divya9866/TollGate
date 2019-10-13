package TollGate.TollGate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts 
{
	
	@Test
	public void alerts_Test() throws InterruptedException
	{
		//https://www.toolsqa.com/automation-practice-switch-windows/
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		driver.findElement(By.id("alert")).click();
		Thread.sleep(3000);
		
		String s=driver.switchTo().alert().getText();
		System.out.println("************************** "+s);
	//	driver.switchTo().alert().accept();
		
		
	}

}
