package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException, IOException {
	/*	01) Launch Firefox / Chrome
	02) Load https://www.redbus.in/
	03) Type ""Chennai"" in the FROM text box and select the first option
	04) Type ""Bangalore"" in the To text box and select the first option
	05) Select tomorrow's date in the Date field
	06) Click Search Buses
	07) Print the number of buses shown as results
	08) Choose SLEEPER in the left menu 
	09) Print the name of the second resulting bus 
	10) Click the VIEW SEATS of that bus
	11) Take screenshot and close browser*/
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://www.redbus.in/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("chennai")
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.xpath("//table//tr[4]//td[4]")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(1000);
		String noofbuses = driver.findElement(By.xpath("//span[contains(@class,'busFound')]")).getText();
		System.out.println("Number Of Buses Available= "+ noofbuses);
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
		String secondBus = driver.findElement(By.xpath("(//div[contains(@class,'travels')])[2]")).getText();
		System.out.println("SecondBus= "+ secondBus);
		driver.findElement(By.xpath("(//div[contains(@class,'view-seats')])[2]")).click();
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		File soucce = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/redbussnap.png");
		FileUtils.copyFile(soucce, dest);		
		driver.close();


	}

}
