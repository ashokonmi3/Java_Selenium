package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/My/P/Study/javaselenium/locator1.html");
		driver.findElement(By.id("firstButton")).click();// TODO Auto-generated method stub

	}

}
