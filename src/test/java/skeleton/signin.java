package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class signin {
	WebDriver driver;
	@Given("User opens signIn page")
	public void user_opens_signIn_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
	  driver.findElement(By.name("userName")).sendKeys(username);
	}

	@When("password as {string}")
	public void password_as(String password) {
		 driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("click on signIn page")
	public void click_on_signIn_page() {
	    driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("verify login sucess")
	public void verify_login_sucess() {
	  String s=driver.getTitle();
	  Assert.assertEquals(s,"Home");
	  System.out.println("Logged in successfully");
	  driver.close();
	}

}
