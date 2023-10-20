package AnoopYadavSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Popuminimize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		 driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 
         driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
         
		 driver.switchTo().alert().accept();
		
		 driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
		
		driver.switchTo().alert().accept();
		
	       driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();
	       
	       Alert alertwindow = driver.switchTo().alert();
	       
	       System.out.println("message display----------------->"  +alertwindow.getText() );
	       Thread.sleep(3000);
	       
	       alertwindow.sendKeys("Anoop");	       
	       Thread.sleep(3000);
	       
	       driver.switchTo().alert().accept();
	       
	       
	       
	       
		
		
		
		
		
		
		
	}

}
