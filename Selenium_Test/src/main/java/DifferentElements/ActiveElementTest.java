package DifferentElements;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElementTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("http://www.google.com");

			driver.findElement(By.cssSelector("[name='q']")).sendKeys("webElement");

			// Get attribute of current active element
			String attr = driver.switchTo().activeElement().getAttribute("title");

			System.out.println(attr);

		} 

		finally {

			driver.quit();

		}
	}
}

