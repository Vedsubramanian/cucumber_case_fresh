package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Register {
	WebDriver driver;
	@Given("user opens the test me app")
	public void user_opens_the_test_me_app() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}

	@When("user enters UserName as {string}")
	public void user_enters_UserName_as(String UserName) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(UserName);
	    
	}

	@When("FirstName as {string}")
	public void firstname_as(String FirstName) {
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(FirstName);
	   
	}

	@When("LastName as {string}")
	public void lastname_as(String LastName) {
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(LastName);
	}

	@When("Password as {string}")
	public void password_as(String Password) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(Password);
	   
	}

	@When("Confirmpassword as {string}")
	public void confirmpassword_as(String Confirmpassword) {
		driver.findElement(By.xpath("//*[@id='pass_confirmation']")).sendKeys(Confirmpassword);
	}

	@When("Gender as {string}")
	public void gender_as(String string) {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]")).click();
	}

	@When("Email as {string}")
	public void email_as(String Email) {
		driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(Email);
	   
	}

	@When("Mobilenumber as {string}")
	public void mobilenumber_as(String Mobilenumber) {
		driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys(Mobilenumber);
	  
	}

	@When("DOB as {string}")
	public void dob_as(String DOB) {
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys(DOB);
	    
	}

	@When("Address as {string}")
	public void address_as(String string) {
		Select qn=new Select(driver.findElement(By.xpath("//*[@id='securityQuestion']")));
		qn.selectByIndex(0);
	}

	@When("Securityquestion as {string}")
	public void securityquestion_as(String string) {
	  
	}

	@When("answer as {string}")
	public void answer_as(String answer) {
	    driver.findElement(By.xpath("//*[@id=\'answer\']")).sendKeys(answer);
	}

	@When("click Register button")
	public void click_Register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		driver.close();
	}

	@Then("verify registeration success")
	public void verify_registeration_success() {
	   System.out.println("Regsitered successfully");
	}


}
