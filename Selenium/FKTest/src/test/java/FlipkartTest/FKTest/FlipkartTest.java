package FlipkartTest.FKTest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartTest {
	// WebDriver.
	public static WebDriver driver;
  
@BeforeMethod
  public void setUp() {
	  // webdriver initialization.
	  driver = new ChromeDriver();
	  // 
	  driver.manage().window().maximize(); // maximize chrome window	 
  }
  
  @Test
  public void fplikartTest1() throws InterruptedException {
	  
	  driver.get("https://www.flipkart.com/"); // opening flipkart on web using get method
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//span[@role='button']")).click();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("TV");
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//div[@title='SONY']")).click(); // selected Sony TV from filter 
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//div[contains(text(),'Price -- Low to High')]")).click(); // sorted by low to high price
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("(//div[@class='_1AtVbE col-12-12'])[3]")).click();
	  Thread.sleep(5000);
	  
	  ArrayList<String> wind = new ArrayList<String>(driver.getWindowHandles());
	  
	  driver.switchTo().window(wind.get(1));
	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
  }
}
