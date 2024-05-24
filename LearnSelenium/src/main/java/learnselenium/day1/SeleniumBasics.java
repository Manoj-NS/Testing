package learnselenium.day1;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://app4.sparinc.com/spartoolsus?_ga=2.158329274.1040077832.1655564889-117463900.1645817069");
		
		driver.manage().window().maximize();
		
		driver.close();
	
		
	}

}
