package DemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();   // declier object
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		//driver.navigate().back();  // going back to browser
		//driver.navigate().forward(); // going forward to browser
		driver.navigate().refresh();    // refresh web pae
		Thread.sleep(5000);     // time space between nxt process
		driver.close();        // automatic cloe, open browser
		}
}


