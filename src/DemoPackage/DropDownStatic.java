package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownStatic {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
WebElement vv= driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
Select dropdown = new Select(vv);
dropdown.selectByIndex(2);
System.out.println(dropdown.getFirstSelectedOption().getText());

dropdown.selectByValue("INR");
System.out.println(dropdown.getFirstSelectedOption().getText());
Thread.sleep(1000);
dropdown.selectByVisibleText("USD");
System.out.println(dropdown.getFirstSelectedOption().getText());



}
}


//System.out.println(dropdown.getFirstSelectedOption().getText());\ konsa option select krega or text kya h uska