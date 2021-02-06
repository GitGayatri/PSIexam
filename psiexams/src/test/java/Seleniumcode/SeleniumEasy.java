package Seleniumcode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Bootstrap alerts
				/*driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
				driver.manage().window().maximize();
				Thread.sleep(3000);
			/*driver.findElement(By.id("normal-btn-success")).click();
			String text =driver.findElement(By.xpath("//html//body//div[2]//div//div[2]//div//div[2]//div[2]")).getText();
			System.out.println(text);
			Thread.sleep(8000);
			String text1 =driver.findElement(By.xpath("//html//body//div[2]//div//div[2]//div//div[2]//div[2]")).getText();
			System.out.println(text1);*/
			
			/*driver.findElement(By.xpath("//*[@id=\"autoclosable-btn-success\"]")).click();
			String text = driver.findElement(By.xpath("//html//body//div[2]//div/div[2]//div//div[2]//div[1]")).getText();
			System.out.println(text);
			Thread.sleep(8000);
			String text1 =driver.findElement(By.xpath("//html//body//div[2]//div/div[2]//div//div[2]//div[1]")).getText();	
			System.out.println(text1);	
				
				driver.close();*/
				 // handling List-box
		 driver.get("https://www.seleniumeasy.com/test/");
		 driver.manage().window().maximize();
         Thread.sleep(1500);
         		driver.findElement(By.xpath("//*[@id='at-cv-lightbox-button-holder']/a[2]")).click(); // handling popup
         		Thread.sleep(1000);
		        /*driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[2]/li[3]/a")).click();
		        Thread.sleep(1200);
		        driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[2]/li[3]/ul/li[1]/a")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//*[@id='listhead']/div[1]/div/input")).sendKeys("Morbi leo risus");
		        driver.findElement(By.xpath("//*[@id='listhead']/div[2]/div/a")).click();
		        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/button[2]")).click();
		        driver.findElement(By.xpath("//*[@id='listhead']/div[1]/div/input")).clear();
		        driver.findElement(By.xpath("//*[@id='listhead']/div[2]/div/a")).click();
		        driver.navigate().refresh();
		        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/ul/li[3]")).click();
		        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/ul/li[5]")).click();
		        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/button[1]")).click();
		        driver.navigate().refresh();
		        System.out.println("List-box task is done. ");*/

		        // handling Bootstrap Modals : Single Modal
		       /*driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[2]/li[2]")).click();
		        Thread.sleep(1200);
		        driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[2]/li[2]/ul/li[2]/a")).click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a")).click();
		        driver.switchTo().activeElement();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id='myModal0']/div/div/div[4]/a[1]")).click();
		        System.out.println("Single Modal task is done. ");*/

		        // handling Multi Modals
         		 driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[2]/li[2]")).click();
                 Thread.sleep(1200);
                 driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[2]/li[2]/ul/li[2]/a")).click();
                 Thread.sleep(500);
		        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a")).click(); // clicking on Launch Modal button
		        Thread.sleep(3000);
		        driver.switchTo().activeElement(); // switching to active element/Modal on the screen
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[3]/a")).click(); // opening 2nd Modal
		        Thread.sleep(3000);
		        driver.switchTo().activeElement();  // switching to active element/Modal on the screen
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id='myModal2']/div/div/div[6]/a[1]")).click(); // closing 2nd Modal
		        Thread.sleep(3000);
		        driver.switchTo().activeElement(); // switching to active element/Modal on the screen
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[4]/a[1]")).click(); // closing 1st Modal
		        System.out.println("Multi Modals task is done. ");

		       
		        driver.close();
		    }
	
}
