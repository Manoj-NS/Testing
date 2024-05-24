package actionclasslearning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndSelectAlternateItem {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notification");
		EdgeDriver driver = new EdgeDriver(options);

		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/selectable/");
		 
		 driver.switchTo().frame(0);
		 
		 Thread.sleep(2000);
		  
		  JavascriptExecutor js =  (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,350);");
		  
			/*
			 * Robot robot = new Robot();
			 * 
			 * Thread.sleep(2000); robot.keyPress(KeyEvent.VK_ENTER);
			 * robot.keyRelease(KeyEvent.VK_ENTER);
			 */
		  
		  WebElement item1Element = driver.findElement(By.xpath("//li[text()='Item 1']")); 
		  WebElement item3Element = driver.findElement(By.xpath("//li[text()='Item 3']"));
		  WebElement item5Element = driver.findElement(By.xpath("//li[text()='Item 5']")); 
		  WebElement item7Element = driver.findElement(By.xpath("//li[text()='Item 7']"));
	
		  Actions builder = new Actions(driver);
		  
		  builder
		  .keyDown(Keys.CONTROL).click(item1Element).click(item3Element).click(item5Element).keyUp(Keys.CONTROL).perform();
		  
		  System.out.println("Item 1, Item 3, Item 5 are selected");
		 

	}

}
