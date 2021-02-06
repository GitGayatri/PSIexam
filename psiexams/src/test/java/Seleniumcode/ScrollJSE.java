package Seleniumcode;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollJSE extends ReusableScripts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		openUrl("http://automationpractice.com/index.php?id_category=8&controller=category");
		JavascriptExecutor js= (JavascriptExecutor) driver;		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_feature_5\"]/li[3]/label/a"));
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(2000);
		close();
	}

}
