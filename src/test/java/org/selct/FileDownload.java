package org.selct;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {

	public static void main(String[] args) {
		
		
		//filepath
		
	   String path=	System.getProperty("user.dir")+"\\src\\test\\resources\\Downloads";
	   
	   System.out.println(path);
		
	   //add the file path to map with key
		
		Map<String, Object> mp = new LinkedHashMap();
		
		mp.put("download.default_directory", path);
		
		ChromeOptions op = new ChromeOptions();		
		
		//pass the map to chromeoptions
		
		op.setExperimentalOption("prefs", mp);
				
		//pass the chrome options object to chromeDriver.
		
		WebDriver driver = new ChromeDriver(op);
				
		driver.get("https://samplelib.com/sample-jpeg.html");
		
		driver.findElement(By.xpath("(//a[text()='Download'])[1]")).click();
		
		
		
	}
}
