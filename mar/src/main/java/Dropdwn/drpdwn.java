package Dropdwn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdwn {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement we=driver.findElement(By.xpath("//select[@id='input-country']"));
		
	      
		Select drpCountry = new Select(we);
	      
		  List<WebElement> wealp=drpCountry.getOptions();
		    
		
		  for (WebElement wl : wealp) 
		  {
			    
			  if(wl.getText().equals("Italy")) 
			  {
				  wl.click();
				  break;
				  
			  }
			
		}
		
	}

}
