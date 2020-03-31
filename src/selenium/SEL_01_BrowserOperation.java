package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Selenium installation Two things required java biniding driver(gecko/chrome)
 * 1) need selenium bindings for java from https://www.seleniumhq.org/download/
 * 2) It will Download the zip file 3) Extract that zip file
 * 4) Goto project  build path in eclipse, import external jars and add all jar files present in
 * the unzipped folder (inside lib folder and outside the lib folder) 
 * 5) Download chromedriver or Geckodriver or IE server • ChromeDriver is
 * maintained by the Google Chromium team. It can be downloaded from
 * 
 * chromedriver - http://chromedriver.chromium.org/downloads 
 * 6) unzip the driver
 * folder and set the environment path as per driver path Fifefox Download
 * geckodriver from https://github.com/mozilla/geckodriver/releases set the
 * enviornment path
 */
// Example of web page
// file:///C:/My/Study/javaselenium/webpages/WebDriver%20Demo%20Website.html?languages=Java&enterText=
// ==========================================
//public class SEL_01_BrowserOperation {
//
//	public static void main(String[] args) throws InterruptedException {
//		// String exePath = "C:\\Users\\assharma\\Desktop\\chromedriver.exe";
//		// System.setProperty("webdriver.chrome.driver", exePath);
//
//		WebDriver driver = new ChromeDriver();
//		// WebDriver driver1 = new FirefoxDriver();
//
//		driver.get("https://www.google.co.in");
//		// driver.get("https://www.rediff.com");
//		Thread.sleep(5000);
//		driver.quit();
//	}
//
//}
// ====================
/*
 * Difference between close and quit: 1) Close browser closes the current
 * browser window, Quit browser will close the all the browser windows opened by
 * the driver
 * 
 * 2) Quit browser will not only just closes the browser windows , quit() also
 * terminates the driverserver from the CPU process which save us some memory
 * but close() will not do it.
 * 
 * Once quit() is used the driver object becomes not-reachable so you cannot
 * perform any operation on the driver object. Close() browser make the driver
 * object still avail to the user.
 *
 * 
 * Get method We can open the browser by using get() a non static method present
 * in the FirefoxDriver class, it accepts a string as arguments and the string
 * should be the website address. A special thing about this get() method is it
 * will not give control to the next line till the page loads completely. What
 * is protocol ? Protocol is simple it mention what kind of site is that. Eg for
 * protocol: -http -https -ftp -file
 * 
 */

// ===============================
// Work offline
//public class SEL_01_BrowserOperation {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file:///C:/My/Study/javaselenium/webpages/AlertPage.html");
//		Thread.sleep(3000);
//		driver.quit();
//	}
//
//}
// =========================
//
//public class SEL_01_BrowserOperation {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in");
//		Thread.sleep(3000);
//
//		// Options man = driver.manage();
//		// Window win = man.window();
//		// win.maximize();
//		driver.manage().window().maximize();// We do not have any method to
//		// minimize
//		// the window of the browser but we
//		// can resize the window .
//
//		Thread.sleep(3000);
//		driver.close();
//
//	}
//
//}

// ======================
//
//public class SEL_01_BrowserOperation {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in");
//		Thread.sleep(3000);
//		driver.manage().window();// We do not have any method to
//
//		System.out.println(driver.manage().window().getSize());
//		System.out.println(driver.manage().window().getSize().getHeight());
//		System.out.println(driver.manage().window().getSize().getWidth());
//		Thread.sleep(3000);
//
//		driver.manage().window().setSize(new Dimension(720, 200));// selenium
//		Thread.sleep(3000);
//
//		// driver.manage().window().setSize(new Dimension(-2000, 0));// minimize not
//		// supporting in new version
//		// minimize
//
//		System.out.println(driver.manage().window().getSize());
//
//		Thread.sleep(6000);
//		driver.quit();
//	}
//
//}
// ============================
public class SEL_01_BrowserOperation {
	// //
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.google.co.in");
		driver.navigate().to("https://www.google.co.in");
		String expectedtitle = "Google";
		Thread.sleep(3000);

		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String Title = driver.getTitle();// Title of webpage
		System.out.println(Title);
		// if (expectedtitle.equals(Title)) {
		// System.out.println("test pass");
		// }

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		// Browser Navigation Methods

		// navigate().to()-Loads a new web page in the current browser window.

		driver.navigate().to("https://login.yahoo.com/");
		Thread.sleep(3000);
		//
		String URL1 = driver.getCurrentUrl();
		System.out.println(URL1);

		// navigate().back()-It moves a single item back in the Browser history.
		driver.navigate().back();
		Thread.sleep(3000);

		String URL2 = driver.getCurrentUrl();
		System.out.println(URL2);
		driver.navigate().forward();
		Thread.sleep(3000);

		driver.quit();

	}
}