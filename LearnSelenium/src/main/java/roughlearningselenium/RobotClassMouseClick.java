package roughlearningselenium;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassMouseClick {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
			
		driver.get("http://192.168.55.181:4300/form");
		
		Thread.sleep(4000);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	//TO Scroll the page
		
		robot.mouseWheel(2);
		
		WebElement scrollElement = driver.findElement(By.id("address"));
		scrollElement.sendKeys("1",Keys.ENTER,"2",Keys.ENTER,"3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21","22",Keys.ENTER,"23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41");
		
		Thread.sleep(2000);
	
		robot.mouseWheel(-1);
		
	/*	
		Dimension i = driver.manage().window().getSize();
		System.out.println("Dimention for x: "+i.getWidth()+" and y: "+i.getHeight());
	*/	
		
		Thread.sleep(2000);
		

		WebElement buttonselectElement = driver.findElement(By.id("l_name")); 
		
		Point point = buttonselectElement.getLocation();
		int xcord=point.getX();
		System.out.println("Position of the webelement from left side is "+xcord +" pixels");
		
		int ycord=point.getY();
		System.out.println("Position of the webelement from top side is "+ycord +" pixels");
		
		
		robot.mouseMove(680, 229);
		

		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		

		
		
	/*	
	
	System.out.println("------------------iFrame Scroll Inside the Text Box----------------");	
		driver.get("https://jqueryui.com/accordion/#fillspace");
		
		List<WebElement> iframelist = driver.findElements(By.tagName("iframe"));
		System.out.println("Total iFrame in page: "+iframelist.size());
		
		driver.switchTo().frame(0);
		
//Scroll inside the text box
		
		Robot robot2 = new Robot();
		
		Thread.sleep(4000);
		
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mousescrollElement = driver.findElement(By.id("ui-id-3"));
		mousescrollElement.click();
		
		Thread.sleep(2000);
		
		WebElement textclickElement = driver.findElement(By.cssSelector("div#ui-id-4>p"));
		textclickElement.click();
		
		robot2.mouseWheel(3);
		
	*/	
		
	}

}
