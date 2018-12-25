package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TC_01_LoginToGmailApplication {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^user already in login page$")
	public void user_already_in_login_page()  {
	   
		System.setProperty("webdriver.chrome.driver", "E:\\Karthikeyan\\Automation\\chromedriver.exe");
		String url="https://accounts.google.com";
		driver=new ChromeDriver();
		driver.get(url); 
	}

	@When("^title of login page is freeCRM$")
	public void title_oEf_login_page_is_freeCRM()  {
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
		String title=driver.getTitle();
		String actualTitle="Sign in – Google accounts";
		Assert.assertEquals(actualTitle,title);
	}
//Regular Expression
// \"(.*)\"
// \"([^\]*)\"
	@When("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_username_and_password(String username, String pasword)  {
	    driver.findElement(By.name("identifier")).sendKeys(username);
	    driver.findElement(By.xpath("//span[@class='RveJvd snByac'][1]")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	    driver.findElement(By.name("password")).sendKeys(pasword);
	       
	}

	@Then("^user click the login button$")
	public void user_click_the_login_button() throws InterruptedException  {
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'][1]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
