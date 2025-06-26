package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background 
{
	WebDriver driver;
	@Given("required browser has been launched")
	public void required_browser_has_been_launched() throws Exception
	{
		Thread.sleep(5000);
		driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }

	@Given("application url page is open")
	public void application_url_page_is_open()
	
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("an admin user is enter the username")
	public void an_admin_user_is_enter_the_username()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@When("entering an admin password")
	public void entering_an_admin_password()
	{
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("later click on login button")
	public void later_click_on_login_button()
	{
		driver.findElement(By.className("oxd-button")).click();
		
	}

	@Then("admin user should validate the dashboard")
	public void admin_user_should_validate_the_dashboard()
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

	@Given("View skill page is open")
	public void view_skill_page_is_open()
	{
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSkills");
	}

	@When("admin is click on add skill feature")
	public void admin_is_click_on_add_skill_feature()
	{
		driver.findElement(By.className("oxd-button--secondary")).click();
	}

	@When("need to enter a skill")
	public void need_to_enter_a_skill() 
	{
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Data analysis85");
	}

	@When("click on save")
	public void click_on_save() throws Exception 
	{
		Thread.sleep(5000);
	    driver.findElement(By.className("oxd-button--secondary")).click();
	}

	@Then("validate the skill has been added successfully")
	public void validate_the_skill_has_been_added_successfully() throws Exception
	{
		Thread.sleep(5000);
	    boolean res=driver.getPageSource().contains("Skills");
	    if(res)
	    {
	    	System.out.println("Test passed---skill added");
	    }
	    else
	    {
	    	System.out.println("Test failed---skill not added");
	    }
	}

	@Given("add employee page is open")
	public void add_employee_page_is_open() 
	{
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
	}

	@When("we enter a employee details")
	public void we_enter_a_employee_details()
	{
	    driver.findElement(By.name("firstName")).sendKeys("Monal");
	    driver.findElement(By.name("lastName")).sendKeys("Patil");
	  
	}

	@When("save the employee record")
	public void save_the_employee_record()
	{
	    driver.findElement(By.className("oxd-button--secondary")).click();
	}

	@Then("admin need to validate the added personal details of employee")
	public void admin_need_to_validate_the_added_personal_details_of_employee() throws Exception 
	{
        Thread.sleep(5000);
		boolean res=driver.getPageSource().contains("Personal Details");
		if(res)
		{
			System.out.println("Tessed passed----Details visible");
		}
		else
		{
			System.out.println("Tessed failed------Details invisible");
		}
	}


}
