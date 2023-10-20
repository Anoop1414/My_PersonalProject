package AnoopYadavSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
    	search1.click();
    	WebElement element = driver.findElement(By.xpath("//div[@class ='_37M3Pb']/div[2]/a/div[2][text()='Mobiles']"));
    	element.click();
		WebElement Search = driver.findElement(By.xpath("//div[@class='_37M3Pb']/div/a/div[2][text()='Grocery']"));
		Search.click();
		WebElement serach2 = driver.findElement(By.xpath("//input[@class='_166SQN']"));
	    serach2.sendKeys("224201");
		
			
		
	}

}
