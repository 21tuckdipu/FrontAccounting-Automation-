package tests;


import pages.SaleEntryPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesEntryTests {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		SaleEntryPages entry = new SaleEntryPages(driver);
		driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
		
		entry.login();
		
		entry.openPage();
		
		entry.customer_id("2");
//		entry.Refer("23");
		
		entry.payment_mode("4");
		entry.price_lists("2");
		
		entry.itemcode("102");
		entry.itemQuanty("3");
		entry.discountPrice("20");
		entry.addBtn();
		
		entry.itemName("201");
		entry.delay();
		entry.itemQuanty("6");
		entry.discountPrice("20");
		entry.addBtn();
		
		 entry.Comment("Hello How are you");
//		 entry.customerRefers("323456");
//	        order.shippingComp("3");
	        
		 entry.placeOrder();
		

	}

}
