package Seleniumcode;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleKeyboardActions extends ReusableScripts {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://jqueryui.com/draggable/");
			driver.manage().window().maximize();
			Thread.sleep(8000);
			/*Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_R);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_R);
			Thread.sleep(5000);*/
			
			multipleKeyboardActions(KeyEvent.VK_R);
			
		
	/*	driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_S);
				Thread.sleep(3000);*/
				
			multipleKeyboardActions(KeyEvent.VK_S);
			
			Runtime.getRuntime().exec("C:\\Users\\gayat\\Desktop\\Selenium.exe");
				Thread.sleep(5000);
				driver.close();
			
	}
	

}
