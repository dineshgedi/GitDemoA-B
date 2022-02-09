import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.time.*;


public class assignment4Sync {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w = new WebDriverWait(driver,7); //wait for 5 seconds
		

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		// id=username
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		// id =password
		driver.findElement(By.id("password")).sendKeys("learning");
		//css : input[value='user']
		driver.findElement(By.cssSelector("input[value='user']")).click();
		// deal with java alerts; driver.switchTO().alert().accept;
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		
		//driver.switchTo().alert().accept();
		// css: select[class='form-control'] // static dropdown
		// create static dropdown element
		WebElement userTypeoptions = driver.findElement(By.cssSelector("select[class='form-control']"));
		// create select object to select student by id or value -> xpath: //select/option[@value='consult']
		Select option = new Select(userTypeoptions);
		
		option.selectByValue("consult");
		
		// click checkbox ; id='terms'
		driver.findElement(By.id("terms")).click();
		// click sign in id signInBtn
		driver.findElement(By.id("signInBtn")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("(//button[@class='btn btn-info'])[1]"))));
		
		List<WebElement> items = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for (int i=0; i<items.size(); i++)
		{
			driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
	}

}
