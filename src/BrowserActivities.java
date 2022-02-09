import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args) throws InterruptedException{


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		driver.manage().window().maximize();// this maximizes the opened chrome window
		driver.get("http://google.co.in");// .get method always waits for complete webpage to load
		driver.navigate().to("https://rahulshettyacademy.com"); 
		// .navigate method will NOT WAIT completely to load the page & navigaes to new link on SAME TAB
		driver.navigate().back(); //this navigates to previous page on SAME TAB
		driver.navigate().forward(); //navigates to forward page onn SAME TAB
		
		
	}

}
