package roughlearningselenium;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailAndPhoneValidation {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
		
		WebElement emailtextElement = driver.findElement(By.xpath("//label[@for='email']"));
		emailtextElement.getText();
		
		String emailText="Email";
		
		if (emailText.equals(emailtextElement.getText())) {
			
			System.out.println("Email address text is correct \n");
			
		} else {
			
			System.out.println("Email address text is incorrect \n");

		}
		
//Email Validation:

		
		WebElement emailvalidationElement = driver.findElement(By.id("email"));
		//emailvalidationElement.sendKeys("manoj.ns@gmail.com");
		
		String [] multiemailAddress = {
				  
				  "ma@noj@muthu.com",
				  "manoj@gmail",  
				  "manoj#gmail.com",
				  "mnoj@gamil-com",
				  "manojgmail.com",
				  "manoj@gmail.com",
				  "testdata"
		 };
		  
		  for (String emailAddress : multiemailAddress) {
			  	  
			  emailvalidationElement.clear(); // Clear any existing text in the input field
			  emailvalidationElement.sendKeys(emailAddress);
			
		}

				String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";  

		  		Pattern pattern = Pattern.compile(regex);  
		  		
		  		
				for(String email : multiemailAddress)

				{  	
				    Matcher matcher = pattern.matcher(email);  
				    
				    System.out.println(email +" : "+ matcher.matches()+"\n");  
				}  
			

		
		
		
	//	driver.close();
	}

}
