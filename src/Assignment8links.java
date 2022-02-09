import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment8links {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption3")).click();
		
		String option = driver.findElement(By.cssSelector("label[for='honda']")).getText();
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select dropdownOption = new Select(dropdown);
		
		dropdownOption.selectByVisibleText(option); //selectign the option it means clicking also
		
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText().contains(option));
		
		
		
		
		
	}

}
