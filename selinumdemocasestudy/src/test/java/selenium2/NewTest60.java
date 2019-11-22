package selenium2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest60 {
	WebDriver driver;
  @Test
  public void testRegistration() {
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	driver.findElement(By.id("userName")).sendKeys("Lalitha");
	driver.findElement(By.id("firstName")).sendKeys("Ajinxx");
	driver.findElement(By.id("lastName")).sendKeys("Desale");
	driver.findElement(By.id("password")).sendKeys("password123");
	driver.findElement(By.id("pass_confirmation")).sendKeys("");
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	driver.findElement(By.id("emailAddress")).sendKeys("subhamdubey290497@gmail.com");
	driver.findElement(By.id("mobileNumber")).sendKeys("9739861552");
	driver.findElement(By.id("dob")).sendKeys("29/04/1949");
	driver.findElement(By.id("address")).sendKeys("bangalore");
	Select ques = new Select(driver.findElement(By.id("securityQuestion")));
	ques.selectByIndex(2);
	driver.findElement(By.id("answer")).sendKeys("blue");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=driversutility.configureBrowser("chrome");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
