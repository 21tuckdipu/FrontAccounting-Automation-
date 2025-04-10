package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resuseable.LoginComppnent;

public class CustomerPaymentPages extends LoginComppnent {
	WebDriver driver;
	WebDriverWait wait;
	
	public CustomerPaymentPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(75));
	}

	public void openPage() {
		WebElement invoicPage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/a[4]")));
		invoicPage.click();
	}
	
	//repos
	By customer = By.id("customer_id");
	By bank_account = By.id("bank_account");
	By ref = By.name("ref");
	By date = By.name("DateBanked");
	
	By charge = By.name("charge");
	By discount = By.name("discount");
	By amount = By.name("amount");
	By  memo = By.name("memo_");
	
	By bankAmount = By.name("bank_amount");
	By addpayment = By.name("AddPaymentItem");
	
	
	public void customer_name(String values) {
		general(customer, values);
	}
	public void bankAccount(String values) {
		general(bank_account, values);
	}
	public void ref(String values) {
		generalText(ref, values);
	}

	public void date(String values) {
		generalText(date, values);
	}
	
	public void bankCharge(String values) {
		generalText(charge, values);
	}
	public void discount(String values) {
		generalText(discount, values);
	}
	public void Amount(String values) {
		generalText(amount, values);
	}
	public void enterMemo(String memo) {
		generalText(this.memo, memo);
	}
	public void paymentBank(String values) {
		generalText(bankAmount, values);
	}
	public void add() {
		clickMe(addpayment);
	}
	
}
