package application;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) {

		//WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new EdgeDriver();
		
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");

		/*driver.findElement(By.linkText("See an example alert")).click();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		String text = alert.getText();
		
		System.out.println(text);
		
		alert.accept();*/
		
		/*//Click the link to activate the alert
		driver.findElement(By.linkText("See a sample confirm")).click();

		//Wait for the alert to be displayed
		wait.until(ExpectedConditions.alertIsPresent());

		//Store the alert in a variable
		Alert alert = driver.switchTo().alert();

		//Store the alert in a variable for reuse
		String text = alert.getText();

		//Press the Cancel button
		alert.dismiss();*/
		
		//Click the link to activate the alert
		driver.findElement(By.linkText("See a sample prompt")).click();

		//Wait for the alert to be displayed and store it in a variable
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		//Type your message
		alert.sendKeys("Selenium");

		//Press the OK button
		alert.accept();
		  
		  


	}

}
