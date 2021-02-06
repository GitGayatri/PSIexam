package Seleniumcode;
import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindowHandling extends ReusableScripts{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		openUrl("https://candidate.psiexams.com/");
		String parent_window=driver.getWindowHandle();
		click(By.linkText("PSI Bookstore"));
		Set <String> child_windows = driver.getWindowHandles();
		for(String windowNames: child_windows) {
			System.out.println(windowNames);
			if(!windowNames.equalsIgnoreCase(parent_window)) {
				driver.switchTo().window(windowNames);//to switch to child window
				driver.findElement(By.id("search_queryispbxi_")).sendKeys("Hi");// to confirm that the focus moved from parent to child window
			
			}
			
		}
		close();
		driver.switchTo().window(parent_window);
		click(By.linkText("Academic"));
	}

}
