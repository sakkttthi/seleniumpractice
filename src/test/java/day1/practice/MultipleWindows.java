package day1.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.manage().window().maximize();

		driver.findElement(By.className("cta_button")).click();

		Set<String> openWindows = driver.getWindowHandles();
		System.out.println(openWindows);
		
		Iterator<String> iterator = openWindows.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		
		driver.switchTo().window(childWindow);

		driver.findElement(By.name("UserFirstName")).sendKeys("Ravi");
		driver.findElement(By.name("UserLastName")).sendKeys("Hari");
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());

	}

}
