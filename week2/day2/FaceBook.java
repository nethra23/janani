package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Janani");
		driver.findElement(By.name("lastname")).sendKeys("subramanian");
		driver.findElement(By.name("reg_email__")).sendKeys("janani.mithu@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Jana_28");
		WebElement bday = driver.findElement(By.name("birthday_day")); 
		Select day = new Select(bday); 
		day.selectByValue("28");
		WebElement birthmonth = driver.findElement(By.name("birthday_month"));		
		Select month = new Select(birthmonth);
		month.selectByVisibleText("dec");
		WebElement birthyear = driver.findElement(By.id("month")); 
		Select year = new Select(birthyear);
		year.selectByVisibleText("1988"); 
		driver.findElement(By.name("sex")).click();
		driver.close();
		
	}

}
