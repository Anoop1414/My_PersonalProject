package AnoopYadavSelenium;
import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Suggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		System.out.println("Hellow Word");
		System.out.println("Start Selenium Project");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("mobile");
		
		Thread.sleep(5000);
		
      List <WebElement> suggestion_list = driver.findElements(By.xpath("//div[@id='Alh6id']/div/div/ul/li"));
       int a = suggestion_list.size();
       
       //suggestion list id print
      // System.out.println(suggestion_list  +" ");
      
    	System.out.println(a);
		
		for (WebElement suggestion_name : suggestion_list) {
			 
			String suggestion_value = suggestion_name.getText();
			System.out.println(suggestion_value);
			
			Thread.sleep(8000);
			
		 if(suggestion_value.equalsIgnoreCase("mobile tracker")) {
				
		
				suggestion_name.click();			
				
				
			}
		
		 Thread.sleep(5000);
		}
		
		//driver.close();
		
		
		
	}

}
