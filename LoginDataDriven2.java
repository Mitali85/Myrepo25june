package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDataDriven2 
{ 
	WebDriver driver;
	@Given("browser chrome page is open")
	public void browser_chrome_page_is_open() throws Exception
	{
		Thread.sleep(5000);
		driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@Given("OHRM url login page is open")
	public void ohrm_url_login_page_is_open()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("a user enters their username as {string}")
	public void a_user_enters_their_username_as(String un)
	{
		driver.findElement(By.name("username")).sendKeys(un);
	}

	@When("user will enters their password a {string}")
	public void user_will_enters_their_password_a(String pw)
	{
		driver.findElement(By.name("password")).sendKeys(pw);
	}

	@When("processed for the login")
	public void processed_for_the_login()
	{
		driver.findElement(By.className("oxd-button")).click();
	}

	@Then("will verify the dashboard of every user")
	public void will_verify_the_dashboard_of_every_user() throws Exception
	{
		Thread.sleep(5000);
		boolean res=driver.getPageSource().contains("Dashboard");
		if(res)
		{
			System.out.println("Tessed passed----dashboard visible");
		}
		else
		{
			System.out.println("Tessed failed------dashboard invisible");
		}
	}


}
