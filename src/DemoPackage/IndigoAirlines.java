package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndigoAirlines {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object\
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.xpath("(//input[@placeholder='From'])[1]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='Mumbai']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='airport-city'])[104]")).click();

	}
}
//(//div[@data-name='Kolkata'])[9]