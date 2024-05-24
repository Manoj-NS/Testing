package roughlearningselenium;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotUsingRobotClass {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
		
		Robot robot = new Robot();
		
		Thread.sleep(4000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);  
		
		Thread.sleep(6000);
		
		java.awt.Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
				
		BufferedImage img = robot.createScreenCapture(new Rectangle(size));
		
		
				 
		File path = new File("I:\\manoj\\Selenium\\Doc\\Test04.jpg");
				 
		ImageIO.write(img, "JPG", path);
		
		
	}

}
