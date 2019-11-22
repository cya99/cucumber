package cspackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class caststudy3 {
	WebDriver driver;
	@Given("Testme app login is avaliable")
	public void testme_app_login_is_avaliable() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Desktop\\chromedriver_win32  crome sellinium\\chromedriver.exe");
	 driver =new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.findElement(By.linkText("SignIn")).click(); 
	}

	@When("Alex enter Login page is avaliable")
	public void alex_enter_Login_page_is_avaliable() {
		 driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.name("password")).sendKeys("password123");
		 driver.findElement(By.name("Login")).click();
	}

	@When("Alex search for headphone")
	public void alex_search_for_headphone() {
	   driver.findElement(By.name("products")).sendKeys("head");
	   driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/i")).click();
	   driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	   driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	}

	@Then("Alex will able to buy headphone")
	public void alex_will_able_to_buy_headphone() {
		WebDriverWait w = new WebDriverWait(driver,20);
		//w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'HDFC BANK')]")));
		//driver.findElement(By.xpath("//label[contains(text(),'HDFC BANK')]")).click();  
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'HDFC Bank')]")));
		driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		driver.findElement(By.name("username")).sendKeys("123457");
		driver.findElement(By.name("password")).sendKeys("Pass@457");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		driver.findElement(By.name("transpwd")).sendKeys("Trans@457");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	}

}
