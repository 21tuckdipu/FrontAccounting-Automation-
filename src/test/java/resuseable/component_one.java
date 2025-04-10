package resuseable;

import java.time.Duration;
//import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class component_one {

	WebDriver driver;
	WebDriverWait wait;
	public component_one(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(75));
	}
	
	//setting up page
	public void name() {
		driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
	}
	
	public void userLogin() {
			driver.findElement(By.name("user_name_entry_field")).sendKeys("fauser15");
			driver.findElement(By.name("password")).sendKeys("fauser15");
			Select dropdown = new Select(driver.findElement(By.name("company_login_name")));
			dropdown.selectByContainsVisibleText("Automation_Thane");
			driver.findElement(By.name("SubmitUser")).click();
	}
	
	public void delay() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}
	public void quitBrower() {
		driver.close();
	}
	
	//Repos
	
	   // customer info
		By id = By.id("customer_id");  
		By branch = By.id("branch_id");
		By reference = By.name("ref");
		
		By payment = By.id("payment");
		By price_list = By.id("sales_type");
		
		By order_date = By.id("OrderDate");
		
		//item info
		By item_code = By.id("_stock_id_edit");
		By item_name = By.id("stock_id");
		By  quantity = By.name("qty");
		By  price_after_tax = By.name("price");
		By discount = By.name("Disc");
		By shipping_charges = By.name("freight_cost");
		By add_item = By.id("AddItem");
//		By update_item = By.id("update");

	
		//Customer Payments Mode
		By place_order = By.id("ProcessOrder");
		By cancel_order = By.id("CancelOrder");
		
		
		//By end of Month
		By customer_reference = By.name("cust_ref");
		By comments = By.name("Comments");
		By shipping_company = By.id("ship_via");
	
		public void general(By  elements , String values) {
				try {
					   WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elements));
					   Select ids = new Select(element);
					   ids.selectByValue(values);
					   Thread.sleep(2000);
				}
				catch (Exception e) {
					System.out.println("ERROR ");
				}
			}
			
		
		public void generalText(By  elements , String values) {
			try {
			           WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elements));
			           element.clear();
			           element.sendKeys(values);
			}
			catch (Exception e) {
				System.out.println("ERROR ");
			}
			}
		
		public void clickMe(By btn) {
			WebElement button = wait.until(ExpectedConditions.elementToBeClickable(btn));
			button.click();
		}

		//customer info
		public void customer_id(String customerID ) {
			general(id, customerID);
		}

		public void price_lists(String pricelist) {
			general(this.price_list, pricelist);
		}
		
		public void payment_mode(String paymentTime) {
			general(payment, paymentTime);
		}
	
//		public void Refer(String reference) {
//			generalText(this.reference, reference);
//		}
	
		
		//Item Entry
		public void itemcode(String itemcode) {
			generalText(item_code, itemcode);
		}
		public void itemName(String values) {
			generalText(item_name, values);
		}
	
		public void itemQuanty(String quant) {
			generalText(quantity, quant);
		}
		public void discountPrice(String discounts) {
			generalText(discount, discounts);
		}
		public void ShippingCharges() {
			generalText(shipping_charges, null);
		}
		public void addBtn() {
			clickMe(add_item);
		}
	
	
		
		//Customer Payment
		public void customerRefers(String refer) {
			generalText(customer_reference, refer);
		}
		
		public void Comment(String comments) {
			generalText(this.comments, comments);
		}
		
//		public void shippingComp(String values) {
//			general(shipping_company, values);
//		}
		
		
		
		
		
		
		
		
		
		//Place or Cancel orderButton
		public void placeOrder() {
			clickMe(place_order);
		}
		
		public void cancelOrder() {
			clickMe(cancel_order);
		}
	
	
}
