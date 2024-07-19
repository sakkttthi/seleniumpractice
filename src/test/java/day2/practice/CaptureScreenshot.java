package day2.practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
//		Create unique filename
		Date date=new Date();
		String screenshotfilename = date.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotfilename);
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
//		commons io dependency is required to save the file
		FileUtils.copyFile(screenshotFile, new File (".//screenshots/" + screenshotfilename+".png"));
		
		driver.quit();
	}

}
