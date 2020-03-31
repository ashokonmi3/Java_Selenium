package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class SEL_17_Testcase2 {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file:///C:/My/Study/javaselenium/webpages/login.html");
//		driver.findElement(By.name("username")).sendKeys("root");
//		driver.findElement(By.name("password")).sendKeys("root");
//		Thread.sleep(5000);
//
//		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
//		Thread.sleep(5000);
//
//		String url = driver.getCurrentUrl();
//		if (url.equals("file:///C:/My/Study/javaselenium/webpages/AlertPage.html")) {
//			System.out.println("Login Successful. Test case passed.");
//		} else {
//			System.out.println("Login Failed. Test case failed.");
//		}
//		Thread.sleep(5000);
//		driver.close();
//	}
//}

// // ------------------------------
// Negative test case
public class SEL_17_Testcase2 {
	//
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// try {

		driver.get("file:///C:/My/Study/javaselenium/webpages/login.html");
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("root34");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		// String url = driver.getCurrentUrl();
		// } catch (Exception e) {
		System.out.println(" i am in to exception");

		Alert ale = driver.switchTo().alert();
		Thread.sleep(5000);
		String s = ale.getText();
		System.out.println(s);
		ale.dismiss();

		if (s.contains("Invalid Password")) {
			System.out.println("Handling error message. Test case passed.");
		} else {
			System.out.println("NOt able to capture error message. Test case failed.");
		}
		Thread.sleep(5000);
		driver.close();
	} //
		// }
}
