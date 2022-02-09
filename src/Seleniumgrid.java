import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Seleniumgrid {

	public static void main(String[] args) throws MalformedURLException {

// Selenium Grid by connecting a HUN to many Nodes; need many node machines
		// here it is an example to show howl it works; 
		//here tests are run remotely on other machines from HUB invoking/triggering
		
		// setting the desired capabilities of the NOde on which this code should run
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		
		// invoking RemoteWebDriver with URL of selenium GRID & our desired capabilities OBJECT
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444"),dc);
		
		// now this code checks in selenium grid if there are any nodes registered with our mentioned 
		// desired capabilities & runs if it finds any such node
		
		// In Hub machine the webdriver is not invoked BUT it is invoked in the Virtual Machine where
			// out Desired Node is registered
		// GRID takes care of which node to assign if there are multiple nodes with desired capabilities
		// but if there are no nodes with desired capabilities, then execution fails
		
		
		//NOW write any code here
		
	}

}
