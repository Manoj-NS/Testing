package learnselenium.day1;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertMessageCodeLearning {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://app4.sparinc.com/spartoolsus?_ga=2.158329274.1040077832.1655564889-117463900.1645817069");
		
		
		WebElement forgotuserElement = driver.findElement(By.xpath("//a[@class='btn text-blue small']"));
		forgotuserElement.click();
		
	
//No Email alert 		
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
	        
//For valid/invalid email and alert	
	        
    
		WebElement emailtextElement = driver.findElement(By.id("Input_UserEMailAddress"));
	    emailtextElement.sendKeys("manojgmail.com",Keys.ENTER);
	    
	    //driver.findElement(By.xpath("//html")).click();
	    
	    WebElement invalidemaillertElement = driver.findElement(By.id("Input_UserEMailAddress-error"));
		//invalidemaillertElement.getText();
	  //System.out.println(invalidemaillertElement.getText());
  
	    String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";  
        String enteredEmail = emailtextElement.getAttribute("value");
        
        if (Pattern.matches(regex,enteredEmail)) 
            //if (emailPattern.contains(enteredEmail))   //---->contains and .equals not working properly
                   
               {
                  System.out.println("Valid email address entered: " + enteredEmail);
              } 
              else 
            	  
              {
                  if (invalidemaillertElement.getText()!=null) {
                	  
                	  System.out.println(invalidemaillertElement.getText());
					
				}
            	  //System.out.println("Email Id: "+enteredEmail+ " is invalid");
                  //System.out.println(invalidemaillertElement.getText());
              }
        
        /*
        
        Pattern pattern = Pattern.compile(emailPattern);

        // Create a Matcher object and match the entered email against the pattern
        Matcher matcher = pattern.matcher(enteredEmail);

        // Check if the email address matches the pattern
        boolean isEmailValid = matcher.matches(); 
        
       // System.out.println("Entered email id is invalid :"+enteredEmail);
  
		
      if (isEmailValid) 
      //if (emailPattern.contains(enteredEmail))   //---->contains and .equals not working properly
             
         {
            System.out.println("Valid email address entered: " + enteredEmail);
        } 
        else 
        {
            System.out.println("Email Id: "+enteredEmail+ " is invalid");
        //    System.out.println(invalidemaillertElement.getText());
        }
      
 */       
           
        /*
          //String emailPattern="^(.+)@(.+)$";
	    //String emailPattern="^[A-Za-z0-9+_.-]+@(.+)$";
	    
	   // String emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9]+.[a-zA-Z]+$";
	    
	    String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        String enteredEmail = emailtextElement.getAttribute("value");
        
 
		
   
      
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         */
	}

}
