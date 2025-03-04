package org.base;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Shadow {

	static void waits() {

		WebDriver driver = new ChromeDriver();

		WebElement fl = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(200))
				.ignoring(ArithmeticException.class)

				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

	}

	public static void popuos(){

		ChromeOptions op = new ChromeOptions();

		op.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(op);

		driver.get("https://www.hdfcbank.com/");

		driver.manage().window().maximize();

		//driver.switchTo().alert().dismiss();

	}

	public static void path() {

		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\Downloads";

		Map<String,Object> mp = new HashMap();

		mp.put("download.default_directory", path);

		ChromeOptions op = new ChromeOptions();

		op.setExperimentalOption("prefs", mp);

		WebDriver driver = new ChromeDriver(op);

		driver.get("https://samplelib.com/sample-jpeg.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//a[text()='Download'])[1]")).click();

	}


	public static void main(String[] args) {

      
		


	}

	public static void shadow() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.alodokter.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;

		Object ob = js.executeScript("return document.querySelector('#top-navbar-view').shadowRoot.querySelector('.top-navbar>.container-fluid>.top-navbar-inner>.top-navbar-left>.search-bar>form>input')");


		WebElement  element = (WebElement)ob;

		//	document.querySelector('#top-navbar-view').shadowRoot.querySelector('.top-navbar>.container-fluid>.top-navbar-inner>.top-navbar-left>.search-bar>form>input')

		element.sendKeys("arun");

		//	driver.findElement(By.id("searchinput")).sendKeys("arun");

		Object obj = js.executeScript("return document.querySelector('#top-navbar-view').shadowRoot.querySelector('.top-navbar>.container-fluid>.top-navbar-inner>.top-navbar-right>.navbar-button.no-session>.download-button>a')");

		WebElement el = (WebElement)obj;

		el.click();

		Actions a = new Actions(driver);

		a.doubleClick().perform();

		a.sendKeys();



		WebElement findElement = driver.findElement(By.cssSelector("#top-navbar-view"));

		SearchContext shadowRoot = findElement.getShadowRoot();

		shadowRoot.findElement(By.id("searchinput")).sendKeys("kumar");

	}

}
