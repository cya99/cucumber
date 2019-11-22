package selinumdemo1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import selenium2.driversutility;

public class report {
	 @Test class NewTest59 {
		  WebDriver driver;
		  ExtentHtmlReporter htmlReporter;
		  ExtentReports extent;
		  ExtentTest logger;


		   
		    @BeforeTest
		    public void beforeTest() {
		   driver=driversutility.configureBrowser("chrome");
		   driver.manage().window().maximize();
		   htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/extentreports/"+ 
		   new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy").format(new Date())+".html");
		   htmlReporter.config().setDocumentTitle("TestMe Report");
		   htmlReporter.config().setReportName("TestMe end to end Test Report");
		   extent=new ExtentReports();
		   extent.attachReporter(htmlReporter);
		    }
		    @Test(priority=1)
		    public void registration() {
		   logger=extent.createTest("testing the registration page");
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		   driver.findElement(By.id("userName")).sendKeys("Ajin1234556");
		   driver.findElement(By.id("firstName")).sendKeys("Ajinxx");
		   driver.findElement(By.id("lastName")).sendKeys("Desale");
		   driver.findElement(By.id("password")).sendKeys("Ajinkya1234");
		   driver.findElement(By.id("pass_confirmation")).sendKeys("Ajinkya1234");
		   //driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[1]")).click();
		   driver.findElement(By.xpath("//input[@value='Male']")).click();
		   driver.findElement(By.id("emailAddress")).sendKeys("a.desale@gmail.com");
		   driver.findElement(By.id("mobileNumber")).sendKeys("8090102025");
		   driver.findElement(By.id("dob")).sendKeys("03/09/1997");
		   driver.findElement(By.id("address")).sendKeys("pimpri chinchwad,Pune");
		   Select ques = new Select (driver.findElement(By.id("securityQuestion")));
		   ques.selectByIndex(2);
		   driver.findElement(By.id("answer")).sendKeys("Dada");
		   //driver.findElement(By.xpath("//input[@value='Register'])")).click();
		   driver.findElement(By.xpath("//input[@type='submit']")).click();

		  Assert.assertTrue(true);
		    }
		    @Test(priority=2)
		    public void testLogin() {
		   logger=extent.createTest("testing the login page");
		   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		   driver.findElement(By.id("userName")).sendKeys("Ajin1234556");
		   driver.findElement(By.id("password")).sendKeys("Ajinkya1234");
		        driver.findElement(By.name("Login")).click();
		  Assert.assertTrue(true);
		    }
		    @Test(priority=3)
		    public void testCart() {
		   logger=extent.createTest("testing the add to cart page");
		   Actions acti=new Actions(driver);
		   WebElement search=driver.findElement(By.id("myInput"));
		   acti.sendKeys(search,"b").pause(1000).sendKeys(search,"a").pause(1000).sendKeys("g").build().perform();
		   acti.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
		   driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		   driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		   
		  Assert.assertTrue(true);
		    }
		    @Test(priority=4)
		    public void testPayment() {
		   logger=extent.createTest("testing the payments page");
		   driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		    WebDriverWait w = new WebDriverWait(driver,20);
		    w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//label[contains(text(),'Andhra Bank')]")));
		   driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
		   driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		   driver.findElement(By.name("username")).sendKeys("123456");;
		   driver.findElement(By.name("password")).sendKeys("Pass@456");;
		   driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		   driver.findElement(By.name("transpwd")).sendKeys("Trans@456");;
		   driver.findElement(By.xpath("//input[@value='PayNow']")).click();

		   Assert.assertTrue(true);

		  //throw new SkipException("test payment is not yet ready");
		    }
		    @AfterMethod
		    public void getResult(ITestResult result)
		    {
		   if(result.getStatus()==ITestResult.SUCCESS)
		   {
		   logger.log(Status.PASS, "test method passed:"+result.getName());
		   
		   }
		   else if(result.getStatus()==ITestResult.FAILURE)
		   {
		   logger.log(Status.FAIL, "test method failed:"+result.getName());
		   
		   }
		   else if(result.getStatus()==ITestResult.SKIP)
		   {
		   logger.log(Status.SKIP, "test method skipped:"+result.getName());
		   
		   }
		    }
		   
		   
		   
		    @AfterTest
		    public void afterTest() {
		   //driver.close();
		   extent.flush();
		    }

		  }

	}