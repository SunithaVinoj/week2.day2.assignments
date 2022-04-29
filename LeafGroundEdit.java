package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LeafGroundEdit {
	

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leafground.com/pages/Edit.html");
			
			driver.manage().window().maximize();
			
			System.out.println("The title is :"+ driver.getTitle());
			
			System.out.println("The current URL is :" + driver.getCurrentUrl());
			
		//	System.out.println("The source code is : " + driver.getPageSource());
			
			WebElement elementUsername = driver.findElement(By.id("email"));
		    // Entering some input in the text box
		    elementUsername.sendKeys("sunithavinoj@gmail.com");
		    driver.findElement(By.xpath("//div[2]/div/div/input")).clear();
		    
		    driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("New String");
		    //driver.getKeyboard("tab");
		    
		    driver.findElement(By.xpath("//div[4]/div/div/input")).clear();
		    
			
			driver.findElement(By.name("username")).getAttribute("value");
			
		WebElement findElement = driver.findElement(By.xpath("//div[5]/div/div/input"));
			
			System.out.println(findElement.isEnabled());
			
			if(findElement.isEnabled()==false)
				System.out.println(" Yes It is disabled"); 
			else
				System.out.println(" No It is not disabled");
				
		
			
			//System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
			
			//driver.close();
			
		}
		
	}
	