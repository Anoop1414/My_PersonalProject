package Anoop;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

		public class CheckBox {

			public static void main(String[] args) throws InterruptedException {
				WebDriver driver;

				driver = new EdgeDriver();

				//Maximize Browser
				driver.manage().window().maximize();
				//Open URL
				driver.get("https://the-internet.herokuapp.com/checkboxes");


				// UnCheck both CheckBoxes
				//WebElement check1 = driver.findElement(By.xpath("//input[@type ='Checkbox'][1]"));
				//check1.click();
				//Thread.sleep(7000);
				WebElement check2 = driver.findElement(By.xpath("//input[@type ='checkbox'][2]"));
				check2.click();
				Thread.sleep(5000);

				// checked both check boxes
				WebElement chek1 = driver.findElement(By.xpath("//input[@type ='checkbox'][1]"));
				chek1.click();
				Thread.sleep(7000);
				WebElement chek3 = driver.findElement(By.xpath("//input[@type ='checkbox'][2]"));
				chek3.click();
				Thread.sleep(5000);

				//   driver.close();

			}

		}		
		
		
		
		
	


