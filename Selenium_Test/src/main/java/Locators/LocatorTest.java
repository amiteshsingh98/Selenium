package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		String Title = driver.getTitle();

		System.out.println("Title of the page is: " + Title);

		WebElement textBox = driver.findElement(By.id("my-text-id"));

		//WebElement submitButton = driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button"));

		WebElement submitButton = driver.findElement(By.tagName("button"));

		textBox.sendKeys("Amitesh Singh");

		submitButton.click();

		String message = driver.findElement(By.id("message")).getText();

		System.out.println(message);

		driver.quit();

	}

}
