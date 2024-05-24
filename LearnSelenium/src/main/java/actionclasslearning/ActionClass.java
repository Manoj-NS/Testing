package actionclasslearning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/mantra");
		
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	//Mouse over any tab	
		WebElement menElement = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(menElement).perform(); // perform() at end of all Actions Class is Mandatory. 
	}
}
