package Week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//simple Alert
		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']")).click();
		Alert sim = driver.switchTo().alert();
        Thread.sleep(2000);
        String text = sim.getText();
        System.out.println(text);
        sim.accept();
        
     //confirmation alert
        driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]")).click();
        Alert conf = driver.switchTo().alert();
        Thread.sleep(2000);
        String text3 = conf.getText();
        conf.accept();
        
     //prompt alert
     
        driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]")).click();
		Alert prom = driver.switchTo().alert();
		prom.sendKeys("TestLeaf");
        Thread.sleep(2000);
        String text2 = prom.getText();
        System.out.println("prompt message"+ text2);
        prom.accept();
        
     //sweet Alert
        driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']")).click();
        Thread.sleep(2000);
        String text4 = driver.findElement(By.xpath("//div[@class='ui-dialog-content ui-widget-content']")).getText();
        System.out.println("Iam sweet alert"+ text4);
driver.findElement(By.xpath("(//button[contains(@class,'ui-button-secondary')])[1]")).click();
       
     //sweet model dialogue
        driver.findElement(By.id("j_idt88:j_idt100")).click();
        String text5 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[2]//p")).getText();
        System.out.println("Iam sweet model dialogue "+ text5);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[contains(@class, 'close ui-corner-all')])[2]")).click();
        //driver.close(); 
        
     //maximize minimise
       driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
       Thread.sleep(2000);
       String text6 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[3]")).getText();
       System.out.println("Maxi and Mini"+text6);
       driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
       driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
       driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
    //   driver.close();
       
       //snapshot
       File source = driver.getScreenshotAs(OutputType.FILE);
       File destination=new File("frame.png");
       FileUtils.copyFile(source, destination);
       
       
	}
}



	


