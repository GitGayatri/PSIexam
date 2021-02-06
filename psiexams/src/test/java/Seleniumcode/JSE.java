package Seleniumcode;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSE extends ReusableScripts {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		openUrl("http://only-testing-blog.blogspot.com/");
		// to scroll down		
		//reassign the driver object from chrome driver to javescriptexecutor to perform the Scroll,enable actions
		// using the object js, we can call the methods in JavascriptExecutor
		// Locate a webelement till which we have to scroll
	/*	WebElement element = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_feature_5\"]/li[3]/label/a"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(2000);*/
		
	



		WebElement element = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div[11]/div/div/div/h3/a"));
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);// arg0 is the command,arg1 is the parameter
		Thread.sleep(2000);
		// to enable disabled textbox
		/*WebElement lastname=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[12]/div/div/div/div[2]/div[1]/form[1]/input[2]"));
		js.executeScript("arguments[0].disabled = false", lastname);
		Thread.sleep(2000);
		lastname.sendKeys("Lstnm");
		Thread.sleep(2000);*/
			  
				  
				  
				  
				  
	
		// to make the hidden textbox visible
		//WebElement hiddenTextbox = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[12]/div/div/div/div[2]/div[1]/form[1]/text()[3]"));
		
	//	driver.executeScript
		//("document.getElementBy.xpath('/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[12]/div/div/div/div[2]/div[1]/form[1]/text()[3]').removeAttribute('hidden',0);");
			
		WebElement hidden_text = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[12]/div/div/div/div[2]/div[1]/form/input[3]"));
	 
		((JavascriptExecutor)driver).executeScript("document.getElementByXpath('/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[11]/div/div/div/div[2]/div[1]/form/input[3]').removeAttribute('hidden',0);"); // Enables the from date box
		  hidden_text.clear();
		  hidden_text.sendKeys("18"); 
		
		
		
		
		
		/*WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[12]/div/div/div/div[2]/div[1]/form/input[3]"));
		((JavascriptExecutor)driver).executeScript("document.getElementByXpath('/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[11]/div/div/div/div[2]/div[1]/form/input[3]').removeAttribute('hidden';0);"); args)
		  
          element1.clear();
		  element1.sendKeys("abc");*/
		  
		  
		  
		  
		  
		  

		  //Remove attribute "readonly" and overwrite in that text box
		/*openUrl("https://www.spicejet.com/");
		//JavascriptExecutor js =driver;
		
		WebElement elementFromDate = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		  driver.executeScript ("document.getElementById('ctl00_mainContent_view_date1').removeAttribute('readonly',0);"); // Enables the from date box
		  elementFromDate.clear();
		  elementFromDate.sendKeys("21/01/2021"); */
		  close();
	}

}
