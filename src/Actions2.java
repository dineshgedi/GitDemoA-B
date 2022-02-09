import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) {
		// Selenium treats New Tab or New Window as a New window only
		// switch to new window  before performinng the actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		Actions a = new Actions(driver);
				
		WebElement target = driver.findElement(By.cssSelector("a[class='blinkingText']"));
		a.moveToElement(target).click().build().perform();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		
		driver.switchTo().window(childwindow); //switchin g to new window/tab opened
		String email = driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentwindow); //switching back to original window
		driver.findElement(By.id("username")).sendKeys(email);
		
		
	}

}
