import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdownloc1 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		// Locating UNIQUELY, the element by PARENT CHILD RELATIONSHIP
		// if there are multiple elements with same xpath; use xpath : parentxpath childxpath
		
		
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCU']")).click();		

	}

}
