package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmlTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/amite/Selenium%20Java/SimplePage.html");

		// WebElement input = driver.findElement(By.className("information"));

		// String FirstInput = input.getAttribute("value");

		// System.out.println(FirstInput);

		WebElement FirstName = driver.findElement(By.cssSelector("#fname"));

		String value = FirstName.getAttribute("value");

		System.out.println(value);

		WebElement LastName = driver.findElement(By.cssSelector("#lname"));

		String value1 = LastName.getAttribute("value");

		System.out.println(value1);

		driver.findElement(By.name("newsletter")).click();

		// driver.findElement(By.linkText("Selenium Official Page")).click();

		// String Title = driver.getTitle();

		// System.out.println(Title);

		//driver.findElement(By.partialLinkText("Official Page")).click();

		//String Title = driver.getTitle();

		//System.out.println(Title);
		
		driver.findElement(By.xpath("//input[@value=\"m\"]")).click();

	}

}
