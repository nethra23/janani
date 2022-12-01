package Marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) {
		/*1. Launch Salesforce application https://login.salesforce.com/
			2. Login with Provided Credentials
			3. Click on Learn More link in Mobile Publisher  and click Confirm
			4. Click Learning and Mouse hover on Learning On Trailhead
			5. Select SalesForce Certification 
			6. Choose Your Role as Salesforce Architect and verify the URL
			7. Get the Text(Summary) of Salesforce Architect 
			8. Get the List of Salesforce Architect Certifications Available
			9. Click on Application Architect 
			10.Get the List of Certifications available
			*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> handle = driver.getWindowHandles();
		List<String>lst=new ArrayList<String>(handle);
		driver.switchTo().window(lst.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		WebElement mousehover =shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions act=new Actions(driver);
		act.moveToElement(mousehover).perform();
		shadow.findElementByXPath("//a[text()='Salesforce Certification']").click();
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if(currentUrl.contains("architectoverview")) {
			System.out.println("It contains architectoverview");
		}
		else
			System.out.println("It doesnot contains url");
		
		
	    WebElement text = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--center')]"));
	    String text2 = text.getText();
	    System.out.println("Text=" + text2);
	    
	     List<WebElement> lstsales = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
	     for (int i = 0; i < lstsales.size(); i++) {
	    	 System.out.println(lstsales.get(i).getText());
			
		}
	
	     driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
	     List<WebElement> lstcerfi = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
	     for (int i = 0; i < lstcerfi.size(); i++) {
	    	 System.out.println(lstcerfi.get(i).getText());
			
		}
	     
	}
	}


