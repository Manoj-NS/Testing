package learnselenium.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLogin {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		
		driver.get("https://app4.sparinc.com/spartoolsus?_ga=2.158329274.1040077832.1655564889-117463900.1645817069");
		
		WebElement usernameElement = driver.findElement(By.id("Input_Username"));
		usernameElement.sendKeys("vgovindan");
		
		WebElement passwordElement = driver.findElement(By.name ("Input.Password"));
		passwordElement.sendKeys("sparVK*1");
		
		WebElement loginbuttonElement = driver.findElement(By.xpath("//input[@type='submit']"));
		loginbuttonElement.click();
		
		//WebElement loginButton = driver.findElement(By.cssSelector("input[value=' Login ']"));
		
		//loginButton.click();
		

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
		boolean loginSuccessful = driver.getCurrentUrl().equals("https://app4.sparinc.com/spartoolsus/Menu"); 

  
        if (loginSuccessful) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }
	}

}
