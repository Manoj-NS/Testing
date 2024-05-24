package learnselenium.day1;

import java.time.Duration;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertLearning2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
				
		driver.get("https://app4.sparinc.com/spartoolsus?_ga=2.158329274.1040077832.1655564889-117463900.1645817069");
		
		WebElement usernameElement = driver.findElement(By.id("Input_Username"));
		usernameElement.sendKeys("vgovindan");
		
		WebElement passwordElement = driver.findElement(By.id("Input_Password"));
		passwordElement.sendKeys("sparVK*1");
		
		WebElement loginbuttonElement = driver.findElement(By.xpath("//input[@type='submit']"));
		loginbuttonElement.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement headernameElement = driver.findElement(By.xpath("//h3[contains(@class,'card-header card-bg')]"));
		headernameElement.getText();
		
		System.out.println("Header Name is: "+headernameElement.getText());
		
		//driver.navigate().to("https://app4.sparinc.com/spartoolsus/Menu");
		
		String ActualTitle= headernameElement.getText();
		String ExpextedTitle="Application List";
		
		//Assert.assertEquals(ActualTitle,ExpextedTitle,"Page title matched expected value"+ExpextedTitle);
		
		Assert.assertEquals(ExpextedTitle, ActualTitle);
		
			
		
	}

}
