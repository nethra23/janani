package Week7.day1;
//import java.time.Duration ;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;
//import week5_Day1.BaseClass;

public class EditLead extends ProjectspecificationMethod{
	@BeforeTest
	public void excel() {
		file="Edit" ;
	}
	@Test(dataProvider="fetchData")
	public void edittest(String phonenumber,String companyname ) throws InterruptedException {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.name("submitButton")).click();
		
}
 

}
