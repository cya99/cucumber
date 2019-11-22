package cspackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class casestudy4 {
	WebDriver driver;
	boolean cartAvailable;
	@Given("Alex has register in test me app")
	public void alex_has_register_in_test_me_app() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Desktop\\chromedriver_win32  crome sellinium\\chromedriver.exe");
		 driver =new ChromeDriver();
			 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		    driver.findElement(By.linkText("SignIn")).click();
		    driver.findElement(By.name("userName")).sendKeys("lalitha");
			 driver.findElement(By.name("password")).sendKeys("password123");
			 driver.findElement(By.name("Login")).click(); 
	}
@When("Alex search a particular product like headphones")
public void alex_search_a_particular_product_like_headphones() {
	//@When("Alex search a particular product like headphones")
	//public void alex_search_a_particular_product_like_headphones() {
		driver.findElement(By.id("myInput")).sendKeys("head");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();  
	}
@When("try to procced to payment without adding any item in the cart")
public void try_to_procced_to_payment_without_adding_any_item_in_the_cart() {
	//@When("try to procced to payment without adding any item in the cart")
	//public void try_to_procced_to_payment_without_adding_any_item_in_the_cart() {
		String cart = "Cart";
		try {
			WebElement element =driver.findElement(By.partialLinkText(cart));
			element.click();
			cartAvailable=true;			
		}catch(org.openqa.selenium.NoSuchElementException|StaleElementReferenceException e){
			e.printStackTrace();
		}
	}
@Then("TestmeApp doesnot display the cart item")
public void testmeapp_doesnot_display_the_cart_item() {
	//@Then("TestmeApp doesnot display the cart item")
	//public void testmeapp_doesnot_display_the_cart_item() {
		Assert.assertTrue(!cartAvailable);
	}

}
