package selenium;

/*C:\My\P\Study\javaselenium>java -jar selenium-server-standalone-3.141.59 -role hub
 * 
 * run to register the node to hub
 * java -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://localhost:4444/grid/register -port 5566

 */

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {
	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		String baseURL = "http://google.com/";
		String nodeURL = "http://localhost:4444/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(nodeURL), capability);
		driver.get(baseURL);
		Thread.sleep(3000);
		driver.quit();
	}
}
