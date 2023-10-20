package AnoopYadavSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;


public class Date_Picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("start selenium Drag & Drop Projects");

		//02 may 2023
		String Expectedday = "25";
		String Expectedmonth = "September";
		String Expectedyear = "2024";

		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		//driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]/a")).click();
		// switch frame
		driver.switchTo().frame(0);

		//Find date picker webelement to perform click action

		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();

		while(true)
		{
			String month =
					driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();

			String year =
					driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();

			if (month.equals(Expectedmonth) && year.equals(Expectedyear)){
				List<WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));
				for (WebElement e:daylist){

					//System.out.println(daylist+"******************");
					String calenderday = e.getText();

					System.out.println(calenderday);

					if (calenderday.equals(Expectedday)){
						e.click();
						break;
					}
				}
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}




	}

}
