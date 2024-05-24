package roughlearningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermanentAddressTextBox {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
		
//Text		
		WebElement parmanentaddresstextElement = driver.findElement(By.xpath("//label[@for='address']"));
		parmanentaddresstextElement.getText();
		
		//System.out.println(parmanentaddresstextElement.getText());
		
		String permanentaddressText="Permanent Address";
		
		if (permanentaddressText.equals(parmanentaddresstextElement.getText())) {
			
			System.out.println("Permanent Address text is correct");
			
		} else {
			System.out.println("Permanent Address text is not correct");
		}
			
//Character Length
			
		WebElement textboxlengthElement = driver.findElement(By.id("address"));
		textboxlengthElement.sendKeys("Test message, please ignore it.123 ~!@#$%^ &*()_+|}{\":?><,./;'\\][= -0987654321`. 1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890 -1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890-1234567890");
		
		String textboxLength = textboxlengthElement.getAttribute("value");
		
		int length = textboxLength.length();
		
		if (length==540) {
			
			System.out.println("Max char length is working");
			
		} else {
			
			System.out.println("Max char length is not working");

		}
		
			

		
		
		
	}

}
