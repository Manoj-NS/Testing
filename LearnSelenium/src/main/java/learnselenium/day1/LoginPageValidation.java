package learnselenium.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageValidation {
	
	private static final TimeUnit SECONDS = null;

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://app4.sparinc.com/spartoolsus?_ga=2.158329274.1040077832.1655564889-117463900.1645817069");
		
	
		WebElement forgotuserElement = driver.findElement(By.xpath("//a[@class='btn text-blue small']"));
		forgotuserElement.click();
		
//No Email Address alert and validation
		
		WebElement forgotusernameSubmitElement = driver.findElement(By.xpath("//input[@type='submit']"));
		forgotusernameSubmitElement.click();
		
		WebElement emailaddressalertElement = driver.findElement(By.id("Input_UserEMailAddress-error"));
		emailaddressalertElement.getText();
		
			System.out.println("Displayed alert message is: "+emailaddressalertElement.getText());
		
			String alert="Please enter user email address.";
	     
	        if (alert.equals(emailaddressalertElement.getText())) {
	            System.out.println("No Email alert message validation passed.");
	        } 
	        else 
	        {
	            System.out.println("No Email alert Alert message validation failed.");
	        }
	       
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement emailtextElement = driver.findElement(By.id("Input_UserEMailAddress"));
	    emailtextElement.sendKeys("manoj@muthutech.com");
	    
//WebElement invalidemaillertElement = driver.findElement(By.id("Input_UserEMailAddress-error"));
//invalidemaillertElement.getText();
		   
	    String emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9+.-]+[a-zA-Z+]$";
        String enteredEmail = emailtextElement.getAttribute("value");
        
 	     
        
        if (Pattern.matches(emailPattern,enteredEmail)) 
            //if (emailPattern.contains(enteredEmail))   //---->contains and .equals not working properly
                   
               {
                  System.out.println("Valid email address entered: " + enteredEmail);
              } 
              else 
              {
                 System.out.println("Email Id: "+enteredEmail+ " is invalid");
                  //System.out.println(invalidemaillertElement.getText());
              }

//For invalid email alert message	
        

  	     //WebElement invalidemaillertElement = driver.findElement(By.id("Input_UserEMailAddress-error"));
  		 //invalidemaillertElement.getText();	
  			
  		//System.out.println(invalidemaillertElement.getText());
/*		
// No User Name and Password
			
				WebElement loginbuttonElement = driver.findElement(By.xpath("//input[@type='submit']"));
				loginbuttonElement.click();
				
				WebElement usernamealertElement = driver.findElement(By.xpath("//span[@class='text-danger text-left text-wrap field-validation-error']"));
				usernamealertElement.getText();
				
				WebElement passwordalertElement = driver.findElement(By.id("Input_Password-error"));
				passwordalertElement.getText();
				
				
		
			    String alertText = usernamealertElement.getText();
			    String alertText2 = passwordalertElement.getText();
				
				// if (alertText.contains("123")) it is not case sensitive-if any word equal it shows 'True'  
			    
			    if (alertText.contentEquals("Please enter user name.")) {
					
					System.out.println("User name alert message validation passed.");
				} 
				else 
				{
					System.out.println("User name alert message validation failed.");
				}

				if (alertText2.contentEquals("Please enter password.")) 
			    
			    	    {
			            System.out.println("Password alert message validation passed.");
			        } 
				 else 
			        {
			            System.out.println("Password alert message validation failed.");
			        }
		*/		
			        
		/*		 
			
// Valid User name No Password
				
				
				WebElement usernameElement = driver.findElement(By.id("Input_Username"));
				usernameElement.sendKeys("manojs");
				
				WebElement loginbuttonElement = driver.findElement(By.xpath("//input[@type='submit']"));
				loginbuttonElement.click();
				
				WebElement passwordalertElement = driver.findElement(By.id("Input_Password-error"));
				passwordalertElement.getText();
				
				 String alertText3 = passwordalertElement.getText();
				
				if (alertText3.contentEquals("Please enter password.")) 
				    
			    {
		        System.out.println("Password alert message validation passed.");
		    } 
		 else 
		    {
		        System.out.println("Password alert message validation failed.");
		    }
				
				
// Valid Password No User Name
				
				
						WebElement passwordElement = driver.findElement(By.id("Input_Password"));
						passwordElement.sendKeys("Manoj:12");
						
						WebElement loginbuttonElement = driver.findElement(By.xpath("//input[@type='submit']"));
						loginbuttonElement.click();
						
						WebElement usernamealertElement = driver.findElement(By.xpath("//span[@class='text-danger text-left text-wrap field-validation-error']"));
						usernamealertElement.getText();
						
						 String alertText4 = usernamealertElement.getText();
						
						if (alertText4.contentEquals("Please enter user name.")) 
						    
					    {
				        System.out.println("Username alert message validation passed");
				    } 
				 else 
				    {
				        System.out.println("Username alert message validation failed");
				    }

	// Incorrect User name
				
				
				WebElement usernameElement = driver.findElement(By.id("Input_Username"));
				usernameElement.sendKeys("Testdata");
				
				WebElement passwordElement = driver.findElement(By.id("Input_Password"));
				passwordElement.sendKeys("Manoj:12");
				
				WebElement loginbuttonElement = driver.findElement(By.xpath("//input[@type='submit']"));
				loginbuttonElement.click();
				
				WebElement incorrectuseralertElement = driver.findElement(By.xpath("//span[@class='text-danger text-center']"));
				incorrectuseralertElement.getText();
				
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				
				 String alertText5 = incorrectuseralertElement.getText();
				
				if (alertText5.contentEquals("The username/password combination provided is not valid. Please try again...")) 
				    
			    {
		        System.out.println("Login alert message validation passed.");
		    } 
		 else 
		    {
		        System.out.println("Login alert message validation failed.");
		    }
		    
		   
	//Valid user and password	
				
				WebElement usernameElement = driver.findElement(By.id("Input_Username"));
				usernameElement.sendKeys("vgovindan");
				
				WebElement passwordElement = driver.findElement(By.id("Input_Password"));
				passwordElement.sendKeys("sparVK*1");
				
				WebElement loginbuttonElement = driver.findElement(By.xpath("//input[@type='submit']"));
				loginbuttonElement.click();
				
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				
		        String expectedURL = "https://app4.sparinc.com/spartoolsus/manu"; 
				String actualURL = driver.getCurrentUrl();

				if (actualURL.equals(expectedURL)) {
				    System.out.println("Login page URL is incorrect.");
				} else {
				    System.out.println("Login page URL is correct.");
				}
				    
//Forgot User Name alert message		
					WebElement forgotuserElement = driver.findElement(By.xpath("//a[@class='btn text-blue small']"));
					forgotuserElement.click();
					
					WebElement forgotusernameHeader = driver.findElement(By.xpath("//div[@class='card-header bg-blue text-center']"));
					forgotusernameHeader.getText();
					
										
					String expectededHeader= "Username Reminder (Step 1 of 2)";
					
					if ((expectededHeader.equals(forgotusernameHeader))) {
						
						System.out.println("Header name is correct");
					} 
					else 
					{
						System.out.println("Header name is incorrect");
					}
				*/		
				}
		
		
	}


