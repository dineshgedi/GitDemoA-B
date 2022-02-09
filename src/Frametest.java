import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frametest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.get("https://jqueryui.com/droppable/");
		// To perform an action on a frame, switchTO() a frame from driver. by specifying frame index
		// for that first check number of frames present by searching tagname = iframe
		//then perform action
		//switch back to defaultcontent
		
		// to drag & drop, use Action Class
		
		
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	driver.switchTo().frame(0);
	
	Actions a= new Actions(driver);
	driver.findElement(By.id("draggable")).click();
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	
	a.dragAndDrop(source, target).build().perform();
	
	
	
	driver.switchTo().defaultContent();
	
	
	}

}
