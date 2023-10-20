package Anoop;


	
		// TODO Auto-generated method stub
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;

		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.Select;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class DropDown {

			public static void main(String[] args) throws InterruptedException {
				
				// WebDriver driver ;
				// TODO Auto-generated method stub
				 WebDriverManager.firefoxdriver().setup();
				 String baseURL = "https://demo.guru99.com/test/newtours/register.php";
				    WebDriver driver = new FirefoxDriver();
					driver.get(baseURL);
					Select drpCountry = new Select(driver.findElement(By.name("country")));
					drpCountry.selectByVisibleText("BELIZE");
					Thread.sleep(5000);
					//drpCountry.deselectByVisibleText("BELIZE");
					drpCountry.selectByValue("BHUTAN");
					

					//Selecting Items in a Multiple SELECT elements
					Thread.sleep(5000);
					 WebDriverManager.firefoxdriver().setup();
					 String baseURL1 = "http://jsbin.com/osebed/2";
					    driver = new FirefoxDriver();
						driver.get(baseURL1);
//					driver.get("http://jsbin.com/osebed/2");
					Select fruits = new Select(driver.findElement(By.id("fruits")));
					fruits.selectByVisibleText("Banana");
					Thread.sleep(5000);
					fruits.selectByIndex(3);
			
		
		
		
		
		
	}

}
