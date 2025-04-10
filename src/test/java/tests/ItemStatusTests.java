package tests;

import pages.ItemStatusPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItemStatusTests {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
		ItemStatusPages status = new ItemStatusPages(driver);
		status.Login();
		status.openPage();
		
		status.itemCode("201");
		status.delay();
		status.itemName("103");
		
	
	}

}
