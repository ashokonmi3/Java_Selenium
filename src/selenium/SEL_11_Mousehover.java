package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//public class SEL_11_Mousehover {
//
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://C:\\My\\Study\\javaselenium\\webpages\\selectable.html");
//		WebElement one = driver.findElement(By.name("one"));
//		WebElement three = driver.findElement(By.name("three"));
//		WebElement five = driver.findElement(By.name("five"));
//		// Add all the actions into the Actions builder.
//		Actions builder = new Actions(driver);
//		builder.keyDown(Keys.CONTROL).click(one).click(three).click(five).keyUp(Keys.CONTROL);
//
//		// Generate the composite action.
//		Action compositeAction = builder.build();// selenium
//
//		// Perform the composite action.
//		compositeAction.perform();
//		Thread.sleep(6000);
//
//		driver.close();
//
//	}
//}
// ==============================
public class SEL_11_Mousehover {
	public static void main(String... args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:\\My\\Study\\javaselenium\\webpages\\selectable.html");
		WebElement three = driver.findElement(By.name("three"));
		System.out
				.println("X coordinate: " + three.getLocation().getX() + "Y coordinate: " + three.getLocation().getY());
		Actions builder = new Actions(driver);
		Thread.sleep(3000);

		builder.moveByOffset(three.getLocation().getX() + 2, three.getLocation().getY() + 2).click();
		builder.perform();
		Thread.sleep(3000);

		driver.close();

	}
}