package day2.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream input=new FileInputStream("D:\\Self\\eclipse\\selenium.practice\\src\\test\\resources\\testdata.properties");
		prop.load(input);
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		System.out.println(browser +" "+url);
		
		FileOutputStream output=new FileOutputStream("D:\\Self\\eclipse\\selenium.practice\\src\\test\\resources\\testdata.properties");
		prop.setProperty("testdata", "456");
		prop.save(output, "User data comments");
	}

}
