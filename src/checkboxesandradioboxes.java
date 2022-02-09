import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


	public class checkboxesandradioboxes {

		public static void main(String[] args) throws InterruptedException
		{
			
			
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		//	driver.get("https://www.spicejet.com/");
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());

			//System.out.println(driver.findElements(By.cssSelector("circle[fill-rule='evenodd']")).size());
		// finding number of cirlces or radio buttons in spicejet.com
		

			System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_IndArm']")).isSelected());
			Assert.assertFalse(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_IndArm']")).isSelected());
			// the above line checks if the check box is selected; it expects it to be NOT Selected			
			// if the above statemtn does not act according to out expectation program fails
			driver.findElement(By.id("ctl00_mainContent_IndArm")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_IndArm']")).isSelected());
			Assert.assertTrue(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_IndArm']")).isSelected());
			//the above line checks if the check box is selected; it expects it to be Selected
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			
			// using assertions for the same above ;; checking if the checkbox is selected or not
			
			// another assert method is Assert.assertEquals(Actual result,"expected result");
			
		}

	}

	
	



