package Demo_jenkins ;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_test {

	WebDriver driver =null;
	@BeforeSuite
	public void launch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void Test_Home1() throws Exception {
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("selenium");
		search.sendKeys(Keys.ENTER);
		
		System.out.println("Test_Home1 Excution");
		System.out.println("google launch and searched selenium");
		Thread.sleep(2000);
	}
	@Test
	public void Test_Home2() {
		driver.quit();
		System.out.println("Test_Home2 Excution");
		System.out.println("browser closed");
	}
	@Test
	public void Test_Home3() {
		System.out.println("Test_Home3 Excution");
	}
	@Test
	public void Test_Home4() {
		System.out.println("Test_Home 4Excution");
	}


}
