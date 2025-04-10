package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPages {

	WebDriver driver;
	WebDriverWait wait;
	public LoginPages(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(45));
	}
	
	//setting up page
	public void name() {
		driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
	}
	
	
	//repos
	
	By username = By.name("user_name_entry_field");
	By  password = By.name("password");
	By companyBranch = By.name("company_login_name");
	By logout = By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[3]/a[5]");
	
		public void general(By  elements , String values) {
				WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elements));
				Select ids = new Select(element);
				ids.selectByValue(values);	
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


		//customer info
		public void ussrID(String values ) {
			generalText(username, values);
		}

		public void passwordUser(String values) {
			generalText(password, values);
		}
	
	    public void branch(String values) {
			general(companyBranch, values);
		}
	    
	    public void login() {
	    	WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("SubmitUser")));
	    	element.click();
	    }
	
	 public void logout() {
		 WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(logout));
	      element.click();
	}
	
	
	
	
	
	//methods
}
