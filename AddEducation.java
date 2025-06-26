package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEducation
{
	WebDriver driver;
	@Given("Important browser is launched")
	public void important_browser_is_launched()
	{
	
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Given("url page is open")
	public void url_page_is_open()
	{
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Enter a username")
	public void enter_a_username()
	{
	  driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@When("Enter a password")
	public void enter_a_password()
	{
	    driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("click login feature")
	public void click_login_feature()
	{
		driver.findElement(By.className("oxd-button")).click();
	}

	@Then("user should validate the correct dashboard")
	public void user_should_validate_the_correct_dashboard() throws Exception
	{
		Thread.sleep(5000);
		boolean res=driver.getPageSource().contains("Dashboard");
		if(res)
		{
			System.out.println("Tessed passed----");
		}
		else
		{
			System.out.println("Tessed failed------");
		}
   
	}

	@Given("view education page is open")
	public void view_education_page_is_open()
	{
	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewEducation");   
	}

	@When("click the add button")
	public void click_the_add_button()
	{
	 driver.findElement(By.className("oxd-button--secondary")).click();   
	}

	@When("Add the education")
	public void add_the_education()
	{
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("HSC");
	}

	@When("Ckick on save")
	public void ckick_on_save()
	{
		driver.findElement(By.className("oxd-button--secondary")).click();
	}

	@Then("user should validate the correct dashboard successfully")
	public void user_should_validate_the_correct_dashboard_successfully() throws Exception
	{
		Thread.sleep(5000);
		boolean res=driver.getPageSource().contains("Education");
		if(res)
		{
			System.out.println("Tessed passed----Education add");
		}
		else
		{
			System.out.println("Tessed failed------Education not add");
		}
   
	    	
	}


}
