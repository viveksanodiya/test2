package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {
	public static void main(String[] args)
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		//to scroll down the page
		js.executeScript("window.scrollBy(0,600 )");
		Thread.sleep(2000);
		
		//to scroll up on page
		js.executeScript("window.scrollBy(600,0 )");
		Thread.sleep(2000);
		//This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", "WebElement");
       
        
        // for cotrolling keys, like up down  
        
        driver.findElement(By.xpath("//input[@name='travel_date']")).sendKeys(Keys.DOWN);

}
}






