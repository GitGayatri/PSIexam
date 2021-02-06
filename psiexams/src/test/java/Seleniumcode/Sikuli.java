package Seleniumcode;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	
		public static void main(String[] args) throws InterruptedException, FindFailed{
			// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
						driver.get("https://www.naukri.com/");
						driver.manage().window().maximize();
						Thread.sleep(5000);
						driver.findElement(By.id("wdgt-file-upload")).click();
						Screen sc = new Screen();
						Pattern filepath =new Pattern("C:\\Users\\gayat\\Desktop\\Capture1.PNG");
						Pattern openbutton =new Pattern("C:\\Users\\gayat\\Desktop\\Capture2.PNG");
						sc.type(filepath, "C:\\Users\\gayat\\Desktop\\uploadfile.txt");
						Thread.sleep(5000);
						sc.click(openbutton);
						Thread.sleep(3000);
						driver.close();
	}




	}


