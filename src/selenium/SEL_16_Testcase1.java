package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEL_16_Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		Thread.sleep(3000);

		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("wikipedia.org")) {
			System.out.println("It is an Internal Link - Redirected to another page in  the Same Application - Passed");
		} else {
			System.out.println("It is an External Link - Redirected to another page in  the Other Application -Failed");
		}

		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);

		driver.findElement(By.linkText("selenium.dev")).click(); // click
		Thread.sleep(6000);
		System.out.println("URL is: " + driver.getCurrentUrl());
		if (driver.getCurrentUrl().contains("seleniumhq.org/")) {
			// if (driver.getCurrentUrl().contains("http://www.yahoo.org/")) {

			System.out.println("It is an External Link - Redirected to another page in  the Other Application -Passed");
		} else {

			System.out.println("It is an Internal Link - Redirected to another page in  the same Application -failed");
		}

		driver.close();

	}

}

// =======================
