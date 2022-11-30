package Week4.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateSecurityNamesAssignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("navbtn_stockmarket")).click();
        driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
        
        List<WebElement> securityNames = driver.findElements(By.xpath("//table [@class='table table-bordered table-condensed table-striped']//tr"));
        List<String>lstsecnames=new ArrayList<String>();
        for (int i = 1; i <securityNames.size(); i++)  {
        	String names=driver.findElement(By.xpath("//table [@class='table table-bordered table-condensed table-striped']//tr["+i+"]/td[3]")).getText();
        	
        	lstsecnames.add(names);
        	System.out.println(names);
			
		}
        System.out.println("List"+lstsecnames.size());
        Set<String>securitySet = new LinkedHashSet<String> (lstsecnames);
        System.out.println(securitySet.size());
        if (lstsecnames.size()==securitySet.size()) {
        	System.out.println("No Duplicate Security Names found");
        }
        else {
        	System.out.println("Duplicate Security Names found");
			
		}
  
     			
		}
        
		}
        		
              
	
	


	


