package Seleniumcode;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SpicejetCalendar extends ReusableScripts{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser();
		openUrl("https://www.spicejet.com/");
		driver.findElementByClassName("ui-datepicker-trigger").click();
		System.out.println(driver.findElement(By.className("ui-datepicker-month")).getText());
		
		int i=0;
		String actualMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		/*for (i=1;i<=12;i++) {
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
			actualMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			System.out.println(actualMonth);
			if (actualMonth.equalsIgnoreCase("May")) {
				
		 	 System.out.println(i); 
		 	 break;
			}
			
	}*/
		/*String expectedMonth= "May";
		while(!(actualMonth.equalsIgnoreCase(expectedMonth))){
			i++;
			System.out.println(actualMonth);
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
			actualMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
					 
			
		}
		System.out.println(i);*/
		close();
	}
}
