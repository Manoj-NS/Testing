package roughlearningselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoitToolLearning {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
		
		Thread.sleep(4000);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.mouseWheel(4);
	
		//driver.findElement(By.xpath("//label[text()='Upload File']/following::input")).click();
		
		driver.findElement(By.xpath("//label[@for='qualification']")).click();
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("I:\\manoj\\Selenium\\Doc\\AutoIT\\AutitSampleFile.exe");
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.tagName("button")).click();
		
		
		
		
	}

}
