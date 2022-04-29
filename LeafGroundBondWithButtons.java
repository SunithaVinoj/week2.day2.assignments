package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class LeafGroundBondWithButtons {

		private static Rectangle rect;

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leafground.com/pages/Button.html");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			
			driver.findElement(By.id("home")).click();
			
			//driver.findElement(By.id("home")).getCssValue("background-color");
			//System.out.println(driver.findElement(By.id("home")).getCssValue("background-color"));
			
							
			//Point location2 = driver.findElement(By.id("position")).getLocation();
			//Point location2 = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		//	System.out.println("Position "+ driver.findElement(By.id("position")).getLocation());
			//System.out.println("Position "+ location2);
			
			Point location2 = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
			System.out.println("location" +location2);
			
			String cssValue = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
			System.out.println("button color " + cssValue);
		
			
			Point location = driver.findElement(By.xpath("//button[id='size']")).getLocation();
		//	driver.findElement(By.id("size")).;
			System.out.println("height" + location.getX() + " width" + location.getY());
			//System.out.println(driver.findElement(By.id("size")).getTagName());
			
		}
	}




