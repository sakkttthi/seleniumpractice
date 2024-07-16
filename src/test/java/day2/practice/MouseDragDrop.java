package day2.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragDrop {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		WebElement imgframe = driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(imgframe);
	
		WebElement img1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/h5"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		Actions action=new Actions(driver);
		action.dragAndDrop(img1,trash).perform();
		
		driver.quit();
	}

}
