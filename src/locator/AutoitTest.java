package locator;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://encodable.com/uploaddemo/");
		driver.findElement(By.name("uploadname1")).click();
		Thread.sleep(5000);

		// below line execute the AutoIT script .
		Runtime.getRuntime().exec("C:\\My\\P\\Study\\javaselenium\\Autoit\\FileUpload.exe");
		Thread.sleep(5000);

		driver.close();
	}
}