package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class SEL_13_Javascriptexecutor {
//	//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,400)");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,400)");
//		Thread.sleep(5000);
//		driver.quit();
//	}
//}

// ===================================
public class SEL_13_Javascriptexecutor {
	public static void main(String[] args) throws InterruptedException {
		// set the geckodriver.exe property
		// open firefox
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://rediff.com");

		// find the search textbar in JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("document.getElementsByName('btnI')[0].click()");

		// sending values
		// js.executeScript("document.getElementById('q').value='python learning'");
		driver.manage().window().maximize();

		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(5000);
		// Object searchTextbar = js.executeScript("return
		// document.getElementById('lst-ib')");
		// we have to cast the returned object into webelement to access
		// all the webelement related methods
		// ((WebElement) searchTextbar).sendKeys("abc");
		String DomainName = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name of the site = " + DomainName);

		// Fetching the URL of the site. Tostring() change object to name
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL of the site = " + url);

		// Method document.title fetch the Title name of the site. Tostring() change
		// object to name
		String TitleName = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page = " + TitleName);

		/*
		 * (same as above) find the search textbar in selenium
		 * driver.findElement(By.id("lst-ib")).sendKeys("abc");
		 */
		System.out.println("success");
		driver.quit();
	}
}