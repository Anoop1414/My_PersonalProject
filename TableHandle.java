package AnoopYadavSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Start Selenium Table handle Project");
        System.setProperty("Webdriver.gecko.driver","C:/geckodriver.exe");
        WebDriver driver;
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/vinay%20gupta/Desktop/Selenium%20Program/table.html");
        WebElement cell = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
        String text = cell.getText();
        System.out.println("Printdata---------->" +text);
        System.out.println("---------------------------------Ayodhya---------------------------------------------------");
        System.out.println("Below is no of Row and Column");
        System.out.println("____________________________Yadav_________________________________________________________________");
        // to Print all rows of the table
       List< WebElement> Rows= driver.findElements(By.xpath("//table/tbody/tr"));
       System.out.println("Total Rows in table is ------------>" + Rows.size());
       System.out.println("---------------------------------------------");
		// to print all column of the table
       List<WebElement>Column = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
       System.out.println("Total column table is --------->"+ Column.size());
       System.out.println("---------------------------------------------------------------------");
       for(int r = 2; r<= Rows.size();r++){
    	   for(int c=1; c<=Column.size();c++) {
    		 String data = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText();
    		 System.out.println("__________________________________________________________________");
    	   }
       }
		
		
		
	}

}
