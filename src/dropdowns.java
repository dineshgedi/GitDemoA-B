import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdowns {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();// this maximizes the opened chrome window
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		// Dropdowns 
		// create a webelement to go to dropdowns of that element
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		//  Select is Class for dropdowns elements;
		// Create a select object & pass webelemet to it
		
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByIndex(3); // selecting the option element from dropdown based on index
		System.out.println(dropdown.getFirstSelectedOption().getText()); // see what is selected
		dropdown.selectByVisibleText("INR"); //selecting the option from text
		System.out.println(dropdown.getFirstSelectedOption().getText()); 
		dropdown.selectByValue("AED"); //selecting by value attribute in html page
		System.out.println(dropdown.getFirstSelectedOption().getText()); 
		// All the above methods can be used if the dopdown element has SELECT Tag***** ONLY
		// not useful if there is no select tag;
		
		//data-testid="home-page-travellers
		
		
		
	}

}
