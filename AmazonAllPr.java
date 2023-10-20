package AnoopYadavSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAllPr {



			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
				    WebDriver driver ;
				    System.out.println("Hello");
				    
				    // initiate web browser
				   //WebDriverManager.firefoxdriver().setup();
				    driver = new EdgeDriver(); 
				     driver.manage().window().maximize();
				       driver.get("https://www.amazon.in/");
				    System.out.println(driver.getTitle());
				    // search wrist watch
				    WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
				    Search.sendKeys("Wrist Watches");
				    // click on search button
				    
				  
				    WebElement SearchButton = driver.findElement(By.id("nav-search-submit-button"));
				    SearchButton.click();
				    Thread.sleep(5000);
				    // click on Titan
				    driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']/span[text() ='Titan']")).click();
				    Thread.sleep(5000);
				    // click on 25% off
				    driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']/span[text() ='25% Off or more']")).click();
				    Thread.sleep(5000);
				    // click on Analog
				    driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']/span[text() ='Analogue']")).click();
				    Thread.sleep(5000);
				    // click on Leather
				    driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']/span[text() ='Leather']")).click();
				    
				    Thread.sleep(5000);
				    driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
			   
			   
//				     WebElement check1 = driver.findElement(By.xpath("//*[@id=\"p_89/Titan\"]/span/a/div/label/i"));
//				          check1.click();
//				     WebElement check2 = driver.findElement(By.xpath("//*[@id=\"p_n_feature_seven_browse-bin/1480900031\"]/span/a/div/label/i"));
//				      check2.click();
//				          WebElement check3 = driver.findElement(By.xpath("//*[@id=\"p_n_material_browse/1480907031\"]/span/a/div/label/i"));
//				          check3.click();
//				     driver.findElement(By.xpath("//*[@id=\"p_n_pct-off-with-tax/2665400031\"]/span/a/span")).click();
//				     driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[4]/ul/span[1]/li/span/a/span]")).click();
//				        
				     // /html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[4]/ul/span[1]/li/span/a/span
				    
				  
				

			}

		}
		
		
		
		
		
		
		
		

