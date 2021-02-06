package Seleniumcode;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.psiexams.utilities.ReadingDataFromPropertyFile;
 
public class Autocomplete extends ReusableScripts {

	public static void main(String[] args) throws InterruptedException, IOException {
	 
		
        launchBrowser(ReadingDataFromPropertyFile.readingdata("browsername"));//since it is a static method, it can be called using syntax; classname.methodname
      /* openUrl("https://jqueryui.com/autocomplete/");
       driver.switchTo().frame(0);
       driver.findElement(By.id("tags")).sendKeys("a");
       List<WebElement>tags=driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
       for(int i=0;i<tags.size();i++) {
    	   String values=tags.get(i).getText();
    	   System.out.println(values);
    	   if (values.equalsIgnoreCase("basic")) {
    		   tags.get(i).click();
    		   break;
    	   }
       }
	   close();*/
       
    /*   openUrl("https://www.bing.com/"); 
       Thread.sleep(3000);
       driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
       
       List<WebElement>tags=driver.findElements(By.xpath("//*[@id='sa_ul']/li"));
       System.out.println(tags.size());
       for(int i=0;i<tags.size();i++) {
    	   String values=tags.get(i).getText();
    	   System.out.println(values);
    	    if (values.equalsIgnoreCase("selenium ide")) {
    	    	tags.get(i).click();
    		    
    		   break;
    	   }
       }
	   close();*/ 
       
	
	
	openUrl("http://automationpractice.com/index.php"); 
    driver.findElement(By.id("search_query_top")).sendKeys("dress");
    
    List<WebElement>tags=driver.findElements(By.xpath("//*[@id='index']/div[2]/ul/li"));
    System.out.println(tags.size());
    for(int i=0;i<tags.size();i++) {
 	   String values=tags.get(i).getText();
 	   System.out.println(values);
 	   if (values.equalsIgnoreCase("T-shirts > Faded Short Sleeve T-shirts")) {
 	    	tags.get(i).click();
 	     	break;
 	   }
	} 
    close();
	}
}	

