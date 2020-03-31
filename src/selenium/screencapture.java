package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screencapture {

	public static void main(String args[]) throws InterruptedException {
		// Open Firefox
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Pass the url
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		Thread.sleep(3000);

		// Get the screenshot as an image File
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		// Take screenshot and store as a file format
		// File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);

		try {
			// now copy the screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("C:\\My\\users\\eclipse-workspace\\Selenium\\src\\selenium\\error1.png"));
			System.out.println("Scrren captured");
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}
		driver.quit();
	}
}