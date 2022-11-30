package Week4.Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table {

	public static void main(String[] args) {
		//https://html.com/tags/table/"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> head = driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
		System.out.println("size of the row= " + head.size());
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		System.out.println("size of the column= " + row.size());
	}

}
