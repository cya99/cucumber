package cucumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class weblogin1 {
	WebDriver driver=null;
	@Given("User is open the application")
	public void user_is_open_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\chromedriver_win32  crome sellinium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 String url="http://demowebshop.tricentis.com/";
		 driver.get(url);
		 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	   
	}

	@When("User click on the login linl")
	public void user_click_on_the_login_linl() {
		driver.findElement(By.id("Email")).sendKeys(username);
	    
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    
	}

	@Then("Message displayed Login Succefully")
	public void message_displayed_Login_Succefully() {
	    
	}

}
