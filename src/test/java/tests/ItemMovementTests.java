package tests;

import pages.ItemMovementPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItemMovementTests {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://quastechproject.com/project/frontaccounting_automation/index.php");
		ItemMovementPages movement = new ItemMovementPages(driver);

		movement.Login();
		movement.openPage();
		
		movement.itemCode("201");
		movement.fromDate("21/02/2025");
		movement.toDate("21/04/2025");
		movement.location("DEF");
		movement.showMovement();
	}

}
