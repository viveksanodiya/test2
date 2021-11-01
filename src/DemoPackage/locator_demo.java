package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_demo {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();   // declier object
driver.get("https://www.tcsion.com/dotcom/TCSSMB/Login/login.html");
//driver.findElement(By.id("username")).sendKeys("demo1");
//driver.findElement(By.id("password")).sendKeys("12345@");
//driver.findElement(By.id("Login")).click();
Thread.sleep(2000);
//driver.findElement(By.linkText("Forgot Your Password?")).click();

//driver.findElement(By.partialLinkText("Forgot")).click();
//driver.findElement(By.className("n-text-box")).sendKeys("vivke");
//driver.findElement(By.name("accountname")).sendKeys("baba");
driver.findElements(By.tagName("a")).size();
System.out.println(driver.findElements(By.tagName("a")).size());




	}

}


// locator in selenium=
// "tagname[@attribute=value]""
// "input[@id=username]""