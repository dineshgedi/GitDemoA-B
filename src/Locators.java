import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // 5 seconds timeout to execute 
		// above line says to selinium to wait for 5 seconnds if any info is not being able to retrive
		//this above line is globally applicable to our code anywhere an error is encountered, it waits 5 secs
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getCurrentUrl());	
		System.out.println(driver.getTitle()); 
		
		driver.findElement(By.id("inputUsername")).sendKeys("gedi"); 
		// since we are locating username box by "id" Locator for in rahulshetty website
		// the id is inputUsername for username box;
		
		driver.findElement(By.name("inputPassword")).sendKeys("signin"); 
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//
		//the above line ran into ERROR saying No such element expections since browser is taking aboir
		// 2 seconds to show error message by then slenium is trying to find the message
		// so need to add implicitywait method
		
		driver.findElement(By.linkText("Forgot your password?")).click();
	 	Thread.sleep(3000);	// waiting for 1 second i.e 1000 milli seconds
		// for above line declare "throws  InterruptedException" after String args in main line
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("dinesh");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dinesh@ssa.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear(); // this clears the box;
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dinesh@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9090909090"); // phone nuumber
		// above using only tag names to select the element by travesing throuh child tags
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // here TEST Failed because selenium
		// is typing the info in name email phone fields before  forgot password page is visible 
		//due to sliding UI; & 1 second gap in loadin the page. so wait for 1 sec after clicking forgot password
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());		
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("dinesh");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
	//	driver.close();
	//	driver.quit(); 
		
		
	}

}
