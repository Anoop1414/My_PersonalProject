package Anoop;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class windowHandler2 {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		// TODO Auto-generated method stub

		//****************
		// Window Handeler is a Perticular id show and every id is spicial id
		//********************

		System.out.println("Window Handler");

		//WebDriverManager.firefoxdriver().setup();                   
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle = driver.getWindowHandle();// Parents
		System.out.println("parent window Id is -->" + parentHandle);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(5000);
		System.out.println("child window title is-->"+driver.getTitle());
		Set<String> handles = driver.getWindowHandles();//More than one I'd so its like a work in Array
		for (String handle : handles);
		{
			System.out.println(handles);
			if(!handles.equals(parentHandle)) {
				driver.switchTo().window("handles");
				System.out.println("child window");
				driver.manage().window().maximize();
				String title1 =driver.getTitle();//
				System.out.println("Childpageid==" +title1);
				driver.findElement(By.id("firstName")).sendKeys(" Yadav,Yadav");
				Thread.sleep (5000) ;
				//driver.close();
			}
		}
		driver.switchTo().window(parentHandle);
		driver.findElement (By.id("name")).sendKeys ("Reddy");		
		Thread.sleep(2000);
		driver.quit(); 
		System.out.println("Window Handler");
		WebDriverManager.firefoxdriver().setup();//id change work of handler;;;;
		WebDriver driver1 = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle1 = driver.getWindowHandle();// Parents
		System.out.println("parent window Id is -->" + parentHandle);


	}

}
