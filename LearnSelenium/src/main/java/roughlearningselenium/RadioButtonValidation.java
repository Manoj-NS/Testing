package roughlearningselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonValidation {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.55.181:4300/form");
		
			    
        WebElement gendermaleElement = driver.findElement(By.id("male"));
		//gendermaleElement.click();
		
		WebElement genderfemaleElement = driver.findElement(By.id("female"));
		genderfemaleElement.click();
		
		
		boolean genders=true;
		genders=gendermaleElement.isSelected();
		genders=genderfemaleElement.isSelected();
		
		if (genders==true) {
			
			System.out.println("Gender is selected");
			
		} else {
			
			System.out.println("Non-selected");

		}
		
		//String genderMale=gendermaleElement.getAttribute("checked");
		//System.out.println("Gender: Male is selected");
		
		
		/*
		
		
		String genderFemale=genderfemaleElement.getAttribute("checked");
		System.out.println("Gender: Female is selected");
		
	*/
		
	/*	
		WebElement gendermaleElement = driver.findElement(By.id("male"));
		gendermaleElement.click();
		
		String genderMale="Male is selected";
		String genderFemale="Female is selected";
		
		System.out.println(genderMale);
		System.out.println(gendermaleElement.getAttribute("checked"));
		
	*/	
       
	}
}
