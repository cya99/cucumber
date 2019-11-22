package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@BeforeTest
	public void configurBrowser()
	{
	driver=driversutility.configureBrowser("explorer");	
	driver.manage().window().maximize();
	}
  @Test
  public void testLogin() {
	  driver.get("http://demowebshop.tricentis.com/login/");
	  //driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Admin");
	 //driver.findElement(By.xpath("//input[@='password']")).sendKeys("password456");
	  //driver.findElement(By.xpath("//input[@value='Login']")).click();
	 // Assert.assertEquals(driver.getTitle(), "Admin Home");
	//2 // driver.findElement(By.xpath(xpathExpression)).click();
	  //Select catgDropDown=new Select(driver.findElement(By.id("categorydropid")));
	 // catgDropDown.selectByIndex(2);
	  //Select catgDropDown1=new Select(driver.findElement(By.id("subcategorydropid")));
	  //catDropDown1.selectByIndex(3);
	  driver.findElement(By.xpath(""));
	  
	  
	  
	  
	  
	  //driver.findElement(By.type("submit")).click();
	 // Assert.assertEquals(driver.getTitle(),"Home");
	  //driver.findElement(By.linkText("logout")).click();
	  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("subhamdubey10@gmail.com");
	  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("subham10");
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
  }
  @AfterTest
  public void closeApp() {
	  //driver.close();
  }
}
