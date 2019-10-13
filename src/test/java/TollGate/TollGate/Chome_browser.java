package TollGate.TollGate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Chome_browser 
{
	  @Test
	  public void chrome_browser() throws InterruptedException
	  { 
		  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe"); 
	  driver=new ChromeDriver();
	  driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	  driver.manage().window().maximize();
	  Thread.sleep(10000);
	  }
	 

	/*
	 * @Test public void chrome_Browser() {
	 * 
	 * 
	 * WebDriver driver; System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe"
	 * ); driver=new ChromeDriver(); }
	 */
	 

	
}
