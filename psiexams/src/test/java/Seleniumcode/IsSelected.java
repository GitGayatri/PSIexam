package Seleniumcode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSelected extends ReusableScripts {
	
		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Downloads\\chromedriver_winnew\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();*/
			launchBrowser("chrome");
			
					driver.get("https://www.bing.com/");
					driver.manage().window().maximize();
					Thread.sleep(3000);
					//driver.findElement(By.id("id_sc")).click();
					//Thread.sleep(3000);
					//driver.findElement(By.className("hb_titlerow")).click();
					//Thread.sleep(3000);
					//driver.findElement(By.linkText("More")).click();
					//Thread.sleep(3000);
					/*boolean status = driver.findElement(By.id("newwnd")).isSelected();
					if (status == true) {
						System.out.println("Checkbox is selected");
					}
					else {
					driver.findElement(By.id("newwnd")).click();
					
					}*/
					/*boolean status = driver.findElement(By.id("newsnt")).isSelected();
					if (status == true) {
						System.out.println("Checkbox is selected");
					}*/
					
				//System.out.println(driver.findElement(By.id("newsnt")));
					
					//IsSelected(By.id("newsnt"));
					//driver.close();
					
					
					
	}

		
		
		        // IsDisplayed
		    /*    boolean  status= driver.findElement(By.id("bLogo")).isDisplayed();{
		            if(status==true){
		                System.out.println("Logo is present");
		            }
		            else{
		                System.out.println("Logo is not present");
		            }*/
		        
		        // IsEnabled
		         /*boolean status=driver.findElement(By.id("sb_form_q")).isEnabled();{
		            if(status==true){
		                System.out.println("The Searchbox is enabled");
		                driver.findElement(By.id("sb_form_q")).sendKeys("Hello");
		            }
		            else{
		                System.out.println("The Searchbox is disabled");
		            }
		            }*/
		         // verifying if Radiobutton is selected
		         
		        /* driver.findElement(By.id("id_sc")).click();
		             Thread.sleep(1500);
		         driver.findElement(By.id("hbsettings")).click();
		             Thread.sleep(1500);
		         driver.findElement(By.linkText("More")).click();
		         boolean status=driver.findElement(By.id("adlt_set_strict")).isSelected();
		             if(status==true){
		                 System.out.println("The radio-button is selected");
		             }
		             else{
		                driver.findElement(By.id("adlt_set_strict")).click();
		                System.out.println("radio button is mow selected");
		                 Thread.sleep(3000);
		         }
		        
		close();*/
		     }

