package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsExample {

	public static void main(String[] args) {

		WebDriver driver  = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/amite/Selenium%20Java/SimplePage.html");

		/*WebElement FirstName = driver.findElement(By.id("fname"));

		FirstName.clear();

		FirstName.sendKeys("Amitesh");

		String name = FirstName.getAttribute("value");

		System.out.println(name);		

		WebElement LastName = driver.findElement(By.id("lname"));

		LastName.clear();

		LastName.sendKeys("Singh");

		String name1 = LastName.getAttribute("value");

		System.out.println(name1);*/
		
		By maleRadiobuttom = RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@value=\"f\"]"));
		
		driver.findElement(maleRadiobuttom).click();
		
		
		

	}

}
