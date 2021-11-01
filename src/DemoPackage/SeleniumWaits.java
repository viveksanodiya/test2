package DemoPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	public static void main(String[] args)
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // impicit
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedCondition.VisibilityOfElementLocated(By.xpath(null)));
		
		
		
		

}
}
//** what is synchronization 
// implicit  Wait-- its initilize driver.manage.timeouts.i
//explicit  Wait-- its define where 
//flueant Wait-- its check  web element in regular interval.
