package ideathonPageFactory;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EndToEndIdeathon_PF {
	
	@FindBy(xpath = "//input[@placeholder='User Id']")
	WebElement user_id;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath= "//button[normalize-space()='Sign In']")
	WebElement signin_button;
	
	@FindBy(xpath = "//span[@class='name']")
	WebElement signin_successfull;
	
	@FindBy(xpath = "//h3[normalize-space()='Idea Platform']")
	WebElement ideathon_wrapper_element;
	
	@FindBy(xpath = "//h1[normalize-space()='Idea Platform']")
	WebElement idea_platform;
	
	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	WebElement Dashboard;
	
	@FindBy(xpath = "//span[contains(text(),'My Idea')]")
	WebElement My_idea;
	
	@FindBy(xpath = "//span[contains(text(),'All Ideas')]")
	WebElement All_ideas;
	
	@FindBy(xpath="//span[contains(text(),'My Rank')]")
	WebElement My_rank;
	
	@FindBy(xpath = "//div[contains(text(),'My Submissions')]")
	WebElement My_idea_My_submissions;
	
	@FindBy(xpath = "//div[contains(text(),'Submit Idea')]")
	WebElement My_idea_Submit_idea;
	
	@FindBy(xpath = "//input[@id='title']")
	WebElement Submit_idea_Idea_title;
	
	@FindBy(xpath = "//input[@id='goal']")
	WebElement Submit_idea_Goal;
	
	@FindBy(xpath = "//input[@id='community']")
	WebElement Submit_idea_Idea_category;
	
	@FindBy(xpath = "//textarea[@id='description']")
	WebElement Submit_idea_Description;
	
	@FindBy(xpath = "//div[@id='mat-select-value-13']")
	WebElement Submit_idea_Individual_Team;
	
	@FindBy(xpath = "//span[normalize-space()='Individual']")
	WebElement Submit_idea_Individual;
	
	@FindBy(xpath = "//span[normalize-space()='Team']")
	WebElement Submit_idea_Team;
	
	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	WebElement Submit_idea_Cancel_button;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mx-1 mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	WebElement Submit_idea_Add_button;
	
	@FindBy(xpath ="//div[contains(text(),'Approved Ideas')]")
	WebElement All_ideas_Approved_ideas;
	
	@FindBy(xpath = "//div[contains(text(),'Dropped Ideas')]")
	WebElement All_ideas_Dropped_ideas;
	
	@FindBy(xpath="//span[contains(text(),'Approver')]")
	WebElement Approver;
	
	@FindBy(xpath = "//span[@class='name']")
	WebElement Profile_Id;
	
	@FindBy(xpath = "//span[normalize-space()='View Profile']")
	WebElement View_Profile;
	
	@FindBy(xpath = "//span[@class='logout']")
	WebElement Logout;
	
	
	WebDriver driver;
	
	public EndToEndIdeathon_PF(WebDriver driver) {
		this.driver = driver;                       //this.driver refer to above driver and driver refer to driver present in paranthisis
		
		PageFactory.initElements(driver,this);     //instead of this we can use EndToEndIdeathon_PF.class
		
	}
	
	public void enterCredintials(String user, String key) {
		user_id.click();
		user_id.sendKeys(user);
		password.click();
		password.sendKeys(key);
		
	}
	public void loginTo() throws InterruptedException {
		signin_button.click();
		Thread.sleep(6000);
		String user_id = "Peravika";
		String username = signin_successfull.getText();
		assertEquals(user_id,username);
		System.out.println("login Successfull with valid credintials");
		
	}
	
	public void goToIdeaPlatform() {
		ideathon_wrapper_element.click();
		String wrapperPageTxt = ideathon_wrapper_element.getText();
		String selectedPageTxt = idea_platform.getText();
		assertEquals(wrapperPageTxt,selectedPageTxt);
		System.out.println("Idea Platform page opened successfully");
		
	}
	
	public void goToDashboard() {
		Dashboard.click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
