package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class abc{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.linkText("Sign Up")).click();
	
		WebElement DOB= driver.findElement(By.name("birthday_day"));
		Select sel_dob = new Select(DOB);
		sel_dob.selectByValue("31");
		
		
		
		
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//*[@id=\"mount_0_0_/f\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("pravin marne");
		//driver.close(); 
	}

}
