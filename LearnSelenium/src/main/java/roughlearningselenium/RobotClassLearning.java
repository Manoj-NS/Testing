package roughlearningselenium;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassLearning {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver ();
		
	//	WebDriverManager.chromedriver().setup();
	//	ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,150)");
		
		
		WebElement fileuploadbuttonElement = driver.findElement(By.xpath("//label[@for='qualification']")); 
		fileuploadbuttonElement.click();
		//fileuploadbuttonElement.sendKeys("C:\\Users\\Manojns\\Pictures\\Saved Pictures\\Test-5.jpg");
	//	fileuploadbuttonElement.click();

//TO find the X and Y axis of the element:
/*		
				org.openqa.selenium.Point point =fileuploadbuttonElement.getLocation();
				int xcord = point.getX();
				System.out.println("Position of the webelement from left side is "+xcord +" pixels");
				
				int ycord = point.getY();
				System.out.println("Position of the webelement from top side is "+xcord +" pixels");
*/
		
	
		Robot robot = new Robot();
	/*	
		robot.mouseMove(243,243);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
	*/	
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
//To close the popup window		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		StringSelection fileupload = new StringSelection ("I:\\manoj\\Manoj\\File Format\\Test-5.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileupload, null);
			
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement savebuttonElement = driver.findElement(By.tagName("button"));
		savebuttonElement.click();
	}

}
