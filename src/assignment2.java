import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException{


		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		driver.get("https://www.cleartrip.com/");
		
		
		driver.findElement(By.cssSelector("div.flex.flex-middle.p-relative.homeCalender")).click();
		driver.findElement(By.cssSelector("div[aria-selected='true']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='mb-4'] //select/option[@value='3']")).click();
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		String getinfo = driver.findElement(By.cssSelector("span[class='to-ellipsis o-hidden ws-nowrap fs-3 c-white']")).getText();
		
		System.out.println(getinfo);
	
	

	}

}
