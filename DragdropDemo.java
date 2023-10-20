package Anoop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragdropDemo {

	private static final String Driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://jqueryui.com/droppable/");
    // Switch into frame
    WebElement framedrop = driver.findElement(By.tagName("iframe"));
    driver.switchTo().frame(framedrop);
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Thread.sleep(2000);
	 Actions ACT = new Actions(driver);
	 ACT.dragAndDrop(drag,drop).perform();
	 Thread.sleep(5000);
	 
	 driver.close();
	 
		
	}

}
