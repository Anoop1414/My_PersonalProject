package AnoopYadavSelenium;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

		import java.util.List;
		public class TableHandle2 {
			
		            public static void main(String[] args) {

		                System.out.println("start selenium Table handle Projects");
		                System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		                WebDriver driver = new EdgeDriver();
		                driver.manage().window().maximize();
		                driver.get("https://testautomationpractice.blogspot.com/");
		                //Print single cell
		                WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		                String text = element.getText();
		                System.out.println("print data-->" +text);

		                System.out.println("Below is no. of Row & Column ------------");
		                // to print all rows of the table
		                List<WebElement> Rows = driver.findElements(By.xpath("//table[@name = 'BookTable']/tbody/tr"));
		                System.out.println("Total rows in table is -->" +Rows.size());

		                // to print all column of the table
		                List<WebElement> column = driver.findElements(By.xpath("//table[@name = 'BookTable']/tbody/tr[1]/th"));
		                System.out.println("Total column in table is -->" +column.size());

		                // Print all data
		                for(int r=2; r<= Rows.size();r++){
		                    for(int c=1; c<=column.size();c++){
		                        String data = driver.findElement(By.xpath("//table/tbody/tr[" + r +"]/td[" + c +"]")).getText();

		                        System.out.println(data);

		                    }

		                }

		                driver.close();

		            }

		        }

