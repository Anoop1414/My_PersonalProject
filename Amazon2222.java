package AnoopYadavSelenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon2222 {
		
			public static void main(String[] args) throws InterruptedException {
				
				
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				String titleH = driver.getTitle();
				System.out.println(titleH);
				WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
				Search.sendKeys("Phone");
				Search.submit();
				driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
				Set<String> windowhandles = driver.getWindowHandles();
				System.out.println(windowhandles);
				//driver.getWindowHandles();///
				System.out.println("________________________________________________________");

				Iterator<String> iterator = windowhandles.iterator();
				String parentwindow = iterator.next();
				System.out.println(parentwindow);
				String childwindow = iterator.next();
				System.out.println(childwindow);
				System.out.println("________________________________________________________"); 
				driver.switchTo().window(childwindow);
				String title = driver.getTitle();
				System.out.println(title);
				System.out.println("This is Child windows Id-->" + childwindow);
				driver.findElement(By.id("add-to-cart-button")).click();
				
				Thread.sleep(5000);
				driver.close();
				
				driver.switchTo().window(parentwindow);
				WebElement Search4 = driver.findElement(By.id("twotabsearchtextbox"));
				Search4.clear();
				Search4.sendKeys("Phone");
				Search4.submit();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[@class = 'a-button-text']")).click();
				
				Select Count = new Select(driver.findElement(By.name("quantity")));
				Count.selectByValue("3");
				
				driver.findElement(By.name("proceedToRetailCheckout")).click();
//				WebElement login = driver.findElement(By.id("claim-input"));
//				login.sendKeys("5555555555");
//				login.sendKeys(Keys.ENTER);
				Thread.sleep(5000);
			//driver.close();
			}

		}
		
		
		
		
		
		
	


