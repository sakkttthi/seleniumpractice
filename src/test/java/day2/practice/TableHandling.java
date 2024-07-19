package day2.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		int rowize = row.size();
		List<WebElement> column = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td"));
		int colsize = column.size();
		
		for (int i = 2; i < rowize; i++) {
			for (int j = 1; j < colsize; j++) {
				 WebElement print = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]"));
				 System.out.println(print.getText());
			}
			
		}
		driver.quit();
	}

}
