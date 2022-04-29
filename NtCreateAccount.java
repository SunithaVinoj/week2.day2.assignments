package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class NtCreateAccount {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/control/login ");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()= 'Accounts']")).click();
		driver.findElement(By.xpath("//a[text()= 'Create Account']")).click();
		WebElement drpdwn = driver.findElement(By.id("currencyUomId"));
		Select curr = new Select(drpdwn);
		curr.selectByValue("INR");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("http://leaftaps.com");
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[5]")).sendKeys("100000");
		driver.findElement(By.xpath("//input[@value= 'Create Account']")).click();
		String errmsg = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		
		System.out.println(errmsg);
		
		if (errmsg.contains("crmsfa.createAccount.accountName"))
		{
			System.out.println("Yes, the error msg is getting displayed");
		} 
		else 
		{
			System.out.println("No error msg is not getting displayed");
		}
		System.out.println("The Title is :" + driver.getTitle());
		//driver.close();
	}
}