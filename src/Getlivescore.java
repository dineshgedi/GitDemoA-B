import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.time.*;

public class Getlivescore {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();// this maximizes the opened chrome window
		driver.get("https://www.google.co.in/");

		String str1 = "live cricket";
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(str1);
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ENTER);

		// driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();

		// driver.findElement(By.xpath("(//div/ol/li[@class='imso-hide-overflow tb_l
		// GSkImd tb_st'])[1]")).click();

		Thread.sleep(2);
		// driver.findElement(By.xpath("(//*[contains(text(),'Today')])[1]")).click();
		// driver.findElement(By.xpath("(//*[contains(text(),'Live')])[1]")).click();
		
		boolean present;
		try {
		   driver.findElement(By.xpath("(//*[@class='imso_mh__tm-a-sts'])[1]"));
		   present = true;
		} catch (Exception e) {
		   present = false;
		}
		
		
		if (present)
		{
			driver.findElement(By.xpath("(//*[@class='imso_mh__tm-a-sts'])[1]")).click();
		Thread.sleep(3);
		String team1 = driver
				.findElement(By.xpath("(//div[@class='ellipsisize liveresults-sports-immersive__team-name-width'])[1]"))
				.getText();
		String team1Score = driver.findElement(By.xpath("(//div[@class='imso_mh__scr-sep']//div/div/div/div)[1]"))
				.getText();
		String team1Overs = driver.findElement(By.xpath("(//div[@class='imso_mh__scr-sep']//div/div/div/div)[2]"))
				.getText();
		String team2 = driver
				.findElement(By.xpath("(//div[@class='ellipsisize liveresults-sports-immersive__team-name-width'])[2]"))
				.getText();
		String team2Score = driver.findElement(By.xpath("(//div[@class='imso_mh__scr-sep']//div/div/div/div)[3]"))
				.getText();
		String team2Overs = driver.findElement(By.xpath("(//div[@class='imso_mh__scr-sep']//div/div/div/div)[4]"))
				.getText();

		System.out.println(team1 + "      " + team1Score + "      " + team1Overs);
		System.out.println(team2 + "      " + team2Score + "      " + team2Overs);

		}
		
		else {
			System.out.println("No match live today");
		}
		/*
		 * xpath for matches: (//div/ol/li[@class='imso-hide-overflow tb_l GSkImd
		 * tb_st'])[1] xpath for today : (//*[contains(text(),'Today')])[1]
		 * 
		 * xpath for live link (//*[contains(text(),'Live')])[1]
		 * 
		 * xpath for first name : (//div[@class='ellipsisize
		 * liveresults-sports-immersive__team-name-width'])[1] xpath for first score
		 * (//div[@class='imso_mh__scr-sep']//div/div/div/div)[1] xpath for first overs
		 * (//div[@class='imso_mh__scr-sep']//div/div/div/div)[2]
		 * 
		 * 
		 * xpath for first name : (//div[@class='ellipsisize
		 * liveresults-sports-immersive__team-name-width'])[2] xpath for second score
		 * (//div[@class='imso_mh__scr-sep']//div/div/div/div)[3] xpath for second overs
		 * (//div[@class='imso_mh__scr-sep']//div/div/div/div)[4]
		 * 
		 */

	}

}
