import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



public class mylocators {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//driver.get("https://www.insightsonindia.com/insights-ias-upsc-current-affairs/");
		driver.get("https://instacourses.insightsonindia.com/user-login");
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		//Actions action = new Actions(driver);
		//WebElement we = driver.findElement(By.id("mega-menu-item-187447"));
		
	//	action.moveToElement(we).moveToElement(driver.findElement(By.cssSelector("a[href='https://www.insightsonindia.com/security-issues/']"))).click().perform();
		
		
			//driver.findElement(By.cssSelector("div.talk_btn")).click();
			//driver.navigate().forward();
			//Thread.sleep(3000);
		//System.out.println(driver.getCurrentUrl());
		//Thread.sleep(3000);
		driver.findElement(By.id("mobile")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("passwardadd");
		driver.findElement(By.id("login_btn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("div.showSweetAlert")).getText());
			
			//Thread.sleep(3000);
		
		//driver.findElement(By.className("r-30o5oe")).sendKeys("BongChh");
	     //driver.findElement(By.className("r-30o5oe")).sendKeys(Keys.ENTER); // type enter
	     //driver.findElement(By.className("password")).sendKeys("gurubhavani09");
	    		//driver.findElement(By.className("css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0")).click();	
		
		
		
	//	Thread.sleep(3000);
		
		
		

	}

}
