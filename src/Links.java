import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// finding the number of LINKS  in a webpage
		// links have a default tag name "a" in HTML documents
		
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		// finding the number of link in a particular sector like header or footer
		// Limit the SCOPE  of the WebDriver by creating a Webelement for footer & find links
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		int linksOnFooter =  footerDriver.findElements(By.tagName("a")).size();
		System.out.println(linksOnFooter);
		
		// again limiting the scope of driver with new element
		
		WebElement discountSection = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		// here, using footerfriver, xpath can be found from footer start point on html page
		
		int linksOnDiscounts = discountSection.findElements(By.tagName("a")).size();
		System.out.println(linksOnDiscounts);
		
		// click on each link on discount section; if they dynamically change, traverse all elements & click
		//here in this page, clicking on each link is not opening new tab
		// so open them ini new tab by CTRL + Mouse click 
		// then goto each tab and get the title
		
		for (int i=1; i<linksOnDiscounts;i++ )	//here i=1 because i=0 has the discounts heading link
		{
			
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER); //clicking multiple keys
			
			discountSection.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab); // open in new tab by crtl key
	
			
		}
	
		// now after clicking on all links, goto each window & get its title use getwindowhandles & iterator
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		while (it.hasNext()) // it always start at even before first window; it.next gives us current
		{
			System.out.println(driver.switchTo().window(it.next()).getTitle());				// if it has a next window, then do this
		}
		
		
		
		
	}

}
