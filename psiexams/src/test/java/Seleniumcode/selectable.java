package Seleniumcode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://jqueryui.com/");
				driver.manage().window().maximize();
				Thread.sleep(8000);
		      driver.findElement(By.linkText("Selectable")).click();
	        driver.switchTo().frame(0);
	        WebElement selectable1=driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
	        Actions action = new Actions(driver);
	        action.clickAndHold(selectable1).perform();
	        WebElement selectable2=driver.findElement(By.xpath("//*[@id='selectable']/li[3]"));
	        action.clickAndHold(selectable2).perform();
	        System.out.println("Action Selectable is done");

	}

}
