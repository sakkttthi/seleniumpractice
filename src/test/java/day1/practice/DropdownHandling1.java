package day1.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		WebElement ddown = driver.findElement(By.id("ide"));
		Select select = new Select(ddown);
		select.selectByIndex(2);
		select.selectByValue("nb");
		select.selectByVisibleText("Eclipse");
		List<WebElement> selection1 = select.getAllSelectedOptions();
		System.out.println(selection1.size());
		select.deselectAll();
		List<WebElement> selection2 = select.getAllSelectedOptions();
		System.out.println(selection2.size());
		
		driver.quit();
		
	}

}
