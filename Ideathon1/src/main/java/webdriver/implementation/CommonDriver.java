package webdriver.implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonDriver {
	
	private WebDriver driver;
	
	public int pageLoadTimeOut;
	
	public int elementDetectionTimeOut;
	
	private String currentWorkingPath;
	
	public CommonDriver(String browserType) throws Exception {
		
		pageLoadTimeOut = 10;
		
		elementDetectionTimeOut = 10;
		
		currentWorkingPath = System.getProperty("user.dir");
		
		
		if(browserType.equalsIgnoreCase("chrome")) {
			
			
			System.setProperty("webdriver.chrome.driver",currentWorkingPath + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserType.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver",currentWorkingPath + "/drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("invalid browser type:" + browserType);
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
	}
	public void navigateToUrl(String url) {
		driver.manage().timeouts().pageLoadTimeout(pageLoadTimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(elementDetectionTimeOut, TimeUnit.SECONDS);
		
		driver.get(url);
		
		
	}
	public WebDriver getDriver() {
		return driver;
	}
	/*public void setPageLoadTimeOut(int pageLoadTimeOut) {
		this.pageLoadTimeOut = pageLoadTimeOut;
	}
	public void setElementDetectionTimeOut(int elementDetectionTimeOut) {
		this.elementDetectionTimeOut = elementDetectionTimeOut;
	}*/

}
