package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuseable.LoginComppnent;

public class PaymentSupplierPages extends LoginComppnent {
	WebDriver driver;
	WebDriverWait wait;
	
	public PaymentSupplierPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(75));
	}
	
	public void openPage() {
		driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
		Login();
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[2]")).click();
		
		WebElement page = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/a[1]")));
		page.click();
		}

	//repos
	By supplier = By.id("supplier_id"); //1
//	By accout = By.id("bank_account");
	By date = By.name("DatePaid");
	By ref = By.name("ref");
	By bank_amount = By.name("bank_amount");
	By charges = By.name("charge");
	By deminsion_id = By.id("dimension_id");
	By discount = By.name("discount");
	By payment = By.name("amount");
	By enter_payment = By.id("ProcessSuppPayment");
	By memo = By.name("memo_");
	
	public void paymentTo(String values) {
		general(supplier, values);
	}
	public void fromBankAcc(String values) {
		general(supplier, values);
	}
	public void refference(String values) {
		generalText(ref, values);
	}
	public void datePaid(String values) {
		generalText(date, values);
	}
	public void bankAmount(String values) {
		generalText(bank_amount, values);
	}
	public void bankCharges(String values) {
		generalText(charges, values);
	}
	public void dimesnion(String values) {
		generalText(deminsion_id, values);
	}
	public void amountOfDiscount(String values) {
		generalText(discount, values);
	}
	public void paymentAmount(String values) {
		generalText(payment, values);
	}
	public void enterPayment() {
		clickMe(enter_payment);
	}
	public void memo_en(String values) {
		generalText(memo, values);
	}
}
