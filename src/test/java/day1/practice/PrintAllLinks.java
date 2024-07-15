package day1.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links = " +links.size() );
		
		for (int i = 0; i < links.size(); i++) {
			System.out.println("Links are : " + links.get(i).getAttribute("href"));
			
		}
		
		driver.quit();
		
	}

}
