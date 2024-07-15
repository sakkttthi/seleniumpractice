package day1.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);

		WebElement input = driver.findElement(By.xpath("//div[@class='row']//child::input"));
		input.sendKeys("Hello");

		driver.quit();

	}

}
