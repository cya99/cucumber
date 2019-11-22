package selenium2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class NewTest66 {
	WebDriver driver;
  @Test(priority=1)
  public void logintest() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.id("userName")).sendKeys("lalitha");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
  }
  @Test(priority=2)
  public void addcat()
  {
	  Actions act=new Actions(driver);
	  WebElement search=driver.findElement(By.id("myInput"));
	  act.sendKeys(search,"b").pause(1000).sendKeys("a").pause(1000).sendKeys("g").perform();
	  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	  driver.findElement(By.xpath(" /html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	 
	 
	  
	  
	  
  }
  @Test(priority=3)
  public void payment() {
	  WebDriverWait w = new WebDriverWait(driver,20);
	  w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'HDFC Bank')]")));
	  driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
	  driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	  driver.findElement(By.name("username")).sendKeys("123457");
	  driver.findElement(By.name("password")).sendKeys("Pass@457");
	  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	  driver.findElement(By.name("transpwd")).sendKeys("Trans@457");
	  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	  //*[@id="horizontalTab"]/div[2]/div/div/div/div/form/div/div[2]/input
	  //driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	  //driver.findElement(By.xpath("//input[@label='Andhra Bank']")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  driver=driversutility.configureBrowser("chrome");	
		driver.manage().window().maximize();
  }

}
//*[@id="cart"]/tfoot/tr[2]/td[5]/a