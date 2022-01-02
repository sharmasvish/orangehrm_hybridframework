package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/iframe");

		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

		System.out.println("total number of iframes on the page : " + iframes.size());
		// We can switch to the iframe by using 3 ways :

		// switchTo().frame(int index) : by using index
		// switchTo().frame(String name or id) : by using name or id
		// switchTo().frame(WebElement ele) : by using web element

		// driver.switchTo().frame(0);
		// driver.switchTo().frame("mce_0_ifr");
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
		driver.switchTo().frame(frameEle);

		String para = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();

		System.out.println(para);
		
		WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		textBox.clear();
		
		textBox.sendKeys("Hello all");
		//Thread.sleep(5000);
		
		//driver.quit();

	}
}