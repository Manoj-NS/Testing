package roughlearningselenium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhoneNumberValidation {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
		
		WebElement phonetextElement = driver.findElement(By.xpath("//label[text()='Phone No']"));
		System.out.println(phonetextElement.getText());
		
		String phoneText="Phone No";
		
		if (phoneText.equals(phonetextElement.getText())) {
			
			System.out.println("Phone Number text is correct\n");
			
		} else {
			System.out.println("Phone Number text is incorrect\n");

		}
		
//Char length
		
		WebElement phonenumbercharElement = driver.findElement(By.cssSelector("input#phno"));
		
		phonenumbercharElement.sendKeys("1234567890123");
		
		String phoneLength=phonenumbercharElement.getAttribute("value");
		
		int size=phoneLength.length();
		System.out.println("Phone char length is: "+size);
		
		if (size==10) {
			
			System.out.println("Max char length is working");
			
		} else {
			System.out.println("No limit is set\n");

		}
			
			
		
		
//Validation
		
	//WebElement phonenumberElement = driver.findElement(By.id("phno"));
	//phonenumberElement.sendKeys("+91 9685742325");
	
	String [] phoneNumber= {
			
		//US Format
			"1234567890",  
			"123-456-7890",  
			"123-456-7890 x1234",  
			"123-456-7890 ext1234",  
			"(123)-456-7890",  
			"123.456.7890",  
			"123 456 7890",  
		//Indian Mobile Number Formats
			"9123124123",  
			"09123124123",  
			"+919123124123",  
			"+91-9123124123",  
			"+91 9222222222",  
			"+7666 999 999",
			"9925410255","787811458777","00000+000","+917875112345","789 123 7894",
		//Invalid
			"Test459821",
			"21/21/56/78/89",
			"test"
	};
	

	
for (String phoneNo : phoneNumber) {
	
	phonenumbercharElement.clear();
	
	phonenumbercharElement.sendKeys(phoneNo);
}		

String regex=("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" 
	    + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" 
	    + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$");
/*
	Pattern pattern = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" 
    + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" 
    + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$");
	*/

Pattern pattern = Pattern.compile(regex);
	
	
for(String phone : phoneNumber)

{  	
    Matcher mp = pattern.matcher(phone);  
    
    System.out.println(phone +" : "+ mp.matches()+"\n");  
}  


		driver.close();	
		
	}

}
