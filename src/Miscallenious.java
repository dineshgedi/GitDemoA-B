import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

import org.testng.*;
import org.testng.asserts.SoftAssert;

public class Miscallenious {

	public static void main(String[] args) throws IOException {
		
		// Handling SSL Certificates & Insecure Certificates before entering a webpage
		
		
		//DesiredCapabilities ch = DesiredCapabilities.chrome(); //this chrome seems deprecated
		//ch.acceptInsecureCerts();
		
		
		ChromeOptions c= new ChromeOptions();
		c.addArguments("disable-infobars"); //disables the infobar ex: chrome being run by automation
		c.setAcceptInsecureCerts(true);
		c.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		c.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		c.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c); //pass the chromeoptions c in  Chromedriver args;
	// above elemnts says, invoke the chrome browser with options of "c" object with declared properties 
		
		
		driver.manage().window().maximize(); //maximizing window
		// DELETING  COokies ;; to not allow repopulating in the website
		driver.manage().deleteAllCookies(); //deletesall cookies
	//	driver.manage().deleteCookieNamed(""); // delete specific cookie

// Someitmes, in internet banking sites, need to delete the SESSION ID cookie to logout after a session tomeout or something
// then, delete the specific session id cookie by giving its name; 
		// after it is deleted, any click on webpage should redirect to homepage
		
		
		driver.get("https://www.google.co.in/");
				
		
// Taking Screenshots
// cast the driver to TakeScreenshot method
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //o/p is a file type
		// the above line takes screenshop and places it in src object of File class
			// for fileutils, add common input outputliberaries externally from apache website
			FileUtils.copyFile(src, new File ("D://screenshot.png")); //to view the screen shop present 
		//in src file inn our local machine, copying the file using FileUtils in a folder;
		
			

			
		
		
		
		
	}

}
