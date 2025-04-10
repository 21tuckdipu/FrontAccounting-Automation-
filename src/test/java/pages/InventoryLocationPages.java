package pages;

import java.time.Duration;
import resuseable.LoginComppnent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryLocationPages extends LoginComppnent {

	WebDriver driver;
	WebDriverWait wait;
	public InventoryLocationPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(45));
	}
	
	public void openPage() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

			System.out.println(" ");
		}
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[3]")).click();
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/a[1]")).click();
	}
	
	//repos
	By from_sk_location = By.id("FromStockLocation");
	By to_ck_location = By.name("ToStockLocation");
	By date = By.name("AdjDate");
	By ref = By.name("ref");
	
	By process_transfer = By.name("Process");
	
	By item_code = By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/form/center[2]/table/tbody/tr/td/div/center/table/tbody/tr[2]/td[1]/input[1]");
	By item_name = By.id("stock_id");
	By  quanity = By.name("qty");
	By memo = By.name("memo_");
	
	By add = By.id("AddItem");
	
	//method
	public void fromLocation(String values) {
		general(from_sk_location, values);
	}
	
	public void toLocation(String values) {
		general(to_ck_location, values);
	}
	public void date(String values) {
		generalText(date, values);
	}
	public void ref(String values) {
		generalText(ref, values);
	}
	
	public void itemCode(String values) {
		generalText(item_code, values);
	}
	public void itemName(String values) {
		general(item_name, values);
	}
	public void itemQuanity(String values) {
		generalText(quanity, values);
	}
	
	public void additem() {
		clickMe(add);
	}
	
	public void memoEnter(String values) {
		generalText(memo, values);
	}
	
	public void proccessTranr() {
		clickMe(process_transfer);
	}
}
