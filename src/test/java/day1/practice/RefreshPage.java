package day1.practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshPage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.F5);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location.reload()");
	}  

}
