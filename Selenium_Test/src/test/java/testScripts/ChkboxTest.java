package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkboxTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

		WebElement chkbox = driver.findElement(By.cssSelector("#isAgeSelected"));

		chkbox.click();

		System.out.println("After Select : "  + chkbox.isSelected());

		chkbox.click();

		System.out.println("After UnSelect : "  + chkbox.isSelected());

	}

}
