package roughlearningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeapYearValidation {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
		
		
		for(int year = 1900; year <= 2023; year++)
			
			{
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
			driver.findElement(By.id("dob")).clear();	
				
			driver.findElement(By.id("dob")).sendKeys("29/02/2023");
			}
			}
		
		
	}

}
