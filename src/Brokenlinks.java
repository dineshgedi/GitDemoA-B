import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

     // BROKEN Links: URL is not working;
     		// Status Codes > 400 are broken URLs & the link tied upto that url is broken
     		// java methods will call urls, & get the status codes without hitting urls
     				
     					
     					// URL Class of Java has method openConnection()
     									
     					// Soft assertions : give error response but do not stop running the code
     					// soft assert in test ng like assert;
     					// create soft assert object & with that object use Assert;
     		 			// in this way, fails are stored but running wont stop. 
     		 			// at the end when sa.assertAll() is done, then it reports all the fails if there are any & fails
     		 		// if there are no fails, it passes
     		 
        List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
// get all weblinks in a list of webelements
        
        SoftAssert sa =new SoftAssert(); //soft assert to store the fails but not stop in middle

        for(WebElement link : links)

        {

            String url= link.getAttribute("href"); // get attribute of href which has link from each element
         

            HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
            //this is a java method ; establishing connection without driver
            //URL is a class in Java with openConnection() method	
            
            conn.setRequestMethod("HEAD"); //
            conn.connect();
            int respCode = conn.getResponseCode();

            System.out.println(respCode);

            sa.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

           

       

        }

         sa.assertAll(); // now report all the stored fails if any with the above message given in sa.assert line

	
	}

}
