package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SupplierInvoicePages;

public class SupplierInvoiceTests {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		SupplierInvoicePages invoice = new SupplierInvoicePages(driver);
		
		invoice.openPage();
		invoice.suppplier("3");
//		invoice.referenceCus("34346");
		invoice.supplierReference("4357");
		invoice.dimensionCus("1");
		
		invoice.nameGL("1060");
		invoice.dimensionGL("1");
		invoice.amountGL("43566");
		invoice.memoGL("dfhgfh");
		invoice.add();
		
		invoice.accountGL("2110");
		invoice.dimensionGL("1");
		invoice.amountGL("43566");
		invoice.memoGL("dfhgfh");
		invoice.add();
		
		invoice.accountGL("2110");
		invoice.dimensionGL("1");
		invoice.amountGL("43566");
		invoice.memoGL("dfhgfh");
		invoice.reset();
		
		invoice.memoML("ddfh");
		invoice.enterInvoice();

	}

}
