package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddJobTitle1
{ 
	WebDriver driver;
	@Given("required browser has been launched successfully")
	public void required_browser_has_been_launched_successfully() throws Exception
	{
		Thread.sleep(5000);
		driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Given("Enter a username as {string}")
	public void enter_a_username_as(String un)
	{
		driver.findElement(By.name("username")).sendKeys(un);

	}

	@Given("Enter a password as {string}")
	public void enter_a_password_as(String pw) 
	{
		driver.findElement(By.name("password")).sendKeys(pw);
	}

	@Given("click on login button")
	public void click_on_login_button()
	{
		driver.findElement(By.className("oxd-button")).click();

	}

	@Given("view job title page is open")
	public void view_job_title_page_is_open()
	{
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewJobTitleList");
	}

	@When("admin click on add job title feature")
	public void admin_click_on_add_job_title_feature() 
	{
		driver.findElement(By.className("oxd-button--secondary")).click();
	}

	@When("Enter a job title {string}")
	public void enter_a_job_title(String JT)
	{
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JT);   
	}

	@When("Click on save button")
	public void click_on_save_button() throws Exception
	{
		Thread.sleep(5000);
		driver.findElement(By.className("oxd-button--secondary")).click();
	}

	@Then("validate the job title has been added successfully")
	public void validate_the_job_title_has_been_added_successfully() throws Exception
	{
		Thread.sleep(5000);
		boolean res=driver.getPageSource().contains("Job Titles");
		if(res)
		{
			System.out.println("Tessed passed----Job title added");
		}
		else
		{
			System.out.println("Tessed failed------Jon title not added");
		}

	}



}
