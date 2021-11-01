package DemoPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandaling {
	public static void main(String[] args)
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> a= driver.getWindowHandles(); // will handle of all the windows opened
		Iterator<String> d= a.iterator();
		String parentWindow=d.next();
				String childwindow=d.next();
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
				driver.switchTo().window(parentWindow);
				driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
				
		
		
}
}

/*get.windowhandle(): This method helps to get the window handle of the current window
get.windowhandles(): This method helps to get the handles of all the windows opened
set: This method helps to set the window handles in the form of a string. set<string> set= driver.get.windowhandles()
switch to: This method helps to switch between the windows
action: This method helps to perform certain actions on the windows*/