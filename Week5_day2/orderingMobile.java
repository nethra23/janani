package Week5.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class orderingMobile {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://dev104060.service-now.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Subramanian_123");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow sh=new Shadow(driver);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//div[text()='All']").click();
	    sh.findElementByXPath("//input[@id='filter']").sendKeys("service catalog");
	    sh.findElementByXPath("//span[text()='Service Catalog']").click(); 
	    WebElement framefind = sh.findElementByXPath("//iframe[@id='gsft_main']");
	    driver.switchTo().frame(framefind);
	    driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
	    sh.findElementByXPath("//h2[text()='Apple iPhone 13']").click();
	    
	    driver.findElement(By.xpath("//input[@value='no']//parent::span")).click();
	    WebElement drop1 = driver.findElement(By.xpath("//select[contains(@class,'cat_item_option')]"));
		Select d1=new Select(drop1);
		d1.selectByIndex(1);
	    driver.findElement(By.xpath("//input[@value='pink']//parent::span")).click();
	    driver.findElement(By.xpath("//input[@value='128']//parent::span")).click();
	    driver.findElement(By.id("oi_order_now_button")).click();
	    String msg = driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
	    System.out.println(msg);
	    if(msg.contains("submitted"))
	    {
	    	System.out.println("Order is placed successfully");
	    }
	    else
	    {
	    	System.out.println("Order is not placed");
	    }
	    
	    String reqno = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
	    System.out.println("The Request number is "+reqno);
	    
	    driver.close();
		
		
	}
	

}
