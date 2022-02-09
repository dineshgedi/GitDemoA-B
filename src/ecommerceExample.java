import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ecommerceExample {

	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,5);

		String[] shopItems = {"Beetroot", "Carrot", "Apple"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);		
		addItems(driver,shopItems);		
		goToCheckOut(driver,w);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); this is deprecated method now
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
		//explicitly wait for 5 seconds to let promocode box be visible
		enterPromoCode(driver,w);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); implict wait
		
	}
	
	
	
	public static void addItems(WebDriver driver, String[] shopItems) {
	
	List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
	// identifying each of many elements & storing the elements in a List
	
	int j=0;
	
	
	for (int i=0; i<productNames.size(); i++)
	{
		String[] productfullName = productNames.get(i).getText().split("-");
		String product = productfullName[0].trim(); // trimming the extraspaces in beginning & at end of a string
		
		List shopItemsList = Arrays.asList(shopItems);  // converting the array to Array list
						// so that contains method can be used
		
		if (shopItemsList.contains(product)) // Array list has contains method; NOT for arrays
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			if (j==shopItems.length)
			{
				break;
			}
		}
		
		
		
	}
	
}

	
	public static void goToCheckOut(WebDriver driver, WebDriverWait w) throws InterruptedException
	{
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		//Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div/button[text()='PROCEED TO CHECKOUT']")).click();
		// alternate to above line
		//friver.findElement(By.xpath)("//button[contains(text(),'PROCEDD TO CHECKOUT')]").click();
		
	}
	

	public static void enterPromoCode(WebDriver driver, WebDriverWait w) throws InterruptedException
	{

		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Explicit Wait method with webdriver
		
		//WebDriverWait w = new WebDriverWait(driver,5); //5 seconds explicit waiting declare this in main
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));			
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}
	
}
