package day2.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		WebElement motors = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]"));
		Actions action = new Actions(driver);
		action.moveToElement(motors).perform();
		
//		Waits for the time provided
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement cars = driver.findElement(By.xpath("//a[text()='Motorcycle parts']"));
		cars.click();
	}

}
