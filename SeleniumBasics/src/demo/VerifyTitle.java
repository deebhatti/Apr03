package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
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
		
		
		
	}

}
