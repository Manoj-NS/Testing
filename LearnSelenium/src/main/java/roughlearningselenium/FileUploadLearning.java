package roughlearningselenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadLearning {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
		
		Thread.sleep(3000); 
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,380)");
		
		
		WebElement fileuploadElement = driver.findElement(By.id("imgFile"));
		
		js.executeScript("arguments[0].scrollIntoView();",fileuploadElement);
		
		fileuploadElement.sendKeys("C:\\Users\\Manojns\\Pictures\\Saved Pictures\\Test-5.jpg");
		
		String uploadedfile= "Test-5.jpg";
		
		if (uploadedfile.equals(fileuploadElement.getAttribute("value"))) {
			
			System.out.println("File uploaded successfully"); 
			
						
		} else {
			
			System.out.println("File not uploaded"); 

		}
	
		
			
		System.out.println(fileuploadElement.getAttribute("value"));
				
		
	}

}
