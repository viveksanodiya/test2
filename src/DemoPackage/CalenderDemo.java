package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {
	public static void main(String[] args)
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		List<WebElement> element= driver.findElements(By.xpath("//td[@class='day']"));
		for(int i=0; i<element.size(); i++)
		{
			String value = element.get(i).getText();
			if(value.equalsIgnoreCase("26")) {
			element.get(i).click();
			break;
		}
		}

}
}