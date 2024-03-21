package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame("mce_0_ifr");
		
		WebElement inputTxt = driver.findElement(By.id("tinymce"));
				
		inputTxt.clear();
		
		inputTxt.sendKeys("HELLO HI BYE");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Elemental Selenium")).click();
		

	}

}
