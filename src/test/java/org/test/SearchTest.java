package org.test;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchTest {
	
	public static void main(String[] args) throws IOException {
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-popup");
		
	
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.switchTo().alert().dismiss();
		
		driver.get("https://www.facebook.com/");
		
	 List<WebElement> findElements = driver.findElements(By.tagName("a"));
	 
	 for(int i=0;i<findElements.size();i++) {
		 
		 String ur = findElements.get(i).getAttribute("href");
		 
		 URL url = new URL(ur);
		 
		 URLConnection openConnection = url.openConnection();
		 
		 HttpsURLConnection http = (HttpsURLConnection)openConnection;
		 
	       //  System.out.println(http.getResponseCode());	 
		 
		 
		 
	 }
		
		
	
			
	}

}
