package Seleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
public class mortgage {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\gayat\\Downloads\\geckodriver-v0.28.0-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mortgagecalculator.org/");
		System.out.println((driver.getTitle()));
	    driver.findElementById("homeval").sendKeys("100000");
	    driver.findElementById("downpayment").sendKeys("10000");
	    driver.findElementById("loanamt").sendKeys("90000");
		driver.findElementById("intrstsrate").sendKeys("2.5");
		driver.findElementById("loanterm").sendKeys("30");
		driver.findElementById("pptytax").sendKeys("1000");
		driver.findElementById("pmi").sendKeys("0.5");
		driver.findElementById("hoi").sendKeys("1000");
		driver.findElementById("hoa").sendKeys("10");
		
	}

}


