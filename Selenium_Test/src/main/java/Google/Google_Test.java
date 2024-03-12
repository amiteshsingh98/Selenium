package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Google_Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver2 = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).click();
		
		driver.findElement(By.id("APjFqb")).sendKeys("Testing");
		
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

	}

}
