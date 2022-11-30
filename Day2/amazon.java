package Week4.Day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
	/*	1.Load the uRL https://www.amazon.in/
			2.search as oneplus 9 pro 
			3.Get the price of the first product
			4. Print the number of customer ratings for the first displayed product
			5. Mouse Hover on the stars
			6. Get the percentage of ratings for the 5 star.
			7. Click the first text link of the first image
			8. Take a screen shot of the product displayed
			9. Click 'Add to Cart' button
			10. Get the cart subtotal and verify if it is correct.*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("onplus 9 pro",Keys.ENTER);
		String firstPrice = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		System.out.println("Price of the first product= "+  firstPrice);
		String customerRating = driver.findElement(By.xpath("//span[text()='389']")).getText();
		System.out.println("Customer Rating for this Product=" + customerRating );
        String starnum= driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold']")).getText();
		
		System.out.println("star value="+ starnum);
		
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		WebElement stars = driver.findElement(By.xpath("(//i[contains(@class, 'aok-align-bottom')])[1]"));
		Actions str=new Actions(driver);
	    str.moveToElement(stars).perform();
		WebElement percentage = driver.findElement(By.xpath(" //a[text()= '                            43%                        ']  "));
		System.out.println("Percentage for stars= "+ percentage );

		Set<String> wh = driver.getWindowHandles();
		
		List<String>Page=new ArrayList<String>(wh);
		
		driver.switchTo().window(Page.get(1));
		File photo = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("amazon.png");
		FileUtils.copyFile(photo, dest);			
		driver.findElement(By.id("add-to-cart-button")).click();
		 Thread.sleep(5000);
				
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		String subtotal = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")).getText();
				
	
		System.out.println("Sub Total Value="+subtotal);
				
				if(firstPrice==subtotal) {
					System.out.println("the prices are equal");
				}
				else
				{
					System.out.println("the prices are not equal");
				}
				
				driver.switchTo().window(Page.get(0));
				driver.close();
		

	}

}
