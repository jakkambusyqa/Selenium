package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
    	Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
//		
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//		Thread.sleep(2000);
// 
//		Alert aw=driver.switchTo().alert();
//		System.out.println("This message displayed on alert: "+aw.getText());
		
	}

}
