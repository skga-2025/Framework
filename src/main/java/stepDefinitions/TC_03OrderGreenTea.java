package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_03OrderGreenTea {
	
	WebDriver driver;
	
	@Given("^user present with welcome page$")
	public void user_present_with_welcome_page() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Karthikeyan\\Automation\\chromedriver.exe");
		String url="http://www.practiceselenium.com";
		driver=new ChromeDriver();
		driver.get(url); 
	    }

	@When("^user on the menu page$")
	public void user_on_the_menu_page() throws Exception {
	   WebDriverWait wait=new WebDriverWait(driver,40);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Menu")));
	   driver.findElement(By.linkText("Menu")).click();
	       
	}

	@Then("^user click the check out option$")
	public void user_click_the_check_out_option() throws Exception {
	  driver.findElement(By.id("wsb-button-00000000-0000-0000-0000-000451955160")).click();
	}

	@Then("^user enters the customerinfo \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_the_customerinfo_email_and_name_and_address(String email, String name, String address) throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("address")).sendKeys(address);
	}

	@Then("^user enters the payment details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_the_payment_details_cardtype_and_cardnumber_and_verificationcode(String cardtype, String cardnumber, String verificationcode) throws Exception {
	   
		Select s=new Select(driver.findElement(By.id("card_type")));
		s.selectByVisibleText(cardtype);
		
		driver.findElement(By.id("card_number")).sendKeys(cardnumber);
		driver.findElement(By.id("verification_code")).sendKeys(verificationcode);
		
	}

	@Then("^user place the order and quit the browser$")
	public void user_place_the_order_and_quit_the_browser() throws Exception {
	   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	   driver.quit();
	}

}
