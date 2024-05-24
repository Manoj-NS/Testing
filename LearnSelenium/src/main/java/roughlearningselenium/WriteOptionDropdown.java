package roughlearningselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteOptionDropdown {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(4000);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		robot.mouseWheel(7);
		
		Thread.sleep(1000);
		
	//	WebElement ddltextboxElement = driver.findElement(By.xpath("(//*[name()='svg'][@class='css-19bqh2r'])[3]"));
		
		WebElement ddltextboxElement = driver.findElement(By.cssSelector("[id='selectMenuContainer'] div[class='row'] div[class=' css-1wa3eu0-placeholder']"));
		ddltextboxElement.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.display='block';", ddltextboxElement);
		
		List<WebElement> listnames = driver.findElements(By.xpath("//div[contains(@id,'react-select-4-option')]"));
		
		for (WebElement names : listnames) {
			
			String ddlnames=names.getText();
			System.out.println(ddlnames);

			}
/*		
		
//Select by ddl select		
		
		WebElement selectgreenElement = driver.findElement(By.cssSelector("#react-select-4-option-0"));
		selectgreenElement.click();
		
		Thread.sleep(2000);
		
//		System.out.println(selectgreenElement.getAttribute("value"));
		
		Thread.sleep(2000);
		
		WebElement selectblueElement = driver.findElement(By.cssSelector("#react-select-4-option-1"));
		selectblueElement.click();

		Thread.sleep(2000);
		
	//	selectblueElement.isDisplayed();
		
		
Thread.sleep(2000);
		
		WebElement selectredElement = driver.findElement(By.cssSelector("#react-select-4-option-3"));
		selectredElement.click();

		Thread.sleep(2000);
*/		
		//select by entering text
		
		WebElement entertextElement = driver.findElement(By.xpath(".//input[@id='react-select-4-input']"));

		entertextElement.sendKeys("gree",Keys.ENTER,"b",Keys.ENTER,"r",Keys.ENTER);
		Thread.sleep(2000);
		
		System.out.println(entertextElement.isDisplayed());
		
		System.out.println(entertextElement.getText());
	
		
		
	}

}
