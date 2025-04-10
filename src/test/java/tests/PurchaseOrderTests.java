package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.PurchaseOrderEntryPages;

public class PurchaseOrderTests {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		PurchaseOrderEntryPages order = new PurchaseOrderEntryPages(driver);
		order.openPage();
		order.supplier("2");
//		order.orderDate("21/02/2025");
		order.exchangeRate("2");
		order.referenceOne("435");
	
		order.delivery_address("dghjhjk");
		order.reviceInfo("DEF");
		order.supplierRefer("6565");
		
		//item
		order.itemCode("202");
		order.quantity("4");
		order.add();
		
		order.itemName("103");
		order.quantity("6");
		order.add();
		
		order.enterMemo("ddfg");
		order.placeOrder();

	}

}
