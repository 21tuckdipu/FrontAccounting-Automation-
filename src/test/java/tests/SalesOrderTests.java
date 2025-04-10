package tests;
import pages.SalesOrderPages;

//import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SalesOrderTests {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		
		
		
    	SalesOrderPages order = new SalesOrderPages(driver);
    	order.name();
    	order.login();
    	
    	order.sales_order();
    	
    	order.customer_id("2");
//        order.Refer("567890");
    	order.payment_mode("2");
    	order.price_lists("2");
    	
    	
    	order.itemcode("102");
    	order.itemQuanty("3");
    	order.discountPrice("20");
    	order.addBtn();
        
        order.Comment("Hello How are you");
        order.customerRefers("323456");
//        order.shippingComp("3");
        
        order.placeOrder();
        
        
        
        
        
//        driver.quit();

	}

}
