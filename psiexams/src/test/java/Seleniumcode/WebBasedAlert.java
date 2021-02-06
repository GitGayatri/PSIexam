package Seleniumcode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class WebBasedAlert extends ReusableScripts{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				launchBrowser("chrome");
				
				openUrl("https://candidate.psiexams.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				click(By.linkText("Create"));
				//driver.findElement(By.linkText("Create")).click();
				driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
				driver.findElement(By.name("firstname")).sendKeys("Gayatri");
				driver.findElement(By.name("lastname")).sendKeys("Ranga");
				driver.findElement(By.name("Submit")).click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				
				System.out.println(driver.switchTo().activeElement().getAttribute("name"));
				
				

	}

}
	
