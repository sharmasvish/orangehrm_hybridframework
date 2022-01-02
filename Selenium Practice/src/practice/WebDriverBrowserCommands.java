package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBrowserCommands {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMRUTA KONDE\\OneDrive\\Desktop\\New folder\\Selenium Practice\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String crrUrl = driver.getCurrentUrl();
		System.out.println(crrUrl);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.close();
	}
}
