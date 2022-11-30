package Week4.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement drag = driver.findElement(By.id("form:conpnl"));
	//	;
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(drag, 1000,500 ).perform();
		System.out.println("moved");
		WebElement drag2 = driver.findElement(By.id("form:drag_content"));
		WebElement target=driver.findElement(By.id("form:drop_content"));
		action.dragAndDrop(drag2, target).perform();
		System.out.println(drag2.getText());
		//colour
		System.out.println(target.getCssValue("background"));
				
	}

}
