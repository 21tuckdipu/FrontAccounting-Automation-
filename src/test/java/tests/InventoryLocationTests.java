package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.InventoryLocationPages;

public class InventoryLocationTests {

	public static void main(String[] args) {
		
    WebDriver driver = new ChromeDriver();
    driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
    InventoryLocationPages transfer = new InventoryLocationPages(driver);

    transfer.Login();
    transfer.openPage();
    
    transfer.fromLocation("DEF");
    transfer.toLocation("DEF");
    
    transfer.date("02/03/2025");
//    transfer.ref("435");
    
    transfer.itemCode("222");
    transfer.itemQuanity("4");
    
    transfer.additem();
    
    transfer.itemName("102");
    transfer.itemQuanity("2");
    transfer.additem();
    
    transfer.memoEnter("sddgshfh");
    
    transfer.proccessTranr();
	}
	

}
