package Seleniumcode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class loginweb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			// Create object for class
			// Syntax  X driver=new X ();
			//invoke .exe file
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Downloads\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        
	    driver.get("https://cibc.com/");
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("No, keep me on CIBC Canada")));
	    driver.findElement(By.linkText("No, keep me on CIBC Canada")).click();
	    driver.findElement(By.id("button-1543417624262")).click();
	    
        		
    
	  
		}
	

	}

