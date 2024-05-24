package roughlearningselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuruLogin {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.get("https://www.demo.guru99.com/v4/");
		
		WebElement usernameElement = driver.findElement(By.xpath("//input[@name='uid']"));
		usernameElement.sendKeys("mngr539661");
		
		WebElement passwordElement = driver.findElement(By.xpath("//input[@name='password']"));
		passwordElement.sendKeys("EqArUgE");
		
		WebElement loginbuttonElement = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		loginbuttonElement.click();
		
		WebElement newcustomerElement = driver.findElement(By.linkText("New Customer"));
		newcustomerElement.click();
		
		WebElement customernameElement = driver.findElement(By.xpath("//input[@name='name']"));
		customernameElement.sendKeys("Raja",Keys.TAB);
		
		WebElement genderfemaleElement = driver.findElement(By.xpath("//input[@value='m']"));
		genderfemaleElement.click();
		
		WebElement dobtextboxElement = driver.findElement(By.id("dob"));
		dobtextboxElement.sendKeys("05/26/1985",Keys.TAB);
				
		
		WebElement addressElement = driver.findElement(By.xpath("//textarea[@name='addr']"));
		addressElement.sendKeys("New No 86 Old No 69 Kumaran Street",Keys.TAB);
		
		robot.mouseWheel(5);
	
		WebElement cityElement = driver.findElement(By.xpath("//input[@name='city']"));
		cityElement.sendKeys("Chennai",Keys.TAB);

		WebElement stateElement = driver.findElement(By.xpath("//input[@name='state']"));
		stateElement.sendKeys("Tamilnadu",Keys.TAB);
		

		WebElement pinElement = driver.findElement(By.xpath("//input[@name='pinno']"));
		pinElement.sendKeys("6001234",Keys.TAB);
		

		WebElement phoneElement = driver.findElement(By.xpath("//input[@name='telephoneno']"));
		phoneElement.sendKeys("9004563210",Keys.TAB);
		

		WebElement emailaddressElement = driver.findElement(By.xpath("//input[@name='emailid']"));
		emailaddressElement.sendKeys("test6@example.com",Keys.TAB);
		

		WebElement newpasswordElement = driver.findElement(By.xpath("//input[@name='password']"));
		newpasswordElement.sendKeys("Test@06",Keys.TAB);
		
		WebElement submitbuttonElement = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitbuttonElement.click();
		
		System.out.println("Customer Registered Successfully!!!");
	}

}
