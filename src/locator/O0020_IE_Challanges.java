package locator;

/*Untrusted SSL Certificate
Internet Explorer is the product of Microsoft and IE is much worried 
about security and IE is known as the most secured browser. 
At times using IE Browser with Selenium gives SLL Certificate pop up.

There are two ways to resolve the SLL Certificate issue.
*/

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

//public class O0020_IE_Challanges {
//
//	public static void main(String[] args) {
//
//		InternetExplorerDriver driver = new InternetExplorerDriver();
//		driver.get("URL for which certificate error is coming");
//		driver.navigate().to("javascript:document.getElementById('overridelink').click()");
//	}
//	// TODO Auto-generated method stub
//
//}

//==================================
public class O0020_IE_Challanges {

	public static void main(String[] args) {

		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		// Settings to Accept the SSL Certificate in the Capability object
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		InternetExplorerDriver driver = new InternetExplorerDriver(capabilities);
		driver.get("URL for which certificate error is coming");

	}
}

xpath-

can be
find by
MRI tool