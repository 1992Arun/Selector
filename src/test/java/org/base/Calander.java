package org.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {
	
	public static void main(String[] args) throws ParseException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker")).click();
		
		String date = "12-09-2019";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Date parse = sdf.parse(date);
		
		SimpleDateFormat yearformat  = new SimpleDateFormat("yyyy");
		
		SimpleDateFormat monthformat  = new SimpleDateFormat("MMMM");
		
		SimpleDateFormat dateformat  = new SimpleDateFormat("dd");
		
		String year = yearformat.format(parse);
		
		String month = monthformat.format(parse);
		
		String day = dateformat.format(parse);

		String currentMonth= driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
		
		String currentYear= driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
		
		System.out.println(year);

		System.out.println(month);
		
		System.out.println(day);
		
		
		while(Integer.parseInt(currentYear)>Integer.parseInt(year)|| !currentMonth.equals(month)) {
			
			driver.findElement(By.cssSelector("a[title=Prev]")).click();
			
			 currentMonth= driver.findElement(By.cssSelector(".ui-datepicker-month")).getText().trim();
			
			 currentYear= driver.findElement(By.cssSelector(".ui-datepicker-year")).getText().trim();
			 
		
			
		}
		
		
     while(Integer.parseInt(currentYear)<Integer.parseInt(year)|| !currentMonth.equals(month)) {
			
			driver.findElement(By.cssSelector("a[title=Next]")).click();
			
			 currentMonth= driver.findElement(By.cssSelector(".ui-datepicker-month")).getText().trim();
				
			 currentYear= driver.findElement(By.cssSelector(".ui-datepicker-year")).getText().trim();
			 
			
			
			
		}
		
		
		
		List<WebElement> findElements = driver.findElements(By.cssSelector(".ui-state-default"));
		
		for(int i=0; i<findElements.size();i++) {
			
			
			if(findElements.get(i).getText().equals(day)) {
				
				findElements.get(i).click();
				
			}
			
		}
		
		
		
		
		
		
	}

}
