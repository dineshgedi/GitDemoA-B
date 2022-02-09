import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import java.util.*;
import java.time.*;

public class Fluentwait {	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		WebElement finish = driver.findElement(By.cssSelector("[id='finish'] h4"));
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class); 
		
		 
		WebElement foo = wait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				if (finish.isDisplayed())
				{
					return finish;
				}
				else
				{
					return null;
				}
			}
		}
				
				
				
				
				);
		
		
		
	System.out.println(finish.getText());	
		
	}

}
