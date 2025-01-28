package day1.practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		
		Set<Cookie> cookie = driver.manage().getCookies();
		System.out.println(cookie);
		
		
		driver.manage().deleteAllCookies();
		
//		driver.manage().addCookie(null)
		
	}
}
