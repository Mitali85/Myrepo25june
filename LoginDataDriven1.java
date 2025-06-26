package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDataDriven1 
{
	WebDriver driver;
	@Given("browser page is open")
	public void browser_page_is_open()
	{
		driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("orange hrm url is accessed")
	public void orange_hrm_url_is_accessed()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("I enter a username as {string}")
	public void i_enter_a_username_as(String un)
	{
		driver.findElement(By.name("username")).sendKeys(un);
	}

	@When("I enter a password as {string}")
	public void i_enter_a_password_as(String pw)
	{
		driver.findElement(By.name("password")).sendKeys(pw);
	}

	@When("login button need to click")
	public void login_button_need_to_click()
	{
		driver.findElement(By.className("oxd-button")).click();
	}

	@Then("admin user should be validate the dashboard")
	public void admin_user_should_be_validate_the_dashboard()
	{
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

	@Then("user come out from application")
	public void user_come_out_from_application() 
	{
        driver.findElement(By.className("oxd-userdropdown-img")).click();
		
		driver.findElement(By.linkText("Logout")).click();

	    
	}


}
