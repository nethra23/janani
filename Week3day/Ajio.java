package Week3day;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
				
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='searchVal']")).click();
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String findElement = driver.findElement(By.className("length")).getText();
		System.out.println("Total Number of Items"+ findElement);
		System.out.println("List of Brands");
		List<WebElement> brandList = driver.findElements(By.className("brands"));
		System.out.println("Number Of Brand"+ brandList);
		for (WebElement webelement:brandList) {
			String lists=webelement.getText();
			System.out.println(lists);
			
		}
		
		
		
		
	}

}
