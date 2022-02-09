import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6windows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();		
		
		driver.switchTo().window(childwindow);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentwindow);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
			
		
		
	}

}
