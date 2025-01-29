package day1.practice;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeWindowSIze {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		Dimension d = new Dimension(500,200);
		
		driver.manage().window().setSize(d);
	}

}
