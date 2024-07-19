	package day2.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		WebElement motors = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]"));
		Actions action = new Actions(driver);
		action.moveToElement(motors).perform();

		WebElement cars = driver.findElement(By.xpath("//a[text()='Motorcycle parts']"));

//		Waits for the condition 
		 Wait<WebDriver> wait =
			        new FluentWait<WebDriver>(driver)
			            .withTimeout(Duration.ofSeconds(2))
			            .pollingEvery(Duration.ofMillis(300))
			            .ignoring(ElementNotInteractableException.class);
		
		
		wait.until(ExpectedConditions.visibilityOf(cars));

		cars.click();
	}

}
