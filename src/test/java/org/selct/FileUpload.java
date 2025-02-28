package org.selct;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demo.guru99.com/test/upload/");

		FluentWait<WebDriver> f = new FluentWait(driver);
		
		f.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class);

		 f.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#uploadmode1")));

		 WebElement element = f.until(ExpectedConditions.elementToBeClickable(new By.ByCssSelector("#uploadmode1")));
		 element.click();

		
		Thread.sleep(4000);

		//		 findElement.sendKeys("C:\\Users\\Arun\\Downloads\\IMG_20241127_105910.jpg");
		//		 
		StringSelection s = new StringSelection("C:\\Users\\Arun\\Downloads\\IMG_20241127_105910.jpg");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);


	}

}
