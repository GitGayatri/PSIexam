package Seleniumcode;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlipkartApp extends ReusableScripts {
	static boolean status;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		launchBrowser("chrome");
		openUrl("https://www.flipkart.com/");
		click(By.xpath("/html/body/div[2]/div/div/button"));
		
		mouseHoverAction(By.className("_2I9KP_"));
		click(By.linkText("Samsung"));
		String mainPage= driver.getCurrentUrl();
		String parent_window = driver.getWindowHandle();
		System.out.println(mainPage);
		Thread.sleep(3000);
		
		
		//To loop the  price range categories
		List<WebElement> PriceCategory = driver.findElements(By.xpath("//*[@id=\'container\']/div/div[3]/div[3]/div/div/div[1]/div[2]/a"));
		
		for(int row=1;row<PriceCategory.size();row++) {
		// To click on the View all button	
			System.out.println(PriceCategory.get(row).getText()+row);
			PriceCategory.get(row).click();
			// To find the no. of pages in this category
			Thread.sleep(2000);   
			
			List<WebElement> Noofpages =driver.findElements(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[2]/div/div/div/nav/a"));
			System.out.println(Noofpages.size());
			for (int page=1;page<Noofpages.size()-1;page++) {
				Thread.sleep(2000);   
				// looping in one page
				List <WebElement>table_row = driver.findElements(By.xpath("//*[@id=\'container\']/div/div[3]/div[2]/div/div[2]/div"));// Take the xpath of the row that gives the no. of rows 
				for(int row1=1;row1<table_row.size()-2;row1++) {
					String actualmobile = table_row.get(row1).findElement(By.className("_4rR01T")).getText();
					//System.out.println(actualmobile);
				    status =actualmobile.equalsIgnoreCase("Samsung Galaxy A20 (Gold, 32 GB)");
					if (status == true) {
						   System.out.println("Match found");
						   click(By.xpath("//*[@id=\'container\']/div/div[3]/div[2]/div/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]"));
						   Set <String> child_windows = driver.getWindowHandles();
							for(String windowNames: child_windows) {
								System.out.println(windowNames);
								if(!windowNames.equalsIgnoreCase(parent_window)) {
									driver.switchTo().window(windowNames);
									click(By.xpath("//*[@id=\'container\']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
								Thread.sleep(2000);
								}
							}  break;
				    }
				}
				if (status == true) {
					   break;
				}
				Noofpages.get(page).click();
			}	
			if (status == true) {
					   break;
			}
			Thread.sleep(2000);   
			System.out.println("category done");
			driver.navigate().to(mainPage);
			driver.navigate().refresh();
			PriceCategory = driver.findElements(By.xpath("//*[@id=\'container\']/div/div[3]/div[3]/div/div/div[1]/div[2]/a"));
			
	}	
		driver.quit();
	}
		}


	