import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calenderActivity {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCU']"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

	}

}
