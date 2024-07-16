package day2.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		WebElement uName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currAddress = driver.findElement(By.id("currentAddress"));

		uName.sendKeys("Ravi");
		email.sendKeys("ravi@gmaill.com");

		Actions action = new Actions(driver);
		action.keyDown(email, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

		action.keyDown(currAddress, Keys.CONTROL).sendKeys("v").build().perform();

	}

}
