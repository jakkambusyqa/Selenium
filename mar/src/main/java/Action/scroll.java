package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		Actions a = new Actions(driver);
		//scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		//scroll up a page
		a.sendKeys(Keys.PAGE_UP).build().perform();
		
	
		//driver.switchTo().alert().accept();
		
		
	/*	WebElement wb= driver.findElement(By.xpath("//h2[normalize-space()='Up to 60% off | boAt headphones & speakers']"));
		Thread.sleep(3000);
		
		Actions ab=new Actions(driver);
		
        ab.contextClick().perform();	
       */ 
		
		
	}

}
