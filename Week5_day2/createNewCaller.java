package Week5.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class createNewCaller {
	public static void main(String[] args) throws InterruptedException {
		/*3. Click-All and Enter Callers in filter navigator and press enter 
4. Create new Caller by filling all the fields and click 'Submit'.
5. Search and verify the newly created Caller"*/
	
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
		sh.setImplicitWait(10);
	    sh.findElementByXPath("//input[@id='filter']").sendKeys("Callers");
	    sh.findElementByXPath("//span[text()='Callers']").click(); 
	    WebElement findnew = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(findnew);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("janani");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("subramanian");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("janani.mithu@gmail.com");
		driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("9820203339");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("9876594033");
		Thread.sleep(2000);
	//	WebElement findnew1 = sh.findElementByXPath("//iframe[@id='gsft_main']");
		//driver.switchTo().frame(findnew1);
		driver.findElement(By.xpath("(//div[contains(@class,'form-field-addons')])[3]//a")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> sug=new ArrayList<String>(handles);
		driver.switchTo().window(sug.get(1));
		driver.findElement(By.xpath("//a[text()='Administrative Assistant']")).click();
		driver.switchTo().window(sug.get(0));
	//	driver.switchTo().frame(findnew1);
		driver.switchTo().frame(findnew);
		driver.findElement(By.xpath("//span[@class='navbar_ui_actions']//button")).click();
		String verifyMsg = driver.findElement(By.xpath("//div[@class='outputmsg_text']")).getText();
		System.out.println(verifyMsg);
		if(verifyMsg.contains("subramanian")) {
			
			System.out.println("NewCaller created");
			
		}
		else {
			System.out.println("Not created");
		}
		
		
		
		

}
}