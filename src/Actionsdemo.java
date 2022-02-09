import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver); // creating an object a of Actions class
		
		WebElement target1 = driver.findElement(By.id("nav-link-accountList"));
		
		a.moveToElement(target1).build().perform(); // JUST moving without clickingn, the mouse cursor to a particular element to view a dropdown
				
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("bts").doubleClick().build().perform();
		//moving to search box, clicking on it, holding shift button, typing bts, doubleclicking the element so that text is highlighted 	
		
		//using.contextclick() you can right click on the element
	}

}
