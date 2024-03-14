package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement browseFile = driver.findElement(By.name("file"));
		
		browseFile.sendKeys("C:\\Users\\amite\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-11-26 192722.png");
		
		driver.findElement(By.id("file-submit")).click();
		
		String fileName = driver.findElement(By.id("uploaded-files")).getText();
		
		System.out.println(fileName);
		
		
	}

}
