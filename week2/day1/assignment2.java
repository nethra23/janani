package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment2 {

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
       // System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("janani");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("subramanian");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("jana");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("M.sc CS");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Computer science");
        driver.findElement(By.className("primaryEmail")).click();
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.name("duplicatingPartyId")).click();
        driver.findElement(By.id("ext-gen232")).clear();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hcl");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).clear();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nethra");
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
        
        
        

	}

}
