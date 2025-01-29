package day1.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,200)");
		
//		Scroll to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
//		Highlight text 
		WebElement searchBox = driver.findElement(By.className("gLFyf"));
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red')", searchBox);
		
	
		driver.quit();
	}
}
