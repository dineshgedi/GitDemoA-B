import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class moreLocators2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "gedi";
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getCurrentUrl());	
		System.out.println(driver.getTitle()); 
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
	 	Thread.sleep(5000);
	 	driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); 
	 	
	 	String password = getPassword(driver);
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(3000);
		
		
		
		// logging in withcorrect password
		//driver.findElement(By.id("inputUsername")).sendKeys("gedi"); 
		driver.findElement(By.id("inputUsername")).sendKeys(name); // use a string to represent input
		driver.findElement(By.name("inputPassword")).sendKeys(password); 
		driver.findElement(By.className("signInBtn")).click();
		
		// finding the text on login home page usinng unique tag name; use if there is only unique tag
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Thread.sleep(2000);// in usage explicit wait is better than thrread.sleep later classes;
		// For assertions to compare text/values, then in pom.xml file, remve scope line in testng dependacy
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.xpath("//h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Hello "+name+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();// xpath based on button text
		// or if button tag is uniqe, you can also write //*[text()='Log Out'] as xapth
		
		//driver.close();
		
	}
	
	// method to obtain password from the website by parsing through the text capture from website
	public static String getPassword(WebDriver driver){
		
	 	String passwordtext = driver.findElement(By.cssSelector("form p")).getText();	
	 	String passwordtext2[] = passwordtext.split("'"); // string array to store splitted strings
		String password = passwordtext2[1].split("'")[0];
		
		return password; 
		
	}
	
	

}
