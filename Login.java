package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	WebDriver driver;
	@Given("chrome browser launched")
	public void chrome_browser_launched()
	{
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("correct url is accessed")
	public void correct_url_is_accessed()
	{
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Admin user enter a username")
	public void admin_user_enter_a_username() 
	{
	    driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@When("enters a password")
	public void enters_a_password() 
	{
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("click on login")
	public void click_on_login() 
	{
		driver.findElement(By.className("oxd-button")).click();
	}

	@Then("user should validate their dashboard")
	public void user_should_validate_their_dashboard() 
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

	@Then("logout from application")
	public void logout_from_application() 
	{
		
		driver.findElement(By.className("oxd-userdropdown-img")).click();
		
		driver.findElement(By.linkText("Logout")).click();
	}


}
