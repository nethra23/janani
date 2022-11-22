package Week4.day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click and confirm new window opens
		 String oldwin = driver.getWindowHandle();//old window
		 driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		 Thread.sleep(2000);
		 Set<String> handles2 = driver.getWindowHandles();//second window
		 for (String newwin : handles2) {
			driver.switchTo().window(newwin);//control change to new window
			Thread.sleep(2000);
		 }
		//Find the number of opened tabs
			String old = driver.getWindowHandle();
			driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
			Thread.sleep(2000);
			driver.close();
		 driver.switchTo().window(oldwin);
		    int size = driver.getWindowHandles().size();
		    System.out.println("Total No.of.Windows"+size);
		    
	    //Close all windows except Primary
			driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
			Set<String> windowHandles = driver.getWindowHandles();
			for (String totalwindows : windowHandles) {
				if(!totalwindows.equals(oldwin))
				{
					driver.switchTo().window(totalwindows);
					driver.close();
				}
				
			}
			//Wait for 2 new tabs to open
			driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.close();
		}
 
		
		

	}


