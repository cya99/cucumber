package selenium2;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class inputprovider {
WebDriver driver;
	@BeforeTest
	public void configurBrowser()
	{
	driver=driversutility.configureBrowser("explorer");	
	driver.manage().window().maximize();
	}
	
	
	@Test(dataProvider="inputCredentials")
	public void testLogin(String uname,String pwd) {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.id("userName")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.name("Login")).click();
		//System.out.println("username is " + userName);
		//System.out.println("password is "+ pwd);
		//String expected="username and password is wrong here";
		//String actual="username and password is wrong here";
		//Assert.assertNotEquals(actual,expected);
	}
	 @AfterTest
	  public void closeApp() {
		  //driver.close();
	  }
    @DataProvider
public Object[][] inputCredentials() throws IOException{
    	Object[][] data= excell55.readData();
    			
	return data;
}
}
