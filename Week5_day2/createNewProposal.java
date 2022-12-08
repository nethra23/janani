package Week5.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class createNewProposal {
	public static void main(String[] args) {
		/* Click- new  and  fill mandatory fields and click 'Submit' 
		 Button.
		 5. Verify the successful creation of new Proposal"*/
		
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
		Shadow sh1=new Shadow(driver);
		sh1.setImplicitWait(20);
		sh1.findElementByXPath("//div[text()='All']").click();
		sh1.setImplicitWait(10);
		sh1.findElementByXPath("//input[@id='filter']").sendKeys("Proposals",Keys.ENTER);
		sh1.findElementByXPath("//span[text()='My Proposals']").click();
		WebElement findnew = sh1.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(findnew);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		//WebElement suggest = sh1.findElementByXPath("//iframe[@id='gsft_main']");
		
		driver.findElement(By.xpath("//a[@id='lookup.std_change_proposal.short_description'] ")).click();
		Set<String> handle = driver.getWindowHandles();
		List<String>lst=new ArrayList<String>(handle);
		driver.switchTo().window(lst.get(1));
		driver.findElement(By.xpath("//a[text()='Issue with a web page']")).click();
		driver.switchTo().window(lst.get(0));
		driver.switchTo().frame(findnew);
		driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
		String verifymsg = driver.findElement(By.xpath("//td[text()='Issue with a web page']")).getText();
		System.out.println(verifymsg);
		if(verifymsg.contains("web Page")) {
			System.out.println("Created Successfully");
		}
		else {
			System.out.println("Not created Sucessfully");
		}
	
		driver.close();
	}

}
