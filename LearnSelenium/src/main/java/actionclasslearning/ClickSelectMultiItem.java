package actionclasslearning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickSelectMultiItem {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/selectable/");
		 
		  driver.switchTo().frame(0);
		  
		  Robot robot = new Robot();
		  
		  Thread.sleep(2000);
		  
		  robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		  
		  WebElement item1Element = driver.findElement(By.xpath("//li[text()='Item 1']")); 
		  WebElement itemt4Element = driver.findElement(By.xpath("//li[text()='Item 4']"));
		  
		  Actions builder = new Actions(driver);
		  
		  builder.clickAndHold(item1Element)
		  .moveToElement(itemt4Element)
		  .release()
		  .perform();
		  
		  System.out.println("Item 1 to Item 4 are selected");
		 

	}

}
