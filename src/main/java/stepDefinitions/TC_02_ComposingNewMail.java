package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TC_02_ComposingNewMail {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^user in the gmail login page$")
	public void user_in_the_gmail_login_page() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Karthikeyan\\Automation\\chromedriver.exe");
		String url="https://accounts.google.com";
		driver=new ChromeDriver();
		driver.get(url); 
	    }

	@When("^user enter the username and password$")
	public void user_enter_the_username_and_password() throws Exception {
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
		String title=driver.getTitle();
		String actualTitle="Sign in – Google accounts";
		Assert.assertEquals(actualTitle,title);
		 driver.findElement(By.id("identifierId")).sendKeys("gokarthik25");
		    driver.findElement(By.xpath("//span[@class='RveJvd snByac'][1]")).click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		    driver.findElement(By.name("password")).sendKeys("XeroX!2025");
		    driver.findElement(By.xpath("//span[@class='RveJvd snByac'][1]")).click();    
	}

	//@Then("^user in the welcome page$")
	//public void user_in_the_welcome_page() throws Exception {
	//wait=new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='yDmH0d']/div[2]/c-wiz/div[1]/c-wiz/c-wiz/div/div[4]/div/div/header/h1]")));
     //String actualText="Account";
     //String expectedText=driver.findElement(By.xpath("//*[text()='Account'][2]")).toString();
     //Assert.assertEquals(actualText, expectedText);  
	//}

	@When("^user select the gmail app$")
	public void user_select_the_gmail_app() throws Exception {
	   
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='https://www.google.co.in/intl/en/about/products'][1]")).click();
		//driver.findElement(By.xpath("//*[@id='gb23']/span[1]")).click();
	   
	}

	@Then("^verify user in the inbox page$")
	public void verify_user_in_the_inbox_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^user in the inbox page$")
	public void user_in_the_inbox_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user click the compose mail button$")
	public void user_click_the_compose_mail_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^new window open$")
	public void new_window_open() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^sending a mail$")
	public void sending_a_mail() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
