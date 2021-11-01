package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDynamicClass {
	public static void main(String[] args)
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
/*Thread.sleep(8000); 
driver.findElement(By.xpath("(//input[@name='ctl00_mainContent_ddl_originStation1_CTXT'])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@value='BLR']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Japan");
//driver.findElement(By.xpath("//a[@tabindex='-1']")).sendKeys("japan");*/
		
		
		
driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
Thread.sleep(1000);
List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
System.out.println(list.size());
for(WebElement i:list)
{
if(i.getText().equalsIgnoreCase("India"))	{
	i.click();
	break;
}
}






}
} 

////input[@id='ctl00_mainContent_ddl_originStation1_CTXT']
////a[@value='BLR']
