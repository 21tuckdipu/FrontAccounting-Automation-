package pages;

import resuseable.LoginComppnent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemMovementPages extends LoginComppnent {
	    WebDriver driver ;
	    WebDriverWait wait;
	    
	     public ItemMovementPages( WebDriver driver){
	    	 super(driver);
	    	this.driver = driver;
	    	this.wait = new WebDriverWait(driver, Duration.ofSeconds(75));
	    }
	    
	    public void delay() {
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    public void openPage() {
	    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[3]")).click();
			driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/a[1]")).click();
		}
	    //repos
	   
	    By item_code = By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/form/center[1]/table/tbody/tr/td[2]/input");
	    By item_name = By.id("stock_id");
	    By stock_location = By.id("StockLocation");
	    By from = By.name("AfterDate");
	    By to = By.name("BeforeDate");
	    By btn = By.id("ShowMoves");
	    
	    public void itemCode(String values) {
			generalText(item_code, values);
		}
	    public void itemName(String values) {
			general(item_name, values);
		}
	    public void fromDate(String values) {
			generalText(from, values);
		}
	    public void toDate(String values) {
			generalText(to, values);
		}
	    public void location(String values) {
			general(stock_location, values);
		}

	    public void showMovement() {
			clickMe(btn);
		}
}
