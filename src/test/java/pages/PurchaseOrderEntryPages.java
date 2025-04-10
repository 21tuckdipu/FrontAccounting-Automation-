package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resuseable.LoginComppnent;

public class PurchaseOrderEntryPages extends LoginComppnent {
	WebDriver driver;
	WebDriverWait wait;
	public PurchaseOrderEntryPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(75));
	}
	
	public void openPage() {
		driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
		Login();
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[2]")).click();
		
		WebElement page = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a[1]")));
		page.click();
		}

	//repos
	By supplier_id = By.id("supplier_id");
	By order_date = By.name("OrderDate");
	By exchange_rate = By.name("_ex_rate");
	By reference = By.name("ref");
	By supplier_ref = By.name("supp_ref");
	By dimension = By.id("dimension");
	By recevie  = By.id("StkLocation");
	
	By location_to = By.name("delivery_address");
	
	//order ITems
	By item_code = By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/form/div[1]/center/table/tbody/tr[2]/td[1]/input[1]");
	By item_name = By.id("stock_id");
	By quanity = By.name("qty");
	By delivery_date = By.name("req_del_date");
	By price_bef_tax = By.name("price");
	
	//add item
	By add_item = By.id("EnterLine");
	By memo = By.name("Comments");
	
	//btn
	By place_order = By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/form/div[2]/center/button[1]");
	
	public void supplier(String values) {
		general(supplier_id, values);
	}
	public void orderDate(String values) {
		general(order_date, values);
	}
	public void exchangeRate(String value) {
		generalText(exchange_rate, value);
	}
	public void referenceOne(String values) {
		generalText(reference, values);
	}
	public void supplierRefer(String values) {
		generalText(supplier_ref, values);
	}
	public void reviceInfo(String values) {
		general(recevie, values);
	}
	public void delivery_address(String values) {
		generalText(location_to, values);
	}
	
	//item
	public void itemCode(String values) {
	    generalText(item_code, values);
	}
	public void itemName(String values) {
		general(item_name, values);
	}
	public void quantity(String values) {
		generalText(quanity, values);
	}
	public void add() {
		clickMe(add_item);
	}
	
	//memp
	public void enterMemo(String values) {
		generalText(memo, values);
	}
	
	public void placeOrder() {
		clickMe(place_order);
	}
}
