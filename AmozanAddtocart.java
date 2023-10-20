package AnoopYadavSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmozanAddtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriver driver;
       driver = new EdgeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro");
       driver.findElement(By.id("nav-search-submit-button")).click();
       
      // JavascriptExecutor js = (JavascriptExecutor) driver;
      // js.executeScript("window.scrollBy(0,350)", "");
     JavascriptExecutor   anoop = (JavascriptExecutor) driver;
     anoop.executeScript("windows.scrollBy(0,180)", "");
       
      // driver.findElement(By.className("a-section aok-relative s-image-fixed-height")).click();
		driver.close(); 
		
		
		
		
		
	}

}
