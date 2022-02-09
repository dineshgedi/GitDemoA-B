import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;


public class traversingLocators {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		System.out.println(driver.getCurrentUrl());	
		System.out.println(driver.getTitle()); 
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//Traversing from parents to Child to siblings
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		//traversing from child to parent
		
		
	//	driver.close();
	//	driver.quit(); 
		
		
	}

}
