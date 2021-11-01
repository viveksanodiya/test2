package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Css {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver(); // declier object
//driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("home");
		Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sukriya");
//Thread.sleep(1000);
//driver.findElement(By.xpath("//a [@ id=\"forgot_password_link\"]")).click();
//driver.findElement(By.xpath("//a [@ id='mydomainLink']")).click();

//driver.findElement(By.cssSelector("input[id='password']")).sendKeys("four");
//Thread.sleep(2000);
//driver.findElement(By.cssSelector("a[id='forgot_password_link']")).click();
//Thread.sleep(1000);
//driver.findElement(By.cssSelector("a[id=\"mydomainLink\"]")).click();

// parents_child x-path
//driver.findElement(By.xpath("//div[@id='username_container']//input[1]")).sendKeys("abcd");
//driver.findElement(By.xpath("(//form[@name='login']//input)[23]")).sendKeys("abababa");
//Thread.sleep(1000);
//driver.findElement(By.xpath("//div[@class='w0 links bt pt16 mb20']//a[1]")).click();
//driver.findElement(By.xpath("//div[@class='w0 links bt pt16 mb20']//a[2]")).click();
		driver.get("https://vchannel.techmahindra.com/");
//driver.findElement(By.xpath("//div[@class='form-group']//input[1]")).sendKeys("viveksanodiya21");
//driver.findElement(By.xpath("(//div[@class='form-group']//input)[2]")).sendKeys("asdfgh");
		driver.findElement(By.xpath("//div[@class='text-center']//input[1]")).click();
		Thread.sleep(1000);

//driver.findElement(By.xpath("//div[@class='text-center']//input[2]")).click();
		driver.findElement(By.xpath("//div[@class='text-center']//a")).click();
		driver.findElement(By.xpath("//div[@class='col-md-4']//input[1]")).sendKeys("tumhiho");

//driver.findElement(By.xpath("(//div[@class='col-md-4']//input)[2]")).sendKeys("viveksanodiya2@gmail.com");
		driver.findElement(By.xpath("//div[@class='col-md-12 text-center']//input[1]")).click();

	}
}

//("//tagname[@attribute='value'])
//"input[@id=username]""

//Css syntax
// tagname[attribute='value']
// input[id=password]
// parents-child xpath= use when having changing attributes value.
//*syntax (//tagname[@attribute='value']//tagname
// parent tag name child tag name
