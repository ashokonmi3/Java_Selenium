package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// ==============Radio Button==============
//
public class SEL_08_Radio_CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/My/Study/javaselenium/webpages/WebDriver%20Demo%20Website.html");
		WebElement radio1 = driver.findElement(By.id("novels-radio-btn"));
		System.out.println(radio1.isSelected());
		radio1.click();
		Thread.sleep(3000);
		System.out.println("Radio Button Option 1 Selected");
		System.out.println(radio1.isSelected());
		driver.close();
	}
}
// =====================================
// // // Selecting CheckBox
// public class SEL_08_Radio_CheckBox {
// public static void main(String[] args) throws InterruptedException {
// WebDriver driver = new ChromeDriver();
// driver.get("file:///C:/My/Study/javaselenium/webpages/WebDriver%20Demo%20Website.html");
// WebElement option1 = driver.findElement(By.id("bicycle-checkbox"));
// Thread.sleep(5000);
// System.out.println("Before clicking " + option1.isSelected());
// // // This will Toggle the Check box
// option1.click();
// Thread.sleep(5000);
// System.out.println("After clicking " + option1.isSelected());
// Thread.sleep(5000);
// option1.click();
// System.out.println("After clicking 2nd time " + option1.isSelected());
// // // // Check whether the Check box is toggled on
// Thread.sleep(5000);
// driver.close();
// }
// }

// ====================================
// Selecting Checkbox and using isSelected Method
// public class SEL_08_Radio_CheckBox {
// public static void main(String[] args) throws InterruptedException {
// WebDriver driver = new ChromeDriver();
//
// driver.get("file:///C:/My/Study/javaselenium/webpages/WebDriver%20Demo%20Website.html");
// WebElement chkFBPersist = driver.findElement(By.id("bicycle-checkbox"));
// for (int i = 0; i < 4; i++) {
// Thread.sleep(3000);
// chkFBPersist.click();
// Thread.sleep(3000);
// System.out.println("Persists Checkbox Status is - " +
// chkFBPersist.isSelected());
// }
// driver.close();
// }
// }