package org.selct;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {


		WebDriver driver = new ChromeDriver();

		driver.get("https://makemysushi.com/404");

		//get the elements under tagName a

		List<WebElement> elements = driver.findElements(By.tagName("a"));

		//Declare an Array


		for(int i=0; i<elements.size();i++) {

			if(elements.get(i).getAttribute("href") != null) {

				String link = elements.get(i).getAttribute("href");

				//convertlink into URL links

				URL url = new URL(link);

				URLConnection openConnection = url.openConnection();

				//call httpclass

				if(link.startsWith("https")) {

				HttpsURLConnection http =  (HttpsURLConnection)openConnection;

				System.out.println(http.getResponseCode()+" urls: "+link);

				}else {
					
					System.out.println("Non http links: "+link);
				}

			}
		}



	}

}
