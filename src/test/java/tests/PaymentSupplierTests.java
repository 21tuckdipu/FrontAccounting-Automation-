package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.PaymentSupplierPages;

public class PaymentSupplierTests {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		PaymentSupplierPages supplier = new PaymentSupplierPages(driver);
		supplier.openPage();
		
		supplier.paymentTo("2");
		supplier.fromBankAcc("2");
		supplier.datePaid("21/03/2025");
		supplier.refference("3455");
		supplier.bankAmount("45667");
		supplier.bankCharges("9");
		supplier.dimesnion("1");
		supplier.amountOfDiscount("1");
		supplier.paymentAmount("4999");
		supplier.memo_en("dggH");
		
		supplier.enterPayment();

	}

}
