package Seleniumcode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class resizable{
	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\gayat\\Downloads\\geckodriver-v0.28.0-win32\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 driver.switchTo().frame(0);
		WebElement resize = driver.findElement(By.xpath("//*[@id=\'resizable\']/div[3]"));
		Actions resizeaction = new Actions(driver);
		resizeaction.dragAndDropBy(resize,300,30).perform();
		Thread.sleep(3000);
	}
	
}