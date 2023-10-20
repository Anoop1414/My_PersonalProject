package AnoopYadavSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EndToEndProductProceed {


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

		// Click on FASTRACK watch
		driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']/span[text() ='Fastrack']")).click();

		JavascriptExecutor SD2 = (JavascriptExecutor) driver;
		SD2.executeScript("window.scrollBy(0,510)", "");

		// Click on TIMEX watch
		driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']/span[text()='TIMEX']")).click();

		driver.findElement(By.linkText("Analog Men's Watch (Dial Colored Strap)")).click();	

		Thread.sleep(3000);
		// click on add to cart 
		driver.findElement(By.xpath("//*[@id='a-button-inner']")).click();

		// xpath for proceed item
		driver.findElement(By.xpath("//input[@title='Buy Now']")).click();

		// scroll down page
		JavascriptExecutor SD3 = (JavascriptExecutor) driver;	
		SD3.executeScript("Window.scrollBy(0,510)", "");


		// click on proceed 
		driver.findElement(By.xpath("//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro']")).click();

		driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("9795000037");

		driver.findElement(By.xpath("//input[@id='continue']")).click();



	}

}






