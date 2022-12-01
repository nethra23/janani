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

public class Administrator {

	public static void main(String[] args) {
		/*1. Launch Salesforce application
		2. Login with username and password
		3. Click on Learn More link in Mobile Publisher
		4. Click confirm on Confirm redirect
		5. Mouse hover on Learning On Trailhead
		6. Clilck on Salesforce Certifications
		6. Click on Ceritification Administrator
		7. Navigate to Certification - Administrator Overview window--Check the url(verify url)
		8. Verify the Certifications available for Administrator Certifications should be displayed*/
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
        driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[1]")).click();
        String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if(currentUrl.contains("administratoroverview")) {
			System.out.println("It contains administratoroverview");
		}
		else
			System.out.println("It doesnot contains url");
	
	   List<WebElement> lstsales = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
     for (int i = 0; i < lstsales.size(); i++) {
    	 System.out.println(lstsales.get(i).getText());

}
  //   driver.findElement(By.xpath("//a[text()='Administrator']")).click();
    // List<WebElement> lstcerfi = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
     //for (int i = 0; i < lstcerfi.size(); i++) {
    	// System.out.println(lstcerfi.get(i).getText());
	}
}



