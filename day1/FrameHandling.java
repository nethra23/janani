package Week4.day1;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FrameHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[@id='Click'])[1]")).click();
		String text = driver.findElement(By.xpath("(//button[@id='Click'])[1]")).getText();
		System.out.println("U Clicked Me"+text);
		driver.switchTo().defaultContent();
		
	//total frames
		driver.switchTo().frame(1);	
	    WebElement findElement = driver.findElement(By.id("Click"));
	    findElement.click();
	    String text3 = driver.findElement(By.id("Click")).getText();
	    System.out.println("count"+text3);
	    driver.switchTo().defaultContent();
		
	//Click Me (Inside Nested frame)
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		String text2 = driver.findElement(By.id("Click")).getText();
		System.out.println(" Click Me Inside Nested frame"+text2);
		
		
	}

}
