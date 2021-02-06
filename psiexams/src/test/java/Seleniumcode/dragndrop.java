package Seleniumcode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop extends ReusableScripts{
	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://jqueryui.com/draggable/");
			driver.manage().window().maximize();*/
		    launchBrowser("chrome");
			Thread.sleep(3000);
			
			openUrl("https://jqueryui.com/draggable/");
			
			driver.switchTo().frame(0);
			
		    /*WebElement draggable = driver.findElement(By.id("draggable"));
			Actions action = new Actions(driver);
			action.dragAndDropBy(draggable,294,0).perform();
	  		Thread.sleep(5000);*/
			
			dragNDrop(By.id("draggable"),294,0);
			
			Thread.sleep(3000); 
			 // Dragging and dropping object to specified location.
	        driver.findElement(By.linkText("Droppable")).click();
	        driver.switchTo().frame(0); // connecting to objects inside a frame on the screen
	        WebElement droppable1=driver.findElement(By.id("draggable"));
	        WebElement droppable2=driver.findElement(By.id("droppable"));
	        Actions action=new Actions(driver);  // using 'Actions' to perform any action like drag and drop / resize etc...
	        action.dragAndDrop(droppable1,droppable2).perform();
	        System.out.println("Action Drag and drop object is performed");
			//driver.close();
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\gayat\\Downloads\\geckodriver-v0.28.0-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		WebElement draggable = driver.findElement(By.xpath("//*[@id=\'todrag\']/span[2]"));
		WebElement target1 = driver.findElement(By.id("mydropzone"));
		
		
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, target1).perform();
		//Thread.sleep(9000);
		//driver.close();*/
	
	
	
	
	
	}

}
