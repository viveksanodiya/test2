package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipcart {
	public static void main(String[] args)
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9179040477");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("sanodiya@21");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='CXW8mj'])[1]")).click();
		Thread.sleep(2000);
	
		WebElement ele = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		
		/*List<WebElement> i= driver.findElements(By.xpath("//div[@class='_1kidPb']"));
		System.out.println(i.size());
		for(WebElement b:i)
		{
			if(b.getText().equalsIgnoreCase("Flight"))
			{
				b.click();
				break;
			} 
		}*/
		
		//Actions a= new Actions(driver);
		//WebElement element= driver.findElement(By.xpath("//a[contains(text(),'Flights')]"));
		//a.contextClick(element).perform();
		//a.click().perform();


}
}