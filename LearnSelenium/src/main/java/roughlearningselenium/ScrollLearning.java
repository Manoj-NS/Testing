package roughlearningselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollLearning {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup(); 
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/accordion/#fillspace"); 
		
		List<WebElement> iframeSize=driver.findElements(By.tagName("iframe"));
		System.out.println("Number of iframes on the page are: "+iframeSize.size());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//To scroll the page		
		js.executeScript("window.scrollBy(0, 250);");
		
		driver.switchTo().frame(0);
				
		//	WebElement iframeElement = driver.findElement(By.className("\"demo-frame\""));
		//	driver.switchTo().frame(iframeElement);		
		
		WebElement section2Element = driver.findElement(By.id("ui-id-3"));
		section2Element.click();
		
		WebElement section2dataElement = driver.findElement(By.id("ui-id-4"));
	
//To scroll inside the section
		js.executeScript("arguments[0].scrollBy(0, 50);",section2dataElement);
		//js.executeScript("arguments[0].scrollIntoView", section2dataElement);
		
		System.out.println("List box Scroll is working");
		
	//	scrollintoview 
		
// Expand and Close icon check:
		
		
		
		
		
		
		//WebElement section2textElement = driver.findElement(By.xpath("(//div[contains(@class,'ui-accordion-content ui-corner-bottom')])[2]"));
		// Use the Actions class to move to the element	
		//Actions actionsection2=new Actions(driver);
		//actionsection2.moveToElement(section2textElement).perform();
		//js.executeScript("argument[0].scrollIntroView(true);", section2textElement);
		//(JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", section2textElement);
		//js.executeScript("window.scrollBy(0,250)");
		// Scroll up by 500 pixels
		//js.executeScript("window.scrollBy(0, -500);");



	}

}
