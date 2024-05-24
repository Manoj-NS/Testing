package roughlearningselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxLearning {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
		
		
		
		Robot robot = new Robot();
		
		Thread.sleep(4000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		robot.mouseWheel(6);
		
	
	
		WebElement listboxclickElement = driver.findElement(By.xpath("//label[@for='applied_for']"));
		listboxclickElement.click();
	/*	
		WebElement selectnameElement = driver.findElement(By.xpath("/html/body/app-root/app-form/div[2]/div/div/div[2]/form/div[5]/div[2]/div/div[2]"));
		System.out.println("Available checkbox names: \n"+selectnameElement.getText()+"\n");
		
		WebElement select1Element = driver.findElement(By.xpath("(//label[@class='form-check-label checkbox-Cust'])[2]"));
		select1Element.click();
		System.out.println("Selected Checkbox :"+select1Element.getText());
	*/	
		List<WebElement> listnames = driver.findElements(By.xpath("//input[@type='checkbox' and contains (@class,'form-check-input text-right')]"));
		System.out.println("Total check boxes are: "+listnames.size());
		
		for (WebElement allnames : listnames) {
			System.out.println(allnames.getAttribute("id"));
		}
/*	
// To select all checkboxes
		
	//for loop
		
		for (int i = 0; i < listnames.size(); i++) {
			
			listnames.get(i).click();
			
		}
		
		
	//foreach loop	
		
		for (WebElement selectall:listnames)
		{
			selectall.click();
			
		}
		*/
		/*
	// To select the random multiple check box
		// id=backend_dev and full_stack_dev
		
		
		
		for (WebElement randomselect : listnames)
		{
			String selectcheckbox =randomselect.getAttribute("id");
			
			if (selectcheckbox.equals("backend_dev") || selectcheckbox.equals("full_stack_dev")|| selectcheckbox.equals("auto_testing"))
			
				
			{
				randomselect.click();
			}
	
		}*/
		
	//How to select the last 2 or 3 element of the checkboxes
	/*	
		* Total Element = 6
		* Checkbox need to be selected=3
		*To select the checkbox: 6-2=4
		* So the clicking will be start from 4th element
		* 
	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
*/
		int selectedcheckboxes=listnames.size();
/*		
		for (int i=selectedcheckboxes-3; i<selectedcheckboxes;i++)
		{
			listnames.get(i).click();
		}
		
	*/
		
//How to select first 2 checkboxes
		
		for (int i=0; i<selectedcheckboxes; i++)
		{	
			if (i<3) 

		{
			listnames.get(i).click();
		}
			
	}
		

		
	}

}
