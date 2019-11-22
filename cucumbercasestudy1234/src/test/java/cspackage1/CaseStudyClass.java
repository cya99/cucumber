package cspackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaseStudyClass {
	WebDriver driver;
	@Given("Signup link is avaliable")
	public void signup_link_is_avaliable() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Desktop\\chromedriver_win32  crome sellinium\\chromedriver.exe" );
		driver=new ChromeDriver(); 
	    String url = "http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("User enter username as subham{int}")
	public void user_enter_username_as_subham(Integer int1) {
		driver.findElement(By.id("userName")).sendKeys("subham29");
	    
	}

	@When("User enter first name as subham")
	public void user_enter_first_name_as_subham() {
		driver.findElement(By.id("firstName")).sendKeys("subham");
	    
	}

	@When("User enter last name as dubey")
	public void user_enter_last_name_as_dubey() {
		driver.findElement(By.id("lastName")).sendKeys("dubey");
	}

	@When("User enter password as subhamdubey{int}")
	public void user_enter_password_as_subhamdubey(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("subhamdubey29");
	}

	@When("User conforms password as subhamdubey{int}")
	public void user_conforms_password_as_subhamdubey(Integer int1) {
		driver.findElement(By.id("pass_confirmation")).sendKeys("subhamdubey29");
	}

	@When("Select gender as Male")
	public void select_gender_as_Male() {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	    
	}

	@When("User enter email as subhamdubey{int}@gmail.com")
	public void user_enter_email_as_subhamdubey_gmail_com(Integer int1) {
		driver.findElement(By.id("emailAddress")).sendKeys("subhamdubey290497@gmaiil.com");
	  
	}

	//@When("User enter mobile number as {int}")
	@When("User enter mobile number as {string}")
	public void user_enter_mobile_number_as(String String) {
		driver.findElement(By.id("mobileNumber")).sendKeys("9739861552");
	    
	}
@When("Enter dob as {string}")
public void enter_dob_as(String string) {
	//@When("Enter dob as {int}\\/{int}\\/{int}")
	//public void enter_dob_as(Integer int1, Integer int2, Integer int3) {
	    driver.findElement(By.id("dob")).sendKeys("29/04/2019");
	}
@When("User enter address as down street bangalore")
public void user_enter_address_as_down_street_bangalore(){
	//@When("User enter address as abcd")
	//public void user_enter_address_as_abcd() {
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("down street bangalore");
	}

	@When("enter selsects {string} as security question")
	public void enter_selsects_as_security_question(String string) {
	    //Select ques=new Select(driver.findElement(By.id("SecurityQuestion")));
	   // ques.selectByIndex(2);
		driver.findElement(By.id("securityQuestion")).sendKeys("What is your Pet name");
	}

	@When("User enter {string} as answer")
	public void user_enter_as_answer(String string) {
	 driver.findElement(By.id("answer")).sendKeys("cat");   
	}

	@When("User clicks on registration")
	public void user_clicks_on_registration() {
	   driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}

	@Then("TestMe App home page open")
	public void testme_App_home_page_open() {
	    System.out.println("the page title is:"+driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Home"));
	}

}
