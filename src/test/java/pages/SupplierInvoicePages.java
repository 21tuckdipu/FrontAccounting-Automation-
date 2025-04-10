package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuseable.LoginComppnent;

public class SupplierInvoicePages extends LoginComppnent{

	WebDriver driver;
	WebDriverWait wait;
	 public SupplierInvoicePages(WebDriver driver) {
		 super(driver);
		 this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(75));
	 }
	 
	 public void openPage() {
			driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
			Login();
			driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[2]")).click();
			
			WebElement page = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/a[2]")));
			page.click();
			}
	 
	 //repos
	 By supplier_id = By.id("supplier_id");
	 By reference = By.name("reference");
	 By supplier_ref = By.name("supp_reference");
	 By dimension = By.id("dimension");
	 By date = By.name("tran_date");
	 By due_date = By.name("due_date");
	 
	 By account = By.id("_gl_code_edit");
	 By name = By.id("gl_code");
	 By demsension_gl = By.id("dimension_id");
	 By amount = By.name("amount");
	 By memo = By.name("memo_");
	 
	 //add
	 By add = By.id("AddGLCodeToTrans");
	 By reset = By.id("ClearFields");
	 By  update = By.id("update");
	 
	 //last
	 By comment = By.name("Comments");
	 
	 By invoice = By.id("PostInvoice");
	
	 
	 
	 public void suppplier(String values) {
		 general(supplier_ref, values);
	 }
	 public void referenceCus(String values) {
		generalText(reference, values);
	}
	 public void supplierReference(String values) {
		generalText(supplier_ref, values);
	}
	 public void dimensionCus(String values) {
		general(dimension, values);
	}
	 //items
	 public void accountGL(String values) {
		generalText(account, values);
	}
	 public void nameGL(String values) {
			general(name, values);
		}
	 public void dimensionGL(String values) {
			general(demsension_gl, values);
		}
	 public void amountGL(String values) {
		generalText(amount, values);
	}
	 public void memoGL(String values) {
		generalText(memo, values);
	}
	 public void add() {
		clickMe(add);
	}
	 public void reset() {
		clickMe(reset);
	}
	 
	 public void memoML(String values) {
		generalText(comment, values);
	}
	 public void enterInvoice() {
		clickMe(invoice);
	}
	 
	}
