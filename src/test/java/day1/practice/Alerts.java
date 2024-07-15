package day1.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement alertbtn = driver.findElement(By.xpath("//div[@class='tab-content']//child::button"));
		alertbtn.click();

		Alert alter = driver.switchTo().alert();
		System.out.println(alter.getText());
		alter.accept();

		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());

		driver.quit();

	}

}
