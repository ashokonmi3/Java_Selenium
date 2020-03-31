package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class SEL_02_elementLocators {
//	public static void main(String[] args) throws InterruptedException {
//		// WebDriver driver = new FirefoxDriver();
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.calculator.net/bmi-calculator.html");
//		//
//		Thread.sleep(3000);
//		// // finding element by id.
//		driver.findElement(By.id("cage")).clear();
//		Thread.sleep(3000);
//		// //
//		driver.findElement(By.id("cage")).sendKeys("45");
//		Thread.sleep(3000);
//
//		// finding element by name.
//		driver.findElement(By.name("cheightmeter")).clear();// weight
//		Thread.sleep(3000);
//		driver.findElement(By.name("cheightmeter")).sendKeys("6");
//		Thread.sleep(3000);
//
//		// by class name
//		driver.findElement(By.id("ckg")).clear();// height
//		Thread.sleep(3000);
//		driver.findElement(By.id("ckg")).sendKeys("120");
//		Thread.sleep(3000);
//		driver.close();
//	}
//}

// ============================================
//public class SEL_02_elementLocators {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// // // BY link text - no need of plugin .its visible element
//		driver.get("https://www.google.co.in/?gws_rd=ssl");
//		Thread.sleep(3000);
//
//		driver.findElement(By.linkText("Gmail")).click();
//		Thread.sleep(3000);
//		driver.close();
//	}
//}

// ===============================
// ======================================================

//public class SEL_02_elementLocators {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.rediff.com/");
//		driver.findElement(By.className("homesrchbox")).sendKeys("Python");
//		Thread.sleep(5000);
//		driver.close();
//	}
//}

// =================
public class SEL_02_elementLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/My/Study/javaselenium/webpages/locator1.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#pancakes > a")).click();
		Thread.sleep(3000);
		driver.close();
	}
}

// ===============
// public class SEL_02_elementLocators {
//
// public static void main(String[] args) throws InterruptedException {
// WebDriver driver = new ChromeDriver();
// driver.get("file:///C:/My/Study/javaselenium/webpages/locator1.html");
// Thread.sleep(2000);
// driver.findElement(By.xpath("//*[@id='pancakes']/a")).click();
// Thread.sleep(3000);
// driver.close();
// }
// }
// ====================

// public class SEL_02_elementLocators {
//
// public static void main(String[] args) throws InterruptedException {
// WebDriver driver = new ChromeDriver();
// driver.get("file:///C:/My/Study/javaselenium/webpages/FindElements.html");
// Thread.sleep(2000);
// List<WebElement> elems = driver.findElements(By.id("firstButton"));//
// // javautil
// Thread.sleep(3000);
// // List<WebElement> elems =
// // driver.findElements(By.xpath("//input[@id='all']"));
// // go through one by one element in elems list
// System.out.println(elems.size());
// System.out.println(elems);
//
// // for (int i = 0; i < elems.size(); i++) {
// // elems.get(i).click();
// // Thread.sleep(3000);
// //
// // }
// driver.close();
// }
// }
