package Anoop;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateTo {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		//driver.get("https://www.flipkart.com");
		driver.navigate().to("https://www.flipkart.com");

		driver.navigate().back();  //amazon
		Thread.sleep(5000);
		driver.navigate().forward();  //flipkart
		Thread.sleep(5000);
		driver.navigate().refresh();  //flipkart
		Thread.sleep(5000);




	}

}

	


