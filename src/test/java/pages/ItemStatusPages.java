package pages;

import java.time.Duration;
import resuseable.LoginComppnent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemStatusPages extends LoginComppnent {

	WebDriver driver;
	WebDriverWait wait;
	public ItemStatusPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(45));
	}
	
	public void openPage() {
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[3]")).click();
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/a[2]")).click();
		
	}
	
	public void delay() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.out.println("");
		}
	}
	//\repos
	By item_code = By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/form/center/input[1]");
	By item_name = By.id("stock_id");
	
	public void itemCode(String values) {
		generalText(item_code, values);
	}
	
	public void itemName(String values) {
		general(item_name, values);
	}
}
