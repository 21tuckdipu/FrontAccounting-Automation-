package pages;

import java.time.Duration;

import resuseable.component_one;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeliverAgainstSaleOrderPages extends component_one {
	WebDriver driver;
	WebDriverWait wait ;
	public DeliverAgainstSaleOrderPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(75));
	}

	public void openDeliveryPage() {
		WebElement page = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a[5]")));
		page.click();
	}
	
	//rpos
	By orderReference = By.name("OrderReference");
	By stockLocation = By.id("StockLocation");
	By  itemcode = By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/form/center[1]/table/tbody/tr/td[8]/input");
	By  item_name = By.id("SelectStockFromList");
	By  searchText = By.id("SearchOrders");
	By customername = By.id("customer_id");
	
	
	public void order_ref(String values) {
		generalText(orderReference, values);
	}
	public void ref(String values) {
		generalText(orderReference, values);
	}
	public void location(String values) {
		general(stockLocation, values);
	}
	public void itemCode(String values) {
		generalText(itemcode, values);
	}
	public void itemname(String values) {
		general(item_name, values);
	}
	public void customer(String values) {
		general(customername, values);
	}
	
	public void search() {
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(searchText));
		btn.click();
	}
}
