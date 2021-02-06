package Seleniumcode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover extends ReusableScripts{
	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		        launchBrowser("chrome");
		        //System.setProperty("webdriver.chrome.driver","C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				Thread.sleep(8000);
				System.out.println(driver.findElement(By.className("_2I9KP_")).getText());
				/*WebElement electronics =driver.findElement(By.className("_2I9KP_"));
				Actions action = new Actions(driver);
				action.moveToElement(electronics).perform();
				Thread.sleep(3000);*/
				mouseHoverAction(By.className("_2I9KP_"));
				
				/*driver.findElement(By.linkText("Mi")).click();
				Thread.sleep(3000);*/
				click(By.linkText("Mi"));
				
				String text = driver.findElement(By.className("_10Ermr")).getText();
				System.out.println(text);
				driver.close();


	}

}
