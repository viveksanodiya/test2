package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandaling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Select objselect=new Select(driver.findElement(By.name("dropdown-class-example")));                  
		objselect.selectByVisibleText("Select");
		List<WebElement> list = objselect.getOptions();
		for(WebElement i : list)
		{
			i.click();
			System.out.println("option selected");
		}
		Thread.sleep(1000);
		driver.quit();
		

}
}