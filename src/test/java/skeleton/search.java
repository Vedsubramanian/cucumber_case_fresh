package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class search {
	WebDriver driver;
	@Given("user logs in test me app")
	public void user_logs_in_test_me_app() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
	  }

	@When("user enters username as {string} And password as {string} And click on login button")
	public void user_enters_username_as_And_password_as_And_click_on_login_button(String username, String password) {
		driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		 driver.findElement(By.id("userName")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("user searches product as {string} and selects headphone from suggestions And clicks Find button")
	public void user_searches_product_as_and_selects_headphone_from_suggestions_And_clicks_Find_button(String search) {
		Actions actions=new Actions(driver);
	WebElement find=driver.findElement(By.xpath("//*[@id=\'myInput\']"));
	find.sendKeys(search);
  actions.sendKeys(find,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    //driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("verify search page is displayed")
	public void verify_search_page_is_displayed() {
		String s= driver.getTitle();
		Assert.assertEquals(s,"Search");
		driver.close();

	    
	}



}
