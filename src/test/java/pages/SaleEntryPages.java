package pages;

import resuseable.component_one;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SaleEntryPages extends  component_one{

	WebDriver driver;
	WebDriverWait wait;
	public SaleEntryPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(45));
	}
	
	   //setting up page
		public void login() {
		
			driver.findElement(By.name("user_name_entry_field")).sendKeys("fauser15");
			driver.findElement(By.name("password")).sendKeys("fauser15");
			Select dropdown = new Select(driver.findElement(By.name("company_login_name")));
			dropdown.selectByContainsVisibleText("Automation_Thane");
			driver.findElement(By.name("SubmitUser")).click();
		}
	
//		public void close() {
//			driver.quit();
//		}
		
		public void openPage() {
			driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a[1]")).click();
		}
		

}
