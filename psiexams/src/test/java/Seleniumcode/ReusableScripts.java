package Seleniumcode;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableScripts{
	static WebDriver driver;
	public static void launchBrowser(String browsername) throws InterruptedException  {
			if (browsername.equalsIgnoreCase("chrome")) {
			System.out.println(browsername);
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");		
			driver=new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\gayat\\Downloads\\geckodriver-v0.28.0-win32\\geckodriver.exe");		
				driver=new FirefoxDriver();

			
		}
				
		    
		    
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}     
	
	public static void openUrl(String url) {
		     driver.get(url);
		     //WebDriver driver = null;
		     //JavascriptExecutor js = (JavascriptExecutor) driver;
	}
	
	public static void click(By locator) throws InterruptedException {
		     driver.findElement(locator).click();
		     Thread.sleep(3000);
	}
	
	public static void IsSelected (By locator) {
				System.out.println(driver.findElement(locator));	
				boolean status = driver.findElement(locator).isSelected();

	     if (status == true) {
		System.out.println("Checkbox is selected");
	}
	
	}
	
	public static void dragNDrop(By locator, int X, int Y) throws InterruptedException {
		Actions action = new Actions(driver);
		try{
			action.dragAndDropBy(driver.findElement(locator),X,Y).perform();
		}catch (Exception e){
			e.printStackTrace();
			
		}
  		Thread.sleep(5000);
	}
	
	public static void mouseHoverAction(By locator) throws InterruptedException {
	    Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(locator)).perform();
		Thread.sleep(3000);
}
	
	public static void multipleKeyboardActions(int Keycode) throws InterruptedException, AWTException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(Keycode);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(Keycode);
		Thread.sleep(5000);	
		
	}
	public static void waitTime(int mlsnds) throws InterruptedException {
        Thread.sleep(mlsnds);
    }
	
	 public static void findElement(By locatorname){
	        driver.findElement(locatorname);
	    }
	 public static void sendKeys(By locatorname, String text){
	        driver.findElement(locatorname).sendKeys(text);
	    }
	 
	 public static void print(String text){
	        System.out.println(text);
	    }
	 public static void navigateBack(){
	        driver.navigate().back(); // clicking on back button
	    }

	    public static void navigateForward(){
	        driver.navigate().forward();
	    }

	    public static void navigateRefresh(){
	        driver.navigate().refresh(); // 1st way
	    }

	   public static void close() {
		   driver.close();
	   }
	   
	   public static void screenShot(String fileName) {
		    File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   try {FileUtils.copyFile(scrFile, new File(fileName));
	   } catch (Exception e) {
		   e.printStackTrace();
	   }
	   }
	   
	   public static void switchToFrameByIndex(int index) throws Throwable{
		   try {
			   driver.switchTo().frame(index);
		   }catch (Exception e) {
			   
			  e.printStackTrace();
		   }
	   }
	 
}
