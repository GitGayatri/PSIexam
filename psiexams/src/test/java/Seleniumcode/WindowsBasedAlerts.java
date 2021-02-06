package Seleniumcode;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsBasedAlerts {


		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
						driver.get("https://www.naukri.com/");
						driver.manage().window().maximize();
						Thread.sleep(3000);
						driver.findElement(By.id("wdgt-file-upload")).click();
						Thread.sleep(3000);
						Runtime.getRuntime().exec("C:\\Users\\gayat\\Desktop\\uploadfile.exe");
						Thread.sleep(3000);
						driver.close();
		}

}
