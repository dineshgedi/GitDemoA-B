import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {

		// Invoking Browser
		// To invokeCHrome, ChromeDriver Class which has -> Methods that can be called in code
		// TO invoke Firefox, FirefoxDriver CLass which has -> same Methods that can be called
		
		// WebDriver is the interface that makes sure all the browsers has same methods to call for a particular action
	    // WebDriver is a Class that has empty Methods	
		// Responsibility of WebDriver is to implement methods declared in the interface
		// usage of implements WebDriver on top beside public class SeleniumIntro to.. 
		//..specify the browser to implement WebDriver Methods
		// public class SeleniumIntro implements WebDriver{ is the syntax

		// create objects of class to invoke methods present in the class
		// chrome or others can implement other internal class methods also in addition to WebDriver methods
		// HERE lies a PROBLEM**, if the ChromeDriver class is used to create its object, then.. 
		// ..since chrome can also have its browser SPEFICIC methods, it willthrow an error if the code 
		// needs to be automated for a firefox browser
		// SO Create the object in WebDriver Class to RESTRICT  browser specific methods form being used in the code
		
		// ChromeDriver driver = new ChromeDriver(); --> problem if firefox needs to automate same code 
		
		// Class 	object    new allocates memory to the object;
		// Instead of creating chromedriver object, webDriver object created to limit chrome specific methods
		
		// Due to Restriction on Invoking Chrome Browser Directly by Selenium, a chromedriver.exe 
				//..application is used to invoke the browser through selenium code;
				
		// so to invoke the chromedriver from selenium code here, need to set the value of exe path
		// based on the chrome browser version to be invoked, download chromedriver from internet
		// set the path to key "webdriver.chrome.driver"
				
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		
		//  above line invokes chromedriver.exe & the chromedriver invokes chrome browser to execute code below
		// similarly to invoke geckodriver.exe to invoke FirefoxDriver
		
		
		WebDriver driver = new ChromeDriver(); // creating a driver object of WebDriver Class; for Chromme Browser
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com"); // opens a webpage with given url
		// sometimes you need to validate if the website on opening is redirecting to someother websie !
		// use getCurrentUrl(); method to validate that		
		System.out.println(driver.getCurrentUrl());	
		System.out.println(driver.getTitle()); // print title of the web page opened
		
		//driver.close(); // this closes the current tab
		driver.quit(); // this closes all the tabs opened by selenium;
	} 

}
