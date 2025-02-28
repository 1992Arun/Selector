package org.selct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Datepicker.html");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector(".col-xs-1")).click();

		String year = "2023";

		String month = "January";

		String day = "19";

		// current months and year

		List<WebElement> findElements = driver.findElements(By.cssSelector(".ui-datepicker-title>span"));

		String currentmonth = findElements.get(0).getText().trim();

		String Currentyear = findElements.get(1).getText().trim();

		while (Integer.parseInt(Currentyear) > Integer.parseInt(year) || !currentmonth.equals(month)) {

			driver.findElement(By.cssSelector("a[title='Prev']")).click();

			List<WebElement> findElements1 = driver.findElements(By.cssSelector(".ui-datepicker-title>span"));

			currentmonth = findElements1.get(0).getText().trim();

			Currentyear = findElements1.get(1).getText().trim();

		}

		while (Integer.parseInt(Currentyear) < Integer.parseInt(year) || !currentmonth.equals(month)) {

			System.out.println("inside");

			driver.findElement(By.cssSelector("a[title='Next']")).click();

			List<WebElement> findElements1 = driver.findElements(By.cssSelector(".ui-datepicker-title>span"));

			currentmonth = findElements1.get(0).getText().trim();

			Currentyear = findElements1.get(1).getText().trim();

		}

		List<WebElement> requiredDay = driver.findElements(By.xpath("//td//a"));

		for (int i = 0; i < requiredDay.size(); i++) {

			String text = requiredDay.get(i).getText();

			if (text.equals(day)) {

				requiredDay.get(i).click();

			}

		}

	}

	// driver.findElement(By.cssSelector(".ui-datepicker-next.ui-corner-all"));
	//
	// driver.findElement(By.cssSelector(".ui-datepicker-prev.ui-corner-all"));
	//

}
