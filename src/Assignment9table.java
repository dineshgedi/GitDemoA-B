import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9table {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  //casting driver to jaavscript & crreating its object
		
		js.executeScript("window.scrollBy(0,650)"); // executing javascript that is in ""
		
		Thread.sleep(3000);		
	//	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //give css inside query selector & scrollTop meaning go to down
		
		List<WebElement> rowelements = driver.findElements(By.cssSelector(".table-display th"));
		
		System.out.println(rowelements.size());
		
		List<WebElement> coloumnelements = driver.findElements(By.cssSelector(".table-display td:nth-child(1)"));
		
		System.out.println(coloumnelements .size());
		
		System.out.println(driver.findElement(By.xpath("(//tr)[3]")).getText());
		
		
		
		
		
		
		
	}

}
