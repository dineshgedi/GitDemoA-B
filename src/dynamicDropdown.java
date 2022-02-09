import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();// this maximizes the opened chrome window
			driver.get("https://www.spicejet.com/");
			
			// DYNAMIC Dropdowns
			// only visible after some USER Action of CLicking or Typing
			// DEPENDANT dropdowns ex: which only shows arrival when departure is selected 
			//xpath for HYD : div[text()='Hyderabad']
			
			driver.findElement(By.cssSelector("div[data-testid='to-testID-origin']")).click();
			driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
			
			driver.findElement(By.cssSelector("div[data-testid='to-testID-destination']")).click();
			driver.findElement(By.xpath("//div[text()='Delhi']")).click();
			
			System.out.println(driver.findElement(By.cssSelector("div[data-testid='to-testID-origin']")).getText());
			System.out.println(driver.findElement(By.cssSelector("div[data-testid='to-testID-destination']")).getText());

			// if there are two xpaths with same path & you need to go for 2nd, then (xpath)[2];
			// i.e xpath : (//tagname[@attribute='value'])[2]
			
	}

}
