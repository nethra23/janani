package Week4.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nyKaa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  /*	1) Go to https://www.nykaa.com/
			2) Mouseover on Brands and Search L'Oreal Paris
			3) Click L'Oreal Paris
			4) Check the title contains L'Oreal Paris(Hint-GetTitle)
			5) Click sort By and select customer top rated
			6) Click Category and click Hair->Click haircare->Shampoo
			7) Click->Concern->Color Protection
			8)check whether the Filter is applied with Shampoo
			9) Click on L'Oreal Paris Colour Protect Shampoo
			10) GO to the new window and select size as 175ml
			11) Print the MRP of the product
			12) Click on ADD to BAG
			13) Go to Shopping Bag 
			14) Print the Grand Total amount
			15) Click Proceed
			16) Click on Continue as Guest
			17) Check if this grand total is the same in step 14
			18) Close all windows*/
	      	WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		    Actions builder = new Actions(driver);
		    builder.moveToElement(brands).perform();
            driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[1]/div/div[1]/ul[2]/li/ul/li/section[2]/div[2]/div/div/ul/li[5]/a/img")).click();
		    String title = driver.getTitle();
		    if(title.contains("paris")) {
			 
		  System.out.println("Title contains paris");
		 }
		 else {
			  System.out.println("Title doesnot contains paris");
	}
		  driver.findElement(By.xpath("//span[contains(text(),'Sort By : ']")).click();
}
}
