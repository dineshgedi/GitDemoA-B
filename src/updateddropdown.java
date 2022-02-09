import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateddropdown {

	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();// this maximizes the opened chrome window
		driver.get("https://www.spicejet.com/");
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise");

		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).click();
		Thread.sleep(2000);
		
		int i=1;
		while (i<4)
		{
		driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		
		i++;
		}
		
		
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers-done-cta']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).getText());
		

	}

}
