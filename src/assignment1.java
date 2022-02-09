import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class assignment1 {

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

		
		int count = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(count);
		
	}

}
