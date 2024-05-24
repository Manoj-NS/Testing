package learnselenium.day1;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaCodeLearning {
	
	public static void main(String[] args) {
		/*
		
		String [] color3 = new String [7];
		
		color3 [0]="Red";
		color3 [1]="Green";
		color3 [2]="Blue";
		color3 [3]="Black";
		color3 [4]="White";
		color3 [5]="Pink";
		color3 [6]="Yellow";
		
	//	System.out.println("Element for color3");
		//for (int i = 0; i < color3.length; i++) {
			
		//	System.out.println(color3[i]);
		//}
		
		String [] color4=new String [5];
		
		color4 [0]="Yellow";
		color4 [1]="Gray";
		color4 [2]="Vilot";
		color4 [3]="Red";
		color4 [4]="Black";
		
		//System.out.println("Element for color4");
		//for (int i = 0; i < color4.length; i++) {
			
			//System.out.println(color4[i]);
		//}
		
		
	List<String> matchedValues =new ArrayList<String>();
		
        // Compare the arrays and find matched values
        for (String expectedValue : color3) {
        	//System.out.println(expectedValue);
        	
            for (String actualValue : color4) {
            	//System.out.println(actualValue);
            	
                if (expectedValue.contentEquals(actualValue)) {
                
                	                	
                }
                    matchedValues.add(expectedValue);
                    break; // Break to avoid duplicates
                    
                   
                }
		
      }
        
        System.out.println("Equal values between the two lists: " + matchedValues);
    */   

//Compared 2 string array
	
	
	
	String [] color = new String [7];
	
	color [0]="Red";
	color [1]="Green";
	color [2]="Blue";
	color [3]="Black";
	color [4]="White";
	color [5]="Pink";
	color [6]="Red";
	
	for (int i = 0; i < color.length; i++) {
		String c1=color[i];
		
		System.out.println(c1);
	}
	
	
	
	System.out.println("\n");
	
	String [] color2=new String [5];
	
	color2 [0]="Yellow";
	color2 [1]="Gray";
	color2 [2]="Vilot";
	color2 [3]="Red";
	color2 [4]="Black";
	
	for (int j = 0; j < color2.length; j++) {
		String c2=color2[j];
		System.out.println(c2);
		
				}
	
	for (String c1 : color) {
		for (String c2 : color2) {
		
		
			
			if (c1.contentEquals(c2)) {
				
				System.out.println("True");
				
			} 
			else 
			{
				System.out.println("False");

			
			
			}
		
	}
		break;
	}
	
	/*
	boolean compareColor = Arrays.equals(color, color2);
	
	if (compareColor) {
		
		System.out.println("color and color2 are equal ");
		
	} else {
		
		System.out.println(	compareColor);

	}
	
	*/

		
			

		
		
//Java Code for string array and else		
		
	/*	
		String [] color = new String [7];
		
		color [0]="Red";
		color [1]="Green";
		color [2]="Blue";
		color [3]="Black";
		color [4]="White";
		color [5]="Pink";
		color [6]="Red";
		
		System.out.println("\nFor Loop Type: 1");
		
		for (int i = 0; i < color.length; i++) {
			
			System.out.println(color[i]);
			
		}
		
		System.out.println("\nFor Loop Type: 2");
		
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			
		System.out.println(string);
			
		}		
		
		System.out.println("\nFor Loop Type: 3");
		
	for (String string : color) {
		
	//		System.out.println(string);
		 
				
	//	System.out.println("\n If condition: 01");
			
		
		
			String newColor="Green";
		
		if (string.equals(newColor)) {
			
			System.out.println("True");
			
		} else {
			System.out.println("False");

		}
		}
	
		
		
		
		System.out.println("\n If condition: 02");
			if (color != null) 
				
			 {
				
				System.out.println("Color found");
			}
				else
				{
					System.out.println("No Color found");
				}
			
				
			
	*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchboxElement = driver.findElement(By.id("twotabsearchtextbox"));
		searchboxElement.sendKeys("Bicycle",Keys.ENTER);
		

		System.out.println("1 :"+driver.getCurrentUrl());
		
	//	        WebElement brandElement = driver.findElement(By.cssSelector("div#brandsRefinements>ul>span:nth-of-type(4)>li>span>a>span"));
	//	        brandElement.click();
		
	//	driver.navigate().to(driver.getCurrentUrl());
		
	
			
	
		WebElement[] checkboxes = new WebElement[6];
		
    //    checkboxes[0] = driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]/following-sibling::span)[3]"));
    //    checkboxes[1] = driver.findElement(By.cssSelector("div#brandsRefinements>ul>span:nth-of-type(5)>li>span>a>div>label>i"));
    //    checkboxes[2] = driver.findElement(By.cssSelector("div#brandsRefinements>ul>span:nth-of-type(4)>li>span>a>span"));
        checkboxes[3] = driver.findElement(By.cssSelector("div#brandsRefinements>ul>span:nth-of-type(2)>li>span>a>span"));
        checkboxes[4] = driver.findElement(By.cssSelector("div#brandsRefinements>ul>span:nth-of-type(6)>li>span>a>span"));
        checkboxes[5] = driver.findElement(By.cssSelector("div#brandsRefinements>ul>span:nth-of-type(3)>li>span>a>span"));
        
        
        System.out.println(checkboxes[3].getText());
        
        
        
    
        
   //     driver.navigate().to(driver.getCurrentUrl());

   //     WebElement brandElement = driver.findElement(By.cssSelector("div#brandsRefinements>ul>span:nth-of-type(4)>li>span>a>span"));
   //     brandElement.click();
        
   //     System.out.println("02 "+driver.getCurrentUrl());
        
        driver.navigate().to(driver.getCurrentUrl());
        

        for (WebElement checkbox : checkboxes) {
        	
        	if (checkbox.isSelected()) 
        	{
				
        		System.out.println("Checkbox is selected.");
        		
            } 
        	else 
            {
                System.out.println("Checkbox is not selected.");
            }
        	
        			
		}
       
    */
		
	}	
	
}
	


