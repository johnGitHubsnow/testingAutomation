package StepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import Utils.ConfigUtils;
import ideathonPageFactory.EndToEndIdeathon_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webdriver.implementation.CommonDriver;

public class EndToEnd {
	
	public WebDriver driver;
	
	public CommonDriver cmDriver;
	
	public EndToEndIdeathon_PF endToEndideathon;
	
	String configFileName;
	
	Properties configProperty;
	
	String browserType;
	String url;
	String user_id;
	

	
	@Given("Url is opened")
	public void url_is_opened() throws Exception {
		configFileName = "C:/Users/VREDDYK/.eclipse/Ideathon1/config/config.properties";
		configProperty = ConfigUtils.readProperties(configFileName);
		
		url = configProperty.getProperty("baseUrl");
		browserType = configProperty.getProperty("browser");
		
		cmDriver = new CommonDriver(browserType);
		
		driver = cmDriver.getDriver();
		
		cmDriver.navigateToUrl(url);
	}

	@When("User is in login page and enter valid credintials {string} {string}")
	public void user_is_in_login_page_and_enter_valid_credintials(String user, String key) throws InterruptedException {
	    System.out.println("inside login page");
	    
	    endToEndideathon = new EndToEndIdeathon_PF(driver);
	    
	    endToEndideathon.enterCredintials(user, key);
	    
	    
	}

	@And("Click on Signin button")
	public void click_on_signin_button() throws InterruptedException {
		String user = "Peravika";
		endToEndideathon.loginTo();
		
	   /* System.out.println("Signin");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(5000);
	    String user1 = driver.findElement(By.xpath("//span[@class='name']")).getText();
	    Thread.sleep(4000);
	    assertEquals(user,user1);*/
	    
	    
	}

	@Then("User is able to signin successfully and view wrapper page")
	public void user_is_able_to_signin_successfully_and_view_wrapper_page() throws InterruptedException {
	    System.out.println("wrapper");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//h3[normalize-space()='Idea Platform']")).click();
	}

	@Then("Check whether user is able to view all the titles")
	public void check_whether_user_is_able_to_view_all_the_titles() {
		System.out.println("wrapper");
	    
	}

	@And("Click on the Ideathon title in wrapper page")
	public void click_on_the_ideathon_title_in_wrapper_page() {
		System.out.println("wrapper");
	    
	}

}
