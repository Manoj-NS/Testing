package learnselenium.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup(); 
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://leafground.com/waits.xhtml");
		
		/*
		 * Robot robot = new Robot();
		 * 
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 */
				
		WebElement click2Element = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
		click2Element.click();
		
		WebElement disappearElement = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		
		//Step01: Create object for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Step02: Apply Expected Condition to wait
		wait.until(ExpectedConditions.invisibilityOf(disappearElement));

		//To click the visible button
		
		WebElement click1Element = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		click1Element.click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));
		
		String invisibletext = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println("Invisible button text: "+invisibletext); 
		
		//After click button name changed
		
		WebElement click3Element = driver.findElement(By.xpath("(//span[text()='Click'])[3]"));
		click3Element.click();
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//span[contains(text(),'I am going to change!')]"), "Did you notice?"));
		
		
		 
		
	
	}

}
