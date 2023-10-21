package YadavTestNG;


	import org.testng.annotations.Test;
	import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import org.testng.AssertJUnit;

	//import org.testng.Assert;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CrossBrowser {
		
		WebDriver driver;

		@BeforeMethod
		@Parameters("browser")
		public void LaunchBrowser(String browser) 
		{
			
			switch(browser.toLowerCase())
			{
			case "chrome":
				
				driver = new FirefoxDriver();
				break;
				
			case "msedge":
				
				driver = new EdgeDriver();
				break;
				
				default:
					driver =  null;
					break;
			}

		

		}

		@Test

		public void verifyTitle()

		{
			
		//open url
		driver.get("https://www.google.com");
		String expectedTitle = "Google";

		String actualTitle = driver.getTitle();
		System.out.println("actualTitle");
		AssertJUnit.assertEquals(expectedTitle, actualTitle);
		}
		
		public void  quit()
		{
			driver.quit();
		}


	}
	
	
	
	

