import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendera2 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		// Find a common attribute to each date & put it in a list & iterate to check if its text 
		// matches the text you want to check; ex: date to be selected

		// to select the month, see the month element & check if it contains our required month 
		
		driver.findElement(By.id("travel_date")).click();
		//String month = ;
		// css selector from parent to child using SPACE
		
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("April")) //check if it doesnt contain april, if it contains exit while
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] tr th[class='next']")).click();
		}
		
		int dates = driver.findElements(By.cssSelector("[class='day']")).size(); 
		System.out.println(dates);
		
		for  (int i=0; i<dates;i++)
		{
			
			String date = driver.findElements(By.cssSelector("[class='day']")).get(i).getText();
			
			
			if (date.equalsIgnoreCase("24"))
			{
				driver.findElements(By.cssSelector("[class='day']")).get(i).click();
				break;
			}
			
		}
		
	}

}
