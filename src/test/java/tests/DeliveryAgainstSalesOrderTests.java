package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import resuseable.component_one;
import pages.DeliverAgainstSaleOrderPages ;

public class DeliveryAgainstSalesOrderTests {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
		DeliverAgainstSaleOrderPages delivery = new DeliverAgainstSaleOrderPages(driver);
		
		
//		delivery.openDeliveryPage();
		delivery.userLogin();
		delivery.openDeliveryPage();	
		
		delivery.order_ref("1111");
		delivery.search();
		delivery.delay();
		
		delivery.order_ref("");
		delivery.location("DEF");
		delivery.search();
		
		delivery.itemCode("101");
//		delivery.itemName("301");
//		delivery.customer("2");
		delivery.search();
		
		
		delivery.itemname("301");
		delivery.search();
		
    	delivery.customer("2");
    	delivery.search();
    	
    	delivery.quitBrower();
		
		
		
		
		

	}

}
