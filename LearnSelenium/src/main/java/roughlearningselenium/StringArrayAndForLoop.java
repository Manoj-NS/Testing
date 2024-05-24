package roughlearningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StringArrayAndForLoop {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement [] headerName= new WebElement [5];
		
		headerName[0]=driver.findElement(By.className("hm-icon-label"));
		headerName[1]=driver.findElement(By.linkText("Amazon miniTV"));
		headerName[2]=driver.findElement(By.linkText("Sell"));
		headerName[3]=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
		headerName[4]=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']"));

		String header1="Sell";
	/*	
		String [] header2= {"Best Sellers","Sell","Mobile","Customer Service"};
		for (int i = 0; i < header2.length; i++) {
			String h2 = header2[i];
			
		}
	*/	
		for (int j = 0; j < headerName.length; j++) {
			WebElement header = headerName[j];
			
			System.out.println(header.getText());
			
//			System.out.println(headerName[i].getText());
			
//			System.out.println("headername: "+header1);
			
			if (header.getText().contentEquals(header1)) {
				
				System.out.println("Yes");
				
			} else {
				
				System.out.println("No");

			}
			
			

		}		
			

		
		
	}

}
