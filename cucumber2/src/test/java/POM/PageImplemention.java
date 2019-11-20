package POM;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageImplemention {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Desktop\\chromedriver_win32  crome sellinium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  PageClass1 loc = PageFactory.initElements(driver,PageClass1.class);
	  loc.loginmethod("aravind.guggilla57@gmail.com","aravind");
  }
}
