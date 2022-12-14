package Week7.day1;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Week7.day1.ProjectspecificationMethod;


public class createLead extends ProjectspecificationMethod {
	@BeforeTest
	public void excel() {
		file="createLead" ;
	}
	@Test(dataProvider="fetchData")
	
	public void runCreateLead(String companyname,String firstname,String lastname,String phonenumber ) {
	
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phonenumber);
		driver.findElement(By.name("submitButton")).click();
	
}




}
