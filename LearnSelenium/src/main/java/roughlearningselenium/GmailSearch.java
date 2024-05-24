package roughlearningselenium;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailSearch {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		
		
	
	//searchElement.sendKeys(args)
		
		String [] searchData= {"TV","Bike","Car"};
		
		for (String searchData2 : searchData) {
		
		System.out.println("Searched Data: "+searchData2);
			driver.get("https://www.google.com/");
			WebElement searchElement = driver.findElement(By.id("APjFqb"));
			searchElement.sendKeys(searchData2,Keys.ENTER);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
	//		searchElement.clear();

		
		
		
			
		}
		
		
		
	}

}
