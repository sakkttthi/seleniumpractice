package day2.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
//		Print title
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		String titlejs = "return document.title";
		String title = (String) javascriptExecutor.executeScript(titlejs);
		System.out.println(title);
		
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		javascriptExecutor.executeScript("myFunction()");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}

}
