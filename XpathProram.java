package AnoopYadavSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathProram {

	

	//private static final String Search = null;

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver;
		System.out.println("Welcome");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println("driver.getTitle");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Wrist Watch");
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		JavascriptExecutor SD1 = (JavascriptExecutor) driver;
		SD1.executeScript("window.scrollBy(0,510)", "");
		
		// Click on 
		driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']/span[text() ='Fastrack']")).click();
		JavascriptExecutor SD2 = (JavascriptExecutor) driver;
		SD2.executeScript("window.scrollBy(0,510)", "");
		
		driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']/span[text()='TIMEX']")).click();
			
		
		JavascriptExecutor SD3 = (JavascriptExecutor) driver;
		SD3.executeScript("Window.scrollBy(0,710)", "");
		
		driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']/span[text()='35% Off or more']")).click();
		
		driver.findElement(By.xpath("a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro")).click();
		
		
		
		
		
		
		  
		
		
	}	
		
		

	}


