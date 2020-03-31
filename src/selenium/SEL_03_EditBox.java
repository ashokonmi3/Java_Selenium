package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// public class EditBox
// ===============================
//public class SEL_03_EditBox {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("C://My//Study//javaselenium//webpages//login.html");
//		driver.findElement(By.name("username")).sendKeys("root");
//		Thread.sleep(5000);
//		driver.findElement(By.name("username")).clear();
//		Thread.sleep(5000);
//		driver.findElement(By.name("username")).sendKeys("root");
//		Thread.sleep(5000);
//		driver.findElement(By.name("password")).sendKeys("root");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys(Keys.ENTER);
//		// driver.findElement(By.id("tdb1")).sendKeys(Keys.ENTER);
//		Thread.sleep(5000);
//		driver.quit();
//	}
//}
// =============================
//
//public class SEL_03_EditBox {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		// send multiple string in send keys
//		String a = "java ";
//		driver.findElement(By.name("q")).sendKeys(a, "Selenium -", "varargs");
//		Thread.sleep(5000);
//		driver.quit();
//	}
//}
// ================
//public class SEL_03_EditBox {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		// send multiple string in send keys
//		// press number 1
//		driver.findElement(By.name("q")).sendKeys(Keys.NUMPAD1);
//		// press number 2 key
//		Thread.sleep(5000);
//		driver.findElement(By.name("q")).sendKeys("\uE01C");
//		Thread.sleep(5000);
//		driver.findElement(By.name("q")).sendKeys(Keys.chord(Keys.SHIFT, "UserName"));
//		Thread.sleep(5000);
//		driver.quit();
//	}
//}

// ======================
//public class SEL_03_EditBox {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("C://My//Study//javaselenium//webpages//login.html");
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("root"); // Entering values in edit box
//		// driver.findElement(By.name("username")).sendKeys("root");
//		String text = username.getAttribute("value");
//		System.out.println(text);// Return the value in the edit box
//		System.out.println("isDisplayed: " + username.isDisplayed());// Return the
//		// Displayed status
//		System.out.println("Is Enabled: " + username.isEnabled());// Return the
//		// enabled status
//		Thread.sleep(5000);
//		driver.quit();
//	}
//}

// ==============
public class SEL_03_EditBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("file:///C:/My/Study/javaselenium/webpages/disabledEditBox.html");
		Thread.sleep(5000);
		WebElement username = driver1.findElement(By.name("lname"));
		// username.sendKeys("admin"); // Entering values in edit box
		Thread.sleep(5000);

		System.out.println("isDisplayed: " + username.isDisplayed());// Return the
		// // Displayed status
		System.out.println("Is Enabled: " + username.isEnabled());// Return the
		// // enabled status
		Thread.sleep(5000);
		driver1.quit();
	}

}