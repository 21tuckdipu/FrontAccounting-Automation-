package tests;

import pages.InvoicePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvoiceTests {

	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
		

		InvoicePages invoice  = new InvoicePages(driver);
		invoice.userLogin();
		invoice.openPage();
		
		invoice.delivery_number("56");
		invoice.search();
		
		invoice.delivery_number("");
		invoice.location("DEF");
		invoice.search();
		
		invoice.item_code("101");
		invoice.search();
		
		invoice.byName("301");
		invoice.search();
		
		invoice.cutomer_id("2");
		invoice.search();
		
		//working with date from an d to
		invoice.from("02/03/2024");
		invoice.to("24/07/2025");
		invoice.search();
	}

}
