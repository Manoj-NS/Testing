package roughlearningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BooleanLearning {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();	
		
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/");
		
		WebElement usernameElement = driver.findElement(By.id("username"));
		  usernameElement.sendKeys("DemoCSR");
		  
		  WebElement passwordElement = driver.findElement(By.id("password"));
		  passwordElement.sendKeys("crmsfa");
		  
		  WebElement loginbuttonElement =driver.findElement(By.className("decorativeSubmit"));
		  loginbuttonElement.click();
		
		WebElement userName = driver.findElement(By.cssSelector("label[for='username']"));
		
		boolean user=userName.isDisplayed();
		System.out.println(user);
		
		String user2=userName.getText();
		System.out.println(user2);
		
		

	}

}
