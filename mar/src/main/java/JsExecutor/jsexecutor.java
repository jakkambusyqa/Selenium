package JsExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement location=driver.findElement(By.xpath("//i[@class='downloadApp3Icon footerIconsImg downloadIconsImg']"));
		
		Point loc=location.getLocation();
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy"+loc);

	}

}
