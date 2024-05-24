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

public class DragAndDropBy {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		/*
		 * driver.get("https://jqueryui.com/draggable/");
		 * 
		 * driver.switchTo().frame(0);
		 * 
		 * Robot robot = new Robot();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 * //Mouse over any tab WebElement dragdropElement =
		 * driver.findElement(By.id("draggable"));
		 * 
		 * Actions builder = new Actions(driver);
		 * 
		 * builder.dragAndDropBy(dragdropElement, 100, 150).perform();
		 * 
		 */

		/*
		 * driver.get("https://jqueryui.com/sortable/");
		 * 
		 * driver.switchTo().frame(0);
		 * 
		 * Robot robot = new Robot();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * WebElement item1Element =
		 * driver.findElement(By.xpath("//li[text()='Item 1']")); WebElement
		 * itemt4Element = driver.findElement(By.xpath("//li[text()='Item 4']"));
		 * 
		 * // itemt4Element.getLocation(); //ctr+2+L
		 * 
		 * Point location = itemt4Element.getLocation();
		 * 
		 * 
		 * location.getX();//ctr+2+L location.getY();//ctr+2+L
		 * 
		 * 
		 * int x = location.getX(); int y = location.getY();
		 * 
		 * Actions builder = new Actions(driver);
		 * 
		 * builder.dragAndDropBy(item1Element, x, y).perform();
		 * 
		 * System.out.println("Item 1 moved to Item 4");
		 */
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);

		Robot robot = new Robot();
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
		WebElement sourceitemElement = driver.findElement(By.id("draggable"));
		WebElement targetitemtElement = driver.findElement(By.id("droppable"));
	
		Actions builder = new Actions(driver);
			
		  builder.dragAndDrop(sourceitemElement, targetitemtElement).perform();
		  
		  System.out.println("Item 1 dragged and dropped");

	}
}
