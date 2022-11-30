package Week4.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindRowColumnPercentage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//find the column
		 List<WebElement> column =  driver.findElements(By.xpath("//table//th"));
		int col= column.size();
		System.out.println("column=" + col);
		
		//find the row
		List<WebElement> row=driver.findElements(By.xpath("//table//tr"));
		int ro=row.size();
		System.out.println("Row="+ ro);
		
		//get the progress value
		WebElement value = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String per=value.getText();
		System.out.println("Percentage = "+  per);
		
		//check the least value
	  //  List<WebElement> allvalues = driver.findElements(By.xpath("//td[2]"));
		//System.out.println("All Values=" + allvalues);
		//vital values
		List<Integer> lst=new ArrayList<Integer>();
		
		//to get percentages
			
				List<WebElement> AllProgress = driver.findElements(By.xpath("//td[2]"));
				
				List<Integer>numberList= new ArrayList<Integer>();
				
				for (WebElement webElement : AllProgress) {
					String individualValue = webElement.getText().replace("%","");
		            numberList.add(Integer.parseInt(individualValue));
				}	
				System.out.println(numberList);
				
				int smallValue=Collections.min(numberList);
				System.out.println(smallValue);
				
				String smallValueString=Integer.toString(smallValue)+"%";
			
				String finalXpath = ("//td[normalize-space()="+"\""+ smallValueString +"\""+"]"+"//following::td[1]");
				
				System.out.println(finalXpath);
				driver.findElement(By.xpath(finalXpath)).click();
				
				
			}
		
			
				
	}

