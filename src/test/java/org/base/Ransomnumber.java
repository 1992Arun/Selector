package org.base;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ransomnumber {
	
	
	
   static void	ran(){
		
	   Random r = new Random();
		
		//System.out.println(UUID.randomUUID());
			
			StringBuilder sb = new StringBuilder();
			
			String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcedefghijklmnopqrstuvwxyz1234567890";
			
			for(int i=0; i<str.length();i++) {
				
				char charAt = str.charAt(r.nextInt(str.length()));
				
				sb.append(charAt);
				
		
			}
			
			System.out.println(sb.substring(0, 6));
		
	   
	}
   
   static void scroll() throws InterruptedException{
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.google.com/");
	   
	   WebElement findElement = driver.findElement(By.id("APjFqb"));
	   
	   findElement.sendKeys("sdls");
	   
	   findElement.submit();
	   
       Thread.sleep(10000);
//	   
//	   for(int i=0;i<20;i++) {
	   
	   JavascriptExecutor js= (JavascriptExecutor)driver;
	   
	   js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//div[@class='VtPCGb']")));
	   
	  // js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", driver.findElement(By.xpath("//div[@class='VtPCGb']")));
	   
	   
	   
   }

	public static void main(String[] args) throws InterruptedException {
		
		scroll();
	}
	
}
