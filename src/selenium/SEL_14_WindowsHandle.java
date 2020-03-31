package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Open Firefox browser
Navigate to the demo site
Get current window handle and print it to console
Locate ‘Click to open a new browser window!’ button using Id
Click the button to open the new window
Get the window handles of both the open windows
Loop through both handles
Switch to the new window with the handle’s reference
Get the title and print it to console
Close the new window
Switch the control back to parent window and print the URL to the console
Verify Eclipse IDE console output screen and JUnit pane for success result
 */
public class SEL_14_WindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Create a new instance for the class FirefoxDriver
		// that implements WebDriver interface
		WebDriver driver = new ChromeDriver();
		// Implicit wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Assign the URL to be invoked to a String variable
		String baseUrl = "file:///C:/My/Study/javaselenium/webpages/WebDriverDemoWebsite.html";

		// Open baseUrl in Firefox browser window
		driver.get(baseUrl);
		// Get current window handle
		String parentWinHandle = driver.getWindowHandle();
		System.out.println("Parent window handle: " + parentWinHandle);
		// Locate 'Click to open a new browser window!' button using id
		WebElement newWindowBtn = driver.findElement(By.id("win1"));
		// // Click the button to open a new window
		newWindowBtn.click();
		// // Get the window handles of all open windows
		Set<String> winHandles = driver.getWindowHandles();
		// // Loop through all handles
		for (String handle : winHandles) {
			if (!handle.equals(parentWinHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(10000);
				System.out.println("Title of the new window: " + driver.getTitle());
				System.out.println("Closing the new window...");
				driver.close();
			}
		}
		// Switching the control back to parent window
		driver.switchTo().window(parentWinHandle);
		// // Print the URL to the console
		System.out.println("Parent window URL: " + driver.getCurrentUrl());
		Thread.sleep(10000);

		driver.close();
	}

}
