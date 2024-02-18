package homePageTestCases;

import org.testng.annotations.Test;

import NavigationPage.LoginPage;
import commonMethods.GlobalVariables;
import setupDriver.setupDriver;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class homePageTC01 {

	WebDriver driver = setupDriver.setupDriver();
	LoginPage loginPage = new LoginPage(driver);

	@BeforeTest
	public void beforeTest() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void homeValidation() {
		
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
