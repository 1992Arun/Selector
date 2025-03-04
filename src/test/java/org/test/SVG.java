package org.test;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SVG {

	public static void svd() {


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.numbeo.com/quality-of-life/");

		WebElement element = driver.findElement(By.xpath("//*[name()='svg' and @aria-label]//*[name()='text' and contains(text(),'Quality')]"));

		System.out.println(element.getText());



		List<WebElement> findElements = driver.findElements(By.xpath("//*[name()='svg']//*[name()='g' and @ clip-path]//*[name()='g'][2]//*[name()='rect']"));

		for(WebElement x:findElements) {

			Actions a = new Actions(driver);

			a.moveToElement(x).perform();

			WebElement findElement = driver.findElement(By.xpath("//*[name()='svg' and @aria-label]//*[name()='g']//*[name()='g' and @class]//*[name()='g']"));

			System.out.println(findElement.getText());

			System.out.println(" ");

		}

	}

	public static void close() {

		WebDriver driver = new ChromeDriver();

		ChromeOptions op = new ChromeOptions();

		op.setCapability("browser version", "latest");

		op.setCapability("bstack:options", getBrowserStackOptions("os", "osVersion"));

		//	return new RemoteWebDriver(new URL(), op); 

	}

	public static HashMap getBrowserStackOptions(String os, String osVersion) {


		HashMap mp = new HashMap();

		mp.put("os", os);
		mp.put("Os Version", osVersion);

		return mp;

	}


	public static void worldpop(){


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/world-population/");

		WebElement element= driver.findElement(By.cssSelector(".maincounter-number>span"));

		System.out.println(element.getText());

		List<WebElement> today = driver.findElements(By.cssSelector(".col1in>div"));

		for(WebElement x:today) {

			System.out.println(x.getText());	

		}

		List<WebElement> year = driver.findElements(By.cssSelector(".col2in>div"));

		for(WebElement x:year) {

			System.out.println(x.getText());	

		}


	}

	public static void gettable() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		List<WebElement> findElement = driver.findElements(By.xpath("//tr[not(position()=1)]"));

		for(WebElement x:findElement) {

			System.out.println(x.getText());	

		}
		
		List<WebElement> findElement1 = driver.findElements(By.xpath("//tr[2]//td[not(position()=4)]"));

		for(WebElement x:findElement1) {

			System.out.println(x.getText());	

		}


	}

	public static void main(String[] args) {

		gettable();

	}

}
