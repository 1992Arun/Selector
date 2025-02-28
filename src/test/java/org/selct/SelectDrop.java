package org.selct;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDrop {

	static void selectproduct(WebDriver driver, String attribute) throws InterruptedException{

		WebElement findElement = driver.findElement(By.xpath("//li[text()='"+attribute+"']"));

		Thread.sleep(3000);

		((JavascriptExecutor)driver).executeScript("arguments[0].click()", findElement);
	}

	static void multiple(WebDriver driver) {

		WebElement element = driver.findElement(By.name("multipleselect[]"));

		Select s = new Select(element);

		System.out.println(s.isMultiple());
		
		s.selectByIndex(1);

		s.selectByIndex(0);

		s.selectByIndex(3);

		//getFirstSelected Option
		
		System.out.println("get First Selected Option: "+ s.getFirstSelectedOption().getText());
		
		List<WebElement> options = s.getOptions();

		//getSelected Option
		
		for(WebElement x : options) {

			if(x.isSelected()) {

				System.out.println(x.getText());

			}

		}
		
		//getunSelected Option

		for(WebElement x : options) {

			if(!x.isSelected()) {

				System.out.println("unSelected Options: "+x.getText());

			}

		}

		
		//selectAll
		
		for(int i=0; i<options.size()-1;i++) {

			s.selectByIndex(i);

		}


	}
	
	public static void autosuggestion(WebDriver driver) throws InterruptedException, IOException{
		
		//driver.findElement(By.id("APjFqb")).sendKeys("Sachin");
		
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Google Search'])[2]")));
		
		
		File screenshotAs = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).getScreenshotAs(OutputType.FILE);

		org.openqa.selenium.io.FileHandler.copy(screenshotAs, new File(System.getProperty("user.dir")+"\\src\\test\\java\\arun.png"));
		
		Thread.sleep(5);
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']//li")));
		
	//	System.out.println(driver.findElement(By.id("ERWdKc")).getText());
		
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		System.out.println(findElements.size()); 
		
		
		for(int i=0; i<findElements.size();i++) {
			
			  System.out.println(findElements.get(i).getText()); 
		}
				
	//	findElements.get(1).click();
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].click()", findElements.get(1));
		
	}
	
	public static void actions1class(WebDriver driver){
		

		WebElement findElement = driver.findElement(By.name("search"));
		
		Actions a  =new Actions(driver);
		
		
	//	findElement.sendKeys("arun");
		
		findElement.click();

		a.keyDown(Keys.SHIFT);
		
		a.sendKeys("Arun").perform();
		
		
	}



	public static void main(String[] args) throws InterruptedException, IOException {
		

				
		WebDriver	driver = new ChromeDriver();
				
				driver.manage().window().maximize();

				driver.get("https://www.google.com/");

				autosuggestion(driver);
	
		

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		
		autosuggestion(driver);

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		multiple(driver);




		//	driver.switchTo().alert().dismiss();

		//	    driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]")).click();
		//		 
		//		List<WebElement> findElements = driver.findElements(By.cssSelector(".dropdown1.dropdown-menu>li"));
		//		
		//findElements.get(10).click();
		//				
		//		selectproduct(driver, "Deposits");



	}

}
