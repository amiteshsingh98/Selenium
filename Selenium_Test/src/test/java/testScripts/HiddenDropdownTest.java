package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdownTest {

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		//To locate suggested list elements in browser
		//GoTo CDP(inspect) tab right side for element-->Event Listener--> Blur ---->Remove all JS object
		//Now from the Browser we would be able to locate 

		driver.findElement(By.name("q")).sendKeys("iphone");

		Thread.sleep(7000);

		List<WebElement> items = driver.findElements(By.xpath("//div[contains(@class,'_2VHNef')]"));

		System.out.println(items.size());

		for (WebElement item : items) {

			System.out.println(item.getText());

			if (item.getText().contentEquals("iphone 14 plus")) {

				item.click();

				break;

			}


			//WebElement iphone14Plus = driver.findElement(By.xpath("//div[contains(@class,'_4rR01T')]"));

			//iphone14Plus.click();

		}

	}

}
