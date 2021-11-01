package DemoPackage;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramsHandaling {
	public static void main(String[] args)
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	WebElement element=	driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(element);
	Actions a=  new Actions(driver);
	WebElement source= driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
	Thread.sleep(2000);
	a.dragAndDrop(source, target).build().perform();

	
	
		
		
		

}
}