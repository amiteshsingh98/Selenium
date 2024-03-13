package DifferentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement dropdown = driver.findElement(By.name("my-select"));
		
		Select s = new Select(dropdown);
		
		//s.selectByIndex(2);
		
		//s.selectByValue("3");
		
		s.selectByVisibleText("One");

	}

}
