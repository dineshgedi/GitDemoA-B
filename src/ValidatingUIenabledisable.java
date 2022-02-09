import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatingUIenabledisable {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("git check");
		System.out.println("git check");


		
		
// checking if the roundtrip radio button is enabling the disabled calender to be enabled 
		//System.out.println("calender is "+driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		//System.out.println("round trip is "+driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//Thread.sleep(2000);
		//System.out.println("roundtrip is : "+driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		//System.out.println("calender is : "+driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	
		
		// Here .isEnabled is failing in some cases since UI is able to allow user to fix date
		// even when roundtrpip radio is not selected
		
		// so WORK AROUNT for this type of issue is below
		// check for the unique variable changing while enabling & disabling the 2nd calender eleemet
		// & check it to find if the calender button is enabled or disabled
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //click on roundtrip button
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
		
		
		
		
		
	}

}
