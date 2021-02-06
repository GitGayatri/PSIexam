package Seleniumcode;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable extends ReusableScripts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		openUrl("https://money.rediff.com/gainers");
		WebElement table_body = driver.findElement(By.xpath("//*[@id=\'leftcontainer\']/table/tbody"));
		List<WebElement> table_row = table_body.findElements(By.tagName("tr"));
		for(int row=0;row<2;row++) {
		List<WebElement> table_col=table_row.get(row).findElements(By.tagName("td"));
		
			for(int col=0; col<table_col.size();col++){
			String value=table_col.get(col).getText();
			System.out.println(value);
		}
	}
		close();
		
		/*openUrl("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		WebElement table_body = driver.findElement(By.xpath("//*[@id=\'task-table\']/tbody"));
		List <WebElement>table_row = table_body.findElements(By.tagName("tr"));
		for(int row=0;row<table_row.size();row++) {
			List<WebElement> table_col=table_row.get(row).findElements(By.tagName("td"));
			for(int col=0;col<table_col.size();col++) {
				String value= table_col.get(col).getText();
				System.out.println(value);
			}
		}
		
		close();*/
		
		// When the tag names are not tr and td
		
	/*	openUrl("http://demo.automationtesting.in/WebTable.html");
		Thread.sleep(2500);
		//WebElement table_body =driver.findElement(By.xpath("//*[@id=\'1609186792506-grid-container\']/div[2]/div"));
		List <WebElement> table_row = driver.findElements(By.xpath("//*[@id='1609878488769-grid-container']/div[2]/div/div"));// Take the xpath of the row that gives the no. of rows 
		System.out.println(table_row.size());
		for(int row=0;row<table_row.size();row++) {
			List<WebElement> table_col=table_row.get(row).findElements(By.xpath("//*[@id='1609878488769-grid-container']/div[2]/div/div[1]/div/div"));
			System.out.println(table_col.size());
			for(int col=0;col<table_col.size()-1;col++) {
				String value= table_col.get(col).getText();
				System.out.println(value);
			}
		}
		close();*/
	}

	}

