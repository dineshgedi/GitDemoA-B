import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptforscrolling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  //casting driver to jaavscript & crreating its object
		js.executeScript("window.scrollBy(0,500)"); // executing javascript that is in ""
		
		Thread.sleep(3000);		
	//	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //give css inside query selector & scrollTop meaning go to down
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum=0;
		for (int i=0; i<values.size(); i++)
		{
			sum += Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(sum);

	int fromWebPage = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

	System.out.println(fromWebPage);
		
		
		//assert in code
		
		Assert.assertEquals(sum,fromWebPage);
		
	}

}
