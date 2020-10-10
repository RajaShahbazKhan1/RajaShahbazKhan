package CheckingAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\Selenium_Automation\\Driver\\chromedriver.exe");
		// Initialize browser.
	    driver=new ChromeDriver();
	    
	    driver.get("https://www.zoopla.co.uk/");
	    driver.manage().window().maximize();
	    
	    
	    
	    driver.quit();
	    driver.close();
	}
	
	

}
