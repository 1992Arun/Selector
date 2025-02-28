package org.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortDate {

	public static void java7() {

		String[] dates = { "24 Jul 2017", "25 Jul 2017", "11 Jun 1996", "01 Jan 2019", "12 Aug 2005", "01 Jan 1997" };

		final SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");

		Arrays.sort(dates, new Comparator<String>() {

			public int compare(String date1, String date2) {

				Date d1 = null;

				Date d2 = null;
				try {

					d1 = sdf.parse(date1);
					d2 = sdf.parse(date2);

					return d1.compareTo(d2);

				} catch (ParseException e) {

					e.printStackTrace();
				}
				return d1.compareTo(d2);

			}

		});

		for (String date : dates) {

			System.out.println(date);

		}

	}

	public static void sortDate() throws ParseException {

		String[] dates = { "24 Jul 2017", "25 Jul 2017", "11 Jun 1996", "01 Jan 2019", "12 Aug 2005", "01 Jan 1997" };

		// create a Set

		Set<Long> s = new TreeSet();

		// Declare Date format

		SimpleDateFormat f = new SimpleDateFormat("dd MMM yyyy");

		for (int i = 0; i < dates.length; i++) {

			// Iterate and add each date and add to set as long value

			//	f.parse(dates[i]).getTime();

			s.add(f.parse(dates[i]).getTime());

		}

		for (Long l : s) {

			System.out.println(f.format(l));

		}

	}

	public static void fibonaci() { // pre+cur = sum

		int pre = 0;
		int cur = 1;

		int sum = 0;

		System.out.println(0);

		for (int i = 0; i < 10; i++) {

			sum = pre + cur;

			pre = cur;

			cur = sum;

			System.out.println(sum);

		}

	}

	public static void reversnumber() {

		int num = 12345;

		for (int n = 1; n <= 100; n++) {

			int rev = 0;

			int a = n;

			while (a > 0) {

				int rem = a % 10;

				rev = (rev * 10) + rem;

				a = a / 10;

			}
			if (n == rev) {

				System.out.println(rev);

			}

		}

	}

	public static void armstrong() {

		List<Integer> li = new ArrayList();

		for (int n = 1; n < 1000; n++) {

			int a;

			int rev = 0;

			a = n;

			while (a > 0) {

				int rem = a % 10;

				rev = rev + (rem * rem * rem);

				a = a / 10;

			}



			if (n == rev) {

				System.out.println("Armstron Number" + n);

				li.add(n);

			} else {

				System.out.println(" Not an Armstron Number" + n);


			}

		}

		System.out.println(li);
	}



	public static void cala() throws ParseException {

		WebDriver driver  = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");

		driver.findElement(By.id("datetimepicker1")).click();

		String date = "12-09-1990";

		SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");

		Date parse = sim.parse(date);

		SimpleDateFormat yearf = new SimpleDateFormat("yyyy");

		SimpleDateFormat monthf = new SimpleDateFormat("MMMM");

		SimpleDateFormat dayf = new SimpleDateFormat("dd");

		String year = yearf.format(parse);

		String month = monthf.format(parse);

		String day = dayf.format(parse);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='dayContainer'])[1]//span[contains(@tabindex,'-1')]")));

		//	elements.get(11).click();

		//	System.out.println(elements.get(11).getText());
		
		WebElement findElement = driver.findElement(By.xpath("(//select[@class='flatpickr-monthDropdown-months'])[1]"));
		
		Select s = new Select(findElement);
		
		s.selectByVisibleText(month);
		
        List<WebElement> elements = driver.findElements(By.xpath("(//div[@class='dayContainer'])[1]//span[contains(@tabindex,'-1')]"));
		
		for(int i=0; i<elements.size(); i++) {

			String currentDay = elements.get(i).getText().trim();
			
			//wait.until(ExpectedConditions.elementToBeSelected(elements.get(i)));
		
			if(currentDay.equals(day)) {

				elements.get(i).click();

			}


		}

	
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='"+ year + "';", driver.findElement(By.xpath("(//input[@type='number'])[1]")));

		


	}

	public static void main(String[] args) throws ParseException {

		cala();
	}

}
