package Seleniumcode;
import java.util.List;

import org.openqa.selenium.WebElement;

public class PrintingDropdownValues extends ReusableScripts{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		openUrl("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
		
		List <WebElement>sponsorname=driver.findElements("c0");
		for (int i=0;i<sponsorname.size();i++) {
			String values=sponsorname.get(i).getText();
			System.out.println(values);
		}
		driver.close();
	}

}
