package LoginTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import NavigationPage.LoginPage;
import commonMethods.GlobalVariables;
import setupDriver.setupDriver;

public class TC02 {
	
	WebDriver driver = setupDriver.setupDriver();
	
	LoginPage loginPage  = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		// TODO Auto-generated method stub

	}
	@Test
	public void TC01() {
		loginPage.login(GlobalVariables.LOCKED_USER, GlobalVariables.password);
		boolean error = loginPage.validateLockError();
		Assert.assertTrue(error);
	}
	@AfterTest
	public void closeDriver() {
			driver.quit();
	}

}
