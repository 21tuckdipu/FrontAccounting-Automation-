package pages;

import java.time.Duration;

import resuseable.component_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvoicePages extends component_one {

	WebDriver driver;
	WebDriverWait wait ;
	public InvoicePages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(75));
	}

	public void openPage() {
		WebElement invoicPage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a[6]")));
		invoicPage.click();
	}
	
	//repos
	By deliveryNum = By.name("DeliveryNumber");
	By itemCode = By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/form/center[2]/table/tbody/tr/td[2]/input");
	By itemName = By.id("SelectStockFromList");
	By customer = By.id("customer_id");
	By location = By.id("StockLocation");
	
	By fromDate = By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/form/center[1]/table/tbody/tr/td[4]/input");
	By toDate = By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/form/center[1]/table/tbody/tr/td[6]/input");
	
	By searchText = By.name("SearchOrders");
	
	
	
	
	
	
	
	
	
	public void delivery_number(String values) {
		generalText(deliveryNum, values);
	}
	public void item_code(String values) {
		generalText(itemCode, values);
	}
	public void byName(String values) {
		general(itemName, values);
	}
	public void cutomer_id(String values) {
		general(customer, values);
	}
	public void location(String values) {
		general(location, values);
	}
	
	
	public void from(String values) {
		generalText(fromDate, values);
	}
	public void to(String values) {
		generalText(toDate, values);
	}
	
	public void search() {
		clickMe(searchText);
	}
	
	
	
	
	
	
	
	
	
}
