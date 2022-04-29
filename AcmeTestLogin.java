package week2.day2;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeTestLogin {


	public static void main(String[] args) {
		 
	
	// Driver setup
    WebDriverManager.chromedriver().setup();
    // Open Chrome Browser
    ChromeDriver driver = new ChromeDriver();
    // Load the URL
    driver.get("https://acme-test.uipath.com/login");
    // Maximize the window
    driver.manage().window().maximize();
    
    // Finding the webelement
    WebElement elementEmail = driver.findElement(By.id("email"));
    // Entering some input in the text box
    elementEmail.sendKeys("kumar.testleaf@gmail.com");
    
    driver.findElement(By.name("password")).sendKeys("leaf@12");
    
    driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
    String text = driver.findElement(By.xpath("//div/div[2]/h1")).getText();
    
    System.out.println(text);
    
    driver.findElement(By.linkText("Log Out")).click();
	
	driver.close();
	
}
}