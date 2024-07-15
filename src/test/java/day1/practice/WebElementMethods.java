package day1.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		driver.findElement(By.className("gLFyf")).sendKeys("Admin");

		driver.findElement(By.className("gLFyf")).clear();

		System.out.println(driver.findElement(By.className("gLFyf")).getAttribute("data-ved"));

		System.out.println(driver.findElement(By.className("lnXdpd")).getCssValue("color"));

		System.out.println(driver.findElement(By.className("RNmpXc")).getSize());

		System.out.println(driver.findElement(By.className("RNmpXc")).getLocation());

		System.out.println(driver.findElement(By.id("SIvCob")).getText());

		System.out.println(driver.findElement(By.className("RNmpXc")).getTagName());

		System.out.println(driver.findElement(By.className("RNmpXc")).isDisplayed());

		System.out.println(driver.findElement(By.className("RNmpXc")).isEnabled());

		System.out.println(driver.findElement(By.className("RNmpXc")).isSelected());

		driver.quit();

	}

}
