package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CustomerPaymentPages;

public class CustomerpaymentTests {

	public static void main(String[] args) {
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
		
       CustomerPaymentPages payment = new CustomerPaymentPages(driver);
       payment.Login();
       
       payment.openPage();
       
       payment.customer_name("2");
       payment.bankAccount("2");
       
       payment.date("21/03/2025");
       payment.ref("345");
       
       payment.enterMemo("eewe");
       payment.bankCharge("4556");
       payment.discount("3");
       payment.Amount("25566");
       
       payment.paymentBank("343546");
       payment.add();
		

	}

}
