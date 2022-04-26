package WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser 
	{
	 RemoteWebDriver driver;
	 
	  @Given("open chrome browser")
	  public void method1()
	  {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("http://www.github.com");	  
	  }
	  @Then ("open firefox broswer")
	  public void method2()
	  {
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		  driver.get("http://www.redbus.com");
	  }
	  @When ("opera browser")
	  public void method3()
	  {
		  WebDriverManager.operadriver().setup();
		  driver=new OperaDriver();
		  driver.get("http://gmail.com");
	  }
	  @Then("edge browser")
	  public void method4()
	  {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("htttp://www.google.co.in");
	  }
	}
