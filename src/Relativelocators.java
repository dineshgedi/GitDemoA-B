import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Relativelocators {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		
		WebElement nameElement = driver.findElement(By.cssSelector("[name='name']:nth-child(2)"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameElement)).getText());
		
		
		WebElement radio = driver.findElement(By.cssSelector("input[value='option1']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radio)).getText());
		
		
		
		
		
		
		
		
		

	}

}
