package Week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.functions.Action;

public class LearnWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   WebElement visible = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));	        
		   visible.click();
	        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	        
	        //wait till the element 
	        wait.until(ExpectedConditions.visibilityOf(visible));
	        String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
	        System.out.println(text);
	        if(text.contains("here"))
	        {
	        	System.out.println("It is appear");
	        	
	        }
	        else {
	        	System.out.println("It is not appear");
	        }
	        
	      //second click
	        WebElement invisible = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt92']"));
	        invisible.click();
	        WebElement text2 = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
	       
	      //3rd click
	        WebElement clickfirst = driver.findElement(By.xpath("//button[contains(@class,'ui-button-warning mr-6 mb-6')]"));
	        clickfirst.click();
	        wait.until(ExpectedConditions.visibilityOf(clickfirst));
	        driver.findElement(By.xpath("//button[@id='j_idt87:j_idt96']")).click();
	        
	      //4th click
	        String textchange= driver.findElement(By.xpath("//span[text()='I am going to change!']")).getText();
	        System.out.println(textchange);
	        WebElement text4 = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt98']"));
	        text4.click();
	        WebElement textchange1 = driver.findElement(By.xpath("//span[text()='Did you notice?']"));
	        wait.until(ExpectedConditions.visibilityOf(textchange1));
	        String text1 = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
	        System.out.println("Changed to="+ text1);
	        
	       	}
	     	 }
	       
	


