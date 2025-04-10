package resuseable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginComppnent {
	WebDriver driver;
	WebDriverWait wait;
	public LoginComppnent(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(70));
	}

	public void Login() {
		
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("user_name_entry_field")));
		username.sendKeys("fauser15");
    	WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
    	password.sendKeys("fauser15");
     	WebElement branch = wait.until(ExpectedConditions.elementToBeClickable(By.name("company_login_name"))) ;
		
		Select dropdown = new Select(branch);
		dropdown.selectByContainsVisibleText("Automation_Thane");
		driver.findElement(By.name("SubmitUser")).click();
}
	
	public void decoration() {
		System.out.println("=======================================");
	}
	public void general(By  elements , String values) {
		    try {
			   WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elements));
			   Select ids = new Select(element);
			   ids.selectByValue(values);
			   Thread.sleep(2000);
		    }
		   catch (Exception e) {
			   System.out.println("ERROR "+e.toString());
			   decoration();
		       System.out.println("By : "+elements+" Elements :"+values);
		       decoration();
		   }
	}
	

   public void generalText(By  elements , String values) {
	      try {
	           WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elements));
	           element.clear();
	           element.sendKeys(values);
	         }
	    catch (Exception e) {
	    	   
		       System.out.println("ERROR "+e.toString());
		       decoration();
		       System.out.println("By : "+elements+" Elements :"+values);
		       decoration();
		       
	     }
	}

    public void clickMe(By btn) {
    	try {
	    WebElement button = wait.until(ExpectedConditions.elementToBeClickable(btn));
	    button.click();}
    	catch (Exception e) {
			System.out.println("CanNotFound");
			 decoration();
		     System.out.println("By : "+btn);
		     decoration();
		}
     }
}
