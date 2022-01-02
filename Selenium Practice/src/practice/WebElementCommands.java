package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		/*boolean languagelink = driver.findElement(By.partialLinkText("English")).isEnabled();
		if(languagelink) {
			driver.findElement(By.partialLinkText("English")).click();
			}
		else {
			System.out.println("UK link is disabled on the fb login page");
		} */
		
		if(driver.findElement(By.linkText("Sign Up")).isEnabled()) {
			driver.findElement(By.linkText("Sign Up")).click();
		}
		else {
			System.out.println("Sig Up Link is not enabled...");
		}
		
		if(driver.findElement(By.name("websubmit")).isDisplayed()) {
			driver.findElement(By.name("websubmit")).click();
		}
		else {
			System.out.println("Sig Up Link is not displayed...");
		}
		
		
		
		
		if(driver.findElement(By.xpath("//input[@class='_8esa' and @value='1']")).isSelected()) {
			System.out.println("Is already selected");
		}
		else {
			driver.findElement(By.xpath("//input[@class='_8esa' and @value='1']")).click();
		}
		
	}
}