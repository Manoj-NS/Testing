package actionclasslearning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickFunction {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	//Mouse over any tab	
		WebElement freshElement = driver.findElement(By.xpath("//a[text()='Fresh']"));
		
		Actions builder = new Actions(driver);
		
	//	builder.moveToElement(freshElement).contextClick().perform();
		
	//	builder.contextClick(freshElement).perform(); // To perform a Right Click.
		
		builder.contextClick(freshElement)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
// Double Click
		
		builder.doubleClick(freshElement).perform();
	}
}
