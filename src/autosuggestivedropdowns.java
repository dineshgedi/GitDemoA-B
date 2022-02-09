

	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class autosuggestivedropdowns {

		public static void main(String[] args) throws InterruptedException
		{
			
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());

			// Dealing with AUTO Suggestive Dropdowns that changes with user actions like typing
			
			driver.findElement(By.id("autosuggest")).sendKeys("uni");
			Thread.sleep(3000);
			// create an list of webelements to store all the drop down webelements showinng
			
			List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		// the abouve line used FIND ELEMENTS Plural to get all the elements with same attribute
			// and stored them in a List;
			// here the css selector is same for all the dropdown menu webelements shown;
			// they are stored in array options;
			
			// now traverse through all options & find UK, & select it
			
			for (WebElement option : options)
			{
				if (option.getText().equalsIgnoreCase("United Kingdom (UK)"))
				{
					option.click();
					break;
				}
				
			}

	

		}

	}

	
	

