package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPages;

public class LoginTests {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
		
		LoginPages log = new LoginPages(driver);
		log.ussrID("fauser15");
		log.passwordUser("fauser15");
		log.branch("1");
		log.login();
		log.logout();

	}

}
