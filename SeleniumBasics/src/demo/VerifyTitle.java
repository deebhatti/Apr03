package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	@Test
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Opens the browser
		
		driver.manage().window().maximize(); //Maximizes the window
		
		driver.get("https://facebook.com"); //Navigates to Facebook
		
		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle  = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)){
			System.out.println("Test Case Passed");
		}
		
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.close();
		
	}

}
