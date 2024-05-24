package learnselenium.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RoughTest {
	
	public static void main(String[] args) {
		
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.get("https://practicetestautomation.com/practice-test-login/");
	
	/*
	
	  WebElement usernameElement = driver.findElement(By.id("username"));
	  usernameElement.sendKeys("student");
	  
	  WebElement passwordElement = driver.findElement(By.id("password"));
	  passwordElement.sendKeys("Password1234");
	  
	  WebElement submitbuttonElement = driver.findElement(By.id("submit"));
	  submitbuttonElement.click();
	*/  
	  
	//Logo validation
		
		WebElement logoElement = driver.findElement(By.className("custom-logo"));
		System.out.println("Is logo displayed? "+logoElement.isDisplayed());
		
		if (driver.getTitle().equals("Test Login | Practice Test Automation")){
			System.out.println("Title is displaying");
		}
		else {
			System.out.println("Title is not displaying");
		}
		
/*	    
//Valid User and Password
	
	  try {
		  WebElement loggedinElement = driver.findElement(By.xpath("//h1[normalize-space()='Logged In Successfully']"));

		
		Assert.assertTrue(loggedinElement.isDisplayed());
		System.out.println("Login Status: Login Successfully");

	/*	
		
						
	if(loggedinElement.isDisplayed()) {
			  System.out.println("Login Status: Login Successfully");}
	  		  
	else {
			System.out.println("login credentials");
	}
*/
		/*
	  }
	  catch(Exception e) {
		//  e.printStackTrace();
		  System.out.println("Please check the login credentials");
	  }
  */
//Invalid Username
/*
	  try {
		  WebElement useralertElement = driver.findElement(By.xpath("//div[text()='Your username is invalid!']"));
 //   String actualUserAlert = useralertElement.getText();
 //   String expectedUserAlert = "following error occurred during login: User not found.";

 
	
   	if (useralertElement.isDisplayed()) {
    
        System.out.println("User Status: Invalid username");
      
    } else {
        System.out.println("User Status: Valid username entered");
    }   
	}
	catch (Exception e) {
		
	}
*/
//Invalid Password
/*	
		 WebElement passwordalertElement=driver.findElement(By.xpath("//*[text()[contains(.,'Password incorrect')]]"));
		 String Actualpasswordalert=passwordalertElement.getText();
		 String Expectedpasswordalert="following error occurred during login: Password incorrect.";
		  	 		  
		 if(passwordalertElement.isDisplayed() && Actualpasswordalert.equals(Expectedpasswordalert)) 
		 {
				System.out.println("Password Status: Invalid password");
			}
				else {
			        System.out.println("Password Status: Valid password entered");
			        
			        }
		 */
	
		}
}

