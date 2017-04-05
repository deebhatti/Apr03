package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	WebDriver driver;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // Opens the browser
		driver.manage().window().maximize(); // Maximizes the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		//Today is Monday April 3.
	}

	public void verifyError() {
		driver.findElement(By.id("email")).sendKeys("user@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("u_0_q")).click();
		String expectedMessage = "The password that you've entered is incorrect. Forgotten password?";
		String actualMessage = driver.findElement(By.xpath("//*[@id='js_0']/div/div/div")).getText();
		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
	}

	public void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) {
		VerifyErrorMessage obj = new VerifyErrorMessage();
		obj.openBrowser();
		obj.verifyError();
		obj.closeBrowser();

	}

}
