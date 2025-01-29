package day1.practice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> anchorTags = driver.findElements(By.tagName("a"));
		
		for (WebElement i : anchorTags) {
			String links = i.getAttribute("href");
			
			if (links == null || links.isEmpty()) {
				System.out.println("Links is empty");
				continue;
			}
			
			HttpsURLConnection connection = (HttpsURLConnection)(new URL(links).openConnection());
			connection.connect();
			
			if (connection.getResponseCode() >= 400) {
				System.out.println(links + " - is broken");
			}else {
				System.out.println(links + " - is valid");
			}
			
			
		}
		driver.quit();
		
	}

}
