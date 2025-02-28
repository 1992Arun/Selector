package org.base;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	

		public static WebDriver driver;
		
		public static void browserLaunch(String browser){
			
			if(driver==null) {
				
		
			switch (browser){
			
				case  "Chrome" : driver = new ChromeDriver();
				
				case "Edge" : driver = new EdgeDriver();
			
			}

			}
	}
		
		public static void main(String[] args) {
			
		
			datas();
		}
	static void	datas(){
		
		Date d = new Date();
		
//		 long time = d.getTime();
		 
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-mm");
		
		String format = s.format(new Date());
		
		System.out.println(format);
		
		}

		


}
