package application;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebFormTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		try {

			driver.get("https://www.selenium.dev/selenium/web/web-form.html");

			WebElement textinput = driver.findElement(By.id("my-text-id"));

			WebElement passwordinput = driver.findElement(By.name("my-password"));

			WebElement textarea = driver.findElement(By.name("my-textarea"));

			WebElement selectDropdown = driver.findElement(By.name("my-select"));

			WebElement dropdown = driver.findElement(By.name("my-datalist"));

			WebElement dropdownvalue = driver.findElement(By.cssSelector("#my-options>option[value='New York']"));

			Select select = new Select(selectDropdown);

			WebElement browseFile = driver.findElement(By.name("my-file"));

			textinput.sendKeys("Amitesh Singh");

			passwordinput.sendKeys("Amitesh098");

			textarea.sendKeys("Hi, This is just an Automation Testing");

			System.out.println(select.getOptions().size());

			select.selectByVisibleText("Three");

			//browsereFile.click();

			browseFile.sendKeys("C:\\Users\\amite\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-11-26 192722.png");
			
			System.out.println(browseFile.getAttribute("value"));
			

		}

		finally {

			//driver.quit();
		}

	}

}
