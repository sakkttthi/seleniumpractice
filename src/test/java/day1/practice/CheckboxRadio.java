package day1.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxRadio {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		driver.manage().window().maximize();

		driver.findElement(By.id("c_bs_1")).click();

		driver.findElement(By.xpath("//ul[@id='navMenus']/li[3]/a")).click();

		driver.findElement(By.name("tab")).click();

	}

}
