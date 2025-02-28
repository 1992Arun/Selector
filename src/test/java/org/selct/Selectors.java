package org.selct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selectors {


	public static void main(String[] args) throws InterruptedException {

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("--Start-Maximized");

		ch.addArguments("--incognito");

		ch.setPageLoadStrategy(PageLoadStrategy.NORMAL);

		WebDriver driver = new ChromeDriver(ch);

		//	driver.get("https://app.hubspot.com/login");

		//		driver.findElement(By.cssSelector("#username")).sendKeys("Arun");
		//		
		//		String text = driver.findElement(By.cssSelector("button.uiButton.private-button.private-button--primary.private-button--default.m-bottom-4.login-submit.private-button--non-link")).getText();
		//				
		//		System.out.println(text);
		//		
		//		Thread.sleep(5000);
		//		
		//		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("kumar");
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.cssSelector("input[type=email][id=username]")).sendKeys("12");
		//
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.cssSelector("input[type=email],[id=usme]")).sendKeys("12");
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.cssSelector("input[id*=user]")).sendKeys(Keys.CONTROL+"a", Keys.DELETE);
		//		
		//		driver.findElement(By.cssSelector("input[type=email],[id=usme]")).sendKeys("12");
		//
		//		Thread.sleep(5000);
		//		
		//		driver.findElement(By.cssSelector("input[id^=user]")).sendKeys("Hello");
		//	
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.cssSelector("input[id$=user]")).sendKeys("Hello");



		//		String text = driver.findElement(By.xpath("//a[normalize-space()='Blue Star']//self::a")).getText();
		//
		//		System.out.println(text);
		//
		//		String text1 = driver.findElement(By.xpath("//a[normalize-space()='Blue Star']//parent::a")).getText();
		//
		//		System.out.println(text1);
		//
		//		List<WebElement> findElements = driver.findElements(By.xpath("//a[normalize-space()='Blue Star']//ancestor::tr//child::td"));
		//
		//		System.out.println(findElements.size());
		//
		//		List<WebElement> findElements1 = driver.findElements(By.xpath("//a[normalize-space()='Blue Star']//ancestor::tr//descendant::a"));
		//
		//		System.out.println(findElements1.size());
		//		
		//		List<WebElement> findElements2 = driver.findElements(By.xpath("//a[normalize-space()='Blue Star']//following::a"));
		//
		//		System.out.println(findElements2.size());
		//
		//		List<WebElement> findElements3 = driver.findElements(By.xpath("//a[normalize-space()='Blue Star']//parent::td//following::a"));
		//
		//		System.out.println(findElements3.size());
		//
		//		List<WebElement> preceding = driver.findElements(By.xpath("//a[normalize-space()='Blue Star']//preceding::tr"));
		//
		//		System.out.println(preceding.size());

		//		driver.findElement(By.xpath(""));

		driver.get("https://help.blazemeter.com/docs/guide/intro.html");
		
		Thread.sleep(5000);

		List<WebElement> findElements = driver.findElements(By.cssSelector(".off-canvas-accordion.vertical.menu.sidenav>li"));

		System.out.println(findElements.size()); 

		WebElement findElement = driver.findElement(By.cssSelector(".off-canvas-accordion.vertical.menu.sidenav>li:first-of-type"));

		System.out.println(findElement.getText());

		//		WebElement findElement1 = driver.findElement(By.cssSelector(".off-canvas-accordion.vertical.menu.sidenav>li:second-of-type"));
		//
		//		System.out.println(findElement1.getText());

		WebElement findElement2 = driver.findElement(By.cssSelector(".off-canvas-accordion.vertical.menu.sidenav>li:last-of-type"));

		System.out.println(findElement2.getText());

		List<WebElement> findElements2 = driver.findElements(By.cssSelector(".off-canvas-accordion.vertical.menu.sidenav>li:nth-of-type(odd)"));

		System.out.println(findElements2.size());

		List<WebElement> findElements3 = driver.findElements(By.cssSelector(".off-canvas-accordion.vertical.menu.sidenav>li:nth-of-type(even)"));

		System.out.println(findElements3.size());
		
		List<WebElement> findElements4 = driver.findElements(By.cssSelector(".off-canvas-accordion.vertical.menu.sidenav>li:nth-of-type(3n)"));

		System.out.println(findElements4.size());
		
		driver.quit();
		
		

	}

}
