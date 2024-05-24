package roughlearningselenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxValidation {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form"); 
		
//Check box Name Validation		
		
		WebElement checkboxElement1 = driver.findElement(By.xpath("(//label[@class='form-check-label'])[3]"));
		checkboxElement1.getText();
		
		WebElement checkboxElement2 = driver.findElement(By.xpath("(//label[@class='form-check-label'])[4]"));
		checkboxElement2.getText();
		
						
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[contains(@class,'col-3 col-lg-6')]"));
		
		for (WebElement boxes : checkboxes) 
		{
			
		System.out.println("Checkbox name by webelement: \n"+boxes.getText());
		
		//String cb01="Communication address same as permanent";
		//String cb02="Join Immediately";
		
		Assert.assertEquals(checkboxElement1.getText(),"Communication address same as permanent");
		System.out.println("Checkbox01 Text verified"); 
		
		Assert.assertEquals(checkboxElement2.getText(),"Join Immediately");
		System.out.println("Checkbox02 Text verified\n");
			
		}
		
/*		
		String [] checkBox= {"Communication address same as permanent","Join Immediately"};
		
		System.out.println("\nCheckbox name by string:\n");
		
		
		for (String cb2 : checkBox) {
			
			System.out.println(cb2);
			
			if (cb1==cb2)
				
			}
			
		}
		}
	*/	
		/*				
			
		if (cb1.equals(cb2)) {
				
				System.out.println("Checkboxe name is correct\n");
				
				} else {
				
				System.out.println("Checkboxe name is not correct\n");
				}
		}
		}	
		*/

//Checking the check box status
		
//isSelected
		checkboxElement1.click();
		//checkboxElement2.click();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		 
		 
	
		boolean select1=checkboxElement1.isSelected();
		//boolean select2=checkboxElement2.isSelected();
	
		
				
		if (select1==false) 
		{
			checkboxElement1.click();
			System.out.println("Checkbox01 selected");
			
		} 
		else 
		{
			System.out.println("Checkbox01 not selected");
		}
		
/*		
//isDisplayed			
		boolean select2=checkboxElement2.isDisplayed();
		
		if (select2==true) {
			
			checkboxElement2.click();
			System.out.println("Checkbox02 selected");
		} else {
			
			System.out.println("Checkbox02 not displayed");

		}
		
//isEnabled
		
		boolean select3=checkboxElement2.isEnabled();
		
		if (select3==true) {
			checkboxElement2.click();
			System.out.println("Checkbox02 is enabled");
			
		} else {
			
			System.out.println("Checkbox02 not enabled");

		}
		
		
*/		
			
	
	}

}
