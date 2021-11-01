package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxHandaling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		 WebElement a= driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		 
		 a.isSelected();                     //check option is select or not
		 System.out.println( a.isSelected());
		 a.isDisplayed();                      // to check option is there or not
		 System.out.println(a.isDisplayed());
		 a.isEnabled();
		 System.out.println(a.isEnabled());
		 
		 
	}} 
				 
		// * Thread.sleep(1000); List<WebElement> i =
		 // driver.findElements(By.xpath("//input[@type='checkbox']")); 
		  
		  //i.size();
		// * System.out.println(i.size()); for (WebElement Element : i) { Element.click();
		// */

		
		// * driver.findElement(By.xpath("//input[@value='radio2']")).click();
		// * Thread.sleep(1000); List<WebElement> j=
		// * driver.findElements(By.xpath("//input[@name='radioButton']")); j.size();
		// * System.out.println(j.size()); for(WebElement Element:j) { Element.click(); }
		 

//driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("null");
//Thread.sleep(1000);
//driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		//Thread.sleep(1000);
//driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
//driver.findElement(By.xpath("//a[@class='btn-style class1 class2']")).click();
//driver.findElement(By.xpath("//button[@class='btn-style class1']")).click();
		/*driver.findElement(By.xpath("//input[@name='show-hide']")).sendKeys("hi im rahul");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Show']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();

		driver.findElement(By.xpath("//button[@id='mousehover']")).click();

		driver.findElement(By.xpath("//a[@href='#top']"));
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().forward();
driver.navigate().refresh();
driver.close();*/
//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("india");
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//select[@name='dropdown-class-example']")).click();
		// Thread.sleep(1000);

/*List<WebElement> obj=driver.findElements(By.xpath("//input[@type='checkbox']")); 
for(WebElement element: obj)
{
	System.out.println(element.getAttribute("value"));
	if(element.getAttribute("value").equalsIgnoreCase("Option2"))
	{
		//System.out.println(element.getAttribute("value"));
		element.click();
		break;
	}
}
	}

}*/
