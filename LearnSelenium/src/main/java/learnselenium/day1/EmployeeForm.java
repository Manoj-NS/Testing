package learnselenium.day1;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmployeeForm {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
/*		
//Header
		WebElement headernameElement = driver.findElement(By.className("mb-0"));
		//System.out.println(headernameElement.getText());
		
		
	String headerName="Employee Form";
		
		if (headerName.equals(headernameElement.getText())) {
			
			System.out.println(headerName+": Header Name is correct");
			
		} else {
			System.out.println(headerName+": Header Name is In-correct");

		}
		
		WebElement subheaderElement = driver.findElement(By.xpath("//h5[text()='Personal Information']"));
		//System.out.println(subheaderElement.getText());
		
//Sub-Header		
	String subHeader="Personal Information";
		
		if (subHeader.equals(subheaderElement.getText())) {
			System.out.println(subHeader+": Sub-Heder name is correct");
		
		}
		else
		{
			System.out.println(subHeader+": Sub-Heder name is In-correct");
		}
		
		WebElement firstnametextElement = driver.findElement(By.xpath("(//label[@class='form-label'])[1]"));
		//System.out.println(firstnametextElement.getText());
		
//First Name		
	String firstnameText="First Name";
		
		if (firstnameText.equals(firstnametextElement.getText())) {
			System.out.println(firstnameText+ ": Text is correct");
			
		} else {
			System.out.println(firstnameText+ ": Text is In-correct");

		}
		
		WebElement firstNameElement = driver.findElement(By.id("f_name"));
	
		String [] firstName= {
				"Manoj.NS",
				"Manoj@NS",
				"Manj123",
				"MANOJ",
				"ManoJ@236",
				"Manoj"
				
		};
		
		for (String stringfirstName : firstName) {
			
			firstNameElement.sendKeys(stringfirstName);
			firstNameElement.clear();
			
			//System.out.println("Entered First Name is: "+stringfirstName);	
			
						

	/*				
		}
	
		
		String regex="^[a-zA-Z.-]+$";
		Pattern pattern=Pattern.compile(regex);
		
		for (String nameValidation : firstName) 
		{
		
		
		Matcher matcher = pattern.matcher(nameValidation);
		System.out.println(nameValidation+": " +matcher.matches());
		
		}
*/
		
//Last Name	
		
		/*
		WebElement lastnametextElement = driver.findElement(By.xpath("(//label[@class='form-label'])[2]"));
		System.out.println(lastnametextElement.getText()+ ": Text is correct");
		
		WebElement lastnameElement = driver.findElement(By.id("l_name"));
		
		String [] lastName = {
				
				"test@123",
				"test",
				"TEST",
				"123",
				"TEST+_",
				"Test"
				
		};
		
		for (String stringlastName : lastName) {
			lastnameElement.sendKeys(stringlastName);
			lastnameElement.clear();
			
			//System.out.println("Entered Last Name is : "+stringlastName);
			
		}
		
		String regex="^[a-zA-Z.-]+$";
		Pattern pattern=Pattern.compile(regex);
		
		for (String lastnameValidation : lastName) 
		{
			Matcher matcher=pattern.matcher(lastnameValidation);
			System.out.println(lastnameValidation+ ": "+matcher.matches());
			
		}
		
		*/
		
//DOB

/*	
	// Max character functionality
		
		WebElement firstNameElement = driver.findElement(By.id("f_name"));
		firstNameElement.sendKeys("123456789012345");
		
		String typedValue=firstNameElement.getAttribute("value");
		
		// Get the length of typed value

		 int size = typedValue.length();

		 if (size == 15) {
		 System.out.println("Max character functionality is working fine.");
			}

			else {
		 System.out.println("No limit is set.");
			}

*/
		
//DOB--Date format Validation
		
	/*	
		WebElement dobtextElement = driver.findElement(By.xpath("(//label[@class='form-label'])[3]"));
		//System.out.println(dobElement.getText());
		
	String dobText="DOB";
		if (dobText.endsWith(dobtextElement.getText())) {
			System.out.println(dobText+": Text is correct");
			
		} else {
			System.out.println(dobText+": Text is In-correct");

		}
		
		WebElement dobElement = driver.findElement(By.id("dob"));
		//dobElement.sendKeys("12242023");
		
		String [] dateValue= {
				
				"test",
				"TEST",
				"T12",
				"1@3",
				"!@#Te",
				"23/23/2023",
				"12/25/2023",
				"10/99/2023",
				"99/25/2023",
				"99/99/9999"
		};
		
		for (String date : dateValue) {
			
			dobElement.sendKeys(date);
			dobElement.clear();

		}
		
		//String regex="^([0-9]{2})/([0-9]{2})/([0-9]{4})$";
		String regex = "^(0?[1-9]|1[012])\\/(0?[1-9]|[12][0-9]|3[01])\\/([0-9]{4})$";

		Pattern pattern=Pattern.compile(regex);
		
		for (String dateValidation : dateValue) {
			
			Matcher matcher=pattern.matcher(dateValidation);
			
			//System.out.println(dateValidation+": "+matcher.matches());
	
			System.out.println(dateValidation);
			if (matcher.matches()) {
				
				System.out.println("Date is valid format");
				
			} else {
				System.out.println("Date is invalid format");

			}	
					
		}
	
	*/

//Gender Text
		
		WebElement gendertextElement = driver.findElement(By.xpath("(//label[@class='form-label'])[4]"));
		System.out.println(gendertextElement.getText()+": Text is correct");
		
		
		
        List<WebElement> radioButtons = driver.findElements(By.xpath("//label[@class='form-label']/following-sibling::div[1]"));
        
        WebElement gendermaleElement = driver.findElement(By.id("male"));
		gendermaleElement.click();
        
        
		
        for (WebElement radioButton : radioButtons) 
        {
        	
        	boolean isSelected = radioButton.isSelected();

            // Get the radio button's label or any other identifying information
            String radioButtonLabel = radioButton.getAttribute("value");

            // Print the result
            if (isSelected) {
                System.out.println("Radio button '" + radioButtonLabel + "' is selected.");
            } else {
                System.out.println("Radio button '" + radioButtonLabel + "' is not selected.");
            }
        
		}
	/*	
		WebElement gendermaleElement = driver.findElement(By.id("male"));
		gendermaleElement.click();
		WebElement genderfemaleElement = driver.findElement(By.id("female"));
		genderfemaleElement.click();
		
		String gendermaleSelect=gendermaleElement.getAttribute("checked");
		String genderfemaleSelect=genderfemaleElement.getAttribute("checked");
		
		
		boolean radioButton=gendermaleElement.isSelected();
		boolean radioButton2=genderfemaleElement.isSelected();
		
		
		if (radioButton==radioButton2) {
			
			System.out.println("Male button is selected");
			
		} 
		
		else
		{
			System.out.println("Female button is selected");
			}
		
		//WebElement genderfemaleElement = driver.findElement(By.id("female"));
		
		
		boolean radioButton2=genderfemaleElement.isSelected();
		
		if (radioButton2) {
			
			System.out.println("Female button is selected");
			
		} else {
			
			System.out.println("Male button is selected");

		}
	
		
		
		//String selectedGender=gendermaleElement.getAttribute();
		//System.out.println(selectedGender);
*/
	
		
	}

}
