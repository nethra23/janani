package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
        driver.findElement(By.linkText("CRM/SFA")).click();
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.id("ext-gen166")).click();
        driver.findElement(By.id("ext-gen119")).sendKeys("janani");
        driver.findElement(By.id("ext-gen114")).sendKeys("subramanian");
        driver.findElement(By.id("ext-gen158")).click();
        driver.findElement(By.name("Create Contact")).click();
     
	}

}
