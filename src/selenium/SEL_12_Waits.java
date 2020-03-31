package selenium;

// public class SEL_12_Waits {
// public static void main(String[] args) throws InterruptedException {
// WebDriver driver = new ChromeDriver();
// driver.get("https://google.com");
// driver.findElement(By.name("q")).sendKeys("selenium-webdriver");
// // Thread.sleep(5000);
// driver.quit();
//
// }
// }

//
// frame
// dropdown
// waits
// alert

// pageload timeout
// implicit
// explicit
// ===========================
// public class SEL_12_Waits {
// public static void main(String[] args) throws InterruptedException {
// WebDriver driver = new ChromeDriver();
// // // open google.com
// driver.get("file:///C:/My/Study/javaselenium/webpages/ExplicitlyWait.html");
// Thread.sleep(5000);
//
// // driver.findElement(By.xpath("//button[@id='btn1']")).click();
// driver.findElement(By.xpath("//button[@id='alert']")).click();
// Alert ale = driver.switchTo().alert();
// // Thread.sleep(3000);
// String s = ale.getText();
// // System.out.println(s);
// ale.accept();
// //
// Thread.sleep(8000);
//
// driver.quit();
// }
// }
// ==================
////
/*
 * Let us consider practical application in that we are having more the 8 pages
 * and 50 operations if we use Thread.sleep(10000) for 50 times then it is 500
 * seconds around 10 minutes, so the dead time is more but no one prefer to wait
 * .
 */
// ======================
/*
 * applicable only to driver.get() and driver.navigate().to() Page load timeout
 * in selenium requests/set the time limit for a page to load, If the page is
 * not loaded within the given time frame selenium throws TimeOutException
 * exception //
 */
// public class SEL_12_Waits {
// public static void main(String[] args) {
// // set chrome driver exe path
// WebDriver driver = new ChromeDriver();
// driver.get("https://google.com");
// // set the time of 30 seconds for page to complete the loading
// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
// System.out.println("loading completed");
// driver.quit();
// }
// }

// ===============================
/*
 *
 * Implicit Wait WebDriver waits for an element if they are not
 * immediately*available.So, WebDriver does not throw NoSuchElementException
 * immediately.* This is known as
 * 
 * implicitlyWait() Disadvantage(i) In any case, it blindly wait for given
 * seconds. (ii) Once set, the implicit wait is set for the life of the
 * WebDriver object instance. //
 */

// public class SEL_12_Waits {
//
// public static void main(String[] args) {
// WebDriver driver = new ChromeDriver();
// driver.get("https://www.google.com");
// driver.findElement(By.id("identifierId")).sendKeys("India");
// driver.quit();
// }
// }
// =============================
// public class SEL_12_Waits {
//
// public static void main(String[] args) {
// WebDriver driver = new ChromeDriver();
// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
// driver.get("https://www.google.com");
// driver.findElement(By.id("identifierId")).sendKeys("India");
// driver.quit();
// }
// }

// If a test case is failing because of element not found we will get the error
// message
// after 15 seconds.
//// ======================================

/*
 * Explicit Wait WebDriver waits for an element if they are not immediately
 * available. So, WebDriver does not throw NoSuchElementException immediately.
 * This is known as implicitlyWait() Disadvantage(i) In any case, it blindly
 * wait for given seconds. (ii) Once set, the implicit wait is set for the life
 * of the WebDriver object instance.Implicitly Wait is applicable only to
 * findElement and findElements no other statement in selenium.
 */
// public class SEL_12_Waits {
// public static void main(String[] args) throws InterruptedException {
// // open firefox
// WebDriver driver = new ChromeDriver();
// // open google.com
// driver.get("file:///C:/My/Study/javaselenium/webpages/ExplicitlyWait.html");
// driver.findElement(By.xpath("//button[@id='alert']")).click();
// WebDriverWait wait = new WebDriverWait(driver, 6 /* timeout in seconds */);
// // throws TimeoutException if no alert is present
// wait.until(ExpectedConditions.alertIsPresent());
// Thread.sleep(5000);
// driver.switchTo().alert().dismiss();
// Thread.sleep(5000);
// driver.quit();
//
// }
// }
//
// ===============

// public class SEL_12_Waits {
//
// public static void main(String[] args) throws InterruptedException {
// {
// WebDriver driver = new ChromeDriver();
// driver.get("file:///C:/My/users/eclipse-workspace/Selenium/src/selenium/SEL_12_Waits.html");
// driver.findElement(By.id("enable-button")).click();
//
// WebDriverWait wait = new WebDriverWait(driver, 30 /* timeout in seconds */);
//
// // throws TimeoutException if element does not become as clickable in given
// // time
// wait.until(ExpectedConditions.elementToBeClickable(By.id("disable")));
// // wait.until(ExpectedConditions.);
// Thread.sleep(5000);
//
// driver.findElement(By.id("enable-button")).click();
// Thread.sleep(5000);
//
// driver.quit();
//
// }
// }
// }
// ====================
