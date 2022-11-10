package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {
		    WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://leafground.com/select.xhtml");
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
			Select drop=new Select(tool);
			drop.selectByVisibleText("Cypress");
			driver.findElement(By.id("j_idt87:country_lable")).click();
			driver.findElement(By.id("j_idt87:country_1")).click();
			//WebElement country;
			//WebElement country=driver.findElement(By.id("j_idt87:country_input"));
			  //Select selectcountry=new Select(country);
			//selectcountry.selectByValue("Brazil");
		//	driver.findElement(By.id("j_idt87:country_label")).click();
		//	driver.findElement(By.id("j_idt87:country_1")).click();
		//	WebElement Country=driver.findElement(By.id("j_idt87:country_input"));
			
			
			
			

	}
}
