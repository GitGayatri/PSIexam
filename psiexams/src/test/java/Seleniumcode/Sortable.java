package Seleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		  driver.findElement(By.linkText("Sortable")).click();
	        driver.switchTo().frame(0);
	        WebElement sortable=driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
	        Actions action = new Actions(driver);
	        action.dragAndDropBy(sortable,9,92).perform();
	        System.out.println("Action sortable is done");
	       
	        

	}

}
