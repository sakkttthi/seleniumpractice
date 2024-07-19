package day2.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpiredSSL {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setAcceptInsecureCerts(true);
		ChromeOptions co=new ChromeOptions();
		co.merge(ds);
		
		ChromeDriver driver=new ChromeDriver(co);
		
		driver.get("https://expired.badssl.com/");
		
		
	}

}
