package roughlearningselenium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppliedForDropDown {
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
/*		
		WebElement ddlElement = driver.findElement(By.id("applied_for"));
		
//DDL Text Validation		
		WebElement ddltextElement = driver.findElement(By.xpath("//label[text()='Applied For']"));
		ddltextElement.getText();
		
		String ddlText="Applied For";
		
		if (ddlText.equals(ddltextElement.getText())) {
			System.out.println(ddlText+": DDL text is correct\n");
			
		} else {
			System.out.println(ddlText+": DDL text is not correct\n");

		}
		
		
// Verify the drop down is enabled and visible. 
		
		

		if (ddlElement.isEnabled() && ddlElement.isDisplayed()) {
			
			System.out.println("Dropdown is enabled and displayed\n");
			
		} else {
			
			System.out.println("Dropdown is not enabled and displayed\n");

		}
		
// Verify that drop down does not allow the multiple selections. 
	
		Select selectddl=new Select(ddlElement);
		
		if (selectddl.isMultiple()) {
			
			System.out.println("Dropdown list accepts multiple choices\n");
			
		} else {
			System.out.println("Dropdown list does not accept multiple choices\n");

		}		
		
//To get the list size of the drop down
		
		List<WebElement> sourcelistNames= selectddl.getOptions();
		List<String> expectedlistNames=Arrays.asList ("Developer","Testing","DB","test");
		
		//System.out.println(expectedlistNames);

		for (WebElement ln : sourcelistNames) {
			System.out.println(ln.getText());
		}

		if (sourcelistNames.size() == expectedlistNames.size())
			
		{
			System.out.println("\nDDL size is equal\n");
		}
		else 
		{
			System.out.println("\nDDL size is not equal\n");
		}
			/*
		    for (int i = 0; i < sourcelistNames.size(); i++) 
		    	//System.out.println("Dropdown option mismatch at index " + i);
		    {
		       if (!sourcelistNames.get(i).getText().equals(expectedlistNames.get(i))) 
		       {
		            System.out.println("Dropdown option matches " );
		            break;
		        }
		    }
		} 
		else 
		{
		    System.out.println("Dropdown option count does not match expected options count.");
		}
	*/	
	/*	
 //	DDL options Names	
		List<WebElement> sourceddl=driver.findElements(By.id("applied_for"));
		for (WebElement listNames : sourceddl) 
		{
		System.out.println("Source DDL Names:\n"+listNames.getText()+"\n");		
			
		}
	
//	DDL list count			
		int listsize=selectddl.getOptions().size();
		System.out.println("Dropdown list size: "+listsize+"\n");
		
//Selected the option from the ddl
		
		selectddl.selectByVisibleText("Testing");
		selectddl.selectByIndex(2);
		selectddl.selectByValue("testing");
		
		String selectedText=selectddl.getFirstSelectedOption().getText();
				System.out.println("Option choosen as: "+selectedText);
*/				
System.out.println("------------------------------------------------------------");		  

//DDL Qualification

WebElement ddltext2Element = driver.findElement(By.xpath("//label[text()='Qualification']"));
ddltext2Element.getText();

String ddl2="Qualification";

if (ddl2.equals(ddltext2Element.getText())) {
	
	System.out.println(ddl2+" :DDL2 text is correct");
	
} else {
	System.out.println(ddl2+" :DDL2 text is not correct");

}

			if (ddltext2Element.isDisplayed() && ddltext2Element.isEnabled()) {
				
				System.out.println("DDL2 is Displayed and Enabled.");
				
			} 
			
			WebElement ddl2selectElement = driver.findElement(By.id("qualification"));
		
			Select selectddl2=new Select(ddl2selectElement);
			
			if (selectddl2.isMultiple()) {
			
				System.out.println("Dropdown list02: Accepts multiple choices\n");
			
			} else {
				System.out.println("Dropdown list02: Does not accept multiple choices\n");
			}
			
			int listsize2=selectddl2.getOptions().size();
			System.out.println("Dropdown list02 size: "+listsize2+"\n");
			
			List<WebElement> sourceDDL2=selectddl2.getOptions();
			
			for (WebElement d2 : sourceDDL2) {
				
				System.out.println("SourceDDL2: "+d2.getText());
			}
			
			
			List<String> expectedddl2=Arrays.asList("B.E","B.Tech","B.Sc","M.E","M.Tech","MBA","123");
			System.out.println("\nExpected DDL2: "+expectedddl2);
			
			if (sourceDDL2.size()==expectedddl2.size()) {
				
				System.out.println("\nSource and Expected DDL data matched\n");
				
			} else {
				
				System.out.println("\nSource and Expected DDL data not matched\n");

			}
			
			selectddl2.selectByIndex(3);
			selectddl2.selectByValue("me");
			selectddl2.selectByVisibleText("M.E");
			
			String selectedText2=selectddl2.getFirstSelectedOption().getText();
			System.out.println("Option choosen as: "+selectedText2);
	}
	
}
